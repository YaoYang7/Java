public class BottomToUp {
    public static void main(String[] args) {
        String stars = "*";
        String spaces = "";
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                spaces += " ";
            }
            System.out.println(spaces + stars);
            stars += "*";
            spaces = "";
        }
    }
}
