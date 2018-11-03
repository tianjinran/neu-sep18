import java.util.*;

class Solution4{

    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> result = new ArrayList<Interval>();

        if(intervals==null||intervals.size()==0)
            return result;

        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                if(i1.start!=i2.start)
                    return i1.start-i2.start;
                else
                    return i1.end-i2.end;
            }
        });

        Interval pre = intervals.get(0);
        for(int i=0; i<intervals.size(); i++){
            Interval curr = intervals.get(i);
            if(curr.start>pre.end){
                result.add(pre);
                pre = curr;
            }else{
                Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
                pre = merged;
            }
        }
        result.add(pre);

        return result;
    }


    public static void main(String[] Args) {
        Solution4 a = new Solution4();
        Interval x = new Interval(1,3);
        Interval y = new Interval(2,4);
        Interval z = new Interval(5,7);
        Interval v = new Interval(6,8);

        List<Interval> L = new ArrayList<>();
        L.add(0,x);
        L.add(1,y);
        L.add(2,z);
        L.add(3,v);
        System.out.println("-------Unit test-------");
        System.out.println(L);
        System.out.println("should print [(1,4),(5,8)], actually is " + a.merge(L));
        System.out.println("-----------------------");
    }




}

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }

    public String toString(){
        String s = "(" + this.start + "," + this.end +")";
        return s;
    }

}

