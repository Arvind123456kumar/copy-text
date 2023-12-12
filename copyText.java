import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class copyText {
    public static  void main(String[] args) throws AWTException,InterruptedException{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your text or message");
        String msg=sc.nextLine();
        System.out.println("enter number times copy your text or message");
        int size=sc.nextInt();
        StringSelection stringselection=new StringSelection(msg);
        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
clipboard.setContents(stringselection,null);
Thread.sleep(3000);
Robot robot =new Robot();
for(int i=size;i>=1;i--){
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);

robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_V);

robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(1000);

    }  

    
}
}
