package in.juspay.hypernfc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.CallbackInvoker;
import java.util.Arrays;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MediaSourceListExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getSubmissionTimestamp;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lin/juspay/hypernfc/NfcBridge;", "Lin/juspay/hyper/bridge/HyperBridge;", "Lin/juspay/hyper/core/BridgeComponents;", "p0", "<init>", "(Lin/juspay/hyper/core/BridgeComponents;)V", "", "p1", "Landroid/content/Intent;", "p2", "", "onActivityResult", "(IILandroid/content/Intent;)Z", "", "", "openNFCReader", "(Ljava/lang/String;I)V", "showLoadingScreen", "callback", "Ljava/lang/String;", "Lo/MediaSourceListExternalSyntheticLambda0;", "cardTask", "Lo/MediaSourceListExternalSyntheticLambda0;", "isNFCEnabled", "()Z", "isNFCSupportPresent", "waitingTime", "I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NfcBridge extends HyperBridge {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NFC_CARD_REQUEST = 121;
    private static final int SETTINGS_REQUEST = 144;
    private String callback;
    private final MediaSourceListExternalSyntheticLambda0 cardTask;
    private int waitingTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcBridge(BridgeComponents bridgeComponents) {
        super(bridgeComponents);
        toMagicModuleMetaRepoModel.write(bridgeComponents, "");
        this.cardTask = new MediaSourceListExternalSyntheticLambda0();
    }

    @JavascriptInterface
    public final boolean isNFCSupportPresent() {
        return this.cardTask.AudioAttributesCompatParcelizer(getBridgeComponents().getContext());
    }

    private final void showLoadingScreen(String p0, int p1) {
        this.callback = p0;
        this.waitingTime = p1;
        Intent intent = new Intent(getBridgeComponents().getContext(), (Class<?>) NfcActivity.class);
        intent.putExtra("waitingTime", p1);
        getBridgeComponents().getFragmentHooks().startActivityForResult(intent, 121, null);
    }

    @JavascriptInterface
    public final boolean isNFCEnabled() {
        return this.cardTask.write(getBridgeComponents().getContext());
    }

    @JavascriptInterface
    public final void openNFCReader(String p0, int p1) {
        this.callback = p0;
        this.waitingTime = p1;
        try {
            if (isNFCSupportPresent() && isNFCEnabled()) {
                showLoadingScreen(p0, this.waitingTime);
                return;
            }
            if (isNFCSupportPresent()) {
                getBridgeComponents().getFragmentHooks().startActivityForResult(new Intent("android.settings.NFC_SETTINGS"), SETTINGS_REQUEST, null);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", "Does not support");
            jSONObject.put("data", (Object) null);
            getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, jSONObject.toString());
        } catch (Exception e) {
            CallbackInvoker callbackInvoker = getBridgeComponents().getCallbackInvoker();
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            byte[] bytes = e.toString().getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            String str = String.format("{\"error\":\"true\",\"data\":\"%s\"}", Arrays.copyOf(new Object[]{Base64.encodeToString(bytes, 2)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            callbackInvoker.invokeCallbackInDUIWebview(p0, str);
        }
    }

    @Override // in.juspay.hyper.bridge.HyperBridge
    public final boolean onActivityResult(int p0, int p1, Intent p2) {
        Bundle extras;
        if (p0 != SETTINGS_REQUEST && p0 != 121) {
            return false;
        }
        if (p2 != null) {
            try {
                extras = p2.getExtras();
            } catch (Exception unused) {
                getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, "{\"error\":\"Couldn't read the card! Try again or type your card number\"}");
            }
        } else {
            extras = null;
        }
        if (p0 == 121 && (p1 == -1 || p1 == 0)) {
            if (p2 != null && p2.hasExtra("result_data")) {
                getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, extras != null ? extras.getString("result_data") : null);
                return true;
            }
            getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, "{\"error\":\"Couldn't read the card! Try again or type your card number\"}");
        } else {
            if (p0 == SETTINGS_REQUEST && isNFCEnabled()) {
                openNFCReader(this.callback, this.waitingTime);
                return true;
            }
            if (p0 == SETTINGS_REQUEST && !isNFCEnabled()) {
                getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, "{\"error\":\"Permission denied!\"}");
                return true;
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lin/juspay/hypernfc/NfcBridge$Companion;", "", "<init>", "()V", "", "NFC_CARD_REQUEST", "I", "SETTINGS_REQUEST"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static int RemoteActionCompatParcelizer;
        public static int read;

        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static int write() {
            int i = read;
            int i2 = i % 7008607;
            read = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            RemoteActionCompatParcelizer = startUptimeMillis;
            return startUptimeMillis;
        }
    }
}
