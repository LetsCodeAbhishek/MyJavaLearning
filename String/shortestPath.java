import java.util.*;
public class shortestPath{
    public static float getPath(String path){
        int x=0;
        int y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //soith;
            if(dir=='S'){
                y--;
            }else if(dir=='N'){
                // north
                y++;
            }else if(dir == 'W'){
                //west
                x--;
            }else{
                // East
                x++;
            }
        }
        float x2 =x*x;
        float y2 =y*y;
        float sPath =  (float)Math.sqrt(x2+y2);

        return sPath;
    }

    public static void main(String args[]){
        String path = "NNNNEEE";

        System.out.println("Shotest path "+ getPath(path));

    }
}