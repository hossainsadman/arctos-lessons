package project01;

public class DataStructures {
    public static void main(String[] args) {
        
        /*
            ARRAYS: length cannot be changed (have fixed lengths)
            LIST → List<T> → ArrayList<T> & LinkedList<T> (list type; is an interface): resizeable array; 
            has all operation of array (e.g. finding length, values at 
            indices); new elements can be added at specific indices 
            while moving other elements over;are implemented with 
            ArrayLists and LinkedLists
                ARRAYLIST (most often used): places data into array; when elements are 
                inserted, it is checked if there is an empty space;
                if there isn't an empty space, a new array is created with
                an empty space and the previous array is copied over (is 
                very inefficient); thus arraylists aren't good for inserting
                & taking out data quickly (but are good for retrieving data)
                    * Random Access
                LINKEDLISTS: places data within nodes; each node contains some
                data; every node knows which node is before and after it (allows
                for iteration); allows for insertion between nodes more 
                efficiently b/c only the connection between 2 nodes must be
                altered to insert a new node (other node connections are unchanged);
                disadvantage b/c random access is not possible (only first or last 
                element are kept in reference), so nodes will have to be travelled
                one by one until reaching required index).
                    * Constant Time Insertions

            STACKS: is similar to a stack in real life; first-in, last-out (FILO structure;
            in order to get to the first inputted item, all the other items must be removed
            first); adding to a stack is PUSH; removing from a stack is POP; is Empty
            does not have random access like arrays; compared to lists, stacks are limited
            but are faster than lists (optimized)
                DEQUE(Double-Ended QUEue; is between Stack and Queue): are double-ended (both
                a stack and queue at same time); can push, pop, enqueue, dequeue, & is empty;
                can be used as stack and queue (e.g. using dequeue to get bottom item out of 
                stack); does not have random access (unlike array lists)
            QUEUES: is similar to a queue in real life; first-in, first-out (FIFO structure);
            adding to queue is enqueue; pulling from a queue is dequeue (not deque); is empty;
            faster than stacks.
            * Stacks, Deques, and Queues → ArrayDeque<T>

            MAP 0(1) → May<K,V> (implementations include HashMap<K,V> & HashTable<K,V>): 
            stores pairs of corresponding data (which always comes in pairs, each w/a key 
            & value; e.g. int 1 corresponds to "one" or "one" corresponds to 1); with maps,
            the value of a key (e.g. 1) can be gotten (but key of a value cannot be searched);
            num of elements in map doesn't matter b/c no matter how many elements are in the 
            map, it will take the same amount of time if there is 1 or 10000 elements; is
            useful for matching usernames to passwords, etc.

            SET 0(1) → Set<T> → HashSet<T> (latter is concrete implementation): can check if a value is within a set (elements in a set are not ordered; 
            thus, order doesn't matter & you cannot tell where new data will go); takes same
            amount of time to access any number of elements
        */
    }
}