package kotlin;

import com.facebook.FacebookRequestError;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultAnalyticsCollectorExternalSyntheticLambda56 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[FacebookRequestError.read.values().length];
        RemoteActionCompatParcelizer = iArr;
        iArr[FacebookRequestError.read.OTHER.ordinal()] = 1;
        iArr[FacebookRequestError.read.LOGIN_RECOVERABLE.ordinal()] = 2;
        iArr[FacebookRequestError.read.TRANSIENT.ordinal()] = 3;
    }
}
