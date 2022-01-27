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
 *
 * LifeCycle of thread
 *  1. Born (New) -
 *      - New thread is created.
 *      - MyThread t1 = new MyThread()
 *
 *  2. Runnable -
 *      - t.start() is used to start a thread.
 *      - Waiting for resource allocation.
 *      - Thread Scheduler (part of JVM).
 *      - Scheduler assigns a fixed amount of time to execute a thread.
 *
 *  3. Running -
 *      -  When thread gets CPU / Memory it starts to run.
 *
 *  4. Blocked / Waiting -
 *      - When thread is inactive for particular time.
 *      - t.sleep(),t.suspend(),t.wait().
 *      - After this thread goes to running state.
 *      - If thread is suspended then we have to resume thread again.
 *
 *  5. Dead / Stop -
 *      - When tread completed its task then it gets terminated / stop.
 *      - When thread stops abnormally.
 *
 * Thread can be created using 2 mechanism
 *  1. By extending thread class
 *      - Thread class implements Runnable interface.
 *      - Thread class located in java.lang package.
 *      - steps -
 *          a) extend thread class
 *          b)
 *
 *  2. By implementing runnable interface
 *      - We can't extend more than one class at a time
 *      - In these case we implement Runnable interface
 *
 * */
public class MultiThreading {
    public static void main(String[] args) {
        String a= null;
        System.out.println(a.length());
    }
}