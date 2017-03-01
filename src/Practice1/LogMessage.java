package Practice1;

public class LogMessage {

	private String machineId;
	private String description;

	public LogMessage(String message) {

		machineId = message.substring(0, findLoc(message, ':'));
		description = message.substring(findLoc(message, ':') + 1, message.length());

	}

	public boolean contatinsWord(String keyword) {

		int searchLength = description.length() - keyword.length() + 1;
		for (int i = 0; i < searchLength; i++) {
			String currentString = description.substring(i, i + keyword.length());
			char aheadString = description.charAt(i - 1);
			char behindString = '.';
			if (i <= searchLength &&  ) {
				behindString = description.charAt(i + keyword.length());
			}

			if (currentString.equals(keyword)) {
				if (aheadString == ' ' || behindString == ' ') {
					return true;
				}
			}

		}

		return false;

	}

	public String getMachineId() {
		return machineId;

	}

	public String getDescription() {
		return description;

	}

	public int findLoc(String searchString, char charector) {
		for (int i = 0; i < searchString.length(); i++) {
			if (searchString.charAt(i) == charector) {
				return i;
			}
		}
		return -1;

	}

}
