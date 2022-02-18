package by.belstu.it.supruniuk;

public class TestFunction {
    public int test;

    public TestFunction(int test) {
        this.test = test;
    }

    public TestFunction() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getValue(){
        print();
        return "Hello from First project";
    }

    private void print() {
        System.out.println("Test method");
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }
}
