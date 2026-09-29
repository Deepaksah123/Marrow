package kotlin;

import kotlin.Metadata;
import kotlin.readShort;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lo/serializeIterableToBundle;", "", "<init>", "()V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "write", "read", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "Lo/serializeIterableToBundle$RemoteActionCompatParcelizer;", "Lo/serializeIterableToBundle$write;", "Lo/serializeIterableToBundle$read;", "Lo/serializeIterableToBundle$AudioAttributesCompatParcelizer;", "Lo/serializeIterableToBundle$IconCompatParcelizer;", "Lo/serializeIterableToBundle$AudioAttributesImplApi26Parcelizer;", "Lo/serializeIterableToBundle$MediaBrowserCompatItemReceiver;", "Lo/serializeIterableToBundle$MediaBrowserCompatCustomActionResultReceiver;", "Lo/serializeIterableToBundle$AudioAttributesImplBaseParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class serializeIterableToBundle {

    public static final class MediaBrowserCompatCustomActionResultReceiver extends serializeIterableToBundle {
        private final readShort.AudioAttributesCompatParcelizer IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(readShort.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        }

        public final readShort.AudioAttributesCompatParcelizer write() {
            return this.IconCompatParcelizer;
        }
    }

    private serializeIterableToBundle() {
    }

    public static final class AudioAttributesImplBaseParcelizer extends serializeIterableToBundle {
        private final readShort.IconCompatParcelizer read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(readShort.IconCompatParcelizer iconCompatParcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.read = iconCompatParcelizer;
        }

        public final readShort.IconCompatParcelizer read() {
            return this.read;
        }
    }

    public /* synthetic */ serializeIterableToBundle(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class IconCompatParcelizer extends serializeIterableToBundle {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/serializeIterableToBundle$AudioAttributesImplApi26Parcelizer;", "Lo/serializeIterableToBundle;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends serializeIterableToBundle {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends serializeIterableToBundle {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2, String str3) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = str3;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/serializeIterableToBundle$write;", "Lo/serializeIterableToBundle;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends serializeIterableToBundle {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/serializeIterableToBundle$read;", "Lo/serializeIterableToBundle;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends serializeIterableToBundle {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public static final class AudioAttributesCompatParcelizer extends serializeIterableToBundle {
        private final String AudioAttributesCompatParcelizer;

        public AudioAttributesCompatParcelizer(String str) {
            super(null);
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/serializeIterableToBundle$MediaBrowserCompatItemReceiver;", "Lo/serializeIterableToBundle;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends serializeIterableToBundle {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }
}
