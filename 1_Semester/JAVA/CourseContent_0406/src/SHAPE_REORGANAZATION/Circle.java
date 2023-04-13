package SHAPE_REORGANAZATION;

public class Circle extends Shape {
    
    private int radius;

    // 1. Shape의 draw 메서드 오버라이드
    @Override
    public void draw() {
        System.out.println("Circle Draw[" + radius + "]");
    }


    // 2. getter , setter
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
