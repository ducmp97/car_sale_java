<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ResourceBundle"%>
<%
  ResourceBundle resourceBundle =
      ResourceBundle.getBundle("carsale.common.Content", request.getLocale());
%>
<div class="header">
	<div class="header-left">
		<img src="./icon/gmail_header48px.png" /> <span
			style="color: aliceblue;"><%=resourceBundle.getString("email")%></span>
		&nbsp; <img src="./icon/phone_52px.png" /> <span
			style="color: aliceblue;"><%=resourceBundle.getString("phone")%></span>
	</div>
	<div class=" header-right ">
		<a class="active" href="listCarPrice.jsp"><%=resourceBundle.getString("banggiaxe")%></a>
		<a href="carsales"><%=resourceBundle.getString("muaxetragop")%></a> <a
			href="#about "><%=resourceBundle.getString("thuvien")%></a>
	</div>
</div>
<div class="navbar">
	<a href="index.jsp"><%=resourceBundle.getString("home")%></a> <a
		href="new.jsp"><%=resourceBundle.getString("tintuc")%></a>
	<div class="dropdown">
		<button class="dropbtn">
			<%=resourceBundle.getString("sanpham")%><i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-content">
			<div class="row">
				<div class="column">
					<h3>
						<a href="suv.jsp">SEDAN</a>
					</h3>
					<a href="#">Corolla Altis 2.0 Luxury</a> <a href="#">Corolla
						Altis 1.8E (MT)</a> <a href="#">Corolla Altis 2.0V Sport</a>
				</div>
				<div class="column">
					<h3>
						<a href="suv.jsp">SUV</a>
					</h3>
					<a href="#">Fortuner 2.4G 4×2 AT</a> <a href="#">Fortuner 2.7V
						4×2</a> <a href="#">Land Cruiser Prado VX</a>
				</div>
				<div class="column">
					<h3>
						<a href="suv.jsp">VOIS</a>
					</h3>
					<a href="#">Vios 1.5E (MT)</a> <a href="#">Vios G(CVT)</a> <a
						href="#">Vios 1.5E (CVT)</a>
				</div>
				<div class="column">
					<h3>
						<a href="suv.jsp"><%=resourceBundle.getString("xebantai")%></a>
					</h3>
					<a href="#">Hilux 2.4G 4x4MT</a> <a href="#">Hilux 2.4E 4×2 AT</a>
					<a href="#">Hilux 2.8G 4×4 AT</a>
				</div>
			</div>
		</div>
	</div>
	<a href="listCarPrice.jsp"><%=resourceBundle.getString("banggiaxe")%></a>
	<a href="service.jsp"><%=resourceBundle.getString("dichvu")%></a> <a
		href="contact.jsp"><%=resourceBundle.getString("contact")%></a>
</div>