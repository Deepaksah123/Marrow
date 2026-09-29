package kotlin;

import android.content.Context;
import android.media.AudioManager;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lo/DataBufferRef;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "MediaDescriptionCompat", "MediaBrowserCompatCustomActionResultReceiver", "read", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/DataBufferRef$read;", "Lo/DataBufferRef$IconCompatParcelizer;", "Lo/DataBufferRef$RemoteActionCompatParcelizer;", "Lo/DataBufferRef$write;", "Lo/DataBufferRef$AudioAttributesCompatParcelizer;", "Lo/DataBufferRef$AudioAttributesImplApi26Parcelizer;", "Lo/DataBufferRef$MediaBrowserCompatCustomActionResultReceiver;", "Lo/DataBufferRef$MediaBrowserCompatItemReceiver;", "Lo/DataBufferRef$AudioAttributesImplApi21Parcelizer;", "Lo/DataBufferRef$AudioAttributesImplBaseParcelizer;", "Lo/DataBufferRef$MediaBrowserCompatMediaItem;", "Lo/DataBufferRef$MediaBrowserCompatSearchResultReceiver;", "Lo/DataBufferRef$MediaMetadataCompat;", "Lo/DataBufferRef$MediaDescriptionCompat;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DataBufferRef {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012"}, d2 = {"Lo/DataBufferRef$RemoteActionCompatParcelizer;", "Lo/DataBufferRef;", "", "p0", "p1", "", "", "p2", "<init>", "(Ljava/util/List;)V", "RemoteActionCompatParcelizer", "Z", "()Z", "AudioAttributesCompatParcelizer", "read", "write", "IconCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends DataBufferRef {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final List<Integer> read;
        private final boolean RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(List<Integer> list) {
            super(null);
            this.RemoteActionCompatParcelizer = false;
            this.write = true;
            this.read = list;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        public final List<Integer> write() {
            return this.read;
        }
    }

    private DataBufferRef() {
    }

    public /* synthetic */ DataBufferRef(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferRef$IconCompatParcelizer;", "Lo/DataBufferRef;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends DataBufferRef {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferRef$write;", "Lo/DataBufferRef;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends DataBufferRef {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends DataBufferRef {
        public static int AudioAttributesCompatParcelizer;
        public static int IconCompatParcelizer;
        private final maybeSignOut write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(maybeSignOut maybesignout) {
            super(null);
            toMagicModuleMetaRepoModel.write(maybesignout, "");
            this.write = maybesignout;
        }

        public final maybeSignOut write() {
            return this.write;
        }

        public static int read() {
            int i = IconCompatParcelizer;
            int i2 = i % 9941393;
            IconCompatParcelizer = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int streamMinVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMinVolume(3);
            AudioAttributesCompatParcelizer = streamMinVolume;
            return streamMinVolume;
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver extends DataBufferRef {
        private final int IconCompatParcelizer;

        public MediaBrowserCompatSearchResultReceiver(int i) {
            super(null);
            this.IconCompatParcelizer = i;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MediaMetadataCompat extends DataBufferRef {
        private final addApi RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(addApi addapi) {
            super(null);
            toMagicModuleMetaRepoModel.write(addapi, "");
            this.RemoteActionCompatParcelizer = addapi;
        }

        public final addApi AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MediaBrowserCompatMediaItem extends DataBufferRef {
        private final isConnectionFailedListenerRegistered IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatMediaItem(isConnectionFailedListenerRegistered isconnectionfailedlistenerregistered) {
            super(null);
            toMagicModuleMetaRepoModel.write(isconnectionfailedlistenerregistered, "");
            this.IconCompatParcelizer = isconnectionfailedlistenerregistered;
        }

        public final isConnectionFailedListenerRegistered AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MediaBrowserCompatItemReceiver extends DataBufferRef {
        private final boolean IconCompatParcelizer;

        public MediaBrowserCompatItemReceiver() {
            super(null);
            this.IconCompatParcelizer = true;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class AudioAttributesImplApi21Parcelizer extends DataBufferRef {
        private final boolean RemoteActionCompatParcelizer;

        public AudioAttributesImplApi21Parcelizer(boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioAttributesImplApi21Parcelizer) && this.RemoteActionCompatParcelizer == ((AudioAttributesImplApi21Parcelizer) obj).RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            boolean z = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("UpdateNewCourseArtZenAreaState(isVisible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MediaDescriptionCompat extends DataBufferRef {
        private final float RemoteActionCompatParcelizer;

        public MediaDescriptionCompat(float f) {
            super(null);
            this.RemoteActionCompatParcelizer = f;
        }

        public final float RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaDescriptionCompat) && Float.compare(this.RemoteActionCompatParcelizer, ((MediaDescriptionCompat) obj).RemoteActionCompatParcelizer) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            float f = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("UpdateZenToolbarScrimAlpha(alpha=");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MediaBrowserCompatCustomActionResultReceiver extends DataBufferRef {
        private final getApiOptions RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(getApiOptions getapioptions) {
            super(null);
            toMagicModuleMetaRepoModel.write(getapioptions, "");
            this.RemoteActionCompatParcelizer = getapioptions;
        }

        public final getApiOptions IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferRef$read;", "Lo/DataBufferRef;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends DataBufferRef {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DataBufferRef$AudioAttributesCompatParcelizer;", "Lo/DataBufferRef;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends DataBufferRef {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends DataBufferRef {
        private final boolean RemoteActionCompatParcelizer;

        public AudioAttributesImplApi26Parcelizer(boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
