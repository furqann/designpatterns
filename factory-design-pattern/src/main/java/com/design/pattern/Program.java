public class Program {

  public static void main(String[] args) {
    LabelFactory labelFactory = new LabelFactory();
    final LabelPrinter waterBottle = labelFactory.createLabel(Label.WATER_BOTTLE);
    waterBottle.print();
    final LabelPrinter juiceBottle = labelFactory.createLabel(Label.JUICE_BOTTLE);
    juiceBottle.print();
  }
}
