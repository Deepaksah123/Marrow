package kotlin;

import android.content.Context;
import android.view.View;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes5.dex */
class findFrame extends deserializeUsingCustom {
    private final hasSuperClassStartingWith.read write;

    public findFrame(Context context, int i) {
        this.write = new hasSuperClassStartingWith.read(16, context.getString(i));
    }

    @Override // kotlin.deserializeUsingCustom
    public void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
        super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
        hassuperclassstartingwith.AudioAttributesCompatParcelizer(this.write);
    }
}
