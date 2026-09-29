package kotlin;

import kotlin.Metadata;
import kotlin.setExpandedTitleTextSize;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lo/setExpandedTitleTextAppearance;", "", "<init>", "()V", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "AudioAttributesImplBaseParcelizer", "read", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Lo/setExpandedTitleTextAppearance$IconCompatParcelizer;", "Lo/setExpandedTitleTextAppearance$RemoteActionCompatParcelizer;", "Lo/setExpandedTitleTextAppearance$read;", "Lo/setExpandedTitleTextAppearance$AudioAttributesCompatParcelizer;", "Lo/setExpandedTitleTextAppearance$write;", "Lo/setExpandedTitleTextAppearance$AudioAttributesImplApi26Parcelizer;", "Lo/setExpandedTitleTextAppearance$MediaBrowserCompatItemReceiver;", "Lo/setExpandedTitleTextAppearance$AudioAttributesImplBaseParcelizer;", "Lo/setExpandedTitleTextAppearance$AudioAttributesImplApi21Parcelizer;", "Lo/setExpandedTitleTextAppearance$MediaBrowserCompatCustomActionResultReceiver;", "Lo/setExpandedTitleTextAppearance$MediaBrowserCompatSearchResultReceiver;", "Lo/setExpandedTitleTextAppearance$MediaBrowserCompatMediaItem;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setExpandedTitleTextAppearance {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExpandedTitleTextAppearance$MediaBrowserCompatSearchResultReceiver;", "Lo/setExpandedTitleTextAppearance;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatSearchResultReceiver extends setExpandedTitleTextAppearance {
        public static final MediaBrowserCompatSearchResultReceiver INSTANCE = new MediaBrowserCompatSearchResultReceiver();

        private MediaBrowserCompatSearchResultReceiver() {
            super(null);
        }
    }

    private setExpandedTitleTextAppearance() {
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends setExpandedTitleTextAppearance {
        private final boolean AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(boolean z, boolean z2, String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = z;
            this.IconCompatParcelizer = z2;
            this.read = str;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean write() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.read;
        }
    }

    public /* synthetic */ setExpandedTitleTextAppearance(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExpandedTitleTextAppearance$IconCompatParcelizer;", "Lo/setExpandedTitleTextAppearance;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends setExpandedTitleTextAppearance {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends setExpandedTitleTextAppearance {
        private final setExpandedTitleTextSize.IconCompatParcelizer IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(int i, setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = iconCompatParcelizer;
        }

        public final setExpandedTitleTextSize.IconCompatParcelizer IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExpandedTitleTextAppearance$MediaBrowserCompatItemReceiver;", "Lo/setExpandedTitleTextAppearance;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver extends setExpandedTitleTextAppearance {
        public static final MediaBrowserCompatItemReceiver INSTANCE = new MediaBrowserCompatItemReceiver();

        private MediaBrowserCompatItemReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExpandedTitleTextAppearance$AudioAttributesImplApi21Parcelizer;", "Lo/setExpandedTitleTextAppearance;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends setExpandedTitleTextAppearance {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExpandedTitleTextAppearance$MediaBrowserCompatMediaItem;", "Lo/setExpandedTitleTextAppearance;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatMediaItem extends setExpandedTitleTextAppearance {
        public static final MediaBrowserCompatMediaItem INSTANCE = new MediaBrowserCompatMediaItem();

        private MediaBrowserCompatMediaItem() {
            super(null);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends setExpandedTitleTextAppearance {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class read extends setExpandedTitleTextAppearance {
        private final int RemoteActionCompatParcelizer;

        public read() {
            super(null);
            this.RemoteActionCompatParcelizer = 0;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExpandedTitleTextAppearance$AudioAttributesCompatParcelizer;", "Lo/setExpandedTitleTextAppearance;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setExpandedTitleTextAppearance {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class write extends setExpandedTitleTextAppearance {
        private final String AudioAttributesCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, String str2, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesCompatParcelizer = str;
            this.read = str2;
            this.RemoteActionCompatParcelizer = i;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final int write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setExpandedTitleTextAppearance$RemoteActionCompatParcelizer;", "Lo/setExpandedTitleTextAppearance;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer extends setExpandedTitleTextAppearance {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        public final int hashCode() {
            return -719110775;
        }

        private RemoteActionCompatParcelizer() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "RemoteActionCompatParcelizer";
        }
    }
}
