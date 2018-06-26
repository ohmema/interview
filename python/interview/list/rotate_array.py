
def left_rotate_in_memory_bigO_nk(nums, k):
    l = len(nums)
    for _ in range(k%len(nums)):
        for i in range(len(nums)-1):
            nums[i] ,  nums[(i+1)%l] =  nums[(i+1)%l], nums[i]



input = [i for i in range(11)]
left_rotate_in_memory_bigO_nk(input, 0)
print(input)

input = [i for i in range(11)]
left_rotate_in_memory_bigO_nk(input, 1)
print(input)

input = [i for i in range(11)]
left_rotate_in_memory_bigO_nk(input, 2)
print(input)

input = [i for i in range(11)]
left_rotate_in_memory_bigO_nk(input, 3)
print(input)

input = [i for i in range(11)]
left_rotate_in_memory_bigO_nk(input, 15)
print(input)


def right_rotate_in_memory_bigO_nk(nums, k):
    l = len(nums)
    for _ in range(k%len(nums)):
        for i in range(len(nums)-1, 0, -1):
            nums[i], nums[(i + 1) % l] = nums[(i + 1) % l], nums[i]

input = [i for i in range(11)]
right_rotate_in_memory_bigO_nk(input, 1)
print(input)

input = [i for i in range(11)]
right_rotate_in_memory_bigO_nk(input, 2)
print(input)

input = [i for i in range(11)]
right_rotate_in_memory_bigO_nk(input, 3)
print(input)

input = [i for i in range(11)]
right_rotate_in_memory_bigO_nk(input, 15)
print(input)
