public class JPA403 {
    public static void main(String[] args) {
        int array1[][] = {{1 , 2 , 3} , {4 , 5 , 6}};
        int array2[][] = {{7 , 8 , 9} , {10 , 11 , 12}};
        System.out.println("陣列A的內容為(3x3):");
        outputarray(array1);
        System.out.println("陣列B的內容為(3x3):");
        outputarray(array2);
        System.out.println("陣列A+B=C，陣列C的內容為(3x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d" , array1[i][j] + array2[i][j]);
            }
            System.out.println();
        }
    }
    public static void outputarray(int[][] array){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d" , array[i][j]);
            }
            System.out.println();
        }
    }
}
