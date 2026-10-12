<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Beer Details</title>

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

        .beer-container {
            margin-top: 50px;
        }

        .beer-heading {
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

        .btn-beer {
            background-color: #6d4c41;
            color: white;
        }

        .btn-beer:hover {
            background-color: #4e342e;
            color: white;
        }
    </style>
</head>

<body>

<div class="container beer-container">

    <div class="card shadow-lg">

        <div class="card-body p-4">

            <h2 class="text-center beer-heading mb-4">
                Beer Details
            </h2>

            <div class="table-responsive">

                <table class="table table-bordered table-striped table-hover align-middle">

                    <thead>
                    <tr>
                        <th>Company Name</th>
                        <th>Brand Name</th>
                        <th>Beer Type</th>
                        <th>Manufacturing Date</th>
                        <th>Price</th>
                         <th>Edit</th>
                    </tr>
                    </thead>

                    <tbody>

                    <c:forEach items="${beerDTOList}" var="beerDTO">
                        <tr>
                            <td>${beerDTO.companyName}</td>
                            <td>${beerDTO.brandName}</td>
                            <td>${beerDTO.beerType}</td>
                            <td>${beerDTO.manfDate}</td>
                            <td>${beerDTO.price}</td>
                             <td>
                              <a href="${pageContext.request.contextPath}/beer/edit?id=${beerDTO.id}"
                                class="btn btn-sm btn-primary">Edit </a> </td>
                        </tr>
                    </c:forEach>

                    <c:if test="${empty beerDTOList}">
                        <tr>
                            <td colspan="5" class="text-center text-muted py-4">
                                No beer records found.
                            </td>
                        </tr>
                    </c:if>

                    </tbody>

                </table>

            </div>

            <div class="text-center mt-4">

                <a href="${pageContext.request.contextPath}/Beer.jsp"
                   class="btn btn-beer px-4">
                    Back to Beer Form
                </a>

            </div>

        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>