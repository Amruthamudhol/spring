<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cricket Team</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-6">

            <div class="card shadow">

                <div class="card-header bg-primary text-white text-center">
                    <h2>Cricket Team</h2>
                </div>

                <div class="card-body">

                    <form action="cricketTeam" method="post">

                        <div class="mb-3">
                            <label class="form-label">Player Name:</label>
                            <input type="text"
                                   name="playerName"
                                   class="form-control"
                                   placeholder="Enter player name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Age:</label>
                            <input type="text"
                                   name="age"
                                   class="form-control"
                                   placeholder="Enter age">
                        </div>

                        <div class="mb-3">

                            <label class="form-label">Role:</label>

                            <div class="form-check">
                                <input class="form-check-input"
                                       type="radio"
                                       name="role"
                                       value="Batsman">

                                <label class="form-check-label">
                                    Batsman
                                </label>
                            </div>

                            <div class="form-check">
                                <input class="form-check-input"
                                       type="radio"
                                       name="role"
                                       value="Bowler">

                                <label class="form-check-label">
                                    Bowler
                                </label>
                            </div>

                            <div class="form-check">
                                <input class="form-check-input"
                                       type="radio"
                                       name="role"
                                       value="All Rounder">

                                <label class="form-check-label">
                                    All Rounder
                                </label>
                            </div>

                            <div class="form-check">
                                <input class="form-check-input"
                                       type="radio"
                                       name="role"
                                       value="Wicket Keeper">

                                <label class="form-check-label">
                                    Wicket Keeper
                                </label>
                            </div>

                        </div>

                        <div class="d-grid">
                            <button type="submit"
                                    class="btn btn-primary">
                                Submit
                            </button>
                        </div>

                    </form>

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