package Assignment36;



/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle
{
    private int x, y, w, h, v;
    
    public Paddle(int x, int y, int w, int h, int v)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.v = v;
    }
    
    /**
     * Changes y-coordinate for movement.
     */
    public void move(int Y)
    {
        y  = Y;
    }
    
    public void moveUp()
    {
        y  += -v;
    }
    
    public void moveDown()
    {
        y  += v;
    }
  

    /**
     * Changes direction of movement.
     */
    public void changeDir()
    {
        v = -v;
    }
    
    /**
     * Returns x-coordinate.
     */
    public double getX()
    {
        return x;
    }
    
    /**
     * Returns y-coordinate.
     */
    public double getY()
    {
        return y;
    }
    
    /**
     * Returns width of this paddle.
     */
    public double getW()
    {
        return w;
    }
    
    /**
     * Returns height of this paddle.
     */
    public double getH()
    {
        return h;
    }
    
    /**
     * Returns velocity of this paddle.
     */
    public double getV()
    {
        return v;
    }
}
