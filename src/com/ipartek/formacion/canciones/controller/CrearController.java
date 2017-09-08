package com.ipartek.formacion.canciones.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.canciones.pojo.Cancion;

/**
 * Servlet implementation class CrearController
 */
@WebServlet("/crear")
public class CrearController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// recoger PARAMETROS del formulario

		String nombre = request.getParameter("nombre");
		String artista = request.getParameter("artista");
		String duracion = request.getParameter("duracion");
		// crear cancion

		Cancion c = new Cancion(nombre, artista, duracion);

		// enviamos cancion como ATRIBUTO en la request
		
		request.setAttribute("cancion", c);
		request.setAttribute("mensaje", "Canción creada correctamente");

		// vamos a la vista
		RequestDispatcher dispatch = request.getRequestDispatcher("detalle.jsp");
		dispatch.forward(request, response);

	}

}
