package com.nowe.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SObtenerCookie
 */
@WebServlet("/sobtenercookie")
public class SObtenerCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SObtenerCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Como viene de un enlace es aquí en el get
		// Recoger Cookies
		// 1. Declarar un array de cookies
		Cookie[] misCookies = request.getCookies();
		// 2. Verificar si ese array de cookies contiene cookies
		if (misCookies != null) {
			for (Cookie c : misCookies) {
				System.out.println("Entra y su valor es: " + c.getName());
				if (c.getName().equals("clave")) {
					System.out.println("El valor de la cookie es -> " + c.getValue());
					break;
				}
				
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
