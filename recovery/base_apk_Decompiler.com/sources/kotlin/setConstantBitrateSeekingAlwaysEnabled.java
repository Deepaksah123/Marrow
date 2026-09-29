package kotlin;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class setConstantBitrateSeekingAlwaysEnabled {
    public static String IconCompatParcelizer(long j) {
        return getExtractor.AudioAttributesCompatParcelizer(Locale.getDefault()).format(new Date(j));
    }

    private static String RemoteActionCompatParcelizer(long j) {
        return RemoteActionCompatParcelizer(j, Locale.getDefault());
    }

    private static String RemoteActionCompatParcelizer(long j, Locale locale) {
        return getExtractor.read(locale).format(new Date(j));
    }

    private static String write(long j) {
        return IconCompatParcelizer(j, Locale.getDefault());
    }

    private static String IconCompatParcelizer(long j, Locale locale) {
        return getExtractor.RemoteActionCompatParcelizer(locale).format(new Date(j));
    }

    private static String AudioAttributesCompatParcelizer(long j) {
        if (read(j)) {
            return RemoteActionCompatParcelizer(j);
        }
        return write(j);
    }

    private static boolean read(long j) {
        Calendar calendarAudioAttributesCompatParcelizer = getExtractor.AudioAttributesCompatParcelizer();
        Calendar calendarWrite = getExtractor.write();
        calendarWrite.setTimeInMillis(j);
        return calendarAudioAttributesCompatParcelizer.get(1) == calendarWrite.get(1);
    }

    static String read(Context context, long j, boolean z, boolean z2, boolean z3) {
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j);
        if (z) {
            strAudioAttributesCompatParcelizer = String.format(context.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_today_description), strAudioAttributesCompatParcelizer);
        }
        if (z2) {
            return String.format(context.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_start_date_description), strAudioAttributesCompatParcelizer);
        }
        return z3 ? String.format(context.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_end_date_description), strAudioAttributesCompatParcelizer) : strAudioAttributesCompatParcelizer;
    }

    static String write(Context context, int i) {
        if (getExtractor.AudioAttributesCompatParcelizer().get(1) == i) {
            return String.format(context.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i));
        }
        return String.format(context.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }
}
