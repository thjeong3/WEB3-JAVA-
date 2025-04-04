public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = (char)(k + '0');

        for (int n = i; n <= j; n++) {
            String str = String.valueOf(n);
            for (char ch : str.toCharArray()) {
                if (ch == target) {
                    answer++;
                }
            }
        }  
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(1,13,1));
    }
}