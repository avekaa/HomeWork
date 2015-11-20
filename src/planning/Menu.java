package planning;

import asg.cliche.Command;

public class Menu {



	@Command(abbrev = "1") // One,
	public String startPlanning() {
		return "Starts planning";

	}

	@Command(abbrev = "2") // two,
	public String workingVersion() {
		return "Shows working version";

	}

	@Command(abbrev = "3") // three,
	public String finalVersion() {
		return "Shows final version";
	}

	@Command(abbrev = "4") // four,
	public void exit() {
		System.out.println("Good bye");
		System.exit(0);
	}

	@Command(abbrev = "5") // five,
	public String saveData() {
		return "Saves data";

	}

}
