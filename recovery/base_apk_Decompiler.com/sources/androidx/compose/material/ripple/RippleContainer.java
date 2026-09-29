package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin._handleApos;
import kotlin.setFeatureMask;
import kotlin.setHighestNonEscapedChar;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\f*\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010\u0015\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "p1", "p2", "p3", "p4", "", "onLayout", "(ZIIII)V", "onMeasure", "(II)V", "requestLayout", "()V", "Lo/setFeatureMask;", "Landroidx/compose/material/ripple/RippleHostView;", "IconCompatParcelizer", "(Lo/setFeatureMask;)Landroidx/compose/material/ripple/RippleHostView;", "read", "(Lo/setFeatureMask;)V", "AudioAttributesCompatParcelizer", "I", "RemoteActionCompatParcelizer", "", "write", "Ljava/util/List;", "Lo/setHighestNonEscapedChar;", "Lo/setHighestNonEscapedChar;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<RippleHostView> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setHighestNonEscapedChar IconCompatParcelizer;
    private int read;
    private final List<RippleHostView> write;

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public RippleContainer(Context context) {
        super(context);
        this.RemoteActionCompatParcelizer = 5;
        ArrayList arrayList = new ArrayList();
        this.write = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.AudioAttributesCompatParcelizer = arrayList2;
        this.IconCompatParcelizer = new setHighestNonEscapedChar();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.read = 1;
        setTag(_handleApos.AudioAttributesCompatParcelizer.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    protected final void onMeasure(int p0, int p1) {
        setMeasuredDimension(0, 0);
    }

    public final RippleHostView IconCompatParcelizer(setFeatureMask setfeaturemask) {
        RippleHostView rippleHostViewRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(setfeaturemask);
        if (rippleHostViewRemoteActionCompatParcelizer != null) {
            return rippleHostViewRemoteActionCompatParcelizer;
        }
        RippleHostView rippleHostView = (RippleHostView) IntermediateLoginResponseBody.read((List) this.AudioAttributesCompatParcelizer);
        if (rippleHostView == null) {
            if (this.read > IntermediateLoginResponseBody.write((List) this.write)) {
                rippleHostView = new RippleHostView(getContext());
                addView(rippleHostView);
                this.write.add(rippleHostView);
            } else {
                rippleHostView = this.write.get(this.read);
                setFeatureMask setfeaturemask2 = this.IconCompatParcelizer.read(rippleHostView);
                if (setfeaturemask2 != null) {
                    setfeaturemask2.read();
                    this.IconCompatParcelizer.IconCompatParcelizer(setfeaturemask2);
                    rippleHostView.RemoteActionCompatParcelizer();
                }
            }
            int i = this.read;
            if (i < this.RemoteActionCompatParcelizer - 1) {
                this.read = i + 1;
            } else {
                this.read = 0;
            }
        }
        this.IconCompatParcelizer.IconCompatParcelizer(setfeaturemask, rippleHostView);
        return rippleHostView;
    }

    public final void read(setFeatureMask setfeaturemask) {
        setfeaturemask.read();
        RippleHostView rippleHostViewRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(setfeaturemask);
        if (rippleHostViewRemoteActionCompatParcelizer != null) {
            rippleHostViewRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            this.IconCompatParcelizer.IconCompatParcelizer(setfeaturemask);
            this.AudioAttributesCompatParcelizer.add(rippleHostViewRemoteActionCompatParcelizer);
        }
    }
}
