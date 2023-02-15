
import java.util.Arrays;

public class SortScore extends Thread {
	private String matchType;
	private String scoreString;
	private Integer[] scores;
	
	public SortScore(String matchType, String scoreString) {
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

	
	
	@Override
	public void run() {
		String[] scoreArr = scoreString.split(",");
		
        scores = new Integer[scoreArr.length];
        
        for (int i = 0; i < scoreArr.length; i++) {
            scores[i] = Integer.parseInt(scoreArr[i]);
        }

        // Sort scores in descending order
        Arrays.sort(scores);
	}

	public Integer[] getScores() {
        return scores;
    }

	
	
	
}
