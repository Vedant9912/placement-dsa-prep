import os
import shutil

source_dir = "./"
java_dir = os.path.join(source_dir, "Java")
python_dir = os.path.join(source_dir, "Python")

os.makedirs(java_dir, exist_ok=True)
os.makedirs(python_dir, exist_ok=True)

for file in os.listdir(source_dir):
    if file.endswith(".java"):
        shutil.move(file, os.path.join(java_dir, file))
    elif file.endswith(".py"):
        shutil.move(file, os.path.join(python_dir, file))

print("Done ✅")
