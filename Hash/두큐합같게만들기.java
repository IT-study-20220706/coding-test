import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        
        
        Queue<Integer> q1 = new LinkedList<>();
        
        Queue<Integer> q2 = new LinkedList<>();
        
        int answer = -1;
        long sum1 = 0;
        long sum2 = 0;
        for(int x : queue1){
            sum1 += x;
            q1.add(x);
        }
        for(int x : queue2){
            sum2 += x;
            q2.add(x);
        }
        
        long goal = (sum1+sum2)/2; // 두 큐가 맞춰야할 수
        int cnt =0;
        while(cnt<q1.size()+q2.size()*3){
            
        
        if(sum1 == goal) {
            answer = cnt;
            break;
        }else if(sum1 > goal){
            int out = q1.poll();
            q2.add(out);
            sum1 -= out;
        }else{
            int out = q2.poll();
            q1.add(out);
            sum1 += out;
        }
            cnt++;
        
        }
        
        
        return answer;
    }
}
