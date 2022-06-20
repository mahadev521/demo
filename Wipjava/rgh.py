# from collections import Counter
# def getUniqueCharacter(s):
#     st=list(filter(lambda x: x[1]==1,Counter(s).most_common()))
#     if st:
#         return s.index(st[0][0])+1
#     return -1
    
    
# s='statistics'
# return getUniqueCharacter(s)



# def getMinimumCost(arr):
#     cost = mcost= fdx=sdx=0
#     for i in range(len(arr)-1):
#         first = arr[i]
#         second = arr[i+1]
#         if abs(second-first) > mcost:
#             mcost = abs(second-first)
#             fdx = i
#             sdx = i + 1
#     mid = (arr[fdx] + arr[sdx]) // 2
#     cost += (arr[fdx] - mid) * (arr[fdx] - mid)
#     cost += (arr[sdx] - mid) * (arr[sdx] - mid)
#     for i in range(len(arr)-1):
#         if i == fdx:
#             continue
#         first = arr[i]
#         second = arr[i+1]
#         cost += (first - second) * (first - second)
#     return cost

# from math import ceil
# def fun(n,r,b):
#     if r+b>n or r>ceil(n/2) or b>ceil(n/2): return 'idiots'
#     if n-r<b: return 'idiots'
#     elif n-b<r: return 'idiots'
#     return 'How very smart'

# for _ in range(int(input())):
#     n,r,b=map(int,input().split())
#     print(fun(n,r,b))
    
from math import prod,log
def fun(l):
    for i in range(q):
        ll,hl,el=map(int,input().split())
        p=prod(l[ll-1:hl])
        x=int(log(p,el))
        while x>0:
            if (el**x)<p:
                if p%(el**x)==0:
                    return x
            x-=1
        return 0
                
            
for _ in range(int(input())):
    n,q=map(int,input().split())
    l=[int(x) for x in input().split()]
    for i in range(q):
        print(fun(l))

# print(int(log(576,71)))