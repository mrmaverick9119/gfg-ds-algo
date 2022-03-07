package com.learn.self.ds.algo.arrays;


/*

    @author -- Kishan C

    ##### Longest span with same sum in two binary array #####

    arr1 = [0,1,1,0,1,0]
    arr2 = [1,0,1,0,1,0]

    Solution method 1 -- naive or simple solution

     TC - O(n^2)
     asc - O(1)
    Solution method 2 -- Auxiliary Space solution

*/

public class LargestSpanWithSameSumInBinaryArray {

    static int []arr1 = new int[]{0,1,1,0,1,1,0};
    static int []arr2 = new int[]{1,0,1,0,0,0,0};

    static int longestCommonSum(int n){
        int maxLen =0;
        for(int i=0;i<n;i++){
            int sum1=0; int sum2=0;
            for(int j=i;j<n;j++){
                sum1+=arr1[j];
                sum2+=arr2[j];

                if(sum1==sum2){
                    int len =j-i+1;
                    if(len>maxLen)
                        maxLen = len;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSum(arr1.length));
    }
}
