 import java.util.*;
public class jobsequencingproblem {
    static class job{
        int profit;
        int deadline;
        int id;
        public job(int i, int d, int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs= new ArrayList<>(); // object arraylist of job class
       for(int i=0;i<jobInfo.length;i++){
        jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));
       }
       Collections.sort(jobs,(obj1,obj2) ->obj2.profit-obj1.profit);

       ArrayList<Integer>sequence=new ArrayList<>();
       int  time=0;

       for(int i=0;i<jobs.size();i++){
        job curr=jobs.get(i);// curr is of job type not int
        if(curr.deadline>time){
            sequence.add(curr.id);
            time++;
        }

       }
       System.out.println("no of jobs= "+ time);
       for(int i=0;i<sequence.size();i++){
        System.out.println(sequence.get(i));
       }

    }
    
}
