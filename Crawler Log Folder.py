class Solution(object):
    def minOperations(self, logs):
        """
        :type logs: List[str]
        :rtype: int
        """
        stack=[]
        for i in range(len(logs)):
            if logs[i] =="./":
                continue
            elif logs[i]=="../":
                if stack:
                    stack.pop()
            else:
                stack.append(logs[i])
        return len(stack)
