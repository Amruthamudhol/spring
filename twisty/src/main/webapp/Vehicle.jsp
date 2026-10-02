<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Vehicle Registration</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-6">

            <div class="card shadow">

                <!-- Header -->
                <div class="card-header bg-primary text-white text-center">
                    <h3>Vehicle Registration</h3>
                </div>

                <div class="card-body">

                    <!-- Success Message -->
                    <c:if test="${not empty message}">
                        <div class="alert alert-success">
                            ${message}
                        </div>
                    </c:if>

<body style="background-image: url('${pageContext.request.contextPath}/images/vehicle.jpeg');
             background-size: cover;
             background-position: center;
             background-repeat: no-repeat;
             min-height: 100vh;">

                    <!-- Vehicle Form -->
                    <form action="${pageContext.request.contextPath}/vehicle"  method="post">

                        <!-- Vehicle Number -->
                        <div class="mb-3">
                            <label class="form-label">Vehicle Number</label>

                            <input type="text"
                                   name="vehicleNumber"
                                   class="form-control"
                                   placeholder="Enter vehicle number"
                                   value="${vehicleDTO.vehicleNumber}"
                                   required>
                        </div>

                        <!-- Vehicle Model -->
                        <div class="mb-3">
                            <label class="form-label">Vehicle Model</label>

                            <input type="text"
                                   name="vehicleModel"
                                   class="form-control"
                                   placeholder="Enter vehicle model"
                                   value="${vehicleDTO.vehicleModel}"
                                   required>
                        </div>

                        <!-- Vehicle Brand -->
                        <div class="mb-3">
                            <label class="form-label">Vehicle Brand</label>

                            <input type="text"
                                   name="vehicleBrand"
                                   class="form-control"
                                   placeholder="Enter vehicle brand"
                                   value="${vehicleDTO.vehicleBrand}"
                                   required>
                        </div>

                        <!-- Rental Amount -->
                        <div class="mb-3">
                            <label class="form-label">Rental Amount</label>

                            <input type="number"
                                   name="rentalAmount"
                                   class="form-control"
                                   placeholder="Enter rental amount"
                                   min="1"
                                   step="0.01"
                                   value="${vehicleDTO.rentalAmount}"
                                   required>
                        </div>

                       <!-- Availability -->
                       <div class="mb-3">
                           <label class="form-label">Availability</label>

                           <select name="availability" class="form-select">
                               <c:forEach items="${availability}" var="available">
                                   <option ${available == vehicleDTO.availability ? 'selected' : '' } value="${available}">${available} </option>
                               </c:forEach>
                           </select>
                       </div>


                        <!-- Submit Button -->
                        <div class="text-center">
                            <button type="submit"
                                    class="btn btn-primary">
                                Register Vehicle
                            </button>
                        </div>

                    </form>

                    <!-- Validation Errors -->

                        <div class="mt-3">
                            <c:forEach items="${validationErrors}" var="objectError">
                                <p class="text-danger mb-1">
                                    ${objectError.defaultMessage}
                                </p>
                            </c:forEach>
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

</div>

</body>
</html>