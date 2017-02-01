package multithreading;
class Producer implements Runnable
{
Thread pt;
Producer(Thread t)
{
pt=t;
new Thread(this,"Producer").start();
}

public void run()
{
int i=0;
while(true)
{
pt.put(i++);
}
}

}
class Consumer implements Runnable
{
Thread ct;
Consumer(Thread t)
{
ct=t;
new Thread(this,"Consumer").start();
}
public void run()
{
int i=0;
while (true)
{
ct.get();
}
}
}
class ProducerConsumer
{

public static void main(String[] args)
{
Thread t=new Thread();
System.out.println("Press Control+c to exit");
new Producer(t);
new Consumer(t);
}
}