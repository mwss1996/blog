package blog;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().print("This is MyTag!");
		getJspBody().invoke(null);
	}
}
