package com.cleancoder.structural.abstraction;

import com.cleancoder.structural.implementor.Device;

public abstract class Remote {
  protected Device device;
  public Remote() { }

  public Remote(final Device device) {
    this.device = device;
  }

  abstract void power();

  abstract void downButtonClick();

  abstract void upButtonClick();

  abstract void leftButtonClick();

  abstract void rightButtonClick();

  abstract void goToNumber(int number);
}
