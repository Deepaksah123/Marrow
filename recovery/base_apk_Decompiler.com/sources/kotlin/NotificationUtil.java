package kotlin;

import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0014\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J%\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J9\u0010\u001c\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R6\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/marrow2/domain/mcq/model/MarkCMQBCompleteUCModel;", "", "result", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "status", "<init>", "(Ljava/util/HashMap;I)V", "getResult", "()Ljava/util/HashMap;", "setResult", "(Ljava/util/HashMap;)V", "getStatus", "()I", "setStatus", "(I)V", "addAnswer", "", "mcqId", "answerIndex", "addAll", "allAnswers", "", "Lcom/marrow2/data/mcq/local/model/McqAnswerRepoModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationUtil {
    private HashMap<String, Integer> AudioAttributesCompatParcelizer;
    private int write;

    private NotificationUtil(HashMap<String, Integer> map, int i) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.AudioAttributesCompatParcelizer = map;
        this.write = i;
    }

    public /* synthetic */ NotificationUtil(HashMap map, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? new HashMap() : map, (i2 & 2) != 0 ? 2 : i);
    }

    public final HashMap<String, Integer> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(int i) {
        this.write = i;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    private final void write(String str, int i) {
        this.AudioAttributesCompatParcelizer.put(str, Integer.valueOf(i));
    }

    public final void RemoteActionCompatParcelizer(List<dropTable> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        for (dropTable droptable : list) {
            write(droptable.getMediaBrowserCompatItemReceiver(), droptable.getMediaBrowserCompatCustomActionResultReceiver());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationUtil() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationUtil)) {
            return false;
        }
        NotificationUtil notificationUtil = (NotificationUtil) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, notificationUtil.AudioAttributesCompatParcelizer) && this.write == notificationUtil.write;
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        HashMap<String, Integer> map = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        StringBuilder sb = new StringBuilder("MarkCMQBCompleteUCModel(result=");
        sb.append(map);
        sb.append(", status=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
