package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaPanel extends JPanel {
    private JTextField priceBox;
    private JCheckBox[] toppingsList;
    private JRadioButton mozza, cheddar;
    private JComboBox sizeChoice;
    private ActionListener Al=new Eventlistner();

    public PizzaPanel() {
        toppingsList = new JCheckBox[4];
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(500, 200));
        setBorder(BorderFactory.createTitledBorder("Create your own pizza!"));
        add(createSizePanel());
        add(createCheesePanel());
        add(createToppingsPanel());
        JPanel output = new JPanel();
        output.add(new JLabel("Total price: $"));
        priceBox = new JTextField(5);
        priceBox.setEditable(false);
        output.add(priceBox);
        add(output);
    }

    public JPanel createCheesePanel() {
        mozza = new JRadioButton("Mozzarella");
        cheddar = new JRadioButton("Cheddar");
        ButtonGroup cheeses = new ButtonGroup();
        cheeses.add(mozza);
        cheeses.add(cheddar);
        JPanel radioPanel = new JPanel();
        mozza.addActionListener(Al);
        cheddar.addActionListener(Al);
        radioPanel.add(mozza);
        radioPanel.add(cheddar);

        return radioPanel;
    }

    public JPanel createSizePanel() {
        String[] sizes = {"Small", "Medium", "Large"};
        sizeChoice = new JComboBox(sizes);
        JPanel organizer = new JPanel();
        sizeChoice.addActionListener(Al);
        organizer.add(sizeChoice);

        return organizer;
    }

    public JPanel createToppingsPanel() {
        toppingsList[0] = new JCheckBox("Pepperoni");
        toppingsList[1] = new JCheckBox("Mushroom");
        toppingsList[2] = new JCheckBox("Onion");
        toppingsList[3] = new JCheckBox("Red Pepper");
        JPanel organizer = new JPanel(new GridLayout(2, 2));
        organizer.setBorder(BorderFactory.createTitledBorder("Select Toppings"));
        for (JCheckBox toppingBox : toppingsList) {
            toppingBox.addActionListener(Al);
            organizer.add(toppingBox);

        }
        return organizer;
    }


    public int calculateCost() {
        int price=0;
        switch (sizeChoice.getSelectedItem().toString()){
            case "small":
                price=5;
                break;
            case "medium":
                price=7;
                break;
            case "large":
                price=10;
                break;
        }
        if(this.mozza.isSelected()){
            price+=1;

        }else if (this.cheddar.isSelected()){
            price+=2;
        }
        for (JCheckBox element:toppingsList) {
          if(element.isSelected()) {
              price=+1;
          }
        }

        return price;
    }

    private class Eventlistner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            calculateCost();


        }
    }
}
