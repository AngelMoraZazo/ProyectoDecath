<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Formulario de registro</title>
	</head>
	<body>
	
		<form:form action="procesarFormulario" modelAttribute="elAlumno">
		
			Nombre: <form:input path="nombre"/>
			<form:errors path="nombre" style="color:red;font-weight:bold"/>
			<br><br><br>
			Apellido: <form:input  path="apellido"/>
			<br><br><br>
			Email: <form:input path="email"/>
			<form:errors path="email" style="color:red;font-weight:bold"/>
			<br><br><br>
			Edad: <form:input path="edad"/>
			<form:errors path="edad" style="color:red;font-weight:bold"/>
			<br><br><br>
			
			C.P.: <form:input path="codigoPostal"/>
			<form:errors path="codigoPostal" style="color:red;font-weight:bold"/>
			<br><br><br>
			
			Asignaturas optativas: <br>
			
			<form:select path="asignaturaOptativa" multiple="true">
				<form:option value="Ingles" label="Ingles"/>
				<form:option value="Frances" label="Frances"/>
				<form:option value="Italiano" label="Italiano"/>
				<form:option value="Aleman" label="Aleman"/>
			</form:select>
			
			<br><br><br>
			
				Barcelona <form:radiobutton path="ciudadEstudios" value="Barcelona"/>
				Valencia <form:radiobutton path="ciudadEstudios" value="Valencia"/>
				Sevilla <form:radiobutton path="ciudadEstudios" value="Sevilla"/>
				Santander <form:radiobutton path="ciudadEstudios" value="Santander"/>

			<br><br><br>
				
				Futbol <form:checkbox path="deportes" value="Futbol"/>
				Baloncesto <form:checkbox path="deportes" value="Baloncesto"/>
				Hockey <form:checkbox path="deportes" value="Hockey"/>
				Hipica <form:checkbox path="deportes" value="Hipica"/>
				
			
			
			<br><br><br>
			<input type="submit" value="Enviar">
		</form:form>
	
	</body>
</html>