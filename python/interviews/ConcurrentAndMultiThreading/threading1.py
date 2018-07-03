import logging
import threading
#from threading import Thread
import time

#logging.basicConfig(level=logging.DEBUG, format='%(relativeCreated)6d %(threadName)s %(message)s')
#logger = logging.getLogger("threading")
def worker1 ( sec):
    #logging.info(threading + " started")
    time.sleep(sec)
    #logging.info(threading + " ended")

t1 = threading.Thread(name="worker1", target=worker1, args=(5,))
t2 = threading.Thread(name="worker2", target=worker1, args=(10,))

t1.start()
t2.start()

#logging.info("end")