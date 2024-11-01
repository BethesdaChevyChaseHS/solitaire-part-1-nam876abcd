package com.example;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Solitaire Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.BorderLayout()); 
        frame.setSize(800, 400); 

        JPanel topPanel = new JPanel();
        JLabel titleLabel = new JLabel("Nam's Solitaire"); 
        topPanel.add(titleLabel);
        frame.add(topPanel, java.awt.BorderLayout.NORTH);

        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createTitledBorder("Pile")); 
        frame.add(leftPanel, java.awt.BorderLayout.WEST);

        JPanel playArea = new JPanel();
        playArea.setLayout(new java.awt.GridLayout(1, 7)); 
        for (int i = 1; i <= 7; i++) {
            JPanel stackPanel = new JPanel();
            stackPanel.setBorder(BorderFactory.createTitledBorder("Stack " + i));
            stackPanel.add(new JLabel("Stack " + i));
            playArea.add(stackPanel);
        }
        frame.add(playArea, java.awt.BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(new JLabel("Additional Information Here")); 
        frame.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}