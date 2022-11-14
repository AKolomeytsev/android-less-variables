public class Main {
    public static void main(String[] args) {
        byte varByte = 127;
        short varShot = 32000;
        int varInt = 2000000000;
        long varLong = 1000000000000L;

        float varFloat = 12.45f;
        double varDouble = 123.567;

        char varChar = 'S';

        boolean varBool = true;

        System.out.println("----sportsmans----");
        float sportsman1 = 78.2f;
        float sportsman2 = 82.7f;
        System.out.println("--------------sum - "+(sportsman1+sportsman2));
        System.out.println("--------------diff - "+(sportsman2-sportsman1));
        System.out.println();

        System.out.println("----cocktail----");
        int banana = 80*5;
        int milk = 105*2;
        int cream = 100*2;
        int egg = 70*4;
        System.out.println("--------------gram - "+(banana+milk+cream+egg));
        System.out.println("--------------kilogram - "+((float)(banana+milk+cream+egg)/1000));
        System.out.println();

        System.out.println("----weight loss----");
        int days = 7;
        float stage1 = 250;
        float stage2 = 500;
        System.out.println("--------------day 250g - "+(int)(days/(stage1/1000)));
        System.out.println("--------------day 500g - "+(int)(days/(stage2/1000)));
        System.out.println();

        System.out.println("----salary----");
        float masha = 67760f;

        float denis = 83690;
        float kristina = 76230;
        float promotion = 10;

        float mashaNew = masha + (masha*(promotion/100));
        float denisNew = denis + (denis*(promotion/100));
        float kristinaNew = kristina + (kristina*(promotion/100));

        System.out.println("--------------masha new salary - " + mashaNew);
        System.out.println("--------------masha year difference - " +(mashaNew- masha)*12);
        System.out.println("--------------denis new salary - " + denisNew);
        System.out.println("--------------denis year difference - " +(denisNew- denis)*12);
        System.out.println("--------------kristina new salary - " + kristinaNew);
        System.out.println("--------------kristina year difference - " +(kristinaNew- kristina)*12);
        System.out.println();

        System.out.println("----increased complexity----");
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));

        System.out.println("result  " + result + " reverse result  " + (result-(result*2)));





    }
}
