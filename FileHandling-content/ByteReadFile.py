file = open('cartoon.png','rb')
data = file.read()
print(data)
file.close()
file = open('cartoon_3.png','wb')
file.write(data)
file.close()


