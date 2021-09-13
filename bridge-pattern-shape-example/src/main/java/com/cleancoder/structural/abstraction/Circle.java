package com.cleancoder.structural.abstraction;

import com.cleancoder.structural.implementor.Painter;

public class Circle extends Shape {

  public Circle(Painter painter) {
    super(painter);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle started..!!");
    painter.paintTheShape();
    System.out.println(painter + " circle is drawn successfully");
  }
}
