package com.DSA.Array.easy;

public class ArrayapplyOperations_2460 {
	
	public int[] applyOperations(int[] nums) {
        int len =nums.length;


        int count =0;
        for (int i =0; i<len-1; i++){
            if (nums[i]!=0 ){

                if (nums[i]!=nums[i+1]){
                     nums[count++]=nums[i];

                }else{
                    
                 nums[count++]=nums[i]*2;
                  nums[i+1]=0;
                  i++;
                }
            }
          
        }
          if (nums[len-1]!=0){
               nums[ count++]=nums[len-1];
            }
        for (int i=count; i<len; i++){
           
            nums[i]=0;
        }


    return nums;
        
    }

}
