import java.util.*;

public class ToolsMo {

    Scanner scan;

    Buttons buttons = new Buttons("","","");


    public String getAnswer(String order) {
        scan = new Scanner(System.in);
        System.out.println(order); //change that to a button
        String result = scan.nextLine();
        return result;
    }
}
