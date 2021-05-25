<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../template/header.jsp"></jsp:include>
<main class="container mt-6">
	<c:if test="${mensaje !=null }">
		<div class="colums is-centered mb-6">
			<div class="column is-6">
				<div class="notidication is-info">
					<p>${mensaje}</p>
				</div>
			</div>
		</div>
	</c:if>
	<c:if test="${errores != null }">
		<div class="colums is-centered mb-6">
			<div class="column is-6">
				<div class="notification is-danger">
					<h6>Existen errores en el formulario</h6>
					<div class="content">
						<ul>
							<c:forEach var="errores" items="${errores }">
								<li>${errores}</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</c:if>
	<div class="columns is-centered">
		<div class="column is-6">
			<form method="POST" action="AgregarSolicitudController.do">
				<div class="card">
					<div class="card-header has-background-primary">
						<span class="card-header-title">Agregar Solicitud</span>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label" for="rut-txt">Rut</label>
							<div class="control">
								<input type="text" name="rut-txt" id="rut-txt" class="input"
									placeholder="ingresar rut">
							</div>
						</div>
						<div class="field">
							<label class="label" for="nombre-txt">Nombre</label>
							<div class="control">
								<input type="text" name="nombre-txt" id="nombre-txt"
									class="input" placeholder="ingrese nombre y apellido">
							</div>
						</div>
						<div class="field">
							<label class="label" for="tipoSolicitud-select">Tipo de
								Solicitud</label>
							<div class="control">
								<div class="select">
									<select name="tipoSolicitud-select" id="tipoSolicitud-select">
										<option>Solicitud de Cédula de Identidad</option>
										<option>Retiro de Cédula de Identidad</option>
										<option>Solicitud de Certificado de Nacimiento</option>
										<option>Solicitud de certificado de Defuncion</option>
									</select>

								</div>
							</div>
						</div>
					</div>
					<div class="card-footer has-text-centered">
						<div class="card-footer-item">
							<button type="submit" class="button is-primary">Solicitar</button>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>

</main>
</body>
</html>

