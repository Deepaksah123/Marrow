package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b"}, d2 = {"Lo/_handleOddName;", "Lo/superDispatchKeyEvent;", "p0", "read", "(Lo/_handleOddName;Lo/superDispatchKeyEvent;)Lo/_handleOddName;", "Lo/assignParameter;", "write", "F", "()F", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isFrameRateFromParent {
    private static final float write = assignParameter.IconCompatParcelizer(30.0f);

    public static final _handleOddName read(_handleOddName _handleoddname, superDispatchKeyEvent superdispatchkeyevent) {
        _handleOddName _handleoddnameRemoteActionCompatParcelizer;
        if (superdispatchkeyevent == superDispatchKeyEvent.write) {
            _handleoddnameRemoteActionCompatParcelizer = _handleUnexpectedValue.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, setInterpolatedProgress.INSTANCE);
        } else {
            _handleoddnameRemoteActionCompatParcelizer = _handleUnexpectedValue.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, setDensity.INSTANCE);
        }
        return _handleoddname.AudioAttributesCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer);
    }

    public static final float read() {
        return write;
    }
}
