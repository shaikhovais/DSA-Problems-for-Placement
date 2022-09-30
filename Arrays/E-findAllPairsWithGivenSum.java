
//https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1

/*      given in question
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<pair> result = new ArrayList<pair>();

        HashSet<Long> set = new HashSet<Long>();
        for(long val: B) {
            set.add(val);
        }
        int i =0;
        while(i<N){
            if(set.contains(X-A[i])){
                result.add(new pair(A[i],X-A[i]));
            }
            i++;
        }
        return result.toArray(new pair[result.size()]);
    }
}

//Time complexity : O(n * Log(n)) 
//Space complexity : O(n) 


