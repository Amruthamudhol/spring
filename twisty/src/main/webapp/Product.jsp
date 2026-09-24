<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-7">

            <div class="card border-0 shadow">

                <div class="card-header bg-primary text-white text-center py-3">
                    <h2 class="mb-0">Product Details</h2>
                </div>

                <div class="card-body p-4">

                    <form action="product" method="post">

                        <div class="mb-3">
                            <label class="form-label">Product Name</label>

                            <input type="text"
                                   name="productName"
                                   class="form-control"
                                   placeholder="Enter product name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Product Price</label>

                            <div class="input-group">
                                <span class="input-group-text">₹</span>

                                <input type="text"
                                       name="productPrice"
                                       class="form-control"
                                       placeholder="Enter product price">
                            </div>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Product Brand</label>

                            <input type="text"
                                   name="brand"
                                   class="form-control"
                                   placeholder="Enter product brand">
                        </div>

                        <div class="d-flex justify-content-center gap-2 mt-4">

                            <button type="submit"
                                    class="btn btn-primary px-4">
                                Submit
                            </button>

                            <button type="reset"
                                    class="btn btn-outline-secondary px-4">
                                Reset
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