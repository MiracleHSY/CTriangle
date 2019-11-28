interface Shape
{
    public double getArea();
}
class Rectangle implements Shape
{
    private double length;
    private double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    @Override
    public String toString(){
        return "Rectangle Area:" + Double.toString(getArea());
    }
}


class Triangle implements Shape
{
    private double base;
    private double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return (base * height)/2;
    } 
    @Override
    public String toString(){
        return "Triangle Ares: " + Double.toString(getArea());
    }
}

class uml_shape
{
    public static void main(String[] args){
        Rectangle r = new Rectangle(50, 30);
        Triangle t = new Triangle(50, 30);
        System.out.println(r);
        System.out.println(t);
    }
}
