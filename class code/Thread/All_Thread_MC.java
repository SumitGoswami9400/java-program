public class All_Thread_MC {
        
 /*  
C:\Users\sumit>javap java.lang.Thread
Compiled from "Thread.java"
public class java.lang.Thread implements java.lang.Runnable {
  java.lang.ThreadLocal$ThreadLocalMap threadLocals;
  java.lang.ThreadLocal$ThreadLocalMap inheritableThreadLocals;
  volatile java.lang.Object parkBlocker;
  public static final int MIN_PRIORITY;
  public static final int NORM_PRIORITY;
  public static final int MAX_PRIORITY;
  long threadLocalRandomSeed;
  int threadLocalRandomProbe;
  int threadLocalRandomSecondarySeed;
  void blockedOn(sun.nio.ch.Interruptible);
  public static native java.lang.Thread currentThread();
  public static native void yield();
  public static native void sleep(long) throws java.lang.InterruptedException;
  public static void sleep(long, int) throws java.lang.InterruptedException;
  protected java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  public java.lang.Thread();
  public java.lang.Thread(java.lang.Runnable);
  java.lang.Thread(java.lang.Runnable, java.security.AccessControlContext);
  public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable);
  public java.lang.Thread(java.lang.String);
  public java.lang.Thread(java.lang.ThreadGroup, java.lang.String);
  public java.lang.Thread(java.lang.Runnable, java.lang.String);
  public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String);
  public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long);
  public synchronized void start();
  public void run();
  public final void stop();
  public final synchronized void stop(java.lang.Throwable);
  public void interrupt();
  public static boolean interrupted();
  public boolean isInterrupted();
  public void destroy();
  public final native boolean isAlive();
  public final void suspend();
  public final void resume();
  public final void setPriority(int);
  public final int getPriority();
  public final synchronized void setName(java.lang.String);
  public final java.lang.String getName();
  public final java.lang.ThreadGroup getThreadGroup();
  public static int activeCount();
  public static int enumerate(java.lang.Thread[]);
  public native int countStackFrames();
  public final synchronized void join(long) throws java.lang.InterruptedException;
  public final synchronized void join(long, int) throws java.lang.InterruptedException;
  public final void join() throws java.lang.InterruptedException;
  public static void dumpStack();
  public final void setDaemon(boolean);
  public final boolean isDaemon();
  public final void checkAccess();
  public java.lang.String toString();
  public java.lang.ClassLoader getContextClassLoader();
  public void setContextClassLoader(java.lang.ClassLoader);
  public static native boolean holdsLock(java.lang.Object);
  public java.lang.StackTraceElement[] getStackTrace();
  public static java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> getAllStackTraces();
  public long getId();
  public java.lang.Thread$State getState();
  public static void setDefaultUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler);
  public static java.lang.Thread$UncaughtExceptionHandler getDefaultUncaughtExceptionHandler();
  public java.lang.Thread$UncaughtExceptionHandler getUncaughtExceptionHandler();
  public void setUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler);
  static void processQueue(java.lang.ref.ReferenceQueue<java.lang.Class<?>>, java.util.concurrent.ConcurrentMap<? extends java.lang.ref.WeakReference<java.lang.Class<?>>, ?>);
  static {};
}
      
 */   
}
