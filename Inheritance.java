
class Shape{
    public double  area(){
        return 0;
    }
}

    class Rectangle extends Shape{

        private double l;
        private double b;

        public Rectangle(double l,double b){
            this.l=l;
            this.b=b;
        }

        // Overriding area() method for Rectangle
        @Override
        public double area(){
            return l*b;
        }
    }

    class Circle extends Shape{
        private double r;

        public Circle(double r){
            this.r=r;
        }

        @Override
        public double area(){
            return 3.1416*r*r;
        }
    }


public class Inheritance {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        System.out.println("circle "+c.area());
    }
}
