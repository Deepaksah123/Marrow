package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/setMapToolbarEnabled;", "", "<init>", "()V", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/setMapToolbarEnabled$AudioAttributesCompatParcelizer;", "Lo/setMapToolbarEnabled$RemoteActionCompatParcelizer;", "Lo/setMapToolbarEnabled$IconCompatParcelizer;", "Lo/setMapToolbarEnabled$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setMapToolbarEnabled {

    public static final class read extends setMapToolbarEnabled {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private setMapToolbarEnabled() {
    }

    public static final class RemoteActionCompatParcelizer extends setMapToolbarEnabled {
        private final String IconCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String write() {
            return this.write;
        }
    }

    public /* synthetic */ setMapToolbarEnabled(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class IconCompatParcelizer extends setMapToolbarEnabled {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setMapToolbarEnabled$AudioAttributesCompatParcelizer;", "Lo/setMapToolbarEnabled;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setMapToolbarEnabled {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }
}
