
public class PlustenObserver extends Observer {

	public PlustenObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Plusten String: "+(subject.getState()+10));

	}

}
