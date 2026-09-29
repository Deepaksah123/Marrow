package in.juspay.hyper.core;

import android.app.Activity;
import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0014\u0010'\u001a\u00020$8'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8'X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Lin/juspay/hyper/core/BridgeComponents;", "", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "Lin/juspay/hyper/core/CallbackInvoker;", "getCallbackInvoker", "()Lin/juspay/hyper/core/CallbackInvoker;", "callbackInvoker", "", "getClientId", "()Ljava/lang/String;", "clientId", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", LogCategory.CONTEXT, "Lin/juspay/hyper/core/FileProviderInterface;", "getFileProviderInterface", "()Lin/juspay/hyper/core/FileProviderInterface;", "fileProviderInterface", "Lin/juspay/hyper/core/FragmentHooks;", "getFragmentHooks", "()Lin/juspay/hyper/core/FragmentHooks;", "fragmentHooks", "Lin/juspay/hyper/core/JsCallback;", "getJsCallback", "()Lin/juspay/hyper/core/JsCallback;", "jsCallback", "Lorg/json/JSONObject;", "getSdkConfig", "()Lorg/json/JSONObject;", "sdkConfig", "getSdkName", PaymentConstants.SDK_NAME, "Lin/juspay/hyper/core/SessionInfoInterface;", "getSessionInfoInterface", "()Lin/juspay/hyper/core/SessionInfoInterface;", "sessionInfoInterface", "Lin/juspay/hyper/core/TrackerInterface;", "getTrackerInterface", "()Lin/juspay/hyper/core/TrackerInterface;", "trackerInterface"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BridgeComponents {
    Activity getActivity();

    CallbackInvoker getCallbackInvoker();

    String getClientId();

    Context getContext();

    FileProviderInterface getFileProviderInterface();

    FragmentHooks getFragmentHooks();

    JsCallback getJsCallback();

    JSONObject getSdkConfig();

    String getSdkName();

    SessionInfoInterface getSessionInfoInterface();

    TrackerInterface getTrackerInterface();
}
