<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Gin Details</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #e0f7fa, #e8eaf6);
            min-height: 100vh;
        }

        .gin-container {
            margin-top: 50px;
        }

        .gin-heading {
            color: #283593;
            font-weight: bold;
        }

        .table thead th {
            background-color: #283593;
            color: white;
            text-align: center;
            vertical-align: middle;
        }

        .table tbody td {
            text-align: center;
            vertical-align: middle;
        }

        .card {
            border: none;
            border-radius: 15px;
            overflow: hidden;
        }

        .btn-gin {
            background-color: #283593;
            color: white;
        }

        .btn-gin:hover {
            background-color: #1a237e;
            color: white;
        }
    </style>
</head>

<body>

<div class="container-fluid gin-container px-4">

    <div class="card shadow-lg">

        <div class="card-body p-4">

            <h2 class="text-center gin-heading mb-4">
                Gin Details
            </h2>

            <div class="table-responsive">

                <table class="table table-bordered table-striped table-hover align-middle">

                    <thead>
                    <tr>
                        <th>Company Name</th>
                        <th>Brand Name</th>
                        <th>Gin Type</th>
                        <th>Manufacture Date</th>
                        <th>Price</th>
                        <th>Bottle Size</th>
                        <th>Country</th>
                        <th>Quality</th>
                        <th>Availability</th>
                    </tr>
                    </thead>

                    <tbody>

                    <c:forEach items="${ginDTOList}" var="ginDTO">
                        <tr>
                            <td>${ginDTO.companyName}</td>
                            <td>${ginDTO.brandName}</td>
                            <td>${ginDTO.ginType}</td>
                            <td>${ginDTO.manfDate}</td>
                            <td>${ginDTO.price}</td>
                            <td>${ginDTO.bottleSize}</td>
                            <td>${ginDTO.country}</td>
                            <td>${ginDTO.quality}</td>

                            <td>
                                <c:choose>
                                    <c:when test="${ginDTO.availability}">
                                        <span class="badge bg-success">Available</span>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="badge bg-danger">Not Available</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                    </c:forEach>

                    <c:if test="${empty ginDTOList}">
                        <tr>
                            <td colspan="9" class="text-center text-muted py-4">
                                No gin records found.
                            </td>
                        </tr>
                    </c:if>

                    </tbody>

                </table>

            </div>

            <div class="text-center mt-4">
                <a href="${pageContext.request.contextPath}/Gin.jsp"
                   class="btn btn-gin px-4">
                    Back to Gin Form
                </a>
            </div>

        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>