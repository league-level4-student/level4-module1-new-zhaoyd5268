package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	StringBuilder funkifiedText = new StringBuilder();
       for(int i = unfunkifiedText.length(); i > 0; i--) {
    	   funkifiedText.append(unfunkifiedText.substring(i-1, i));
       }
    	
    	return funkifiedText.toString();
    }
}
