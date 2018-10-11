public class arraydemo {
    public static void printArray(int[]ary) {
        for (int x:ary) {
            System.out.println(x);
        }
    }
    public static void printArray(int[][]ary) {
        for (int i = 0;i < ary.length; i++) {
            for (int x = 0;x<ary[i].length;x++) {
                System.out.println(ary[i][x]);
            }
        }
    }
    public static int countZeros(int[][]nums) {
        int counter = 0;
        for (int i = 0;i < nums.length; i++) {
            for (int x = 0;x<nums[i].length;x++) {
                if (nums[i][x] == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void fill2D(int[][] vals) {
        for (int i = 0;i < vals.length; i++) {
            for (int x = 0;x<vals[i].length;x++) {
                if (i == x) {
                    vals[i][x] = 3;
                }
                else {
                    vals[i][x] = 1;
                }
            }
        }
        printArray(vals);
    }
    public static int[][] fill2DCopy(int[][] vals) {
        int[][] dict = vals;
        for (int i = 0;i < dict.length; i++) {
            for (int x = 0;x<dict[i].length;x++) {
                if (dict[i][x] < 0) {
                    dict[i][x] = 3;
                }
                else {
                    dict[i][x] = 1;
                }
            }
        }
        return dict;
    }
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5};
        /*printArray(firstArray);*/
        int[][] secondArray = {
            {0,2,-3,4,0},
            {0,2,-3,4,0}
        };
        /*printArray(secondArray);*/
        /*System.out.println(countZeros(secondArray));*/
        /*fill2D(secondArray);*/
        /*printArray(fill2DCopy(secondArray));*/
    }
}
