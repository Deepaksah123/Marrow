package kotlin;

import com.marrow2.ui.qbank.lesson_list.model.SealedLessonDetailsModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lo/getClientBWLJW6A;", "", "<init>", "()V", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi26Parcelizer", "write", "MediaDescriptionCompat", "MediaBrowserCompatItemReceiver", "Lo/getClientBWLJW6A$write;", "Lo/getClientBWLJW6A$RemoteActionCompatParcelizer;", "Lo/getClientBWLJW6A$AudioAttributesCompatParcelizer;", "Lo/getClientBWLJW6A$IconCompatParcelizer;", "Lo/getClientBWLJW6A$read;", "Lo/getClientBWLJW6A$AudioAttributesImplApi21Parcelizer;", "Lo/getClientBWLJW6A$MediaBrowserCompatItemReceiver;", "Lo/getClientBWLJW6A$AudioAttributesImplBaseParcelizer;", "Lo/getClientBWLJW6A$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getClientBWLJW6A$AudioAttributesImplApi26Parcelizer;", "Lo/getClientBWLJW6A$MediaBrowserCompatSearchResultReceiver;", "Lo/getClientBWLJW6A$MediaDescriptionCompat;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getClientBWLJW6A {

    public static final class AudioAttributesImplApi21Parcelizer extends getClientBWLJW6A {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }
    }

    private getClientBWLJW6A() {
    }

    public static final class RemoteActionCompatParcelizer extends getClientBWLJW6A {
        private final String read;
        private final int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
            this.write = i;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    public /* synthetic */ getClientBWLJW6A(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class IconCompatParcelizer extends getClientBWLJW6A {
        private final List<SealedLessonDetailsModel.Lesson> AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, List<SealedLessonDetailsModel.Lesson> list, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.read = str;
            this.AudioAttributesCompatParcelizer = list;
            this.IconCompatParcelizer = z;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final List<SealedLessonDetailsModel.Lesson> IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean write() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientBWLJW6A$AudioAttributesCompatParcelizer;", "Lo/getClientBWLJW6A;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends getClientBWLJW6A {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientBWLJW6A$read;", "Lo/getClientBWLJW6A;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getClientBWLJW6A {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientBWLJW6A$MediaBrowserCompatCustomActionResultReceiver;", "Lo/getClientBWLJW6A;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver extends getClientBWLJW6A {
        public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

        private MediaBrowserCompatCustomActionResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientBWLJW6A$AudioAttributesImplBaseParcelizer;", "Lo/getClientBWLJW6A;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends getClientBWLJW6A {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientBWLJW6A$MediaBrowserCompatSearchResultReceiver;", "Lo/getClientBWLJW6A;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaBrowserCompatSearchResultReceiver extends getClientBWLJW6A {
        public static final MediaBrowserCompatSearchResultReceiver INSTANCE = new MediaBrowserCompatSearchResultReceiver();

        private MediaBrowserCompatSearchResultReceiver() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientBWLJW6A$AudioAttributesImplApi26Parcelizer;", "Lo/getClientBWLJW6A;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends getClientBWLJW6A {
        public static final AudioAttributesImplApi26Parcelizer INSTANCE = new AudioAttributesImplApi26Parcelizer();

        private AudioAttributesImplApi26Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getClientBWLJW6A$write;", "Lo/getClientBWLJW6A;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends getClientBWLJW6A {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public static final class MediaDescriptionCompat extends getClientBWLJW6A {
        private final int AudioAttributesCompatParcelizer;
        private final int RemoteActionCompatParcelizer;

        public MediaDescriptionCompat(int i, int i2) {
            super(null);
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        public final int IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends getClientBWLJW6A {
        private final setErrorTextColor IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(setErrorTextColor seterrortextcolor) {
            super(null);
            toMagicModuleMetaRepoModel.write(seterrortextcolor, "");
            this.IconCompatParcelizer = seterrortextcolor;
        }

        public final setErrorTextColor AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }
}
