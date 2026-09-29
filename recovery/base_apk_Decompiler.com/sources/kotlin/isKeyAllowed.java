package kotlin;

import android.R;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.createHttpRequestHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class isKeyAllowed {
    public static final int IconCompatParcelizer(View view) {
        if (view == null) {
            return 0;
        }
        return write(view, view.getResources().getInteger(R.integer.config_shortAnimTime));
    }

    private static /* synthetic */ int write(View view, int i) {
        return write(view, i, 8);
    }

    private static int write(View view, int i, int i2) {
        if (view == null) {
            return 0;
        }
        AlphaAnimation alphaAnimation = createHttpRequestHeaders.read(1.0f, BitmapDescriptorFactory.HUE_RED, i);
        alphaAnimation.setStartOffset(i);
        alphaAnimation.setAnimationListener(new IconCompatParcelizer(view, 8));
        view.startAnimation(alphaAnimation);
        return i;
    }

    public static final class IconCompatParcelizer extends createHttpRequestHeaders.IconCompatParcelizer {
        private /* synthetic */ View read;
        private /* synthetic */ int write;

        IconCompatParcelizer(View view, int i) {
            this.read = view;
            this.write = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.read.setVisibility(this.write);
        }
    }

    public static final int RemoteActionCompatParcelizer(View view) {
        if (view == null) {
            return 0;
        }
        return write(view);
    }

    private static final int write(View view) {
        if (view == null) {
            return 0;
        }
        view.setVisibility(0);
        int integer = view.getResources().getInteger(R.integer.config_shortAnimTime);
        AlphaAnimation alphaAnimation = createHttpRequestHeaders.read(BitmapDescriptorFactory.HUE_RED, 1.0f, integer);
        alphaAnimation.setDuration(integer);
        alphaAnimation.setStartOffset(0L);
        alphaAnimation.setAnimationListener(new read(view));
        view.startAnimation(alphaAnimation);
        return integer;
    }

    public static final class read extends createHttpRequestHeaders.IconCompatParcelizer {
        private /* synthetic */ View RemoteActionCompatParcelizer;

        read(View view) {
            this.RemoteActionCompatParcelizer = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.RemoteActionCompatParcelizer.setVisibility(0);
        }
    }
}
