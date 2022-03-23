<%@ include file="/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@page import="com.sinensia.utilities.UsuarioSingleton"%>
<%@page import="com.sinensia.model.Usuario"%>

<p>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Apellidos</th>
		      <th scope="col">DNI</th> 
		      <th scope="col">IdUsuario</th>
		      <th scope="col">delete</th> 
		    </tr>
		  </thead>
			<c:forEach items="<%= UsuarioSingleton.getInstance().getLista() %>" var="usuario" varStatus="estado"> 
				<tr> 
				  	<td>${ usuario.nombre }</td>
				  	<td>${ usuario.apellido }</td>
				  	<td>${ usuario.dni }</td>
				  	<td>${ usuario.idUsuario }</td>
				  	<td>
				  		<aui:input type="hidden" name="numero" value="${estado.index}"></aui:input>	
				  		<button type="submit" data-bs-target="#Eliminar${usuario.idUsuario}" class="btn btn-sm btn-danger" name="action" value="Eliminar" >Eliminar</button>
				  			  	
				  	</td>
			  	</tr>
			  	
			</c:forEach>   
		</table>
		
</p>