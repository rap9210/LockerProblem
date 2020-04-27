public class LockerProblem {
    public static void main(String[] args){
        String lockers[] = new String[100];
        int i, j;
        for (i = 0; i<100; i++){
            lockers[i] = "X";
        }
        // Every 2nd locker is also another way of saying open every locker with a number that is a multiple of
        // 2, same with 3rd locker. So every iteration I will check that a locker number is divisible by i by using
        // module. If the <index_number>%<iteration> == 0, switch open to closed or closed to open
        for (i=1; i<=100; i++){
            for (j=1; j<=100; j++){
                if ((j%i==0)&&(lockers[j-1].equals("X"))) {
                    lockers[j-1] = "O";
                }
                else if ((j%i==0)&&(lockers[j-1].equals("O"))){
                    lockers[j-1] = "X";
                }
            }
            // Condition to organize elements in console.
            if (i%10==0) {
                System.out.print(lockers[i-1]+"\n");
            }
            else{
                System.out.print(lockers[i-1]+" ");
            }
        }
        // Print out open lockers ('O').
        System.out.println("Open Lockers: ");
        for (i=0; i<100; i++){
            if (lockers[i].equals("O")){
                if (i==99){
                    System.out.println((i+1));
                }
                else {
                    System.out.print((i + 1) + ", ");
                }
            }
        }
        System.out.println("The open lockers' number (starting at 1) are the squares of \nevery number from 1 to 10.");
    }
}
