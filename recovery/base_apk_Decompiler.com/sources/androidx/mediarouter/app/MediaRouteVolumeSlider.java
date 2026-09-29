package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import kotlin._init_lambda5;
import kotlin.getAccessible;

/* JADX INFO: loaded from: classes4.dex */
public class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private Drawable IconCompatParcelizer;
    private final float RemoteActionCompatParcelizer;
    private boolean read;
    private int write;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.RemoteActionCompatParcelizer = getAccessible.AudioAttributesCompatParcelizer(context);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.RemoteActionCompatParcelizer * 255.0f);
        this.IconCompatParcelizer.setColorFilter(this.write, PorterDuff.Mode.SRC_IN);
        this.IconCompatParcelizer.setAlpha(i);
        getProgressDrawable().setColorFilter(this.write, PorterDuff.Mode.SRC_IN);
        getProgressDrawable().setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.IconCompatParcelizer = drawable;
        if (this.read) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public void setHideThumb(boolean z) {
        if (this.read == z) {
            return;
        }
        this.read = z;
        super.setThumb(z ? null : this.IconCompatParcelizer);
    }

    public void setColor(int i) {
        if (this.write == i) {
            return;
        }
        if (Color.alpha(i) != 255) {
            Integer.toHexString(i);
        }
        this.write = i;
    }
}
