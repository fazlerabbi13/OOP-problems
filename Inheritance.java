
import java.awt.Rectangle;


class Shape{
    public int area(){
        return 0;
    }

    class Rectangle extends Shape{
        public void area(int l,int b){
            System.out.println(l*b);
        }
    }

    class Circle extends Shape{
        public void area(int r){
            System.out.println(3.1416*r*r);
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area();
    }
}
