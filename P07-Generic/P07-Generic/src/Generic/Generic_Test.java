/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generic;

import javax.swing.JButton;

/**
 *
 * @author lenovo
 */
public class Generic_Test {

    public static void main(String[] args) {
        Genericc<JButton> iOb = new Genericc<>(new JButton("OK"));
        iOb.showType();
    }
}
