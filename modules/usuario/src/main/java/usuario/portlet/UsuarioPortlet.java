package usuario.portlet;

import usuario.constants.UsuarioPortletKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.sinensia.model.Usuario;
import com.sinensia.utilities.UsuarioSingleton;

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
			throws IOException, PortletException, PortalException {

		String nombre = ParamUtil.getString(actionRequest, "nombre");
		String apellido = ParamUtil.getString(actionRequest, "apellido");
		String dni = ParamUtil.getString(actionRequest, "dni");
		String idUsuario= ParamUtil.getString(actionRequest, "idUsuario");
		
		System.out.println("User name is " +  nombre + " and surname is " + apellido +
	            ", dni " + dni );


		if(dni.contentEquals("87537894b")) {
			SessionErrors.add(actionRequest, "error");			
		}
		SessionMessages.add(actionRequest, "success");
		
		//Creamos un nuevo usuario
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setDni(dni);
		usuario.setIdUsuario(idUsuario);
		
		//añadimos a la array list
		UsuarioSingleton.getInstance().addToArray(usuario);
		
		//redireccionamos a insertar usuario
		actionResponse.getRenderParameters().setValue("jspPage", "/insertarUsuario.jsp");
	}
	
	@ProcessAction(name = "eliminarUsuario")
	public void eliminarUsuario (ActionRequest actionRequest, ActionResponse actionResponse) 
			throws IOException, PortletException, PortalException {

		
		int index = Integer.valueOf(ParamUtil.getString(actionRequest, "numero"));
		UsuarioSingleton.getInstance().getLista().remove(index);
		
		//redireccionamos 
		actionResponse.getRenderParameters().setValue("jspPage", "/mostrarUsuario.jsp");
	}

} 