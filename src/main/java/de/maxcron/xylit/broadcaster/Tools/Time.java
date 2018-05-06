package de.maxcron.xylit.broadcaster.Tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static SimpleDateFormat a = new SimpleDateFormat("dd.MM.yyyy | HH:mm:ss");
    public static String Alles = a.format(new Date());

    public static SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");
    public static String Datum = b.format(new Date());

    public static SimpleDateFormat c = new SimpleDateFormat("HH:mm:ss");
    public static String Uhrzeit = c.format(new Date());

    public static SimpleDateFormat d = new SimpleDateFormat("HH:mm");
    public static String UhrzeitohneSekunde = d.format(new Date());
}
