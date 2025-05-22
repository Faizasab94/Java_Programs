package swing;
import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;
import java.util.List;
public class addthecountries extends JFrame {
       private JList<String> list;
	    private HashMap<String, String> capitals;

	    public addthecountries() {
	        capitals = new HashMap<>();
	        capitals.put("USA", "Washington D.C.");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "Addis Ababa");
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

	        DefaultListModel<String> model = new DefaultListModel<>();
	        for (String country : capitals.keySet()) {
	            model.addElement(country);
	        }

	        list = new JList<>(model);
	        list.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selected = list.getSelectedValuesList();
	                    for (String country : selected) {
	                        System.out.println("Capital of " + country + " is: " + capitals.get(country));
	                    }
	                }
	            }
	        });

	        add(new JScrollPane(list));
	        setTitle("Country and Capitals");
	        setSize(250, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new addthecountries();
	    }
	}


