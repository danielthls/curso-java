package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44", fmt);
		String title = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful country!";
		Integer likes = 12;
		
		Post post1 = new Post(moment, title, content, likes);
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));
		
		moment = LocalDateTime.parse("28/07/2018 23:14:19", fmt);
		title = "Good night guys";
		content = "see you tomorrow";
		likes = 5;
		
		Post post2 = new Post(moment, title, content, likes);
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post1);
		System.out.println(post2);
		//writePost(post1);
		
		//writePost(post2);
	}
	
	/*public static void writePost(Post post) {
		System.out.println(post.getTitle());
		System.out.printf("%d Likes - %s %n", post.getLikes(), post.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		System.out.println("Comments:");
		for (Comment c: post.getComments()) {
			System.out.println(c.getText());
		}
	}*/

}
