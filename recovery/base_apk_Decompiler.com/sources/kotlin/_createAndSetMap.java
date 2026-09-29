package kotlin;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/_createAndSetMap;", "Lo/SettableAnyPropertyMapFieldAnyProperty;", "Landroid/view/inputmethod/InputConnection;", "p0", "Lkotlin/Function1;", "Lo/SettableAnyPropertyJsonNodeFieldAnyProperty;", "", "p1", "<init>", "(Landroid/view/inputmethod/InputConnection;Lo/getAnswerMap;)V", "Landroid/view/inputmethod/HandwritingGesture;", "Ljava/util/concurrent/Executor;", "Ljava/util/function/IntConsumer;", "p2", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
class _createAndSetMap extends SettableAnyPropertyMapFieldAnyProperty {
    public _createAndSetMap(InputConnection inputConnection, getAnswerMap<? super SettableAnyPropertyJsonNodeFieldAnyProperty, getShowPopup> getanswermap) {
        super(inputConnection, getanswermap);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture p0, Executor p1, IntConsumer p2) {
        InputConnection inputConnection = getWrite();
        if (inputConnection != null) {
            inputConnection.performHandwritingGesture(p0, p1, p2);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture p0, CancellationSignal p1) {
        InputConnection inputConnection = getWrite();
        if (inputConnection != null) {
            return inputConnection.previewHandwritingGesture(p0, p1);
        }
        return false;
    }
}
