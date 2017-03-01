package Practice1;

import java.util.List;

public class Runner {
	public static LogMessage log1 = new LogMessage("CLient3:Key Lets test this");
	public static LogMessage log2 = new LogMessage("CLient3:Lets test this");
	public static LogMessage log3 = new LogMessage("CLient3:Key Lets test this");

	public static void main(String[] args) {

		SystemLog system = new SystemLog();

		List<LogMessage> test = system.removeMessages("Key");

		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i).getDescription());
		}

	}

}
