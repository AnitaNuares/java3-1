public class Main {
    public static void main(String[] args){
      int amount_in_kopecks = 93999_00;
      //стоимость билета в копейках
      int kopecks_for_mile = 20_00;
      //количество копеек для начисления одной мили

      int for_bonus = amount_in_kopecks / kopecks_for_mile;
      //расчет бонуса: стоимость билета / 20_00
      System.out.println ("Начислено "+ for_bonus +" миль ");
    }
}