package blogger;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Articles extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> names = request.getAttributeNames();
		while(names.hasMoreElements()) {
			String temp = names.nextElement();
			int x = 1;
			int y = 2;
		}
		int page = 0;
		String uri = request.getRequestURI();
		if (uri.startsWith("/page/")) {
			page = Integer.parseInt(uri.replaceFirst("/page/", ""));
		}
		int itemsPerPage = 2;
		List<Article> list = ArticleDAO.listArticles(itemsPerPage, page);
		request.setAttribute("currentPage", page);
		request.setAttribute("articleList", list);
		request.setAttribute("pageCount", Math.ceil(ArticleDAO.getRowCount() / itemsPerPage) - 1);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/articles.jsp");
		view.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);		
	}
	
}