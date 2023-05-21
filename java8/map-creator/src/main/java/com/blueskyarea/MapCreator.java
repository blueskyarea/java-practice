package com.blueskyarea;

import java.awt.Container;

import javax.swing.JFrame;

public class MapCreator extends JFrame {

	private static final long serialVersionUID = -1118816869296478533L;
	private MainPanel mainPanel;

	public MapCreator() {
		setTitle("Map Creator");
		setResizable(false);
		
		initPanel();
		
	    pack();
	    setDefaultCloseOperation(3);
	    setVisible(true);
	}
	
	private void initPanel() {
		this.mainPanel = new MainPanel();
		Container contentPane = getContentPane();
        contentPane.add(this.mainPanel);
	}
	
    public static void main( String[] args ) {
        new MapCreator();
    }
}
