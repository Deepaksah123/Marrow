package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lo/zaaj;", "", "<init>", "()V", "read", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/zaaj$AudioAttributesCompatParcelizer;", "Lo/zaaj$IconCompatParcelizer;", "Lo/zaaj$write;", "Lo/zaaj$read;", "Lo/zaaj$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zaaj {

    public static final class read extends zaaj {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String write() {
            return this.write;
        }
    }

    private zaaj() {
    }

    public static final class write extends zaaj {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String write() {
            return this.write;
        }
    }

    public /* synthetic */ zaaj(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends zaaj {
        private final String IconCompatParcelizer;

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zaaj$AudioAttributesCompatParcelizer;", "Lo/zaaj;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends zaaj {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zaaj$IconCompatParcelizer;", "Lo/zaaj;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends zaaj {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }
}
