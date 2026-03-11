public class OOPSBannerApp {

    public static void main(String[] args) {

        // Pattern for O
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        CharacterPattern P = new CharacterPattern('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        // Pattern for S
        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        String[] o = O.getPattern();
        String[] p = P.getPattern();
        String[] s = S.getPattern();

        // Loop to print OOPS
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}