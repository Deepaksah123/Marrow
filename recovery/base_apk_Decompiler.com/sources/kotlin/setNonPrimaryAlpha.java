package kotlin;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setNonPrimaryAlpha;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "p0", "", "read", "(Landroid/view/inputmethod/EditorInfo;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setNonPrimaryAlpha {
    public static final setNonPrimaryAlpha INSTANCE = new setNonPrimaryAlpha();

    private setNonPrimaryAlpha() {
    }

    public final void read(EditorInfo p0) {
        p0.setSupportedHandwritingGestures(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
        p0.setSupportedHandwritingGesturePreviews(getKycMessage.IconCompatParcelizer(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class));
    }
}
