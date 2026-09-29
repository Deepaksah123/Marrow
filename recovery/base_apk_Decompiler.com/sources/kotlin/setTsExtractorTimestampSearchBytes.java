package kotlin;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
final class setTsExtractorTimestampSearchBytes {
    private static final setTsExtractorTimestampSearchBytes read = new setTsExtractorTimestampSearchBytes();
    private final Long write = null;
    private final TimeZone IconCompatParcelizer = null;

    private setTsExtractorTimestampSearchBytes() {
    }

    static setTsExtractorTimestampSearchBytes IconCompatParcelizer() {
        return read;
    }

    final Calendar RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    private Calendar RemoteActionCompatParcelizer(TimeZone timeZone) {
        return timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
    }
}
