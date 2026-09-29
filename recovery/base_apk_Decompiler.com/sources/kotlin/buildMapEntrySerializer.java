package kotlin;

import android.os.Looper;
import com.google.android.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class buildMapEntrySerializer {
    private Looper AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean IconCompatParcelizer;
    private Object MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final IconCompatParcelizer MediaBrowserCompatSearchResultReceiver;
    private final PolymorphicTypeValidator MediaDescriptionCompat;
    private final write MediaMetadataCompat;
    private final buildTypeDeserializer RemoteActionCompatParcelizer;
    private boolean read;
    private boolean write;
    private long AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    private boolean AudioAttributesCompatParcelizer = true;

    public interface IconCompatParcelizer {
        void write(buildMapEntrySerializer buildmapentryserializer);
    }

    public interface write {
        void AudioAttributesCompatParcelizer(int i, Object obj) throws addNull;
    }

    public buildMapEntrySerializer(IconCompatParcelizer iconCompatParcelizer, write writeVar, PolymorphicTypeValidator polymorphicTypeValidator, int i, buildTypeDeserializer buildtypedeserializer, Looper looper) {
        this.MediaBrowserCompatSearchResultReceiver = iconCompatParcelizer;
        this.MediaMetadataCompat = writeVar;
        this.MediaDescriptionCompat = polymorphicTypeValidator;
        this.AudioAttributesImplApi21Parcelizer = looper;
        this.RemoteActionCompatParcelizer = buildtypedeserializer;
        this.MediaBrowserCompatItemReceiver = i;
    }

    public final PolymorphicTypeValidator AudioAttributesImplBaseParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final write MediaBrowserCompatItemReceiver() {
        return this.MediaMetadataCompat;
    }

    public final buildMapEntrySerializer RemoteActionCompatParcelizer(int i) {
        buildTypeSerializer.write(!this.AudioAttributesImplApi26Parcelizer);
        this.MediaBrowserCompatMediaItem = i;
        return this;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final buildMapEntrySerializer AudioAttributesCompatParcelizer(Object obj) {
        buildTypeSerializer.write(!this.AudioAttributesImplApi26Parcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = obj;
        return this;
    }

    public final Object write() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final Looper RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final long read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final buildMapEntrySerializer AudioAttributesImplApi21Parcelizer() {
        buildTypeSerializer.write(!this.AudioAttributesImplApi26Parcelizer);
        if (this.AudioAttributesImplBaseParcelizer == C.TIME_UNSET) {
            buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
        this.AudioAttributesImplApi26Parcelizer = true;
        this.MediaBrowserCompatSearchResultReceiver.write(this);
        return this;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this) {
        }
        return false;
    }

    public final void read(boolean z) {
        synchronized (this) {
            this.IconCompatParcelizer = z | this.IconCompatParcelizer;
            this.write = true;
            notifyAll();
        }
    }

    public final boolean AudioAttributesCompatParcelizer(long j) throws InterruptedException, TimeoutException {
        boolean z;
        boolean z2;
        synchronized (this) {
            buildTypeSerializer.write(this.AudioAttributesImplApi26Parcelizer);
            buildTypeSerializer.write(this.AudioAttributesImplApi21Parcelizer.getThread() != Thread.currentThread());
            long jRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            long jRemoteActionCompatParcelizer2 = j;
            while (true) {
                z = this.write;
                if (z || jRemoteActionCompatParcelizer2 <= 0) {
                    break;
                }
                wait(jRemoteActionCompatParcelizer2);
                jRemoteActionCompatParcelizer2 = (jRemoteActionCompatParcelizer + j) - this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
            z2 = this.IconCompatParcelizer;
        }
        return z2;
    }
}
