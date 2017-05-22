package Assignment36;

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

import javafx.scene.input.KeyCode;
import javafx.animation.Animation;

public class AnimationInClass extends Application
{
    private int screenWidth, screenHeight;
    private int speed, x, y;
    
    
    public AnimationInClass()
    {
        screenWidth = 400;
        screenHeight = 400;
        
        x = 150;
        y = 150;
        speed = 5;
    }
    
    @Override 
    public void start(Stage stage) 
    {
        Canvas canvas = new Canvas(screenWidth, screenHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc)));
        tl.setCycleCount(Timeline.INDEFINITE);
        canvas.setFocusTraversable(true);
        
        // handle mouse and key events
        
        /*canvas.setOnMouseClicked(e -> 
        {
            speed *= 2;
        });*/
        
        canvas.setOnKeyPressed(e ->
        {
           if(e.getCode() == KeyCode.S)
           {
               speed *= 2;
            }
            
            else if(e.getCode() == KeyCode.SHIFT)
            {
                speed *= 0.5;
            }
            
            else if(e.getCode() == KeyCode.P)
            {
                if(tl.getStatus() == Animation.Status.PAUSED)
                {
                    tl.play();
                }
                else
                {
                    tl.pause();
                }
            }
        });
        
        stage.setTitle("Basic Animations");
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }

    private void run(GraphicsContext gc)
    {
        // color for background
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, screenWidth, screenHeight);

        // color for objects
        gc.setFill(Color.WHITE);
        gc.fillOval(x, y, 10, 10);
        y += speed;
        
        if(y < 0 || y > screenHeight - 10)
        {
            speed = -speed;
        }
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
