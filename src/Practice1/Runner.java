package Practice1;

public class Runner {

	public static void main(String[] args) {

		LogMessage log = new LogMessage("CLient3:Lets test this Key");
		System.out.println(log.getMachineId());
		System.out.println(log.getDescription());
		System.out.println(log.contatinsWord("Key"));
	}

}