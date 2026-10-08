<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>

    <title>Vodka Registration</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

</head>

<body>

<div class="container mt-5">

    <div class="card shadow p-4">

        <h2 class="text-center mb-4">
            Vodka Registration
        </h2>


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


        <form action="${pageContext.request.contextPath}/vodka"
              method="post">


            <!-- Company Name -->

            <div class="mb-3">

                <label class="form-label">
                    Company Name
                </label>

                <input type="text"
                       name="companyName"
                       class="form-control"
                       placeholder="Enter company name"
                       value="${vodkaDTO.companyName}">

            </div>


            <!-- Brand Name -->

            <div class="mb-3">

                <label class="form-label">
                    Brand Name
                </label>

                <input type="text"
                       name="brandName"
                       class="form-control"
                       placeholder="Enter brand name"
                       value="${vodkaDTO.brandName}">

            </div>


            <!-- Vodka Type -->

            <div class="mb-3">

                <label class="form-label">
                    Vodka Type
                </label>

                <select name="vodkaType"
                        class="form-select">

                    <option value="">
                        Select Vodka Type
                    </option>

                    <c:forEach items="${vodkaTypes}"
                               var="type">

                        <option value="${type}"
                            ${vodkaDTO.vodkaType == type ? 'selected' : ''}>

                            ${type}

                        </option>

                    </c:forEach>

                </select>

            </div>


            <!-- Manufacturing Date -->

            <div class="mb-3">

                <label class="form-label">
                    Manufacturing Date
                </label>

                <input type="date"
                       name="manfDate"
                       class="form-control"
                       value="${vodkaDTO.manfDate}">

            </div>


            <!-- Price -->

            <div class="mb-3">

                <label class="form-label">
                    Price
                </label>

                <input type="number"
                       name="price"
                       class="form-control"
                       placeholder="Enter price"
                       value="${vodkaDTO.price}">

            </div>


            <!-- Bottle Size -->

            <div class="mb-3">

                <label class="form-label">
                    Bottle Size
                </label>

                <select name="bottleSize"
                        class="form-select">

                    <option value="">
                        Select Bottle Size
                    </option>

                    <c:forEach items="${bottleSizes}"
                               var="size">

                        <option value="${size}"
                            ${vodkaDTO.bottleSize == size ? 'selected' : ''}>

                            ${size}

                        </option>

                    </c:forEach>

                </select>

            </div>


            <!-- Country -->

            <div class="mb-3">

                <label class="form-label">
                    Country
                </label>

                <select name="country"
                        class="form-select">

                    <option value="">
                        Select Country
                    </option>

                    <c:forEach items="${countries}"
                               var="country">

                        <option value="${country}"
                            ${vodkaDTO.country == country ? 'selected' : ''}>

                            ${country}

                        </option>

                    </c:forEach>

                </select>

            </div>


            <!-- Quality -->

            <div class="mb-3">

                <label class="form-label">
                    Quality
                </label>

                <div>

                    <c:forEach items="${qualities}"
                               var="quality">

                        <input type="radio"
                               name="quality"
                               value="${quality}"
                               ${vodkaDTO.quality == quality ? 'checked' : ''}>

                        <label class="me-3">
                            ${quality}
                        </label>

                    </c:forEach>

                </div>

            </div>


            <!-- Availability -->

            <div class="mb-3">

                <label class="form-label">
                    Availability
                </label>

                <div>

                    <c:forEach items="${availability}"
                               var="available">

                        <input type="radio"
                               name="availability"
                               value="${available}"
                               ${vodkaDTO.availability == available ? 'checked' : ''}>

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

                    Register Vodka

                </button>

            </div>

        </form>

    </div>

</div>

</body>
</html>