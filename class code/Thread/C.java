public class C {

    static{
        System.out.println("Name of Thread in Static block is=" +Thread.currentThread().getName());
    }

    public static void main(String[] args) {

Thread t=Thread.currentThread();
System.out.println("Name of Thread in main=" +t.getName());
//System.out.println(Thread.currentThread().getName());

System.out.println(t.getId());
System.out.println(t.getPriority());
System.out.println(t.isAlive());
System.out.println(t.getState());
System.out.println(t.activeCount());
t.setName("Sumit");
t.setPriority(5);

try {
Thread.sleep(500);
}
catch(Exception e){
    e.printStackTrace();
}

System.out.println("Name of Thread in main=" +t);
System.out.println(t.getPriority());
    }
}
