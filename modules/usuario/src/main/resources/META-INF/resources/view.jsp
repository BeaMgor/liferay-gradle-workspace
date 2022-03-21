<%@ include file="/init.jsp" %>

<p>	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">Usuario</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
	    <div class="navbar-nav">
	      <a class="nav-item nav-link active" href="#">Agregar <span class="sr-only">(current)</span></a>
	      <a class="nav-item nav-link" href="#">Show</a>
	    </div>
	  </div>
	</nav>
	
	<portlet:actionURL name="agregarUsuario" var="agregarUsuario"></portlet:actionURL>
		
		
</p>