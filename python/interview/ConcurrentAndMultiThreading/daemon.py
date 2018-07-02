from threading import Thread
import threading
import time

def do_some_work(t, txt, f):
    for i in range(100):
        f.write("{} doing some work in thread {}\n".format(threading.current_thread().getName(), i))
        time.sleep(t)
        f.write("{} end of thread {}\n".format(threading.current_thread().getName(), i))
    f.close()

f =  open("daemon.log", mode="wt")
daemon = Thread(name= "worker1", target=do_some_work, args=(0.1, "daemon", f), daemon= True)
non_daemon = Thread(name = "worker2", target=do_some_work, args=(0.1, "non-daemon", f), daemon=False)

print("#"*100)
''''
#Daemon thread will be stopped as main thread is terminated
#daemon thraed need thread.join to main thread. or slepp enough time for main thread for worker thread to be terminated first
'''
daemon.start()
#time.sleep(20)
daemon.join()
'''
#thread for non-daemon will contimue to runn even though main thread is terminated.
#The risk is thread can be hanning in background.
'''
#non_daemon.start()
#You do not need join for non-daemon
#non_daemon.join()
print("#"*100)

#f.close()