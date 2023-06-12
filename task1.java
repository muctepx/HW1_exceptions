package Algorithm.Exceptions.seminar1.HW;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class task1 {
    public static void main(String[] args) {
        exceptionMethods exceptionUtils = new exceptionMethods();
        try {
            exceptionUtils.throwNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        try {
            exceptionUtils.throwArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        try {
            exceptionUtils.throwNumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
