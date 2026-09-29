package kotlin;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class setWindowStartTimeMs {
    private final containsType AudioAttributesCompatParcelizer;

    public setWindowStartTimeMs(containsType containstype) {
        toMagicModuleMetaRepoModel.write(containstype, "");
        this.AudioAttributesCompatParcelizer = containstype;
    }

    public final void AudioAttributesCompatParcelizer(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str, j);
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str);
    }

    public final Set<String> RemoteActionCompatParcelizer() {
        Set<String> setKeySet;
        Map<String, ?> mapWrite = this.AudioAttributesCompatParcelizer.write();
        return (mapWrite == null || (setKeySet = mapWrite.keySet()) == null) ? getKycMessage.read() : setKeySet;
    }

    public final long write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.AudioAttributesCompatParcelizer.read(str);
    }
}
