public class LockerProblem {
    public static void main(String[] args){
        String lockers[] = new String[100];
        int i, j;
        for (i = 0; i<100; i++){
            lockers[i] = "X";
        }
        for (i=1; i<=100; i++){
            for (j=1; j<=100; j++){
                if ((j%i==0)&&(lockers[j-1].equals("X"))) {
                    lockers[j-1] = "O";
                }
                else if ((j%i==0)&&(lockers[j-1].equals("O"))){
                    lockers[j-1] = "X";
                }
            }
            if (i%10==0) {
                System.out.print(lockers[i-1]+"\n");
            }
            else{
                System.out.print(lockers[i-1]+" ");
            }
        }
    }
}
