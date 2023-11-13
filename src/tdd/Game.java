package tdd;

public class Game {
	private int score;

	public void roll(int n) {
		score += n;
	}

	public Integer score() {
		return score;
	}

}
