import java.util.*;

public class HandlerFeelings {

    ToolsMo tools;

    public Feeling decideFeeling(){

        tools = new ToolsMo();

        String feelingTitle = tools.getAnswer("What is the feeling you are feeling");//getFeelingTitle("What is the feeling you are feeling");

        String feelingDiscription = tools.getAnswer("Try to decribe what it makes you feel");//getFeelingDescription();
        //change that later or make a new feeling, then the presentation must be full and not by title
        //as this is an override.

        String feelingImpact = tools.getAnswer("How is this feeling shaking you? good? bad?"); //getFeelingImpactImpact();
        String feelingUrges = tools.getAnswer("What is this feeling making you want to do?"); //getFeelingUrgesUrges();


        Feeling feeling = new Feeling(feelingTitle, feelingDiscription, feelingImpact, feelingUrges);

        return feeling;
    }



}
