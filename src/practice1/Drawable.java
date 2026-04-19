package practice1;

public interface Drawable {
    void draw();
}

class Circle implements Drawable {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println(radius);
    }
}

class Rectangle implements Drawable {
    double width;
    double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println(width);
        System.out.println(height);
    }
}
