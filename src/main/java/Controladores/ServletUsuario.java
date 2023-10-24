package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClassCrudUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorServlet
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/RegistrarUsuario.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String usuario=request.getParameter("usuario");
		String password=request.getParameter("password");
		
		TblUsuariocl2 user = new TblUsuariocl2();
		ClassCrudUsuarioImp cruduseser = new ClassCrudUsuarioImp();
		
		user.setUsuariocl2(usuario);
		user.setPasswordcl2(password);
		cruduseser.RegistrarUsuario(user);
		System.out.println("Datos registrados");
		request.getRequestDispatcher("/RegistrarUsuario.jsp").forward(request, response);

	}

}
