<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Place</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-7">

            <div class="card border-0 shadow">

                <div class="card-header bg-success text-white text-center py-3">
                    <h2 class="mb-0">Place Details</h2>
                </div>

                <div class="card-body p-4">

                    <form action="place" method="post">

                        <div class="mb-3">
                            <label class="form-label">Place Name</label>

                            <input type="text"
                                   name="placeName"
                                   class="form-control"
                                   placeholder="Enter place name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">City</label>

                            <input type="text"
                                   name="city"
                                   class="form-control"
                                   placeholder="Enter city">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">State</label>

                            <select name="state" class="form-select">

                                <option value="">
                                    -- Select State --
                                </option>

                                <option value="Karnataka">Karnataka</option>
                                <option value="Maharashtra">Maharashtra</option>
                                <option value="Tamil Nadu">Tamil Nadu</option>
                                <option value="Kerala">Kerala</option>
                                <option value="Andhra Pradesh">Andhra Pradesh</option>
                                <option value="Telangana">Telangana</option>

                            </select>
                        </div>

                        <div class="d-grid mt-4">

                            <button type="submit"
                                    class="btn btn-success">
                                Submit
                            </button>

                        </div>

                    </form>

                    <div class="alert alert-success mt-3">
                        ${message}
                    </div>
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