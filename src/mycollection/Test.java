package mycollection;

import com.test.entry.B;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {

    public static void main(String[] args) {
        goSwimming(new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳");
            }
        });

        //lambda表达式
        goSwimming(() -> System.out.println("游泳"));
    }


    public static void goSwimming(Swim swim) {
        swim.swimming();
    }
}

interface Swim {
    void swimming();
}
