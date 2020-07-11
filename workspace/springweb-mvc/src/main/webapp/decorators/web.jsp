<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="SHORTCUT ICON" href="https://cdn.24h.com.vn/upload/icon/icon_24h.ico" type="image/x-icon">
  <!-- mặc định default là trang chủ để nếu thằng con không có title, chúng ta không gõ title thì nó
  sẽ lấy title mặc định của thằng cho nó override vào, còn nếu thằng con có title thì nó nhận title 
  của thằng con làm title hiển thị cho trang đó, ngoài ra nếu chúng ta không khai báo default thì nó
  khi click vào bất kì thằng con nào, nó cũng nhận title của thằng cha làm thằng hiển thị chính cho
  trang đó -->
<title><dec:title default="Trang chủ web" /></title>
	
  <!-- Bootstrap core CSS -->
  <link href="<c:url value='/template/web/vendor/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css" >

  <!-- Custom styles for this template -->
  <link href="<c:url value='/template/web/css/small-business.css'/>" rel="stylesheet" type="text/css">
  
  <!-- Custom styles for this products template -->
  <link href="<c:url value='/template/products/css/shop-item.css'/>" rel="stylesheet" >
  
  <!-- Custom styles for this service template -->
  <link href="<c:url value='/template/service/css/full-width-pics.css'/>" rel="stylesheet">
  
  <!-- Custom styles for this about template -->
  <link href="<c:url value='/template/about/css/scrolling-nav.css'/>" rel="stylesheet" >
  
</head>
<body>
  
  <!-- navigation -->
  <%@ include file="/common/web/header.jsp" %>	
  
  <dec:body/>
  
  <!-- footer -->
  <%@ include file="/common/web/footer.jsp" %>
  
  <!-- Bootstrap core JavaScript -->
  <script src="<c:url value='/template/web/vendor/jquery/jquery.min.js'/>" type="text/javascript"></script>
  <script src="<c:url value='/template/web/vendor/bootstrap/js/bootstrap.bundle.min.js'/>" type="text/javascript"></script>
	
  <!-- Custom JavaScript for this theme about -->
  <script src="<c:url value='/template/about/vendor/jquery-easing/jquery.easing.min.js'/>" type="text/javascript"></script>
  <script src="<c:url value='/template/about/js/scrolling-nav.js'/>" type="text/javascript"></script>
  
</body>
</html>