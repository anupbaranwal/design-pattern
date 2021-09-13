package com.cleancoder.structural.implementor;

public class YellowColorPainter implements Painter {

  @Override
  public void paintTheShape() {
    System.out.println("Coloring The shape in YELLOW color");
  }

  @Override
  public String toString() {
    return "Yellow Color";
  }

}
