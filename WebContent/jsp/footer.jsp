<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ResourceBundle"%>
<%
  ResourceBundle resourceBundle =
      ResourceBundle.getBundle("carsale.common.Content", request.getLocale());
%>
<footer>
	<div class="footer-top">
		<div class="footer-grid left-grid">
			<h3><%=resourceBundle.getString("xemnhieunhat")%></h3>
			<ul>
				<li><a href="#">SUV</a></li>
				<li><a href="#">SEDAN</a></li>
				<li><a href="#"><%=resourceBundle.getString("xebantai")%></a></li>
				<li><a href="#">VIOS</a></li>
			</ul>
		</div>
		<div class="footer-grid center-grid">
			<h3><%=resourceBundle.getString("aboutus")%></h3>
			<div class="f_menu">
				<ul>
					<li><%=resourceBundle.getString("diachi")%>: Học viện công
						Nghệ Bưu chính viễn thông</li>
					<li>Hotline: 0973.631.248</li>
					<li><i><%=resourceBundle.getString("loinhankhachhang")%></i></li>
				</ul>
			</div>
		</div>
		<div class="footer-grid right-grid">
			<h3><%=resourceBundle.getString("contactinfo")%></h3>
			<ul class="follow_icon">
				<li><a href="#" style="opacity: 1;"> <img
						src="images/follow_icon.png" alt="">
				</a></li>
				<li><a href="#" style="opacity: 1;"> <img
						src="img/follow_icon1.png" alt="">
				</a></li>
				<li><a href="#" style="opacity: 1;"> <img
						src="img/follow_icon2.png" alt="">
				</a></li>
				<li><a href="#" style="opacity: 1;"> <img
						src="img/follow_icon3.png" alt="">
				</a></li>
				<li><a href="#" style="opacity: 1;"> <img
						src="img/follow_icon4.png" alt="">
				</a></li>
				<li><a href="#" style="opacity: 1;"> <img
						src="img/follow_icon5.png" alt="">
				</a></li>
			</ul>
			<p><%=resourceBundle.getString("gopyxingoi")%>: 03456789
			</p>
			<span> <a href="https://www.facebook.com/otovinhphuctoyota/">ltwthaydung@carssale.com</a>
			</span>
		</div>
		<div class="clear"></div>
	</div>
	<div class="copy-right">
		<p>
			<%=resourceBundle.getString("copyright")%>
			&copy; 2019 Car Sale.|
			<%=resourceBundle.getString("designby")%>
			<a href="#"> Nhom LTW </a>
		</p>
	</div>
</footer>