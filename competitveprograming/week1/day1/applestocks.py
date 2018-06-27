stocks=[1,1,1,1,1]
if len(stocks) < 2:
    raise ValueError("Cannot be possible")
else:
    mnp = stocks[0]
    mxp = stocks[1] - stocks[0]
    for i in range(1, len(stocks)):
        cp = stocks[i]
        p = cp - mnp
        mxp = max(mxp, p)
        mnp  = min(mnp, cp)
print(mxp)
