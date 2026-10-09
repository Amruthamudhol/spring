<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Gin Registration</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="card shadow p-4">

        <h2 class="text-center mb-4">Gin Registration</h2>

        <!-- Validation Errors -->
        <c:forEach items="${validationErrors}" var="objectError">
            <p class="text-danger">
                ${objectError.defaultMessage}
            </p>
        </c:forEach>

        <!-- Success Message -->
        <c:if test="${not empty message}">
            <div class="alert alert-success">
                ${message}
            </div>
        </c:if>

        <form action="gin" method="post">

            <!-- Company Name -->
            <div class="mb-3">
                <label class="form-label">Company Name</label>

                <input type="text"
                       name="companyName"
                       class="form-control"
                       placeholder="Enter company name"
                       value="${ginDTO.companyName}">
            </div>


            <!-- Brand Name -->
            <div class="mb-3">
                <label class="form-label">Brand Name</label>

                <input type="text"
                       name="brandName"
                       class="form-control"
                       placeholder="Enter brand name"
                       value="${ginDTO.brandName}">
            </div>


            <!-- Gin Type -->
            <div class="mb-3">
                <label class="form-label">Gin Type</label>

                <select name="ginType" class="form-select">

                    <option value="">Select Gin Type</option>

                    <c:forEach items="${ginTypes}" var="type">

                        <option value="${type}"
                            ${ginDTO.ginType == type ? 'selected' : ''}>
                            ${type}
                        </option>

                    </c:forEach>

                </select>
            </div>


            <!-- Manufacturing Date -->
            <div class="mb-3">
                <label class="form-label">Manufacturing Date</label>

                <input type="date"
                       name="manfDate"
                       class="form-control"
                       value="${ginDTO.manfDate}">
            </div>


            <!-- Price -->
            <div class="mb-3">
                <label class="form-label">Price</label>

                <input type="number"
                       name="price"
                       class="form-control"
                       placeholder="Enter price"
                       value="${ginDTO.price}">
            </div>


            <!-- Bottle Size -->
            <div class="mb-3">
                <label class="form-label">Bottle Size</label>

                <select name="bottleSize" class="form-select">

                    <option value="">Select Bottle Size</option>

                    <c:forEach items="${bottleSizes}" var="size">

                        <option value="${size}"
                            ${ginDTO.bottleSize == size ? 'selected' : ''}>
                            ${size}
                        </option>

                    </c:forEach>

                </select>
            </div>


            <!-- Country -->
            <div class="mb-3">
                <label class="form-label">Country</label>

                <select name="country" class="form-select">

                    <option value="">Select Country</option>

                    <c:forEach items="${countries}" var="country">

                        <option value="${country}"
                            ${ginDTO.country == country ? 'selected' : ''}>
                            ${country}
                        </option>

                    </c:forEach>

                </select>
            </div>


            <!-- Quality -->
            <div class="mb-3">

                <label class="form-label">Quality</label>

                <div>

                    <c:forEach items="${qualities}" var="quality">

                        <input type="radio"
                               name="quality"
                               value="${quality}"
                               ${ginDTO.quality == quality ? 'checked' : ''}>

                        <label class="me-3">
                            ${quality}
                        </label>

                    </c:forEach>

                </div>

            </div>


            <!-- Availability -->
            <div class="mb-3">

                <label class="form-label">Availability</label>

                <div>

                    <c:forEach items="${availability}" var="available">

                        <input type="radio"
                               name="availability"
                               value="${available}"
                               ${ginDTO.availability == available ? 'checked' : ''}>

                        <label class="me-3">

                            <c:choose>

                                <c:when test="${available == true}">
                                    Available
                                </c:when>

                                <c:otherwise>
                                    Not Available
                                </c:otherwise>

                            </c:choose>

                        </label>

                    </c:forEach>

                </div>

            </div>


            <!-- Submit -->
            <div class="text-center">

                <button type="submit"
                        class="btn btn-primary">
                    Register Gin
                </button>

                <a href="${pageContext.request.contextPath}/gin/showAll">
                    Show All
                </a>

            </div>

        </form>

    </div>

</div>

</body>
</html>