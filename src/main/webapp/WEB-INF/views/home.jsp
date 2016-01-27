<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<h2>I am feeling: ${ mood.feeling }.</h2>
<p> 
Click <a href="explanation/${mood.feeling}">here</a> to find explanation.
