# Thread Pool

Thread Pool is the pool of threads, customizable as a number of threads.

When a task needs to do something, takes -let's say 1 thread - from thread pool, do his work and release the thread which goes back to thread pool.

If we dopn't create the Thread Pool, we will always need to create new Thread(this is a costly operation - cpu, memory, resources - destroy at the end)

**ExecutorService** provides methods to manage termination and methods to produce a Future for tracking progress of tasks.
**Executors** class provides factory methods for the executor services. 

	*public static ExecutorService newFixedThreadPool(int nThreads)* : creates a thread pool for reusing a fixed number of threads . At any point if having any tasked are submitted when all threads are active, they will wait until a thread is available.

	*public static ExecutorService newSingleThreadExecutor()* : creates an Executor that uses a single worker thread. Tasks are guaranteed to execute sequentially, and no more than one task will be active at a specific time. 
	
**Note**
– Difference between newFixedThreadPool(1) & newSingleThreadExecutor(): Executor of newSingleThreadExecutor() factory method guaranteed not to be reconfigurable at runtime.

– If a thread terminates(both: newFixedThreadPool() & newSingleThreadExecutor()) due to a failure during execution prior to shutdown, a new one will created for executing subsequent tasks.


**void java.util.concurrent.Executor.execute(Runnable command)** : executes the given command at some time in the future. The command may execute in a new thread, in a pooled thread, or in the calling thread, at the discretion of the Executor implementation.

**void java.util.concurrent.ExecutorService.shutdown()** : setup a shutdown right after all submitted tasks are executed, and not accepted any new task.

**boolean java.util.concurrent.ExecutorService.isTerminated()** : returns true if all tasks have completed after shut down.
Note: isTerminated is always false unless either shutdown or shutdownNow was called first.