package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lo/getAddress3;", "", "<init>", "()V", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "read", "MediaBrowserCompatMediaItem", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getAddress3$write;", "Lo/getAddress3$read;", "Lo/getAddress3$IconCompatParcelizer;", "Lo/getAddress3$RemoteActionCompatParcelizer;", "Lo/getAddress3$AudioAttributesCompatParcelizer;", "Lo/getAddress3$AudioAttributesImplApi21Parcelizer;", "Lo/getAddress3$AudioAttributesImplBaseParcelizer;", "Lo/getAddress3$MediaBrowserCompatItemReceiver;", "Lo/getAddress3$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getAddress3$AudioAttributesImplApi26Parcelizer;", "Lo/getAddress3$MediaBrowserCompatMediaItem;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getAddress3 {

    public static final class write extends getAddress3 {
        private final int AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, int i, int i2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private getAddress3() {
    }

    public /* synthetic */ getAddress3(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends getAddress3 {
        private final int IconCompatParcelizer;

        public RemoteActionCompatParcelizer(int i) {
            super(null);
            this.IconCompatParcelizer = i;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends getAddress3 {
        private final int write;

        public AudioAttributesCompatParcelizer(int i) {
            super(null);
            this.write = i;
        }

        public final int write() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress3$AudioAttributesImplApi26Parcelizer;", "Lo/getAddress3;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends getAddress3 {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    public static final class IconCompatParcelizer extends getAddress3 {
        private final int IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = i;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress3$AudioAttributesImplBaseParcelizer;", "Lo/getAddress3;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends getAddress3 {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress3$MediaBrowserCompatItemReceiver;", "Lo/getAddress3;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends getAddress3 {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress3$AudioAttributesImplApi21Parcelizer;", "Lo/getAddress3;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends getAddress3 {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAddress3$read;", "Lo/getAddress3;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getAddress3 {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatMediaItem extends getAddress3 {
        private final readBlockToCache read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatMediaItem(readBlockToCache readblocktocache) {
            super(null);
            toMagicModuleMetaRepoModel.write(readblocktocache, "");
            this.read = readblocktocache;
        }

        public final readBlockToCache IconCompatParcelizer() {
            return this.read;
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends getAddress3 {
        private final readBlockToCache IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(readBlockToCache readblocktocache) {
            super(null);
            toMagicModuleMetaRepoModel.write(readblocktocache, "");
            this.IconCompatParcelizer = readblocktocache;
        }

        public final readBlockToCache write() {
            return this.IconCompatParcelizer;
        }
    }
}
