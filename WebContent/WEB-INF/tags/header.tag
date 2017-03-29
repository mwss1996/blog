<%@ attribute name="subtitle" required="true" rtexprvalue="true" %>
<header class="clearfix">
	<div class="width">
		<h1 id="headerLogo"><a href="/">MWSS1996</a> <span>${subtitle}</span></h1>
		<nav id="headerNav">
			<ul>
				<li><a href="/portfolio">Portfólio</a></li><%--
			--%><li><a href="/about">Sobre</a></li>
			</ul>
		</nav>
		<form id="search" action="">
			<input type="text"/><%--
		--%><button type="submit" value="/search/"><img id="magnifier" src="/resources/search.svg"></button>
		</form>
	</div>
</header>