package com.cleancoder.structural.abstraction;

import com.cleancoder.structural.implementor.Device;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdvancedRemote extends BasicRemote {

  public AdvancedRemote(Device device) {
    super.device = device;
  }

  public void mute() {
    System.out.println("Remote: mute");
    device.setCurrentVolume(0);
  }
}
