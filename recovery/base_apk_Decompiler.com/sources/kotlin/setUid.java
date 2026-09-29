package kotlin;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class setUid {
    private final containsType write;

    public setUid(containsType containstype) {
        toMagicModuleMetaRepoModel.write(containstype, "");
        this.write = containstype;
    }

    public final void write(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write.RemoteActionCompatParcelizer(str, j);
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write.RemoteActionCompatParcelizer(str);
    }

    public final Set<String> read() {
        Set<String> setKeySet;
        Map<String, ?> mapWrite = this.write.write();
        return (mapWrite == null || (setKeySet = mapWrite.keySet()) == null) ? getKycMessage.read() : setKeySet;
    }

    public final long write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.write.read(str);
    }
}
