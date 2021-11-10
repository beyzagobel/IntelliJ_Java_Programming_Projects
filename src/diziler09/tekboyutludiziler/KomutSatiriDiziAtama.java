package diziler09.tekboyutludiziler;

public class KomutSatiriDiziAtama {

    public static void main(String[] args) {
        /*
         * Komut satırı parametresiyle girilen tamsayıları bir diziye atayıp, dizinin elemanlarının
         * toplamını konsola " Dizinin elemanları toplamı : [toplma] " şeklinde yazdıran program
         * komut satırı paramtrelerim: 1 3 5 7 9
         */

        Integer [] dizi = new Integer[args.length];

        for(int i = 0 ; i < args.length ; i ++ ){
            dizi [i] = Integer.parseInt(args[i]);
        }
        int toplam = 0;
        for(int  i = 0 ; i < dizi.length ; i ++){
            toplam += dizi[i];
        }

        System.out.println("Dizinin elemanları toplamı : "+toplam);



    }
}
