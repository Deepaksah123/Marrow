package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface WifiLockManager {
    boolean AudioAttributesCompatParcelizer(String str, String str2);

    long IconCompatParcelizer(String str, String str2, String str3);

    notifySeekStarted IconCompatParcelizer(String str, String str2);

    int RemoteActionCompatParcelizer(String str, String str2);

    boolean RemoteActionCompatParcelizer();

    boolean read(String str, String str2);

    boolean write(String str, Set<Pair<String, String>> set);
}
