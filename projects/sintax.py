#function decliration
def our_function():
    print("Hello, world!")
our_function()
#this is how we comment in the code

#declaring variables
our_String = "Our String"
print(our_String)
single_line_string = "This is a single line string"
#can also use single quotes for strings

#Casing
pythonSintax = "This is a variable with camel casing"
PythonSyntax = "This is a variable with pascal casing for class names"
python_syntax = "This is a variable with snake casing used for Variables and Functions"
PYTHON_SYNTAX = "This is a variable with screaming snake casing used for constants"

#LENGTH
len('hello')
#output: 5
str(29)
#output: '29'
int(7.7)
#output: 7

if 1 > 2:
    message = "if only 1 were greater than two..."
#elif is used for else if
spam=0
if spam < 5:
    print("Hello, world.")
    spam = spam + 1
#output: Hello, world.
while True:
    print('please type your name.')
    name= input()
    if name == 'your name':
        break
print('thank you!')
#output: thank you!
for i in range(5):
    print('Jimmy Five Times (' + str(i) + ')')
#output: Jimmy Five Times (0)
#        Jimmy Five Times (1)
#        Jimmy Five Times (2)
#        Jimmy Five Times (3)
#        Jimmy Five Times (4)

