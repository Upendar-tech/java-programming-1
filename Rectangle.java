import java.util.*;
class Rectangle {
    static int width,height;
    void display(){
        System.out.println("width: "+width);
        System.out.println("height: "+height);
    }
}

class RectangleArea extends Rectangle{
    void read_input(){
        Scanner sc = new Scanner(System.in);
        Rectangle.width=sc.nextInt();
        Rectangle.height=sc.nextInt();
    }
    @Override
    void display(){
        System.out.println("Area of rectangle is: "+(Rectangle.width*Rectangle.height));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        RectangleArea r2 = new RectangleArea();
        r2.read_input();
        r1.display();
        r2.display();
    }
}
