<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device=width, initial-scale=1.0">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<script src="script.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Movie Cruiser</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse justify-content-end"
				id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="movie-list">Movies</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="login">Login</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="signup">Signup</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<section>
		<div class="container-fluid">
			<p class="display-5">Login</p>
			<div class="container-fluid">
				<form name="login-submit" id="form"
					onsubmit="return loginValidate()">
					<div id="login-error">Invalid Username/Password!</div>
					<div class="mb-3">
						<label for="username" id="username" class="form-label">Username</label>
						<input type="text" id="username" name="username"
							placeholder="Enter Username" class="form-control">
					</div>
					<div class="mb-3">
						<label for="pass-login" class="form-label">Password</label> <input
							type="password" id="pass-login" name="password"
							placeholder="Enter Password" class="form-control">
					</div>

					<div class="mb-3">
						<button type="submit" class="btn btn-primary mb-3">Login</button>
						<p>
							New here? <a href="signup">Sign up</a>
						</p>
						<p id="admin-login">
							Login as <a href="admin-login">Admin?</a>
						</p>
					</div>
				</form>
			</div>
	</section>
	<footer>
		<p class="h6">Copyright @ 2020</p>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>
</html>