
//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#

class Tree {
    
    ArrayList<Integer> leftView(Node root) {
      ArrayList<Integer> ans = new ArrayList<>();
      return getLeftView(root, ans, 0); 
    }
    
    //we use a helper function in which we will pass list and level
    ArrayList<Integer> getLeftView(Node root, ArrayList<Integer> ans, int level) {
        if(root == null) {
            return ans;
        }
        
        //size of the list will be 1 more than the level we are going on because size is '1 indexed' and therefore when we find a level which is equal to size it means that level is not yet added to the list, so we add it
        if(level == ans.size()) {
            ans.add(root.data);
        }
        
        //we move to left first because it is a left view
        getLeftView(root.left, ans, level + 1);
        getLeftView(root.right, ans, level + 1);
        
        return ans;
    }
}

//Time complexity : O(n), where n is the total number of nodes in the binaary tree
//Space complexity : O(n), due to the stack space during recursive call
