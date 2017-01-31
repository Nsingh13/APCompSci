# Assignment 30

Given a 6x6 2D array, an hourglass in an array is a portion shaped like this:

```
a b c
  d
e f g
```

For example, if I create an hourglass with ones within an array of zeros it may look like this:

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```

Actually, there are 16 hourglasses in the array above. The three leftmost hourglasses are the following:

```
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
```

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

### Directions

Download the starter code Hourglass.java and the .txt files. 
Then, add your implementation for the largestSum() method.

Read the comments of the provided methods carefully so you know what they do and how to use them.

### Test Outputs

`grid.txt:'

`grid1.txt:' 13

`grid2.txt:' 19

`grid3.txt:` 52

