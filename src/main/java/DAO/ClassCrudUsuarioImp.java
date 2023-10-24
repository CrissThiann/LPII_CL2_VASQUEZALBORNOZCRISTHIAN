package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuarioable;
import model.TblUsuariocl2;

public class ClassCrudUsuarioImp implements IUsuarioable {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tblusuario) {
		
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory use=Persistence.createEntityManagerFactory("LPII_CL2_VASQUEZALBORNOZCRISTHIAN");
		//permite gestionar entidades..
		EntityManager eman=use.createEntityManager();
		//iniciar transaccion...
		eman.getTransaction().begin();
		//registramos
		eman.persist(tblusuario);
		//confirmamos
		eman.getTransaction().commit();
	   //cerramos la transaccion...
		eman.close();
		
	}

}
