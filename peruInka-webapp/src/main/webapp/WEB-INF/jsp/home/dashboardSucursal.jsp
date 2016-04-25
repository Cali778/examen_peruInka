<%@ page import="org.springframework.web.util.UrlPathHelper"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

bienvenido a la cadena de hotel peruInka

<br>
<a href="frmSucursal">Sucursal</a>
<br>

<display:table name="${listSucursal}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombres" property="name" />
	<display:column title="Apellido Paterno" property="ApPaterno" />
	<display:column title="Apellido Materno" property="ApMaterno" />
	<display:column title="Telefono" property="telefono" />
	<display:column title="Estado" property="status" />
	<display:column title="OPC">
		<a href="editSucursalXD?id_=${item.id}">Modificar</a>
		<a href="deleteSucursalXD?id_=${item.id}">Eliminar</a>
	</display:column>
	
	
</display:table>