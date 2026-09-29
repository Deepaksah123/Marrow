package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/onOpen;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "write", "Lo/onOpen$write;", "Lo/onOpen$AudioAttributesCompatParcelizer;", "Lo/onOpen$RemoteActionCompatParcelizer;", "Lo/onOpen$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class onOpen {

    public static final class RemoteActionCompatParcelizer extends onOpen {
        private final getMediaMimeType AudioAttributesCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, getMediaMimeType getmediamimetype) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(getmediamimetype, "");
            this.write = str;
            this.AudioAttributesCompatParcelizer = getmediamimetype;
        }

        public final getMediaMimeType AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }
    }

    private onOpen() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOpen$AudioAttributesCompatParcelizer;", "Lo/onOpen;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends onOpen {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ onOpen(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends onOpen {
        private final long AudioAttributesCompatParcelizer;

        public read(long j) {
            super(null);
            this.AudioAttributesCompatParcelizer = j;
        }

        public final long write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onOpen$write;", "Lo/onOpen;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends onOpen {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
