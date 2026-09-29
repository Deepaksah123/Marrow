package kotlin;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class getExtractor {
    private static AtomicReference<setTsExtractorTimestampSearchBytes> RemoteActionCompatParcelizer = new AtomicReference<>();

    private static setTsExtractorTimestampSearchBytes IconCompatParcelizer() {
        setTsExtractorTimestampSearchBytes settsextractortimestampsearchbytes = RemoteActionCompatParcelizer.get();
        return settsextractortimestampsearchbytes == null ? setTsExtractorTimestampSearchBytes.IconCompatParcelizer() : settsextractortimestampsearchbytes;
    }

    private static TimeZone read() {
        return TimeZone.getTimeZone("UTC");
    }

    private static android.icu.util.TimeZone RemoteActionCompatParcelizer() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar AudioAttributesCompatParcelizer() {
        Calendar calendarRemoteActionCompatParcelizer = IconCompatParcelizer().RemoteActionCompatParcelizer();
        calendarRemoteActionCompatParcelizer.set(11, 0);
        calendarRemoteActionCompatParcelizer.set(12, 0);
        calendarRemoteActionCompatParcelizer.set(13, 0);
        calendarRemoteActionCompatParcelizer.set(14, 0);
        calendarRemoteActionCompatParcelizer.setTimeZone(read());
        return calendarRemoteActionCompatParcelizer;
    }

    public static Calendar write() {
        return AudioAttributesCompatParcelizer((Calendar) null);
    }

    private static Calendar AudioAttributesCompatParcelizer(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(read());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static Calendar read(Calendar calendar) {
        Calendar calendarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(calendar);
        Calendar calendarWrite = write();
        calendarWrite.set(calendarAudioAttributesCompatParcelizer.get(1), calendarAudioAttributesCompatParcelizer.get(2), calendarAudioAttributesCompatParcelizer.get(5));
        return calendarWrite;
    }

    public static long RemoteActionCompatParcelizer(long j) {
        Calendar calendarWrite = write();
        calendarWrite.setTimeInMillis(j);
        return read(calendarWrite).getTimeInMillis();
    }

    private static DateFormat RemoteActionCompatParcelizer(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(RemoteActionCompatParcelizer());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static DateFormat AudioAttributesCompatParcelizer(Locale locale) {
        return RemoteActionCompatParcelizer("yMMMM", locale);
    }

    static DateFormat read(Locale locale) {
        return RemoteActionCompatParcelizer("MMMMEEEEd", locale);
    }

    static DateFormat RemoteActionCompatParcelizer(Locale locale) {
        return RemoteActionCompatParcelizer("yMMMMEEEEd", locale);
    }
}
