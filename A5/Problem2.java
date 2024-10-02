import java.util.HashMap; // import the HashMap class
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        HashMap<Integer, String> playerDetails = new HashMap<Integer, String>();

        // Add item to map, Jersey Number : Name
        playerDetails.put(0, "Name1");
        playerDetails.put(1, "Name2");
        playerDetails.put(2, "Name3");
        playerDetails.put(3, "Name4");
        playerDetails.put(4, "Name5");
        playerDetails.put(5, "Name6");
        playerDetails.put(6, "Name7");
        playerDetails.put(7, "Name8");
        playerDetails.put(8, "Name9");
        playerDetails.put(9, "Name10");
        playerDetails.put(10, "Name11");
        playerDetails.put(11, "Name12");
        playerDetails.put(12, "Name13");
        playerDetails.put(13, "Name14");
        playerDetails.put(14, "Name15");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player jersey number: ");
        int jerseyNumber = scanner.nextInt();
        scanner.nextLine();

        String playerName = playerDetails.get(jerseyNumber); 

        if (playerName != null) {
            System.out.println("Player name: " + playerName); 
            System.out.println("Jersey number: " + jerseyNumber);
        } else {
            System.out.println("Club does not contain a player with jersey number " + jerseyNumber);
        }

        scanner.close();
    }
}
