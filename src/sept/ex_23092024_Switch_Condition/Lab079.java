package sept.ex_23092024_Switch_Condition;

public class Lab079 {
    public static void main(String[] args) {
//        Web Automation
//        I will ask user which browser you want me to run the code
//        chrome -> execute chrome
//        firefox -> execute firefox
//        edge -> Edge cases

        String browser ="firefox";

        switch (browser){
            case "chrome":
                System.out.println("Staring the chrome browser");
                // Further code to start the chrome
                // Webdriver driver - new Chrome(); // selenium code
                break;
            case "firefox":
                System.out.println("Staring the firefox browser");
                // Further code to start the firefox
                // Webdriver driver - new Firefox(); // selenium code
                break;
            case "edge":
                System.out.println("Staring the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }
    }
}
