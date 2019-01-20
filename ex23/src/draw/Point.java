package draw;

//public abstract class Point implements Shape{
public class Point implements Shape{
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
    
    @Override
    public boolean equals( Object ob){
        if( ob == null || !(ob instanceof Point) ) return false;
        Point t = (Point)ob;       
        return getX() == t.getX() && getY() == t.getY();
    }
    
    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + ","+isVisible()+")";
    }
    
    //Override Shape Methods
    @Override
    public void moveTo(int dx, int dy){
        setX( getX() + dx);
        setY( getY() + dy);
    }
    
    @Override
    public void redraw(){
        draw();
    }
    
    @Override
    public void scale(int w, int h){};
}
