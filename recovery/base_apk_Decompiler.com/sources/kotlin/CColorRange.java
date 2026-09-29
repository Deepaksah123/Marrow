package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface CColorRange {
    void IconCompatParcelizer(String str);

    List<String> RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(CBufferFlags cBufferFlags);

    CBufferFlags write(String str, int i);

    default CBufferFlags write(CProjection cProjection) {
        toMagicModuleMetaRepoModel.write(cProjection, "");
        return write(cProjection.AudioAttributesCompatParcelizer(), cProjection.RemoteActionCompatParcelizer());
    }
}
