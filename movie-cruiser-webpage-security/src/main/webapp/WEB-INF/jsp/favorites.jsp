<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device=width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="style.css">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<title>Favourites</title>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand " href="#">Movie Cruiser</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="movie-list-customer">Movies</a></li>
					<li class="nav-item"><a class="nav-link active"
						href="favorites">Favorites</a></li>
					<li class="nav-item"></li>
					<li class="nav-item"><a class="nav-link active" href="#"><i class="bi bi-person-circle" style="color:white; padding:1vh"></i>  ${name}</a></li>
					<li class="nav-item"><a class="nav-link active"
						href="movie-list">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!------------End of header------------>
	<section>
		<div class="main-heading">
			<p>Movies</p>
		</div>
		<div class="container">
			<table class="table" id="favorite-table">
					<tr>
						<th id="title">Title</th>
						<th id="box-office">Box Office</th>
						<th id="genre">Genre</th>
						<th id="action"></th>
					</tr>
				<c:forEach items="${favList}" var="fav">
						<tr>
							<td><label for="title">${fav.name}</label></td>
							<td><label for="genre">${fav.genre}</label></td>
							<td><label for="action"><a
									href="favorites-notification?id=${fav.id}"
									class="btn btn-danger">Delete</a></label></td>
						</tr>
				</c:forEach>
			</table>
		</div>
	</section>
	<footer>
		<p class="h6">Copyright @ 2020</p>
	</footer>
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>
</html>