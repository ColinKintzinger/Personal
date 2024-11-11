curr=1
prev=0
sum=0
count = 0
while sum<4000000:
    if curr%2==0:
        sum+=curr
        count+=1
        temp=curr
        curr+=prev
        prev=temp
    else:
        count+=1
        temp=curr
        curr+=prev
        prev=temp
print(sum)

