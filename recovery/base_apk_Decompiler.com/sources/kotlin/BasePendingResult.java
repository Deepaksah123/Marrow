package kotlin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.snackbar.Snackbar;
import com.marrow.R;
import in.juspay.hypersdk.ota.Constants;
import kotlin.Metadata;
import kotlin._init_lambda4;
import kotlin.zaI;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J'\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010\u0010\u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010#R\u0018\u0010\u001d\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0016\u0010&\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006*\u00020\u00180\u00180(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)"}, d2 = {"Lo/BasePendingResult;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "onResume", "onDestroyView", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "", "AudioAttributesImplApi21Parcelizer", "()Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "", "read", "(ZZZ)V", "Lo/zaI;", "Lo/zaI;", "Lo/FullSegmentEncryptionKeyCache;", "Lo/FullSegmentEncryptionKeyCache;", "()Lo/FullSegmentEncryptionKeyCache;", "Lcom/google/android/material/snackbar/Snackbar;", "Lcom/google/android/material/snackbar/Snackbar;", "IconCompatParcelizer", "Z", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BasePendingResult extends reportSignOut {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Snackbar read;
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private zaI AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private FullSegmentEncryptionKeyCache RemoteActionCompatParcelizer;

    public BasePendingResult() {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.write(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.setCancelToken
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                BasePendingResult.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((Boolean) obj).booleanValue());
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.AudioAttributesImplApi21Parcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FullSegmentEncryptionKeyCache read() {
        FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache = this.RemoteActionCompatParcelizer;
        if (fullSegmentEncryptionKeyCache != null) {
            return fullSegmentEncryptionKeyCache;
        }
        throw new IllegalStateException("Null binding. Is the view visible?".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(BasePendingResult basePendingResult, boolean z) {
        if (z) {
            basePendingResult.RemoteActionCompatParcelizer();
        } else {
            basePendingResult.AudioAttributesCompatParcelizer();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = FullSegmentEncryptionKeyCache.IconCompatParcelizer(p0, p1);
        Bundle arguments = getArguments();
        if (arguments != null) {
            zaI.Companion companion = zaI.INSTANCE;
            this.AudioAttributesCompatParcelizer = zaI.Companion.RemoteActionCompatParcelizer(arguments);
        }
        return read().IconCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        requireActivity().getIconCompatParcelizer().read(new IconCompatParcelizer());
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public static final class IconCompatParcelizer extends onRemoveQueueItemAt {
        IconCompatParcelizer() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            if (BasePendingResult.this.read().RemoteActionCompatParcelizer.canGoBack()) {
                BasePendingResult.this.read().RemoteActionCompatParcelizer.goBack();
            } else {
                setEnabled(false);
                BasePendingResult.this.requireActivity().finish();
            }
        }
    }

    private final void write() {
        ConstraintLayout constraintLayout = read().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, true, true, true, 0, 48);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.IconCompatParcelizer) {
            this.IconCompatParcelizer = false;
            if (_isNaN.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0) {
                RemoteActionCompatParcelizer();
            } else {
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }
        this.IconCompatParcelizer = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Snackbar snackbar = this.read;
        if (snackbar != null) {
            snackbar.RemoteActionCompatParcelizer();
        }
        this.read = null;
        this.RemoteActionCompatParcelizer = null;
    }

    private final void RemoteActionCompatParcelizer() {
        if (!getTrackName.write(requireContext())) {
            read(false, false, true);
            return;
        }
        WebView webView = read().RemoteActionCompatParcelizer;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setSafeBrowsingEnabled(true);
        WebView.setWebContentsDebuggingEnabled(false);
        webView.loadUrl("https://www.marrow.com/dkyc/d15c5a61003b3e1a2e163992e8375485");
        webView.addJavascriptInterface(new write(), "Android");
        webView.setWebViewClient(new read(webView));
        webView.setWebChromeClient(new AudioAttributesCompatParcelizer());
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/BasePendingResult$write;", "", "", "p0", "", "handleResult", "(Ljava/lang/String;)V", "showToast"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        write() {
        }

        @JavascriptInterface
        public final void handleResult(String p0) {
            maybeGetTypeVariable maybegettypevariableRequireActivity = BasePendingResult.this.requireActivity();
            Intent intent = new Intent();
            intent.putExtra("DkycWebFragmentResultKey", p0);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            maybegettypevariableRequireActivity.setResult(-1, intent);
            BasePendingResult.this.requireActivity().finish();
        }

        @JavascriptInterface
        public final void showToast(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Toast.makeText(BasePendingResult.this.requireContext(), p0, 0).show();
        }
    }

    public static final class read extends WebViewClient {
        private /* synthetic */ WebView AudioAttributesCompatParcelizer;

        read(WebView webView) {
            this.AudioAttributesCompatParcelizer = webView;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (BasePendingResult.this.isVisible()) {
                BasePendingResult.this.read(true, false, false);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            if (BasePendingResult.this.isVisible()) {
                BasePendingResult.this.read(false, true, false);
                this.AudioAttributesCompatParcelizer.evaluateJavascript(BasePendingResult.this.AudioAttributesImplApi21Parcelizer(), null);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (BasePendingResult.this.isVisible()) {
                BasePendingResult.this.read(false, false, true);
            }
        }
    }

    public static final class AudioAttributesCompatParcelizer extends WebChromeClient {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            toMagicModuleMetaRepoModel.write(permissionRequest, "");
            permissionRequest.grant(permissionRequest.getResources());
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            toMagicModuleMetaRepoModel.write(message, "");
            WebView webView2 = new WebView(BasePendingResult.this.requireContext());
            BasePendingResult basePendingResult = BasePendingResult.this;
            webView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            webView2.setFocusable(true);
            webView2.setFocusableInTouchMode(true);
            WebSettings settings = webView2.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            webView2.setWebViewClient(new WebViewClient());
            webView2.setWebChromeClient(new read(basePendingResult));
            BasePendingResult.this.read().RemoteActionCompatParcelizer.addView(webView2);
            Object obj = message.obj;
            toMagicModuleMetaRepoModel.read(obj, "");
            ((WebView.WebViewTransport) obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public static final class read extends WebChromeClient {
            private /* synthetic */ BasePendingResult RemoteActionCompatParcelizer;

            read(BasePendingResult basePendingResult) {
                this.RemoteActionCompatParcelizer = basePendingResult;
            }

            @Override // android.webkit.WebChromeClient
            public final void onCloseWindow(WebView webView) {
                toMagicModuleMetaRepoModel.write(webView, "");
                webView.setVisibility(8);
                this.RemoteActionCompatParcelizer.read().RemoteActionCompatParcelizer.removeView(webView);
            }
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        this.AudioAttributesImplApi21Parcelizer.read("android.permission.CAMERA");
    }

    private final void AudioAttributesCompatParcelizer() {
        if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            MediaBrowserCompatItemReceiver();
        } else {
            AudioAttributesImplApi26Parcelizer();
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        Snackbar snackbarRemoteActionCompatParcelizer = Snackbar.IconCompatParcelizer(requireView(), getString(R.string.camera_permission_required_for_kyc), -2).RemoteActionCompatParcelizer(getString(R.string.grant_permission), new View.OnClickListener() { // from class: o.BasePendingResultCallbackHandler
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePendingResult.AudioAttributesImplApi26Parcelizer(this.read);
            }
        });
        this.read = snackbarRemoteActionCompatParcelizer;
        snackbarRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(BasePendingResult basePendingResult) {
        basePendingResult.MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        Snackbar snackbarRemoteActionCompatParcelizer = Snackbar.AudioAttributesCompatParcelizer(read().IconCompatParcelizer(), R.string.adjust_camera_permission_in_settings).RemoteActionCompatParcelizer(getString(R.string.open_settings), new View.OnClickListener() { // from class: o.zan
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePendingResult.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        this.read = snackbarRemoteActionCompatParcelizer;
        snackbarRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(BasePendingResult basePendingResult) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(Constants.PACKAGE_DIR_NAME, basePendingResult.requireActivity().getPackageName(), null));
        intent.setFlags(268435456);
        basePendingResult.IconCompatParcelizer = true;
        basePendingResult.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AudioAttributesImplApi21Parcelizer() {
        zaI zai = this.AudioAttributesCompatParcelizer;
        zaI zai2 = null;
        if (zai == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            zai = null;
        }
        String write2 = zai.getWrite();
        zaI zai3 = this.AudioAttributesCompatParcelizer;
        if (zai3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            zai3 = null;
        }
        String audioAttributesCompatParcelizer = zai3.getAudioAttributesCompatParcelizer();
        zaI zai4 = this.AudioAttributesCompatParcelizer;
        if (zai4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            zai2 = zai4;
        }
        String iconCompatParcelizer = zai2.getIconCompatParcelizer();
        StringBuilder sb = new StringBuilder("javascript:receiveData('");
        sb.append(write2);
        sb.append("', '");
        sb.append(audioAttributesCompatParcelizer);
        sb.append("', '");
        sb.append(iconCompatParcelizer);
        sb.append("');");
        return sb.toString();
    }

    private final void AudioAttributesImplBaseParcelizer() {
        read().read.setOnClickListener(new View.OnClickListener() { // from class: o.ConnectionCallbacks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePendingResult.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(BasePendingResult basePendingResult) {
        basePendingResult.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(boolean p0, boolean p1, boolean p2) {
        FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache = read();
        ProgressBar progressBar = fullSegmentEncryptionKeyCache.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        progressBar.setVisibility(p0 ? 0 : 8);
        WebView webView = fullSegmentEncryptionKeyCache.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(webView, "");
        webView.setVisibility(p1 ? 0 : 8);
        LinearLayout linearLayout = fullSegmentEncryptionKeyCache.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        linearLayout.setVisibility(p2 ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.BasePendingResult$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/BasePendingResult$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/zaI;", "p0", "Lo/BasePendingResult;", "AudioAttributesCompatParcelizer", "(Lo/zaI;)Lo/BasePendingResult;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static BasePendingResult AudioAttributesCompatParcelizer(zaI p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            BasePendingResult basePendingResult = new BasePendingResult();
            basePendingResult.setArguments(p0.RemoteActionCompatParcelizer());
            return basePendingResult;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
