package org.testleaf.week3.day2;

import java.util.Arrays;

public class MissingArray {
    public static void main (String args[]){
        int gnArray[]={1,4,3,2,8,6,7};
        Arrays.sort(gnArray);
        System.out.println(Arrays.toString(gnArray));
        for(int i=0;i<gnArray.length;i++){
            
            if(gnArray[i]!=i+1){
                System.out.println("this is the missing value: "+(i+1));
                break;
            }




        }


        

    }

}
