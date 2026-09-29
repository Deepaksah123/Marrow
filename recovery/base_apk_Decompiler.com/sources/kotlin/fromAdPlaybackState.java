package kotlin;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J0\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0005H\u0007J\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\u0012\u0010\u001e\u001a\u00020\u001c*\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011JF\u0010\u001b\u001a\u00020\u001c*\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u001cJ\u0012\u0010$\u001a\u00020\u0011*\u00020\u00112\u0006\u0010%\u001a\u00020\u0005J\u0014\u0010&\u001a\u00020\u001c*\u00020\u00112\b\b\u0002\u0010'\u001a\u00020\u0011J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R9\u0010\t\u001a(\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0014\u0012\u000e\b\u0001\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006*"}, d2 = {"Lcom/marrow/data/dataprovider/common/TimeUtilsV2;", "", "<init>", "()V", "ONE_DAY", "", "ONE_HOUR", "ONE_MIN", "ONE_SEC", "MONTH_LIST_NAMES", "", "", "kotlin.jvm.PlatformType", "getMONTH_LIST_NAMES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getEpochOfStartYear", "", "year", "getEpochOfEndYear", "getEpochOfStartMonth", "month", "getEpochAtTime", "hour", "min", "sec", "milli", "isMoreThanDuration", "", "seconds", "isMoreThanDurationMs", "ms", "days", "hours", "mins", "forDebug", "getDayBeforeNDaysEpoch", "day", "isDifferentDay", "timeStamp", "debugDayDiff", "timeDifferenceMs", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fromAdPlaybackState {
    public static final fromAdPlaybackState read = new fromAdPlaybackState();
    private static final String[] IconCompatParcelizer = new DateFormatSymbols().getShortMonths();

    private fromAdPlaybackState() {
    }

    public static String[] RemoteActionCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static long IconCompatParcelizer(int i) throws ParseException {
        StringBuilder sb = new StringBuilder("01-01-");
        sb.append(i);
        sb.append(" 00:00:00");
        Date date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse(sb.toString());
        toMagicModuleMetaRepoModel.read(date, "");
        return date.getTime();
    }

    public static long read(int i) throws ParseException {
        StringBuilder sb = new StringBuilder("31-12-");
        sb.append(i);
        sb.append(" 00:00:00");
        Date date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse(sb.toString());
        toMagicModuleMetaRepoModel.read(date, "");
        return date.getTime();
    }

    public static long write(int i, int i2) throws ParseException {
        StringBuilder sb = new StringBuilder("01-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        sb.append(" 00:00:00");
        Date date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").parse(sb.toString());
        toMagicModuleMetaRepoModel.read(date, "");
        return date.getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long write(int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 19);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static boolean AudioAttributesCompatParcelizer(long j, long j2) {
        return Math.abs(System.currentTimeMillis() - j) / 1000 >= j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AudioAttributesCompatParcelizer(long j, long j2, long j3, long j4, long j5, long j6, boolean z) {
        return System.currentTimeMillis() - ((j2 * 86400000) + (j3 * 3600000)) > j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IconCompatParcelizer(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
    }
}
