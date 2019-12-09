<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Car-sale</title>
	<link rel="stylesheet" href="css/abc.css" type="text/css" />
	<link href="css/styles.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
	<link rel="stylesheet" href="./css/design_fromAD.css" type="text/css">
	<link href="css/style_AM.css" rel="stylesheet" type="text/css" />
	<link href="css/content.css" rel="stylesheet" type="text/css" />
	<link href="./dist/css/sb-admin-2.css" rel="stylesheet">
	<script src='https://kit.fontawesome.com/a076d05399.js'></script>
	<style>
		table,
		th,
		td {
			border: 0.5px solid black;
		}
	</style>
</head>

<body>
	<jsp:include page="../admin/jsp-common/header-admin.jsp"></jsp:include>
	<!--CONTENT-->
	<div id="page-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					<p>
						<br>
					</p>
					<h1 class="page-header">Product List</h1>
					<p>
						<br>
					</p>
				</div>
				<!-- /.col-lg-12 -->
				<div id="prlist">
					<h3>Add Product</h3>
					<i class="fa fa-plus" aria-hidden="true"></i>&nbsp<a href="#">Add</a>
					<!-- <button style="font-size:24px">add news <i class="fa fa-plus"></i></button> -->
				</div>
				<table class="table table-striped table-bordered table-hover" id="dataTables-example">
					<thead>
						<tr align="center">
							<th>ID</th>
							<th>Name</th>
							<th>Price</th>
							<th>Date</th>
							<th>Status</th>
							<th>Delete</th>
							<th>Edit</th>
						</tr>
					</thead>
					<tbody>
						<tr class="odd gradeX" align="center">
							<td>1</td>
							<td>Vios 1.5E (MT)</td>
							<td>200.000 VNĐ</td>
							<td>3 Minutes Age</td>
							<td>Hiện</td>
							<td class="center"><i class="fa fa-trash-o  fa-fw"></i><a href="#"> Delete</a></td>
							<td class="center"><i class="fa fa-pencil fa-fw"></i> <a href="#">Edit</a></td>
						<tr class="even gradeC" align="center">
							<td>2</td>
							<td>Vios G(CVT)</td>
							<td>250.000 VNĐ</td>
							<td>1 Hours Age</td>
							<td>Ẩn</td>
							<td class="center"><i class="fa fa-trash-o  fa-fw"></i><a href="#"> Delete</a></td>
							<td class="center"><i class="fa fa-pencil fa-fw"></i> <a href="#">Edit</a></td>
						</tr>
						<tr class="even gradeC" align="center">
							<td>3</td>
							<td>Corolla Altis 2.0 Luxury</td>
							<td>250.000 VNĐ</td>
							<td>1 Hours Age</td>
							<td>Ẩn</td>
							<td class="center"><i class="fa fa-trash-o  fa-fw"></i><a href="#"> Delete</a></td>
							<td class="center"><i class="fa fa-pencil fa-fw"></i> <a href="#">Edit</a></td>
						</tr>
						<tr class="even gradeC" align="center">
							<td>4</td>
							<td>Fortuner 2.4G 4×2 AT</td>
							<td>250.000 VNĐ</td>
							<td>1 Hours Age</td>
							<td>Ẩn</td>
							<td class="center"><i class="fa fa-trash-o  fa-fw"></i><a href="#"> Delete</a></td>
							<td class="center"><i class="fa fa-pencil fa-fw"></i> <a href="#">Edit</a></td>
						</tr>
						<tr class="even gradeC" align="center">
							<td>5</td>
							<td>Toyota Rush 2018</td>
							<td>250.000 VNĐ</td>
							<td>1 Hours Age</td>
							<td>Ẩn</td>
							<td class="center"><i class="fa fa-trash-o  fa-fw"></i><a href="#"> Delete</a></td>
							<td class="center"><i class="fa fa-pencil fa-fw"></i> <a href="#">Edit</a></td>
						</tr>
						<tr class="even gradeC" align="center">
							<td>5</td>
							<td>Toyota Rush 2018</td>
							<td>250.000 VNĐ</td>
							<td>1 Hours Age</td>
							<td>Ẩn</td>
							<td class="center"><i class="fa fa-trash-o  fa-fw"></i><a href="#"> Delete</a></td>
							<td class="center"><i class="fa fa-pencil fa-fw"></i> <a href="#">Edit</a></td>
						</tr>
						<tr class="even gradeC" align="center">
							<td>5</td>
							<td>Toyota Rush 2018</td>
							<td>250.000 VNĐ</td>
							<td>1 Hours Age</td>
							<td>Ẩn</td>
							<td class="center"><i class="fa fa-trash-o  fa-fw"></i><a href="#"> Delete</a></td>
							<td class="center"><i class="fa fa-pencil fa-fw"></i> <a href="#">Edit</a></td>
						</tr>

					</tbody>
				</table>
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
	</div>
	<!-- Footer -->
	<jsp:include page="../jsp/footer.jsp"></jsp:include>
</body>

</html>