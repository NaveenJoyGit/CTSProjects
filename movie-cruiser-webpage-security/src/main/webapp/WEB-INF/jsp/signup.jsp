<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device=width, initial-scale=1.0">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style.css">
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
			<p class="display-5">Signup</p>
			<form action="movie-list-customer">
				<div class="col-auto">
					<div>
						<label for="username" id="username" class="labels">Username</label>
						<input type="text" name="username" id="username"
							placeholder="Enter Username" class="form-control">
					</div>
				</div>
				<div class="col-auto">
					<div>
						<label for="fname" class="form-label">First Name</label> <input
							type="text" name="fname" id="fname"
							placeholder="Enter First Name" class="form-control">
					</div>
					<div>
						<label for="lname" class="form-label">Last Name</label> <input
							type="text" name="lname" id="lname" placeholder="Enter Last Name"
							class="form-control">
					</div>
				</div class="col-auto">
				<div class="name">
					<div>
						<label for="password" class="form-label">Password</label> <input
							type="password" name="password" id="password"
							placeholder="Enter Password" class="form-control">
					</div>
					<div>
						<label for="confirm-pass" class="form-label">Confirm
							Password</label> <input type="password" name="confirm-pass"
							id="confirm-pass" placeholder="Enter Password"
							class="form-control">
					</div>
				</div>
				<div class="col-auto">
					<button type="submit" signup" class="btn btn-primary mb-3">Signup</button>
				</div>
			</form>
		</div>
	</section>

	<footer>
		<p class="h6">Copyright 2020</p>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>
</html>