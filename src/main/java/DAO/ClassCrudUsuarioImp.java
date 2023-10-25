package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

	public boolean ValidarUsuario(String usuario, String password) {
		
		// TODO Auto-generated method stub
		EntityManagerFactory use=Persistence.createEntityManagerFactory("LPII_CL2_VASQUEZALBORNOZCRISTHIAN");
		EntityManager eman=use.createEntityManager();
		
		Query consulta=eman.createQuery("select u from TblUsuariocl2 u where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
				
		consulta.setParameter("x",usuario);
		consulta.setParameter("y",password);
		List<TblUsuariocl2> acceso=consulta.getResultList();
					
		return !acceso.isEmpty();
	}

	

}
