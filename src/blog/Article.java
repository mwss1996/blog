package blog;

public class Article {
	
	private String time;
	private String title;
	private String subtitle;
	private String content;
	
	public Article(String time, String title, String subtitle, String content) {
		this.time = time;
		this.title = title;
		this.subtitle = subtitle;
		this.content = content;
	}

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
