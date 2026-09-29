package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/mutableSetOfWithSize;", "", "<init>", "()V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "write", "Lo/mutableSetOfWithSize$read;", "Lo/mutableSetOfWithSize$IconCompatParcelizer;", "Lo/mutableSetOfWithSize$RemoteActionCompatParcelizer;", "Lo/mutableSetOfWithSize$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class mutableSetOfWithSize {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\f\u0010\u0018"}, d2 = {"Lo/mutableSetOfWithSize$IconCompatParcelizer;", "Lo/mutableSetOfWithSize;", "", "p0", "Lo/onDisplayInfoChanged;", "p1", "", "p2", "Lo/zzhs;", "p3", "<init>", "(Ljava/lang/String;Lo/onDisplayInfoChanged;ZLo/zzhs;)V", "IconCompatParcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "write", "Lo/onDisplayInfoChanged;", "RemoteActionCompatParcelizer", "()Lo/onDisplayInfoChanged;", "AudioAttributesCompatParcelizer", "Z", "()Z", "Lo/zzhs;", "()Lo/zzhs;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends mutableSetOfWithSize {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final boolean read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final onDisplayInfoChanged AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final zzhs IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, boolean z, zzhs zzhsVar) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
            toMagicModuleMetaRepoModel.write(zzhsVar, "");
            this.write = str;
            this.AudioAttributesCompatParcelizer = ondisplayinfochanged;
            this.read = z;
            this.IconCompatParcelizer = zzhsVar;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final onDisplayInfoChanged getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final zzhs getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    private mutableSetOfWithSize() {
    }

    public /* synthetic */ mutableSetOfWithSize(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends mutableSetOfWithSize {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String write() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/mutableSetOfWithSize$read;", "Lo/mutableSetOfWithSize;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends mutableSetOfWithSize {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/mutableSetOfWithSize$write;", "Lo/mutableSetOfWithSize;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends mutableSetOfWithSize {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
