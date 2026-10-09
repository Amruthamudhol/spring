<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Whiskey Details</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #fff8e1, #ffe0b2);
            min-height: 100vh;
        }

        .whiskey-container {
            margin-top: 50px;
        }

        .whiskey-heading {
            color: #6d4c41;
            font-weight: bold;
        }

        .table thead th {
            background-color: #6d4c41;
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

        .btn-whiskey {
            background-color: #6d4c41;
            color: white;
        }

        .btn-whiskey:hover {
            background-color: #4e342e;
            color: white;
        }
    </style>
</head>

<body>

<div class="container whiskey-container">

    <div class="card shadow-lg">

        <div class="card-body p-4">

            <h2 class="text-center whiskey-heading mb-4">
                Whiskey Details
            </h2>

            <div class="table-responsive">

                <table class="table table-bordered table-striped table-hover align-middle">

                    <thead>
                    <tr>
                        <th>Brand Name</th>
                        <th>Whiskey Type</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Manufacturing Date</th>
                    </tr>
                    </thead>

                    <tbody>

                    <c:forEach items="${whiskeyDTOList}" var="whiskeyDTO">
                        <tr>
                            <td>${whiskeyDTO.brandName}</td>
                            <td>${whiskeyDTO.whiskeyType}</td>
                            <td>${whiskeyDTO.price}</td>
                            <td>${whiskeyDTO.quantity}</td>
                            <td>${whiskeyDTO.manufacturingDate}</td>
                        </tr>
                    </c:forEach>

                    <c:if test="${empty whiskeyDTOList}">
                        <tr>
                            <td colspan="5" class="text-center text-muted py-4">
                                No whiskey records found.
                            </td>
                        </tr>
                    </c:if>

                    </tbody>

                </table>

            </div>

            <div class="text-center mt-4">

                <a href="${pageContext.request.contextPath}/Whiskey.jsp"
                   class="btn btn-whiskey px-4">
                    Back to Whiskey Form
                </a>

            </div>

        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>