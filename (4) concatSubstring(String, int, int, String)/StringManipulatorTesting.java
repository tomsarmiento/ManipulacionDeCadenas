public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String word = manipulator.concatSubstring("Hola", 1, 2, "mundo");
        System.out.println(word); // omundo
    }
}