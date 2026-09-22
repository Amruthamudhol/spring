<!DOCTYPE html>
<html>
<head>
    <title>Telephone Operator</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-6">

            <div class="card shadow">

                <div class="card-header text-center bg-primary text-white">
                    <h2>Telephone Operator</h2>
                </div>

                <div class="card-body">

                    <form action="telephoneOperator" method="post">

                        <div class="mb-3">
                            <label class="form-label">Operator Name:</label>
                            <input type="text"
                                   name="operatorName"
                                   class="form-control"
                                   placeholder="Enter operator name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Company Name:</label>
                            <input type="text"
                                   name="companyName"
                                   class="form-control"
                                   placeholder="Enter company name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Mobile Number:</label>
                            <input type="text"
                                   name="mobileNumber"
                                   class="form-control"
                                   placeholder="Enter mobile number">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Location:</label>
                            <input type="text"
                                   name="location"
                                   class="form-control"
                                   placeholder="Enter location">
                        </div>

                        <div class="d-grid">
                            <button type="submit"
                                    class="btn btn-primary">
                                Submit
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