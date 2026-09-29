package kotlin;

import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class getObjectType {
    public static final boolean RemoteActionCompatParcelizer(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2);
    }
}
