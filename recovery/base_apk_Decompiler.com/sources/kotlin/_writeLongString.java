package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/_handleOddName;", "Lo/isAnnotationBundle;", "p0", "", "p1", "Lo/_skipWSOrEnd;", "p2", "Lo/getContentType;", "p3", "", "p4", "Lo/switchAndReturnNext;", "p5", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;Lo/isAnnotationBundle;ZLo/_skipWSOrEnd;Lo/getContentType;FLo/switchAndReturnNext;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _writeLongString {
    public static /* synthetic */ _handleOddName AudioAttributesCompatParcelizer$default(_handleOddName _handleoddname, isAnnotationBundle isannotationbundle, boolean z, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, float f, switchAndReturnNext switchandreturnnext, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            _skipwsorend = _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer();
        }
        _skipWSOrEnd _skipwsorend2 = _skipwsorend;
        if ((i & 8) != 0) {
            getcontenttype = getContentType.INSTANCE.read();
        }
        getContentType getcontenttype2 = getcontenttype;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            switchandreturnnext = null;
        }
        return AudioAttributesCompatParcelizer(_handleoddname, isannotationbundle, z2, _skipwsorend2, getcontenttype2, f2, switchandreturnnext);
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, isAnnotationBundle isannotationbundle, boolean z, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, float f, switchAndReturnNext switchandreturnnext) {
        return _handleoddname.AudioAttributesCompatParcelizer(new _writeFieldNameTail(isannotationbundle, z, _skipwsorend, getcontenttype, f, switchandreturnnext));
    }
}
