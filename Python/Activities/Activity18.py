import pandas
dataframe=pandas.read_csv("sample.csv")
print(dataframe["UserNames"][1])
print(dataframe["Passwords"][1])
print(dataframe.sort_values("UserNames"))
print(dataframe.sort_values("Passwords",ascending=False))