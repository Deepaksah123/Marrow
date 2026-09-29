package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface LoaderLoadErrorAction {
    int RemoteActionCompatParcelizer(String str);

    List<String> RemoteActionCompatParcelizer(String str, String str2);

    List<hasFatalError> RemoteActionCompatParcelizer(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j);

    List<String> write(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j);

    List<hasFatalError> write(String str);
}
