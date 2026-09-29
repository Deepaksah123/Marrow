package kotlin;

import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\b"}, d2 = {"Lo/LoadErrorHandlingPolicyFallbackType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoadErrorHandlingPolicyFallbackType {
    public static final LoadErrorHandlingPolicyFallbackType AudioAttributesCompatParcelizer = new LoadErrorHandlingPolicyFallbackType("MCQ", 0, "mcq");
    public static final LoadErrorHandlingPolicyFallbackType IconCompatParcelizer = new LoadErrorHandlingPolicyFallbackType("LESSON", 1, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON);
    public static final LoadErrorHandlingPolicyFallbackType RemoteActionCompatParcelizer = new LoadErrorHandlingPolicyFallbackType("PEARL", 2, "pearl");
    private static final /* synthetic */ LoadErrorHandlingPolicyFallbackType[] read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    private LoadErrorHandlingPolicyFallbackType(String str, int i, String str2) {
        this.RemoteActionCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        LoadErrorHandlingPolicyFallbackType[] loadErrorHandlingPolicyFallbackTypeArr = read();
        read = loadErrorHandlingPolicyFallbackTypeArr;
        getMagicModuleTimeline.IconCompatParcelizer(loadErrorHandlingPolicyFallbackTypeArr);
    }

    private static final /* synthetic */ LoadErrorHandlingPolicyFallbackType[] read() {
        return new LoadErrorHandlingPolicyFallbackType[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static LoadErrorHandlingPolicyFallbackType valueOf(String str) {
        return (LoadErrorHandlingPolicyFallbackType) Enum.valueOf(LoadErrorHandlingPolicyFallbackType.class, str);
    }

    public static LoadErrorHandlingPolicyFallbackType[] values() {
        return (LoadErrorHandlingPolicyFallbackType[]) read.clone();
    }
}
