package Program2;

import java.util.Arrays;

public class CalculateScores implements Runnable{
	private String matchType;
	private String scoreString;
	private Integer[] scores;
	private double meanScore;
	private double minScore;
	private double maxScore;
	
	
	
	public CalculateScores(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getScoreString() {
		return scoreString;
	}
	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}
	
	
	public double getMeanScore() {
		return meanScore;
	}
	public void setMeanScore(double meanScore) {
		this.meanScore = meanScore;
	}
	public double getMinScore() {
		return minScore;
	}
	public void setMinScore(double minScore) {
		this.minScore = minScore;
	}
	public double getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(double maxScore) {
		this.maxScore = maxScore;
	}
	
	@Override
	public void run() {
		String[] scoreArr = scoreString.split(",");
		
        scores = new Integer[scoreArr.length];
        for (int i = 0; i < scoreArr.length; i++) {
            scores[i] = Integer.parseInt(scoreArr[i]);
        }
        
        Arrays.sort(scores);
        
        setMinScore(scores[0]);
        setMaxScore(scores[scores.length-1]);
        double sum=0;
        for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
        double mean = sum/(scores.length);
        setMeanScore(mean);
	}
	
	
	
	
}
