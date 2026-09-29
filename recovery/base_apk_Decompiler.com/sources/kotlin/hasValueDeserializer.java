package kotlin;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/hasValueDeserializer;", "Lo/SettableAnyPropertyAnySetterReferring;", "Landroid/view/inputmethod/InputConnection;", "p0", "Lkotlin/Function1;", "Lo/SettableAnyPropertyJsonNodeFieldAnyProperty;", "", "p1", "<init>", "(Landroid/view/inputmethod/InputConnection;Lo/getAnswerMap;)V", "", "", "deleteSurroundingTextInCodePoints", "(II)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "write", "(Landroid/view/inputmethod/InputConnection;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
class hasValueDeserializer extends SettableAnyPropertyAnySetterReferring {
    public hasValueDeserializer(InputConnection inputConnection, getAnswerMap<? super SettableAnyPropertyJsonNodeFieldAnyProperty, getShowPopup> getanswermap) {
        super(inputConnection, getanswermap);
    }

    @Override // kotlin.SettableAnyPropertyAnySetterReferring, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int p0, int p1) {
        InputConnection inputConnection = getWrite();
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(p0, p1);
        }
        return false;
    }

    @Override // kotlin.SettableAnyPropertyAnySetterReferring, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = getWrite();
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }

    @Override // kotlin.SettableAnyPropertyAnySetterReferring
    protected final void write(InputConnection p0) {
        p0.closeConnection();
    }
}
