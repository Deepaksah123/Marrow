package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0002\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"", "", "RemoteActionCompatParcelizer", "(F)Z", "Lo/assignParameter;", "read", "F", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setStatusBarBackgroundColor {
    private static final float read = assignParameter.IconCompatParcelizer(6.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }
}
