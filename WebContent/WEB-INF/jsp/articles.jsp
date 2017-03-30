<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="blog" uri="blog" %>
<!DOCTYPE html>
<html>
	<template:head/>
	<body>
		<template:header subtitle="Artigos"/>
		<main>
			<div class="width">
				<section>
					<c:forEach items="${articleList}" var="article" >
						<article class="clearfix">
							<time class="articleDate">${article.time}</time>
							<h1 class="articleTitle">${article.title}</h1>
							<h2 class="articleSubtitle">${article.subtitle}</h2>
							${article.content}
						</article>
					</c:forEach>
					<blog:pagination url="${pageContext.request.contextPath}/page/" current="${currentPage}" count="${pageCount}"/>
				</section>
			</div>
		</main>
		<template:footer/>
	</body>
</html>