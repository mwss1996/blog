<%@ attribute name="subtitle" required="true" rtexprvalue="true" %>
<header class="clearfix">
	<div class="width">
		<h1 id="headerLogo"><a href="${pageContext.request.contextPath}/">MWSS1996</a> <span>${subtitle}</span></h1>
		<nav id="headerNav">
			<ul>
				<li><a href="${pageContext.request.contextPath}/portfolio">Portfólio</a></li><%--
			--%><li><a href="${pageContext.request.contextPath}/about">Sobre</a></li>
			</ul>
		</nav>
		<form id="search" action="">
			<input type="text"/><%--
		--%><button type="submit" value="${pageContext.request.contextPath}/search/"><img id="magnifier" src="${pageContext.request.contextPath}/resources/search.svg"></button>
		</form>
	</div>
</header>