package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lo/getAddress1;", "", "<init>", "()V", "RatingCompat", "AudioAttributesCompatParcelizer", "MediaBrowserCompatMediaItem", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "read", "write", "Lo/getAddress1$RemoteActionCompatParcelizer;", "Lo/getAddress1$read;", "Lo/getAddress1$IconCompatParcelizer;", "Lo/getAddress1$write;", "Lo/getAddress1$AudioAttributesCompatParcelizer;", "Lo/getAddress1$MediaBrowserCompatItemReceiver;", "Lo/getAddress1$AudioAttributesImplApi26Parcelizer;", "Lo/getAddress1$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getAddress1$AudioAttributesImplApi21Parcelizer;", "Lo/getAddress1$AudioAttributesImplBaseParcelizer;", "Lo/getAddress1$MediaBrowserCompatMediaItem;", "Lo/getAddress1$RatingCompat;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getAddress1 {

    public static final class RatingCompat extends getAddress1 {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RatingCompat(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    private getAddress1() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress1$AudioAttributesCompatParcelizer;", "Lo/getAddress1;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends getAddress1 {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ getAddress1(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class MediaBrowserCompatMediaItem extends getAddress1 {
        private final String IconCompatParcelizer;
        private final readBlockToCache RemoteActionCompatParcelizer;
        private final String read;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatMediaItem(String str, String str2, readBlockToCache readblocktocache) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(readblocktocache, "");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.write = 1;
            this.RemoteActionCompatParcelizer = readblocktocache;
        }

        public final String read() {
            return this.read;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.write;
        }

        public final readBlockToCache write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class RemoteActionCompatParcelizer extends getAddress1 {
        private final int AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi21Parcelizer;
        private final String AudioAttributesImplApi26Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private final readBlockToCache IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final int read;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2, readBlockToCache readblocktocache, int i, int i2, int i3, int i4) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(readblocktocache, "");
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesImplApi26Parcelizer = str2;
            this.read = 1;
            this.IconCompatParcelizer = readblocktocache;
            this.AudioAttributesImplBaseParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.write = i3;
            this.AudioAttributesImplApi21Parcelizer = i4;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.read;
        }

        public final readBlockToCache RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer) && this.read == remoteActionCompatParcelizer.read && this.IconCompatParcelizer == remoteActionCompatParcelizer.IconCompatParcelizer && this.AudioAttributesImplBaseParcelizer == remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer && this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer && this.write == remoteActionCompatParcelizer.write && this.AudioAttributesImplApi21Parcelizer == remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        }

        public final int hashCode() {
            return (((((((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer);
        }

        public final String toString() {
            String str = this.RemoteActionCompatParcelizer;
            String str2 = this.AudioAttributesImplApi26Parcelizer;
            int i = this.read;
            readBlockToCache readblocktocache = this.IconCompatParcelizer;
            int i2 = this.AudioAttributesImplBaseParcelizer;
            int i3 = this.AudioAttributesCompatParcelizer;
            int i4 = this.write;
            int i5 = this.AudioAttributesImplApi21Parcelizer;
            StringBuilder sb = new StringBuilder("AllActiveRecallCompleted(lessonId=");
            sb.append(str);
            sb.append(", stepId=");
            sb.append(str2);
            sb.append(", filterType=");
            sb.append(i);
            sb.append(", mcqParentType=");
            sb.append(readblocktocache);
            sb.append(", totalVideoCount=");
            sb.append(i2);
            sb.append(", completedVideoCount=");
            sb.append(i3);
            sb.append(", completedARQBankCount=");
            sb.append(i4);
            sb.append(", totalARQBankCount=");
            sb.append(i5);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress1$AudioAttributesImplBaseParcelizer;", "Lo/getAddress1;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends getAddress1 {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress1$AudioAttributesImplApi21Parcelizer;", "Lo/getAddress1;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends getAddress1 {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress1$MediaBrowserCompatItemReceiver;", "Lo/getAddress1;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends getAddress1 {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress1$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getAddress1;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends getAddress1 {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends getAddress1 {
        private final String IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = 1;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress1$IconCompatParcelizer;", "Lo/getAddress1;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getAddress1 {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress1$read;", "Lo/getAddress1;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getAddress1 {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress1$write;", "Lo/getAddress1;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends getAddress1 {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
