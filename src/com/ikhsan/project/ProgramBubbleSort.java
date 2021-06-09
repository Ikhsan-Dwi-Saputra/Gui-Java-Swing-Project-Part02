package com.ikhsan.project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class ProgramBubbleSort {
    private JPanel basePanel;
    private JTextField textField1;
    private JTextField textField4;
    private JTextField textField02;
    private JTextField textField03;
    private JTextField textField5;
    private JButton sortingButton;
    private JButton resetButton;
    private JTable tableoutput;
    private JTextField textField06;
    private JTextField textField07;
    private JTextField textField08;
    private JTable tableutama;
    private DefaultTableModel tableModel;

    //BASE PANEL
    public JPanel getBasepanel() {
        return basePanel;
    }

    public ProgramBubbleSort() {
        this.Ascending();

         //TOMBOL SORT
        sortingButton.addActionListener(e -> {
            tableoutput.setModel(tableModel);
            Object[][] iniData = {
            };

            // MENGATUR STRING TEXTFIELD
            String ti1 = textField1.getText();
            String ti2 = textField02.getText();
            String ti3 = textField03.getText();
            String ti4 = textField4.getText();
            String ti5 = textField5.getText();
            String ti6 = textField06.getText();
            String ti7 = textField07.getText();
            String ti8 = textField08.getText();

            //MEMANGGIL CLASS DATABASE
            Database db = new Database();
            db.setData1(ti1);
            db.setData2(ti2);
            db.setData3(ti3);
            db.setData4(ti4);
            db.setData5(ti5);
            db.setData6(ti6);
            db.setData7(ti7);
            db.setData8(ti8);

            // PEMBERITAHUAN
            if (textField1.getText().isBlank() || textField02.getText().isBlank() ||
                    textField03.getText().isBlank() || textField4.getText().isBlank() ||
                    textField5.getText().isBlank()) {
                JOptionPane.showMessageDialog(basePanel, "Harap Isi Semua Data Awal!", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {

                //OUTPUT TABLE
                tableModel.addRow(new Object[]{db.Sort1(), db.Sort8()});
                tableModel.addRow(new Object[]{db.Sort2(), db.Sort7()});
                tableModel.addRow(new Object[]{db.Sort3(), db.Sort6()});
                tableModel.addRow(new Object[]{db.Sort4(), db.Sort5()});
                tableModel.addRow(new Object[]{db.Sort5(), db.Sort4()});
                tableModel.addRow(new Object[]{db.Sort6(), db.Sort3()});
                tableModel.addRow(new Object[]{db.Sort7(), db.Sort2()});
                tableModel.addRow(new Object[]{db.Sort8(), db.Sort1()});
                sortingButton.requestFocus(null);


            }
        });
        //TOMBOL RESET
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField02.setText("");
                textField03.setText("");
                textField4.setText("");
                textField5.setText("");
                textField06.setText("");
                textField07.setText("");
                textField08.setText("");


                tableoutput.setModel(new DefaultTableModel(null, new Object[]{"Ascending",
                        "Discending"}));

                resetButton.requestFocus(false);



            }
        });
    }

    //TABLE <----------------------
    private void Ascending() {
        Object[] tableColom = {
                "Ascending",
                "Discending"
        };

        Object[][] iniData = {
        };

        tableModel = new DefaultTableModel(iniData, tableColom);
        //SET TABLE MODEL
        tableoutput.setModel(tableModel);

    }
}