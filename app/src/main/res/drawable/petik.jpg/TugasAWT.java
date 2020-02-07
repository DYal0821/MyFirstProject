/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KumpulanTugas;

import EventHandler.CheckBox;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Petik
 */
public class TugasAWT {
    Frame f ;
    TextField nama,ttl;
    Label lbl1,lbl2,lbl3,lbl4,lbl5;
    Choice kelamin;
    Checkbox chb1,chb2,chb3,chb4;
    Button simpan;
    
    public TugasAWT(){
        
        f = new Frame("Biodata");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(8, 3));    
        f.setVisible(true);
        
        lbl1 = new Label("Nama              :");
        nama = new TextField();
        
        lbl2 = new Label("TTL               :");
        ttl = new TextField();
        
        lbl3 = new Label("Jenis Kelamin     :");
        kelamin = new Choice();
        kelamin.add("Laki-Laki");
        kelamin.add("Perempuan");
        
        lbl4 = new Label("Hobi");
        lbl5 = new Label();
        chb1 = new Checkbox("Berenang");
        chb2 = new Checkbox("Memanah");
        chb3 = new Checkbox("Makan");
        chb4 = new Checkbox("Tidur");
        
        simpan = new Button("Simpan");

        f.add(lbl1);
        f.add(nama);
        f.add(lbl2);
        f.add(ttl);
        f.add(lbl3);
        f.add(kelamin);
        f.add(lbl4);
        f.add(lbl5);
        f.add(chb1);
        f.add(chb2);
        f.add(chb3);
        f.add(chb4);
        f.add(simpan);
        
        simpan.addActionListener(new actionListener());
        
    }
    
    public class actionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String a1 = nama.getText();
            String a2 = ttl.getText();
            String a3 = kelamin.getItem(kelamin.getSelectedIndex());
            
           
            System.out.println("Nama                    : " + a1);
            System.out.println("Tempat Tanggal Lahir    : " + a2);
            System.out.println("Jenis Kelamin           : " + a3);
            System.out.println("Hobi                      : " );
            
             if(chb1.getState()){
                System.out.println("*" + chb1.getLabel());
            }if(chb2.getState()){
                System.out.println("*" + chb2.getLabel());
            }if(chb3.getState()){
                System.out.println("*" + chb3.getLabel());
            }if(chb4.getState()){
                System.out.println("*" + chb4.getLabel());
            }
            
            
            
    
            
        }
        
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        TugasAWT a = new TugasAWT();
   
    }
}
    

