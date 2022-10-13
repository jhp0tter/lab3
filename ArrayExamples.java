public class ArrayExamples {
    // Changes the input array to be in reversed order
    static void reverseInPlace(int[] arr) {
        int[] oldArr = arr.clone();
        for(int i = 0; i < arr.length; i += 1) {
            arr[i] = oldArr[arr.length - i - 1];
        }
    }

    // Returns a *new* array with all the elements of the input array in reversed
    // order
    static int[] reversed(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i += 1) {
            newArr[i] = arr[arr.length - i - 1];
        }
        return newArr;
    }

    // Averages the numbers in the array (takes the mean), but leaves out the
    // lowest number when calculating. Returns 0 if there are no elements or just
    // 1 element in the array
    static double averageWithoutLowest(double[] arr) {
        if(arr.length < 2) { return 0.0; }
        double lowest = arr[0];
        for(double num: arr) {
            if(num < lowest) { lowest = num; }
        }
        double sum = 0;
        double numLowest = 0;
        for(double num: arr) {
            if(num == lowest) numLowest++;
            else sum += num;
        }
        return sum / (arr.length - numLowest);
    }
}
