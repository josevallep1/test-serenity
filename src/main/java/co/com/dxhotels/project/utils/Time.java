package co.com.dxhotels.project.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    private Time() {
    }

    public static void waiting(int waiting) {
        try {
            Thread.sleep(waiting * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static int deDias(String fechaInicial, String fechaFinal) throws ParseException {

        SimpleDateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy");
        Date fechaIni =dateFormat.parse(fechaInicial);
        Date fechaFin =dateFormat.parse(fechaFinal);
        return (int)((fechaFin.getTime()-fechaIni.getTime())/86400000)+1;

    }
}
