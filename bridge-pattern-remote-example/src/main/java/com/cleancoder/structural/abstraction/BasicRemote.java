package com.cleancoder.structural.abstraction;

import com.cleancoder.structural.implementor.Device;

public class BasicRemote extends Remote {

  public BasicRemote() {
    super();
  }

  public BasicRemote(final Device device) {
    super(device);
  }

  @Override
  public void power() {
    System.out.println("Remote: power toggle");
    if (device.isEnabled()) {
      device.disable();
    } else {
      device.enable();
    }
  }

  @Override
  public void downButtonClick() {
    System.out.println("Remote: down button clicked");
    device.setCurrentVolume(device.getCurrentVolume() - 1);
  }

  @Override
  public void upButtonClick() {
    System.out.println("Remote: up button clicked");
    device.setCurrentVolume(device.getCurrentVolume() + 1);
  }

  @Override
  public void leftButtonClick() {
    System.out.println("Remote: left button clicked");
    device.setGivenChannel(device.getCurrentChannel() - 1);
  }

  @Override
  public void rightButtonClick() {
    System.out.println("Remote: right button clicked");
    device.setGivenChannel(device.getCurrentChannel() + 1);
  }

  @Override
  public void goToNumber(int number) {
    System.out.println("Remote: go to number " + number);
    device.setGivenChannel(number);
  }
}
