//GUI组件实验
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class GUIComponents {

	public static void main(String[] args) {
		//按钮
		JButton jbtOK = new JButton("OK");
		JButton jbtCancel = new JButton("Cancel");
		//标签
		JLabel jlblName = new JLabel("Enter your name:");
		//文本框
		JTextField jtfName = new JTextField("Type your name here");
		//复选框
		JCheckBox jchkBold = new JCheckBox("Bold");
		JCheckBox jchkItalic = new JCheckBox("Italic");
		//单选框
		JRadioButton jrbRed =new JRadioButton("Red");
		JRadioButton jrbYellow =new JRadioButton("Yellow");
		//复选框
		JComboBox jcbColor = new JComboBox(new String[] {"Freshman",
				"Sophomore","Junior","Senior"});
		//创建一个面板对象，将之前的框对象添加到 面板里
		JPanel pane1 = new JPanel();
		pane1.add(jbtOK);//将ok按钮添加到pane1
		pane1.add(jbtCancel);
		pane1.add(jlblName);
		pane1.add(jtfName);
		pane1.add(jchkBold);
		pane1.add(jchkItalic);
		pane1.add(jrbRed);
		pane1.add(jrbYellow);
		pane1.add(jcbColor);
		//创建一个框架，将刚才的面板添加到框架中
		JFrame frame = new JFrame();
		frame.add(pane1);
		frame.setTitle("Shouw GUI Components");
		frame.setSize(450,100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//显示这个框架
	}
}
