import java.util.*;

public class Mood {

    private String moodTitle;
    //private ArrayList<Feeling> feelings = new ArrayList<Feeling>();
    //Feeling[] feelings;// = new Feeling[5];

    private ArrayList<Report> reports = new ArrayList<Report>();


    public Mood(String moodTitle) {
        this.moodTitle = moodTitle;
    }

    @Override
    public String toString() {
        return moodTitle;
    }

    public String getMoodTitle() {
        return moodTitle;
    }

    public void setMoodTitle(String moodTitle) {
        this.moodTitle = moodTitle;
    }

    /*  public Mood createMood() {
        tools = new ToolsMo();
        String moodTitle = tools.getAnswer("You are creating a new mood \n give this mood a name");

        Mood newMood = new Mood(moodTitle);

        return newMood;
    }*/

    public void showReports (){
        System.out.println("{ "+reports.get(0));
        for (int i = 1 ; i < reports.size(); i++)
            System.out.print(" - "+reports.get(i));
        System.out.println(" }");
    }




/*
    public Feeling[] feelings() {
        //Feeling feeling = createFeeling();
        //add to array
        return feelings;
    }

    public Mood createMood() {
        tools = new ToolsMo();
        String moodTitle = tools.getAnswer("You are creating a new mood \n give this mood a name");
        //create feeling


        Mood newMood = new Mood(moodTitle);

        return newMood;
    }

    //public Mood identifyMood() {


        //HandlerFeelings handlerFeelings = new HandlerFeelings();
        //handlerFeelings.decideFeeling();

        //}
*/

}
