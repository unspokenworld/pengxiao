<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String woWelcomeMsg = (String)request.getAttribute ("woWelcomeMsg");
	Boolean woLogin = (Boolean)request.getAttribute ("woLogin");
	if (woLogin == null) {
		woLogin = false;
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<title>系统管理</title>
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css"/>
	<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/easyui/datagrid-detailview.js"></script>
	<script type="text/javascript" src="js/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/easyui/jquery.form.min.js"></script>
	<script type="text/javascript" src="js/app/wo.js"></script>
	<script type="text/javascript" src="js/app/main.js"></script>
	<script type="text/javascript" src="js/app/sys.js"></script>
	<script type="text/javascript">
		var woLogin = <%=woLogin%>;
	</script>
	<style type="text/css">
		#fm{
			margin:0;
			padding:10px 30px;
		}
		.ftitle{
			font-size:14px;
			font-weight:bold;
			padding:5px 0;
			margin-bottom:10px;
			border-bottom:1px solid #ccc;
		}
		.fitem{
			margin-bottom:5px;
		}
		.fitem label{
			display:inline-block;
			width:80px;
		}
		.fitem input{
			width:160px;
		}
	</style>
</head>
<!-- 请参考：http://www.jeasyui.com/documentation/index.php -->
<!-- layout -->
<body class="easyui-layout">
	<!-- panel -->
	<div id="woMenuTreePanel" data-options="region:'west',split:true, title:'菜单'" style="width:200px;padding:10px;" class="easyui-panel">
		<!-- tree -->
		<ul id="woMenuTreeUl">
		</ul>
	</div>
	<!-- tabs -->
	<div id="woContentTabPanel" data-options="region:'center',title:'<%=woWelcomeMsg%>'" class="easyui-tabs" style="width:700px;height:250px">
		<div title="主页" style="padding:10px">
			<p style="font-size:14px">jQuery EasyUI framework helps you build your web pages easily.</p>
			<ul>
				<li>easyui is a collection of user-interface plugin based on jQuery.</li>
				<li>easyui provides essential functionality for building modem, interactive, javascript applications.</li>
				<li>using easyui you don't need to write many javascript code, you usually defines user-interface by writing some HTML markup.</li>
				<li>complete framework for HTML5 web page.</li>
				<li>easyui save your time and scales while developing your products.</li>
				<li>easyui is very easy but powerful.</li>
			</ul>
		</div>
	</div>
	<div id="woDlgLogin" class="easyui-dialog" style="width:400px;height:200px;padding:10px 20px"
			closed="true" buttons="#woButtonsLogin" modal="true" title="登录">
		<div class="ftitle">请输入登录信息：</div>
		<form id="woFormLogin" method="post" novalidate>
			<div class="fitem">
				<label>登录名:</label>
				<input name="user" class="easyui-textbox" required="true">
			</div>
			<div class="fitem">
				<label>密码:</label>
				<input name="password" type="password" class="easyui-textbox" required="true">
			</div>
		</form>
	</div>
	<div id="woButtonsLogin">
		<a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" style="width:90px">登录</a>
	</div>
</body>
</html>