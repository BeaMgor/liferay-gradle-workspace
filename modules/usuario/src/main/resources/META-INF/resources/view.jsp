<%@ include file="/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<p>	

	<portlet:actionURL name="agregarUsuario" var="agregarUsuario"></portlet:actionURL>
	<liferay-ui:success key="success" message="User saved successfully!"/>
	<liferay-ui:error key="error" message="Sorry, this User Id Card is already in database" />
	<div class="container">
		<aui:form action="<%= agregarUsuario %>" id="frmUser" name="<portlet:namespace />fm">	
		        <aui:fieldset>		
		            <aui:input name="nombre" type="text" label="Nombre" required="true" style="background: white" >
		            	<aui:validator name="maxLength">20</aui:validator>
		            </aui:input>
			    	<aui:input name="apellido" type="text" label="Apellido" required="true" style="background: white">
			    		<aui:validator name="maxLength">20</aui:validator>
		            </aui:input>
			    	<aui:input name="dni" type="text" label="Dni" required="true" style="background: white">
			    		<aui:validator name="maxLength">20</aui:validator>
		            </aui:input>
		            <aui:input name="idUsuario" type="text" label="idUsuario" required="true" style="background: white">
			    		<aui:validator name="maxLength">20</aui:validator>
		            </aui:input>
		
		        </aui:fieldset>
		        <aui:button-row>
		            <aui:button type="submit"></aui:button>
		            <aui:button type="reset" value="clear"/>
		        </aui:button-row>
		</aui:form>	
	</div>	
</p>