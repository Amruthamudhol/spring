
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Whiskey Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="card shadow p-4">

        <h2 class="text-center mb-4">Whiskey Form</h2>

        <form action="whiskey" method="post">

            <!-- Brand Name -->
            <div class="mb-3">
                <label class="form-label">Brand Name</label>
                <input type="text"
                       name="brandName"
                       class="form-control"
                       placeholder="Enter brand name"
                       value="${whiskeyDTO.brandName}">
            </div>

            <!-- Whiskey Type -->
            <div class="mb-3">
                <label class="form-label">Whiskey Type</label>
                <input type="text"
                       name="whiskeyType"
                       class="form-control"
                       placeholder="Enter whiskey type"
                       value="${whiskeyDTO.whiskeyType}">
            </div>

            <!-- Price -->
            <div class="mb-3">
                <label class="form-label">Price</label>
                <input type="number"
                       name="price"
                       class="form-control"
                       placeholder="Enter price"
                       value="${whiskeyDTO.price}">
            </div>

            <!-- Quantity -->
            <div class="mb-3">
                <label class="form-label">Quantity</label>
                <input type="number"
                       name="quantity"
                       class="form-control"
                       placeholder="Enter quantity"
                       value="${whiskeyDTO.quantity}">
            </div>

            <!-- Manufacturing Date -->
            <div class="mb-3">
                <label class="form-label">Manufacturing Date</label>
                <input type="date"
                       name="manufacturingDate"
                       class="form-control"
                       value="${whiskeyDTO.manufacturingDate}">
            </div>

            <button type="submit" class="btn btn-primary">
                Save Whiskey
            </button>

            <a href="${pageContext.request.contextPath}/"
               class="btn btn-secondary">
                Home
            </a>

        </form>

        <c:if test="${not empty validationErrors}">
            <div class="mt-3">
                <c:forEach items="${validationErrors}" var="error">
                    <p class="text-danger">${error}</p>
                </c:forEach>
            </div>
        </c:if>

        <c:if test="${not empty message}">
            <p class="text-success mt-3">${message}</p>
        </c:if>

        <a href="${pageContext.request.contextPath}/whiskey/showAll">
            Show All
        </a>

    </div>

</div>

</body>
</html>