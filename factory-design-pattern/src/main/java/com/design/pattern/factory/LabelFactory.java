package com.design.pattern.factory;

import com.design.pattern.product.JuiceBottle;
import com.design.pattern.work.LabelPrinter;
import com.design.pattern.product.WaterBottle;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public abstract class LabelFactory {

  public static LabelPrinter createLabel(Label labelType) {
    if (labelType == null) {
      throw new IllegalArgumentException("Please pass a valid argument");
    }
    switch (labelType) {
      case WATER_BOTTLE:
        return new WaterBottle();
      case JUICE_BOTTLE:
        return new JuiceBottle();
      default:
        throw new RuntimeException("Not Implemented yet");
    }
  }

}
