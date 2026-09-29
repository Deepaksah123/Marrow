package in.juspay.hyper.core;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lin/juspay/hyper/core/FileProviderInterface;", "", "Landroid/content/Context;", "p0", "", "p1", "readFromFile", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "", "p2", "", "renewFile", "(Ljava/lang/String;Ljava/lang/String;J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FileProviderInterface {
    String readFromFile(Context p0, String p1);

    void renewFile(String p0, String p1, long p2);
}
