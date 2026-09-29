package kotlin;

import com.google.android.gms.common.Scopes;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\b"}, d2 = {"Lo/lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer {
    private static final /* synthetic */ lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer[] IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    public static final lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer AudioAttributesCompatParcelizer = new lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer("PROFILE", 0, Scopes.PROFILE);
    public static final lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer read = new lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer("RAISED", 1, "raised");

    private lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer(String str, int i, String str2) {
        this.IconCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    static {
        lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer[] lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayerArrIconCompatParcelizer = IconCompatParcelizer();
        IconCompatParcelizer = lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayerArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(lambdareplacemediaitems5comgoogleandroidexoplayer2simplebaseplayerArrIconCompatParcelizer);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: o.lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer$write;", "", "<init>", "()V", "", "p0", "Lo/lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer;", "write", "(Z)Lo/lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer write(boolean p0) {
            return p0 ? lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.AudioAttributesCompatParcelizer : lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer valueOf(String str) {
        return (lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer) Enum.valueOf(lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.class, str);
    }

    public static lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer[] values() {
        return (lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer[]) IconCompatParcelizer.clone();
    }

    private static final /* synthetic */ lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer[] IconCompatParcelizer() {
        return new lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer[]{AudioAttributesCompatParcelizer, read};
    }
}
