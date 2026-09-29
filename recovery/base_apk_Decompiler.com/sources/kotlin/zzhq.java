package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lo/zzhq;", "", "<init>", "()V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "write", "AudioAttributesCompatParcelizer", "Lo/zzhq$write;", "Lo/zzhq$AudioAttributesCompatParcelizer;", "Lo/zzhq$read;", "Lo/zzhq$RemoteActionCompatParcelizer;", "Lo/zzhq$IconCompatParcelizer;", "Lo/zzhq$AudioAttributesImplBaseParcelizer;", "Lo/zzhq$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzhq {

    public static final class MediaBrowserCompatCustomActionResultReceiver extends zzhq {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private zzhq() {
    }

    public static final class AudioAttributesImplBaseParcelizer extends zzhq {
        private final String AudioAttributesCompatParcelizer;
        private final String AudioAttributesImplBaseParcelizer;
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str, String str2, String str3, String str4, String str5, String str6) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(str5, "");
            toMagicModuleMetaRepoModel.write(str6, "");
            this.write = str;
            this.AudioAttributesImplBaseParcelizer = str2;
            this.IconCompatParcelizer = str3;
            this.RemoteActionCompatParcelizer = str4;
            this.AudioAttributesCompatParcelizer = str5;
            this.read = str6;
        }

        public final String read() {
            return this.write;
        }

        public final String MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String write() {
            return this.read;
        }
    }

    public /* synthetic */ zzhq(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends zzhq {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzhq$IconCompatParcelizer;", "Lo/zzhq;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends zzhq {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001a\u0010\r\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u0016\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0011\u0010\u0017"}, d2 = {"Lo/zzhq$read;", "Lo/zzhq;", "", "Lo/revokeAccess;", "p0", "", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZZ)V", "write", "Ljava/util/List;", "read", "()Ljava/util/List;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends zzhq {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final List<revokeAccess> read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(List<revokeAccess> list, String str, boolean z, boolean z2, boolean z3) {
            super(null);
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = list;
            this.IconCompatParcelizer = str;
            this.write = z;
            this.AudioAttributesCompatParcelizer = z2;
            this.RemoteActionCompatParcelizer = z3;
        }

        public /* synthetic */ read(List list, String str, boolean z, boolean z2, boolean z3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? z3 : false);
        }

        public final List<revokeAccess> read() {
            return this.read;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public read() {
            this(null, null, false, false, false, 31, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzhq$write;", "Lo/zzhq;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends zzhq {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzhq$AudioAttributesCompatParcelizer;", "Lo/zzhq;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends zzhq {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }
}
