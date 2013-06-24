/**
 * 
 */
package com.ggungs.MiplatformUIHelper;

import javax.swing.JFrame;

import com.ggungs.MiplatformUIHelper.parser.XMLLoader;


/**
 * @author ggungs
 *
 */
public class MainForm {

    /**
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        JFrame frame = new JFrame("MiPlatformUIHelper");
        frame.setSize(800, 600);
        frame.setVisible(true);
        
        new XMLLoader().load();
    }

}
