package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface LoaderReleaseTask {
    List<String> IconCompatParcelizer(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    int RemoteActionCompatParcelizer(String str);

    List<String> RemoteActionCompatParcelizer(String str, String str2);

    List<hasFatalError> read(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    List<hasFatalError> write(String str);
}
