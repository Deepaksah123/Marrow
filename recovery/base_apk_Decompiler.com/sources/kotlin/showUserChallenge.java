package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/showUserChallenge;", "", "<init>", "()V", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/showUserChallenge$IconCompatParcelizer;", "Lo/showUserChallenge$write;", "Lo/showUserChallenge$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class showUserChallenge {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/showUserChallenge$write;", "Lo/showUserChallenge;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends showUserChallenge {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private showUserChallenge() {
    }

    public /* synthetic */ showUserChallenge(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class AudioAttributesCompatParcelizer extends showUserChallenge {
        private final boolean AudioAttributesCompatParcelizer;
        private final List<String> read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str, List<String> list, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.write = str;
            this.read = list;
            this.AudioAttributesCompatParcelizer = z;
        }

        public final List<String> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String read() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/showUserChallenge$IconCompatParcelizer;", "Lo/showUserChallenge;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends showUserChallenge {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }
}
