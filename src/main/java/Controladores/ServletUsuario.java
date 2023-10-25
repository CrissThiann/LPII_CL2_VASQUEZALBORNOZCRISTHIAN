package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClassCrudUsuarioImp;

/**
 * Servlet implementation class ServletUsuario
 */
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/Usuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			//doGet(request, response);
			ClassCrudUsuarioImp crudserus = new ClassCrudUsuarioImp();
			
			String usuario=request.getParameter("usuario");
			String password=request.getParameter("password");

			
			if(crudserus.ValidarUsuario(usuario, password)){
				request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
			}else{
				response.sendRedirect("/errordeingreso.jsp");
			}
			System.out.println("Bienvenido al sistema");
	}

}
