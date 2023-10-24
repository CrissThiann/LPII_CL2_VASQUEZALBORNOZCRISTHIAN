package Interfaces;

import java.util.List;

import model.TblProductocl2;

public interface IProductoable {
	
	public void RegistrarProducto(TblProductocl2 tblproducto);
	public List<TblProductocl2>ListaProducto();

}
