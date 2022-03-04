public class TopHandler {

    public User user;

    ToolsMo tools;

    HandlerMood moodHandler;

    public User createUser(){
        tools = new ToolsMo();
        String userName = tools.getAnswer("What is the Name of the User");
        this.user = new User(userName);
        return user;
    }

    public void runApp (){

        createUser();

        System.out.println(tools.buttons.welcomeText("Welcome "+user.getUserName()));
        //import presentation

        moodHandler  = new HandlerMood();

        moodHandler.runMoodMenu();
        //show moods
        //choose a mood
        //create new mood

        //from here go to mood handler
    }


}
