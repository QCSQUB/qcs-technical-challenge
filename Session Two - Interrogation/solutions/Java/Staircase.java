class Staircase{
    public static void main(String []args){
        final int n = 6;

        badSolution(n);

        System.out.println();

        goodSolution(n);
    }

    /**
     * This method is used to demonstrate a "bad" solution
     * Can you identify why this solution might be considered bad?
     * 
     * @param n This is the base and height value for the staircase
     */
    public static void badSolution(int n){
        System.out.println("--- Bad Solution --- \n");

        for(int i = 0; i < n; i++){
            int split = n - i;

            for(int j =0; j <= split; j++){
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++){
                System.out.print("#");
            }

            System.out.println();
        }
    }

    /**
     * This method is here to allow you to attempt an improvement
     * upon the bad solution.
     * 
     * Feel free to give it a go, if you need help just wave
     * 
     * @param n This is the base and height value for the staircase
     */
    public static void goodSolution(int n){
        System.out.println("--- \"Good\" Solution --- \n");

        for(int i = 0; i <= n; i++){
            int split = n - i;

            for(int j = 0; j <= n; j++){
                String output = (j <= split) ? " " : "#";
                System.out.print(output);
            }

            System.out.println();
        }
    }
}