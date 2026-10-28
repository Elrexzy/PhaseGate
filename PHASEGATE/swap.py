def reverse_array(numbers):

	new_array = []
	
	for number in numbers:
		new_array.append(number[::-1])
	return 	new_array
		
numbers_list = [
	[1,2,3],
	[4,5,6],
	[7,8,9]
]
result = reverse_array(numbers_list)
print(result)
	
