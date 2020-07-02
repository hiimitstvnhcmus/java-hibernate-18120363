package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BangDiem_GUI {

	private JFrame frame;
	private JTextField Phong_text;
	private JTextField Tenmon_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BangDiem_GUI window = new BangDiem_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BangDiem_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JList list = new JList();
		springLayout.putConstraint(SpringLayout.NORTH, list, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, list, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, list, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, list, -330, SpringLayout.EAST, frame.getContentPane());
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"dfsaf3", "", "sad fsdf "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		frame.getContentPane().add(list);
		
		
		JLabel Mamon_label = new JLabel("M\u00E3 m\u00F4n");
		springLayout.putConstraint(SpringLayout.NORTH, Mamon_label, 0, SpringLayout.NORTH, list);
		springLayout.putConstraint(SpringLayout.WEST, Mamon_label, 10, SpringLayout.EAST, list);
		Mamon_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(Mamon_label);
		
		JComboBox Ma_mon_cb = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, Ma_mon_cb, 10, SpringLayout.SOUTH, Mamon_label);
		springLayout.putConstraint(SpringLayout.WEST, Ma_mon_cb, 10, SpringLayout.EAST, list);
		springLayout.putConstraint(SpringLayout.EAST, Ma_mon_cb, -210, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(Ma_mon_cb);
		
		
		JLabel Malop_label = new JLabel("M\u00E3 l\u1EDBp");
		springLayout.putConstraint(SpringLayout.NORTH, Malop_label, 10, SpringLayout.SOUTH, Ma_mon_cb);
		springLayout.putConstraint(SpringLayout.WEST, Malop_label, 0, SpringLayout.WEST, Mamon_label);
		Malop_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(Malop_label);
		
		JComboBox Lop_cb = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, Lop_cb, 10, SpringLayout.SOUTH, Malop_label);
		springLayout.putConstraint(SpringLayout.WEST, Lop_cb, 0, SpringLayout.WEST, Mamon_label);
		springLayout.putConstraint(SpringLayout.EAST, Lop_cb, 0, SpringLayout.EAST, Ma_mon_cb);
		frame.getContentPane().add(Lop_cb);
		
		JLabel Tenmon_label = new JLabel("T\u00EAn m\u00F4n");
		springLayout.putConstraint(SpringLayout.NORTH, Tenmon_label, 0, SpringLayout.NORTH, Mamon_label);
		springLayout.putConstraint(SpringLayout.WEST, Tenmon_label, 10, SpringLayout.EAST, Ma_mon_cb);
		springLayout.putConstraint(SpringLayout.NORTH, Tenmon_label, 0, SpringLayout.NORTH, Mamon_label);
		Tenmon_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(Tenmon_label);
		
		Tenmon_text = new JTextField();
		Tenmon_text.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, Tenmon_text, 0, SpringLayout.NORTH, Ma_mon_cb);
		springLayout.putConstraint(SpringLayout.WEST, Tenmon_text, 0, SpringLayout.WEST, Tenmon_label);
		springLayout.putConstraint(SpringLayout.EAST, Tenmon_text, -10, SpringLayout.EAST, frame.getContentPane());
		Tenmon_text.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(Tenmon_text);
		
		JLabel Phong_label = new JLabel("Ph\u00F2ng");
		springLayout.putConstraint(SpringLayout.NORTH, Phong_label, 0, SpringLayout.NORTH, Malop_label);
		springLayout.putConstraint(SpringLayout.WEST, Phong_label, 10, SpringLayout.EAST, Lop_cb);
		Phong_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(Phong_label);
		
		Phong_text = new JTextField();
		Phong_text.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, Phong_text, 0, SpringLayout.NORTH, Lop_cb);
		springLayout.putConstraint(SpringLayout.WEST, Phong_text, 0, SpringLayout.WEST, Tenmon_label);
		Phong_text.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(Phong_text);
		
		// line 4
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 30, SpringLayout.SOUTH, Lop_cb);
		springLayout.putConstraint(SpringLayout.EAST, Phong_text, 0, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.EAST, list);
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, frame.getContentPane());
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		frame.getContentPane().add(panel);
		
		JButton Duyet_button = new JButton("Duy\u1EC7t");
		panel.add(Duyet_button);
		
		JButton Dangky_Button = new JButton("\u0110\u0103ng k\u00FD");
		panel.add(Dangky_Button);
		
		JButton Huydangky_button = new JButton("H\u1EE7y \u0111\u0103ng k\u00FD");
		panel.add(Huydangky_button);
		

		



		
	}
}
