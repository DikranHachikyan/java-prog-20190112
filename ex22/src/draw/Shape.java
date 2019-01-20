package draw;

public interface Shape {
    //чисто виртуален метод
    public void moveTo(int dx, int dy);
    //метод с празно тяло
    //public void moveTo(int dx, int dy){};
    
    //C++
    //virtual void moveTo(int dx, int dy)=0;
    public void redraw();
    public void scale(int w, int h);
}
