package kotlin;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class StdDelegatingSerializer {
    private static final AtomicLong AudioAttributesImplBaseParcelizer = new AtomicLong();
    public final long AudioAttributesCompatParcelizer;
    public final Uri AudioAttributesImplApi21Parcelizer;
    public final SubTypeValidator IconCompatParcelizer;
    public final Map<String, List<String>> MediaBrowserCompatCustomActionResultReceiver;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final long write;

    public static long AudioAttributesCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer.getAndIncrement();
    }

    public StdDelegatingSerializer(long j, SubTypeValidator subTypeValidator, long j2) {
        this(j, subTypeValidator, subTypeValidator.AudioAttributesImplBaseParcelizer, Collections.emptyMap(), j2, 0L, 0L);
    }

    public StdDelegatingSerializer(long j, SubTypeValidator subTypeValidator, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = subTypeValidator;
        this.AudioAttributesImplApi21Parcelizer = uri;
        this.MediaBrowserCompatCustomActionResultReceiver = map;
        this.read = j2;
        this.write = j3;
        this.AudioAttributesCompatParcelizer = j4;
    }
}
