package kotlin;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public interface getActivityBanner extends Animatable {

    public static abstract class RemoteActionCompatParcelizer {
        Animatable2.AnimationCallback AudioAttributesCompatParcelizer;

        public void AudioAttributesCompatParcelizer(Drawable drawable) {
        }

        public void read(Drawable drawable) {
        }

        Animatable2.AnimationCallback read() {
            if (this.AudioAttributesCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer = new Animatable2.AnimationCallback() { // from class: o.getActivityBanner.RemoteActionCompatParcelizer.4
                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationStart(Drawable drawable) {
                        RemoteActionCompatParcelizer.this.read(drawable);
                    }

                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationEnd(Drawable drawable) {
                        RemoteActionCompatParcelizer.this.AudioAttributesCompatParcelizer(drawable);
                    }
                };
            }
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
