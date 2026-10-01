<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Movie</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body style="background-image: url('${pageContext.request.contextPath}/images/movie.jpeg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            min-height: 100vh;">

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-8">

            <div class="card shadow border-0">

                <div class="card-header bg-dark text-white text-center py-3">
                    <h2 class="mb-0">Movie Details</h2>
                </div>

                <div class="card-body p-4">

                    <form action="movie" method="post">

                        <div class="row">

                            <div class="col-md-6 mb-3">
                                <label class="form-label">
                                    Movie Name
                                </label>

                                <input type="text"
                                       name="movieName"
                                       class="form-control"
                                       placeholder="Enter movie name">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label class="form-label">
                                    Hero Name
                                </label>

                                <input type="text"
                                       name="heroName"
                                       class="form-control"
                                       placeholder="Enter hero name">
                            </div>

                            <div class="col-md-6 mb-3">
                                <label class="form-label">
                                    Director
                                </label>

                                <input type="text"
                                       name="director"
                                       class="form-control"
                                       placeholder="Enter director name">
                            </div>

                           <div class="col-md-6 mb-3">
                               <label class="form-label">
                                   Language
                               </label>

                               <select name="language" class="form-select">

                                   <option value=""> --Select Language --  </option>

                                   <c:forEach items="${languages}" var="language">
                                       <option value="${language}"> ${language}
                                       </option>
                                   </c:forEach>

                               </select>
                           </div>

                        <div class="text-center mt-3">

                            <button type="submit"
                                    class="btn btn-dark px-5">
                                Submit
                            </button>

                            <button type="reset"
                                    class="btn btn-outline-secondary px-5 ms-2">
                                Reset
                            </button>

                        </div>

                    </form>
                     <!-- Validation Errors -->
                                <c:if test="${not empty validationErrors}">

                                        <div class="mt-3">

                                             <c:forEach items="${validationErrors}"  var="objectError">
                                                      <p class="text-danger mb-1">
                                                           ${objectError.defaultMessage}  </p>
                                               </c:forEach>

                                             </div>

                                       </c:if>

                    <div class="alert alert-success mt-3">
                        ${message}
                    </div>
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