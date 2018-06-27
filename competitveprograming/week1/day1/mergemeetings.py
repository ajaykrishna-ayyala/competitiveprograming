from operator import itemgetter
time=[(1,2),(5,9)]
if len(time) >= 1:
    time = sorted(time, key=itemgetter(0))
    p = [time[0]]
    time = time[1:]
    for (e1, e2) in time:
        (x1, x2) = p[-1]
        if e1 <= x2:
            if x2 <= e2:
                x2 = e2
            p[-1] = (x1, x2)
        else:
            p.append((e1, e2))
    print(p)
else:
    raise ValueError("Cannot be possible")