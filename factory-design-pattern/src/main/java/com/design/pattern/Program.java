package com.design.pattern;

import com.design.pattern.factory.Label;
import com.design.pattern.factory.LabelFactory;
import com.design.pattern.work.LabelPrinter;

public class Program {

  public static void main(String[] args) {
    final LabelPrinter waterBottle = LabelFactory.createLabel(Label.WATER_BOTTLE);
    waterBottle.print();
    final LabelPrinter juiceBottle = LabelFactory.createLabel(Label.JUICE_BOTTLE);
    juiceBottle.print();
    final LabelPrinter empty = LabelFactory.createLabel(Label.MILK_BOTTLE);
    empty.print();
  }
}
