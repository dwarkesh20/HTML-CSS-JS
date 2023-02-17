package Program3;

import java.util.ArrayList;

public class Scores extends Thread{
	private int start;
	private int end;
	private String scoreType;
	private ArrayList<Integer> scoreList = new ArrayList<>();
	
	public Scores(int start, int end, String scoreType) {
		super();
		this.start = start;
		this.end = end;
		this.scoreType = scoreType;
	}
	
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			if(scoreType.equalsIgnoreCase("odd")){
				if(i%2!=0) {
					scoreList.add(i);					
				}
			}
			else if(scoreType.equalsIgnoreCase("even")){
				if(i%2==0) {
					scoreList.add(i);	
				}
			}
		}
	}
	
	public void display() {
		for (Integer i : scoreList) {
			System.out.print(i+" ");
		}
	}
}
