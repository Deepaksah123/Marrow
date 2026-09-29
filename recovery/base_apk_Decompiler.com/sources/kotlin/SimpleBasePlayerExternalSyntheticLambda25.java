package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.SimpleBasePlayerExternalSyntheticLambda14;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0019&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0014\u001a\u00020\u001b8\u0005@\u0005X\u0084.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010 \u001a\u0004\u0018\u00010\u000b8\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$\"\u0004\b\u001c\u0010%"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda25;", "Lo/SimpleBasePlayerExternalSyntheticLambda19;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnLongClickListener;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "", "onLongClick", "(Landroid/view/View;)Z", "Landroid/view/MotionEvent;", "p1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/widget/Button;", "IconCompatParcelizer", "(Landroid/widget/Button;Landroid/widget/Button;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "", "p2", "write", "(Landroid/widget/Button;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;I)V", "Landroid/view/GestureDetector;", "RemoteActionCompatParcelizer", "Landroid/view/GestureDetector;", "AudioAttributesImplApi21Parcelizer", "()Landroid/view/GestureDetector;", "AudioAttributesCompatParcelizer", "(Landroid/view/GestureDetector;)V", "Landroid/view/View;", "MediaBrowserCompatCustomActionResultReceiver", "()Landroid/view/View;", "(Landroid/view/View;)V", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBasePlayerExternalSyntheticLambda25 extends SimpleBasePlayerExternalSyntheticLambda19 implements View.OnTouchListener, View.OnLongClickListener {
    private View AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private GestureDetector IconCompatParcelizer;

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View p0) {
        return true;
    }

    final class read extends GestureDetector.SimpleOnGestureListener {
        public read() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            toMagicModuleMetaRepoModel.write(motionEvent2, "");
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getX() - motionEvent2.getX() > 120.0f && Math.abs(f) > 200.0d) {
                return write(false);
            }
            if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0d) {
                return false;
            }
            return write(true);
        }

        private boolean write(boolean z) {
            TranslateAnimation translateAnimation;
            AnimationSet animationSet = new AnimationSet(true);
            if (z) {
                translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, SimpleBasePlayerExternalSyntheticLambda25.this.write(50), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } else {
                translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, -SimpleBasePlayerExternalSyntheticLambda25.this.write(50), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda25.this));
            View audioAttributesCompatParcelizer = SimpleBasePlayerExternalSyntheticLambda25.this.getAudioAttributesCompatParcelizer();
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.startAnimation(animationSet);
            }
            return true;
        }

        public static final class RemoteActionCompatParcelizer implements Animation.AnimationListener {
            private /* synthetic */ SimpleBasePlayerExternalSyntheticLambda25 AudioAttributesCompatParcelizer;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda25 simpleBasePlayerExternalSyntheticLambda25) {
                this.AudioAttributesCompatParcelizer = simpleBasePlayerExternalSyntheticLambda25;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((Bundle) null);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            toMagicModuleMetaRepoModel.write(motionEvent, "");
            return true;
        }
    }

    private void AudioAttributesCompatParcelizer(GestureDetector gestureDetector) {
        toMagicModuleMetaRepoModel.write(gestureDetector, "");
        this.IconCompatParcelizer = gestureDetector;
    }

    protected final GestureDetector AudioAttributesImplApi21Parcelizer() {
        GestureDetector gestureDetector = this.IconCompatParcelizer;
        if (gestureDetector != null) {
            return gestureDetector;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    protected final View getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void RemoteActionCompatParcelizer(View view) {
        this.AudioAttributesCompatParcelizer = view;
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda14, androidx.fragment.app.Fragment
    public void onAttach(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onAttach(p0);
        AudioAttributesCompatParcelizer(new GestureDetector(p0, new read()));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View p0, MotionEvent p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return AudioAttributesImplApi21Parcelizer().onTouchEvent(p1) || p1.getAction() == 2;
    }

    public static void IconCompatParcelizer(Button p0, Button p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        p1.setVisibility(8);
        p0.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
        p1.setLayoutParams(new LinearLayout.LayoutParams(0, -1, BitmapDescriptorFactory.HUE_RED));
    }

    public final void write(Button p0, CTInAppNotificationButton p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 != null) {
            p0.setTag(Integer.valueOf(p2));
            p0.setVisibility(0);
            p0.setText(p1.getIconCompatParcelizer());
            p0.setTextColor(Color.parseColor(p1.getAudioAttributesCompatParcelizer()));
            p0.setBackgroundColor(Color.parseColor(p1.getRead()));
            p0.setOnClickListener(new SimpleBasePlayerExternalSyntheticLambda14.AudioAttributesCompatParcelizer());
            return;
        }
        p0.setVisibility(8);
    }
}
