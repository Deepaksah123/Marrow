package kotlin;

import android.app.PendingIntent;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FlvExtractorExternalSyntheticLambda0 {
    private final int AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final Integer IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private final long MediaBrowserCompatItemReceiver;
    private final PendingIntent MediaBrowserCompatMediaItem;
    private final Map MediaBrowserCompatSearchResultReceiver;
    private final PendingIntent MediaDescriptionCompat;
    private final PendingIntent MediaMetadataCompat;
    private final PendingIntent RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private boolean onAddQueueItem = false;
    private final int read;
    private final String write;

    private final boolean read(readFlvHeader readflvheader) {
        return readflvheader.RemoteActionCompatParcelizer() && this.AudioAttributesImplApi26Parcelizer <= this.MediaBrowserCompatItemReceiver;
    }

    final PendingIntent write(readFlvHeader readflvheader) {
        if (readflvheader.AudioAttributesCompatParcelizer() == 0) {
            PendingIntent pendingIntent = this.MediaDescriptionCompat;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (read(readflvheader)) {
                return this.MediaMetadataCompat;
            }
            return null;
        }
        if (readflvheader.AudioAttributesCompatParcelizer() == 1) {
            PendingIntent pendingIntent2 = this.MediaBrowserCompatMediaItem;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (read(readflvheader)) {
                return this.RatingCompat;
            }
        }
        return null;
    }

    public final boolean AudioAttributesCompatParcelizer(readFlvHeader readflvheader) {
        return write(readflvheader) != null;
    }

    private FlvExtractorExternalSyntheticLambda0(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.write = str;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = i3;
        this.IconCompatParcelizer = num;
        this.AudioAttributesImplApi21Parcelizer = i4;
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        this.AudioAttributesImplBaseParcelizer = j2;
        this.AudioAttributesImplApi26Parcelizer = j3;
        this.MediaBrowserCompatItemReceiver = j4;
        this.MediaBrowserCompatMediaItem = pendingIntent;
        this.MediaDescriptionCompat = pendingIntent2;
        this.RatingCompat = pendingIntent3;
        this.MediaMetadataCompat = pendingIntent4;
        this.MediaBrowserCompatSearchResultReceiver = map;
    }

    public static FlvExtractorExternalSyntheticLambda0 write(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new FlvExtractorExternalSyntheticLambda0(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    final void read() {
        this.onAddQueueItem = true;
    }

    final boolean AudioAttributesCompatParcelizer() {
        return this.onAddQueueItem;
    }
}
