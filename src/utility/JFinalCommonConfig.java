package utility;

import com.guangz.controller.BootstrapController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class JFinalCommonConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	@Override
	public void configRoute(Routes me) {
		// 配置JFinal的路由
		
		me.add("/", BootstrapController.class);
	}
	
	@Override
	public void configHandler(Handlers me) {}

	@Override
	public void configInterceptor(Interceptors me) {}

	@Override
	public void configPlugin(Plugins me) {
		loadPropertyFile("mySqlJdbcConfig.properties");
		
		C3p0Plugin cp = new C3p0Plugin(getProperty("url"), getProperty("user"), 
				getProperty("password"));
		me.add(cp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
		arp.setShowSql(true);
		me.add(arp);
		
		// 建立表和实体的映射
		// arp.addMapping("tb_user","user_ID", User.class);
	}
}
