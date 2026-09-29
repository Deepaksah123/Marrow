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
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import kotlin.SimpleBasePlayerExternalSyntheticLambda14;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda55;", "Lo/SimpleBasePlayerExternalSyntheticLambda2;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda55 extends SimpleBasePlayerExternalSyntheticLambda2 {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        View viewInflate;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && MediaBrowserCompatItemReceiver()) {
            viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.tab_inapp_interstitial_image, p1, false);
        } else {
            viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inapp_interstitial_image, p1, false);
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.inapp_interstitial_image_frame_layout);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_image_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnPlay()));
        ImageView imageView = (ImageView) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_image);
        int iIconCompatParcelizer = getIconCompatParcelizer();
        if (iIconCompatParcelizer == 1) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new RemoteActionCompatParcelizer(relativeLayout, this, frameLayout, closeImageView));
        } else if (iIconCompatParcelizer == 2) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new AudioAttributesCompatParcelizer(relativeLayout, this, frameLayout, closeImageView));
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
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: o.SimpleBasePlayerExternalSyntheticLambda54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleBasePlayerExternalSyntheticLambda55.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        if (!AudioAttributesImplApi26Parcelizer().getOnRewind()) {
            closeImageView.setVisibility(8);
            return viewInflate;
        }
        closeImageView.setVisibility(0);
        return viewInflate;
    }

    public static final class RemoteActionCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ RelativeLayout AudioAttributesCompatParcelizer;
        private /* synthetic */ CloseImageView IconCompatParcelizer;
        private /* synthetic */ SimpleBasePlayerExternalSyntheticLambda55 RemoteActionCompatParcelizer;
        private /* synthetic */ FrameLayout write;

        RemoteActionCompatParcelizer(RelativeLayout relativeLayout, SimpleBasePlayerExternalSyntheticLambda55 simpleBasePlayerExternalSyntheticLambda55, FrameLayout frameLayout, CloseImageView closeImageView) {
            this.AudioAttributesCompatParcelizer = relativeLayout;
            this.RemoteActionCompatParcelizer = simpleBasePlayerExternalSyntheticLambda55;
            this.write = frameLayout;
            this.IconCompatParcelizer = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup.LayoutParams layoutParams = this.AudioAttributesCompatParcelizer.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda55 simpleBasePlayerExternalSyntheticLambda55 = this.RemoteActionCompatParcelizer;
                RelativeLayout relativeLayout = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(relativeLayout);
                FrameLayout frameLayout = this.write;
                toMagicModuleMetaRepoModel.write(frameLayout);
                CloseImageView closeImageView = this.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(closeImageView);
                simpleBasePlayerExternalSyntheticLambda55.write(relativeLayout, layoutParams2, frameLayout, closeImageView);
            } else if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda55 simpleBasePlayerExternalSyntheticLambda552 = this.RemoteActionCompatParcelizer;
                RelativeLayout relativeLayout2 = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(relativeLayout2);
                FrameLayout frameLayout2 = this.write;
                toMagicModuleMetaRepoModel.write(frameLayout2);
                CloseImageView closeImageView2 = this.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(closeImageView2);
                simpleBasePlayerExternalSyntheticLambda552.read(relativeLayout2, layoutParams2, frameLayout2, closeImageView2);
            } else {
                RelativeLayout relativeLayout3 = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(relativeLayout3);
                CloseImageView closeImageView3 = this.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(closeImageView3);
                SimpleBasePlayerExternalSyntheticLambda2.read(relativeLayout3, layoutParams2, closeImageView3);
            }
            this.AudioAttributesCompatParcelizer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public static final class AudioAttributesCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ SimpleBasePlayerExternalSyntheticLambda55 AudioAttributesCompatParcelizer;
        private /* synthetic */ FrameLayout IconCompatParcelizer;
        private /* synthetic */ RelativeLayout RemoteActionCompatParcelizer;
        private /* synthetic */ CloseImageView read;

        AudioAttributesCompatParcelizer(RelativeLayout relativeLayout, SimpleBasePlayerExternalSyntheticLambda55 simpleBasePlayerExternalSyntheticLambda55, FrameLayout frameLayout, CloseImageView closeImageView) {
            this.RemoteActionCompatParcelizer = relativeLayout;
            this.AudioAttributesCompatParcelizer = simpleBasePlayerExternalSyntheticLambda55;
            this.IconCompatParcelizer = frameLayout;
            this.read = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup.LayoutParams layoutParams = this.RemoteActionCompatParcelizer.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda55 simpleBasePlayerExternalSyntheticLambda55 = this.AudioAttributesCompatParcelizer;
                RelativeLayout relativeLayout = this.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.write(relativeLayout);
                FrameLayout frameLayout = this.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(frameLayout);
                CloseImageView closeImageView = this.read;
                toMagicModuleMetaRepoModel.write(closeImageView);
                simpleBasePlayerExternalSyntheticLambda55.RemoteActionCompatParcelizer(relativeLayout, layoutParams2, frameLayout, closeImageView);
            } else if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda55 simpleBasePlayerExternalSyntheticLambda552 = this.AudioAttributesCompatParcelizer;
                RelativeLayout relativeLayout2 = this.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.write(relativeLayout2);
                FrameLayout frameLayout2 = this.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(frameLayout2);
                CloseImageView closeImageView2 = this.read;
                toMagicModuleMetaRepoModel.write(closeImageView2);
                simpleBasePlayerExternalSyntheticLambda552.IconCompatParcelizer(relativeLayout2, layoutParams2, frameLayout2, closeImageView2);
            } else {
                RelativeLayout relativeLayout3 = this.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.write(relativeLayout3);
                CloseImageView closeImageView3 = this.read;
                toMagicModuleMetaRepoModel.write(closeImageView3);
                SimpleBasePlayerExternalSyntheticLambda2.write(relativeLayout3, layoutParams2, closeImageView3);
            }
            this.RemoteActionCompatParcelizer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda55 simpleBasePlayerExternalSyntheticLambda55) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda55, "");
        simpleBasePlayerExternalSyntheticLambda55.RemoteActionCompatParcelizer((Bundle) null);
        maybeGetTypeVariable activity = simpleBasePlayerExternalSyntheticLambda55.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
