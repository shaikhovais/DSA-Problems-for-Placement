
//https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

class Solution {
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        
        //Treemap is used because keys stored in it will be sorted
        Map<Integer, Integer> map = new TreeMap<>();
        
        //We take queue to do level order traversal and add in treemap
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(0, root));
        
        while(!qu.isEmpty()) {
            Pair currentPair = qu.poll();
            
            int horizontalDistance = currentPair.horizontalDistance;
            Node currentNode = currentPair.node;
            
            //Whether map contains any value for that horizontalDistance or not, we add the value in map
            map.put(horizontalDistance, currentNode.data);
            
            //'-1' because horizontal distance on left will be less and similarly '+1' when we move on right
            if(currentNode.left != null) {
                qu.add(new Pair(horizontalDistance - 1, currentNode.left));
            }
            if(currentNode.right != null) {
                qu.add(new Pair(horizontalDistance + 1, currentNode.right));
            }
        }
        
        //We can directly print from map but in most of the online coding platform they ask us to return arraylist
        for(Map.Entry <Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        
        return ans;
        
    }
}

//We create a pair class to associate every node with their horizontal distance
class Pair {
    int horizontalDistance;
    Node node;
    public Pair (int horizontalDistance, Node node) {
        this.horizontalDistance = horizontalDistance;
        this.node = node;
    }
}

//Time complexity : O(n), where n is the total number of nodes in the binaary tree
//Space complexity : O(n), due to the queue and map of 'n' size