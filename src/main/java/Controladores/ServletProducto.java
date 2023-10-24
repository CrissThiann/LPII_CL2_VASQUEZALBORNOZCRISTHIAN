package Controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClassCrudProductoImp;

import model.TblProductocl2;


/**
 * Servlet implementation class ServletProducto
 */
public class ServletProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		TblProductocl2 prod = new TblProductocl2();
		ClassCrudProductoImp crudpro = new ClassCrudProductoImp();
		
		String nombre=request.getParameter("nombre");
		Double precioVen=Double.parseDouble(request.getParameter("venta"));
		Double precioComp=Double.parseDouble(request.getParameter("Compra"));
		String estado=request.getParameter("estado");
		String descripci=request.getParameter("descripcion");
				
		
				
		prod.setNombrecl2(nombre);
		prod.setPrecioventacl2(precioVen);
		prod.setPreciocompcl2(precioComp);
		prod.setEstadocl2(estado);
		prod.setDescripcl2(descripci);
				
		crudpro.RegistrarProducto(prod);
		
		List<TblProductocl2> listarproducto=crudpro.ListaProducto();
		request.setAttribute("listado", listarproducto);
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);

	}

}
