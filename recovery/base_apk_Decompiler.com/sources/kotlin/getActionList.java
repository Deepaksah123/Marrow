package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0018\u0010\u0006\u001a\u00020\u0000*\u00020\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"", "AudioAttributesCompatParcelizer", "()Z", "Lo/DeserializationContext;", "RemoteActionCompatParcelizer", "(Lo/DeserializationContext;)Z", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getActionList {
    public static final boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    public static final boolean RemoteActionCompatParcelizer(DeserializationContext deserializationContext) {
        return deserializationContext.getAudioAttributesCompatParcelizer() == 2;
    }
}
