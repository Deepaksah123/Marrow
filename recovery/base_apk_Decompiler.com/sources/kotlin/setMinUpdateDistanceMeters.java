package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/setMinUpdateDistanceMeters;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/setMinUpdateDistanceMeters$AudioAttributesCompatParcelizer;", "Lo/setMinUpdateDistanceMeters$write;", "Lo/setMinUpdateDistanceMeters$RemoteActionCompatParcelizer;", "Lo/setMinUpdateDistanceMeters$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setMinUpdateDistanceMeters {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setMinUpdateDistanceMeters$RemoteActionCompatParcelizer;", "Lo/setMinUpdateDistanceMeters;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends setMinUpdateDistanceMeters {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    private setMinUpdateDistanceMeters() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setMinUpdateDistanceMeters$write;", "Lo/setMinUpdateDistanceMeters;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends setMinUpdateDistanceMeters {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public /* synthetic */ setMinUpdateDistanceMeters(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setMinUpdateDistanceMeters$AudioAttributesCompatParcelizer;", "Lo/setMinUpdateDistanceMeters;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setMinUpdateDistanceMeters {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class IconCompatParcelizer extends setMinUpdateDistanceMeters {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }
}
