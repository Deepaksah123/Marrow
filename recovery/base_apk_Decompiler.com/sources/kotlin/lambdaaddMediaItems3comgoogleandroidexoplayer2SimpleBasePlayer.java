package kotlin;

import com.razorpay.C$0o__;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer {
    private static final /* synthetic */ lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer[] AudioAttributesCompatParcelizer;
    public static final lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer IconCompatParcelizer = new lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer(C$0o__.IMAGE, 0);
    public static final lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer read = new lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer("GIF", 1);
    public static final lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer RemoteActionCompatParcelizer = new lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer("FILES", 2);

    private lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer(String str, int i) {
    }

    static {
        lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer[] lambdaaddmediaitems3comgoogleandroidexoplayer2simplebaseplayerArr = read();
        AudioAttributesCompatParcelizer = lambdaaddmediaitems3comgoogleandroidexoplayer2simplebaseplayerArr;
        getMagicModuleTimeline.IconCompatParcelizer(lambdaaddmediaitems3comgoogleandroidexoplayer2simplebaseplayerArr);
    }

    public static lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer valueOf(String str) {
        return (lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer) Enum.valueOf(lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.class, str);
    }

    public static lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer[] values() {
        return (lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer[]) AudioAttributesCompatParcelizer.clone();
    }

    private static final /* synthetic */ lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer[] read() {
        return new lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer[]{IconCompatParcelizer, read, RemoteActionCompatParcelizer};
    }
}
