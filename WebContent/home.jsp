<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path=request.getContextPath(); %>
<!DOCTYPE html">
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<!--声明文档兼容模式，表示使用IE浏览器的最新模式-->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<!--设置视口的宽度(值为设备的理想宽度)，页面初始缩放值<理想宽度/可见宽度>-->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title>商城首页</title>

		<!-- 引入Bootstrap核心样式文件 -->
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<!-- 引入jQuery核心js文件 -->
		<script src="js/jquery-1.11.3.min.js"></script>
		<!-- 引入BootStrap核心js文件 -->
		<script src="js/bootstrap.min.js"></script>
	</head>

	<body>
		<!--导航栏-->
		<jsp:include page="/header.jsp"></jsp:include>
		
		<!--轮播图-->
		<div class="container">
			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="img/1.jpg" alt="...">
						<div class="carousel-caption">
							...
						</div>
					</div>
					<div class="item">
						<img src="img/2.jpg" alt="...">
						<div class="carousel-caption">
							...
						</div>
					</div>
					<div class="item">
						<img src="img/3.jpg" alt="...">
						<div class="carousel-caption">
							...
						</div>
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
		
		<!--热门商品-->
		<div class="container" style="margin-top: 10px;">
			<!--上面文字内容-->
			<div class="row">
				<span id="" style="font-size: 30px;padding-left: 33px;">
					热门商品&nbsp;&nbsp;&nbsp;<img src="img/title2.jpg" />
				</span>
			</div>
			<!--图片内容-->
			<div class="row">
				<div class="col-md-2 col-sm-2 hidden-sm hidden-xs" style="height: 400px;">
					<img src="img/big01.jpg" height="100%"/>
				</div>
				<div class="col-md-10 col-sm-10" style="padding-left: 10px;">
					<div class="row">
						<div class="col-md-6 hidden-xs hidden-sm" style="height: 200px;width: 490px;">
							<a href="#"><img src="img/middle01.jpg" height="100%" width="100%"/></a>
						</div>
						<c:forEach items="${hotP}" var="hot">
							<div class="col-md-2 col-sm-4 col-xs-6" align="center">
								<a href="<%=path %>/productInfo?pid=${hot.pid}"><img src="${pageContext.request.contextPath}/${hot.pimage}" width="168px" /></a>
								<p><a href="<%=path %>/productInfo?pid=${hot.pid}"><font color="gray">${hot.pname}</font></a></p>
								<p><font color="red">${hot.marketPrice}</font></p>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
				
		<!--广告图片-->		
		<div class="container" style="margin-top: 10px;">
			<div class="row">
				<div class="hidden-md hidden-sm hidden-xs " style="padding-left: 14px;">
					<img src="img/ad.jpg" style="width: 98%;"/>
				</div>
			</div>
		</div>
		
		<!--最新商品-->
		<div class="container" style="margin-top: 10px;">
			<!--上面文字内容-->
			<div class="row">
				<span id="" style="font-size: 30px;padding-left: 33px;">
					最新商品&nbsp;&nbsp;&nbsp;<img src="img/title2.jpg" />
				</span>
			</div>
			<!--图片内容-->
			<div class="row">
				<div class="col-md-2 col-sm-2 hidden-sm hidden-xs" style="height: 400px;">
					<img src="img/big01.jpg" height="100%"/>
				</div>
				<div class="col-md-10 col-sm-10" style="padding-left: 10px;">
					<div class="row">
						<div class="col-md-6  img-responsive" style="height: 200px;width: 490px;">
							<a href="#"><img src="img/middle01.jpg" height="100%" width="100%"/></a>
						</div>
						<c:forEach items="${newP}" var="newP">
							<div class="col-md-2 col-sm-4 col-xs-6" align="center">
								<a href="<%=path %>/productInfo?pid=${newP.pid}"><img src="${pageContext.request.contextPath}/${newP.pimage}" width="170px"/></a>
								<p><a href="<%=path %>/productInfo?pid=${newP.pid}"><font color="gray">${newP.pname}</font></a></p>
								<p><font color="red">${newP.marketPrice}</font></p>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
		
		<!--广告图片-->
		<div class="container" style="margin-top: 10px;">
			<div class="row">
				<div class="hidden-md hidden-sm hidden-xs " style="padding-left: 14px;">
					<img src="img/footer.jpg" style="width: 98%;"/>
				</div>
			</div>
		</div>
		
		<!--友情链接和版权信息-->
		<div class="container" style="margin-top: 10px;">
			<div class="row">
				<div class="" align="center">
					<ul class="list-inline">
						<li><a href="info.html">关于我们</a></li>
						<li><a>联系我们</a></li>
						<li><a>招贤纳士</a></li>
						<li><a>法律声明</a></li>
						<li><a>友情链接</a></li>
						<li><a>支付方式</a></li>
						<li><a>配送方式</a></li>
						<li><a>服务声明</a></li>
						<li><a>广告声明</a></li>
					</ul>
				</div>
				<div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
					Copyright &copy; 2005-2016  版权所有
				</div>
			</div>
		</div>
		
	</body>

</html>