package chapter3.rectangle;

public class Rectangle {

    private int left;
    private int top;
    private int right;
    private int bottom;

    public Rectangle(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }


    /**
     * rectangle 클래스에 속성값을 조절하는 메서드를 두면 외부에 속성값을 노출하지 않을 수 있고
     * 코드의 중복도 줄일 수 있다
     */
    public void enlarge(int multiple) {
        right *= multiple;
        bottom *= multiple;
    }
}
