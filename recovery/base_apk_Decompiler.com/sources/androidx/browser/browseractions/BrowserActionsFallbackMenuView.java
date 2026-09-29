package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.setContentHeight;

/* JADX INFO: loaded from: classes4.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int AudioAttributesCompatParcelizer;
    private final int read;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = getResources().getDimensionPixelOffset(setContentHeight.read.browser_actions_context_menu_min_padding);
        this.AudioAttributesCompatParcelizer = getResources().getDimensionPixelOffset(setContentHeight.read.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.read << 1), this.AudioAttributesCompatParcelizer), 1073741824), i2);
    }
}
