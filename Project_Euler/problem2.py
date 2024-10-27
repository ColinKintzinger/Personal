curr=2
prev=1
sum=0 
tmp=0
def fib(prev, curr)->int:
    return prev+curr
while curr<=4000000:
    if curr%2==0:
        sum+=curr
    prev=curr
    curr=fib(curr, prev)
print(sum)

