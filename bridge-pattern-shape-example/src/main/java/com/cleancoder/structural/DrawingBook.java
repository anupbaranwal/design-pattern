package com.cleancoder.structural;

import com.cleancoder.structural.abstraction.Circle;
import com.cleancoder.structural.abstraction.Rectangle;
import com.cleancoder.structural.abstraction.Shape;
import com.cleancoder.structural.implementor.RedColorPainter;
import com.cleancoder.structural.implementor.YellowColorPainter;

public class DrawingBook {

  public static void main(String[] args) {
    Shape circleOfRedColor = new Circle(new RedColorPainter());
    circleOfRedColor.draw();

    System.out.println("--------------------------------------------");
    circleOfRedColor.setPainter(new YellowColorPainter());
    circleOfRedColor.draw();

/*    System.out.println("--------------------------------------------");
    Shape rectangleOfYellowColor = new Rectangle(new YellowColorPainter());
    rectangleOfYellowColor.draw();*/
  }
}
