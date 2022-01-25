package multiThreading;
/**
 *
 *  Multitasking
 *      - Performing multiple task at a same time.
 *      - It increases performance of CPU.
 *      - It has 2 ways
 *          - 1. Process based (Multi-Processing)
 *          - 2. Thread based
 *
 *  Multi-Processing
 *      - When one system is connected to multiple process in order to complete the task.
 *
 *  Multi-Threading
 *      - Executing multiple threads/program/task/sub-process at a same time.
 *      - E.g.- Games, software, animations
 *
 *  Thread
 *      - It is a light-weight process.
 *      - The Smallest unit of process.
 *      - Independent (If exception occurred in one thread it does not affect the other).
 *      - Shares the memory.
 *      - One process may have multiple threads.
 *      - Only one thread will execute.
 *      - By default in every java application we have at least one thread & that thread is main thread.
 *
 *  Thread                                          Process
 *  - Light-weight                                  - Heavy-weight
 *  - Segment of process                            - Execution of program
 *  - Part of process                               - May have multiple threads
 *  - Takes less time for                           - Takes more time for
 *    terminate, creation, context switching          terminate, creation, context switching
 *  - More efficient                                - Less efficient
 *  - Isolated (Don't share memory)                 - Shares Memory
 *  -
 *
 * */
public class MultiThreading {
    public static void main(String[] args) {
        String a= null;
        System.out.println(a.length());
    }
}
