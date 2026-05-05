class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        maximum=0
        def height(node):
            nonlocal maximum
            if node==None:
                return 0
            leftheight=height(node.left)
            rightheight=height(node.right)
            maximum=max(maximum,leftheight+rightheight)
            return 1+ max(leftheight,rightheight)
        height(root)
        return maximum
