import java.util.*;
public class TrapWater{

     public static int TrapRain_water(int height[]){
        int n = height.length;
        // calculate left boundary-- Array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //  calculate right boundary--Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trapwater = 0;
        // loop
        for(int i=0; i<n; i++){
            // waterLevel -- min(leftMax boun. , rightMax boun.)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trapprd water = waterLevel + height[i];
            trapwater += waterLevel - height[i];
        }
        return trapwater;
     }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        int res= TrapRain_water(height);
        System.out.println("Trap Water "+res);
        
    }
}