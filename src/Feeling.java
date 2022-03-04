public class Feeling {

    private String feelingName;
    private String feelingFirstDescription;
    private String feelingImpact;
    private String feelingUrges;

    public Feeling(String feelingName, String feelingFirstDescription, String feelingImpact, String feelingUrges) {
        this.feelingName = feelingName;
        this.feelingFirstDescription = feelingFirstDescription;
        this.feelingImpact = feelingImpact;
        this.feelingUrges = feelingUrges;
    }

    @Override
    public String toString() {
        return "Feeling: " + feelingName +"\n" +
                " - Description: " + feelingFirstDescription + "\n" +
                " - Impact: " + feelingImpact + "\n" +
                " - Urges: " + feelingUrges;
    }

    public String getFeelingName() {
        return feelingName;
    }

    public void setFeelingName(String feelingName) {
        this.feelingName = feelingName;
    }

    public String getFeelingFirstDescription() {
        return feelingFirstDescription;
    }

    public void setFeelingFirstDescription(String feelingFirstDescription) {
        this.feelingFirstDescription = feelingFirstDescription;
    }

    public String getFeelingImpact() {
        return feelingImpact;
    }

    public void setFeelingImpact(String feelingImpact) {
        this.feelingImpact = feelingImpact;
    }

    public String getFeelingUrges() {
        return feelingUrges;
    }

    public void setFeelingUrges(String feelingUrges) {
        this.feelingUrges = feelingUrges;
    }
}
