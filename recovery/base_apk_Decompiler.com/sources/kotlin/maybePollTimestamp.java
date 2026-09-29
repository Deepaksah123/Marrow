package kotlin;

import android.location.Location;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class maybePollTimestamp {
    public static getPlaybackHeadPosition read(Location location, List list, long j, queueInputBuffer queueinputbuffer) {
        return new getPlaybackHeadPosition(location.getLatitude(), location.getLongitude(), location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : null, location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.hasVerticalAccuracy() ? Float.valueOf(location.getVerticalAccuracyMeters()) : null, ((Boolean) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(0L, new createUnexpectedDecodeException(location), 7), Boolean.FALSE)).booleanValue(), location.getTime(), !list.contains(getWritableDatabase.IconCompatParcelizer) ? 1 : 0, j, queueinputbuffer);
    }
}
