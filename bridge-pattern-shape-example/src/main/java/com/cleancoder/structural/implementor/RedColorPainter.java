package com.cleancoder.structural.implementor;

public class RedColorPainter implements Painter {

  @Override
  public void paintTheShape() {
    System.out.println("Coloring it with RED color");
  }

  @Override
  public String toString() {
    return "Red Color";
  }
}
