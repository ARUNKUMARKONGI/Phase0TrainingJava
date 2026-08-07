package Arrays1D2DProblems.Arrays1D;
import java.util.*;
import java.util.*;

public class CollectingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0;i<n;i++) height[i] = sc.nextInt();

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        for(int i=1;i<n;i++) 
            left[i] = Math.max(left[i-1], height[i]);

        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--) 
            right[i] = Math.max(right[i+1], height[i]);

        int total = 0;
        for(int i=1;i<n-1;i++) 
            total += Math.min(left[i], right[i]) - height[i];

        System.out.println(total);
    }
}


/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it can trap after raining
 Water fills valleys between taller bars.
If one side (left or right) is lower than the other, water can spill over that lower side.
Therefore the maximum stable water level at position i cannot exceed the height of the lower of the two boundaries (tallest left, tallest right). Water higher than the lower boundary would flow away.
So the water level above i = min(left_max, right_max).
The actual water depth above bar i is that level minus the solid bar height 
height[i] 
water_depth[i] = water_level - height[i] = min(left_max, right_max) - height[i]
If height[i] is already at or above that level, depth ≤ 0 → no water.


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
*/


/* 2 pointer approach
int left = 0;
        int right = n - 1;
        int left_max = 0;
        int right_max = 0;
        int total = 0;

        while(left <= right) {
            if(h[left] <= h[right]) {
                if(h[left] >= left_max) left_max = h[left];
                else total += left_max - h[left];
                left++;
            } else {
                if(h[right] >= right_max) right_max = h[right];
                else total += right_max - h[right];
                right--;
            }
        }

        System.out.println(total);


left_max  = highest bar seen so far from the left
right_max = highest bar seen so far from the right

Whichever side is SHORTER is the limiting boundary.
So move that side inward and compute water using its max.
The taller side is guaranteed to trap water later.
Why This Algorithm Works:
• Water above a bar depends on the shorter side, not the taller side.
• When h[left] ≤ h[right], the left boundary decides the water.
• When h[right] < h[left], the right boundary decides the water.
• left_max ensures left boundary height is known.
• right_max ensures right boundary height is known.
• At each step, we calculate:
water_at_index = boundary_height − bar_height
 */