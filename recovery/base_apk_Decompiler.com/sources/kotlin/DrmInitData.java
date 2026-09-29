package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/AudioAttributesImplApi21;", "", "p0", "", "p1", "write", "(Lo/AudioAttributesImplApi21;Ljava/lang/Object;I)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DrmInitData {
    public static final int write(AudioAttributesImplApi21 audioAttributesImplApi21, Object obj, int i) {
        int iWrite;
        return (obj == null || audioAttributesImplApi21.read() == 0 || (i < audioAttributesImplApi21.read() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, audioAttributesImplApi21.IconCompatParcelizer(i))) || (iWrite = audioAttributesImplApi21.write(obj)) == -1) ? i : iWrite;
    }
}
