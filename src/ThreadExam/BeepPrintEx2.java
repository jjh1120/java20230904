package ThreadExam;

class BeepTask implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(".");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}

}

public class BeepPrintEx2 {

	public static void main(String[] args) {
		Runnable beepTask = new  BeepTask();
		Thread thread=new Thread(beepTask);
		thread.start();
		
		
		for(int i=0; i<10; i++) {
			System.out.print("*");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		
		
		
		
		
	}

}