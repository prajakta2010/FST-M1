# Define function to calculate sum
def fun_sum(num):
  if num>=0 and num<11:
    # Recursive function call
    return num + fun_sum(num+1)
  else:
    return 0

# Call fun_sum() function
result = fun_sum(0)

# Print result
print(result)


