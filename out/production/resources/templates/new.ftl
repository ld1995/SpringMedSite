<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default" style="margin-top:45px">
                <div class="panel-heading">
                    <h3 class="panel-title">Adding patients form</h3>
                </div>
                <div class="panel-body">
                    <form method="post">
                        <input name="${_csrf.parameterName}" value="${_csrf.token}" type="hidden">
                        <div class="form-group">
                            <label for="wards">Wards</label>
                            <input type="text" class="form-control" id="wards" placeholder="Wards"
                                   name="wards">
                        </div>
                        <div class="form-group">
                            <label for="number">Number patient</label>
                            <input type="number" class="form-control" id="number" placeholder="Number patient"
                                   name="number" >
                        </div>
                        <div class="form-group">
                            <label for="date">Date</label>
                            <input type="date" class="form-control" id="date"
                                   name="date">
                        </div>
                        <div class="form-group">
                            <label for="last">Last Name</label>
                            <input type="text" class="form-control" id="last" placeholder="Last Name"
                                   name="last">
                        </div>
                        <div class="form-group">
                            <label for="first">First Name</label>
                            <input type="text" class="form-control" id="first" placeholder="First Name"
                                   name="first">
                        </div>
                        <div class="form-group">
                            <label for="second">Second Name</label>
                            <input type="text" class="form-control" id="second" placeholder="Second Name"
                                   name="second">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>