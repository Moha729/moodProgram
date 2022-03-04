public class HandlerMood {

    ToolsMo  tools;

    public void registrateReport(){

    }

    public Mood identifyMood(){

        tools = new ToolsMo();

        String moodTitle = tools.getAnswer("Give this mood a name");

        Mood mood = new Mood(moodTitle);

        return mood;
    }
}
