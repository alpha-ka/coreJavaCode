package streams;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamTrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] s= {"1","2","3","4","5"};
		
		Stream.of(s).forEach(i->System.out.println(i));
		
		System.out.println("Running Sequential Stream");
		run(Arrays.stream(s).sequential());
		
		System.out.println("Running Parallel Stream");
		run(Arrays.stream(s).parallel());
		
		

	}

	public static void run(Stream<String> stream)
	{
		
		stream.forEach(s->  { System.out.println(LocalTime.now() + " - value: " + s +
                " - thread: " + Thread.currentThread().getName());
			try {
			Thread.sleep(200);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		});
	}
}


