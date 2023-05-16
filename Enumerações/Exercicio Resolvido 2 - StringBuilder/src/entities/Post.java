package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments =  new ArrayList<>();
	
	public Post() {
	}
	
	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public LocalDateTime getMoment() {
		return this.moment;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public Integer getLikes() {
		return this.likes;
	}
	
	public List<Comment> getComments() {
		return this.comments;
	}
	
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(String.format("%d Likes - %s %n", this.likes, this.moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))));
		sb.append(this.content + "\n");
		sb.append("Comments:" + "\n");
		for (Comment c: this.comments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	}
}
