<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solicitud</title>
<link href="vendor/bulma/css/bulma.min.css" rel="stylesheet">
</head>
<body>
	<header>
		<nav class="navbar has-background-primary" role="navigation"
			aria-label="main navigation">
			<div class="navbar-brand">
				<a class="navbar-item" href="index.jsp"> <img src="img/fff.png">
				</a> <a role="button" class="navbar-burger" aria-label="menu"
					aria-expanded="false" data-target="navbarbasicExample"> <span
					aria-hidden="true"> </span> <span aria-hidden="true"> </span> <span
					aria-hidden="true"></span>
				</a>
			</div>
			<div id="navbarBasicExample" class="navbar-menu">
				<div class="navbar-start">
					<a class="navbar-item" href="AgregarSolicitudController.do">
						Ingresar Solicitud </a> <a class="navbar-item"
						href="VerSolicitudController.do"> Ver solicitudes</a>
				</div>
			</div>
		</nav>
	</header>
</body>
</html>