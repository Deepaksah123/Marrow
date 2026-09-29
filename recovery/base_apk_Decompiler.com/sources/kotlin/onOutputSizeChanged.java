package kotlin;

import android.os.Process;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lo/onOutputSizeChanged;", "", "<init>", "()V", "read", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "RatingCompat", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "MediaDescriptionCompat", "MediaBrowserCompatCustomActionResultReceiver", "Lo/onOutputSizeChanged$RemoteActionCompatParcelizer;", "Lo/onOutputSizeChanged$IconCompatParcelizer;", "Lo/onOutputSizeChanged$AudioAttributesCompatParcelizer;", "Lo/onOutputSizeChanged$read;", "Lo/onOutputSizeChanged$write;", "Lo/onOutputSizeChanged$MediaBrowserCompatCustomActionResultReceiver;", "Lo/onOutputSizeChanged$AudioAttributesImplApi21Parcelizer;", "Lo/onOutputSizeChanged$AudioAttributesImplApi26Parcelizer;", "Lo/onOutputSizeChanged$MediaBrowserCompatItemReceiver;", "Lo/onOutputSizeChanged$AudioAttributesImplBaseParcelizer;", "Lo/onOutputSizeChanged$MediaBrowserCompatMediaItem;", "Lo/onOutputSizeChanged$RatingCompat;", "Lo/onOutputSizeChanged$MediaMetadataCompat;", "Lo/onOutputSizeChanged$MediaDescriptionCompat;", "Lo/onOutputSizeChanged$MediaBrowserCompatSearchResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class onOutputSizeChanged {

    public static final class read extends onOutputSizeChanged {
        public static int RemoteActionCompatParcelizer;
        public static int read;
        private final String AudioAttributesCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write = str;
            this.AudioAttributesCompatParcelizer = str2;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String read() {
            return this.write;
        }

        public static int AudioAttributesCompatParcelizer() {
            int i = read;
            int i2 = i % 8360497;
            read = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int iMyTid = Process.myTid();
            RemoteActionCompatParcelizer = iMyTid;
            return iMyTid;
        }
    }

    private onOutputSizeChanged() {
    }

    public static final class AudioAttributesCompatParcelizer extends onOutputSizeChanged {
        private final String IconCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write = str;
            this.IconCompatParcelizer = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String write() {
            return this.IconCompatParcelizer;
        }
    }

    public /* synthetic */ onOutputSizeChanged(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class MediaBrowserCompatItemReceiver extends onOutputSizeChanged {
        private final String AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = i;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends onOutputSizeChanged {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends onOutputSizeChanged {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String write() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver extends onOutputSizeChanged {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatSearchResultReceiver(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class RatingCompat extends onOutputSizeChanged {
        private final getAttributeValueIgnorePrefix IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RatingCompat(getAttributeValueIgnorePrefix getattributevalueignoreprefix) {
            super(null);
            toMagicModuleMetaRepoModel.write(getattributevalueignoreprefix, "");
            this.IconCompatParcelizer = getattributevalueignoreprefix;
        }

        public final getAttributeValueIgnorePrefix AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends onOutputSizeChanged {
        private final int write;

        public AudioAttributesImplBaseParcelizer() {
            super(null);
            this.write = 0;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    public static final class MediaBrowserCompatMediaItem extends onOutputSizeChanged {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatMediaItem(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    public static final class MediaMetadataCompat extends onOutputSizeChanged {
        private final onOutputFrameAvailableForRendering write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(onOutputFrameAvailableForRendering onoutputframeavailableforrendering) {
            super(null);
            toMagicModuleMetaRepoModel.write(onoutputframeavailableforrendering, "");
            this.write = onoutputframeavailableforrendering;
        }

        public final onOutputFrameAvailableForRendering AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    public static final class write extends onOutputSizeChanged {
        private final String AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOutputSizeChanged$IconCompatParcelizer;", "Lo/onOutputSizeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends onOutputSizeChanged {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOutputSizeChanged$RemoteActionCompatParcelizer;", "Lo/onOutputSizeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends onOutputSizeChanged {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOutputSizeChanged$MediaDescriptionCompat;", "Lo/onOutputSizeChanged;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaDescriptionCompat extends onOutputSizeChanged {
        public static final MediaDescriptionCompat INSTANCE = new MediaDescriptionCompat();

        private MediaDescriptionCompat() {
            super(null);
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends onOutputSizeChanged {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
