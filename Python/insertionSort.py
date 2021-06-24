import random

#Generates random number
getList = []
def randomNum(start, stop, step, loop):
     for number in range(loop):
          n = random.randrange(start, stop, step)
          getList.append(n)
          

print(randomNum(1, 10, 2, 10))


#Insertion sort
def insertionSort(List):
     for j in range(1, len(List)):
          #print(j)
          key = List[j]
          i = j - 1
          while ( i >= 0 ) and (List[i] > key):
               List[i + 1] = List[i]
               i = i - 1
          List[i + 1] = key
     return List


A = [6,5,3,1,4, 2]
print(getList)
#print( insertionSort( A ) )

#Revearse
##def RinsertionSort(List):
##     for j in range(1, len(List)):
##          #print(j)
##          key = List[j]
##          i = j - 1
##          while ( i >= 0 ) and (List[i] < key):
##               List[i - 1] = List[i]
##               i = i - 1
##          List[i - 1] = key
##     return List


A = [6,5,3,1,4, 2]
print(getList)
print( RinsertionSort( A ) )
