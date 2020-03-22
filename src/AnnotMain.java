import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AnnotMain {

	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(Annot.class);
		
		for(Failure f: r.getFailures())
			System.out.println(f.toString());
		
		System.out.println("Running annot test cases (first time) finished!");
	}
	
}
