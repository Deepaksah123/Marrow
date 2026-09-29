package kotlin;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/WorkAccountApiAddAccountResult;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkAccountApiAddAccountResult {
    private static final /* synthetic */ WorkAccountApiAddAccountResult[] RemoteActionCompatParcelizer;
    public static final WorkAccountApiAddAccountResult IconCompatParcelizer = new WorkAccountApiAddAccountResult(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 0);
    public static final WorkAccountApiAddAccountResult read = new WorkAccountApiAddAccountResult("QBANK", 1);
    public static final WorkAccountApiAddAccountResult write = new WorkAccountApiAddAccountResult("TEST", 2);
    public static final WorkAccountApiAddAccountResult AudioAttributesCompatParcelizer = new WorkAccountApiAddAccountResult("BOOKMARK", 3);

    private WorkAccountApiAddAccountResult(String str, int i) {
    }

    static {
        WorkAccountApiAddAccountResult[] workAccountApiAddAccountResultArr = read();
        RemoteActionCompatParcelizer = workAccountApiAddAccountResultArr;
        getMagicModuleTimeline.IconCompatParcelizer(workAccountApiAddAccountResultArr);
    }

    private static final /* synthetic */ WorkAccountApiAddAccountResult[] read() {
        return new WorkAccountApiAddAccountResult[]{IconCompatParcelizer, read, write, AudioAttributesCompatParcelizer};
    }

    public static WorkAccountApiAddAccountResult valueOf(String str) {
        return (WorkAccountApiAddAccountResult) Enum.valueOf(WorkAccountApiAddAccountResult.class, str);
    }

    public static WorkAccountApiAddAccountResult[] values() {
        return (WorkAccountApiAddAccountResult[]) RemoteActionCompatParcelizer.clone();
    }
}
