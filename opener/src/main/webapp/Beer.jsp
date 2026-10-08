
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Beer</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">
    <div class="card shadow p-4">

        <h2 class="text-center mb-4">Beer Registration</h2>

        <form action="beer" method="post">

            <!-- Company Name -->
            <div class="mb-3">
                <label class="form-label">Company Name</label>
                <input type="text"
                       name="companyName"
                       class="form-control"
                       placeholder="Enter company name"
                       value="${beerDTO.companyName}">

                <c:forEach items="${validationErrors}" var="objectError">
                    <p class="text-danger">${objectError.defaultMessage}</p>
                </c:forEach>
            </div>

            <!-- Brand Name -->
            <div class="mb-3">
                <label class="form-label">Brand Name</label>
                <input type="text"
                       name="brandName"
                       class="form-control"
                       placeholder="Enter brand name"
                       value="${beerDTO.brandName}">
            </div>

            <!-- Beer Type -->
            <div class="mb-3">
                <label class="form-label">Beer Type</label>
                <input type="text"
                       name="beerType"
                       class="form-control"
                       placeholder="Enter beer type"
                       value="${beerDTO.beerType}">
            </div>

            <!-- Manufacturing Date -->
            <div class="mb-3">
                <label class="form-label">Manufacturing Date</label>
                <input type="date"
                       name="manfDate"
                       class="form-control"
                       value="${beerDTO.manfDate}">
            </div>

            <!-- Price -->
            <div class="mb-3">
                <label class="form-label">Price</label>
                <input type="number"
                       name="price"
                       class="form-control"
                       placeholder="Enter price"
                       value="${beerDTO.price}">
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">
                    Save Beer
                </button>
            </div>

        </form>

        <c:if test="${not empty message}">
            <div class="alert alert-success mt-3">
                ${message}
            </div>
        </c:if>

    </div>

</div>

</body>
</html>