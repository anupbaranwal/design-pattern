package com.cleancoder.structural.abstraction;

import com.cleancoder.structural.implementor.Painter;

public class Rectangle extends Shape {

  public Rectangle(Painter painter) {
    super(painter);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle started..!!");
    painter.paintTheShape();
    System.out.println(painter + " rectangle is drawn successfully");
  }
}
