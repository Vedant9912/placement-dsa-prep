listt=[2,7,11,15]
target=9

for i in range(len(listt)):
    for j in range(i+1, len(listt)):  # NOte yaha change
        a = listt[i] + listt[j]
        if target == a:
            print(listt[i], listt[j])



def twoSum(nums, target):
    mp = {}                       # yaha pe hum already visited numbers store karte hain

    for i, val in enumerate(nums):  
        rem = target - val        # complement calculate

        if rem in mp:             # agar complement pehle aaya hoga
            return [mp[rem], i]   # wahi answer hai

        mp[val] = i               # warna current number store kar do
print(twoSum(listt,target))


2missing number
arr=[0,1,2,3,4,5]
print((len(arr))*(len(arr)+1)/2 - sum(arr))


4. duplicate number
arr=[1,1,2,3]
print(sum(arr) - (len(arr)-1)*(len(arr)-1+1)/2)



5. Move Zeores\\
nums=[0,1,0,3,2]
pos=0
for i in nums:
    if i!=0:
       nums[pos]=i
       pos=pos+1

while pos<len(nums):
    nums[pos]=0
    pos=pos+1

print(nums)



6. majority element

nums=[2,2,1,1,1,2,2]
for i in nums:
    a=nums.count(i)
    if a > len(nums)/2:
        print(i)
        break



count = 0
candidate = None

for num in nums:
    if count == 0:
        candidate = num
    count += 1 if num == candidate else -1

print(candidate)



7. buy and sell stock
prices = [7,1,5,3,6,4]
maxx = 0

for i in range(len(prices)):           # i = index
    for j in range(i+1, len(prices)):  # j = future index
        a = prices[j] - prices[i]      # future price - buy price
        if a > maxx:
            maxx = a

print(maxx)


arr=[16,17,4,3,5,2]

leader = arr[-1]
a = [leader]

for i in range(len(arr)-2, -1, -1):   # start from second last
    if arr[i] > leader:
        leader = arr[i]
        a.append(leader)

print(a)

    



a=[-1,1,0,-3,3]
answer=[]

for i in range(len(a)):
    product=1
    for j in range(len(a)):
        if i==j:
            continue
        else:
            product*=a[j]
    answer.append(product)
print(answer)




a = [1,2,3,4]

n = len(a)
answer = [1] * n

# LEFT products
left = 1
for i in range(n):
    answer[i] = left
    left *= a[i]

# RIGHT products
right = 1
for i in range(n-1, -1, -1):
    answer[i] *= right
    right *= a[i]

print(answer)




#Subarray with Given Sum
a=[1,4,20,3,10,5]
target=33
i=0
b=0
summ=0
while i<len(a):
    if summ>target:
        summ-=a[b]
        b=b+1
        continue
    else:
        if summ==target:
            break
        summ+=a[i]
        i=i+1

print(summ)
print(b,i-1)



peak element


nums=[1,2,1,4,5,6]
low=0
high=len(nums)-1
while low<high:
    mid=(low+high)//2
    if nums[mid]<nums[mid+1]:
        low=mid+1
    else:
        high=mid
print(low)



nums=[1,7,3,6,5,6]
total = sum(nums)
leftsum = 0

for i in range(len(nums)):
    rightsum = total - leftsum - nums[i]
    if leftsum == rightsum:
        print(i)
        break
    leftsum += nums[i]
else:
    print(-1)



14 spiral matrix traversal

matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

res = []

top = 0
bottom = len(matrix) - 1
left = 0
right = len(matrix[0]) - 1

while top <= bottom and left <= right:

    # 1. left → right
    for i in range(left, right + 1):
        res.append(matrix[top][i])
    top += 1

    # 2. top → bottom
    for i in range(top, bottom + 1):
        res.append(matrix[i][right])
    right -= 1

    if top <= bottom:
        # 3. right → left
        for i in range(right, left - 1, -1):
            res.append(matrix[bottom][i])
        bottom -= 1

    if left <= right:
        # 4. bottom → top
        for i in range(bottom, top - 1, -1):
            res.append(matrix[i][left])
        left += 1

print(res)



15...longest consecutive sequence

nums=[9,1,20,2,3]
nums_set=set(nums)
maxx=0

for num in nums_set:
    if num-1 in nums_set:
        continue
    
    a=0
    while num+a in nums_set:
        a += 1
    
    maxx=max(maxx, a)

print(maxx)



16 Two Pointer  Container With Most Water


height=[1,8,6,2,5,4,8,3,7]
maxx=0
for i in range(len(height)):
    j=i+1
    while j < len(height):
        v=(j-i)*min(height[i],height[j])
        j=j+1
        if v > maxx:
            maxx=v
print(maxx)









18 Merge two Sorted Arrays 
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3

i=m-1
j=n-1
k=m+n-1

while i>=0 and j>=0:
    if nums1[i]>nums2[j]:
        nums1[k]=nums1[i]
        i-=1

    else:
        nums1[k]=nums2[j]
        j-=1
    
    k-=1

while j>=0:
    nums1[k]=nums2[j]
    j-=1
    k-=1


print(nums1)




Rearrange arrray alternately



def rearrange(nums):
    n=len(nums)
    maxidx=n-1
    minidx=0
    maxelem=nums[-1]+1

    for i in range(n):
        if i %2==0:
            nums[i]=nums[i]+(nums[maxidx]%maxelem)*maxelem
            maxidx-=1
        else:
            nums[i]=nums[i]+(nums[minidx]%maxelem)*maxelem
            minidx+=1
    for i in range(n):
        nums[i]=nums[i]//maxelem

nums=[1,2,3,4,5,6]
print(nums)



arr = [2, 5, 8, 12, 30]
target = 20
left=0
right=len(arr)-1
found=False

while right>left:
    summ=arr[left]+arr[right]
    if summ>target:
        right-=1
    elif summ<target:
        left+=1
    else:
         found=True
         break
print(found)


20. Count Frequency

def countf(nums):
    freq={}
    for i in nums:
        if i in freq:
            freq[i]+=1
        else:
            freq[i]=1
    return freq

nums=[1,1,2,2,3]
print(countf(nums))




str1=input().lower()
str2=input().lower()

if sorted(str1)==sorted(str2):
    print("anogram")
else:
    print("not anogram")




class Listnode():
    def __init__(self,data):
        self.data=data
        self.next=None










A=Listnode(10)

while Listnode.next==None:
    print(Listnode.data)


duplicating ARARAT
def removearr(arr):
    if not arr:      # edge case handle
        return []
    write =1
    for read in range(1,len(arr)):
        if arr[read] != arr[read-1]:
            arr[write]=arr[read]
            write+=1
        else:
            pass
    return arr[:write]
v=[1,2,3,4,4,4,5,5,5,6,7]
print(removearr(v))


v=[1,2,3,3,4,4,4,5,6,6,6,7]
print(removearr(v))
