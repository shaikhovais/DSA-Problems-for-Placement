
//https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1

class Solution{
    
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        return getRightView(root, ans, 0); 
    }
    
    //we use a helper function in which we will pass list and level
    ArrayList<Integer> getRightView(Node root, ArrayList<Integer> ans, int level) {
        if(root == null) {
            return ans;
        }
        
        //size of the list will be 1 more than the level we are going on because size is '1 indexed' and therefore when we find a level which is equal to size it means that level is not yet added to the list, so we add it
        if(level == ans.size()) {
            ans.add(root.data);
        }
        
        //we move to right first because it is a right view
        getRightView(root.right, ans, level + 1);
        getRightView(root.left, ans, level + 1);
        
        return ans;
    }
}

//Time complexity : O(n), where n is the total number of nodes in the binaary tree
//Space complexity : O(n), due to the stack space during recursive call
