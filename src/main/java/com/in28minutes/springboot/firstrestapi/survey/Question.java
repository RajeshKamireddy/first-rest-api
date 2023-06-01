package com.in28minutes.springboot.firstrestapi.survey;

import java.util.List;

public class Question {

	private String id;
	private String description;
	private List<String> options;
	private String correcrAnswer;

	public Question() {

	}

	public Question(String id, String description, List<String> options, String correcrAnswer) {
		super();
		this.id = id;
		this.description = description;
		this.options = options;
		this.correcrAnswer = correcrAnswer;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public List<String> getOptions() {
		return options;
	}

	public String getCorrecrAnswer() {
		return correcrAnswer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", description=" + description + ", options=" + options + ", correcrAnswer="
				+ correcrAnswer + "]";
	}
	
	

}
