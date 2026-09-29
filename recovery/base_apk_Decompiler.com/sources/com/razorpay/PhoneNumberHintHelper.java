package com.razorpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin._checkBooleanToStringCoercion;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: renamed from: com.razorpay.o_$O$0$$, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/razorpay/PhoneNumberHintHelper;", "", "()V", "request", "Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;", "getRequest", "()Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;", "onActivityResultReceived", "Lcom/razorpay/PhoneNumberHintHelper$PhoneNumberResponse;", "activity", "Landroid/app/Activity;", "resultCode", "", "data", "Landroid/content/Intent;", "triggerPhoneNumberHintApi", "", "PhoneNumberHintResponseStates", "PhoneNumberResponse", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PhoneNumberHintHelper {
    public static final PhoneNumberHintHelper INSTANCE = new PhoneNumberHintHelper();
    private static final GetPhoneNumberHintIntentRequest request;

    private PhoneNumberHintHelper() {
    }

    static {
        GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequestBuild = GetPhoneNumberHintIntentRequest.builder().build();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getPhoneNumberHintIntentRequestBuild, "");
        request = getPhoneNumberHintIntentRequestBuild;
    }

    public final GetPhoneNumberHintIntentRequest getRequest() {
        return request;
    }

    public final void triggerPhoneNumberHintApi(final Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        Identity.getSignInClient(activity).getPhoneNumberHintIntent(request).addOnSuccessListener(new OnSuccessListener() { // from class: com.razorpay.o_$O$0$$$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                PhoneNumberHintHelper.m234triggerPhoneNumberHintApi$lambda0(activity, (PendingIntent) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.razorpay.o_$O$0$$$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PhoneNumberHintHelper.m235triggerPhoneNumberHintApi$lambda1(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: triggerPhoneNumberHintApi$lambda-0, reason: not valid java name */
    public static final void m234triggerPhoneNumberHintApi$lambda0(Activity activity, PendingIntent pendingIntent) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(pendingIntent, "");
        try {
            AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCHED);
            _checkBooleanToStringCoercion.IconCompatParcelizer(activity, pendingIntent.getIntentSender(), 102, null, 0, 0, 0, null);
        } catch (Exception unused) {
            AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCH_FAILED);
            Logger.e("Launching the PendingIntent failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: triggerPhoneNumberHintApi$lambda-1, reason: not valid java name */
    public static final void m235triggerPhoneNumberHintApi$lambda1(Exception exc) {
        toMagicModuleMetaRepoModel.write(exc, "");
        AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCH_FAILED);
        Logger.e("Phone Number Hint failed");
    }

    public final o_$O$0$$$_$O0_o onActivityResultReceived(Activity activity, int i, Intent intent) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if (i == -1 && intent != null) {
            try {
                String phoneNumberFromIntent = Identity.getSignInClient(activity).getPhoneNumberFromIntent(intent);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(phoneNumberFromIntent, "");
                StringBuilder sb = new StringBuilder("Selected Phone Number: ");
                sb.append(phoneNumberFromIntent);
                Logger.d(sb.toString());
                if (!TestGroupLSModel.IconCompatParcelizer((CharSequence) phoneNumberFromIntent)) {
                    return new o_$O$0$$$_$O0_o(o_$O$0$$$O$$$__o0Oo.SUCCESS, phoneNumberFromIntent, null);
                }
                return new o_$O$0$$$_$O0_o(o_$O$0$$$O$$$__o0Oo.FAILED_TO_FETCH_NUMBER, null, "Unable to fetch contact details.");
            } catch (ApiException e) {
                o_$O$0$$$O$$$__o0Oo o__o_0___o_____o0oo = o_$O$0$$$O$$$__o0Oo.FAILED;
                String message = e.getMessage();
                if (message == null) {
                    message = "Something went wrong.";
                }
                return new o_$O$0$$$_$O0_o(o__o_0___o_____o0oo, null, message);
            }
        }
        return new o_$O$0$$$_$O0_o(o_$O$0$$$O$$$__o0Oo.USER_DECLINED, null, "User declined the request");
    }
}
