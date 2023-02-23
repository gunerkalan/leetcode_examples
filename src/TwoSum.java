import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] res = twoSum(new int[]{3, 2, 4}, 6);
         displayArray(res);

    }

    public static void displayArray(int[] twoSumArray){
        for(int i=0; i<twoSumArray.length; i++){
            if((i+1) %2 ==0)
                System.out.println(twoSumArray[i]);
            else
                System.out.print(twoSumArray[i]+ ",");
        }
    }

    public static int[] twoSum(int[] nums, int target){

        int[] result = new int[2];
        if(nums.length<2){
            return result;
        }
        int d=0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            d= target - nums[i];
            if(m.get(d) !=null){
                result[0] = m.get(d);
                result[1] = i;
                break;
            }
            else {
                m.put(nums[i],i);
            }
        }

        return result;
    }

}
