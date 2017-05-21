<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- saved from url=(0043)signin.html -->
<html lang="en"
      class="bg-dark js no-touch no-android chrome no-firefox no-iemobile no-ie no-ie10 no-ie11 no-ios no-ios7 ipad">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>善支付 | Web Application</title>
    <meta name="description"
          content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="./signin_files/font.css" type="text/css">
    <link rel="stylesheet" href="./signin_files/app.v1.css" type="text/css">
    <!--[if lt IE 9]>
    <script src="js/ie/html5shiv.js"></script>
    <script src="js/ie/respond.min.js"></script>
    <script src="js/ie/excanvas.js"></script> <![endif]--></head>
<body class="" style="">
<section id="content" class="m-t-lg wrapper-md animated fadeInUp">
    <div class="container aside-xxl">
    	<a class="navbar-brand block" href="#">
	        <img src="./notebook_files/logo.png" class="m-r-sm">
	        <img src="./notebook_files/logo2.png" class="m-r-sm">
        </a>
        <section class="panel panel-default bg-white m-t-lg">
            <header class="panel-heading text-center"><strong>Sign in</strong></header>
            <form action="${pageContext.servletContext.contextPath }/login.do"  method="post" class="panel-body wrapper-lg" >
                <div class="form-group"><label class="control-label">账户</label>
                    <input type="text" placeholder="username" name="username" class="form-control input-lg" onfocus="clear_error();">
                </div>
                <div class="form-group"><label class="control-label">密码</label>
                    <input type="password" placeholder="password" name="password"  autocomplete="off" class="form-control input-lg" onfocus="clear_error();">
                </div>
                <div class="checkbox"><label> <input type="checkbox"> 记住我 </label></div>
                <a href="login.jsp#" class="pull-right m-t-xs">
                    <small>忘记密码?</small>
                </a>
                <button type="submit" class="btn btn-primary">登 录</button>
                <div class="line line-dashed"></div>

                <p class="text-muted text-center">
                    <small id="error" style="color: red;"></small>
                </p>

        </section>
    </div>
</section> <!-- footer -->
<footer id="footer">
    <div class="text-center padder">
        <p>
            <small>Web app framework base on 善支付<br>© 2016</small>
        </p>
    </div>
</footer> <!-- / footer --> <!-- Bootstrap --> <!-- App -->
<script src="./signin_files/app.v1.js"></script>
<script src="./signin_files/app.plugin.js"></script>
<script type="text/javascript">
    if ("${error}" != "") {
        $("#error").text("${error}");
    };

    function clear_error(){
        $("#error").text("");
    }

</script>
</body>
</html>