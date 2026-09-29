package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppWebView;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0003R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\f¢\u0006\u0006\n\u0004\b\u0018\u0010#R$\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8\u0005@BX\u0084\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001d"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda18;", "Lo/SimpleBasePlayerExternalSyntheticLambda2;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "Landroid/widget/RelativeLayout$LayoutParams;", "read", "(I)Landroid/widget/RelativeLayout$LayoutParams;", "AudioAttributesCompatParcelizer", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "(Landroid/widget/RelativeLayout$LayoutParams;)V", "", "MediaMetadataCompat", "()Z", "MediaBrowserCompatSearchResultReceiver", "RatingCompat", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Z", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBasePlayerExternalSyntheticLambda18 extends SimpleBasePlayerExternalSyntheticLambda2 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    protected CTInAppWebView IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    protected final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatMediaItem();
        return AudioAttributesCompatParcelizer(p0, p1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        MediaBrowserCompatCustomActionResultReceiver();
        super.onDestroyView();
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda14, androidx.fragment.app.Fragment
    public void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RatingCompat();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onConfigurationChanged(p0);
        MediaBrowserCompatMediaItem();
        RatingCompat();
    }

    protected RelativeLayout.LayoutParams read(int p0) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, p0);
        layoutParams.addRule(1, p0);
        int i = -(write(40) / 2);
        layoutParams.setMargins(i, 0, 0, i);
        return layoutParams;
    }

    private final View AudioAttributesCompatParcelizer(LayoutInflater p0, ViewGroup p1) {
        try {
            View viewInflate = p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inapp_html_full, p1, false);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.inapp_html_full_relative_layout);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            AudioAttributesCompatParcelizer(layoutParams);
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            CTInAppWebView cTInAppWebView = new CTInAppWebView(contextRequireContext, AudioAttributesImplApi26Parcelizer().getOnStop(), AudioAttributesImplApi26Parcelizer().getOnPrepare(), AudioAttributesImplApi26Parcelizer().getSetSessionImpl(), AudioAttributesImplApi26Parcelizer().getOnRemoveQueueItem());
            cTInAppWebView.setFullscreen(this.AudioAttributesCompatParcelizer);
            this.IconCompatParcelizer = cTInAppWebView;
            cTInAppWebView.setWebViewClient(new lambdaupdateStateAndInformListeners60(this));
            if (AudioAttributesImplApi26Parcelizer().getOnSetCaptioningEnabled()) {
                cTInAppWebView.setJavaScriptInterface(new r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4(PlayerTimelineChangeReason.RemoteActionCompatParcelizer(getActivity(), write()), this));
            }
            if (MediaBrowserCompatSearchResultReceiver()) {
                relativeLayout.setBackground(new ColorDrawable(-1157627904));
            } else {
                relativeLayout.setBackground(new ColorDrawable(0));
            }
            relativeLayout.addView(cTInAppWebView, layoutParams);
            if (MediaMetadataCompat()) {
                Context context = p0.getContext();
                CloseImageView closeImageView = new CloseImageView(context);
                RelativeLayout.LayoutParams layoutParams2 = read(cTInAppWebView.getId());
                closeImageView.setOnClickListener(new View.OnClickListener() { // from class: o.SimpleBasePlayerExternalSyntheticLambda20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SimpleBasePlayerExternalSyntheticLambda18.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
                    }
                });
                closeImageView.setContentDescription(context.getString(RendererCapabilitiesAdaptiveSupport.RemoteActionCompatParcelizer.ct_inapp_close_btn));
                IconCompatParcelizer(closeImageView);
                relativeLayout.addView(closeImageView, layoutParams2);
            }
            return viewInflate;
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = write().MediaBrowserCompatItemReceiver();
            write().write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda18 simpleBasePlayerExternalSyntheticLambda18) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda18, "");
        simpleBasePlayerExternalSyntheticLambda18.RemoteActionCompatParcelizer((Bundle) null);
    }

    private final void AudioAttributesCompatParcelizer(RelativeLayout.LayoutParams p0) {
        char onSetRepeatMode = AudioAttributesImplApi26Parcelizer().getOnSetRepeatMode();
        if (onSetRepeatMode == 't') {
            p0.addRule(10);
        } else if (onSetRepeatMode == 'l') {
            p0.addRule(9);
        } else if (onSetRepeatMode == 'b') {
            p0.addRule(12);
        } else if (onSetRepeatMode == 'r') {
            p0.addRule(11);
        } else if (onSetRepeatMode == 'c') {
            p0.addRule(13);
        }
        p0.setMargins(0, 0, 0, 0);
    }

    private final boolean MediaMetadataCompat() {
        return AudioAttributesImplApi26Parcelizer().getOnSkipToPrevious();
    }

    private final boolean MediaBrowserCompatSearchResultReceiver() {
        return AudioAttributesImplApi26Parcelizer().getOnPlayFromUri();
    }

    private final void RatingCompat() {
        CTInAppWebView cTInAppWebView = this.IconCompatParcelizer;
        if (cTInAppWebView != null) {
            cTInAppWebView.setFullscreen(this.AudioAttributesCompatParcelizer);
            cTInAppWebView.read();
            String onPrepareFromMediaId = AudioAttributesImplApi26Parcelizer().getOnPrepareFromMediaId();
            String str = onPrepareFromMediaId;
            if (str == null || str.length() == 0) {
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
                return;
            }
            cTInAppWebView.setWebViewClient(new WebViewClient());
            cTInAppWebView.loadUrl(onPrepareFromMediaId);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        try {
            CTInAppWebView cTInAppWebView = this.IconCompatParcelizer;
            if (cTInAppWebView != null) {
                cTInAppWebView.write(AudioAttributesImplApi26Parcelizer().getOnSetCaptioningEnabled());
            }
            this.IconCompatParcelizer = null;
        } catch (Exception e) {
            write().MediaBrowserCompatItemReceiver();
            RendererWakeupListener.onAddQueueItem();
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        Window window;
        WindowManager.LayoutParams attributes;
        maybeGetTypeVariable activity = getActivity();
        this.AudioAttributesCompatParcelizer = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null || (attributes.flags & 1024) == 0) ? false : true;
    }
}
