
public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		new PlustenObserver(subject);
		
		System.out.println("Frist state change: 15");
		subject.setState(15);
		subject.setState(10);
		
		
	}

}
