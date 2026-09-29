package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/Module;", "Lo/_handleOddName$IconCompatParcelizer;", "write", "(Lo/Module;)Lo/_handleOddName$IconCompatParcelizer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _verifyNoTrailingTokens {
    /* JADX INFO: Access modifiers changed from: private */
    public static final _handleOddName.IconCompatParcelizer write(Module module) {
        int iWrite = _bind.write(4);
        int iWrite2 = _bind.write(2);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = module.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null || (audioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer() & iWrite) == 0) {
            return null;
        }
        while (audioAttributesImplBaseParcelizer != null && (audioAttributesImplBaseParcelizer.getWrite() & iWrite2) == 0) {
            if ((audioAttributesImplBaseParcelizer.getWrite() & iWrite) != 0) {
                return audioAttributesImplBaseParcelizer;
            }
            audioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplBaseParcelizer();
        }
        return null;
    }
}
