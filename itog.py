import itog as pd
# Создаем DataFrame
lst = ['robot'] * 10
lst += ['human'] * 10
random.shuffle(lst)
data = pd.DataFrame({'whoAmI': lst})

# Преобразуем столбец в one-hot вид
unique_labels = data['whoAmI'].unique()
one_hot = pd.DataFrame(0, index=data.index, columns=unique_labels)

for i, label in enumerate(data['whoAmI']):
    one_hot.loc[i, label] = 1

# Объединяем исходный DataFrame с one-hot DataFrame
data_one_hot = pd.concat([data, one_hot], axis=1)

data_one_hot.head()