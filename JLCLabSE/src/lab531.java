
public class lab531 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Runtime rt=Runtime.getRuntime();
    Process p=rt.exec("mspaint");
    //OPEN Welocm.txt FILE in NOTEPAD
    String cmds[]= {"notepad","D:\\Welcome.txt"};
    Process p2=rt.exec(cmds);
    String cmds1[]= {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","http://www.google.com"};
    Process p3=rt.exec(cmds1);
    System.out.println("Press Enter to Close all Process");
    System.in.read();
    p.destroy();
    p2.destroy();
    p3.destroy();
    System.out.println("main completed");
    
    
    
    
    
	}

}
