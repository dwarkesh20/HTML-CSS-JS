package match;

public class TestMatch extends Match {
	private int currentscore;
	private float currentover;
	private int target;
	
	public TestMatch(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		setCurrentover(currentover);
		setCurrentscore(currentscore);
		setTarget(target);
	}

	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	
	public int calculateBalls() {
		int balls = (int) (90.0 - getCurrentover()) * 6;
		return balls;
	}
	public float calculateRunRate() {
		float RunRate = (float) (6.0 * (float)(getTarget()-getCurrentscore())/calculateBalls());
		return RunRate;
	}
	public void display(double reqRunrate, int balls) {
		System.out.println("Requirements: ");
		System.out.println("Need "+(getTarget()-getCurrentscore())+" runs in "+balls+" balls:");
		System.out.printf("Required Runrate: "+reqRunrate);

	}
}
