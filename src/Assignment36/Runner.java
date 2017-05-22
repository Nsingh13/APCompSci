package Assignment36;
/**
 * Write a description of class BasicAnimation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Runner extends Application {
	private int screenWidth, screenHeight;

	private Ball ball;
	private int ballInitVelX = 2;
	private int ballInitVelY = 2;
	private final int initalBallPosX = 150;
	private final int initalBallPosY = 150;
	private final int radius = 10;

	private Paddle paddle;
	private int paddleinitalBallPosX = 35;
	private int paddleinitalBallPosY = 20;
	private int width = 10;
	private int height = 75;
	private int initPaddleVel = 10;
	
	private Paddle paddleAI;

	final int initalPaddleY = 240;

	Canvas canvas;

	public Runner() {
		screenWidth = 650;
		screenHeight = 400;

		ball = new Ball(initalBallPosX, initalBallPosY, radius, ballInitVelX, ballInitVelY);
		paddle = new Paddle(paddleinitalBallPosX, paddleinitalBallPosY, width, height, initPaddleVel);
		paddleAI = new Paddle(screenWidth-paddleinitalBallPosX, paddleinitalBallPosY, width, height, initPaddleVel);
	}

	@Override
	public void start(Stage stage) {
		canvas = new Canvas(screenWidth, screenHeight);
		GraphicsContext gc1 = canvas.getGraphicsContext2D();

		Timeline tl = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc1)));

		tl.setCycleCount(Timeline.INDEFINITE);
		canvas.setFocusTraversable(true);
		stage.setTitle("Basic Animations");
		stage.setScene(new Scene(new StackPane(canvas)));
		stage.show();
		tl.play();
		paddleMovement(canvas);

	}

	private void run(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, screenWidth, screenHeight);

		gc.setFill(Color.WHITE);
		gc.fillOval(ball.getX(), ball.getY(), ball.getR(), ball.getR());
		gc.fillRect(paddle.getX(), paddle.getY(), paddle.getW(), paddle.getH());
		gc.fillRect(paddleAI.getX(), paddleAI.getY(), paddleAI.getW(), paddleAI.getH());
		ball.move();

		paddleMovement(canvas);
		checkCollision();
	}

	public void paddleMovement(Canvas canvas) {
		canvas.setOnMouseMoved(event -> {
			int mouseY = (int) event.getY();
			if (!(mouseY < 0) && !(mouseY > (screenHeight - height))) {

				paddle.move((int) event.getY());
			}
		});

	}

	public void checkCollision() {

		// Checks for left hand wall Collison
		if (ball.getX() < ball.getR() || ball.getX() > screenWidth - ball.getR()) {

			ball.hitSideWall();

		}

		if (ball.getY() < ball.getR() || ball.getY() > screenHeight - ball.getR()) {
			ball.hitTopBotWall();
		}

		
		//This looks if the ball hits the lift paddle
		if (ball.getX() < paddle.getX() + ball.getR()) {
			if (ball.getY() > paddle.getY() && ball.getY() < paddle.getY() + height) {
				ball.hitSideWall();
			}

		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}