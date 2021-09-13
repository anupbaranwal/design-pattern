package com.cleancoder.structural;

import com.cleancoder.structural.implementor.Device;
import com.cleancoder.structural.implementor.Radio;
import com.cleancoder.structural.implementor.Television;
import com.cleancoder.structural.abstraction.AdvancedRemote;
import com.cleancoder.structural.abstraction.BasicRemote;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElectricStore {

  public static void main(String[] args) {
    testBasicRemote(new Television());
    testAdvanceRemote(new Television());
    testBasicRemote(new Radio());
    testAdvanceRemote(new Radio());
  }

  public static void testBasicRemote(Device device) {
    System.out.println("Tests with basic remote.");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    basicRemote.upButtonClick();
    basicRemote.goToNumber(32);
    basicRemote.rightButtonClick();
    device.printStatus();
  }
  public static void testAdvanceRemote(Device device) {
    System.out.println("Tests with advanced remote.");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    advancedRemote.power();
    advancedRemote.upButtonClick();
    advancedRemote.goToNumber(32);
    advancedRemote.rightButtonClick();
    advancedRemote.mute();
    device.printStatus();
  }
}
