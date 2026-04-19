package practice1;

abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base;
    double height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    double side;
    
    Square(double side) {
        this.side = side;
    }
    
    @Override
    double area() {
        return side * side;
    }
}
