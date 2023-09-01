package model;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<Answer> answer;
	public Question() {
		super();
	}
	public Question(int id, String name, List<Answer> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	
	public void displayInfo()
	{
		System.out.println(id+"  "+name);
		Iterator<Answer> itr = answer.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}
	}
}
