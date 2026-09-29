package kotlin;

import android.text.style.TtsSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/handleIgnoredProperty;", "Landroid/text/style/TtsSpan;", "write", "(Lo/handleIgnoredProperty;)Landroid/text/style/TtsSpan;", "Lo/handleUnknownProperties;", "RemoteActionCompatParcelizer", "(Lo/handleUnknownProperties;)Landroid/text/style/TtsSpan;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getValueTypeDesc {
    public static final TtsSpan write(handleIgnoredProperty handleignoredproperty) {
        if (handleignoredproperty instanceof handleUnknownProperties) {
            return RemoteActionCompatParcelizer((handleUnknownProperties) handleignoredproperty);
        }
        throw new RenewEligibleCreator();
    }

    public static final TtsSpan RemoteActionCompatParcelizer(handleUnknownProperties handleunknownproperties) {
        return new TtsSpan.VerbatimBuilder(handleunknownproperties.getRead()).build();
    }
}
