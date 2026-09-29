package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import kotlin.JsonParserDelegate;
import kotlin.Metadata;
import kotlin._handleApos;
import kotlin.balloc;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "p1", "p2", "p3", "p4", "", "onLayout", "(ZIIII)V", "onMeasure", "(II)V", "requestLayout", "()V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getChildCount", "()I", "Lo/JsonParserDelegate;", "Landroid/view/View;", "", "AudioAttributesCompatParcelizer", "(Lo/JsonParserDelegate;Landroid/view/View;J)V", "read", "Z", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DrawChildContainer extends ViewGroup {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(_handleApos.AudioAttributesCompatParcelizer.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    protected void onMeasure(int p0, int p1) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas p0) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            toMagicModuleMetaRepoModel.read(childAt, "");
            if (((ViewLayer) childAt).getAudioAttributesImplApi26Parcelizer()) {
                this.IconCompatParcelizer = true;
                try {
                    super.dispatchDraw(p0);
                    return;
                } finally {
                    this.IconCompatParcelizer = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.IconCompatParcelizer) {
            return super.getChildCount();
        }
        return 0;
    }

    public final void AudioAttributesCompatParcelizer(JsonParserDelegate p0, View p1, long p2) {
        super.drawChild(balloc.RemoteActionCompatParcelizer(p0), p1, p2);
    }
}
