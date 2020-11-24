<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Confirmacion Registro Alumno</title>
	</head>
	
	<body>
		
		El alumno con nombre <strong>${elAlumno.nombre}</strong>,apellido <strong>${elAlumno.apellido}</strong>y C&oacute;digo Postal <strong>${elAlumno.codigoPostal}</strong> de <strong>${elAlumno.edad}</strong> a&ntilde;os y email <strong>${elAlumno.email}</strong>  se ha registrado correctamente<br>
		La asignatura escogida es <strong>${elAlumno.asignaturaOptativa}</strong><br>
		La ciudad de estudios es <strong>${elAlumno.ciudadEstudios}</strong><br>
		Los deportes escogidos por el alumno son <strong>${elAlumno.deportes}</strong>
	</body>
</html>