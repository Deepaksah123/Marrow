package kotlin;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class removeOnUserLeaveHintListener extends Drawable {
    final ActionBarContainer write;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public removeOnUserLeaveHintListener(ActionBarContainer actionBarContainer) {
        this.write = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.write.write) {
            if (this.write.IconCompatParcelizer != null) {
                this.write.IconCompatParcelizer.draw(canvas);
            }
        } else {
            if (this.write.AudioAttributesCompatParcelizer != null) {
                this.write.AudioAttributesCompatParcelizer.draw(canvas);
            }
            if (this.write.read == null || !this.write.RemoteActionCompatParcelizer) {
                return;
            }
            this.write.read.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.write.write) {
            if (this.write.IconCompatParcelizer != null) {
                IconCompatParcelizer.AudioAttributesCompatParcelizer(this.write.AudioAttributesCompatParcelizer, outline);
            }
        } else if (this.write.AudioAttributesCompatParcelizer != null) {
            IconCompatParcelizer.AudioAttributesCompatParcelizer(this.write.AudioAttributesCompatParcelizer, outline);
        }
    }

    static class IconCompatParcelizer {
        public static void AudioAttributesCompatParcelizer(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }
}
