class outerClass {
    int x = 10;

    class innerClass {
        int y = 5;
    }
}

public class innerClasses {
    public static void main(String[] args) {
        outerClass outer = new outerClass();
        outerClass.innerClass inner = outer.new innerClass();
        System.out.println(outer.x + inner.y);
    }
}