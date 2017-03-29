package blog;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Pagination extends SimpleTagSupport {
	
	private String url;
	private int current;
	private int count;
	
	@Override
	public void doTag() throws JspException, IOException {
		if (count > 1) {
			JspWriter out = getJspContext().getOut();
			out.write("<nav id='pagination'><ul>");
			String li = "<li><a class='%s' href='" + url + "%d'>%s</a></li>";
			if (current > 1) {
				out.write(String.format(li, "cursor", current - 1, "&lt;"));
			}
			for (int x = 1; x <= count; x++) {
				String isCurrent = "";
				if (x == current) {
					isCurrent = "currentPage";
				}
				out.write(String.format(li, isCurrent, x, x));
			}
			if (current < count) {
				out.write(String.format(li, "cursor", current + 1, "&gt;"));
			}
			out.write("</ul></nav>");
		}
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setCurrent(int current) {
		this.current = current;
	}	
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
