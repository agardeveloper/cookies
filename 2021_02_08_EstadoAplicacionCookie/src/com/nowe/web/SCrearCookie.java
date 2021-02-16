package com.nowe.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SCrearCookie
 */
@WebServlet("/screarcookie")
public class SCrearCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SCrearCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Instanciar una cookie
		Cookie ck = new Cookie("clave", "clienteggp"); //es clave valor, el valor es cliente ggp
		// 2. Tiempo de vida de una cookie
		ck.setMaxAge(3*24*60*60);//Queremos 3 días (3*24 horas*60minutos*60segundos)
		// 3. Añadirlo a la repsuesta
		response.addCookie(ck);
		response.sendRedirect("index.jsp");
		
		
	}

}
