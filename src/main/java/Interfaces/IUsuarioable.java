package Interfaces;

import model.TblUsuariocl2;

public interface IUsuarioable {
     
	public void RegistrarUsuario(TblUsuariocl2 tblusuario);
	public boolean ValidarUsuario(String usuario, String password);
}
