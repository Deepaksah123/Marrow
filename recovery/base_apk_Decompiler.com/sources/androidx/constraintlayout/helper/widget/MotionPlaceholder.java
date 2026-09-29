package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import kotlin.JdkDeserializers;
import kotlin.JsonNodeDeserializer;
import kotlin._readAndBindStringKeyMap;
import kotlin._readAndUpdateStringKeyMap;

/* JADX INFO: loaded from: classes4.dex */
public class MotionPlaceholder extends VirtualLayout {
    private _readAndUpdateStringKeyMap AudioAttributesImplBaseParcelizer;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void IconCompatParcelizer(JsonNodeDeserializer jsonNodeDeserializer, SparseArray<JdkDeserializers> sparseArray) {
    }

    public MotionPlaceholder(Context context) {
        super(context);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        read(this.AudioAttributesImplBaseParcelizer, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void read(_readAndBindStringKeyMap _readandbindstringkeymap, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (_readandbindstringkeymap != null) {
            _readandbindstringkeymap.read(mode, size, mode2, size2);
            setMeasuredDimension(_readandbindstringkeymap.RemoteActionCompatParcelizer(), _readandbindstringkeymap.IconCompatParcelizer());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        super.AudioAttributesCompatParcelizer(attributeSet);
        this.RemoteActionCompatParcelizer = new _readAndUpdateStringKeyMap();
        MediaBrowserCompatCustomActionResultReceiver();
    }
}
