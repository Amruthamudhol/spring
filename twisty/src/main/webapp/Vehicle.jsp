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

                <div class="card-header bg-primary text-white text-center">
                    <h3>Vehicle Registration</h3>
                </div>

                <div class="card-body">

                    <form action="vehicle" method="post">
                      <div class="alert alert-success mt-3">  ${message}  </div>
                        <!-- Vehicle Number -->
                        <div class="mb-3">
                            <label class="form-label">Vehicle Number</label>
                            <input type="text"
                                   name="vehicleNumber"
                                   class="form-control"
                                   placeholder="Enter vehicle number" required
                                   value="${vehicleDTO.vehicleNumber}"/>
                        </div>

                        <!-- Vehicle Model -->
                        <div class="mb-3">
                            <label class="form-label">Vehicle Model</label>
                            <input type="text"
                                   name="vehicleModel"
                                   class="form-control"
                                   placeholder="Enter vehicle model"
                                   required
                                   value="${vehicleDTO.vehicleModel}"/>
                        </div>

                        <!-- Vehicle Brand -->
                        <div class="mb-3">
                            <label class="form-label">Vehicle Brand</label>
                            <input type="text"
                                   name="vehicleBrand"
                                   class="form-control"
                                   placeholder="Enter vehicle brand"
                                   required
                                   value="${vehicleDTO.vehicleBrand}"/>
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
                                   required
                                   value="${vehicleDTO.rentalAmount}"/>
                        </div>

                        <!-- Availability -->
                        <div class="mb-3">
                            <label class="form-label">Availability</label>

                            <select name="availability" class="form-select" required>
                                <option value="">Select Availability</option>
                                <option value="true">Available</option>
                                <option value="false">Not Available</option>
                            </select>

                        </div>

                        <!-- Submit -->
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">
                                Register Vehicle
                            </button>
                        </div>

                    </form>

                    <c:forEach items="${validationErrors}" var="objectError">
                     <p class="text-danger">${objectError.defaultMessage}</p>
                    </c:forEach>


                </div>
            </div>

        </div>

    </div>

</div>

</body>
</html>