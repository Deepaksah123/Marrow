package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppWebView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002*)B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0005J#\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b#\u0010\rJ\u000f\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010\u0005R\u0016\u0010\t\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010("}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda23;", "Lo/SimpleBasePlayerExternalSyntheticLambda19;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnLongClickListener;", "<init>", "()V", "Landroid/view/View;", "p0", "Landroid/view/ViewGroup;", "AudioAttributesCompatParcelizer", "(Landroid/view/View;)Landroid/view/ViewGroup;", "Landroid/view/LayoutInflater;", "p1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "p2", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "onLongClick", "(Landroid/view/View;)Z", "Landroid/view/MotionEvent;", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "MediaBrowserCompatItemReceiver", "write", "AudioAttributesImplApi21Parcelizer", "Landroid/view/GestureDetector;", "Landroid/view/GestureDetector;", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBasePlayerExternalSyntheticLambda23 extends SimpleBasePlayerExternalSyntheticLambda19 implements View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private CTInAppWebView RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private GestureDetector AudioAttributesCompatParcelizer;

    public abstract View AudioAttributesCompatParcelizer(LayoutInflater p0, ViewGroup p1);

    public abstract ViewGroup AudioAttributesCompatParcelizer(View p0);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View p0) {
        return true;
    }

    final class IconCompatParcelizer extends GestureDetector.SimpleOnGestureListener {
        public IconCompatParcelizer() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            toMagicModuleMetaRepoModel.write(motionEvent2, "");
            if (motionEvent != null) {
                if (motionEvent.getX() - motionEvent2.getX() > 120.0f && Math.abs(f) > 200.0d) {
                    return RemoteActionCompatParcelizer(false);
                }
                if (motionEvent2.getX() - motionEvent.getX() > 120.0f && Math.abs(f) > 200.0d) {
                    return RemoteActionCompatParcelizer(true);
                }
            }
            return false;
        }

        private boolean RemoteActionCompatParcelizer(boolean z) {
            TranslateAnimation translateAnimation;
            AnimationSet animationSet = new AnimationSet(true);
            if (z) {
                translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, SimpleBasePlayerExternalSyntheticLambda23.this.write(50), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } else {
                translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, -SimpleBasePlayerExternalSyntheticLambda23.this.write(50), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new AnimationAnimationListenerC0048IconCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda23.this));
            CTInAppWebView cTInAppWebView = SimpleBasePlayerExternalSyntheticLambda23.this.RemoteActionCompatParcelizer;
            if (cTInAppWebView != null) {
                cTInAppWebView.startAnimation(animationSet);
            }
            return true;
        }

        /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda23$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0048IconCompatParcelizer implements Animation.AnimationListener {
            private /* synthetic */ SimpleBasePlayerExternalSyntheticLambda23 write;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            AnimationAnimationListenerC0048IconCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda23 simpleBasePlayerExternalSyntheticLambda23) {
                this.write = simpleBasePlayerExternalSyntheticLambda23;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) throws UnsupportedEncodingException {
                SimpleBasePlayerExternalSyntheticLambda23 simpleBasePlayerExternalSyntheticLambda23 = this.write;
                CTInAppAction.Companion companion = CTInAppAction.INSTANCE;
                simpleBasePlayerExternalSyntheticLambda23.write(CTInAppAction.Companion.RemoteActionCompatParcelizer(), "swipe-dismiss", null);
            }
        }
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda14, androidx.fragment.app.Fragment
    public void onAttach(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onAttach(p0);
        this.AudioAttributesCompatParcelizer = new GestureDetector(p0, new IconCompatParcelizer());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return write(p0, p1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        MediaBrowserCompatItemReceiver();
        super.onDestroyView();
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda14, androidx.fragment.app.Fragment
    public void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onConfigurationChanged(p0);
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View p0, MotionEvent p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        GestureDetector gestureDetector = this.AudioAttributesCompatParcelizer;
        if (gestureDetector == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            gestureDetector = null;
        }
        return gestureDetector.onTouchEvent(p1) || p1.getAction() == 2;
    }

    private final void MediaBrowserCompatItemReceiver() {
        try {
            CTInAppWebView cTInAppWebView = this.RemoteActionCompatParcelizer;
            if (cTInAppWebView != null) {
                cTInAppWebView.write(AudioAttributesImplApi26Parcelizer().getOnSetCaptioningEnabled());
            }
            this.RemoteActionCompatParcelizer = null;
        } catch (Exception e) {
            write().MediaBrowserCompatItemReceiver();
            RendererWakeupListener.onAddQueueItem();
        }
    }

    private final View write(LayoutInflater p0, ViewGroup p1) {
        try {
            View viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, p1);
            ViewGroup viewGroupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(viewAudioAttributesCompatParcelizer);
            Context context = p0.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            CTInAppWebView cTInAppWebView = new CTInAppWebView(context, AudioAttributesImplApi26Parcelizer().getOnStop(), AudioAttributesImplApi26Parcelizer().getOnPrepare(), AudioAttributesImplApi26Parcelizer().getSetSessionImpl(), AudioAttributesImplApi26Parcelizer().getOnRemoveQueueItem(), AudioAttributesImplApi26Parcelizer().getOnRemoveQueueItemAt());
            this.RemoteActionCompatParcelizer = cTInAppWebView;
            cTInAppWebView.setWebViewClient(new lambdaupdateStateAndInformListeners60(this));
            cTInAppWebView.setOnTouchListener(this);
            cTInAppWebView.setOnLongClickListener(this);
            if (AudioAttributesImplApi26Parcelizer().getOnSetCaptioningEnabled()) {
                cTInAppWebView.setJavaScriptInterface(new r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4(PlayerTimelineChangeReason.RemoteActionCompatParcelizer(getActivity(), write()), this));
            }
            if (viewGroupAudioAttributesCompatParcelizer != null) {
                viewGroupAudioAttributesCompatParcelizer.addView(cTInAppWebView);
            }
            return viewAudioAttributesCompatParcelizer;
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = write().MediaBrowserCompatItemReceiver();
            write().write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
            return null;
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CTInAppWebView cTInAppWebView = this.RemoteActionCompatParcelizer;
        if (cTInAppWebView != null) {
            cTInAppWebView.read();
            int i = cTInAppWebView.AudioAttributesImplBaseParcelizer.y;
            int i2 = cTInAppWebView.AudioAttributesImplBaseParcelizer.x;
            float f = getResources().getDisplayMetrics().density;
            int i3 = (int) (i / f);
            int i4 = (int) (i2 / f);
            String onSeekTo = AudioAttributesImplApi26Parcelizer().getOnSeekTo();
            if (onSeekTo == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("<style>body{width: ");
            sb.append(i4);
            sb.append("px; height: ");
            sb.append(i3);
            sb.append("px; margin: 0; padding:0;}</style>");
            String strAudioAttributesCompatParcelizer = new newYearNameItem("<head>").AudioAttributesCompatParcelizer(onSeekTo, "<head>".concat(String.valueOf(sb.toString())));
            RendererWakeupListener.MediaMetadataCompat();
            cTInAppWebView.setInitialScale((int) (f * 100.0f));
            cTInAppWebView.loadDataWithBaseURL(null, strAudioAttributesCompatParcelizer, "text/html", "utf-8", null);
        }
    }
}
