package kotlin;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class getSampleNumber extends NavigationBarItemView {
    public getSampleNumber(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public final int AudioAttributesCompatParcelizer() {
        return calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_navigation_rail_item;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public final int read() {
        return calculateNextSearchBytePosition.write.mtrl_navigation_rail_icon_margin;
    }
}
