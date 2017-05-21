	<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<!-- saved from url=(0042)index.html -->
<html lang="en" class="app js no-touch no-android chrome no-firefox no-iemobile no-ie no-ie10 no-ie11 no-ios no-ios7 ipad">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>善支付 | Web Application</title>
<meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<link rel="stylesheet" href="./notebook_files/font.css" type="text/css">
<link rel="stylesheet" href="./notebook_files/bootstrap_calendar.css" type="text/css">
<link rel="stylesheet" href="./notebook_files/app.v1.css" type="text/css">
<link rel="stylesheet" href="./notebook_files/bootstrapValidator.min.css" type="text/css">
<link rel="stylesheet" href="./notebook_files/select2.min.css" type="text/css">
<link rel="stylesheet" href="./css/index/index.css" type="text/css">

	<!--[if lt IE 9]>
	<script src="js/ie/html5shiv.js"></script>
	<script src="js/ie/respond.min.js"></script>
	<script src="js/ie/excanvas.js"></script>
	<![endif]-->
	<script src="./notebook_files/jquery.min.js"></script>
	<script src="./notebook_files/app.v1.js"></script>
	<script src="./notebook_files/jquery.easy-pie-chart.js"></script>
	<script src="./notebook_files/jquery.sparkline.min.js"></script>
	<script src="./notebook_files/jquery.flot.min.js"></script>
	<script src="./notebook_files/jquery.flot.tooltip.min.js"></script>
	<script src="./notebook_files/jquery.flot.resize.js"></script>
	<script src="./notebook_files/jquery.flot.grow.js"></script>
	<script src="./notebook_files/bootstrap_calendar.js"></script>
	<script src="./notebook_files/jquery.sortable.js"></script>
	<script src="./notebook_files/app.plugin.js"></script>
	<script src="./notebook_files/jquery-jtemplates.js"></script>
	<script src="./notebook_files/jquery.twbsPagination.min.js"></script>
	<script src="./notebook_files/bootstrapValidator.min.js"></script>
	<script src="./notebook_files/select2.min.js"></script>
	<script src="./js/index/index.js"></script>


	<script type="text/javascript">
		$(function() {

			var tb = $("#loadhtml");

			var html = '<li><i class="fa fa-home"></i>';
			html+='<a href="index.do">Home</a></li>';
			$("#topli").html(html);
			tb.load("${ctx}/home.do");
			$("[nav-n]").each(function () {
				$(this).bind("click",function(){
					var nav = $(this).attr("nav-n");
					tolaod(nav);
				});
			});
		});

		/***
		 //需要三个参数, 目录,菜单,菜单连接
		 例:
		 nav="系统管理,用户列表,/user/list.do";
		 **/
		function tolaod(nav){
			var sn = nav.split(",");
			var html = '<li><i class="fa fa-home"></i>';
			html+='<a href="index.do">Home</a></li>';
			for(var i=0;i<2;i++){
				html+='<li><a href="javascript:void(0)">'+sn[i]+'</a></li>';
			}
			$("#topli").html(html);
			var tb = $("#loadhtml");

			tb.load("${ctx}/"+ sn[2]);
		}
	</script>
</head>
<body class="" style="">
	<section class="vbox">
		<header class="bg-dark dk header navbar navbar-fixed-top-xs">
			<div class="navbar-header aside-md">
				<a class="btn btn-link visible-xs"
					data-toggle="class:nav-off-screen,open" data-target="#nav,html">
					<i class="fa fa-bars"></i>
				</a> <!-- <a href="index.jsp#" class="navbar-brand" data-toggle="fullscreen"> --><img
					src="./notebook_files/logo.png" class="m-r-sm"><img
					src="./notebook_files/logo2.png" class="m-r-sm"><!-- </a> --> <a
					class="btn btn-link visible-xs" data-toggle="dropdown"
					data-target=".nav-user"> <i class="fa fa-cog"></i>
				</a>
			</div>
			<ul class="nav navbar-nav hidden-xs">
				<li class="dropdown"><!-- <a href="index.jsp#"
					class="dropdown-toggle dker" data-toggle="dropdown"> <i
						class="fa fa-building-o"></i> <span class="font-bold">Activity</span>
				</a> -->
					<section
						class="dropdown-menu aside-xl on animated fadeInLeft no-borders lt">
						<div class="wrapper lter m-t-n-xs">
							<a href="index.jsp#" class="thumb pull-left m-r"> <img
								src="./notebook_files/avatar.jpg" class="img-circle">
							</a>
							<div class="clear">
								<a href="index.jsp#"><span class="text-white font-bold">@Mike
										Mcalidek</span></a> <small class="block">Art Director</small> <a
									href="index.jsp#" class="btn btn-xs btn-success m-t-xs">Upgrade</a>
							</div>
						</div>
						<div class="row m-l-none m-r-none m-b-n-xs text-center">
							<div class="col-xs-4">
								<div class="padder-v">
									<span class="m-b-xs h4 block text-white">245</span> <small
										class="text-muted">Followers</small>
								</div>
							</div>
							<div class="col-xs-4 dk">
								<div class="padder-v">
									<span class="m-b-xs h4 block text-white">55</span> <small
										class="text-muted">Likes</small>
								</div>
							</div>
							<div class="col-xs-4">
								<div class="padder-v">
									<span class="m-b-xs h4 block text-white">2,035</span> <small
										class="text-muted">Photos</small>
								</div>
							</div>
						</div>
					</section></li>
				<li>
					<!-- <div class="m-t m-l">
						<a href="price.html"
							class="dropdown-toggle btn btn-xs btn-primary" title="Upgrade"><i
							class="fa fa-long-arrow-up"></i></a>
					</div> -->
				</li>
			</ul>
			<ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
				<li class="hidden-xs"><!-- <a href="index.jsp#"
					class="dropdown-toggle dk" data-toggle="dropdown"> <i
						class="fa fa-bell"></i> <span
						class="badge badge-sm up bg-danger m-l-n-sm count"
						style="display: inline-block;">3</span>
				</a> -->
					<section class="dropdown-menu aside-xl">
						<section class="panel bg-white">
							<header class="panel-heading b-light bg-light">
								<strong>You have <span class="count"
									style="display: inline;">3</span> notifications
								</strong>
							</header>
							<div class="list-group list-group-alt animated fadeInRight">
								<a href="index.jsp#" class="media list-group-item"
									style="display: block;"><span
									class="pull-left thumb-sm text-center"><i
										class="fa fa-envelope-o fa-2x text-success"></i></span><span
									class="media-body block m-b-none">Sophi sent you a email<br>
									<small class="text-muted">1 minutes ago</small></span></a> <a
									href="index.jsp#" class="media list-group-item"> <span
									class="pull-left thumb-sm"> <img
										src="./notebook_files/avatar.jpg" alt="John said"
										class="img-circle">
								</span> <span class="media-body block m-b-none"> Use awesome
										animate.css<br> <small class="text-muted">10
											minutes ago</small>
								</span>
								</a> <a href="index.jsp#" class="media list-group-item"> <span
									class="media-body block m-b-none"> 1.0 initial released<br>
										<small class="text-muted">1 hour ago</small>
								</span>
								</a>
							</div>
							<footer class="panel-footer text-sm">
								<a href="index.jsp#" class="pull-right"><i
									class="fa fa-cog"></i></a> <a href="index.jsp#notes"
									data-toggle="class:show animated fadeInRight">See all the
									notifications</a>
							</footer>
						</section>
					</section></li>
				<li class="dropdown hidden-xs"><!-- <a href="index.jsp#"
					class="dropdown-toggle dker" data-toggle="dropdown"><i
						class="fa fa-fw fa-search"></i></a> -->
					<section class="dropdown-menu aside-xl animated fadeInUp">
						<section class="panel bg-white">
							<form role="search">
								<div class="form-group wrapper m-b-none">
									<div class="input-group">
										<input type="text" class="form-control" placeholder="Search">
										<span class="input-group-btn">
											<button  type="submit" class="btn btn-info btn-icon">
												<i class="fa fa-search"></i>
											</button>
										</span>
									</div>
								</div>
							</form>
						</section>
					</section></li>
				<li class="dropdown"><a href="index.jsp#"
					class="dropdown-toggle" data-toggle="dropdown"> <span
						class="thumb-sm avatar pull-left"> <img
							src="./notebook_files/avatar.jpg">
					</span> ${user.userName}<!--  <b class="caret"></b> -->
				</a>
					<ul class="dropdown-menu animated fadeInRight">
						<span class="arrow top"></span>
						<!-- <li><a href="index.jsp#">Settings</a></li>
						<li><a href="profile.html">Profile</a></li>
						<li><a href="index.jsp#"> <span
								class="badge bg-danger pull-right">3</span> Notifications
						</a></li>
						<li><a href="docs.html">Help</a></li> -->
						<li class="divider"></li>
						<li><a href="logout.do" data-toggle="ajaxModal">退出登录</a>
						</li>
					</ul></li>
			</ul>
		</header>
		<section>
			<section class="hbox stretch">
				<!-- .aside -->
				<aside class="bg-dark lter aside-md hidden-print hidden-xs" id="nav">
					<section class="vbox">
						<!-- <header class="header bg-primary lter text-center clearfix">
							<div class="btn-group">
								<button type="button" class="btn btn-sm btn-dark btn-icon"
									title="New project">
									<i class="fa fa-plus"></i>
								</button>
								<div class="btn-group hidden-nav-xs">
									<button type="button"
										class="btn btn-sm btn-primary dropdown-toggle"
										data-toggle="dropdown">
										Switch Project <span class="caret"></span>
									</button>
									<ul class="dropdown-menu text-left">
										<li><a href="index.jsp#">Project</a></li>
										<li><a href="index.jsp#">Another Project</a></li>
										<li><a href="index.jsp#">More Projects</a></li>
									</ul>
								</div>
							</div>
						</header> -->
						<section class="w-f scrollable">
							<div class="slim-scroll" data-height="auto"
								data-disable-fade-out="true" data-distance="0" data-size="5px"
								data-color="#333333">
									<!-- nav -->
								<nav class="nav-primary hidden-xs">
									<ul class="nav">
										<c:forEach var = "key" items="${ress}" varStatus="s">
											<li <c:if test="${s.index==0}">class="active"</c:if>>
												<a href="javascript:void(0)" <c:if test="${s.index==0}">class="active"</c:if>>
													<c:if test="${s.index==0}">
													    <i class="fa fa-dashboard icon"> <b class="bg-danger"></b></i>
													</c:if>
	                                                <c:if test="${s.index==1}">
														<i class="fa fa-pencil-square icon"> <b class="bg-warning"></b></i>
                                                    </c:if>
                                                    <c:if test="${s.index==2}">
														<i class="fa fa-columns icon"> <b class="bg-primary"></b></i>
                                                    </c:if>
                                                    <c:if test="${s.index==3}">
														<i class="fa fa-book icon"> <b class="bg-info"></b></i>
														</c:if>
                                                    <c:if test="${s.index==4}">
														<i class="fa fa-th-list icon"> <b class="bg-success"></b></i>
                                                    </c:if>
													<c:if test="${s.index==5}">
														<i class="fa fa-flask icon"> <b class="bg-success"></b></i>
													</c:if>
													<c:if test="${s.index==6}">
														<i class="fa fa-envelope-o icon"> <b class="bg-success"></b></i>
													</c:if>
                                                    <span class="pull-right">
														<i class="fa fa-angle-down text"></i>
														<i class="fa fa-angle-up text-active"></i>
                                                    </span>
                                                    <span>${key.resName}</span>
												</a>
												<ul class="nav lt">
													<c:forEach var="kc" items="${key.children}">
														<li class="active">
															<a href="javascript:void(0)" class="active" nav-n="${key.resName},${kc.resName},${kc.resUrl}?id=${kc.id}">
																<i class="fa fa-angle-right"></i> <span>${kc.resName}</span>
															</a>
														</li>
													</c:forEach>
												</ul>
											</li>

										</c:forEach>


									</ul>
								</nav>
									<!-- / nav -->
								</div>
						</section>
						<footer class="footer lt hidden-xs b-t b-dark">
							<div id="chat" class="dropup">
								<section class="dropdown-menu on aside-md m-l-n">
									<section class="panel bg-white">
										<header class="panel-heading b-b b-light">Active
											chats</header>
										<div class="panel-body animated fadeInRight">
											<p class="text-sm">No active chats.</p>
											<p>
												<a href="#" class="btn btn-sm btn-default">Start
													a chat</a>
											</p>
										</div>
									</section>
								</section>
							</div>
							<div id="invite" class="dropup">
								<section class="dropdown-menu on aside-md m-l-n">
									<section class="panel bg-white">
										<header class="panel-heading b-b b-light">
											John <i class="fa fa-circle text-success"></i>
										</header>
										<div class="panel-body animated fadeInRight">
											<p class="text-sm">No contacts in your lists.</p>
											<p>
												<a href="#" class="btn btn-sm btn-facebook"><i
													class="fa fa-fw fa-facebook"></i> Invite from Facebook</a>
											</p>
										</div>
									</section>
								</section>
							</div>
							<a href="#nav" data-toggle="class:nav-xs"
								class="pull-right btn btn-sm btn-dark btn-icon"> <i
								class="fa fa-angle-left text"></i> <i
								class="fa fa-angle-right text-active"></i>
							</a>
							<!-- <div class="btn-group hidden-nav-xs">
								<button type="button" title="Chats"
									class="btn btn-icon btn-sm btn-dark" data-toggle="dropdown"
									data-target="#chat">
									<i class="fa fa-comment-o"></i>
								</button>
								<button type="button" title="Contacts"
									class="btn btn-icon btn-sm btn-dark" data-toggle="dropdown"
									data-target="#invite">
									<i class="fa fa-facebook"></i>
								</button>
							</div> -->
						</footer>
					</section>
				</aside>
				<!-- /.aside -->
				<section id="content">
					<section class="vbox">
						<section class="scrollable padder">
							<ul class="breadcrumb no-border no-radius b-b b-light pull-in" id="topli">
								<!--
								<li><a href="index.jsp"><i
										class="fa fa-home"></i> Home</a></li>
								<li class="active">Workset</li>
								 -->
							</ul>
							<div id="loadhtml">
							</div>
						</section>
					</section>
					<a href="index.jsp#" class="hide nav-off-screen-block"
						data-toggle="class:nav-off-screen, open" data-target="#nav,html"></a>
				</section>
				<aside class="bg-light lter b-l aside-md hide" id="notes">
					<div class="wrapper">Notification</div>
				</aside>
			</section>
		</section>
	</section>
	<!-- Bootstrap -->
	<!-- App -->

	<div id="flotTip" style="display: none; position: absolute;"></div>
</body>
</html>