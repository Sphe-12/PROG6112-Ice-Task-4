public class Main {
    public static void main(String[] args) {
        String months[] = { " ","JAN", "FEB", "MAR" };
        String cities[] = { "JHB", "DBN", "CTN", "PE" };
        String numbers [][] = {{"128km", "135km", "139km"}, {"155km", "129km", "175km"},
                               {"129km", "130km", "185km"}, {"195km", "155km", "221km"}};
        System.out.println("****************************************************\n");
        System.out.println("SPEEDING FINES REPORT\n");
        System.out.println("****************************************************\n");

        for (String month : months) {
            System.out.printf("%-12s", month);
        }
        System.out.println();
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-12s", "");
        }
        System.out.println();
    
        for (int c = 0; c < cities.length; c++) {
            System.out.printf("%-12s", cities[c]);
            for (int n = 0; n < numbers[c].length; n++) {
                System.out.printf("%-12s", numbers[c][n]);
            }
            System.out.println();
        }
    
        System.out.println("****************************************************\n");
        System.out.println("SPEEDING FINES STATISTICS\n");
        System.out.println("****************************************************\n");
        System.out.println("Maximum speed captured: " + findMax(numbers));
        System.out.println("Minimum speed captured: " + findMin(numbers));
        System.out.println("**********************************************\n");
    }

    // Method to find the maximum value in a 2D String array (parsing integers from strings like "128km")
    public static int findMax(String[][] arr) {
        int max = Integer.MIN_VALUE;
        for (String[] row : arr) {
            for (String val : row) {
                int num = Integer.parseInt(val.replaceAll("[^0-9]", ""));
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    // Method to find the minimum value in a 2D String array (parsing integers from strings like "128km")
    public static int findMin(String[][] arr) {
        int min = Integer.MAX_VALUE;
        for (String[] row : arr) {
            for (String val : row) {
                int num = Integer.parseInt(val.replaceAll("[^0-9]", ""));
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }
}
    
        