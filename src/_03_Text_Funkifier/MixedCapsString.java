package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

	private String unfunkifiedText;

	public MixedCapsString(String unfunkifiedText) {

		this.unfunkifiedText = unfunkifiedText;

	}

	@Override
	public String funkifyText() {
		StringBuilder funkifiedText = new StringBuilder();
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			if (i % 2 == 0) {
				funkifiedText.append(unfunkifiedText.substring(i, i+1).toLowerCase());
			} else {
				funkifiedText.append(unfunkifiedText.substring(i, i+1).toUpperCase());
			}

		}
		return funkifiedText.toString();
	}
}
