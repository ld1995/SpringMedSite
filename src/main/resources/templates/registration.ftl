<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="panel panel-default" style="margin-top:45px">
                    <div class="panel-heading">
                        <h3 class="panel-title">Registration form</h3>
                    </div>
                    <div class="panel-body">
                        <form method="post" name="user">
                            <input name="${_csrf.parameterName}" value="${_csrf.token}" type="hidden">
                            <div class="form-group">
                                <label for="username">Username</label>
                                <input type="text" class="form-control" id="username" placeholder="Username"
                                   name="username" minlength="6" maxlength="32" required>
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" id="password" placeholder="Password"
                                   name="password" minlength="8" maxlength="32" required>
                            </div>
                            <div class="form-group">
                                <label for="password">Password confirm</label>
                                <input type="password" class="form-control" id="passwordConfirm" placeholder="Password Confirm"
                                       name="passwordConfirm" required>
                            </div>
                            <div class="form-group">
                                <label for="lastName">Last Name</label>
                                <input type="text" class="form-control" id="lastName" placeholder="Last Name"
                                       name="lastName" required>
                            </div>
                            <div class="form-group">
                                <label for="firstName">First Name</label>
                                <input type="text" class="form-control" id="firstName" placeholder="First Name"
                                       name="firstName" required>
                            </div>
                            <div class="form-group" >
                                <label for="department">Department</label>
                                <select id="department" class="form-control" name="department"  form="user" required>
                                    <#list getDepartmentList as department>
                                        <option value="${department.getId()}"> ${department.getName()}</option>
                                    </#list>
                                </select>
                            </div>


                            <button type="submit" class="btn btn-default">Submit</button>
                            <button type="reset" class="btn btn-default" style="red"> Clean form</button>
                            <button type="button" class="btn btn-default"><a href="login.ftl">Return to Authorization</a></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>