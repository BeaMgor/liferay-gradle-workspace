package usuario.portlet;

import usuario.constants.UsuarioPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

/**
 * @author beatr
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.bea",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Usuario",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UsuarioPortletKeys.USUARIO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UsuarioPortlet extends MVCPortlet {
	
	@ProcessAction(name = "agregarUsuario")
	public void agregarUsuario (ActionRequest actionRequest, ActionResponse actionResponse) 
			throws IOException, PortletException {
		
		String nombre = ParamUtil.getString(actionRequest, "nombre");
		String apellido = ParamUtil.getString(actionRequest, "apellido");
		String dni = ParamUtil.getString(actionRequest, "dni");
		
		if(dni.contentEquals("87537894b")) {
			SessionErrors.add(actionRequest, "error");
			
		}
		SessionMessages.add(actionRequest, "success");
		actionRequest.setAttribute("nombre", nombre);
		actionRequest.setAttribute("apellido", apellido);
		actionRequest.setAttribute("dni", dni);
		actionResponse.getRenderParameters().setValue("jspPage", "/insertarUsuario.jsp");
	}
	
}