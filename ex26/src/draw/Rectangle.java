package draw;

public class Rectangle extends Point{
    private int width = 0;
    private int height = 0;
    
    public Rectangle(int x, int y, int width, int height){
        super(x,y);//изикване на конструктора на родителя 
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(){
        this(0,0,0,0);
    }
    
    @Override 
    public void draw(){
        super.draw();
        System.out.println("Draw Rectangle [" + width + ", " + height+ "]");
    }
    //Override Shape Methods
    @Override
    public void scale(int w, int h){
        this.width  += w;
        this.height += h;
    }
}
