package sec01;

public class Chatting {

	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;

		class Chat {
			public void start() {
				String inputData = "æ»≥Á«œººø‰";
				String message = "[" + "]" + inputData;
				sendMessage(message);
			}

			void sendMessage(String message) {
				System.out.println(message);
			}
		}

		Chat chat = new Chat();
		chat.start();
		System.out.println(nickName);
	}

	public static void main(String[] args) {
		Chatting ch = new Chatting();

		ch.startChat("±Ëº“¡ﬂ");
	}

}
