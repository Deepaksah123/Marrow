package com.razorpay;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.getRenewGrpId;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H&¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H&¢\u0006\u0004\b\u000b\u0010\u0006J3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0001H&¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0001H&¢\u0006\u0004\b\u0012\u0010\u0011J3\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0001H&¢\u0006\u0004\b\u0013\u0010\u0011JG\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0001H&¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u001e\u0010\u001fJ[\u0010#\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J3\u0010%\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0001H&¢\u0006\u0004\b%\u0010\u0011J3\u0010&\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0001H&¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010'\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010\bJG\u0010(\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0015\u001a\u00020!H&¢\u0006\u0004\b(\u0010)J+\u0010*\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b*\u0010\u0019J\u000f\u0010+\u001a\u00020\u0004H&¢\u0006\u0004\b+\u0010\bJ'\u0010,\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020!H&¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H&¢\u0006\u0004\b0\u0010\u0006"}, d2 = {"Lcom/razorpay/RzpTurboExternalPlugin;", "", "p0", "p1", "", "changeUpiPin", "(Ljava/lang/Object;Ljava/lang/Object;)V", "clearSession", "()V", "delink", "destroy", "getBalance", "Landroid/app/Activity;", "", "p2", "p3", "getLinkedBankAccounts", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getLinkedTPVUpiAccounts", "getLinkedUpiAccounts", "p4", "p5", "getLinkedUpiAccountsCheckout", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "initTurboSdk", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "initialize", "(Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "linkNewTPVUpiAccount", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "linkNewUpiAccount", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "p6", "", "p7", "linkNewUpiAccountCheckout", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Z)V", "manageUpiAccounts", "manageUpiAccountsCustom", "onPermissionsRequestResult", "prefetchAndLinkNewUpiAccount", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Z)V", "preloadUpiAccountsCheckout", "releaseActivityReference", "resetUpiPin", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "setFeeBearer", "(Z)V", "setUpiPinWithUI"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface RzpTurboExternalPlugin {
    void changeUpiPin(Object p0, Object p1);

    @getRenewGrpId
    void clearSession();

    void delink(Object p0, Object p1);

    void destroy();

    void getBalance(Object p0, Object p1);

    void getLinkedBankAccounts(Activity p0, String p1, String p2, Object p3);

    void getLinkedTPVUpiAccounts(Activity p0, String p1, String p2, Object p3);

    void getLinkedUpiAccounts(Activity p0, String p1, String p2, Object p3);

    void getLinkedUpiAccountsCheckout(Activity p0, String p1, String p2, String p3, Object p4, String p5);

    void initTurboSdk(Activity p0, String p1, String p2);

    void initialize(Activity p0, Object p1, String p2, String p3);

    void linkNewTPVUpiAccount(Activity p0, String p1, String p2, Object p3, String p4, Object p5);

    void linkNewUpiAccount(Activity p0, String p1, String p2, Object p3, String p4);

    void linkNewUpiAccountCheckout(Activity p0, String p1, String p2, String p3, String p4, Object p5, String p6, boolean p7);

    void manageUpiAccounts(Activity p0, String p1, String p2, Object p3);

    void manageUpiAccountsCustom(Activity p0, String p1, String p2, Object p3);

    void onPermissionsRequestResult();

    void prefetchAndLinkNewUpiAccount(Activity p0, String p1, String p2, Object p3, String p4, boolean p5);

    void preloadUpiAccountsCheckout(Activity p0, String p1, String p2);

    void releaseActivityReference();

    void resetUpiPin(Object p0, Object p1, Object p2);

    void setFeeBearer(boolean p0);

    void setUpiPinWithUI(Object p0, Object p1);

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void prefetchAndLinkNewUpiAccount$default(RzpTurboExternalPlugin rzpTurboExternalPlugin, Activity activity, String str, String str2, Object obj, String str3, boolean z, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prefetchAndLinkNewUpiAccount");
            }
            if ((i & 32) != 0) {
                z = false;
            }
            rzpTurboExternalPlugin.prefetchAndLinkNewUpiAccount(activity, str, str2, obj, str3, z);
        }

        public static /* synthetic */ void linkNewUpiAccountCheckout$default(RzpTurboExternalPlugin rzpTurboExternalPlugin, Activity activity, String str, String str2, String str3, String str4, Object obj, String str5, boolean z, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkNewUpiAccountCheckout");
            }
            rzpTurboExternalPlugin.linkNewUpiAccountCheckout(activity, str, str2, str3, str4, obj, str5, (i & 128) != 0 ? false : z);
        }
    }
}
