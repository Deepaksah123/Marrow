package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/zzex;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "Lo/zzex$AudioAttributesCompatParcelizer;", "Lo/zzex$read;", "Lo/zzex$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzex {

    public static final class RemoteActionCompatParcelizer extends zzex {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private zzex() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzex$read;", "Lo/zzex;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends zzex {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public /* synthetic */ zzex(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class AudioAttributesCompatParcelizer extends zzex {
        private final boolean IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str, String str2, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.read = str2;
            this.IconCompatParcelizer = z;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
