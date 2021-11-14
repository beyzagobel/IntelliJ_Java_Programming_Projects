import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TarihOrnek {

    public static void main(String[] args) {
        Date suan = new Date();
        System.out.println(suan);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        String tarih = sdf.format(suan);
        System.out.println(tarih);

        Calendar takvim = Calendar.getInstance();
        takvim.setTime(suan);

        takvim.add(Calendar.YEAR,-1);
        takvim.add(Calendar.MONTH,-2);
        takvim.add(Calendar.HOUR_OF_DAY,-7);


        Date gecmisTarih = takvim.getTime();
        System.out.println(sdf.format(gecmisTarih));
    }
}
