public class EX10_2차배열탐색 {
    public static void main(String[] args) {
        int[][] foo={{1,2,3},{10,20,30}};

        for(int i=0;i<foo.length;i++){
            System.out.printf("%d번째 행\n",i);
            for(int j=0;j<foo[i].length;j++){
                System.out.printf("\t%d번째 열: %d\n",j,foo[i][j]);
            }
        }
    }
}
