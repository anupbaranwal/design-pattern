package com.cleancoder.structural.abstraction;

import com.cleancoder.structural.implementor.Painter;

public abstract class Shape {

  protected Painter painter;

  public Shape(final Painter painter) {
    this.painter = painter;
  }

  public void setPainter(Painter painter) {
    this.painter = painter;
  }

  public abstract void draw();
}
