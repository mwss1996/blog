package blog;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Articles extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int requestedPage = 1;
		String uri = request.getRequestURI();
		if (uri.startsWith(request.getContextPath() + "/page/")) {
			requestedPage = Integer.parseInt(uri.replaceFirst(request.getContextPath() + "/page/", ""));
		}
		int itensPorPagina = 5;//Itens por página
		int numeroDePaginas = (int) Math.ceil((float) ArticleDAO.getRowCount() / itensPorPagina);//Número de páginas
		if (requestedPage > numeroDePaginas) {
			requestedPage = numeroDePaginas;
		}
		if (requestedPage < 1) {
			requestedPage = 1;
		}
		request.setAttribute("currentPage", requestedPage);
		List<Article> list = ArticleDAO.listArticles(itensPorPagina, requestedPage - 1);
		request.setAttribute("articleList", list);
		request.setAttribute("pageCount", numeroDePaginas);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/articles.jsp");
		view.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);		
	}
	
}