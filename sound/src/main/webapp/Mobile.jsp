<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mobile</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-lg-8">

            <div class="card border-0 shadow">

                <div class="card-body p-4">

                    <h2 class="text-center mb-4">Mobile Details</h2>

                    <form action="mobile" method="post">

                        <div class="row">

                            <div class="col-md-6 mb-3">
                                <label class="form-label">
                                    Mobile Name
                                </label>

                                <input type="text"
                                       name="mobileName"
                                       class="form-control"
                                       placeholder="Enter mobile name">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label class="form-label">
                                    Brand
                                </label>

                                <input type="text"
                                       name="brand"
                                       class="form-control"
                                       placeholder="Enter brand">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label class="form-label">
                                    Price
                                </label>

                                <div class="input-group">
                                    <span class="input-group-text">₹</span>

                                    <input type="text"
                                           name="price"
                                           class="form-control"
                                           placeholder="Enter price">
                                </div>
                            </div>

                        </div>

                        <hr>

                        <label class="form-label">
                            <strong>Features</strong>
                        </label>

                        <div class="row">

                            <div class="col-md-6">
                                <div class="form-check mb-2">
                                    <input class="form-check-input"
                                           type="checkbox"
                                           name="features"
                                           value="5G"
                                           id="fiveG">

                                    <label class="form-check-label"
                                           for="fiveG">
                                        5G
                                    </label>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-check mb-2">
                                    <input class="form-check-input"
                                           type="checkbox"
                                           name="features"
                                           value="Camera"
                                           id="camera">

                                    <label class="form-check-label"
                                           for="camera">
                                        Camera
                                    </label>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-check mb-2">
                                    <input class="form-check-input"
                                           type="checkbox"
                                           name="features"
                                           value="Fast Charging"
                                           id="fastCharging">

                                    <label class="form-check-label"
                                           for="fastCharging">
                                        Fast Charging
                                    </label>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-check mb-2">
                                    <input class="form-check-input"
                                           type="checkbox"
                                           name="features"
                                           value="Water Resistant"
                                           id="waterResistant">

                                    <label class="form-check-label"
                                           for="waterResistant">
                                        Water Resistant
                                    </label>
                                </div>
                            </div>

                        </div>

                        <div class="text-center mt-4">

                            <button type="submit"
                                    class="btn btn-dark px-5">
                                Submit
                            </button>

                            <button type="reset"
                                    class="btn btn-outline-secondary px-5 ms-2">
                                Reset
                            </button>

                        </div>

                    </form>
                    <div class="alert alert-success mt-3">  ${message}
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