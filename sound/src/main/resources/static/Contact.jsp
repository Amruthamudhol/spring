<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Contact</title>

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
                    <h2>Contact</h2>
                </div>

                <div class="card-body">
                    <form action="contact" method="post">

                        <div class="mb-3">
                            <label class="form-label">Name:</label>
                            <input type="text" name="name"
                                   class="form-control"
                                   placeholder="Enter your name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Mobile Number:</label>
                            <input type="text"
                                   name="mobileNumber"
                                   class="form-control"
                                   placeholder="Enter mobile number">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Email:</label>
                            <input type="email"
                                   name="email"
                                   class="form-control"
                                   placeholder="Enter email">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Message:</label>
                            <textarea name="message"
                                      rows="5"
                                      class="form-control"
                                      placeholder="Enter your message"></textarea>
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