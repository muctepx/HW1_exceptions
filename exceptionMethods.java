package Algorithm.Exceptions.seminar1.HW;

public class exceptionMethods {
    public void throwNullPointerException() {
        String str = null;
        str.length();
    }

    public void throwArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 3};
        int element = array[3];
    }

    public void throwNumberFormatException() {
        String str = "abc";
        int number = Integer.parseInt(str);
    }
}
