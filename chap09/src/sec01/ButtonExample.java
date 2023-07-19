package sec01;

public class ButtonExample {

	public static void main(String[] args) {

		Button bu = new Button();
		bu.setOnClickListener(new CallListener());
		bu.touch();
		bu.setOnClickListener(new MessageListener());
		bu.touch();
		
	}

}
