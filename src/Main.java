import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Занятия пройдут в " + input());
    }
    public static String input (){
        String day=null;
        Scanner kb = new Scanner(System.in);
        System.out.println("Предложите день недели для занятий");
        try {
            day = kb.nextLine();
            if (day.equalsIgnoreCase("Пятница")){
            throw new MyException();
            }
        }
        catch (MyException e){
            System.out.println("Не не не, только не пятница");
            System.out.println("Предложите другой день для занятий, кроме Пятницы");
            day = input();
        }
        return day;
    }
}
