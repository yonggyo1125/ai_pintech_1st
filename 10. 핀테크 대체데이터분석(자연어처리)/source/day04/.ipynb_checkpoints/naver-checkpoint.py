import os
os.environ['TF_USE_LEGACY_KERAS'] = '1'  # keras 2버전으로 다운그레이드 

import tensorflow as tf
import tensorflow_hub as hub
import tensorflow_text as text
import json
import sys

tf.get_logger().setLevel('ERROR')

path = sys.argv[1] 

if not path or not os.path.isdir(path):
    sys.exit(1)

model = tf.saved_model.load(path)


inputs = eval(sys.argv[2])

reloaded_results = tf.sigmoid(model(tf.constant(inputs)))
results = [ float(reloaded_results[i][0]) for i in range(len(inputs))]
print(json.dumps(results))
