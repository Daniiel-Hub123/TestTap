package es.daniel.servletpruebas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistroUsuarios
 */
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter salida = response.getWriter();
		
		salida.println("<html><body>");
		
		salida.println("Nombre introducido " + request.getParameter("nombre"));
		
		salida.println("<br><br>");
		
		salida.println("Apellido introducido " + request.getParameter("apellido"));

		salida.println("<br><br>");
		
		salida.println("Telefono introducido " + request.getParameter("telf"));

		salida.println("<br><br>");
		
		salida.println("Correo introducido " + request.getParameter("correo"));
		
		salida.println("<br><br>");
		
		salida.println("Contraseņa introducida " + request.getParameter("pass"));
		
		salida.println("<br><br>");
		
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		
		PrintWriter salida = response.getWriter();
		
		salida.println("<html><body>");
		
		salida.println("Nombre introducido " + request.getParameter("nombre"));
		
		salida.println("<br><br>");
		
		salida.println("Apellido introducido " + request.getParameter("apellido"));
		
		salida.println("</body></html>");
		
	
	
	
	
	}

}
