package bfds.carpet;

class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = new int[] {0, 0};
        for(int i = 3; i <= Math.round(brown/2); i++){
            if((brown + red)%i == 0){
                int x = Math.max((brown + red)/i, i);
                int y = Math.min((brown + red)/i, i);
                if((x-2)*(y-2) == red){
                    answer[0] = x;
                    answer[1] = y;
                }
            } 
        }
        return answer;
    }
}