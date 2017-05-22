package Assignment36;

/**
 * Write a description of class Ball here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ball {
	private double x, y, vx, vy;
	private int r;

	public Ball(double x, double y, int r, double vx, double vy) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.vx = vx;
		this.vy = vy;
	}

	/**
	 * Changes the x and y coordinates for movement.
	 */
	public void move() {
		x += vx;
		y += vy;
	}

	/**
	 * Reverse direction when hitting wall.
	 */
	public void hitSideWall() {
		vx = -vx;
	}

	/**
	 * Reverse direction when hitting wall.
	 */
	public void hitTopBotWall() {
		vy = -vy;
	}

	/**
	 * Returns x-coordinate.
	 */
	public double getX() {
		return x;
	}

	/**
	 * Returns y-coordinate.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Returns radius.
	 */
	public double getR() {
		return r;
	}

	/**
	 * Use this method after a point is scored to reset the position of the ball
	 * to start play again.
	 */
	public void resetBall() {
		x = 325;
		y = 150 * Math.random() + 150;

		vx *= -1;
	}

	/**
	 * Increases velocity by factor of 1.5.
	 */
	public void addVel() {
		vx *= 1.5;
		vy *= 1.5;
	}
}
