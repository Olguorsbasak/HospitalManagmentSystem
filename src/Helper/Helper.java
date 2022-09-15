package Helper;

import javax.swing.JOptionPane;

public class Helper {
	//nesne üretmeden çağrılacağı ve sıklıkla çağrılacağı için static
	
	public static void showMsg(String str) {
		String msg;
		 switch(str) {
		 case "fill":
			 msg="Please enter all information correctly";
			 break;
			 default:
				 msg=str;
		 }
		 JOptionPane.showMessageDialog(null, msg,"Message",JOptionPane.INFORMATION_MESSAGE);
		 
	}

}
