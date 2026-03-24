class Solution(object):
    def evalRPN(self, s):
        """
        :type s: str
        :rtype: int
        """
        stack=[]
        for i in range(len(s)):
            if s[i] in "+-/*":
                a=stack.pop()
                b=stack.pop()
                if s[i] == "+":
                    c=b+a
                if s[i] == "-":
                    c=b-a
                if s[i] == "/":
                    c=int(b/a)
                if s[i] == "*":
                    c=b*a
                stack.append(c)
            else:
                stack.append(int(s[i]))
        return stack[0]

        
