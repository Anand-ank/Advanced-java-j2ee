package basics;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private Map<String, String> capitalMap;

    public CountryCapitalList() {

        // Create country-capital mapping
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create list model
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String country : capitalMap.keySet()) {
            model.addElement(country);
        }

        // Create JList
        countryList = new JList<>(model);

        // Allow multiple selection
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {

                    List<String> selected = countryList.getSelectedValuesList();

                    for (String country : selected) {
                        String capital = capitalMap.get(country);
                        System.out.println("Capital of " + country + " is: " + capital);
                    }
                    System.out.println("-------------------------");
                }
            }
        });

        // Add to frame
        add(new JScrollPane(countryList));

        setTitle("Country Capital List");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}