package com.cleancoder.structural.implementor;

public class Radio implements Device {

  private int volume = 50;
  private int channel = 1;
  private boolean on;

  @Override
  public boolean isEnabled() {
    return on;
  }

  @Override
  public void enable() {
    on = true;
  }

  @Override
  public void disable() {
    on = false;
  }

  @Override
  public int getCurrentVolume() {
    return volume;
  }

  @Override
  public void setCurrentVolume(int volume) {
    this.volume = volume;
  }

  @Override
  public int getCurrentChannel() {
    return channel;
  }

  @Override
  public void setGivenChannel(int channel) {
    this.channel = channel;
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm radio.");
    System.out.println("| I'm " + (isEnabled() ? "enabled" : "disabled"));
    System.out.println("| Current volume is " + volume + "%");
    System.out.println("| Current channel is " + channel);
    System.out.println("------------------------------------\n");
  }
}
