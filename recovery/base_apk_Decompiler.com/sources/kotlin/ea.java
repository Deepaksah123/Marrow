package kotlin;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/ea;", "Lo/getNextWindowIndex;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroidx/work/WorkerParameters;", "p2", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ea extends getNextWindowIndex {
    public static final ea INSTANCE = new ea();

    @Override // kotlin.getNextWindowIndex
    public final /* synthetic */ j read(Context context, String str, WorkerParameters workerParameters) {
        AudioAttributesCompatParcelizer(context, str, workerParameters);
        return null;
    }

    private ea() {
    }

    private static Void AudioAttributesCompatParcelizer(Context p0, String p1, WorkerParameters p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return null;
    }
}
