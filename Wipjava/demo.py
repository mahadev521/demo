# def fun(height):
#     lef= maxl = maxr = res = 0
#     rig=len(height)-1
#     while lef <= rig:
#         if height[lef] < height[rig]:
#             if maxl > height[lef]: 
#                 res += (maxl-height[lef])
#             else: 
#                 maxl = height[lef]
#             lef += 1
#         else:
#             if maxr > height[rig]: 
#                 res += (maxr-height[rig])
#             else: 
#                 maxr = height[rig]
#             rig -= 1
#     return res

# n=int(input())
# height=[int(i) for i in input().split()]
# print(fun(height))

# def fun(n,k):
#     res=[]
#     cur=[]
#     nums=['0','1','2','3','4','5','6','7','8','9']
#     def solve(i):
#         if len(cur)>=2:
#             if abs(int(cur[-1])-int(cur[-2]))!=1:
#                 return
#         if len(cur)==n and cur[0]!='0':
#             temp=int("".join(cur[:]))
#             if temp>k:
#                 return 12
#             res.append(temp)
#             return
#         if len(cur)>n:
#             return
#         if i>=10:
#             return
#         for j in range(0,len(nums)):
#             cur.append(nums[j])
#             x= solve(j)
#             if x==12:
#                 break
#             cur.pop()
#     solve(0)
#     return res


# q=input()
# temp= fun(len(q),int(q))
# if temp:
#     print(temp[-1])
# else:
#     print(fun(len(q)-1,int(q))[-1])



# def fun(coins,amount):
#     count, prev = 0, 1 << amount        
#     while prev & 1 == 0:
#         curr = prev
#         for coin in coins:
#             curr |= prev >> coin
#         if curr == prev:
#             return -1
#         count += 1
#         prev = curr
#     return count
# coins=[eval(x) for x in input().split()]
# amount=int(input())
# print(fun(coins, amount))

# var=1<<12
# print(var)
# tem=var&1
# print(tem)
# var2=var>>1
# print(var2)
# var|=1
# print(var)


# def fun(n):
#     n=bin(n)[2:]
#     res=[1 for i in n if i=='1']
#     return sum(res)
# n=int(input())
# print(fun(n))

# from math import prod
# n=234
# n=map(int,str(n))
# # print(*n)
# print(prod(n))
# # print(sum(n))
# print(prod(n)-sum(n))
    
    
# knades algorithm
# arr=[-1,3,4,-5,6,3,-4,2,-6,13,3,6,8,-19,31]
arr=[-2, -3, 4, -1, -2, 1, 5, -3]
cursum=maxsum=0
l,r=0,0
for ind,i in enumerate(arr):
    cursum+=i
    if cursum>maxsum:
        maxsum=cursum
        r=ind
    if cursum<0:
        cursum=0
        l=ind+1
print(maxsum)
print(l,r)