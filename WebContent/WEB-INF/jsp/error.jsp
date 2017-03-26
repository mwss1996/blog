<%@ taglib prefix="template" tagdir="/WEB-INF/tags" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<template:head subtitle="Erro"/>
	<body>
		<template:header subtitle="Erro"/>
		<main>
			<div class="width">
				<section>
					<h1>Erro</h1>
					<p>${pageContext.exception.message}</p>
					<p>${pageContext.exception.class}</p>
				</section>
			</div>
		</main>
		<template:footer/>
	</body>
</html>