



    
    //https://leetcode.com/problems/next-greater-element-ii/ (Circular array)

    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int ans[] = new int[n];
            Stack <Integer> st = new Stack<>();
            
            //We start traversing the array from right
            for(int i = (n*2)-1; i >= 0; i--) {
                
                //while stack is not empty and the element on top is smaller than the nums[i], we keep on popping
                while(!st.isEmpty() && st.peek() <= nums[i % n]) {
                    st.pop();
                }
                
                //If stack is empty, it means no element on the right side is greater so we assign -1, else we assign st.peek()[topmost element of stack]
                if(st.isEmpty()) {
                    ans[i % n] = -1;
                } else {
                    ans[i % n] = st.peek();
                }
                st.push(nums[i % n]);
            }
            return ans;
        }
    }

    //https://leetcode.com/problems/next-greater-element-i/(Subset of a bigger set)

    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums) {
            Stack <Integer> st = new Stack<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            int n = nums.length;
            
            //We get next greater element for the super set and instead of putting it in array we put it in map so that we can later access it by key
            for(int i = n - 1; i >= 0; i--) {
                while(!st.isEmpty() &&st.peek() <= nums[i]) {
                    st.pop();
                }
                if(!st.isEmpty()) {
                    map.put(nums[i], st.peek());
                } else {
                    map.put(nums[i], -1);
                }
                st.push(nums[i]);
            }
            
            //We get the value of each element of nums1 from map by using key
            for(int i = 0; i < nums1.length; i++) {
                nums1[i] = map.get(nums1[i]);
            }
            
            return nums1;
        }
    }

    //https://www.codingninjas.com/codestudio/problems/799354?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website (Normal NGE)

    import java.util.Stack;
    public class Solution {
        
        public static int[] nextGreater(int[] arr, int n) {	
            Stack<Integer> st = new Stack<>();
            int nge[] = new int[n];
            
            for(int i = n - 1; i >= 0; i--) {
                while(!st.isEmpty() && st.peek() <= arr[i]) {
                    st.pop();
                }
                if(!st.isEmpty()) {
                    nge[i] = st.peek();
                } else {
                    nge[i] = -1;
                }
                st.push(arr[i]);
            }
            return nge;
        }

    }


