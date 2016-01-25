<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
 
<html>
<body>
 
I am feeling: ${ mood.feeling }.
Click <a href="explanation/${mood.feeling}">here</a> to find explanation.
</body>
</html>