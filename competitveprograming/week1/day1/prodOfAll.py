l=[-3,8,4]
if len(l)<2:
    raise ValueError("Cannot be possible")
plist=[1]*len(l)
p=1
for i in range(len(plist)):
    plist[i]=plist[i]*p
    p=p*l[i]
p=1
for i in range(len(plist) - 1, -1, -1):
    plist[i]=plist[i]*p
    p=p*l[i]
print(plist)
