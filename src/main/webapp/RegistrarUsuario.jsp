<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Vent. Usuario</title>
</head>
<body>
<h2 align="center">Ingresar al Sistema</h2>
<form action="ServletUsuario" method="post">
<table align="center" border="1">
       <tr>
       <td>Usuario</td>
       <td><input type="text" name="usuario"></td>
       </tr>
       
       <tr>
       <td>Contraseña</td>
       <td><input type="password" name="contraseña"></td>
       </tr>
    
 
   		<tr align="center">
		<td colspan="3">
      
         <button type="submit">Registrar Usuario</button>
		</td>
		</tr>
</table>




</form>
</body>
</html>
