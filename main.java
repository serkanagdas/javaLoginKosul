import java.util.Scanner;

public class main {
    public static void main(String[]args){

        String userName, password;
        int degisim;

        Scanner inp= new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();
        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("serkanagdas")){
            if (password.equals("serkan123")) {
                System.out.print("Sisteme hoşgeldiniz");
            }else
                System.out.print("Şifrenizi hatalı değiştirmek ister misiniz?\n" +
                        "Evet ise 1\n" +
                        "Hayır ise 2");
            degisim = inp.nextInt();

            switch (degisim){

                case 1 :
                    System.out.print("Lütfen yeni şifrenizi giriniz =");
                    inp.nextLine();
                    password = inp.nextLine();
                    if (password.equals("serkan123")){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }else
                        System.out.println("Şifre oluşturuldu");
                    break;
                case 2 :
                    System.out.print("İyi günler dileriz.");
                    break;
            }


        }else
            System.out.print("Lütfen kullanıcı adınızı kontrol ediniz.");





    }
}
