# Puzzle

Everyone loves alphabet soup. And of course you want to know if you can construct a message from the letters found in your bowl.

Write a function that takes as input two strings: first, the message you want to write; and second, all the letters found in your bowl of alphabet soup. Assume the letters are ordered randomly, just as in your bowl. Also assume you may have a very large bowl of soup containing many letters - though there is no guarantee that each letter occurs a similar number of times - indeed some letters might be missing entirely.

The function should determine if you can write your message with the letters found in your bowl of soup. The function should return true or false accordingly.

 Try to make your function efficient. Please use Big-O notation to explain how long it takes your function to run in terms of the length of your message (n) and the number of letters in your bowl of soup (m). 

You may spend as much time as you like, but a couple of hours should be sufficient.


### Explain

#### O(N)

O(N) describes an algorithm whose performance will grow linearly and in direct proportion to the size of the input data set. Big O favours the worst-case performance scenario, a matching string could be found during any iteration of the "while" (see [Solution.java](/src/main/java/soup/letters/Solution.java)) loop and the function would return early, but Big O notation will always assume the upper limit where the algorithm will perform the maximum number of iterations.
[Credits](https://rob-bell.net/2009/06/a-beginners-guide-to-big-o-notation/)