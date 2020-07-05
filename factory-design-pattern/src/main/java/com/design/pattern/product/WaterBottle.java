package com.design.pattern.product;

import com.design.pattern.work.LabelPrinter;

public class WaterBottle implements LabelPrinter {

  public void print() {
    System.out.println("Printing Water Bottle Label");
  }
}
