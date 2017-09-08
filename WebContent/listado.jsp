<%@page import="com.ipartek.formacion.canciones.pojo.Cancion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Listado de canciones</title>
</head>
<body>
	LISTADO DE CANCIONES
	<br>---------------------------------------------
	<br>
	<br>


	<%
		ArrayList<Cancion> canciones = (ArrayList<Cancion>) request.getAttribute("listado");

		for (int i = 0; i < canciones.size(); i++) {
	%>


	Canción
	<%=i + 1%><br> Título:
	<%=canciones.get(i).getNombre()%><br> Artista:
	<%=canciones.get(i).getArtista()%><br> Duración:
	<%=canciones.get(i).getDuracion()%><br>
	<br>

	<%
		}
	%>
	
	<h2>Crear canción</h2>
	
	<form action="crear" method="post">
	Nombre: <input type="text" name="nombre" placeholder="Escribe el nombre de la canción" required="required"><br>
	Artista: <input type="text" name="artista"><br>
	Duración: <input type="text" name="duracion"><br>
	<br>
	<input type="submit" value="Crear nueva canción">
	</form>

</body>
</html>