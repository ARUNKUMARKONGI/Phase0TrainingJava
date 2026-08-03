data = list(map(int, input().split()))

n = data[0]
arr = data[1:]

found = False

for i in range(n):
    for j in range(i + 1, n):
        if arr[i] == arr[j]:
            print("duplicate number is:", arr[i])
            found = True
            break
    if found:
        break

#here we are reading array size and elements on same line then splitting
# n = int(input())
# arr = list(map(int, input().split()))

# seen = set()

# for x in arr:
#     if x in seen:
#         print("duplicate number is:", x)
#         break
#     seen.add(x)

