package de.kronthto.autowalk;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;

public class Program {
  private Robot robot;
  private boolean isActive = false;

  public Program() {
    try {
      this.robot = new Robot();
      this.robot.setAutoDelay(50);
    } catch (AWTException e) {
      System.out.println("Failed to create Robot: " + e.getMessage());
      System.exit(3);
    }
  }

  public void run() {
    GlobalKeyboardHook keyboardHook = new GlobalKeyboardHook(true);
    keyboardHook.addKeyListener(
        new GlobalKeyAdapter() {
          @Override
          public void keyPressed(GlobalKeyEvent event) {
            if (event.getVirtualKeyCode() == GlobalKeyEvent.VK_F5) {
              isActive = !isActive;
              if (isActive) {
                System.out.println("Activating..");
                pressThemKeys();
              } else {
                System.out.println("Deactivating..");
                releaseThemKeys();
              }
            }
          }
        });
    while (this.isActive) {
      // ... not so nice. better keepalive loop how ..? XD
    }
  }

  public void pressThemKeys() {
    this.robot.keyPress(KeyEvent.VK_SHIFT);
    this.robot.keyPress('W');
  }

  public void releaseThemKeys() {
    this.robot.keyRelease(KeyEvent.VK_SHIFT);
    this.robot.keyRelease('W');
  }

  public static void main(String args[]) {
    Program inst = new Program();
    inst.run();
  }
}
