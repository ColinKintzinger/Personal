import random
col, rows = (3, 3)

# Create four 2D arrays
array1 = [[0 for _ in range(col)] for _ in range(rows)]
array2 = [[0 for _ in range(col)] for _ in range(rows)]
array3 = [[0 for _ in range(col)] for _ in range(rows)]
array4 = [[0 for _ in range(col)] for _ in range(rows)]
array5 = [[0 for _ in range(col)] for _ in range(rows)]
array6 = [[0 for _ in range(col)] for _ in range(rows)]
array7 = [[0 for _ in range(col)] for _ in range(rows)]
array8 = [[0 for _ in range(col)] for _ in range(rows)]
array9 = [[0 for _ in range(col)] for _ in range(rows)]
rooms = [] # List to store the rooms

class room():
    def __init__(self, array, entrance, exit) -> None:
        self.arrayData = array
        self.entrance = entrance
        self.exit = exit


array1 = [[1, 0, 2], [0, 0, 0], [0, 0, 0]]
array2 = [[1, 0, 0], [0, 0, 2], [0, 0, 0]]
array3 = [[1, 0, 0], [0, 0, 0], [0, 0, 2]]
array4 = [[0, 0, 2], [1, 0, 0], [0, 0, 0]]
array5 = [[0, 0, 0], [1, 0, 2], [0, 0, 0]]
array6 = [[0, 0, 0], [1, 0, 0], [0, 0, 2]]
array7 = [[0, 0, 2], [0, 0, 0], [1, 0, 0]]
array8 = [[0, 0, 0], [0, 0, 2], [1, 0, 0]]
array9 = [[0, 0, 0], [0, 0, 0], [1, 0, 2]]


arrays= []
arrays.append(room(array1, 1, 1))
arrays.append(room(array2, 1, 2))
arrays.append(room(array3, 1, 3))
arrays.append(room(array4, 2, 1))
arrays.append(room(array5, 2, 2))
arrays.append(room(array6, 2, 3))
arrays.append(room(array7, 3, 1))
arrays.append(room(array8, 3, 2))
arrays.append(room(array9, 3, 3))
i = 0
# Function to generate random numbers
def random_array():
    for i in range(0, 9):
        if len(rooms) == 0 :
            num = random.randint(0, len(arrays)-1)
            select = arrays[num]
            print(select.exit)
            rooms.append(select)
        elif i < 10:
            while True:
                num = random.randint(0, len(arrays)-1)
                select = arrays[num]
                if select.entrance == rooms[len(rooms)-1].exit:
                    rooms.append(select)
                    break
        else:
            return


    # for i in range (0,9):
    #     num = random.randint(0, 8)
    #     select = arrays[num]
    #     rooms.append(select)
    #     if rooms.length >1:
    #         check_room(rooms)
    #     else:
    #         pass
    
def print_matrix(matrix, name):
    print(f"{name}:")
    for row in matrix:
        print(" ".join(map(str, row)))


random_array()
for idx, room in enumerate(rooms, len(rooms)):
    print_matrix(room.arrayData, f"Room {idx}")



