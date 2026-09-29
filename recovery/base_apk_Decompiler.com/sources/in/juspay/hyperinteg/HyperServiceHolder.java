package in.juspay.hyperinteg;

import android.content.Intent;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import in.juspay.services.HyperServices;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.maybeGetTypeVariable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class HyperServiceHolder {
    private static WeakReference<HyperPaymentsCallback> activeMerchantCallback;
    private static HyperServices hyperServices;
    private final maybeGetTypeVariable fragmentActivity;
    private HyperPaymentsCallback merchantCallback;
    private static final HyperPaymentsCallbackAdapter staticCallbackAdapter = new HyperPaymentsCallbackAdapterImpl();
    private static final Queue<Pair<JSONObject, JuspayResponseHandler>> events = new LinkedList();

    public HyperServiceHolder(maybeGetTypeVariable maybegettypevariable) {
        this.fragmentActivity = maybegettypevariable;
        if (hyperServices == null) {
            hyperServices = new HyperServices(maybegettypevariable);
        }
    }

    public HyperServiceHolder(maybeGetTypeVariable maybegettypevariable, HyperPaymentsCallback hyperPaymentsCallback) {
        this(maybegettypevariable);
        activeMerchantCallback = new WeakReference<>(hyperPaymentsCallback);
        this.merchantCallback = hyperPaymentsCallback;
        runQueuedEvents();
    }

    public HyperServiceHolder(maybeGetTypeVariable maybegettypevariable, String str) {
        this.fragmentActivity = maybegettypevariable;
        if (hyperServices == null) {
            hyperServices = new HyperServices(maybegettypevariable, str);
        }
    }

    public HyperServiceHolder(maybeGetTypeVariable maybegettypevariable, String str, String str2) {
        this.fragmentActivity = maybegettypevariable;
        if (hyperServices == null) {
            hyperServices = new HyperServices(maybegettypevariable, str, str2);
        }
    }

    public HyperServices getHyperServices() {
        if (hyperServices == null) {
            hyperServices = new HyperServices(this.fragmentActivity);
        }
        return hyperServices;
    }

    public void initiate(JSONObject jSONObject) {
        getHyperServices().initiate(this.fragmentActivity, jSONObject, staticCallbackAdapter);
    }

    public void process(ViewGroup viewGroup, JSONObject jSONObject) {
        getHyperServices().process(this.fragmentActivity, viewGroup, jSONObject);
    }

    public void process(JSONObject jSONObject) {
        getHyperServices().process(this.fragmentActivity, jSONObject);
    }

    public void terminate() {
        getHyperServices().terminate();
    }

    public boolean isInitialised() {
        return getHyperServices().isInitialised();
    }

    public boolean onBackPressed() {
        return getHyperServices().onBackPressed();
    }

    public void resetActivity() {
        HyperServices hyperServices2 = hyperServices;
        if (hyperServices2 != null) {
            hyperServices2.resetActivity(this.fragmentActivity);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        getHyperServices().onActivityResult(i, i2, intent);
    }

    public void setRequestPermissionDelegate(RequestPermissionDelegate requestPermissionDelegate) {
        getHyperServices().setRequestPermissionDelegate(requestPermissionDelegate);
    }

    public void setIntentSenderDelegate(IntentSenderDelegate intentSenderDelegate) {
        getHyperServices().setIntentSenderDelegate(intentSenderDelegate);
    }

    public void setWebViewConfigurationCallback(JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback) {
        getHyperServices().setWebViewConfigurationCallback(juspayWebViewConfigurationCallback);
    }

    public void setCallback(HyperPaymentsCallback hyperPaymentsCallback) {
        activeMerchantCallback = new WeakReference<>(hyperPaymentsCallback);
        this.merchantCallback = hyperPaymentsCallback;
        runQueuedEvents();
    }

    private void runQueuedEvents() {
        HyperPaymentsCallback hyperPaymentsCallback = activeMerchantCallback.get();
        if (hyperPaymentsCallback == null) {
            return;
        }
        while (true) {
            Queue<Pair<JSONObject, JuspayResponseHandler>> queue = events;
            if (queue.peek() == null) {
                return;
            }
            Pair<JSONObject, JuspayResponseHandler> pairPoll = queue.poll();
            if (pairPoll != null) {
                hyperPaymentsCallback.onEvent((JSONObject) pairPoll.first, (JuspayResponseHandler) pairPoll.second);
            }
        }
    }

    static class HyperPaymentsCallbackAdapterImpl extends HyperPaymentsCallbackAdapter {
        private HyperPaymentsCallbackAdapterImpl() {
        }

        @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
        public void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler) {
            HyperPaymentsCallback hyperPaymentsCallback = (HyperPaymentsCallback) HyperServiceHolder.activeMerchantCallback.get();
            if (hyperPaymentsCallback == null) {
                HyperServiceHolder.events.add(new Pair(jSONObject, juspayResponseHandler));
            } else {
                hyperPaymentsCallback.onEvent(jSONObject, juspayResponseHandler);
            }
        }

        @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
        public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
            HyperPaymentsCallback hyperPaymentsCallback = (HyperPaymentsCallback) HyperServiceHolder.activeMerchantCallback.get();
            if (hyperPaymentsCallback == null) {
                return null;
            }
            return hyperPaymentsCallback.getMerchantView(viewGroup, merchantViewType);
        }
    }
}
