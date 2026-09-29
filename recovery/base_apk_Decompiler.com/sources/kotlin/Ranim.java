package kotlin;

import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lo/Ranim;", "", "<init>", "()V", "AudioAttributesImplBaseParcelizer", "read", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/Ranim$read;", "Lo/Ranim$write;", "Lo/Ranim$IconCompatParcelizer;", "Lo/Ranim$RemoteActionCompatParcelizer;", "Lo/Ranim$AudioAttributesCompatParcelizer;", "Lo/Ranim$AudioAttributesImplBaseParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Ranim {

    public static final class AudioAttributesImplBaseParcelizer extends Ranim {
        private final boolean IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final List<String> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str, List<String> list, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.RemoteActionCompatParcelizer = str;
            this.write = list;
            this.IconCompatParcelizer = z;
        }

        public final boolean IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final List<String> RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private Ranim() {
    }

    public /* synthetic */ Ranim(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Ranim$read;", "Lo/Ranim;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends Ranim {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Ranim$write;", "Lo/Ranim;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends Ranim {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends Ranim {
        private final boolean AudioAttributesCompatParcelizer;
        private final CustomModuleSubjectListModel write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(CustomModuleSubjectListModel customModuleSubjectListModel, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(customModuleSubjectListModel, "");
            this.write = customModuleSubjectListModel;
            this.AudioAttributesCompatParcelizer = z;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final CustomModuleSubjectListModel RemoteActionCompatParcelizer() {
            return this.write;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends Ranim {
        private final CustomModuleSubjectListModel AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(CustomModuleSubjectListModel customModuleSubjectListModel) {
            super(null);
            toMagicModuleMetaRepoModel.write(customModuleSubjectListModel, "");
            this.AudioAttributesCompatParcelizer = customModuleSubjectListModel;
        }

        public final CustomModuleSubjectListModel read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Ranim$IconCompatParcelizer;", "Lo/Ranim;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends Ranim {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }
}
