import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int distance, old, flightType;
        // distance =mesafe old = yaş flighttyp = uçuş tipi
        double normalCal, oldOption, flyOption, total;
        // normalCal=normal hesaplama
        //oldOption = yaş opsiyonu:  yaş indiriminin hesaplaması için tanımlandı
        //flyOption = uçuş opsiyonu: uçuş tipine göre indiriminin hesaplaması için tanımlandı
        //total toplam tutar: inidirimli tutarlardan sonra kalan tutarın hesaplanması için tanımlandı
        final double distanceFee = 0.10;
        // km başına mesafe ücreti sabit tanım olan final ile tnaımlandı
            Scanner userInput = new Scanner(System.in);

                System.out.print("Uçuş mesafenizi KM cinsinde giriniz: ");

             distance = userInput.nextInt();

                System.out.print("Yaşınızı giriniz: ");

            old = userInput.nextInt();

            System.out.print("Uçuş tipini giriniz : 1 = Tek yön  2 = Çift Yön: ");

        flightType = userInput.nextInt();


        if (distance >= 0 && old >= 0 && flightType == 1 || flightType == 2) {
            //kullanici veri tipleri giriş aralıgı kontrolü yapılıyor
            normalCal = distance * distanceFee;
            //girilen km mesafe ücretine göre hesaplanıp normal call degiskenine aktarılıyor
            if (old >= 1 && old <= 12) {
                //indirim icin uygun yas araligi kontrolu yapılıyor
                switch (flightType) {
                    //uçuş tipi kontrolü yapılıyor
                    case 1:
                        oldOption = normalCal * 0.50;
                        total = normalCal - oldOption;


                        System.out.println("Toplam tutar: " + total + "\n0-12 yaş indirimi uygulandı");

                    case 2:
                        // ilgili şartlar yerine getirliyorsa indirimler uygulanıyor
                        oldOption = normalCal * 0.50;
                        total = normalCal - oldOption;
                        flyOption = total * 0.20;
                        total = (total - flyOption) * 2;
                        System.out.println("Toplam tutar: " + total + "\n0-12 yaş ve Çift yön indirimi uygulandı");
                        //tutar kullaniciya gösterilmek üzere ekrana bastırılıyor
                }
            }
            else if(old>12 && old<=24) {
                switch (flightType) {
                    case  1:
                    oldOption = normalCal * 0.10;
                    total=normalCal-oldOption;
                    System.out.println("Toplam tutar: "+total+"\n13-24 yaş indirimi uygulandı");
                    break;

                    case 2:
                    oldOption=normalCal*0.10;
                    total=normalCal-oldOption;
                    flyOption=total*0.20;
                    total=(total-flyOption)*2;
                    System.out.println("Toplam tutar: "+total+"\n13-24 yaş ve Çift yön indirimi uygulandı");
                    break;
                }
            }
            else if(old>=65) {
                switch (flightType) {
                    case 1:
                    oldOption = normalCal * 0.30;
                    total=normalCal-oldOption;
                    System.out.println("Toplam tutar: "+total+"\n65 yaş indirimi uygulandı");
                    case 2:
                    oldOption=normalCal*0.30;
                    total=normalCal-oldOption;
                    flyOption=total*0.20;
                    total=(total-flyOption)*2;
                    System.out.println("Toplam tutar: "+total+"\n65 yaş ve Çift yön indirimi uygulandı");
                }
            }
            else{
            //24-65 yaş aralıgı kontrolü
                if(flightType==1){
                    //yukardaki  swich yapısıda kullanılabilirdi farklılık için kullanıldı

                    System.out.println("Toplam tutar: "+normalCal+"\nHerhangi bir indirim uygulanmadı");
                    //indirim yaş aralıgın da olamdıgı için normal hesaplama yapılıyor
                }
                else {
                    //çift yön kontrolü
                    flyOption=normalCal*0.20;
                    total=(normalCal-flyOption*2);
                    System.out.println("Toplam tutar: "+total+"\nÇift yön indirimi uygulandı");
                }
            }
        }
        else {
            System.out.println("Hatalı veri girdiniz hesaplama yapılamadı");
        }

    }
}