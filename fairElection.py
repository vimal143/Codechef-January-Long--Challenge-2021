tc=int(input())
while tc>0:
    N,M=map(int,input().split())
    A=list(map(int,input().split()))
    B=list(map(int,input().split()))
    swap=0
    while(sum(A)<=sum(B)):
        A.sort()
        B.sort()
        if(A[0]<B[-1]):
            temp=A[0]
            A[0]=B[-1]
            B[-1]=temp
            swap+=1
        else:
            swap= -1
            break
    if(swap==-1):
        print(-1)
    else:
        print(swap)              
    tc-=1