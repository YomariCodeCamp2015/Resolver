<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>

<!DOCTYPE html>
<html lang="en">

<head>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="SMS Admin Panel" />
    <meta name="author" content="Ashim" />

    <title>SMS</title>

    <link rel="stylesheet" href="<c:url value="/css/font-icons/entypo/css/entypo.css" />" id="style-resource-1">
    <link rel="stylesheet" href="<c:url value="/css/b-min.css" />" id="style-resource-2">
    <link rel="stylesheet" href="<c:url value="/css/core-min.css" />" id="style-resource-3">
    <link rel="stylesheet" href="<c:url value="/css/theme-min.css" />" id="style-resource-4">
    <link rel="stylesheet" href="<c:url value="/css/black-skin-min.css" />" id="style-resource-5">

    <link rel="stylesheet" href="<c:url value="/css/forms-min.css" />" id="style-resource-6">

    <script src="<c:url value="/js/jquery-1.11.0.min.js" />"></script>
    <script>$.noConflict();</script>
</head>

<body class="page-body login-page is-lockscreen login-form-fall skin-black">
    <div class="login-container">
    
    	<jsp:doBody/>
    	
    </div>

    <script src="<c:url value="/js/main-min.js" />" id="script-resource-1"></script>
    <script src="<c:url value="/js/joinable-min.js" />" id="script-resource-2"></script>
    <script src="<c:url value="/js/resizeable-min.js" />" id="script-resource-3"></script>
    <script src="<c:url value="/js/api-min.js" />" id="script-resource-4"></script>
    <script src="<c:url value="/js/custom-min.js" />" id="script-resource-5"></script>

    <script src="<c:url value="/js/validate-min.js" />" id="script-resource-6"></script>

</body>
</html>