import java.util.Arrays;

public interface Counter {
    String[] ARRAY_ARAB_COUNT = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] ARRAY_ROME_COUNT = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] ARRAY_ROME_COUNT_PLUS ={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
    String[] ZNAK ={"+", "-", "/", "*", "*"};

    boolean searchArab(String el);

     boolean searchRome(String el);

}