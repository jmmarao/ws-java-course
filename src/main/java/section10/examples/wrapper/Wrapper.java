package section10.examples.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        int boxing = 20;

        Integer numberInHeap = boxing;
        System.out.println("numberInHeap = " + numberInHeap);

        int unboxing = numberInHeap * 2;
        System.out.println("unboxing = " + unboxing);
    }
}
