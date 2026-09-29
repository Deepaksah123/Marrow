package kotlin;

import com.marrow.data.models.user.State;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lo/setExtraMultilineHeightEnabled;", "", "<init>", "()V", "read", "write", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/setExtraMultilineHeightEnabled$IconCompatParcelizer;", "Lo/setExtraMultilineHeightEnabled$AudioAttributesCompatParcelizer;", "Lo/setExtraMultilineHeightEnabled$read;", "Lo/setExtraMultilineHeightEnabled$RemoteActionCompatParcelizer;", "Lo/setExtraMultilineHeightEnabled$write;", "Lo/setExtraMultilineHeightEnabled$AudioAttributesImplApi26Parcelizer;", "Lo/setExtraMultilineHeightEnabled$AudioAttributesImplApi21Parcelizer;", "Lo/setExtraMultilineHeightEnabled$MediaBrowserCompatItemReceiver;", "Lo/setExtraMultilineHeightEnabled$AudioAttributesImplBaseParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setExtraMultilineHeightEnabled {

    public static final class read extends setExtraMultilineHeightEnabled {
        private final setExpandedTitleMarginStart IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, setExpandedTitleMarginStart setexpandedtitlemarginstart) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(setexpandedtitlemarginstart, "");
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = setexpandedtitlemarginstart;
        }

        public final setExpandedTitleMarginStart IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private setExtraMultilineHeightEnabled() {
    }

    public static final class write extends setExtraMultilineHeightEnabled {
        private final String AudioAttributesCompatParcelizer;
        private final int RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = i;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public /* synthetic */ setExtraMultilineHeightEnabled(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class MediaBrowserCompatItemReceiver extends setExtraMultilineHeightEnabled {
        private final long read;

        public MediaBrowserCompatItemReceiver(long j) {
            super(null);
            this.read = j;
        }

        public final long read() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExtraMultilineHeightEnabled$AudioAttributesImplApi21Parcelizer;", "Lo/setExtraMultilineHeightEnabled;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends setExtraMultilineHeightEnabled {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExtraMultilineHeightEnabled$IconCompatParcelizer;", "Lo/setExtraMultilineHeightEnabled;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends setExtraMultilineHeightEnabled {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExtraMultilineHeightEnabled$AudioAttributesImplBaseParcelizer;", "Lo/setExtraMultilineHeightEnabled;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends setExtraMultilineHeightEnabled {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExtraMultilineHeightEnabled$AudioAttributesCompatParcelizer;", "Lo/setExtraMultilineHeightEnabled;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setExtraMultilineHeightEnabled {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setExtraMultilineHeightEnabled$RemoteActionCompatParcelizer;", "Lo/setExtraMultilineHeightEnabled;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends setExtraMultilineHeightEnabled {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends setExtraMultilineHeightEnabled {
        private final String IconCompatParcelizer;
        private final List<State> read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesImplApi26Parcelizer(List<? extends State> list, String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = list;
            this.IconCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final List<State> write() {
            return this.read;
        }
    }
}
