# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: TreeNode, L: int, R: int) -> int:
        output = 0
        def helper(root):
            nonlocal output
            if root != None:
                if root.val > R:
                    helper(root.left)
                elif root.val< L:
                    helper(root.right)
                else:
                    output = output + root.val
                    helper(root.left)
                    helper(root.right)
       
        helper(root)
        return output
        