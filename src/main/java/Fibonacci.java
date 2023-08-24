public class Fibonacci {
    public static int calculateFibonacci(int number) {
        // number ist die n-te Stelle der Folge
        int[] toBeCalculated = {0, 1};

        if(number == 0){
            return 0;
        }
        if(number == 1) {
            return 1;
        }
        // Bis hier erste 3 Eingaben


        int returnFibonacci = 0;
        for(int i = 1; i < number; i++){
            returnFibonacci = toBeCalculated[0] + toBeCalculated[1];
            toBeCalculated[0] = toBeCalculated[1];
            toBeCalculated[1] = returnFibonacci;
        }

        return returnFibonacci;
    }
}
