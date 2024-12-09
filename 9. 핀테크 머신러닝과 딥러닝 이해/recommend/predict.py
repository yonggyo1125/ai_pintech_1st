#!/usr/bin/env python
# coding: utf-8

# In[8]:


from tensorflow import keras
import os.path
import sys
import numpy as np


# In[7]:


if not os.path.isfile("best-model.keras"):
    sys.exit(1)

model = keras.models.load_model("best-model.keras")


# In[15]:


#test_data = """[[ 1.23151481,  0.88790998,  1.6140196,   0.94127238,  1.6784415,   1.38504672,
#  -1.57161094, -0.65513703,  0.99961796, -0.80484811]]"""
test_data = eval(sys.argv[1])
predictions = model.predict(np.array(test_data), verbose=0)
print(predictions.argmax(axis=1))

