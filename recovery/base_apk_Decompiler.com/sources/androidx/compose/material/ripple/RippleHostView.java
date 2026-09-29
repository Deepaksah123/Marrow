package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.material.ripple.RippleHostView;
import kotlin.Metadata;
import kotlin.calloc;
import kotlin.getCreatedOnDateMs;
import kotlin.getOnline;
import kotlin.getReferencedType;
import kotlin.getShowPopup;
import kotlin.setOverriddenInsets;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.writeBoolean;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0015J-\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0015J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0017R\u0018\u0010\"\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u0016\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010+\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "p1", "", "onMeasure", "(II)V", "", "p2", "p3", "p4", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "draw", "(Landroid/graphics/Canvas;)V", "refreshDrawableState", "()V", "IconCompatParcelizer", "(Z)V", "Landroid/graphics/drawable/Drawable;", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lo/setOverriddenInsets$read;", "Lo/calloc;", "Lo/switchToNext;", "", "p5", "Lkotlin/Function0;", "p6", "RemoteActionCompatParcelizer", "(Lo/setOverriddenInsets$read;ZJIJFLo/getCreatedOnDateMs;)V", "read", "setRippleProperties-biQXAtU", "(JIJF)V", "setRippleProperties", "Lo/writeBoolean;", "MediaBrowserCompatItemReceiver", "Lo/writeBoolean;", "write", "Ljava/lang/Boolean;", "AudioAttributesCompatParcelizer", "", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/Long;", "Ljava/lang/Runnable;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/Runnable;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getCreatedOnDateMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private Runnable write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Long IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private writeBoolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Boolean AudioAttributesCompatParcelizer;
    public static final int RemoteActionCompatParcelizer = 8;
    private static final int[] AudioAttributesCompatParcelizer = {R.attr.state_pressed, R.attr.state_enabled};
    private static final int[] read = new int[0];

    @Override // android.view.View
    protected final void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public RippleHostView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onMeasure(int p0, int p1) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas p0) {
        if (!isAttachedToWindow()) {
            RemoteActionCompatParcelizer();
        } else {
            super.draw(p0);
        }
    }

    private final void IconCompatParcelizer(boolean p0) {
        writeBoolean writeboolean = new writeBoolean(p0);
        setBackground(writeboolean);
        this.RemoteActionCompatParcelizer = writeboolean;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable p0) {
        getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.read;
        if (getcreatedondatems != null) {
            getcreatedondatems.invoke();
        }
    }

    public final void RemoteActionCompatParcelizer(setOverriddenInsets.read p0, boolean p1, long p2, int p3, long p4, float p5, getCreatedOnDateMs<getShowPopup> p6) {
        if (this.RemoteActionCompatParcelizer == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Boolean.valueOf(p1), this.AudioAttributesCompatParcelizer)) {
            IconCompatParcelizer(p1);
            this.AudioAttributesCompatParcelizer = Boolean.valueOf(p1);
        }
        writeBoolean writeboolean = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(writeboolean);
        this.read = p6;
        m0setRipplePropertiesbiQXAtU(p2, p3, p4, p5);
        if (p1) {
            writeboolean.setHotspot(getReferencedType.write(p0.getIconCompatParcelizer()), getReferencedType.MediaBrowserCompatCustomActionResultReceiver(p0.getIconCompatParcelizer()));
        } else {
            writeboolean.setHotspot(writeboolean.getBounds().centerX(), writeboolean.getBounds().centerY());
        }
        RemoteActionCompatParcelizer(true);
    }

    public final void read() {
        RemoteActionCompatParcelizer(false);
    }

    /* JADX INFO: renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m0setRipplePropertiesbiQXAtU(long p0, int p1, long p2, float p3) {
        writeBoolean writeboolean = this.RemoteActionCompatParcelizer;
        if (writeboolean == null) {
            return;
        }
        writeboolean.write(p1);
        writeboolean.AudioAttributesCompatParcelizer(p2, p3);
        Rect rect = new Rect(0, 0, getOnline.RemoteActionCompatParcelizer(calloc.AudioAttributesCompatParcelizer(p0)), getOnline.RemoteActionCompatParcelizer(calloc.RemoteActionCompatParcelizer(p0)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        writeboolean.setBounds(rect);
    }

    public final void RemoteActionCompatParcelizer() {
        this.read = null;
        Runnable runnable = this.write;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.write;
            toMagicModuleMetaRepoModel.write(runnable2);
            runnable2.run();
        } else {
            writeBoolean writeboolean = this.RemoteActionCompatParcelizer;
            if (writeboolean != null) {
                writeboolean.setState(read);
            }
        }
        writeBoolean writeboolean2 = this.RemoteActionCompatParcelizer;
        if (writeboolean2 == null) {
            return;
        }
        writeboolean2.setVisible(false, false);
        unscheduleDrawable(writeboolean2);
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.write;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.IconCompatParcelizer;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (!p0 && jCurrentAnimationTimeMillis - jLongValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: o.setRootValueSeparator
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.AudioAttributesCompatParcelizer(this.write);
                }
            };
            this.write = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            int[] iArr = p0 ? AudioAttributesCompatParcelizer : read;
            writeBoolean writeboolean = this.RemoteActionCompatParcelizer;
            if (writeboolean != null) {
                writeboolean.setState(iArr);
            }
        }
        this.IconCompatParcelizer = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(RippleHostView rippleHostView) {
        writeBoolean writeboolean = rippleHostView.RemoteActionCompatParcelizer;
        if (writeboolean != null) {
            writeboolean.setState(read);
        }
        rippleHostView.write = null;
    }
}
