package com.cleancoder.structural.implementor;

public interface Device {

  boolean isEnabled();

  void enable();

  void disable();

  int getCurrentVolume();

  void setCurrentVolume(int volume);

  int getCurrentChannel();

  void setGivenChannel(int channel);

  void printStatus();
}
