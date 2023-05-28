package Helpers;

public class Print {
    public static void printWord(String word){
        System.out.println();
        System.out.println(word);
        System.out.println();
    }
    public static void printWord(int number){
        System.out.println();
        System.out.println(number);
        System.out.println();
    }
    public static void printDownWord(String word){
        System.out.println();
        System.out.println(word);

    }
    public static void printUpWord(String word){
        System.out.println(word);
        System.out.println();

    }
    public static void line(){
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println();
    }
    public static  void printsWords(String ... words){
        for( String i : words){
            System.out.println(i);
        }

    }
    public static void loader(String word) throws InterruptedException {

        System.out.print(word);
        for (int b = 0; b <= 3; b++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(400);
            }

            for (int i = 0; i <3; i++) {
                System.out.print("\b");

            }
        }
    }

}
