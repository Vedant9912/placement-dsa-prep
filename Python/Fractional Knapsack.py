arr=[(100,20),(60,20),(100,50),(200,50)]
arr.sort(key=lambda x: x[0]/x[1] , reverse = True)
w=100
weight=0
itemv=0
i=0
while weight<w and i<len(arr):
    
    if weight + arr[i][1] <= w:
        itemv+=arr[i][0]
        weight+=arr[i][1]
    else:
        itemv+=(arr[i][0]/arr[i][1])*(w-weight)
        weight+=w-weight
        break
    i+=1

# print(arr)
print(itemv)
print(weight)
