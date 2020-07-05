public class LabelFactory {

  public LabelPrinter createLabel(Label labelType) {
    switch (labelType) {
      case WATER_BOTTLE:
        return new WaterBottle();
      case JUICE_BOTTLE:
        return new JuiceBottle();
    }
    throw new IllegalArgumentException("Wrong product chosen");
  }

}
