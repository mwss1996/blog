<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ attribute name="subtitle" required="false" rtexprvalue="true" %>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="icon" href="${pageContext.request.contextPath}/resources/favicon.ico"/>
	<title>mwss1996<c:if test="${not empty subtitle}"> - ${subtitle}</c:if>
	</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles.css"/>
	<script>
		document.createElement('header');
		document.createElement('main');
		document.createElement('section');
		document.createElement('article');
		document.createElement('aside');
		document.createElement('nav');
		document.createElement('footer');
	</script>
</head>