class FileDownloader implements Runnable{
   private String filename;
public FileDownloader(String filename){
     this.filename=filename;
}
public void run(){
  System.out.println(filename+"Started downloading");
 
    for(int i=1;i<=5;i++){
        System.out.println((i*20)+"% downloaded");
        try{
		   Thread.sleep(500);
		}catch(InterruptedException e){
			
		}
}
   System.out.println(filename+"download completed");
}
}
public class FileDownload{
      public static void main(String[] args){
           Runnable d1=new FileDownloader("file 1"); 
		   Runnable d2=new FileDownloader("file 2"); 
		   Runnable d3=new FileDownloader("file 3");
		   Thread t1=new Thread(d1);
		   Thread t2=new Thread(d2);
		   Thread t3=new Thread(d3);
		   t1.start();
		   t2.start();
		   t3.start();
		   }
		   }
		   
		   
