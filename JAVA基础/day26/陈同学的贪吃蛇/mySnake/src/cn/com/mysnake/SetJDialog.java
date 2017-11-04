package cn.com.mysnake;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
/**
 * 
 * @author ccq
 * 贪食蛇的设置窗口
 *
 */
public class SetJDialog extends javax.swing.JDialog
{
	private JButton SureButton;
	private JTextField NameTextField;
	private JLabel jLabel1;
	private Properties pro;//配置文件
	private File file;
	/**
	* Auto-generated main method to display this JDialog
	*/
		
	public SetJDialog(JFrame frame)
	{
		super(frame);
		
		//配置文件
		pro = new Properties();
		file = new File(".\\snake.config");
		try {
			pro.load(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			{
				NameTextField = new JTextField();
				NameTextField.setText(pro.getProperty("name"));
				getContentPane().add(NameTextField, new AnchorConstraint(146, 634, 238, 279, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				NameTextField.setPreferredSize(new java.awt.Dimension(136, 24));
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1, new AnchorConstraint(154, 279, 227, 157, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				jLabel1.setText("\u540d\u79f0:");
				jLabel1.setPreferredSize(new java.awt.Dimension(47, 19));
			}
			{
				SureButton = new JButton();
				getContentPane().add(SureButton, new AnchorConstraint(830, 300, 921, 126, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				SureButton.setText("\u4fdd\u5b58");
				SureButton.setPreferredSize(new java.awt.Dimension(67, 24));
				SureButton.addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent e)
					{
						if(NameTextField.getText().matches("[0-9a-zA-Z]+"))
						{
							try {
								pro.setProperty("name", NameTextField.getText());
								pro.store(new FileWriter(file), "snake");
								SnakeJPanel.getSnake().setName(NameTextField.getText());
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null,"数据保存成功","保存成功",JOptionPane.INFORMATION_MESSAGE);//提示框
						}
						else
							JOptionPane.showMessageDialog(null,"名称含有无法识别字符","保存失败",JOptionPane.ERROR_MESSAGE);//提示框
					}
				});
			}
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
