class SumFormation{
    public static void main(String []args){
        final int[] arr = {1,2,4,4};
        final int sum = 8;

        badSolution(arr, sum);
        goodSolution(arr, sum);
    }

    public static boolean badSolution(int[] arr, int sum){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                if((arr[i] + arr[j]) == sum && i != j ){
                    return true;
                }
            }
        }

        return false;
    }

    public static void goodSolution(int[] arr, int sum){
        
    }
}