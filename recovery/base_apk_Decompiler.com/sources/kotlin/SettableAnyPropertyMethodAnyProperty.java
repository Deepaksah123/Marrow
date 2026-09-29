package kotlin;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "p0", "Lkotlin/Function1;", "Lo/SettableAnyPropertyJsonNodeFieldAnyProperty;", "", "p1", "IconCompatParcelizer", "(Landroid/view/inputmethod/InputConnection;Lo/getAnswerMap;)Lo/SettableAnyPropertyJsonNodeFieldAnyProperty;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SettableAnyPropertyMethodAnyProperty {
    public static final SettableAnyPropertyJsonNodeFieldAnyProperty IconCompatParcelizer(InputConnection inputConnection, getAnswerMap<? super SettableAnyPropertyJsonNodeFieldAnyProperty, getShowPopup> getanswermap) {
        if (Build.VERSION.SDK_INT >= 34) {
            return new _createAndSetMap(inputConnection, getanswermap);
        }
        return new SettableAnyPropertyMapFieldAnyProperty(inputConnection, getanswermap);
    }
}
