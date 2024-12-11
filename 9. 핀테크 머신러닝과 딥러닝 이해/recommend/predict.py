#!/usr/bin/env python
# coding: utf-8

# In[8]:


from tensorflow import keras
import os
import os.path
import sys
import numpy as np
import pandas as pd
import tensorflow as tf
from sklearn.preprocessing import StandardScaler

tf.compat.v1.logging.set_verbosity(tf.compat.v1.logging.ERROR)
import warnings as wa
wa.filterwarnings("ignore")
import os
os.environ['TF_CPP_MIN_LOG_LEVEL'] = '2'


# In[7]:

if not os.path.isfile("best-model.keras"):
    sys.exit(1)

model = keras.models.load_model("best-model.keras")


# In[15]:


#test_data = """[[ 1.23151481,  0.88790998,  1.6140196,   0.94127238,  1.6784415,   1.38504672,
#  -1.57161094, -0.65513703,  0.99961796, -0.80484811]]"""
# 표준 점수 구하기
data_all_url = sys.argv[1]  # 전체 데이터 주소

df_all = pd.read_json(data_all_url)

# 표준 점수 기준 구하기 
all_items = df_all[['item1', 'item2', 'item3', 'item4', 'item5', 'item6', 'item7', 'item8', 'item9','item10']].to_numpy()
ss = StandardScaler()
ss.fit(all_items)

test_data = eval(sys.argv[2])
test_scaled = ss.transform(test_data)

predictions = model.predict(np.array(test_data), verbose=0)
print(predictions.argmax(axis=1))

