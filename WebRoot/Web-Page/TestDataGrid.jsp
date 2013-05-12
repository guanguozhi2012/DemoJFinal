<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/jFinal_demo/jquery-easyui-1.3.3/themes/metro-blue/easyui.css">
<link rel="stylesheet" type="text/css" href="/jFinal_demo/jquery-easyui-1.3.3/themes/icon.css">

<script type="text/javascript" src="/jFinal_demo/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="/jFinal_demo/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/jFinal_demo/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
	<table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
			data-options="singleSelect:true,collapsible:true,url:'/jFinal_demo/simpleDtGridJson',rowStyler:colorRowStyler,showFooter:true,rownumbers:true">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:80,align:'left',halign:'center',sortable:true">项目ID</th>
				<th data-options="field:'productid',width:100,align:'left',halign:'center'">产品名称</th>
				<th data-options="field:'listprice',width:80,align:'right',halign:'center',styler:cellStyler">价格</th>
				<th data-options="field:'unitcost',width:80,align:'right',halign:'center'">计量单位</th>
				<th data-options="field:'attr1',width:250,align:'left',halign:'center'">属性</th>
				<th data-options="field:'status',width:60,align:'center',halign:'center'">状态</th>
			</tr>
		</thead>
	</table>
	<script type="text/javascript">
		function cellStyler(value,row,index){
			if (value < 30){
				return 'background-color:#ffee00;color:red;';
			}
		}
		
		function colorRowStyler(index,row){
			if((index + 1) % 2 == 0){
				return 'background-color:blue';
			}
		}
	</script>
</body>
</html>