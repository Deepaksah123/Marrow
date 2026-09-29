package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.common.api.internal.zacd zaa(com.google.android.gms.common.api.internal.GoogleApiManager r14, int r15, com.google.android.gms.common.api.internal.ApiKey r16) {
        /*
            boolean r0 = r14.zaD()
            if (r0 != 0) goto L7
            goto L4f
        L7:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.getConfig()
            if (r0 == 0) goto L51
            boolean r1 = r0.getMethodInvocationTelemetryEnabled()
            if (r1 == 0) goto L4f
            boolean r0 = r0.getMethodTimingTelemetryEnabled()
            r2 = r14
            r4 = r16
            com.google.android.gms.common.api.internal.zabq r1 = r14.zai(r4)
            if (r1 == 0) goto L4d
            com.google.android.gms.common.api.Api$Client r3 = r1.zaf()
            boolean r3 = r3 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r3 == 0) goto L4f
            com.google.android.gms.common.api.Api$Client r3 = r1.zaf()
            com.google.android.gms.common.internal.BaseGmsClient r3 = (com.google.android.gms.common.internal.BaseGmsClient) r3
            boolean r5 = r3.hasConnectionInfo()
            if (r5 == 0) goto L4d
            boolean r5 = r3.isConnecting()
            if (r5 != 0) goto L4d
            r5 = r15
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = zab(r1, r3, r15)
            if (r0 == 0) goto L4f
            r1.zaq()
            boolean r0 = r0.getMethodTimingTelemetryEnabled()
            goto L56
        L4d:
            r5 = r15
            goto L56
        L4f:
            r0 = 0
            return r0
        L51:
            r2 = r14
            r5 = r15
            r4 = r16
            r0 = 1
        L56:
            r6 = 0
            if (r0 == 0) goto L5f
            long r8 = java.lang.System.currentTimeMillis()
            goto L60
        L5f:
            r8 = r6
        L60:
            if (r0 == 0) goto L68
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10 = r0
            goto L69
        L68:
            r10 = r6
        L69:
            com.google.android.gms.common.api.internal.zacd r0 = new com.google.android.gms.common.api.internal.zacd
            r12 = 0
            r13 = 0
            r1 = r0
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r8
            r7 = r10
            r9 = r12
            r10 = r13
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zacd.zaa(com.google.android.gms.common.api.internal.GoogleApiManager, int, com.google.android.gms.common.api.internal.ApiKey):com.google.android.gms.common.api.internal.zacd");
    }

    private static ConnectionTelemetryConfiguration zab(zabq zabqVar, BaseGmsClient baseGmsClient, int i) {
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled()) {
            return null;
        }
        int[] methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist();
        if (methodInvocationMethodKeyAllowlist == null) {
            int[] methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist();
            if (methodInvocationMethodKeyDisallowlist != null && ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i)) {
                return null;
            }
        } else if (!ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i)) {
            return null;
        }
        if (zabqVar.zac() < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabq zabqVarZai;
        int version;
        int i;
        int i2;
        int errorCode;
        long j;
        long j2;
        int iElapsedRealtime;
        if (this.zaa.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zabqVarZai = this.zaa.zai(this.zac)) != null && (zabqVarZai.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabqVarZai.zaf();
                int i3 = 0;
                boolean methodTimingTelemetryEnabled = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int statusCode = 100;
                if (config != null) {
                    methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    version = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationZab = zab(zabqVarZai, baseGmsClient, this.zab);
                        if (connectionTelemetryConfigurationZab == null) {
                            return;
                        }
                        boolean z = connectionTelemetryConfigurationZab.getMethodTimingTelemetryEnabled() && this.zad > 0;
                        maxMethodInvocationsInBatch = connectionTelemetryConfigurationZab.getMaxMethodInvocationsLogged();
                        methodTimingTelemetryEnabled = z;
                    }
                    i2 = batchPeriodMillis;
                    i = maxMethodInvocationsInBatch;
                } else {
                    version = 0;
                    i = 100;
                    i2 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else if (task.isCanceled()) {
                    i3 = statusCode;
                    errorCode = -1;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).getStatus();
                        statusCode = status.getStatusCode();
                        ConnectionResult connectionResult = status.getConnectionResult();
                        if (connectionResult != null) {
                            errorCode = connectionResult.getErrorCode();
                            i3 = statusCode;
                        }
                        i3 = statusCode;
                        errorCode = -1;
                    } else {
                        i3 = 101;
                        errorCode = -1;
                    }
                }
                if (methodTimingTelemetryEnabled) {
                    long j3 = this.zad;
                    long j4 = this.zae;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                    j2 = jCurrentTimeMillis;
                    j = j3;
                } else {
                    j = 0;
                    j2 = 0;
                    iElapsedRealtime = -1;
                }
                googleApiManager.zaw(new MethodInvocation(this.zab, i3, errorCode, j, j2, null, null, gCoreServiceId, iElapsedRealtime), version, i2, i);
            }
        }
    }

    zacd(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }
}
