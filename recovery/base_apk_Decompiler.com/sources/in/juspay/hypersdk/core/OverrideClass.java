package in.juspay.hypersdk.core;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import kotlin.InvalidTypeIdException;
import kotlin.deserializeUsingCustom;
import kotlin.hasSuperClassStartingWith;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class OverrideClass {
    private InflateJSON infl;

    public OverrideClass(InflateJSON inflateJSON) {
        this.infl = inflateJSON;
    }

    public void addListener(final Object obj, String str, final JSONObject jSONObject) {
        if (str.equals("setAccessibilityDelegate") && (obj instanceof View)) {
            InvalidTypeIdException.AudioAttributesCompatParcelizer((View) obj, new deserializeUsingCustom() { // from class: in.juspay.hypersdk.core.OverrideClass.1
                @Override // kotlin.deserializeUsingCustom
                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                    OverrideClass.this.callOverriddenMethod(obj, jSONObject, "onInitializeAccessibilityEvent", new Object[]{view, accessibilityEvent}, null);
                }

                @Override // kotlin.deserializeUsingCustom
                public void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                    super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                    OverrideClass.this.callOverriddenMethod(obj, jSONObject, "onInitializeAccessibilityNodeInfo", new Object[]{view, hassuperclassstartingwith}, null);
                }

                @Override // kotlin.deserializeUsingCustom
                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return ((Boolean) OverrideClass.this.callOverriddenMethod(obj, jSONObject, "onRequestSendAccessibilityEvent", new Object[]{viewGroup, accessibilityEvent}, Boolean.valueOf(super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent)))).booleanValue();
                }

                @Override // kotlin.deserializeUsingCustom
                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return ((Boolean) OverrideClass.this.callOverriddenMethod(obj, jSONObject, "performAccessibilityAction", new Object[]{view, Integer.valueOf(i), bundle}, Boolean.valueOf(super.performAccessibilityAction(view, i, bundle)))).booleanValue();
                }

                @Override // kotlin.deserializeUsingCustom
                public void sendAccessibilityEvent(View view, int i) {
                    super.sendAccessibilityEvent(view, i);
                    OverrideClass.this.callOverriddenMethod(obj, jSONObject, "sendAccessibilityEvent", new Object[]{view, Integer.valueOf(i)}, null);
                }

                @Override // kotlin.deserializeUsingCustom
                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                    OverrideClass.this.callOverriddenMethod(obj, jSONObject, "sendAccessibilityEventUnchecked", new Object[]{view, accessibilityEvent}, null);
                }
            });
        }
    }

    public Object callOverriddenMethod(Object obj, JSONObject jSONObject, String str, Object[] objArr, Object obj2) {
        try {
            if (!jSONObject.has(str)) {
                return obj2;
            }
            this.infl.putInState("args", objArr);
            return this.infl.runProps(jSONObject, str, obj);
        } catch (Exception e) {
            DuiLogger logger = this.infl.getDUI().getLogger();
            StringBuilder sb = new StringBuilder("error in callOverriddenMethod");
            sb.append(e.getMessage());
            logger.e("ERROR", sb.toString());
            return obj2;
        }
    }
}
