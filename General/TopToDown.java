public class TopToDown{
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        String stars = "*";
        for (int i = 1; i <= 5; i++) {
            System.out.println(stars);
            stars += "*";
        }
    }
}