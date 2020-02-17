# Description
Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.

# Example 1:
Input:
```
[5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

```
Output:
```
[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9  
 ```

# Explanation:

```
The idea is to go to the left part of the tree.

res = self.increasingBST(root.left, root)
# Here we are traversing left part of the tree and here the tail/next node is our current node.
So we get 1 2 3,
when we get to 4 we can see that for all the right nodes tail/next pointer is basically the parent of the parent. Example - for node-4 tail will be 5.
Otherwise tail is the parent.
Therefor

if not root: return tail
#returns tail is its parent if None Node was a left Child 
#returns tail is its parent's parent if None Node was a right child 
The statement root.left means as we are creating a right-skewed tree or singly linked list we just need to go to the right direction. SO we are just putting a None to the left part of the tree/List.

 root.right = self.increasingBST(root.right, tail)
# returns parent's parent if right child else left child

 return res
# we return the leftmost node as root

```

 


