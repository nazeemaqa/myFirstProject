public class FindPairsWithSum {


        public static void main(String[] args) {
            int[] arr = {2, 4, 3, 5, 7, 8};
            int Sum = 10;
            System.out.println("Pairs with sum " + Sum + " are:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == Sum) {
                        System.out.println(arr[i] + " + " + arr[j] + " = " + Sum);
                    }
                }
            }
        }
    }







