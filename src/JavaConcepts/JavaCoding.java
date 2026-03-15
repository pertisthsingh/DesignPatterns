package JavaConcepts;

public class JavaCoding implements Cloneable {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "JavaConcepts.JavaCoding{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
