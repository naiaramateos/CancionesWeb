package com.ipartek.formacion.canciones.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.canciones.pojo.*;

/**
 * Servlet implementation class ListarController
 */
@WebServlet("/listar")
public class ListarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// crear array de 2 canciones

		ArrayList<Cancion> canciones = new ArrayList<>();
		canciones.add(new Cancion("Smells like teen spirit", "Nirvana", "4:37"));
		canciones.add(new Cancion("Come as you are", "Nirvana", "4:37"));
		canciones.add(new Cancion("Lithium", "Nirvana", "4:37"));

		// pasar atributo listado en la request para la JSP
		request.setAttribute("listado", canciones);

		// ir a listar.jsp
		RequestDispatcher dispatch = request.getRequestDispatcher("listado.jsp");
		dispatch.forward(request, response);

	}

}
