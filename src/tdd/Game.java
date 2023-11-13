package tdd;

public class Game {
	private int score;

	public void roll(int n) {
		score += n;
		score();
	}

	public Integer score() {
		return score;
	}

}
