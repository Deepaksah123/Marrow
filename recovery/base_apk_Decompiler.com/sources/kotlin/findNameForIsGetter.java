package kotlin;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class findNameForIsGetter extends ClickableSpan {
    private final hasSuperClassStartingWith AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int write;

    public findNameForIsGetter(int i, hasSuperClassStartingWith hassuperclassstartingwith, int i2) {
        this.write = i;
        this.AudioAttributesCompatParcelizer = hassuperclassstartingwith;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.write);
        this.AudioAttributesCompatParcelizer.read(this.RemoteActionCompatParcelizer, bundle);
    }
}
