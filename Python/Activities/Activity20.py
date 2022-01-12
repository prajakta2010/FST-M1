import pandas
dataframe=pandas.read_excel("info.xlsx")
print(dataframe.shape)
print(dataframe["Email"])
print(dataframe.sort_values("FirstName"))