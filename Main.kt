package com.zetcode

import java.awt.EventQueue
import java.awt.Rectangle
import javax.swing.*
import java.util.*

fun main (){
    val myframe = JFrame("kandedes")
    myframe.setSize(500,500)
    myframe.defaultCloseOperation=JFrame.EXIT_ON_CLOSE
    myframe.layout=null
    val run:Runnable =  Runnable{
        System.out.println("a11.2019.11897 ")}
        System.out.println("UNFINISHED.CO")
    val t=Thread (run)
    t.start()
    val label = JLabel("PBO")
    val button= JButton("Click for more information ")
    val text = JTextField()
    text.bounds  =Rectangle(155,270,200,20)
    button.bounds= Rectangle(155,300,200,50)
    label.bounds= Rectangle(240,40,200,100)
    myframe.add(button)
    myframe.add(text)
    myframe.add(label)
    myframe.isVisible=true

}



