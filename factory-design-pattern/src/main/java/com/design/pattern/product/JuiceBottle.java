package com.design.pattern.product;

import com.design.pattern.work.LabelPrinter;

public class JuiceBottle implements LabelPrinter {

  public void print() {
    System.out.println("Printing Juice Bottle Label");
  }
}
