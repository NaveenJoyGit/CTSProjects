	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device=width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
	
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
		crossorigin="anonymous">
	
	<title>Movie-list-customer-notification</title>
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
		<!------------End of header------------>
		<section>
			<div class="main-heading">
				<p class="display-5">Movies</p>
			</div>
			<div class="container">
				<table class="table">
					<tr>
						<th id="title">Title</th>
						<th id="box-office">Box Office</th>
						<th id="genre">Genre</th>
						<th id="has-teaser">Has Teaser</th>
					</tr>
					<c:forEach items="${movieList}" var="movie">
						<tr>
							<td><label for="title">${movie.name}</label></td>
							<td><label for="box-office">$${movie.boxOffice}</label></td>
							<td><label for="genre">${movie.genre}</label></td>
							<td><label for="has-teaser">${movie.hasTeaser}</label></td>
						</tr>
					</c:forEach>
				</table>
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