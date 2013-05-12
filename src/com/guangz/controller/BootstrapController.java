package com.guangz.controller;

import com.jfinal.core.Controller;

public class BootstrapController extends Controller {
	
	public void index() {
		renderJsp("index.jsp");
	}
	
	public void textDataGrid() {
		renderJsp("Web-Page/TestDataGrid.jsp");
	}
	
	public void simpleDtGridJson() {
		
		StringBuilder jsonBuilder = new StringBuilder();
		jsonBuilder.append("{\"total\":28,\"rows\":[");
		jsonBuilder.append("{\"productid\":\"FI-SW-01\",\"productname\":\"Koi\",\"unitcost\":10.00,\"status\":\"P\",\"listprice\":36.50,\"attr1\":\"Large\",\"itemid\":\"EST-1\"},");
		jsonBuilder.append("{\"productid\":\"K9-DL-01\",\"productname\":\"Dalmation\",\"unitcost\":12.00,\"status\":\"P\",\"listprice\":18.50,\"attr1\":\"Spotted Adult Female\",\"itemid\":\"EST-10\"},");
		jsonBuilder.append("{\"productid\":\"RP-SN-01\",\"productname\":\"Rattlesnake\",\"unitcost\":12.00,\"status\":\"P\",\"listprice\":38.50,\"attr1\":\"Venomless\",\"itemid\":\"EST-11\"},");
		jsonBuilder.append("{\"productid\":\"RP-SN-01\",\"productname\":\"Rattlesnake\",\"unitcost\":12.00,\"status\":\"P\",\"listprice\":26.50,\"attr1\":\"Rattleless\",\"itemid\":\"EST-12\"}");
		jsonBuilder.append("]}");
		
		renderJson(jsonBuilder.toString());
	}
}
