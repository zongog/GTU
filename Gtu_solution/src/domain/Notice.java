package domain;

import java.sql.Date;

public class Notice {
	
	private int id;
	private String title;
	private String content;
	private Date N_date;
	private String attachment;
	
	public Notice() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getN_date() {
		return N_date;
	}

	public void setN_date(Date n_date) {
		this.N_date = n_date;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	};
	
	

}
