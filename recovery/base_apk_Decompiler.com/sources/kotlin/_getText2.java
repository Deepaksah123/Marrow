package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@GX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005"}, d2 = {"Lo/_getText2;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_getCharDesc;", "p0", "<init>", "(Lo/_getCharDesc;)V", "", "c_", "()V", "write", "Lo/_getCharDesc;", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _getText2 extends _handleOddName.IconCompatParcelizer {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private _getCharDesc read;

    public _getText2(_getCharDesc _getchardesc) {
        this.read = _getchardesc;
    }

    public final void IconCompatParcelizer(_getCharDesc _getchardesc) {
        this.read = _getchardesc;
        collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).RemoteActionCompatParcelizer(_getchardesc);
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).RemoteActionCompatParcelizer(this.read);
    }
}
