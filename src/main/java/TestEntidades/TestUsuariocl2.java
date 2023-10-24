package TestEntidades;

import DAO.ClassCrudUsuarioImp;
import model.TblUsuariocl2;


public class TestUsuariocl2 {

	public static void main(String[] args) {
		
		//Registrar
		
	   TblUsuariocl2 usucl2 = new TblUsuariocl2();
	   ClassCrudUsuarioImp crudcl2us = new ClassCrudUsuarioImp();
	   
	   usucl2.setUsuariocl2("criss");
	   usucl2.setPasswordcl2("criss21");
	   
	   crudcl2us.RegistrarUsuario(usucl2);
	   
	  
	}

	

}
