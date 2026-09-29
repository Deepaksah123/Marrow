package kotlin;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getActivityBanner;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0012\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001IBC\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u00103J\u0019\u00108\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010>\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0012H\u0016¢\u0006\u0004\b@\u0010\"J\u000f\u0010A\u001a\u00020\u0012H\u0016¢\u0006\u0004\bA\u0010\"J\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020+H\u0016¢\u0006\u0004\b!\u0010BJ\u001f\u0010C\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020.H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010,\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020#H\u0000¢\u0006\u0004\b,\u0010ER\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020+0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010GR\u0011\u0010I\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u0016\u0010,\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010JR\u0011\u0010!\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010K\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010HR\u0014\u0010N\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010HR\u0016\u0010M\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010HR\u0011\u0010O\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\bP\u0010LR\u0011\u0010Q\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010P\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010JR\u0016\u0010V\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010H"}, d2 = {"Lo/ExoPlayerBuilderExternalSyntheticLambda5;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Lo/getActivityBanner;", "p0", "p1", "Lo/lambdaupdatePlaybackInfo16;", "p2", "", "p3", "", "p4", "p5", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lo/lambdaupdatePlaybackInfo16;IZZ)V", "write", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "Landroid/graphics/Canvas;", "", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "isRunning", "()Z", "IconCompatParcelizer", "()V", "Landroid/graphics/Rect;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "onLevelChange", "(I)Z", "", "onStateChange", "([I)Z", "Lo/getActivityBanner$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "(Lo/getActivityBanner$RemoteActionCompatParcelizer;)V", "Ljava/lang/Runnable;", "", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "setAlpha", "(I)V", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "setTint", "Landroid/graphics/BlendMode;", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "Landroid/content/res/ColorStateList;", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", TtmlNode.START, "stop", "(Lo/getActivityBanner$RemoteActionCompatParcelizer;)Z", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V", "", "Ljava/util/List;", "I", "read", "Landroid/graphics/drawable/Drawable;", "AudioAttributesCompatParcelizer", "Z", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "Lo/lambdaupdatePlaybackInfo16;", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem", "J", "RatingCompat", "MediaMetadataCompat", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExoPlayerBuilderExternalSyntheticLambda5 extends Drawable implements Drawable.Callback, getActivityBanner {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Drawable RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final lambdaupdatePlaybackInfo16 MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private long RatingCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private Drawable MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<getActivityBanner.RemoteActionCompatParcelizer> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    public ExoPlayerBuilderExternalSyntheticLambda5(Drawable drawable, Drawable drawable2, lambdaupdatePlaybackInfo16 lambdaupdateplaybackinfo16, int i, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(lambdaupdateplaybackinfo16, "");
        this.MediaBrowserCompatItemReceiver = lambdaupdateplaybackinfo16;
        this.read = i;
        this.IconCompatParcelizer = z;
        this.AudioAttributesImplApi26Parcelizer = z2;
        this.write = new ArrayList();
        this.AudioAttributesImplBaseParcelizer = write(drawable == null ? null : Integer.valueOf(drawable.getIntrinsicWidth()), drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicWidth()));
        this.AudioAttributesCompatParcelizer = write(drawable == null ? null : Integer.valueOf(drawable.getIntrinsicHeight()), drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicHeight()));
        this.MediaBrowserCompatCustomActionResultReceiver = drawable == null ? null : drawable.mutate();
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.RemoteActionCompatParcelizer = drawableMutate;
        this.AudioAttributesImplApi21Parcelizer = 255;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
        Drawable drawable3 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas p0) {
        int iSave;
        Drawable drawable;
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i == 0) {
            Drawable drawable2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (drawable2 != null) {
                drawable2.setAlpha(this.AudioAttributesImplApi21Parcelizer);
                iSave = p0.save();
                try {
                    drawable2.draw(p0);
                    return;
                } finally {
                }
            }
            return;
        }
        if (i == 2) {
            Drawable drawable3 = this.RemoteActionCompatParcelizer;
            if (drawable3 == null) {
                return;
            }
            drawable3.setAlpha(this.AudioAttributesImplApi21Parcelizer);
            iSave = p0.save();
            try {
                drawable3.draw(p0);
                return;
            } finally {
            }
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.RatingCompat) / ((double) this.read);
        double d = getQues.read(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        int i3 = (int) (d * ((double) i2));
        if (this.IconCompatParcelizer) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.MediaBrowserCompatCustomActionResultReceiver) != null) {
            drawable.setAlpha(i2);
            iSave = p0.save();
            try {
                drawable.draw(p0);
            } finally {
            }
        }
        Drawable drawable4 = this.RemoteActionCompatParcelizer;
        if (drawable4 != null) {
            drawable4.setAlpha(i3);
            iSave = p0.save();
            try {
                drawable4.draw(p0);
            } finally {
            }
        }
        if (z) {
            IconCompatParcelizer();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int p0) {
        if (p0 < 0 || p0 > 255) {
            throw new IllegalArgumentException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Invalid alpha: ", (Object) Integer.valueOf(p0)).toString());
        }
        this.AudioAttributesImplApi21Parcelizer = p0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        }
        if (i == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable;
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i == 0) {
            Drawable drawable2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (drawable2 == null) {
                return null;
            }
            return drawable2.getColorFilter();
        }
        if (i != 1) {
            if (i == 2 && (drawable = this.RemoteActionCompatParcelizer) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.RemoteActionCompatParcelizer;
        ColorFilter colorFilter = drawable3 == null ? null : drawable3.getColorFilter();
        if (colorFilter != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (drawable4 == null) {
            return null;
        }
        return drawable4.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter p0) {
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        if (drawable != null) {
            drawable.setColorFilter(p0);
        }
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(p0);
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        if (drawable != null) {
            RemoteActionCompatParcelizer(drawable, p0);
        }
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        if (drawable2 == null) {
            return;
        }
        RemoteActionCompatParcelizer(drawable2, p0);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int p0) {
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean level = drawable == null ? false : drawable.setLevel(p0);
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        return level || (drawable2 == null ? false : drawable2.setLevel(p0));
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean state = drawable == null ? false : drawable.setState(p0);
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        return state || (drawable2 == null ? false : drawable2.setState(p0));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable p0, Runnable p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        unscheduleSelf(p1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable p0, Runnable p1, long p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        scheduleSelf(p1, p2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int p0) {
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        if (drawable != null) {
            drawable.setTint(p0);
        }
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTint(p0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList p0) {
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        if (drawable != null) {
            drawable.setTintList(p0);
        }
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintList(p0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode p0) {
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        if (drawable != null) {
            drawable.setTintMode(p0);
        }
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintMode(p0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode p0) {
        Drawable drawable = this.MediaBrowserCompatCustomActionResultReceiver;
        if (drawable != null) {
            drawable.setTintBlendMode(p0);
        }
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintBlendMode(p0);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.MediaBrowserCompatSearchResultReceiver == 1;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.MediaBrowserCompatCustomActionResultReceiver;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.RemoteActionCompatParcelizer;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.MediaBrowserCompatSearchResultReceiver != 0) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = 1;
        this.RatingCompat = SystemClock.uptimeMillis();
        List<getActivityBanner.RemoteActionCompatParcelizer> list = this.write;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                list.get(i).read(this);
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.MediaBrowserCompatCustomActionResultReceiver;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.RemoteActionCompatParcelizer;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.MediaBrowserCompatSearchResultReceiver != 2) {
            IconCompatParcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write.add(p0);
    }

    public final boolean IconCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.write.remove(p0);
    }

    private void RemoteActionCompatParcelizer(Drawable p0, Rect p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        int intrinsicWidth = p0.getIntrinsicWidth();
        int intrinsicHeight = p0.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            p0.setBounds(p1);
            return;
        }
        int iWidth = p1.width();
        int iHeight = p1.height();
        ExoPlayerBuilderExternalSyntheticLambda22 exoPlayerBuilderExternalSyntheticLambda22 = ExoPlayerBuilderExternalSyntheticLambda22.INSTANCE;
        double d = ExoPlayerBuilderExternalSyntheticLambda22.read(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.MediaBrowserCompatItemReceiver);
        int i = getOnline.read((((double) iWidth) - (((double) intrinsicWidth) * d)) / 2.0d);
        int i2 = getOnline.read((((double) iHeight) - (d * ((double) intrinsicHeight))) / 2.0d);
        p0.setBounds(p1.left + i, p1.top + i2, p1.right - i, p1.bottom - i2);
    }

    private final int write(Integer p0, Integer p1) {
        if (this.AudioAttributesImplApi26Parcelizer || ((p0 == null || p0.intValue() != -1) && (p1 == null || p1.intValue() != -1))) {
            return Math.max(p0 == null ? -1 : p0.intValue(), p1 != null ? p1.intValue() : -1);
        }
        return -1;
    }

    private final void IconCompatParcelizer() {
        this.MediaBrowserCompatSearchResultReceiver = 2;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        List<getActivityBanner.RemoteActionCompatParcelizer> list = this.write;
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            list.get(i).AudioAttributesCompatParcelizer(this);
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
