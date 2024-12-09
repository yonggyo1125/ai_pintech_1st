#!/usr/bin/env python
# coding: utf-8

# In[19]:


import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from tensorflow import keras
import os.path
import sys


# In[20]:


# data_url = "http://localhost:3000/api/dl/data"
data_url = sys.argv[1]
df = pd.read_json(data_url)

items = df[['item1', 'item2', 'item3', 'item4', 'item5', 'item6', 'item7', 'item8', 'item9','item10']].to_numpy()
targets = df['result'].to_numpy()


# In[21]:


# 훈련세트, 테스트 세트 분리
train_input, test_input, train_target, test_target = train_test_split(items, targets)


# In[22]:


# 데이터 전처리 - 표준 점수 변환
ss = StandardScaler()
ss.fit(items)
train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)
# print(test_scaled[:1])


# In[23]:


# 모델 생성 함수
def create_model():
    model = keras.Sequential()
    model.add(keras.layers.Input(shape=(10,)))
    model.add(keras.layers.Dense(7, activation='relu'))
    model.add(keras.layers.Dropout(0.3))
    model.add(keras.layers.Dense(5, activation='softmax'))

    return model


# In[24]:


# 모델 생성 - 기 학습 모델 데이터가 있으면 기존 파일에서 불러오고 없으면 새로 생성
if os.path.isfile("best-model.keras"):
    model = keras.models.load_model("best-model.keras")
else:
    model = create_model()


# In[25]:


# 컴파일 - 옵티마이저, 손실함수, 측정 지표  설정
model.compile(optimizer='adam', loss='sparse_categorical_crossentropy', metrics=['accuracy'])


# In[26]:


checkpoint_cb = keras.callbacks.ModelCheckpoint("best-model.keras", save_best_only=True)
early_stopping_cb = keras.callbacks.EarlyStopping(patience=2, restore_best_weights=True)

model.fit(train_scaled, train_target, epochs=20, verbose=0,
          validation_data=(test_scaled, test_target), 
          callbacks=[checkpoint_cb,early_stopping_cb])

