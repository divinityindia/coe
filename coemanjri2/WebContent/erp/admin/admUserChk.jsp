<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test = "${sessionScope.cat == null||sessionScope.cat != 'admin'}">  	
            ${sessionScope.invalidate}
             <jsp:forward page="error.jsp"/>
        </c:if>
    </body>
</html>
