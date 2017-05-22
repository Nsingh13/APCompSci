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
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Runner extends Application {
	private int screenWidth, screenHeight;

	private Ball ball;
	private int ballInitVelX = 3;
	private int ballInitVelY = 3;
	private final int initalBallPosX = 150;
	private final int initalBallPosY = 150;
	private final int radius = 15;

	private Paddle paddle;
	private int paddleinitalBallPosX = 35;
	private int paddleinitalBallPosY = 20;
	private int width = 10;
	private int height = 75;
	private int initPaddleVel = 2;

	private Paddle paddleAI;
	private boolean playersTurn = false;
	final int initalPaddleY = 240;

	Canvas canvas;
	
	private int playerScore = 0;
	private int AIScore = 0;
	

	public Runner() {
		screenWidth = 650;
		screenHeight = 400;

		ball = new Ball(initalBallPosX, initalBallPosY, radius, ballInitVelX, ballInitVelY);
		paddle = new Paddle(paddleinitalBallPosX, paddleinitalBallPosY, width, height, initPaddleVel);
		paddleAI = new Paddle(screenWidth - paddleinitalBallPosX, paddleinitalBallPosY, width, height, initPaddleVel);
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
		gc.fillRect(screenWidth / 2, 0, 15, screenHeight);
		Font font = new Font("Impact", 60);
		gc.setFont(font);
		gc.fillText(String.valueOf(playerScore), 200, 60);
		gc.fillText(String.valueOf(AIScore), 450, 60);
		
		gc.setFill(Color.BLACK);
		for (int y = 10; y < screenHeight; y += 50) {
			gc.fillRect(screenWidth / 2, y, 15, 20);

		}
		
		ball.move();
		paddleMovement(canvas);
		checkCollision();
		AIMove();
	}

	public void paddleMovement(Canvas canvas) {
		canvas.setOnMouseMoved(event -> {
			int mouseY = (int) event.getY();
			if (!(mouseY < 0) && !(mouseY > (screenHeight - height))) {

				paddle.move((int) event.getY());
			}
		});

	}

	public void AIMove() {
		if (!playersTurn) {
			if (ball.getY() > paddleAI.getY() + (height / 2)) {
				paddleAI.moveDown();
			} else if (ball.getY() < paddleAI.getY() + (height / 2)) {
				paddleAI.moveUp();
			}
		}
	}

	public void checkCollision() {

		// Checks for left hand wall Collison
		if (ball.getX() < 0 ){ 

			playerScore++;
			ball.resetBall();
			playersTurn = !playersTurn;
		}
		
		if(ball.getX() > screenWidth ) {
			AIScore++;
			ball.resetBall();
			playersTurn = !playersTurn;
		}

		if (ball.getY() < ball.getR() || ball.getY() > screenHeight - ball.getR()) {
			ball.hitTopBotWall();
		}

		// This looks if the ball hits the lift paddle
		if (ball.getX() < paddle.getX() + ball.getR()+5) {
			if (ball.getY() > paddle.getY() && ball.getY() < paddle.getY() + height) {
				ball.hitSideWall();
				playersTurn = false;
			}

		}

		if (ball.getX() > paddleAI.getX() - ball.getR()-5) {
			if (ball.getY() > paddleAI.getY() && ball.getY() < paddleAI.getY() + height) {
				ball.hitSideWall();
				playersTurn = true;
			}

		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}