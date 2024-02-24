class OuterClass {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class innerToOuterClassAccess {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}
// Outputs 10 (the value of x)
// Note: The inner class can access the outer class's variables
//
// The inner class can also access the outer class's methods
//
// The inner class can also access the outer class's private variables

// The inner class can also access the outer class's private methods

// The outer class can also access the inner class's variables

// The outer class can also access the inner class's methods

// The outer class can also access the inner class's private variables

// The outer class can also access the inner class's private methods

