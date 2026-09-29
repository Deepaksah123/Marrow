package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin._byteOverflow;
import kotlin.getAnnotated;
import kotlin.getRawType;
import kotlin.of;

/* JADX INFO: loaded from: classes4.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object read = new Object();
    private final List<getAnnotated> RemoteActionCompatParcelizer;
    private getRawType write;

    public ProtectionLayout(Context context) {
        super(context);
        this.RemoteActionCompatParcelizer = new ArrayList();
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ProtectionLayout(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, 0);
        this.RemoteActionCompatParcelizer = new ArrayList();
    }

    public void setProtections(List<getAnnotated> list) {
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.addAll(list);
        if (isAttachedToWindow()) {
            AudioAttributesCompatParcelizer();
            write();
            requestApplyInsets();
        }
    }

    private of IconCompatParcelizer() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(_byteOverflow.IconCompatParcelizer.tag_system_bar_state_monitor);
        if (tag instanceof of) {
            return (of) tag;
        }
        of ofVar = new of(viewGroup);
        viewGroup.setTag(_byteOverflow.IconCompatParcelizer.tag_system_bar_state_monitor, ofVar);
        return ofVar;
    }

    private void RemoteActionCompatParcelizer() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(_byteOverflow.IconCompatParcelizer.tag_system_bar_state_monitor);
        if (tag instanceof of) {
            of ofVar = (of) tag;
            if (ofVar.AudioAttributesCompatParcelizer()) {
                return;
            }
            ofVar.IconCompatParcelizer();
            viewGroup.setTag(_byteOverflow.IconCompatParcelizer.tag_system_bar_state_monitor, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.write != null) {
            AudioAttributesCompatParcelizer();
        }
        write();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
    }

    private void write() {
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            return;
        }
        this.write = new getRawType(IconCompatParcelizer(), this.RemoteActionCompatParcelizer);
        int childCount = getChildCount();
        int iIconCompatParcelizer = this.write.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            IconCompatParcelizer(getContext(), i + childCount, this.write.write(i));
        }
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.write != null) {
            removeViews(getChildCount() - this.write.IconCompatParcelizer(), this.write.IconCompatParcelizer());
            int iIconCompatParcelizer = this.write.IconCompatParcelizer();
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                this.write.write(i).RemoteActionCompatParcelizer().read(null);
            }
            this.write.write();
            this.write = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(android.content.Context r7, int r8, kotlin.getAnnotated r9) {
        /*
            r6 = this;
            o.getAnnotated$IconCompatParcelizer r0 = r9.RemoteActionCompatParcelizer()
            int r1 = r9.write()
            r2 = 1
            r3 = 4
            r4 = -1
            if (r1 == r2) goto L42
            r2 = 2
            if (r1 == r2) goto L3b
            if (r1 == r3) goto L35
            r2 = 8
            if (r1 != r2) goto L1d
            int r9 = r0.read()
            r1 = 80
            goto L4a
        L1d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unexpected side: "
            r7.<init>(r8)
            int r8 = r9.write()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L35:
            int r9 = r0.AudioAttributesImplApi26Parcelizer()
            r1 = 5
            goto L47
        L3b:
            int r9 = r0.read()
            r1 = 48
            goto L4a
        L42:
            int r9 = r0.AudioAttributesImplApi26Parcelizer()
            r1 = 3
        L47:
            r5 = r4
            r4 = r9
            r9 = r5
        L4a:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r4, r9, r1)
            o._verifyEndArrayForSingle r9 = r0.RemoteActionCompatParcelizer()
            int r1 = r9.read
            r2.leftMargin = r1
            int r1 = r9.write
            r2.topMargin = r1
            int r1 = r9.IconCompatParcelizer
            r2.rightMargin = r1
            int r9 = r9.AudioAttributesCompatParcelizer
            r2.bottomMargin = r9
            android.view.View r9 = new android.view.View
            r9.<init>(r7)
            java.lang.Object r7 = androidx.core.view.insets.ProtectionLayout.read
            r9.setTag(r7)
            float r7 = r0.IconCompatParcelizer()
            r9.setTranslationX(r7)
            float r7 = r0.MediaBrowserCompatItemReceiver()
            r9.setTranslationY(r7)
            float r7 = r0.AudioAttributesCompatParcelizer()
            r9.setAlpha(r7)
            boolean r7 = r0.AudioAttributesImplBaseParcelizer()
            if (r7 == 0) goto L89
            r3 = 0
        L89:
            r9.setVisibility(r3)
            android.graphics.drawable.Drawable r7 = r0.write()
            r9.setBackground(r7)
            androidx.core.view.insets.ProtectionLayout$5 r7 = new androidx.core.view.insets.ProtectionLayout$5
            r7.<init>()
            r0.read(r7)
            r6.addView(r9, r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.insets.ProtectionLayout.IconCompatParcelizer(android.content.Context, int, o.getAnnotated):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != read) {
            getRawType getrawtype = this.write;
            int childCount = getChildCount() - (getrawtype != null ? getrawtype.IconCompatParcelizer() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }
}
