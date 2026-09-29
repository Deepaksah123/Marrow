package kotlin;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import kotlin.SimpleBasePlayerExternalSyntheticLambda14;
import kotlin.SimpleBasePlayerExternalSyntheticLambda43;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda43;", "Lo/SimpleBasePlayerExternalSyntheticLambda2;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda43 extends SimpleBasePlayerExternalSyntheticLambda2 {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        View viewInflate;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && MediaBrowserCompatItemReceiver()) {
            viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.tab_inapp_half_interstitial_image, p1, false);
        } else {
            viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inapp_half_interstitial_image, p1, false);
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.inapp_half_interstitial_image_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.half_interstitial_image_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnPlay()));
        ImageView imageView = (ImageView) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.half_interstitial_image);
        int iIconCompatParcelizer = getIconCompatParcelizer();
        if (iIconCompatParcelizer == 1) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new write(relativeLayout, this, closeImageView));
        } else if (iIconCompatParcelizer == 2) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new AudioAttributesCompatParcelizer(relativeLayout, this, closeImageView));
        }
        CTInAppNotificationMedia cTInAppNotificationMediaRemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(getIconCompatParcelizer());
        if (cTInAppNotificationMediaRemoteActionCompatParcelizer != null) {
            if (!TestGroupLSModel.IconCompatParcelizer((CharSequence) cTInAppNotificationMediaRemoteActionCompatParcelizer.getWrite())) {
                imageView.setContentDescription(cTInAppNotificationMediaRemoteActionCompatParcelizer.getWrite());
            }
            Bitmap bitmap = AudioAttributesImplBaseParcelizer().read(cTInAppNotificationMediaRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer());
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setTag(0);
                imageView.setOnClickListener(new SimpleBasePlayerExternalSyntheticLambda14.AudioAttributesCompatParcelizer());
            }
        }
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: o.SimpleBasePlayerExternalSyntheticLambda45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleBasePlayerExternalSyntheticLambda43.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        if (!AudioAttributesImplApi26Parcelizer().getOnRewind()) {
            closeImageView.setVisibility(8);
            return viewInflate;
        }
        closeImageView.setVisibility(0);
        return viewInflate;
    }

    public static final class write implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ CloseImageView AudioAttributesCompatParcelizer;
        private /* synthetic */ SimpleBasePlayerExternalSyntheticLambda43 read;
        private /* synthetic */ RelativeLayout write;

        write(RelativeLayout relativeLayout, SimpleBasePlayerExternalSyntheticLambda43 simpleBasePlayerExternalSyntheticLambda43, CloseImageView closeImageView) {
            this.write = relativeLayout;
            this.read = simpleBasePlayerExternalSyntheticLambda43;
            this.AudioAttributesCompatParcelizer = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup.LayoutParams layoutParams = this.write.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if ((!this.read.AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() || !this.read.MediaBrowserCompatItemReceiver()) && this.read.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda43 simpleBasePlayerExternalSyntheticLambda43 = this.read;
                RelativeLayout relativeLayout = this.write;
                toMagicModuleMetaRepoModel.write(relativeLayout);
                CloseImageView closeImageView = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(closeImageView);
                simpleBasePlayerExternalSyntheticLambda43.AudioAttributesCompatParcelizer(relativeLayout, layoutParams2, closeImageView);
            } else {
                RelativeLayout relativeLayout2 = this.write;
                toMagicModuleMetaRepoModel.write(relativeLayout2);
                CloseImageView closeImageView2 = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(closeImageView2);
                SimpleBasePlayerExternalSyntheticLambda2.RemoteActionCompatParcelizer(relativeLayout2, layoutParams2, closeImageView2);
            }
            this.write.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public static final class AudioAttributesCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ RelativeLayout AudioAttributesCompatParcelizer;
        private /* synthetic */ SimpleBasePlayerExternalSyntheticLambda43 RemoteActionCompatParcelizer;
        private /* synthetic */ CloseImageView write;

        AudioAttributesCompatParcelizer(RelativeLayout relativeLayout, SimpleBasePlayerExternalSyntheticLambda43 simpleBasePlayerExternalSyntheticLambda43, CloseImageView closeImageView) {
            this.AudioAttributesCompatParcelizer = relativeLayout;
            this.RemoteActionCompatParcelizer = simpleBasePlayerExternalSyntheticLambda43;
            this.write = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup.LayoutParams layoutParams = this.AudioAttributesCompatParcelizer.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (!this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() || !this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                    layoutParams2.setMargins(this.RemoteActionCompatParcelizer.write(140), this.RemoteActionCompatParcelizer.write(100), this.RemoteActionCompatParcelizer.write(140), this.RemoteActionCompatParcelizer.write(100));
                    ((ViewGroup.LayoutParams) layoutParams2).height = this.AudioAttributesCompatParcelizer.getMeasuredHeight() - this.RemoteActionCompatParcelizer.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    ((ViewGroup.LayoutParams) layoutParams2).width = (int) (((ViewGroup.LayoutParams) layoutParams2).height * 1.3f);
                    layoutParams2.gravity = 17;
                    this.AudioAttributesCompatParcelizer.setLayoutParams(layoutParams2);
                    final RelativeLayout relativeLayout = this.AudioAttributesCompatParcelizer;
                    final CloseImageView closeImageView = this.write;
                    relativeLayout.post(new Runnable() { // from class: o.SimpleBasePlayerExternalSyntheticLambda47
                        @Override // java.lang.Runnable
                        public final void run() {
                            SimpleBasePlayerExternalSyntheticLambda43.AudioAttributesCompatParcelizer.write(closeImageView, relativeLayout);
                        }
                    });
                } else {
                    ((ViewGroup.LayoutParams) layoutParams2).width = (int) (this.AudioAttributesCompatParcelizer.getMeasuredHeight() * 1.3f);
                    layoutParams2.gravity = 1;
                    this.AudioAttributesCompatParcelizer.setLayoutParams(layoutParams2);
                    final RelativeLayout relativeLayout2 = this.AudioAttributesCompatParcelizer;
                    final CloseImageView closeImageView2 = this.write;
                    relativeLayout2.post(new Runnable() { // from class: o.SimpleBasePlayerExternalSyntheticLambda46
                        @Override // java.lang.Runnable
                        public final void run() {
                            SimpleBasePlayerExternalSyntheticLambda43.AudioAttributesCompatParcelizer.IconCompatParcelizer(closeImageView2, relativeLayout2);
                        }
                    });
                }
            } else {
                ((ViewGroup.LayoutParams) layoutParams2).width = (int) (this.AudioAttributesCompatParcelizer.getMeasuredHeight() * 1.3f);
                layoutParams2.gravity = 17;
                this.AudioAttributesCompatParcelizer.setLayoutParams(layoutParams2);
                final RelativeLayout relativeLayout3 = this.AudioAttributesCompatParcelizer;
                final CloseImageView closeImageView3 = this.write;
                relativeLayout3.post(new Runnable() { // from class: o.SimpleBasePlayerExternalSyntheticLambda48
                    @Override // java.lang.Runnable
                    public final void run() {
                        SimpleBasePlayerExternalSyntheticLambda43.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(closeImageView3, relativeLayout3);
                    }
                });
            }
            this.AudioAttributesCompatParcelizer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void MediaBrowserCompatCustomActionResultReceiver(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda43 simpleBasePlayerExternalSyntheticLambda43) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda43, "");
        simpleBasePlayerExternalSyntheticLambda43.RemoteActionCompatParcelizer(null);
        maybeGetTypeVariable activity = simpleBasePlayerExternalSyntheticLambda43.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
