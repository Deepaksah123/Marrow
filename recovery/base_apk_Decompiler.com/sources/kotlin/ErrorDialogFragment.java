package kotlin;

import com.marrow2.data.tag.local.model.TagLSModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lo/ErrorDialogFragment;", "", "<init>", "()V", "read", "write", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/ErrorDialogFragment$write;", "Lo/ErrorDialogFragment$read;", "Lo/ErrorDialogFragment$AudioAttributesCompatParcelizer;", "Lo/ErrorDialogFragment$RemoteActionCompatParcelizer;", "Lo/ErrorDialogFragment$IconCompatParcelizer;", "Lo/ErrorDialogFragment$AudioAttributesImplBaseParcelizer;", "Lo/ErrorDialogFragment$AudioAttributesImplApi21Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ErrorDialogFragment {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ErrorDialogFragment$read;", "Lo/ErrorDialogFragment;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends ErrorDialogFragment {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    private ErrorDialogFragment() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ErrorDialogFragment$write;", "Lo/ErrorDialogFragment;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends ErrorDialogFragment {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public /* synthetic */ ErrorDialogFragment(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class AudioAttributesImplBaseParcelizer extends ErrorDialogFragment {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class IconCompatParcelizer extends ErrorDialogFragment {
        private final int AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(int i) {
            super(null);
            this.AudioAttributesCompatParcelizer = i;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends ErrorDialogFragment {
        private final TagLSModel AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(TagLSModel tagLSModel) {
            super(null);
            toMagicModuleMetaRepoModel.write(tagLSModel, "");
            this.AudioAttributesCompatParcelizer = tagLSModel;
        }

        public final TagLSModel AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ErrorDialogFragment$AudioAttributesCompatParcelizer;", "Lo/ErrorDialogFragment;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends ErrorDialogFragment {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends ErrorDialogFragment {
        private final Exception AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(Exception exc) {
            super(null);
            this.AudioAttributesCompatParcelizer = exc;
        }

        public final Exception AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
