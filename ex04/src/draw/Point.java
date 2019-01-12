package draw;

public class Point {
    private int x = 0;
    private int y = 0;
    private boolean visible = false;
    
    public Point( int x, int y){
        setX(x);
        setY(y);
        if( getX() <= 0 || getY()<=0 ){
            setVisible(false);
        }
        else{
            setVisible(true);
        }
            
    }

    public Point(){
        this(0,0);
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public boolean isVisible(){
        return this.visible;
    }
    
    public void draw(){
        if( isVisible() ){
            System.out.println("Draw Point (" + getX() + "," + getY() + ")");
        }
        else{
            System.out.println("Draw Hidden Point (" + getX() + "," + getY() + ")");
            
        }
    }
}
