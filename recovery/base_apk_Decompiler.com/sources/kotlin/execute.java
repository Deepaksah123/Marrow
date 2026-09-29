package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import kotlin.execute;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/execute;", "Lo/SimpleBasePlayerExternalSyntheticLambda17;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "", "read", "(Landroid/content/Context;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class execute extends SimpleBasePlayerExternalSyntheticLambda17 {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        View viewInflate;
        toMagicModuleMetaRepoModel.write(p0, "");
        ArrayList arrayList = new ArrayList();
        if ((AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && MediaBrowserCompatItemReceiver()) || (AudioAttributesImplApi26Parcelizer().getHandleMediaPlayPauseIfPendingOnHandler() && read(p0.getContext()))) {
            viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.tab_inapp_half_interstitial, p1, false);
            toMagicModuleMetaRepoModel.write(viewInflate);
        } else {
            viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inapp_half_interstitial, p1, false);
            toMagicModuleMetaRepoModel.write(viewInflate);
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.inapp_half_interstitial_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.half_interstitial_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnPlay()));
        int iIconCompatParcelizer = getIconCompatParcelizer();
        if (iIconCompatParcelizer == 1) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new AudioAttributesCompatParcelizer(relativeLayout, this, p0, closeImageView));
        } else if (iIconCompatParcelizer == 2) {
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new IconCompatParcelizer(relativeLayout, this, closeImageView));
        }
        CTInAppNotificationMedia cTInAppNotificationMediaRemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(getIconCompatParcelizer());
        if (cTInAppNotificationMediaRemoteActionCompatParcelizer != null) {
            ImageView imageView = (ImageView) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.backgroundImage);
            if (!TestGroupLSModel.IconCompatParcelizer((CharSequence) cTInAppNotificationMediaRemoteActionCompatParcelizer.getWrite())) {
                imageView.setContentDescription(cTInAppNotificationMediaRemoteActionCompatParcelizer.getWrite());
            }
            Bitmap bitmap = AudioAttributesImplBaseParcelizer().read(cTInAppNotificationMediaRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer());
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.half_interstitial_linear_layout);
        Button button = (Button) linearLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.half_interstitial_button1);
        toMagicModuleMetaRepoModel.write(button);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.half_interstitial_button2);
        toMagicModuleMetaRepoModel.write(button2);
        arrayList.add(button2);
        TextView textView = (TextView) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.half_interstitial_title);
        textView.setText(AudioAttributesImplApi26Parcelizer().getMediaMetadataCompat());
        textView.setTextColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnSkipToQueueItem()));
        TextView textView2 = (TextView) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.half_interstitial_message);
        textView2.setText(AudioAttributesImplApi26Parcelizer().getRatingCompat());
        textView2.setTextColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnSetRating()));
        List<CTInAppNotificationButton> listIconCompatParcelizer = AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
        if (listIconCompatParcelizer.size() == 1) {
            if (getIconCompatParcelizer() == 2) {
                button.setVisibility(8);
            } else if (getIconCompatParcelizer() == 1) {
                button.setVisibility(4);
            }
            AudioAttributesCompatParcelizer(button2, listIconCompatParcelizer.get(0), 0);
        } else if (!listIconCompatParcelizer.isEmpty()) {
            int size = listIconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                if (i < 2) {
                    AudioAttributesCompatParcelizer((Button) arrayList.get(i), listIconCompatParcelizer.get(i), i);
                }
            }
        }
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: o.SimpleBasePlayerExternalSyntheticLambda42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                execute.write(this.IconCompatParcelizer);
            }
        });
        if (!AudioAttributesImplApi26Parcelizer().getOnRewind()) {
            closeImageView.setVisibility(8);
            return viewInflate;
        }
        closeImageView.setVisibility(0);
        return viewInflate;
    }

    public static final class AudioAttributesCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ CloseImageView AudioAttributesCompatParcelizer;
        private /* synthetic */ LayoutInflater IconCompatParcelizer;
        private /* synthetic */ execute read;
        private /* synthetic */ RelativeLayout write;

        AudioAttributesCompatParcelizer(RelativeLayout relativeLayout, execute executeVar, LayoutInflater layoutInflater, CloseImageView closeImageView) {
            this.write = relativeLayout;
            this.read = executeVar;
            this.IconCompatParcelizer = layoutInflater;
            this.AudioAttributesCompatParcelizer = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup.LayoutParams layoutParams = this.write.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if ((this.read.AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && this.read.MediaBrowserCompatItemReceiver()) || (this.read.AudioAttributesImplApi26Parcelizer().getHandleMediaPlayPauseIfPendingOnHandler() && execute.read(this.IconCompatParcelizer.getContext()))) {
                RelativeLayout relativeLayout = this.write;
                toMagicModuleMetaRepoModel.write(relativeLayout);
                CloseImageView closeImageView = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(closeImageView);
                SimpleBasePlayerExternalSyntheticLambda2.RemoteActionCompatParcelizer(relativeLayout, layoutParams2, closeImageView);
            } else if (this.read.MediaBrowserCompatItemReceiver()) {
                execute executeVar = this.read;
                RelativeLayout relativeLayout2 = this.write;
                toMagicModuleMetaRepoModel.write(relativeLayout2);
                CloseImageView closeImageView2 = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(closeImageView2);
                executeVar.AudioAttributesCompatParcelizer(relativeLayout2, layoutParams2, closeImageView2);
            } else {
                RelativeLayout relativeLayout3 = this.write;
                toMagicModuleMetaRepoModel.write(relativeLayout3);
                CloseImageView closeImageView3 = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(closeImageView3);
                SimpleBasePlayerExternalSyntheticLambda2.RemoteActionCompatParcelizer(relativeLayout3, layoutParams2, closeImageView3);
            }
            this.write.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public static final class IconCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ RelativeLayout IconCompatParcelizer;
        private /* synthetic */ execute read;
        private /* synthetic */ CloseImageView write;

        IconCompatParcelizer(RelativeLayout relativeLayout, execute executeVar, CloseImageView closeImageView) {
            this.IconCompatParcelizer = relativeLayout;
            this.read = executeVar;
            this.write = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (!this.read.AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() || !this.read.MediaBrowserCompatItemReceiver()) {
                if (this.read.MediaBrowserCompatItemReceiver()) {
                    layoutParams2.setMargins(this.read.write(140), this.read.write(100), this.read.write(140), this.read.write(100));
                    ((ViewGroup.LayoutParams) layoutParams2).height = this.IconCompatParcelizer.getMeasuredHeight() - this.read.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    ((ViewGroup.LayoutParams) layoutParams2).width = (int) (((ViewGroup.LayoutParams) layoutParams2).height * 1.3f);
                    layoutParams2.gravity = 17;
                    this.IconCompatParcelizer.setLayoutParams(layoutParams2);
                    final RelativeLayout relativeLayout = this.IconCompatParcelizer;
                    final CloseImageView closeImageView = this.write;
                    relativeLayout.post(new Runnable() { // from class: o.SimpleBasePlayerExternalSyntheticLambda40
                        @Override // java.lang.Runnable
                        public final void run() {
                            execute.IconCompatParcelizer.write(closeImageView, relativeLayout);
                        }
                    });
                } else {
                    ((ViewGroup.LayoutParams) layoutParams2).width = (int) (this.IconCompatParcelizer.getMeasuredHeight() * 1.3f);
                    layoutParams2.gravity = 1;
                    this.IconCompatParcelizer.setLayoutParams(layoutParams2);
                    final RelativeLayout relativeLayout2 = this.IconCompatParcelizer;
                    final CloseImageView closeImageView2 = this.write;
                    relativeLayout2.post(new Runnable() { // from class: o.SimpleBasePlayerExternalSyntheticLambda41
                        @Override // java.lang.Runnable
                        public final void run() {
                            execute.IconCompatParcelizer.RemoteActionCompatParcelizer(closeImageView2, relativeLayout2);
                        }
                    });
                }
            } else {
                ((ViewGroup.LayoutParams) layoutParams2).width = (int) (this.IconCompatParcelizer.getMeasuredHeight() * 1.3f);
                layoutParams2.gravity = 17;
                this.IconCompatParcelizer.setLayoutParams(layoutParams2);
                final RelativeLayout relativeLayout3 = this.IconCompatParcelizer;
                final CloseImageView closeImageView3 = this.write;
                relativeLayout3.post(new Runnable() { // from class: o.SimpleBasePlayerExternalSyntheticLambda44
                    @Override // java.lang.Runnable
                    public final void run() {
                        execute.IconCompatParcelizer.MediaBrowserCompatItemReceiver(closeImageView3, relativeLayout3);
                    }
                });
            }
            this.IconCompatParcelizer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void MediaBrowserCompatItemReceiver(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(execute executeVar) {
        toMagicModuleMetaRepoModel.write(executeVar, "");
        executeVar.RemoteActionCompatParcelizer((Bundle) null);
        maybeGetTypeVariable activity = executeVar.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static boolean read(Context p0) {
        return getChildTimelines.AudioAttributesCompatParcelizer(p0) == 2;
    }
}
