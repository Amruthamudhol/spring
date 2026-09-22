<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            width: 400px;
            margin: 50px auto;
            padding: 25px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-top: 15px;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Register</h2>

    <form action="register" method="post">

        <label>First Name</label>
        <input type="text" name="firstName"
               placeholder="Enter First Name">

        <label>Last Name</label>
        <input type="text" name="lastName"
               placeholder="Enter Last Name">

        <label>Mobile Number</label>
        <input type="text" name="mobileNumber"
               placeholder="Enter Mobile Number">

        <label>Email</label>
        <input type="email" name="email"
               placeholder="Enter Email">

        <button type="submit">Register</button>

    </form>

</div>
<div class="text-center mt-4 mb-4">
    <a href="index.jsp" class="btn btn-outline-primary">
        Go Back to Home
    </a>
</div>
</body>
</html>