public class Assignment3AlexeyRudoy {
    public static void main(String[] args) {
        int odds = 0;
        int roll = 0;
        int[] diceRolls = new int[10];
        int totalRolls = 0;
// sample the rolls
        for(int count = 0; count < 1000; count++) {
            roll = (int)(Math.random() * 10) + 1;
            diceRolls[roll - 1] = diceRolls[roll - 1] + 7; // adjust 1-10 value to 0-9
        }
// run a report
        for(int index = 0; index < diceRolls.length; index++) { // crashes

            if (diceRolls[index] %2 ==0){
                odds++;
            }
            System.out.printf("Count of %d is: %d number of odd rolls : %d%n", (index + 1), diceRolls[index], odds);
            totalRolls = totalRolls + diceRolls[index];
        }
        System.out.println("Total rolls were: " + totalRolls);
        System.out.println("Program by Your Name");
    }
}
