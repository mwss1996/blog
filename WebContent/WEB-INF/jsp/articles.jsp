<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags" %>
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
					<nav id="pagination">
						<ul>
							<c:if test="${currentPage != 0}">
								<li><a class="cursor" href="/page/${currentPage - 1}">&lt;</a></li><%--
							--%></c:if><%--
						--%><c:forEach begin="0" end="${pageCount}" varStatus="loop"><%--
							--%><li>
									<c:choose>
										<c:when test="${currentPage == loop.index}">
											<a class="currentPage" href="/page/${loop.index}">${loop.count}</a>
										</c:when>
										<c:otherwise>
											<a href="/page/${loop.index}">${loop.count}</a>
										</c:otherwise>
									</c:choose>
								</li><%--
						--%></c:forEach><%--
						--%><c:if test="${currentPage != pageCount}"><%--
							--%><li><a class="cursor" href="/page/${currentPage + 1}">&gt;</a></li>
							</c:if>
						</ul>							
					</nav>
				</section>
			</div>
		</main>
		<template:footer/>
	</body>
</html>