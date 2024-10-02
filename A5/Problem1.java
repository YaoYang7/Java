import java.util.Scanner;
import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<String> csModules = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of modules to be entered :");
        int moduleCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < moduleCount; i++) {
            System.out.println("Enter module name: ");
            csModules.add(scanner.nextLine());
        }
        scanner.close();

        for (int i = 0; i < csModules.size(); i++) {
            if ((csModules.get(i).toLowerCase()).equals("networking")) {
                csModules.remove(i);
            }
        }


        int i = 0;
        //Selection sort
        for (String module : csModules) {
            int k = i; 
            for (int j = i + 1; j < csModules.size(); j++) {
                if ((module.toLowerCase()).compareTo((csModules.get(j)).toLowerCase()) > 0) {
                    module = csModules.get(j); 
                    k = j; 
                }
            }
            //Swap the str
            csModules.set(k, csModules.get(i));
            csModules.set(i, module);

            i++;
        }

        System.out.println("Reverse oder: ");
        for (int x = csModules.size() - 1; x >= 0; x--) {   // start at largest since arraylist is in ascending order
            System.out.println(csModules.get(x));
        }

    }
}