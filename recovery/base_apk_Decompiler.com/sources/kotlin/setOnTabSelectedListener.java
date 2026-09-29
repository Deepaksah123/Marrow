package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lo/setOnTabSelectedListener;", "", "<init>", "()V", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "write", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/setOnTabSelectedListener$RemoteActionCompatParcelizer;", "Lo/setOnTabSelectedListener$write;", "Lo/setOnTabSelectedListener$AudioAttributesCompatParcelizer;", "Lo/setOnTabSelectedListener$read;", "Lo/setOnTabSelectedListener$IconCompatParcelizer;", "Lo/setOnTabSelectedListener$AudioAttributesImplBaseParcelizer;", "Lo/setOnTabSelectedListener$MediaBrowserCompatCustomActionResultReceiver;", "Lo/setOnTabSelectedListener$MediaBrowserCompatItemReceiver;", "Lo/setOnTabSelectedListener$AudioAttributesImplApi21Parcelizer;", "Lo/setOnTabSelectedListener$AudioAttributesImplApi26Parcelizer;", "Lo/setOnTabSelectedListener$MediaBrowserCompatSearchResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setOnTabSelectedListener {

    public static final class MediaBrowserCompatSearchResultReceiver extends setOnTabSelectedListener {
        private final boolean AudioAttributesCompatParcelizer;

        public MediaBrowserCompatSearchResultReceiver(boolean z) {
            super(null);
            this.AudioAttributesCompatParcelizer = z;
        }

        public final boolean write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private setOnTabSelectedListener() {
    }

    public static final class AudioAttributesCompatParcelizer extends setOnTabSelectedListener {
        private final int AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(String str, int i) {
            super(null);
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = i;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public /* synthetic */ setOnTabSelectedListener(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class IconCompatParcelizer extends setOnTabSelectedListener {
        private final List<String> AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(List<String> list) {
            super(null);
            toMagicModuleMetaRepoModel.write(list, "");
            this.AudioAttributesCompatParcelizer = list;
        }

        public final List<String> read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends setOnTabSelectedListener {
        private final List<String> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(List<String> list) {
            super(null);
            toMagicModuleMetaRepoModel.write(list, "");
            this.write = list;
        }

        public final List<String> IconCompatParcelizer() {
            return this.write;
        }
    }

    public static final class read extends setOnTabSelectedListener {
        private final int AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, int i, boolean z, String str2, boolean z2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write = str;
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = z;
            this.read = str2;
            this.RemoteActionCompatParcelizer = z2;
        }

        public final String write() {
            return this.write;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final boolean IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setOnTabSelectedListener$RemoteActionCompatParcelizer;", "Lo/setOnTabSelectedListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends setOnTabSelectedListener {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setOnTabSelectedListener$MediaBrowserCompatCustomActionResultReceiver;", "Lo/setOnTabSelectedListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends setOnTabSelectedListener {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setOnTabSelectedListener$write;", "Lo/setOnTabSelectedListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends setOnTabSelectedListener {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setOnTabSelectedListener$AudioAttributesImplApi26Parcelizer;", "Lo/setOnTabSelectedListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends setOnTabSelectedListener {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends setOnTabSelectedListener {
        private final String IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setOnTabSelectedListener$MediaBrowserCompatItemReceiver;", "Lo/setOnTabSelectedListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends setOnTabSelectedListener {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }
}
