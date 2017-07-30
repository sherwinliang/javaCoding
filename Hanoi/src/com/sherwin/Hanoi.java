package com.sherwin;

public class Hanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
     
    /**
     * the implementation of hanoi, move all the plates from stick-src to stick-dest
     * @param n the amount of plates
     * @param src the first stick
     * @param assist the middle stick
     * @param dest the destination stick
     */
    public static void hanoi(int n,char src,char mid,char dest){
        if (n==1){
            move(src,dest);
        }
        else{
            //move n-1 plates from stick-src to stick-mid ,assisted by stick-dest
            hanoi(n-1,src,dest,mid);
            //move the left 1 plate to the stick-dest directly
            move(src,dest);
            //move the left n-1 plates from stick-mid to sitck-dest
            hanoi(n-1,mid,src,dest);
             
        }
    }
     
    public static void move(char src,char dest){
        System.out.println("Move the plate from " + src +" to "+ dest );
    }
}
