package SHAPE_REORGANAZATION;

public class Cylinder extends Shape {

    private int radius;
    private int height;

    // 1. Shape의 draw 메서드 오버라이드
    @Override
    public void draw() {
        System.out.println("Cylinder Draw[" + radius + ", " + height + "]");
    }

    // 2. getter , setter
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
