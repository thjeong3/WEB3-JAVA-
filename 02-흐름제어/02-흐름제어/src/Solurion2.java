class Solution2 {
    public static int quick_solution(int n, int w, int num) {
        int warehouse_row = (int) Math.ceil((double) n / w);
        int[][] warehouse = new int[warehouse_row][w]; 
    
        int boxNumber = 1; 
    
        //1. 지그재그 방식으로 박스 채우기
        for (int i = warehouse_row - 1; i >= 0; i--) { //아래에서 위로
            if (i % 2 == 0) { 
                for (int j = 0; j < w && boxNumber <= n; j++) {
                    warehouse[i][j] = boxNumber++;
                }
            } else { 
                for (int j = w - 1; j >= 0 && boxNumber <= n; j--) {
                    warehouse[i][j] = boxNumber++;
                }
            }
        }
    
        //2. 찾을 박스(num)가 위치한 열(column) 찾기
        int findcolumn = -1;
        for (int i = 0; i < warehouse_row; i++) {
            for (int j = 0; j < w; j++) {
                if (warehouse[i][j] == num) {
                    findcolumn = j;
                    break;
                }
            }
            if (findcolumn != -1) break;
        }
    
        if (findcolumn == -1) return -1; 
    
        //3. 찾은 열의 박스 개수 세기 (위에서 아래로 탐색)
        int count = 0;
        for (int i = 0; i < warehouse_row; i++) {
            if (warehouse[i][findcolumn] != 0) {
                if(warehouse[i][findcolumn] == num){
                    break;
                }
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        System.out.println(quick_solution(13,3,6));
    }
}
