
public class Main {
    public static void main(String[] args)
    {
        for (String s: args) {
            FindLongestWord lw = new FindLongestWord();
            lw.maxLengthWords(s);
            System.out.println("Input: `" + s + "`");

            System.out.println("Maximum length word: "
                    + lw.getMaxWordLength()
                    + "\nMaximum length word: "
                    + lw.getMaxWord());
        }
    }
}
