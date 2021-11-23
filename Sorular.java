import java.util.Arrays;
public class Sorular {
    public static void main(String[] args) {
        int rastgeleSayilar[]=new int[10];
        rastgeleSayilar=rastgeleSayiUretme(rastgeleSayilar);
        diziYazdir(rastgeleSayilar);
        int ortalama = ortalamaBulma(rastgeleSayilar);
        int kucukOlanSayilar=kucukOlanSayisiniBulma(rastgeleSayilar,ortalama);
        System.out.println("Sayıların Ortalaması : "+ortalama);
        System.out.println("Ortalamadan küçük olan sayı adedi : "+kucukOlanSayilar);
    }
    public static void diziYazdir(int [] dizi) {
        for (int i =0;i<dizi.length;i++){
            System.out.println(dizi[i]);
        }
    }
    public static int ortalamaBulma(int [] dizi){
        int toplam=0;
        for(int i=0;i<dizi.length;i++){
            toplam=toplam+dizi[i];
        }
        int ortalama=toplam/10;
        return ortalama;
    }
    public static int kucukOlanSayisiniBulma(int [] dizi,int a){
        int sayac=0;
        for (int i=0;i<dizi.length;i++){
            if(dizi[i]<a){
                sayac=sayac+1;
            }
        }
        return sayac;
    }
    public static int[] rastgeleSayiUretme(int [] dizi){
        for(int i=0;i<dizi.length;i++){
            dizi[i]=(int)(Math.random()*100);
        }
        return dizi;
    }
}

