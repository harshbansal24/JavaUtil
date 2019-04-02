package com.harsh.threads.main;

import java.io.File;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.harsh.threads.helper.CallabaleExample;
import com.harsh.threads.helper.ConditionExample;
import com.harsh.threads.helper.ForkJoinFrameworkFilesInDIr;
import com.harsh.threads.helper.ForkJoinPoolForJava8;
import com.harsh.threads.helper.ForkJoinUsingRecursiveAction;
import com.harsh.threads.helper.FutureTaskExample;
import com.harsh.threads.helper.HarshTimerTask;
import com.harsh.threads.helper.MaxFinder;
import com.harsh.threads.helper.MyMonitorThread;
import com.harsh.threads.helper.ReadReentrantReadWriteLock;
import com.harsh.threads.helper.ReadWriteReentrantReadWriteLock;
import com.harsh.threads.helper.RejectedExecutionHandlerImpl;
import com.harsh.threads.helper.SemaphoreImplExample;
import com.harsh.threads.helper.StaticNonStaticMethodCall;
import com.harsh.threads.helper.SyncThread;
import com.harsh.threads.helper.SynchronizationInstanceStaticMethod;
import com.harsh.threads.helper.ThreadJoinExample;
import com.harsh.threads.helper.ThreadPoolExample;
import com.harsh.threads.helper.ThreadPoolImpl;
import com.harsh.threads.helper.WorkerThread;
import com.harsh.threads.helper.WriteReentrantReadWriteLock;


public class AllThreadJava {

	public AllThreadJava() {
	}

	public static void main(String[] args) throws InterruptedException {
		// setPrecedor();
		// javaTimer();
		// threadPoolExample();
		// javaSynchronizationExampleLeadingToDeadlock();
		// javaCallableExample();
		// javaFutureTaskExample();
		// javaThreadJoinExample();
		// javaThreadHandlingUncaughtException();
		// staticNonStaticMethodCall();
		// javaReentrantReadWriteLock();
		// javaSemaphoreExample();
		// forkJoinFrameworkUsingRecursiveTask();
		// forkJoinFrameworkUsingRecursiveAction();
		// forkJoinFrameworkPartTwo();
		// forkJoinForJava8();
		// threadPoolExecutorExample();
		// deamonThread();
		// javaConditionExample();
		// javaSemaphoreImplExample();
		// javaThreadPoolImplExample();
		javaSynchronizationInstanceStaticMethod();
	}

	private static void javaSynchronizationInstanceStaticMethod() {
		Thread t1 = new Thread(new SynchronizationInstanceStaticMethod());
		Thread t2 = new Thread(new SynchronizationInstanceStaticMethod());
		t1.start();
		t2.start();
	}

	private static void javaThreadPoolImplExample() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("---inside t1---");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("---t1 finished---");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("---inside t2---");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("---t2 finished---");
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("---inside t3---");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("---t3 finished---");
			}
		});
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("---inside t4---");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("---t4 finished---");
			}
		});

		int taskCount = 0;
		ThreadPoolImpl threadPoolImpl = new ThreadPoolImpl(2, 2);
		while (taskCount < 10) {
			Random random = new Random();
			int i = random.nextInt(4);
			if (i == 0)
				threadPoolImpl.execute(t1);
			else if (i == 1)
				threadPoolImpl.execute(t2);
			else if (i == 2)
				threadPoolImpl.execute(t3);
			else if (i == 3)
				threadPoolImpl.execute(t4);
			taskCount++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method test the newly created implementation of semaphore class
	 */
	private static void javaSemaphoreImplExample() {
		SemaphoreImpl semaphoreImpl = new SemaphoreImpl(2);
		for (int i = 0; i < 4; i++) {
			new SemaphoreImplExample(semaphoreImpl);
		}
	}

	private static void javaConditionExample() throws InterruptedException {
		ConditionExample conditionExample = new ConditionExample();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					conditionExample.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				conditionExample.secondThread();
			}
		});

		t1.start();
		t2.start();
		t2.join();
		conditionExample.total();
	}

	/**
	 * Shows the deamon thread starts only demaon thread only and not user
	 * thread. classic example of this concept.
	 * 
	 * @throws InterruptedException
	 */
	private static void deamonThread() throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (true) {
					System.out.println("t1 called");
					if (i == 0) {
						Thread t3 = new Thread(new Runnable() {
							@Override
							public void run() {
								while (true) {
									System.out.println("inside thread-3");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
						});
						t3.start();
						System.out.println(t3.isDaemon());
						i++;
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println("t2 called");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		Thread.sleep(5000);
		System.out.println("Main method closing");
	}

	private static void threadPoolExecutorExample() {
		RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
		ThreadFactory threadfactory = Executors.defaultThreadFactory();
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS,
				new ArrayBlockingQueue<>(2), threadfactory, rejectionHandler);
		MyMonitorThread monitor = new MyMonitorThread(threadPoolExecutor, 2);
		Thread monitorThread = new Thread(monitor);
		monitorThread.start();
		try {
			for (int i = 0; i < 10; i++) {
				threadPoolExecutor.execute(new WorkerThread("cmd" + i));
			}
			Thread.sleep(15000);
			threadPoolExecutor.shutdown();
			System.out.println("Thread Pool Executor Shutdown");
			Thread.sleep(1000);
			monitor.shutdown();
			System.out.println("Monitor Shutdown");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is same as forkJoinFrameworkUsingRecursiveTask. Only one
	 * thing is thread extends RecursiveAction.
	 */
	private static void forkJoinFrameworkUsingRecursiveAction() {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		final AtomicLong sizeAccumulator = new AtomicLong();
		forkJoinPool.invoke(new ForkJoinUsingRecursiveAction(new File("C:\\temp"), sizeAccumulator));
		System.out.println(sizeAccumulator);
		forkJoinPool.shutdown();
	}

	/**
	 * Sample Fork and join method for Java 8
	 */
	private static void forkJoinForJava8() {
		ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		ForkJoinPoolForJava8 forkJoinPoolForJava8 = new ForkJoinPoolForJava8(list);
		forkJoinPool.invoke(forkJoinPoolForJava8);
		do {
			try {
				TimeUnit.SECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (!forkJoinPoolForJava8.isDone());
		System.out.println("Processing completed");
	}

	/**
	 * This method list the files in two folder and for each folder a sub task
	 * is created till we get the name of all the files.
	 */
	private static void forkJoinFrameworkPartTwo() {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		ForkJoinFrameworkFilesInDIr fileInDir = new ForkJoinFrameworkFilesInDIr("C:\\temp\\Movies");
		forkJoinPool.execute(fileInDir);
		do {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (!fileInDir.isDone());
		forkJoinPool.shutdown();
		List<String> list = fileInDir.join();
		for (String string : list) {
			System.out.println("File " + string);
		}
	}

	/**
	 * This method demonstrate the use of fork and join framework where Big task
	 * of finding the highest number will be broken down into 2 sets and than
	 * computed
	 */
	private static void forkJoinFrameworkUsingRecursiveTask() {
		final int[] data = new int[20];
		final Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(100);
		}
		System.out.println(Runtime.getRuntime().availableProcessors());
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		MaxFinder maxFinder = new MaxFinder(data);
		System.out.println(forkJoinPool.invoke(maxFinder));
		// System.out.println(forkJoinPool.execute(maxFinder));
	}

	/**
	 * This method provide the Semaphore Example. Here we create an object of
	 * Semaphore with initial permits that are allowed. if permit is 2 than 2
	 * threads can execute the code simulatenously. We use acquire and release
	 * methods. In case you don't want to wait till the time lock is acquired
	 * than one can use tryAcquire
	 */
	private static void javaSemaphoreExample() {
		AllThreadJava allThreadJava = new AllThreadJava();
		Semaphore semaphore = new Semaphore(1);
		new Thread() {
			@Override
			public void run() {
				System.out.println("Calling first method");
				allThreadJava.semaphoreExample(semaphore, "1");
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println("calling second method ");
				allThreadJava.semaphoreExample(semaphore, "2");
			}
		}.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("============with Semaphore 2============");
		Semaphore semaphore1 = new Semaphore(2);
		new Thread() {
			@Override
			public void run() {
				System.out.println("Calling first method");
				allThreadJava.semaphoreExample(semaphore1, "1");
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println("calling second method ");
				allThreadJava.semaphoreExample(semaphore1, "2");
			}
		}.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("=================in for lock===============");
		new Thread() {
			@Override
			public void run() {
				System.out.println("calling First method");
				allThreadJava.semaphoreExample(semaphore, "3");
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println("calling Second method");
				allThreadJava.semaphoreExample(semaphore, "4");
			}
		}.start();
	}

	protected void semaphoreExample(Semaphore semaphore, String string) {
		try {
			System.out.println("getting semaphore " + string);
			semaphore.acquire();
			System.out.println("got semaphore " + string);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before releasing semaphore " + string);
			semaphore.release();
			System.out.println("After releasing semaphore " + string);
		}
	}

	protected void lockExample(Lock lock, String string) {
		try {
			System.out.println("getting lock " + string);
			lock.lock();
			System.out.println("got lock " + string);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before releasing lock " + string);
			lock.unlock();
			System.out.println("After releasing lock " + string);
		}
	}

	/**
	 * This method is used to show the read operation working with write
	 * operation going on simulatenously.
	 */
	private static void javaReentrantReadWriteLock() {
		ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
		List<String> listaStr = new ArrayList<>();
		Thread t1 = new Thread(new ReadReentrantReadWriteLock(reentrantReadWriteLock, listaStr));
		Thread t2 = new Thread(new WriteReentrantReadWriteLock(reentrantReadWriteLock, listaStr));
		Thread t3 = new Thread(new ReadWriteReentrantReadWriteLock(reentrantReadWriteLock, listaStr));
		t1.start();
		t2.start();
		t3.start();
		// Incase you want read, write and readWrtite to be executed in sequence
		// than use the join.
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method shows the calling of static and non static method call
	 */
	private static void staticNonStaticMethodCall() {
		StaticNonStaticMethodCall call = new StaticNonStaticMethodCall();
		call.test1();
		call.test2();
		call.test3();
		call.test4();
	}

	/**
	 * This method shows what happens when an exception is raised in thread and
	 * uncaught exception is raised in thread and how is it handled.
	 */
	private static void javaThreadHandlingUncaughtException() {
		Runnable runnable = new HandlingUncaughtException();
		Thread thread = new Thread(runnable);
		thread.setUncaughtExceptionHandler(new UncaughtExceptionHandlerByUser());
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Another way of doing the same thing");
		Runnable runnable1 = new HandlingUncaughtException();
		Thread thread1 = new Thread(runnable);
		thread1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Inside the uncaughtException " + t.getName());
			}
		});
		thread1.start();
	}

	private static void javaThreadJoinExample() {
		ThreadJoinExample t1 = new ThreadJoinExample("T1", 5);
		ThreadJoinExample t2 = new ThreadJoinExample("T2", 10, t1);
		t1.start();
		t2.start();
		t1.stopThread();
	}

	private static void javaFutureTaskExample() {
		FutureTaskExample<String> futureTaskExample1 = new FutureTaskExample<>();
		FutureTaskExample<String> futureTaskExample2 = new FutureTaskExample<>();
		FutureTask<String> futureTask1 = new FutureTask<>(futureTaskExample1);
		FutureTask<String> futureTask2 = new FutureTask<>(futureTaskExample2);
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(futureTask1);
		executor.execute(futureTask2);
		// System.out.println(futureTask1.isDone());
		// System.out.println(futureTask2.isDone());
		// futureTask1.cancel(true);
		// futureTask2.cancel(true);
		int i = 1;
		while (i == 1) {
			System.out.println("thread 1 " + futureTask1.isDone());
			System.out.println("thread 2 " + futureTask2.isDone());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("thread 1 " + futureTask1.isDone());
			System.out.println("thread 2 " + futureTask2.isDone());
			if (futureTask1.isDone() && futureTask2.isDone()) {
				System.out.println("Shutting down");
				executor.shutdown();
				return;
			}
		}
	}

	private static void javaCallableExample() {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		List<Future<String>> listFuture = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Callable<String> callable = new CallabaleExample(i);
			Future<String> future = executor.submit(callable);
			listFuture.add(future);
		}
		for (int i = 0; i < listFuture.size(); i++) {
			try {
				System.out.println("Output of " + i + " = " + listFuture.get(i).get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finished");
		executor.shutdown();
	}

	private static void javaSynchronizationExampleLeadingToDeadlock() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
		Thread t2 = new Thread(new SyncThread(obj2, obj3), "t2");
		Thread t3 = new Thread(new SyncThread(obj3, obj1), "t3");

		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}

	/**
	 * This method shows the thread pool example.
	 */
	private static void threadPoolExample() {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable command = new ThreadPoolExample(i);
			executor.execute(command);
		}
		executor.shutdown();
	}

	/**
	 * This method shows how to run a task at particular time
	 */
	private static void javaTimer() {
		TimerTask timerTask = new HarshTimerTask();
		// true in constructor means the thread will stop as soon as main thread
		// stops and false means it will keep on running.
		Timer timer = new Timer(false);
		// second argument is the time at which the task should run and third
		// argument is the time after the second argument, task should run
		timer.scheduleAtFixedRate(timerTask, 0, 2 * 1000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending the Main Class");
	}

	/**
	 * This method is used for setting the precedor for the thread.
	 */
	private static void setPrecedor() {
		ThreadImpl thread1 = new ThreadImpl();
		ThreadImpl thread2 = new ThreadImpl();
		ThreadImpl thread3 = new ThreadImpl();
		Thread t1 = new Thread(thread1, "t1");
		Thread t2 = new Thread(thread2, "t2");
		Thread t3 = new Thread(thread3, "t3");
		thread1.setPrecedor(t2);
		thread2.setPrecedor(t3);
		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadImpl implements Runnable {
	private Thread precedor;

	public void run() {
		System.out.println("Started  " + Thread.currentThread().getName());
		try {
			if (precedor != null)
				precedor.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ended  " + Thread.currentThread().getName());
	}

	public void setPrecedor(Thread precedor) {
		this.precedor = precedor;
	}
}