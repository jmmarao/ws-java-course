package section10.examples.wrapper;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        int boxing = 20;

        Object numberInHeap = boxing;
        System.out.println("numberInHeap = " + numberInHeap);

        int unboxing = (int) numberInHeap;
        System.out.println("unboxing = " + unboxing);
    }
}
