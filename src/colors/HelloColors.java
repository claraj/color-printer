package colors;

/**
 * Examples of using the ColorPrinter class
 */
public class HelloColors {

    public static void main(String[] args) {

        char spadeCh = 9824;  // Unicode characters for playing card symbols
        char clubCh = 9827;
        char heartCh = 9829;
        char diamondCh = 9830;

        String spade = Character.toString(spadeCh);
        String club = Character.toString(clubCh);
        String heart = Character.toString(heartCh);
        String diamond = Character.toString(diamondCh);


        //Print with a particular text color

        //Your choices are black, white, red, green, blue, yellow, cyan and magenta

        ColorPrinter.print("The 6 of " + spade, TextCol.RED);
        ColorPrinter.print("The 10 of " + club, TextCol.BLACK);
        ColorPrinter.print("The 4 of " + heart, TextCol.BLACK, TextBk.WHITE);  //What if user's color scheme has a black background?
        ColorPrinter.print("The ace of " + diamond, TextCol.RED);

        //Print with a text color and separate background color
        //Color choices for the background are also black, white, red, green, blue, yellow, cyan and magenta

        ColorPrinter.print("Cyan text on red background", TextCol.CYAN, TextBk.RED);
        ColorPrinter.print("A message with Magenta text on black background", TextCol.MAGENTA, TextBk.BLACK);

    }
}
