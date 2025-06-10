import java.util.*;
public class HeapPartTwo{

 // // NearBy Cars 
    // static class Point implements Comparable<Point>{
    //     int x;
    //     int y;
    //     int distSq;
    //     int idx;

    //     public Point(int x, int y, int distSq, int idx){
    //         this.x = x;
    //         this.y = y;
    //         this.distSq = distSq;
    //         this.idx = idx;
    //     }
    //     @Override
    //     public int compareTo(Point p2){
    //         return this.distSq - p2.distSq;
    //     }
    // }

    // public static void main(String args[]){
    //     int pts[][] = {{3,3}, {5,-1},{-2,4}};
    //     int k=2;

    //     PriorityQueue<Point> pq = new PriorityQueue<>();
    //     for(int i=0; i<pts.length ; i++){
    //         int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];

    //         pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
    //     }
    //     // nearest k Cars
    //     for(int i=0 ; i<k; i++){
    //         System.out.print("C"+ pq.remove().idx +" ");
    //     }
    //     System.out.println();
    // }

// Connect N Ropes
    // public static void main(String args[]){
    //     int ropes[] = {2,3,3,4,6};

    //     PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     for(int i=0; i<ropes.length; i++){
    //         pq.add(ropes[i]);
    //     }
    //     int cost =0;
    //     while(pq.size() >1){
    //         int min = pq.remove();
    //         int min2 = pq.remove();
    //         cost += min + min2;
    //         pq.add(min + min2);
    //     }

    //     System.out.println("Cost of Connecting n ropes = " + cost);
    // }

// Weakest Soldier
    
    static class Row implements Comparable<Row>{
        int Soldier ;
        int  idx ;
        public Row(int Soldier, int idx){
            this.Soldier = Soldier;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.Soldier == r2.Soldier){
                return this.idx - r2.idx;
            }else{
                return this.Soldier - r2.Soldier;
            }
        }
    }

    public static void main(String args[]){
        int army[][]  = {{1,0,0,0},
                         {1,1,1,1},
                         {1,0,0,0},
                         {1,1,0,0},
                         {1,1,0,0}};

        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue <>();

        for(int i=0; i<army.length; i++){
            int count =0;
            for(int j=0; j<army[0].length; j++){
                count += army[i][j] == 1 ? 1: 0;
            }
            pq.add( new Row(count ,i));
        }

        for(int i=0; i<k; i++){
            System.out.println("R" + pq.remove().idx);
        }

    }

}