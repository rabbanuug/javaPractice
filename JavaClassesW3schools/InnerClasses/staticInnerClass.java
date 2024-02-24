// An inner class can also be static, which means that you can access it without creating an object of the outer class:

class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class staticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}

//Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.

//In the example above, we created a static inner class. We can also create a static method to return the inner class:

// class OuterClass {
//     int x = 10;
//
//     static class InnerClass {
//         int y = 5;
//     }
//
//     static InnerClass myMethod() {
//         return new InnerClass();
//     }
// }
//
// public class Main {
//     public static void main(String[] args) {
//         OuterClass.InnerClass myInner = OuterClass.myMethod();
//         System.out.println(myInner.y);
//     }
// }

