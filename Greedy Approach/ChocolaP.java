    package pkg;                                                                                                       class display 

    {

        int x;

        void show() 

        {

            if (x > 1)

                System.out.print(x + " ");

        }

    }

   public class ChocolaP

    {

        public static void main(String args[]) 

        {

            display[] arr=new display[3];

            for(int i=0;i<3;i++)

                arr[i]=new display();

            arr[0].x = 1;      

            arr[1].x = 1;

            arr[2].x = 2;

            for (int i = 0; i < 3; ++i)

                arr[i].show();

         }

    }




// import java.util.*;
// public class ChocolaP{
//     public static void main(String args[]){
//         int n=4 , m=6;

//         Integer costVer[] = {2,1,3,1,4};
//         Integer costHor[] = {4,1,2};

//         Arrays.sort(costVer, Collections.reverseOrder());
//         Arrays.sort(costHor, Collections.reverseOrder());

//         int h=0, v=0;
//         int hp = 1, vp = 1;
//         int cost =0;

//         while( h<costHor.length && v<costVer.length){
//             if(costVer[v] <= costHor[h]){
//                 cost += (costHor[h] * vp);
//                 hp++;
//                 h++;
//             }else{
//                 cost += (costVer[v] * hp);
//                 vp++;
//                 v++;

//             }
//         }
//         while(h < costHor.length){
//             cost += (costHor[h] * vp);
//             hp++;
//             h++;
//         }
//         while(v < costVer.length){
//             cost += (costVer[v] * hp);
//             vp++;
//             v++;
//         }

//         System.out.println("Min cost of cuts = " + cost);
//     }
// }