package sınıflar_ve_nesneler10;

public class EnumYapisi {

    public static void main(String[] args) {
        //  Değişkenlerin sadece ÖN TANIMLI DEĞER KÜMESİNDEN değer alabilmesinin kısıtlaması açısından kulllanışlıdır.

        Il il = Il.DUZCE;
        System.out.println("İl : " + il.getAdi());
        System.out.println("İl Plaka Kodu : " + il.getPlakaKodu());

        Il il2 = Il.ANKARA;
        System.out.println("İl : " + il2.getAdi());
        System.out.println("İl Plaka Kodu : " + il2.getPlakaKodu());
    }
    public enum Il{

        ADANA("01","Adana"), ANKARA("06","Ankara"), BOLU("14","Bolu"), DUZCE("81","Düzce"),
        ISTANBUL("34","İstanbul");

        private String plakaKodu;
        private String adi;

        private Il(String plakaKodu,String adi){
            this.plakaKodu = plakaKodu;
            this.adi = adi;
        }
        public String getPlakaKodu(){
            return plakaKodu;
        }
        public String getAdi(){
            return adi;
        }
    }

}

/*

 Çıktı :

İl : Düzce
İl Plaka Kodu : 81
İl : Ankara
İl Plaka Kodu : 06

 */
