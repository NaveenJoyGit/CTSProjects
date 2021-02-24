<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device=width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<title>Edit movie</title>
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
						aria-current="page" href="movie-list-admin">Movies</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!------------End of header------------>
	<section>
		<div>
			<p class="display-5">Edit Movie</p>
			<form method="post" name="edit-submit" action="edit-movie-status"
				class="edit-movie-container" onsubmit="return editMovieValidate()">
				<div class="mb-3">
					<label for="title" class="form-label">Title</label> <input type="text" name="title"
						id="title" class="form-control" value="${editMovie.name}"> <label for="id" class="form-label">ID</label>
					<input type="text" name="id" id="title" class="form-control" value="${editMovie.id}">
				</div>
				<div class="mb-3">
					<div class="second-row-elements">
						<label for="gross" class="form-label">Gross ($)</label> <input type="text" id="gross"
							name="gross" class="form-control" value="${editMovie.boxOffice}">
					</div>
					<div class="second-row-elements">
						<label for="active" class="form-label">Active</label>
						<div id="active">
							<label for="yes" class="form-label">Yes</label> <input type="radio" id="yes" >
							<label for="no" class="form-label">No</label> <input type="radio" id="no" >
						</div>
					</div>
					<div class="second-row-elements">
						<label for="dol" class="form-label">Date of Launch</label> <input type="date"
							id="dol" name="dol" class="form-control" value="${editMovie.date}">
					</div>
					<div class="second-row-elements">
						<label for="genre" class="form-label">Genre</label> <select name="genre" id="genre">
							<option value="${editMovie.genre}">${editMovie.genre}</option>
							<option value="Science Fiction">Science Fiction</option>
							<option value="Romance">Romance</option>
							<option value="Comedy">Comedy</option>
							<option value="Adventure">Adventure</option>
							<option value="Thriller">Thriller</option>
						</select>
					</div>
				</div>
				<div class="mb-3">
					<div>
						<label for="has-teaser" class="form-label">Has Teaser</label> <input type="checkbox"
							id="has-teaser" >
					</div>
				</div>
				<div class="mb-3">
					<input type="submit" id="save" class="save-button">
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