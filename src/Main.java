//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

class Candle {
    private boolean isLit;


    public void light() {
        isLit = true;
    }

    public void extinguish() {
        isLit = false;
    }

    public boolean getIsLit() {
        return isLit;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println();

        String name = "Jon";
        System.out.println( "Hello, " + name );

        int age;
        System.out.println( "How old are you?");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();


        System.out.println( "Ah!\n"
                + "Wonderful!!!\n"
                + "Let me just light those candles for you...");
        Candle[] candles = new Candle[age];


        for (int i = 0; i < age; i++) {
            candles[i] = new Candle();
            candles[i].light();
            System.out.println((i + 1) + ":  " +
                    (candles[i].getIsLit() ? "Shining Brightly" : "Smoking Ash") );
        }


    }
};

