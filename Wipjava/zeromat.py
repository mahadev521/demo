# mat=[[0,0,1,1,1],
#    [1,1,1,0,1],
#    [1,1,1,1,1],
#    [1,1,1,1,1]]
# # 4x5 matrix
# # ro,co=[],[]
# # rows,cols=len(mat),len(mat[0])
# # for i in range(rows):
# #     for j in range(cols):
# #         if mat[i][j]==0:
# #             ro.append(i)
# #             co.append(j)

# # for i in ro:
# #     mat[i] = [0]*cols
# # for i in co:
# #     for j in range(rows):
# #         mat[j][i] = 0

# # for i in mat:
# #     print(*i)


# p=1
# r=len(mat)
# c=len(mat[0])
# for i in range(r):
#     if(mat[i][0]==0):
#         p=0
#     for j in range(1,c):
        
#         if(mat[i][j]==0):
#             mat[i][0]=0
#             mat[0][j]=0
# for i in range(r-1,-1,-1):
#     for j in range(c-1,0,-1):
#         if(mat[i][0]==0 or mat[0][j]==0):
#             mat[i][j]=0
#     if(p==0):
#         mat[i][0]=0
        
# for i in mat:
#     print(*i)

# from itertools import permutations
# x=[1,2,3,4,5]
# for i in permutations(x):
#     print(i)

# x=list('12543')
# n=len(x)
# for i in range(n-1,0,-1):
#     if x[i]>x[i-1]:
#         ind1=i-1
#         break
# for i in range(n-1,0,-1):
#     if x[i]>x[ind1]:
#         ind2=i
#         break
# x[ind1],x[ind2]=x[ind2],x[ind1]
# x=x[:ind1+1]+x[ind1+1:][::-1]
# print(x)

# x=[1,3,2]
# n=len(x)
# for i in range(n-1,0,-1):
#     if x[i]>x[i-1]:
#         ind1=i-1
#         break

# for i in range(n-1,0,-1):
#     if x[i]>x[ind1]:
#         ind2=i
#         break
# x[ind1],x[ind2]=x[ind2],x[ind1]
# x=x[:ind1+1]+(x[ind1+1:][::-1])
# print(x)


# def fun(arr):
#     n=len(arr)
#     if n==1:
#         return
#     for i in range(1,n):
#         if arr[i-1]>arr[i]:
#             while i>0:
#                 if arr[i]>=arr[i-1]:
#                     break
#                 arr[i],arr[i-1]=arr[i-1],arr[i]
#                 i-=1
# arr=[0,1,1,0,2,1,2,0,0,2,2,1,0]
# fun(arr)
# print(arr)

# stocks=[7,1,4,2,3,5]
# lmin,pro=float('inf'),0
# for i in stocks:
#     if lmin>i:
#         lmin=i
#     pro=max(pro,i-lmin)
# print(pro)

n,m=map(int,input().split())
l=[int(x) for x in input().split()]
maxi=0
for i in range(0,n-m+1):
    maxi=max(maxi,len(set(l[i:i+m])))
print(maxi)