<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Car-sale</title>
        <style>
            input[type=text],
            select {
                width: 50%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
            
            input[type=email] {
                width: 50%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
        </style>

    </head>

    <body>
        <jsp:include page="../admin/jsp-common/header-admin.jsp"></jsp:include>
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <p>
                            <br>
                        </p>
                        <h1 class="page-useadd" style="padding-right: 600px">User Profire
                        </h1>
                        <p>
                            <br>
                        </p>
                    </div>
                    <div class="col-lg-7" style="padding-bottom: 120px">
                        <form action="" method="POST">
                            <div class="form-group">
                                <label>Fullname:</label> <input type="text" class="form-control" name="fullname" placeholder="Please Enter Fullname" id="fullname" />
                            </div>
                            <div class="form-group">
                                <label>Phone:</label>&nbsp &nbsp &nbsp;<input type="text" name="phone" id="phone" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}" required>
                            </div>
                            <br>
                            <div class="form-group">
                                <label>Age:</label>&nbsp &nbsp &nbsp &nbsp; <input type="number" name="age" min="1" id="age" max="100"><br>
                            </div>
                            <br>
                            <div class="form-group">
                                <label>Email:</label>&nbsp &nbsp &nbsp; <input type="email" class="form-control" id="email" name="email" placeholder="Please Enter Email" />
                            </div>
                            <br>
                            <div class="form-group">
                                <label>Address:</label>&nbsp; <input type="text" class="form-control" name="user" id="address" placeholder="Please Enter Address" />
                            </div>
                            <button type="submit">
							<a href="index.jsp"> Cancel</a>
						</button>
                            <form>
                    </div>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- Footer -->
        <jsp:include page="../jsp/footer.jsp"></jsp:include>
    </body>

    <script>
        getUserDetail();

        function getUserDetail() {
            var t = $.ajax({
                url: "http://localhost:8080/CarSale/admin/user-detail",
                type: "GET",
                dataType: "json",
                contentType: "application/json; charset=utf-8"
            });
            t.done(function(result) {
                $("#fullname").val(result.fullName);
                $("#phone").val(result.phone);
                $("#age").val(result.age);
                $("#email").val(result.email);
                $("#address").val(result.address);
            });
        }
    </script>

    </html>