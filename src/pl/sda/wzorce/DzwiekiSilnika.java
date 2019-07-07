package pl.sda.wzorce;

import javax.management.MXBean;

public class DzwiekiSilnika {
    public void rozpoznajDzwiek(String dzwiek){
        if (dzwiek.equals("brum")) {
            return new Komar();
        } else if (dzwiek.equals("brum brum")){
            return new R2();
        }

    }
}
