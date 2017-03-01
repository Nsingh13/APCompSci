package Practice1;

import java.util.ArrayList;
import java.util.List;

public class SystemLog {

	private List<LogMessage> messageList = new ArrayList<LogMessage>();
	private List<LogMessage> removedList = new ArrayList<LogMessage>();

	public SystemLog() {
		messageList.add(Runner.log1);
		messageList.add(Runner.log2);
		messageList.add(Runner.log3);
	}

	public List<LogMessage> removeMessages(String keyword) {

		for (int i = 0; i < messageList.size(); i++) {
			if ((messageList.get(i).contatinsWord(keyword))) {

				removedList.add(messageList.get(i));
				messageList.remove(i);

			}

		}

		return removedList;

	}

}
