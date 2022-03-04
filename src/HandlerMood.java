import java.util.ArrayList;
import java.util.Scanner;

public class HandlerMood {

    ToolsMo tools;

    ArrayList<Mood> moods = new ArrayList<>();

    Scanner scan;

    public void runMoodMenu() {

        scan = new Scanner(System.in);

        showMoods();

        tools.buttons.customizedButton(50, 3, "0 - to create a new mood?");

        while (!scan.hasNextInt()) {
            System.out.println("Error - try again!");
            tools.buttons.customizedButton(50, 3, "Do you want to create a new mood?");
        }
        int ans = scan.nextInt();

        if (ans == 0) {
            createMood();
        } else {

        }


    }

    public void createMood() {

        String moodTitle = tools.getAnswer("Give this mood a name");

        Mood mood = new Mood(moodTitle);

        moods.add(mood);
    }

    public void showMoods() {
        for (int i = 0; i < moods.size(); i++)
            tools.buttons.customizedButton(50, 3, moods.get(i).getMoodTitle());
    }
}


/*
    public void registrateReport(){

    }


    public Mood identifyMood(){

        tools = new ToolsMo();

        String moodTitle = tools.getAnswer("Give this mood a name");

        Mood mood = new Mood(moodTitle);

        return mood;
    }*/
