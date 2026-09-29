package kotlin;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/SettableAnyPropertyMapFieldAnyProperty;", "Lo/hasValueDeserializer;", "Landroid/view/inputmethod/InputConnection;", "p0", "Lkotlin/Function1;", "Lo/SettableAnyPropertyJsonNodeFieldAnyProperty;", "", "p1", "<init>", "(Landroid/view/inputmethod/InputConnection;Lo/getAnswerMap;)V", "Landroid/view/inputmethod/InputContentInfo;", "", "Landroid/os/Bundle;", "p2", "", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
class SettableAnyPropertyMapFieldAnyProperty extends hasValueDeserializer {
    public SettableAnyPropertyMapFieldAnyProperty(InputConnection inputConnection, getAnswerMap<? super SettableAnyPropertyJsonNodeFieldAnyProperty, getShowPopup> getanswermap) {
        super(inputConnection, getanswermap);
    }

    @Override // kotlin.SettableAnyPropertyAnySetterReferring, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo p0, int p1, Bundle p2) {
        InputConnection inputConnection = getWrite();
        if (inputConnection != null) {
            return inputConnection.commitContent(p0, p1, p2);
        }
        return false;
    }
}
