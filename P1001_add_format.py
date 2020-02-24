"""
 A+B Format
"""

line = input().split()
a, b = eval(line[0]), eval(line[1])
sum = a + b

sign = sum >= 0
str = str(sum)
length = len(str)

i = 0
while i < len(str):
    print(str[i], end='')
    if str[i] == '-':
        i += 1
        continue
    if (i+1) % 3 == length % 3 and i != length - 1:
        print(',', end='')
    i += 1


