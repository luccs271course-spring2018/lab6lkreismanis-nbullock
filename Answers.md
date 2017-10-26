#Answers
## By Larisa Kreismanis and Nathan Bullock

1. Why does FixedArrayQueue require an explicit constructor?
- FixedArrayQueue requires an explicit constructor because the queue needs to be intitialized with it having a fixed capacity size.

2. What happens when you offer an item to a full FixedArrayQueue?
- When you offer an item to a full FixedArrayQueue, the result is false becuase the array is already full.

3. What happens when you poll an empty FixedArrayQueue?
- When you poll an empty FixedArrayQueue, the result is null because there are no items to be removed.

4. What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
- offer(final E obj): O(1)
- peek(): O(1)
- poll(): O(1)
- isEmpty(): O(1)
- size(): O(1)
- asList(): O(n)