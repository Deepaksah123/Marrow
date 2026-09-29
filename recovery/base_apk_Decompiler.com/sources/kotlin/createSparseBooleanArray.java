package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lo/createSparseBooleanArray;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "Lo/createSparseBooleanArray$read;", "Lo/createSparseBooleanArray$AudioAttributesCompatParcelizer;", "Lo/createSparseBooleanArray$RemoteActionCompatParcelizer;", "Lo/createSparseBooleanArray$write;", "Lo/createSparseBooleanArray$IconCompatParcelizer;", "Lo/createSparseBooleanArray$MediaBrowserCompatCustomActionResultReceiver;", "Lo/createSparseBooleanArray$AudioAttributesImplApi26Parcelizer;", "Lo/createSparseBooleanArray$AudioAttributesImplApi21Parcelizer;", "Lo/createSparseBooleanArray$AudioAttributesImplBaseParcelizer;", "Lo/createSparseBooleanArray$MediaBrowserCompatItemReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class createSparseBooleanArray {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/createSparseBooleanArray$AudioAttributesCompatParcelizer;", "Lo/createSparseBooleanArray;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends createSparseBooleanArray {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    private createSparseBooleanArray() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/createSparseBooleanArray$MediaBrowserCompatItemReceiver;", "Lo/createSparseBooleanArray;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends createSparseBooleanArray {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    public /* synthetic */ createSparseBooleanArray(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/createSparseBooleanArray$AudioAttributesImplBaseParcelizer;", "Lo/createSparseBooleanArray;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends createSparseBooleanArray {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends createSparseBooleanArray {
        private final createStringArray write;

        public final createStringArray read() {
            return this.write;
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends createSparseBooleanArray {
        private final int AudioAttributesCompatParcelizer;

        public final int write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class RemoteActionCompatParcelizer extends createSparseBooleanArray {
        private final boolean write;

        public RemoteActionCompatParcelizer(boolean z) {
            super(null);
            this.write = z;
        }

        public final boolean IconCompatParcelizer() {
            return this.write;
        }
    }

    public static final class read extends createSparseBooleanArray {
        private final seekToTimeBarPosition read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(seekToTimeBarPosition seektotimebarposition) {
            super(null);
            toMagicModuleMetaRepoModel.write(seektotimebarposition, "");
            this.read = seektotimebarposition;
        }

        public final seekToTimeBarPosition write() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/createSparseBooleanArray$IconCompatParcelizer;", "Lo/createSparseBooleanArray;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer extends createSparseBooleanArray {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        public final int hashCode() {
            return 631135004;
        }

        private IconCompatParcelizer() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "IconCompatParcelizer";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/createSparseBooleanArray$write;", "Lo/createSparseBooleanArray;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class write extends createSparseBooleanArray {
        public static final write INSTANCE = new write();

        public final int hashCode() {
            return 1587801696;
        }

        private write() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "write";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/createSparseBooleanArray$MediaBrowserCompatCustomActionResultReceiver;", "Lo/createSparseBooleanArray;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompatCustomActionResultReceiver extends createSparseBooleanArray {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        public final int hashCode() {
            return -780803562;
        }

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompatCustomActionResultReceiver)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "MediaBrowserCompatCustomActionResultReceiver";
        }
    }
}
