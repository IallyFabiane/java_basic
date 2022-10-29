public class ArraydeArrays {
    public static void main(String[] args) {
        int[][] multiArr = {{1, 2, 3}, {4, 5}};
        System.out.println(multiArr[0][0]); //one item
        for(int i = 0; i < multiArr.length; i++) {
            for(int j = 0; j < multiArr[i].length; j++) {
                System.out.println(multiArr[i][j]); //all the items
            }
        }
    }
}
