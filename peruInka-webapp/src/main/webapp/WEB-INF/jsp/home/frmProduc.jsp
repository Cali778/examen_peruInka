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

formulario Sucursal : ${opc}<br>

<form:form commandName="producto" action="saveProducto" method="POST">

id: <form:input path="id" id="id"/><br>
nombre_producto: <form:input path="RazonSoci" id="RazonSoci"/><br>
precio: <form:input path="Precio" id="Precio"/><br>
Descripcion: <form:input path="Description" id="Description"/><br>
atributos: <form:input path="Atributo" id="Atributo"/><br>

<input type="text" name="opc" id="opc" value="${opc}"><br>

<button type="submit">Guardar</button>

</form:form>