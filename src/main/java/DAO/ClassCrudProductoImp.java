package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoable;
import model.TblProductocl2;

public class ClassCrudProductoImp implements IProductoable{

	@Override
	public void RegistrarProducto(TblProductocl2 tblproducto) {
		
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory pro=Persistence.createEntityManagerFactory("LPII_CL2_VASQUEZALBORNOZCRISTHIAN");
		//permite gestionar entidades..
		EntityManager eman=pro.createEntityManager();
		//iniciar transaccion...
		eman.getTransaction().begin();
		//registramos
		eman.persist(tblproducto);
		//confirmamos
		eman.getTransaction().commit();
		//cerramos la transaccion...
		eman.close();
	}

	@Override
	public List<TblProductocl2> ListaProducto() {
		//establecemo conexion con la unidad de persistencia...
				EntityManagerFactory pro=Persistence.createEntityManagerFactory("LPII_CL2_VASQUEZALBORNOZCRISTHIAN");
				//permite gestionar entidades..
				EntityManager eman=pro.createEntityManager();
				//iniciar transaccion...
				eman.getTransaction().begin();
				List<TblProductocl2> listado=eman.createQuery("select pro from TblProductocl2 pro",TblProductocl2.class).getResultList();
				//retornamos el listado
				return listado;
			}  //fin del metodo listado documentos..
	

}
