 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Camera</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-6">

            <div class="card shadow">

                <div class="card-header bg-primary text-white text-center">
                    <h2>Camera</h2>
                </div>

                <div class="card-body">

                    <form action="camera" method="post">

                        <div class="mb-3">
                            <label class="form-label">Camera Name:</label>
                            <input type="text"
                                   name="cameraName"
                                   class="form-control"
                                   placeholder="Enter camera name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Brand:</label>
                            <input type="text"
                                   name="brand"
                                   class="form-control"
                                   placeholder="Enter brand">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Model:</label>
                            <input type="text"
                                   name="model"
                                   class="form-control"
                                   placeholder="Enter model">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Price:</label>
                            <input type="text"
                                   name="price"
                                   class="form-control"
                                   placeholder="Enter price">
                        </div>

                        <div class="d-grid">
                            <button type="submit"
                                    class="btn btn-primary">
                                Submit
                            </button>
                        </div>

                    </form>
                    <span class="text-primary">${message}</span>

                </div>

            </div>

        </div>

    </div>

</div>

</body>
</html>