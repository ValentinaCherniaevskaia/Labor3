package Class;
import java.util.Scanner;

public class ClassWo{
    public static boolean isDate(int year, int month, int day){
        boolean result = true;
        if (year < 1900 || year > 9999)
            result = false;
        if (month < 1 || month > 12)
            result = false;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if (day < 1 || day > 31)
                result = false;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11)
            if (day < 1 || day > 30)
                result = false;
        if (month == 2)
            if (day < 1 || day > 28)
                result = false;
        return result;
    }

    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String date = scannner.next();
        scannner.close();
        boolean result = date.matches("\\d{2}(\\/)\\d{2}(\\/)\\d{4}");
        if (result){
            int year = Integer.parseInt(date.substring(6));
            int month = Integer.parseInt(date.substring(3,5));
            int day = Integer.parseInt(date.substring(0,2));
            result = isDate(year, month, day);
        }
        if (result) {
            System.out.println("Такая дата существует");
        } else {
            System.out.println("Такой даты не существует или ввод некорректен!");
        }
    }
}