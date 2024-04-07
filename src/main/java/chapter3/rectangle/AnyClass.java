package chapter3.rectangle;


/**
 * 이렇게 클라이언트 코드를 이용해 Rectangle 객체의 속성값에 접근하는 것은 캡슐화를 깨뜨리는 것이다
 */
public class AnyClass {
    void anyMethod(Rectangle rectangle, int multiple) {
        rectangle.setRight(rectangle.getRight() * multiple);
        rectangle.setBottom(rectangle.getBottom() * multiple);
    }
}
