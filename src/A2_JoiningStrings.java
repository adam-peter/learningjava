public class A2_JoiningStrings {
    public static void main(String[] args) {
        int year = 2010;
        String winner = "Spain";

        String announcement = String.format("The winners of the %d world cup are %s.", year, winner);
        System.out.println(announcement);

        System.out.println(("Hello" + " world!"));
    }
}
