package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProblemSolution {


//    public static int[] twoSum(int[] inputArray , int target){
//        if(inputArray ==null || inputArray.length<2){
//            throw new IllegalArgumentException("Invalid Input Array ");
//        }
//
//       for(int i=0; i<inputArray.length; i++){
//           for(int j=i+1; j <inputArray.length; j++){
//               int result = target - inputArray[i];
//
//               if(inputArray[j] == result){
//                   return new int[]{i,j};
//               }
//           }
//       }
//        throw new IllegalArgumentException("No Match Found");
//    }


    public static int[] twoSums(int[] inputArray , int target){
        if(inputArray ==null || inputArray.length<2){
            throw new IllegalArgumentException("Invalid Input Array ");
        }

        Map<Integer,Integer> trackerMap = new HashMap<>();

        for(int i = 0; i<inputArray.length; i++){
            int reminder= target - inputArray[i];
            if(trackerMap.containsKey(reminder)){
                return new int[]{trackerMap.get(reminder),i};
            }
            trackerMap.put(inputArray[i],i);
        }
        throw new IllegalArgumentException("No Match Found");
    }

    public static void main(String a[]){


//     * Example 1:
//     *
//     * Input: nums = [2,7,11,15], target = 9
//                * Output: <[2,7]>
//     * Explanation: Because nums[0] + nums[1] == 9, we return <[2,7]>.
        int[] i = {2,7,11,15};
        System.out.println(Arrays.toString(twoSums(i, 9)));
//
//     * Example 2:
//     *
//     * Input: nums = [3,2,4,-3,9], target = 6
//                * Output: <[2,4], [-3,9]>
        i =new int[]  {3,2,4,-3,9};
        System.out.println(Arrays.toString(twoSums(i, 6)));


//     * Example 3:
//     *
//     * Input: nums = [3,3], target = 6
//                * Output: <[3,3]>
         i =new int[] {3,3};
        System.out.println(Arrays.toString(twoSums(i, 6)));
    }
}
