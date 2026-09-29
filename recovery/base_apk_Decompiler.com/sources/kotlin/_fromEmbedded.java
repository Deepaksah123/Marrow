package kotlin;

import android.view.View;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/_fromEmbedded;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_reportTooManyCollisions;", "<init>", "()V", "Lo/makeChild;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/makeChild;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _fromEmbedded extends _handleOddName.IconCompatParcelizer implements _reportTooManyCollisions {
    @Override // kotlin._reportTooManyCollisions
    public final void RemoteActionCompatParcelizer(makeChild p0) {
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer;
        _fromEmbedded _fromembedded = this;
        View viewRemoteActionCompatParcelizer = _createWithMerge.RemoteActionCompatParcelizer(_fromembedded);
        p0.read(getRead().getRatingCompat() && _createWithMerge.RemoteActionCompatParcelizer(_fromembedded).hasFocusable());
        View viewFindFocus = viewRemoteActionCompatParcelizer.findFocus();
        if (viewFindFocus == null || (writableTypeIdInclusionIconCompatParcelizer = _findSecondary.IconCompatParcelizer(viewFindFocus, viewRemoteActionCompatParcelizer)) == null) {
            return;
        }
        p0.AudioAttributesCompatParcelizer(writableTypeIdInclusionIconCompatParcelizer);
    }
}
