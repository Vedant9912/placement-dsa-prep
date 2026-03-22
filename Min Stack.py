class MinStack(object):

    def __init__(self):
        self.Main_Stack=[]
        self.Min_Stack=[]
        

    def push(self, val):
        self.Main_Stack.append(val)

        if not self.Min_Stack or self.Min_Stack[-1]>val:
            self.Min_Stack.append(val)

        else:
            self.Min_Stack.append(self.Min_Stack[-1])
        

    def pop(self):
        if self.Main_Stack:
            self.Main_Stack.pop()
            self.Min_Stack.pop()
        

    def top(self):
        return self.Main_Stack[-1]

        

    def getMin(self):
       return self.Min_Stack[-1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
