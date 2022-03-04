public class Buttons {

    //vi skal have stor knap og lille knap

    private String margeTop;
    private String margeCenter;
    private String margeBottom;

    public Buttons(String marge1, String marge2, String text) {
        this.margeTop = marge1;
        this.margeCenter = marge2;
        this.margeBottom = text;
    }

    public void customizedButton(int width, int height, String text){

        margeTop(width);
        margingCentre(height, width, text);
        margeTop(width);

    }
    public void margingCentre(int height, int width, String text){


        margeMiddlSpace(height, width);

        System.out.println(centerString(width, text));

        margeMiddlSpace(height, width);


    }

    public void margeMiddlSpace(int height, int width) {
        for (int i = 0; i < height / 2; i++) {
            System.out.print("|");
            for (int j = 1; j <= width; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public void margeTop(int width){
        for (int i = 0; i <= width; i++)
            System.out.print("-");
    }


    public String welcomeText(String INTROTEXT){
        String BOX1_1 = " ------------------------------------------------------------------------------------------------";
        String BOX1_2 = "|                                                                                                |";
        String centerText = centerString(96, INTROTEXT);

        return BOX1_1 + "\n" + BOX1_2 + "\n" + centerText + "\n" + BOX1_2 + "\n" + BOX1_1;

        //return String.format("%s\n%s\n|\t\t\t\t\t\t\t\t%35s\t\t\t\t\t\t\t\t |\n%s\n%s\n", BOX1_1, BOX1_2, INTROTEXT, BOX1_2, BOX1_1);

    }
/*
    public String bigButton(String text) {
        margeTop = " ------------------------------------------------------------------------------------------------ ";
        margeCenter = centerString(96, text);
        margeBottom = " ------------------------------------------------------------------------------------------------ ";
        return (margeTop + "\n" + margeCenter + "\n" + margeBottom);
    }

    public String dobbleButton(String text1, String text2) {
        margeTop = " ----------------------------------------------- ";
        margeCenter = centerString(47, text1);
        String margeCenter2 = centerString(47, text2);
        margeBottom = " ----------------------------------------------- ";
        return (margeTop + margeTop + "\n" + margeCenter + margeCenter2 + "\n" + margeBottom + margeBottom);

    }


    public String smallButton(String text) {
        margeTop = " ----------------------------------------------- ";
        margeCenter = centerString(47, text);
        margeBottom = " ----------------------------------------------- ";
        return (margeTop + "\n" + margeCenter + "\n" + margeBottom);

    }*/

    public static String centerString(int width, String s) {
        return String.format("|%-" + width + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s)) + "|";
    }

    public String getMargeTop() {
        return margeTop;
    }

    public void setMargeTop(String margeTop) {
        this.margeTop = margeTop;
    }

    public String getMargeCenter() {
        return margeCenter;
    }

    public void setMargeCenter(String margeCenter) {
        this.margeCenter = margeCenter;
    }

    public String getMargeBottom() {
        return margeBottom;
    }

    public void setMargeBottom(String margeBottom) {
        this.margeBottom = margeBottom;
    }
}
