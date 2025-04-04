import java.util.Random;

public class Solution {
    /*숫자 카드 더미는 1~100까지의 카드가 있음
    2~100중 하나를 정해 그 수보다 작거나 같은 숫자 카드+준비한 카드의 수만큼 '작은 상자'를 준비
    상자에 카드를 한 장씩 넣고 무작위로 섞어 일렬로 나열 후, 해당 상자에 1번부터 순차적으로 증가하는 번호를 붙임
    아무 상자 하나 열어서 나온 번호와 같은 또다른 상자를 연다. 이 과정을 이미 연 상자에 도착할 때까지 반복한다.
    그리고 이미 연 상자를 따로 빼서 1번 그룹을 만든다.
    만약 모든 상자가 1번 그룹이면 바로 0을 리턴한다. 남은 상자를 가지고 2번 그룹을 만든다. 이 때, 1번 그룹의 상자 갯수x2번 그룹의 상자 갯수를 리턴한다.
     */
    /*구성:cards가 들어있는 배열.+visited 배열.
     먼저, 
     */
    public static int solution(int[] cards) {
        int answer = 0;
        int cards_length = cards.length;
        int group1=0,group2=0;
        boolean[] visited = new boolean[cards_length];

        Random rand = new Random();
        int startbox = rand.nextInt(cards_length);

        while(true){
            if(visited[startbox]){
                break;
            }
            visited[startbox] = true; 
            startbox = cards[startbox] - 1;
            group1++;
        }
        while(true){
            if(visited[startbox]){
                break;
            }
            visited[startbox] = true; 
            startbox = cards[startbox] - 1;
            group2++;
        }
        answer = group1+group2;

        return answer;
    }
    public static void main(String[] args) {
        int[] input_card={8,6,3,7,2,5,1,4};
        System.out.println(solution(input_card));
    }
}

