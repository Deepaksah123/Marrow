package kotlin;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.marrow2.ui.common.composeUtilis.marrow_webview.CustomWebViewWrapper;
import kotlin.VideoSizeExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoSizeExternalSyntheticLambda0 {
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final java.lang.String r17, kotlin._handleOddName r18, kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r19, kotlin._handleUnrecognizedCharacterEscape r20, final int r21, final int r22) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoSizeExternalSyntheticLambda0.RemoteActionCompatParcelizer(java.lang.String, o._handleOddName, o.getCreatedOnDateMs, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(InputAccessor<assignParameter> inputAccessor, float f) {
        inputAccessor.write(assignParameter.read(f));
    }

    private static final float write(InputAccessor<assignParameter> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float write(nextTokenToRead nexttokentoread) {
        return nexttokentoread.AudioAttributesCompatParcelizer();
    }

    public static final class AudioAttributesCompatParcelizer extends DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 {
        public static int read;
        public static int write;
        private /* synthetic */ InputAccessor<assignParameter> AudioAttributesCompatParcelizer;
        private /* synthetic */ nextTokenToRead IconCompatParcelizer;
        private /* synthetic */ bufferMapProperty RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(nextTokenToRead nexttokentoread, bufferMapProperty buffermapproperty, InputAccessor<assignParameter> inputAccessor) {
            this.IconCompatParcelizer = nexttokentoread;
            this.RemoteActionCompatParcelizer = buffermapproperty;
            this.AudioAttributesCompatParcelizer = inputAccessor;
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(final WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            if (VideoSizeExternalSyntheticLambda0.write(this.IconCompatParcelizer) == f2) {
                return;
            }
            VideoSizeExternalSyntheticLambda0.write(this.IconCompatParcelizer, f2);
            if (webView != null) {
                final bufferMapProperty buffermapproperty = this.RemoteActionCompatParcelizer;
                final nextTokenToRead nexttokentoread = this.IconCompatParcelizer;
                final InputAccessor<assignParameter> inputAccessor = this.AudioAttributesCompatParcelizer;
                webView.postDelayed(new Runnable() { // from class: o.FrameRotationQueue
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.read(webView, buffermapproperty, nexttokentoread, inputAccessor);
                    }
                }, 200L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(WebView webView, final bufferMapProperty buffermapproperty, final nextTokenToRead nexttokentoread, final InputAccessor inputAccessor) {
            webView.evaluateJavascript("(function() { return document.documentElement.offsetHeight; })();", new ValueCallback() { // from class: o.resetListener
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(buffermapproperty, nexttokentoread, inputAccessor, (String) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(bufferMapProperty buffermapproperty, nextTokenToRead nexttokentoread, InputAccessor inputAccessor, String str) {
            Integer numAudioAttributesImplApi26Parcelizer;
            if (str == null || (numAudioAttributesImplApi26Parcelizer = TestGroupLSModel.AudioAttributesImplApi26Parcelizer(str)) == null) {
                return;
            }
            VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer((InputAccessor<assignParameter>) inputAccessor, buffermapproperty.write(numAudioAttributesImplApi26Parcelizer.intValue() * VideoSizeExternalSyntheticLambda0.write(nexttokentoread)));
        }

        public static int write() {
            int i = write;
            int i2 = i % 8079981;
            write = i + 1;
            if (i2 != 0) {
                return read;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            read = iUptimeMillis;
            return iUptimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView IconCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return new CustomWebViewWrapper(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final getCreatedOnDateMs getcreatedondatems, WebView webView) {
        toMagicModuleMetaRepoModel.write(webView, "");
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.VideoSize
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return true;
            }
        });
        webView.setHapticFeedbackEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setFocusable(false);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.getSettings().setCacheMode(2);
        CmcdHeadersFactoryCmcdRequest.AudioAttributesCompatParcelizer(webView, new getCreatedOnDateMs() { // from class: o.VideoRendererEventListenerEventDispatcherExternalSyntheticLambda9
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return VideoSizeExternalSyntheticLambda0.read(getcreatedondatems);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems) {
        if (getcreatedondatems != null) {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    private static final String write(String str) {
        return new newYearNameItem("</strong>").RemoteActionCompatParcelizer(new newYearNameItem("<strong>").RemoteActionCompatParcelizer(str, "<b>"), "</b>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(nextTokenToRead nexttokentoread, float f) {
        nexttokentoread.write(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str, _handleOddName _handleoddname, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(str, _handleoddname, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, _handleOddName _handleoddname, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(str, _handleoddname, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
