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
        </style>
    </head>

    <body>
        <jsp:include page="../admin/jsp-common/header-admin.jsp"></jsp:include>
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 style="padding-right: 60px">Change Password</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                    <div class="col-lg-7" style="padding-bottom: 120px">
                        <form action="change-pass" method="POST">
                            <div class="form-group">
                                <label>Old Password</label> <br> <input type="text" class=" form-control" name="oldPassword" placeholder="Please enter old password" />
                            </div>
                            <div class="form-group">
                                <label>New Password</label> <br> <input type="text" class="form-control" name="newPassword" placeholder="Please enter new password" />
                            </div>
                            <div class="form-group">
                                <label>Confirm Password</label> <br> <input type="text" class="form-control" name="confirmPassword" placeholder="Please enter confirm password" />
                            </div>
                            <br> <input type="submit" class="btn btn-default" value="Change Password" name="submit" />
                            <button type="reset">
							<a href="index.jsp"> Cancel</a>
						</button>
                            <form>
                                <h2>${message}</h2>
                    </div>
                </div>
                <!-- /.row -->
            </div>
        </div>
        <!-- Footer -->
        <jsp:include page="../jsp/footer.jsp"></jsp:include>
    </body>

    </html>