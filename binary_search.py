string = input()
nums = string.strip().split(" ")
my_nums = input().strip().split(" ")
new_nums = []
for i in nums:
    new_nums.append(int(i))
new_nums = sorted(new_nums) #list must be sorted
def search(numbers, num): 
    l = 0 #left index
    r = len(nums)-1 #right index
    count = 0
    indices = ""
    while l <= r:
        mid = int((l+r)/2)
        count+=1
        indices+= str(mid) + " "
        if int(numbers[mid]) == num:
            print("indices: " + str(indices))
            print("count: " + str(count))
            print("number searched: " + str(num))
            return str(num) + " found at index: " + str(mid) + "."
        else:
            if int(numbers[mid]) > num:
                r = mid-1
            else:
                l = mid + 1
    print("indices: " + str(indices))
    print("count: " + str(count))        
    return str(num)  + " not found."

for i in my_nums:
    print(search(new_nums, int(i)))


    
    