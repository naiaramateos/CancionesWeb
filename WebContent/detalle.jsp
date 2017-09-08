<%@page import="com.ipartek.formacion.canciones.pojo.Cancion"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Detalle de la canción</title>
</head>
<body>
	<h1>
		Detalle de la Canción:<br>
	</h1>

	<%
		String mensaje = (String) request.getAttribute("mensaje");
		Cancion c = (Cancion) request.getAttribute("cancion");
	%>

	Nombre:
	<%=c.getNombre()%><br> Artista:
	<%=c.getArtista()%><br> Duracion:
	<%=c.getDuracion()%><br> Resultado:
	<%=mensaje%><br>





</body>
</html>