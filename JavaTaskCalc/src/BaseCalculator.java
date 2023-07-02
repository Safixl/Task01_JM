import java.util.Arrays;

public abstract class BaseCalculator implements Counter {
    public boolean searchArab(String el) {
        for (int i = 0; i < ARRAY_ARAB_COUNT.length; i++) {
            if (el.equals(ARRAY_ARAB_COUNT[i]))
                return true;
        }
        return false;
    }

    public boolean searchRome(String el) {
        for (int i = 0; i < ARRAY_ROME_COUNT.length; i++) {
            if (el.equals(ARRAY_ROME_COUNT[i]))
                return true;
        }
        return false;
    }

    public boolean searchZnak(String el) {
        for (int i = 0; i < ZNAK.length; i++) {
            if (el.equals(ZNAK[i]))
                return false;
        }
        return true;
    }
}



