public class Figure {
    float x;
    float y;

    public Figure(float x, float y, float height, float width,int radius){
        this.x = x;
        this.y = y;
        this.height = height;
        this.wigth = width;
        this.redius = radius;
    }

    float getArea(){
        return (x*y);
    }
    float getPerimeter(){
        return ((x+y)*2);
    }
}