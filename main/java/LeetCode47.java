import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode47 {
//Given a collection of numbers, nums, that might contain duplicates,
// return all possible unique permutations in any order.
    public static void main(String[] args) {
        int[] example1 = new int[] {1,1,2};
        int[] example2 = new int[] {1,2,3};

        System.out.println(permuteUniq(example1));
        System.out.println(permuteUniq(example2));
    }


    public static List<List<Integer>> permuteUniq(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        boolean[] freq = new boolean[nums.length];
        permutations(nums,freq,set,new ArrayList<>());
        for(List<Integer> perm: set){
            ans.add(perm);
        }
        return ans;
    }

    public static void permutations(int[] nums, boolean[] freq, Set<List<Integer>> set, List<Integer> perms){
        if(perms.size() == nums.length){
            set.add(new ArrayList<>(perms));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                perms.add(nums[i]);
                permutations(nums,freq,set,perms);
                perms.remove(perms.size()-1);
                freq[i] = false;
            }
        }
    }
}
