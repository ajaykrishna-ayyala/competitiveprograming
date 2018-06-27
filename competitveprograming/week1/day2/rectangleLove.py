l1 = {'left_x': 1,'bottom_y': 1,'width': 6,'height': 3}
l2 = {'left_x': 5,'bottom_y': 2,'width': 3,'height': 6}

dict={}
x = max(l1['left_x'],l2['left_x'])
y = max(l1['bottom_y'],l2['bottom_y'])

x1 = min((l1['left_x']+l1['width']),(l2['left_x']+l2['width']))
y1 = min((l1['bottom_y']+l1['height']),(l2['bottom_y']+l2['height']))

if(x1>x and y1>y):
    dict['left_x']=x
    dict['bottom_y']=y
    dict['width']=x1-x
    dict['height']=y1-y

else:
    dict['left_x']=None
    dict['bottom_y']=None
    dict['width']=None
    dict['height']=None

print(dict)



