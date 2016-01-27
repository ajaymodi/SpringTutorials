<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
 
<h2>So you want to know why...</h2>
I am feeling ${ mood } because ${explanation}
<p>
<a href="<c:url value="/about"/>">want to know more?</a>
