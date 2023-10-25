<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.TblProductocl2" %>
<%@page import="java.util.*" %>
<link href="css/estilos.css" type="text/css" rel="stylesheet">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar producto</title>
</head>
<body>
<h1 align="center">Registrar Producto</h1>
<form action="ServletProducto" method="post">

<table align="center">
<tr>
<td>Nombre del Producto</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>Precio de Venta</td>
<td><input type="text" name="venta"></td>
</tr>
<tr>
<td>Precio de Compra</td>
<td><input type="text" name="Compra"></td>
</tr>
<tr>
<td>Estado del Producto</td>
<td>
<select name="estado">
	<option>Vigente</option>
	<option>Agotado</option>
</select>
</td>
</tr>
<tr>
<td>Descripcion del Producto</td>
<td><input type="text" name="descripcion"></td>
</tr>
<tr>
<td colspan="3" ></td>
<td align="center"><input type="submit" name="Registra Producto" value="Registrar">
</td>
</tr>
</table>
</form>
<!--  <td><input type="submit" name="Registra Producto"></td>-->

<h1 align="center">Listado de Productos</h1>
<table align="center" border="3">
<tr>
<th>Codigo de Producto</th>
<th>Nombre de Producto</th>
<th>Precio de Venta</th>
<th>Precio de Compra</th>
<th>Estado de Producto</th>
<th>Descripcion de Producto</th>

<%
List<TblProductocl2> Listadoproducto=(List<TblProductocl2>)request.getAttribute("listado");
if(Listadoproducto!=null){
	for(TblProductocl2 lis:Listadoproducto){
%>	
<tr>
<td>
<%=lis.getIdproductocl2() %>
</td>
<td>
<%=lis.getNombrecl2() %>
</td>
<td>
<%=lis.getPrecioventacl2() %>
</td>
<td>
<%=lis.getDescripcl2() %>
</td>
<td>
<%=lis.getEstadocl2() %>
</td>
<td>
<%=lis.	getDescripcl2()  %>
</td>
</tr>
<% 

	}
}
%>
</table>
</body>
</html>