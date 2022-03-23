<%@ include file="/init.jsp" %>

<p>

  	
	<div style="position:relative; margin: 30px 0 0 0;">
		            <aui:input name="nombre" type="text" label="Nombre" style="background: white" placeholder="<%=renderRequest.getParameter("nombre")%>" readonly="true">
		            </aui:input>
			    	<aui:input name="apellido" type="text" label="Apellido" style="background: white" placeholder="<%=renderRequest.getParameter("apellido")%>" readonly="true">
		            </aui:input>
			    	<aui:input name="dni" type="text" label="Dni" style="background: white" placeholder="<%=renderRequest.getParameter("dni")%>" readonly="true">
		            </aui:input>
		            <aui:input name="idUsaurio" type="text" label="idUsuario" style="background: white" placeholder="<%=renderRequest.getParameter("isUsuario")%>" readonly="true">
		            </aui:input>
			    	
	</div>
	
	
</p>