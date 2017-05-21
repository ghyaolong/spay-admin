<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- saved from url=(0042)index.html -->
<html lang="en"
	class="app js no-touch no-android chrome no-firefox no-iemobile no-ie no-ie10 no-ie11 no-ios no-ios7 ipad">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Notebook | Web Application</title>
<meta name="description"
	content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="./notebook_files/font.css" type="text/css">
<link rel="stylesheet" href="./notebook_files/bootstrap_calendar.css"
	type="text/css">
<link rel="stylesheet" href="./notebook_files/app.v1.css"
	type="text/css">
<!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>
<body class="" style="">
	<section class="vbox">
		<header class="bg-dark dk header navbar navbar-fixed-top-xs">
			<div class="navbar-header aside-md">
				<a class="btn btn-link visible-xs"
					data-toggle="class:nav-off-screen,open" data-target="#nav,html">
					<i class="fa fa-bars"></i>
				</a> <a href="index.jsp#" class="navbar-brand" data-toggle="fullscreen"><img
					src="./notebook_files/logo.png" class="m-r-sm">Notebook</a> <a
					class="btn btn-link visible-xs" data-toggle="dropdown"
					data-target=".nav-user"> <i class="fa fa-cog"></i>
				</a>
			</div>
			<ul class="nav navbar-nav hidden-xs">
				<li class="dropdown"><a href="index.jsp#"
					class="dropdown-toggle dker" data-toggle="dropdown"> <i
						class="fa fa-building-o"></i> <span class="font-bold">Activity</span>
				</a>
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
					<div class="m-t m-l">
						<a href="price.html"
							class="dropdown-toggle btn btn-xs btn-primary" title="Upgrade"><i
							class="fa fa-long-arrow-up"></i></a>
					</div>
				</li>
			</ul>
			<ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
				<li class="hidden-xs"><a href="index.jsp#"
					class="dropdown-toggle dk" data-toggle="dropdown"> <i
						class="fa fa-bell"></i> <span
						class="badge badge-sm up bg-danger m-l-n-sm count"
						style="display: inline-block;">3</span>
				</a>
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
				<li class="dropdown hidden-xs"><a href="index.jsp#"
					class="dropdown-toggle dker" data-toggle="dropdown"><i
						class="fa fa-fw fa-search"></i></a>
					<section class="dropdown-menu aside-xl animated fadeInUp">
						<section class="panel bg-white">
							<form role="search">
								<div class="form-group wrapper m-b-none">
									<div class="input-group">
										<input type="text" class="form-control" placeholder="Search">
										<span class="input-group-btn">
											<button type="submit" class="btn btn-info btn-icon">
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
					</span> John.Smith <b class="caret"></b>
				</a>
					<ul class="dropdown-menu animated fadeInRight">
						<span class="arrow top"></span>
						<li><a href="index.jsp#">Settings</a></li>
						<li><a href="profile.html">Profile</a></li>
						<li><a href="index.jsp#"> <span
								class="badge bg-danger pull-right">3</span> Notifications
						</a></li>
						<li><a href="docs.html">Help</a></li>
						<li class="divider"></li>
						<li><a href="logout.do" data-toggle="ajaxModal">Logout</a>
						</li>
					</ul></li>
			</ul>
		</header>
		<section>
			<section class="hbox stretch">
				<!-- .aside -->
				<aside class="bg-dark lter aside-md hidden-print hidden-xs" id="nav">
					<section class="vbox">
						<header class="header bg-primary lter text-center clearfix">
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
						</header>
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
                                                    <span class="pull-right">
														<i class="fa fa-angle-down text"></i>
														<i class="fa fa-angle-up text-active"></i>
                                                    </span>
                                                    <span>${key.resName}</span>
												</a>
												<ul class="nav lt">
													<c:forEach var="kc" items="${key.children}">
														<li class="active">
															<a href="${kc.resUrl}" class="active" nav-n="${key.resName},${kc.resName},${kc.resUrl}?id=${kc.id}">
																<i class="fa fa-angle-right"></i> <span>${kc.resName}</span>
															</a>
														</li>
													</c:forEach>
												</ul>
											</li>

										</c:forEach>

										<li class="active"><a href="index.jsp" class="active">
												<i class="fa fa-dashboard icon"> <b class="bg-danger"></b>
											</i> <span class="pull-right"> <i
													class="fa fa-angle-down text"></i> <i
													class="fa fa-angle-up text-active"></i>
											</span> <span>Workset</span>
										</a>
											<ul class="nav lt">
												<li class="active"><a href="index.jsp" class="active">
														<i class="fa fa-angle-right"></i> <span>Dashboard
															v1</span>
												</a></li>
												<li><a href="dashboard.html"> <i
														class="fa fa-angle-right"></i> <span>Dashboard v2</span>
												</a></li>
											</ul></li>
										<li><a href="#layout"> <i
												class="fa fa-columns icon"> <b class="bg-warning"></b>
											</i> <span class="pull-right"> <i
													class="fa fa-angle-down text"></i> <i
													class="fa fa-angle-up text-active"></i>
											</span> <span>系統管理</span>
										</a>
											<ul class="nav lt">
												<li><a href="layout-c.html"> <i
														class="fa fa-angle-right"></i> <span>用戶管理</span>
												</a></li>
												<li><a href="layout-r.html"> <i
														class="fa fa-angle-right"></i> <span>角色管理</span>
												</a></li>
												<li><a href="layout-h.html"> <i
														class="fa fa-angle-right"></i> <span>菜單管理</span>
												</a></li>

											</ul></li>
										<li><a href="#uikit"> <i class="fa fa-flask icon">
													<b class="bg-success"></b>
											</i> <span class="pull-right"> <i
													class="fa fa-angle-down text"></i> <i
													class="fa fa-angle-up text-active"></i>
											</span> <span>UI kit</span>
										</a>
											<ul class="nav lt">
												<li><a href="buttons.html"> <i
														class="fa fa-angle-right"></i> <span>Buttons</span>
												</a></li>
												<li><a href="icons.html"> <b
														class="badge bg-info pull-right">369</b> <i
														class="fa fa-angle-right"></i> <span>Icons</span>
												</a></li>
												<li><a href="grid.html"> <i
														class="fa fa-angle-right"></i> <span>Grid</span>
												</a></li>
												<li><a href="widgets.html"> <b
														class="badge pull-right">8</b> <i
														class="fa fa-angle-right"></i> <span>Widgets</span>
												</a></li>
												<li><a href="components.html"> <i
														class="fa fa-angle-right"></i> <span>Components</span>
												</a></li>
												<li><a href="list.html"> <i
														class="fa fa-angle-right"></i> <span>List group</span>
												</a></li>
												<li><a href="#table"> <i
														class="fa fa-angle-down text"></i> <i
														class="fa fa-angle-up text-active"></i> <span>Table</span>
												</a>
													<ul class="nav bg">
														<li><a href="table-static.html"> <i
																class="fa fa-angle-right"></i> <span>Table static</span>
														</a></li>
														<li><a href="table-datatable.html"> <i
																class="fa fa-angle-right"></i> <span>Datatable</span>
														</a></li>
														<li><a href="table-datagrid.html"> <i
																class="fa fa-angle-right"></i> <span>Datagrid</span>
														</a></li>
													</ul></li>
												<li><a href="#form"> <i
														class="fa fa-angle-down text"></i> <i
														class="fa fa-angle-up text-active"></i> <span>Form</span>
												</a>
													<ul class="nav bg">
														<li><a href="form-elements.html"> <i
																class="fa fa-angle-right"></i> <span>Form
																	elements</span>
														</a></li>
														<li><a href="form-validation.html"> <i
																class="fa fa-angle-right"></i> <span>Form
																	validation</span>
														</a></li>
														<li><a href="form-wizard.html"> <i
																class="fa fa-angle-right"></i> <span>Form wizard</span>
														</a></li>
													</ul></li>
												<li><a href="chart.html"> <i
														class="fa fa-angle-right"></i> <span>Chart</span>
												</a></li>
												<li><a href="fullcalendar.html"> <i
														class="fa fa-angle-right"></i> <span>Fullcalendar</span>
												</a></li>
												<li><a href="portlet.html"> <i
														class="fa fa-angle-right"></i> <span>Portlet</span>
												</a></li>
												<li><a href="timeline.html"> <i
														class="fa fa-angle-right"></i> <span>Timeline</span>
												</a></li>
											</ul></li>
										<li><a href="#pages"> <i
												class="fa fa-file-text icon"> <b class="bg-primary"></b>
											</i> <span class="pull-right"> <i
													class="fa fa-angle-down text"></i> <i
													class="fa fa-angle-up text-active"></i>
											</span> <span>Pages</span>
										</a>
											<ul class="nav lt">
												<li><a href="gallery.html"> <i
														class="fa fa-angle-right"></i> <span>Gallery</span>
												</a></li>
												<li><a href="profile.html"> <i
														class="fa fa-angle-right"></i> <span>Profile</span>
												</a></li>
												<li><a href="invoice.html"> <i
														class="fa fa-angle-right"></i> <span>Invoice</span>
												</a></li>
												<li><a href="intro.html"> <i
														class="fa fa-angle-right"></i> <span>Intro</span>
												</a></li>
												<li><a href="master.html"> <i
														class="fa fa-angle-right"></i> <span>Master</span>
												</a></li>
												<li><a href="gmap.html"> <i
														class="fa fa-angle-right"></i> <span>Google Map</span>
												</a></li>
												<li><a href="jvectormap.html"> <i
														class="fa fa-angle-right"></i> <span>Vector Map</span>
												</a></li>
												<li><a href="login.jsp"> <i
														class="fa fa-angle-right"></i> <span>Signin</span>
												</a></li>
												<li><a href="signup.html"> <i
														class="fa fa-angle-right"></i> <span>Signup</span>
												</a></li>
												<li><a href="404.html"> <i
														class="fa fa-angle-right"></i> <span>404</span>
												</a></li>
											</ul></li>
										<li><a href="mail.html"> <b
												class="badge bg-danger pull-right">3</b> <i
												class="fa fa-envelope-o icon"> <b
													class="bg-primary dker"></b>
											</i> <span>Message</span>
										</a></li>
										<li><a href="notebook.html"> <i
												class="fa fa-pencil icon"> <b class="bg-info"></b>
											</i> <span>Notes</span>
										</a></li>
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
							<div class="btn-group hidden-nav-xs">
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
							</div>
						</footer>
					</section>
				</aside>
				<!-- /.aside -->
				<section id="content">
					<section class="vbox">
						<section class="scrollable padder">
							<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
								<li><a href="index.jsp"><i
										class="fa fa-home"></i> Home</a></li>
								<li class="active">Workset</li>
							</ul>
							<div class="m-b-md">
								<h3 class="m-b-none">Workset</h3>
								<small>Welcome back, Noteman</small>
							</div>
							<section class="panel panel-default">
								<div class="row m-l-none m-r-none bg-light lter">
									<div class="col-sm-6 col-md-3 padder-v b-r b-light">
										<span class="fa-stack fa-2x pull-left m-r-sm"> <i
											class="fa fa-circle fa-stack-2x text-info"></i> <i
											class="fa fa-male fa-stack-1x text-white"></i>
										</span> <a class="clear" href="#"> <span
											class="h3 block m-t-xs"><strong>52,000</strong></span> <small
											class="text-muted text-uc">New robots</small>
										</a>
									</div>
									<div class="col-sm-6 col-md-3 padder-v b-r b-light lt">
										<span class="fa-stack fa-2x pull-left m-r-sm"> <i
											class="fa fa-circle fa-stack-2x text-warning"></i> <i
											class="fa fa-bug fa-stack-1x text-white"></i> <span
											class="easypiechart pos-abt" data-percent="100"
											data-line-width="4" data-track-Color="#fff"
											data-scale-Color="false" data-size="50" data-line-cap='butt'
											data-animate="2000" data-target="#bugs" data-update="3000"></span>
										</span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong
												id="bugs">468</strong></span> <small class="text-muted text-uc">Bugs
												intruded</small>
										</a>
									</div>
									<div class="col-sm-6 col-md-3 padder-v b-r b-light">
										<span class="fa-stack fa-2x pull-left m-r-sm"> <i
											class="fa fa-circle fa-stack-2x text-danger"></i> <i
											class="fa fa-fire-extinguisher fa-stack-1x text-white"></i> <span
											class="easypiechart pos-abt easyPieChart" data-percent="100"
											data-line-width="4" data-track-color="#f5f5f5"
											data-scale-color="false" data-size="50" data-line-cap="butt"
											data-animate="3000" data-target="#firers" data-update="5000"
											style="width: 50px; height: 50px; line-height: 50px;"><canvas
													width="50" height="50"></canvas></span>
										</span> <a class="clear" href="index.jsp#"> <span
											class="h3 block m-t-xs"><strong id="firers">459</strong></span>
											<small class="text-muted text-uc">Extinguishers ready</small>
										</a>
									</div>
									<div class="col-sm-6 col-md-3 padder-v b-r b-light lt">
										<span class="fa-stack fa-2x pull-left m-r-sm"> <i
											class="fa fa-circle fa-stack-2x icon-muted"></i> <i
											class="fa fa-clock-o fa-stack-1x text-white"></i>
										</span> <a class="clear" href="index.jsp#"> <span
											class="h3 block m-t-xs"><strong>31:50</strong></span> <small
											class="text-muted text-uc">Left to exit</small>
										</a>
									</div>
								</div>
							</section>
							<div class="row">
								<div class="col-md-8">
									<section class="panel panel-default">
										<header class="panel-heading font-bold">Statistics</header>
										<div class="panel-body">
											<div id="flot-1ine"
												style="height: 210px; padding: 0px; position: relative;">
												<canvas class="flot-base"
													style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 670px; height: 210px;"
													width="670" height="210"></canvas>
												<div class="flot-text"
													style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; font-size: smaller; color: rgb(84, 84, 84);">
													<div class="flot-x-axis flot-x1-axis xAxis x1Axis"
														style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; display: block;">
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 17px; text-align: center;">0</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 75px; text-align: center;">1</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 133px; text-align: center;">2</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 191px; text-align: center;">3</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 249px; text-align: center;">4</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 307px; text-align: center;">5</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 365px; text-align: center;">6</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 423px; text-align: center;">7</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 481px; text-align: center;">8</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 539px; text-align: center;">9</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 593px; text-align: center;">10</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; max-width: 55px; top: 192px; left: 651px; text-align: center;">11</div>
													</div>
													<div class="flot-y-axis flot-y1-axis yAxis y1Axis"
														style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; display: block;">
														<div class="flot-tick-label tickLabel"
															style="position: absolute; top: 179px; left: 8px; text-align: right;">0</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; top: 135px; left: 8px; text-align: right;">5</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; top: 91px; left: 1px; text-align: right;">10</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; top: 47px; left: 1px; text-align: right;">15</div>
														<div class="flot-tick-label tickLabel"
															style="position: absolute; top: 4px; left: 1px; text-align: right;">20</div>
													</div>
												</div>
												<canvas class="flot-overlay"
													style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 670px; height: 210px;"
													width="670" height="210"></canvas>
											</div>
										</div>
										<footer class="panel-footer bg-white no-padder">
											<div class="row text-center no-gutter">
												<div class="col-xs-3 b-r b-light">
													<span class="h4 font-bold m-t block">5,860</span> <small
														class="text-muted m-b block">Orders</small>
												</div>
												<div class="col-xs-3 b-r b-light">
													<span class="h4 font-bold m-t block">10,450</span> <small
														class="text-muted m-b block">Sellings</small>
												</div>
												<div class="col-xs-3 b-r b-light">
													<span class="h4 font-bold m-t block">21,230</span> <small
														class="text-muted m-b block">Items</small>
												</div>
												<div class="col-xs-3">
													<span class="h4 font-bold m-t block">7,230</span> <small
														class="text-muted m-b block">Customers</small>
												</div>
											</div>
										</footer>
									</section>
								</div>
								<div class="col-md-4">
									<section class="panel panel-default">
										<header class="panel-heading font-bold">Data graph</header>
										<div class="bg-light dk wrapper">
											<span class="pull-right">Friday</span> <span class="h4">$540<br>
												<small class="text-muted">+1.05(2.15%)</small>
											</span>
											<div class="text-center m-b-n m-t-sm">
												<div class="sparkline" data-type="line" data-height="65"
													data-width="100%" data-line-width="2"
													data-line-color="#dddddd" data-spot-color="#bbbbbb"
													data-fill-color="" data-highlight-line-color="#fff"
													data-spot-radius="3" data-resize="true"
													values="280,320,220,385,450,320,345,250,250,250,400,380"></div>
												<div class="sparkline inline" data-type="bar"
													data-height="45" data-bar-width="6" data-bar-spacing="6"
													data-bar-color="#65bd77">10,9,11,10,11,10,12,10,9,10,11,9,8</div>
											</div>
										</div>
										<div class="panel-body">
											<div>
												<span class="text-muted">Total:</span> <span
													class="h3 block">$2500.00</span>
											</div>
											<div class="line pull-in"></div>
											<div class="row m-t-sm">
												<div class="col-xs-4">
													<small class="text-muted block">Market</small> <span>$1500.00</span>
												</div>
												<div class="col-xs-4">
													<small class="text-muted block">Referal</small> <span>$600.00</span>
												</div>
												<div class="col-xs-4">
													<small class="text-muted block">Affiliate</small> <span>$400.00</span>
												</div>
											</div>
										</div>
									</section>
								</div>
							</div>
							<div class="row">
								<div class="col-md-8">
									<h4 class="m-t-none">Todos</h4>
									<ul
										class="list-group gutter list-group-lg list-group-sp sortable">
										<li class="list-group-item box-shadow" draggable="true">
											<a href="index.jsp#" class="pull-right" data-dismiss="alert">
												<i class="fa fa-times icon-muted"></i>
										</a> <span class="pull-left media-xs"> <i
												class="fa fa-sort icon-muted fa m-r-sm"></i> <a
												href="index.jsp#todo-1"
												data-toggle="class:text-lt text-success" class="active">
													<i class="fa fa-square-o fa-fw text"></i> <i
													class="fa fa-check-square-o fa-fw text-active text-success"></i>
											</a>
										</span>
											<div class="clear text-success text-lt" id="todo-1">
												Browser compatibility</div>
										</li>
										<li class="list-group-item box-shadow" draggable="true">
											<a href="index.jsp#" class="pull-right" data-dismiss="alert">
												<i class="fa fa-times icon-muted"></i>
										</a> <span class="pull-left media-xs"> <i
												class="fa fa-sort icon-muted fa m-r-sm"></i> <a
												href="index.jsp#todo-2"
												data-toggle="class:text-lt text-danger"> <i
													class="fa fa-square-o fa-fw text"></i> <i
													class="fa fa-check-square-o fa-fw text-active text-danger"></i>
											</a>
										</span>
											<div class="clear" id="todo-2">Looking for more example
												templates</div>
										</li>
										<li class="list-group-item box-shadow" draggable="true">
											<a href="index.jsp#" class="pull-right" data-dismiss="alert">
												<i class="fa fa-times icon-muted"></i>
										</a> <span class="pull-left media-xs"> <i
												class="fa fa-sort icon-muted fa m-r-sm"></i> <a
												href="index.jsp#todo-3" data-toggle="class:text-lt"> <i
													class="fa fa-square-o fa-fw text"></i> <i
													class="fa fa-check-square-o fa-fw text-active text-success"></i>
											</a>
										</span>
											<div class="clear" id="todo-3">Customizing components</div>
										</li>
										<li class="list-group-item box-shadow" draggable="true">
											<a href="index.jsp#" class="pull-right" data-dismiss="alert">
												<i class="fa fa-times icon-muted"></i>
										</a> <span class="pull-left media-xs"> <i
												class="fa fa-sort icon-muted fa m-r-sm"></i> <a
												href="index.jsp#todo-4" data-toggle="class:text-lt"> <i
													class="fa fa-square-o fa-fw text"></i> <i
													class="fa fa-check-square-o fa-fw text-active text-success"></i>
											</a>
										</span>
											<div class="clear" id="todo-4">The fastest way to get
												started</div>
										</li>
										<li class="list-group-item box-shadow" draggable="true">
											<a href="index.jsp#" class="pull-right" data-dismiss="alert">
												<i class="fa fa-times icon-muted"></i>
										</a> <span class="pull-left media-xs"> <i
												class="fa fa-sort icon-muted fa m-r-sm"></i> <a
												href="index.jsp#todo-5" data-toggle="class:text-lt"> <i
													class="fa fa-square-o fa-fw text"></i> <i
													class="fa fa-check-square-o fa-fw text-active text-success"></i>
											</a>
										</span>
											<div class="clear" id="todo-5">HTML5 doctype required</div>
										</li>
										<li class="list-group-item box-shadow" draggable="true">
											<a href="index.jsp#" class="pull-right" data-dismiss="alert">
												<i class="fa fa-times icon-muted"></i>
										</a> <span class="pull-left media-xs"> <i
												class="fa fa-sort icon-muted fa m-r-sm"></i> <a
												href="index.jsp#todo-6" data-toggle="class:text-lt"> <i
													class="fa fa-square-o fa-fw text"></i> <i
													class="fa fa-check-square-o fa-fw text-active text-success"></i>
											</a>
										</span>
											<div class="clear" id="todo-6">LessCSS compiling</div>
										</li>
									</ul>
								</div>
								<div class="col-md-4">
									<section class="panel b-light">
										<header class="panel-heading bg-primary dker no-border">
											<strong>Calendar</strong>
										</header>
										<div id="calendar" class="bg-primary m-l-n-xxs m-r-n-xxs">
											<div class="calendar" id="cal_a78">
												<table class="table header">
													<tbody>
														<tr></tr>
													</tbody>
													<td><i class="fa fa-arrow-left"></i></td>
													<td colspan="5" class="year span6"><div
															class="visualmonthyear">October 2014</div></td>
													<td><i class="fa fa-arrow-right"></i></td>
												</table>
												<table class="daysmonth table table">
													<tbody>
														<tr class="week_days">
															<td class="first">S</td>
															<td>M</td>
															<td>T</td>
															<td>W</td>
															<td>T</td>
															<td>F</td>
															<td class="last">S</td>
														</tr>
														<tr>
															<td class="invalid first"></td>
															<td class="invalid"></td>
															<td class="invalid"></td>
															<td id="cal_a78_1_10_2014"><a>1</a></td>
															<td id="cal_a78_2_10_2014"><a>2</a></td>
															<td id="cal_a78_3_10_2014"><a>3</a></td>
															<td id="cal_a78_4_10_2014" class="last"><a>4</a></td>
														</tr>
														<tr>
															<td id="cal_a78_5_10_2014"
																class="first event event_popover"><a
																data-original-title="Meet a friend"
																data-trigger="manual" class="manual_popover"
																rel="popover" data-content="Contents here">5</a><span
																style="background-color: rgb(251, 107, 91); background-position: initial initial; background-repeat: initial initial;"></span></td>
															<td id="cal_a78_6_10_2014"><a>6</a></td>
															<td id="cal_a78_7_10_2014"><a>7</a></td>
															<td id="cal_a78_8_10_2014" class="event event_popover"><a
																data-original-title="Kick off meeting!"
																data-trigger="manual" class="manual_popover"
																rel="popover"
																data-content="Have a kick off meeting with .inc company">8</a><span
																style="background-color: rgb(255, 186, 77); background-position: initial initial; background-repeat: initial initial;"></span></td>
															<td id="cal_a78_9_10_2014"><a>9</a></td>
															<td id="cal_a78_10_10_2014"><a>10</a></td>
															<td id="cal_a78_11_10_2014" class="last"><a>11</a></td>
														</tr>
														<tr>
															<td id="cal_a78_12_10_2014" class="first"><a>12</a></td>
															<td id="cal_a78_13_10_2014"><a>13</a></td>
															<td id="cal_a78_14_10_2014"><a>14</a></td>
															<td id="cal_a78_15_10_2014"><a>15</a></td>
															<td id="cal_a78_16_10_2014"><a>16</a></td>
															<td id="cal_a78_17_10_2014"><a>17</a></td>
															<td id="cal_a78_18_10_2014"
																class="last event event_popover"><a
																data-original-title="Milestone release"
																data-trigger="manual" class="manual_popover"
																rel="popover" data-content="Contents here">18</a><span
																style="background-color: rgb(255, 186, 77); background-position: initial initial; background-repeat: initial initial;"></span></td>
														</tr>
														<tr>
															<td id="cal_a78_19_10_2014"
																class="first event event_tooltip"><a
																data-original-title="A link"
																href="https://github.com/blog/category/drinkup"
																rel="tooltip">19</a><span
																style="background-color: rgb(204, 204, 204); background-position: initial initial; background-repeat: initial initial;"></span></td>
															<td id="cal_a78_20_10_2014"><a>20</a></td>
															<td id="cal_a78_21_10_2014"><a>21</a></td>
															<td id="cal_a78_22_10_2014"><a>22</a></td>
															<td id="cal_a78_23_10_2014"><a>23</a></td>
															<td id="cal_a78_24_10_2014"><a>24</a></td>
															<td id="cal_a78_25_10_2014" class="last"><a>25</a></td>
														</tr>
														<tr>
															<td id="cal_a78_26_10_2014" class="first"><a>26</a></td>
															<td id="cal_a78_27_10_2014"><a>27</a></td>
															<td id="cal_a78_28_10_2014"><a>28</a></td>
															<td id="cal_a78_29_10_2014"><a>29</a></td>
															<td id="cal_a78_30_10_2014"><a>30</a></td>
															<td id="cal_a78_31_10_2014"><a>31</a></td>
															<td class="invalid last"></td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="list-group">
											<a href="index.jsp#" class="list-group-item text-ellipsis">
												<span class="badge bg-danger">7:30</span> Meet a friend
											</a> <a href="index.jsp#" class="list-group-item text-ellipsis">
												<span class="badge bg-success">9:30</span> Have a kick off
												meeting with .inc company
											</a> <a href="index.jsp#" class="list-group-item text-ellipsis">
												<span class="badge bg-light">19:30</span> Milestone release
											</a>
										</div>
									</section>
								</div>
							</div>
							<div>
								<div class="btn-group m-b" data-toggle="buttons">
									<label class="btn btn-sm btn-default active"> <input
										type="radio" name="options" id="option1"> Timeline
									</label> <label class="btn btn-sm btn-default"> <input
										type="radio" name="options" id="option2"> Activity
									</label>
								</div>
								<section class="comment-list block">
									<article id="comment-id-1" class="comment-item">
										<span class="fa-stack pull-left m-l-xs"> <i
											class="fa fa-circle text-info fa-stack-2x"></i> <i
											class="fa fa-play-circle text-white fa-stack-1x"></i>
										</span>
										<section class="comment-body m-b-lg">
											<header>
												<a href="index.jsp#"><strong>John smith</strong></a> shared
												a <a href="index.jsp#" class="text-info">video</a> to you <span
													class="text-muted text-xs"> 24 minutes ago </span>
											</header>
											<div>Lorem ipsum dolor sit amet, consectetur adipiscing
												elit. Morbi id neque quam.</div>
										</section>
									</article>
									<!-- .comment-reply -->
									<article id="comment-id-2" class="comment-reply">
										<article class="comment-item">
											<a class="pull-left thumb-sm"> <img
												src="./notebook_files/avatar_default.jpg" class="img-circle">
											</a>
											<section class="comment-body m-b-lg">
												<header>
													<a href="index.jsp#"><strong>John smith</strong></a> <span
														class="text-muted text-xs"> 26 minutes ago </span>
												</header>
												<div>Morbi id neque quam. Aliquam.</div>
											</section>
										</article>
										<article class="comment-item">
											<a class="pull-left thumb-sm"> <img
												src="./notebook_files/avatar.jpg" class="img-circle">
											</a>
											<section class="comment-body m-b-lg">
												<header>
													<a href="index.jsp#"><strong>Mike</strong></a> <span
														class="text-muted text-xs"> 26 minutes ago </span>
												</header>
												<div>Good idea.</div>
											</section>
										</article>
									</article>
									<!-- / .comment-reply -->
									<article id="comment-id-2" class="comment-item">
										<span class="fa-stack pull-left m-l-xs"> <i
											class="fa fa-circle text-danger fa-stack-2x"></i> <i
											class="fa fa-file-o text-white fa-stack-1x"></i>
										</span>
										<section class="comment-body m-b-lg">
											<header>
												<a href="index.jsp#"><strong>John Doe</strong></a> <span
													class="text-muted text-xs"> 1 hour ago </span>
											</header>
											<div>Lorem ipsum dolor sit amet, consecteter adipiscing
												elit.</div>
										</section>
									</article>
									<article id="comment-id-2" class="comment-item">
										<span class="fa-stack pull-left m-l-xs"> <i
											class="fa fa-circle text-success fa-stack-2x"></i> <i
											class="fa fa-check text-white fa-stack-1x"></i>
										</span>
										<section class="comment-body m-b-lg">
											<header>
												<a href="index.jsp#"><strong>Jonathan</strong></a>
												completed a task <span class="text-muted text-xs"> 1
													hour ago </span>
											</header>
											<div>Consecteter adipiscing elit.</div>
										</section>
									</article>
								</section>
								<a href="index.jsp#" class="btn btn-default btn-sm m-b"><i
									class="fa fa-plus icon-muted"></i> more</a>
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
	<script src="./notebook_files/app.v1.js"></script>
	<script src="./notebook_files/jquery.easy-pie-chart.js"></script>
	<script src="./notebook_files/jquery.sparkline.min.js"></script>
	<script src="./notebook_files/jquery.flot.min.js"></script>
	<script src="./notebook_files/jquery.flot.tooltip.min.js"></script>
	<script src="./notebook_files/jquery.flot.resize.js"></script>
	<script src="./notebook_files/jquery.flot.grow.js"></script>
	<script src="./notebook_files/demo.js"></script>
	<script src="./notebook_files/bootstrap_calendar.js"></script>
	<script src="./notebook_files/demo(1).js"></script>
	<script src="./notebook_files/jquery.sortable.js"></script>
	<script src="./notebook_files/app.plugin.js"></script>
	<div id="flotTip" style="display: none; position: absolute;"></div>
</body>
</html>