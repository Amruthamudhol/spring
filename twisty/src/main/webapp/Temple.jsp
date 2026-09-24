<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Temple</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-8">

            <div class="card border-0 shadow">

                <div class="card-header bg-warning text-dark text-center py-3">
                    <h2 class="mb-0">Temple Details</h2>
                </div>

                <div class="card-body p-4">

                    <form action="temple" method="post">
                        <span class="text-primary">${message}</span>
                        <div class="row">

                            <div class="col-md-6 mb-3">
                                <label class="form-label">Temple Name</label>

                                <input type="text"
                                       name="templeName"
                                       class="form-control"
                                       placeholder="Enter temple name">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label class="form-label">God Name</label>

                                <input type="text"
                                       name="godName"
                                       class="form-control"
                                       placeholder="Enter god name">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label class="form-label">Location</label>

                                <input type="text"
                                       name="location"
                                       class="form-control"
                                       placeholder="Enter location">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label class="form-label">City</label>

                                <input type="text"
                                       name="city"
                                       class="form-control"
                                       placeholder="Enter city">
                            </div>

                        </div>

                        <div class="text-center mt-3">

                            <button type="submit"
                                    class="btn btn-warning px-5">
                                Submit
                            </button>

                            <button type="reset"
                                    class="btn btn-outline-secondary px-5 ms-2">
                                Reset
                            </button>

                        </div>

                    </form>


                </div>

            </div>

        </div>

    </div>

</div>
<div class="text-center mt-4 mb-4">
    <a href="index.jsp" class="btn btn-outline-primary">
        Go Back to Home
    </a>
</div>
</body>
</html>