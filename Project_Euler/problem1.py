sum =0 
index: int=1

while index<1000:
    if index%3==0 or index%5==0:
        sum+=index
    index+=1
print(sum)