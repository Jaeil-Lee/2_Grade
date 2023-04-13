package SHAPE_REORGANAZATION;

public class ShapeTest2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        // 배열의 INDEX에 각기 다른 객체들을 삽입 , 부모 < 자식
        shapes[0] = new Rectangle();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();
        shapes[3] = new Cylinder();

        // static 메서드 호출
        drawShapes(shapes);
    }

    // 배열에 순차적으로 부모의 draw메서드를 입력 
    public static void drawShapes(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
    }
}