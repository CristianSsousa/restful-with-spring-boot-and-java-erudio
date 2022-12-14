package br.com.erudio;

public class Greeting{
	
	
	private final long id;
	private final String content;
	private final String description;
	 
	 
	public Greeting(long id, String content,String description) {
		this.id = id;
		this.content = content;
		this.description = description;
	}




	public String getDescription() {
		return description;
	}


	public long getId() {
		return id;
	}


	public String getContent() {
		return content;
	}
	  
}
