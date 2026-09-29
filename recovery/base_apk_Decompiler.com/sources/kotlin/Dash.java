package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface Dash {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Dash$AudioAttributesCompatParcelizer;", "Lo/Dash;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements Dash {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/Dash$read;", "Lo/Dash;", "", "p0", "<init>", "(Z)V", "RemoteActionCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "()Z", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements Dash {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean read;

        public read(boolean z) {
            this.read = z;
        }

        public /* synthetic */ read(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? false : z);
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getRead() {
            return this.read;
        }

        public read() {
            this(false, 1, null);
        }
    }

    public static final class RemoteActionCompatParcelizer implements Dash {
        private final String IconCompatParcelizer;

        public RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class IconCompatParcelizer implements Dash {
        private final List<String> AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(List<String> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.AudioAttributesCompatParcelizer = list;
        }

        public final List<String> write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
