public class Main {
    public static void main(String[] args) {
        String title = "件名";
        String address = "xxxxxx@email.com";
        String text = "テキスト";

        email(address, text);
    }

    public static void email(String title,String address,String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }

}