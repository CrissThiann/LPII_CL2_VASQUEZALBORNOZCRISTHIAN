package TestEntidades;

import java.util.List;


import model.TblProductocl2;
import DAO.ClassCrudProductoImp;

public class TestProductocl2 {

	public static void main(String[] args) {
		
		TblProductocl2 procl2 = new TblProductocl2();
		ClassCrudProductoImp crudcl2 = new ClassCrudProductoImp();
		
		/*//Registrar
		
		procl2.setNombrecl2("Zucarita");
		procl2.setPrecioventacl2(3.60);
		procl2.setPreciocompcl2(2.60);
		procl2.setEstadocl2("Vigente");
		procl2.setDescripcl2("la mas rica");
		
		crudcl2.RegistrarProducto(procl2);*/
		
		//Listar
		List<TblProductocl2> listar = crudcl2.ListaProducto();
		  for(TblProductocl2 lista:listar) {
			  System.out.print("\n" + 
                      "Codigo : " + lista.getIdproductocl2() + "\n" + 
					   "Nombre : " + lista.getNombrecl2() + "\n" + 
                       "Precio Venta : " + lista.getPrecioventacl2() + "\n" +
					   "Precio Compra : " + lista.getPreciocompcl2() + "\n" +
                       "Estado : " + lista.getEstadocl2() + "\n" +
					   "Descripcion : " + lista.getDescripcl2() + "\n" + "\n");
		  };
		  
				
		  

	}

}
