package expr4;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Client {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderFrame frame = new OrderFrame();
					frame.setVisible(true);
					frame.setTitle("米线点餐系统");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
