import java.util.*;

public class roman_to_int {
    char I,V,X,L,C,D,M;
    int value(char r){
            if(r==I)
                return 1;
            if(r==V)
                return 5;
            if(r==X)
                return 10;
            if(r==L)
                return 50;
            if(r==C)
                return 100;
            if(r==D)
                return 500;
            if(r==M)
                return 1000;
            return -1;
        }

    public int romanToInt(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            int s1 = value(s.charAt(i));
            if(i+1<s.length()){
                int s2=value(s.charAt(i+1));
                
                if(s1>=s2){
                    total=total+s1;
                }
                else{
                    total=total-s1;
                }
            }
            else{
                total=total+s1;
            }
        }
        return total;
    }
    public static void main(String args[]){
        roman_to_int ob=new roman_to_int();
        String s= "LXVMC";  
        System.out.println("The corresponding Integer value is:"+ ob.romanToInt(s));
    }
}


// public class Solution {                             
//     int value(char r){
//         char I,V,X,L,C,D,M;
//             if(r==I)
//                 return 1;
//             if(r==V)
//                 return 5;
//             if(r==X)
//                 return 10;
//             if(r==L)
//                 return 50;
//             if(r==C)
//                 return 100;
//             if(r==D)
//                 return 500;
//             if(r==M)
//                 return 1000;
//             return -1;
//         }

//     public int romanToInt(String s) {
//         int total=0;
//         for(int i=0;i<s.length();i++){
//             int s1 = value(s.charAt(i));
//             if(i+1<s.length()){
//                 int s2=value(s.charAt(i+1));
                
//                 if(s1>=s2){
//                     total=total+s1;
//                 }
//                 else{
//                     total=total-s1;
//                 }
//             }
//             else{
//                 total=total+s1;
//             }
//         }
//         return total;
//     }
//     public static void main(String args[]){
//         Solution ob=new Solution();
//         System.out.println("The corresponding Integer value is:"+ ob.romanToInt(s));
//     }
// }

// SOLUTION 
// class Solution {
//     public int romanToInt(String s) {
//         int nums[]=new int[s.length()];
//     for(int i=0;i<s.length();i++){
//         switch (s.charAt(i)){
//             case 'M':
//                 nums[i]=1000;
//                 break;
//             case 'D':
//                 nums[i]=500;
//                 break;
//             case 'C':
//                 nums[i]=100;
//                 break;
//             case 'L':
//                 nums[i]=50;
//                 break;
//             case 'X' :
//                 nums[i]=10;
//                 break;
//             case 'V':
//                 nums[i]=5;
//                 break;
//             case 'I':
//                 nums[i]=1;
//                 break;
//         }
//     }
//     int sum=0;
//     for(int i=0;i<nums.length-1;i++){
//         if(nums[i]<nums[i+1])
//             sum-=nums[i];
//         else
//             sum+=nums[i];
//     }
//     return sum+nums[nums.length-1];
//     }
// }