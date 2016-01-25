<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <title><tiles:insertAttribute name="title" /></title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
</head>
<body>
    <tiles:importAttribute name="currentPage" scope="request" />
 
    <!-- Main -->
    <tiles:insertAttribute name="content" />
 
    <!-- Footer -->
    <div>
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>