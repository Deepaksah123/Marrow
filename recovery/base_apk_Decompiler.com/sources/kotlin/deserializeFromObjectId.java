package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/paramName;", "", "write", "(I)Z", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class deserializeFromObjectId {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(int i) {
        return paramName.write(i, paramName.INSTANCE.read()) || paramName.write(i, paramName.INSTANCE.AudioAttributesCompatParcelizer()) || paramName.write(i, paramName.INSTANCE.write());
    }
}
