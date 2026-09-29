package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;
import kotlin.Metadata;
import kotlin.SampleVideos;
import kotlin.getMagicModuleMeta;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "<init>", "()V", "Landroid/app/Application;", "p0", "", "p1", "", "p2", "Lo/getRfBanners;", "Lcom/google/android/recaptcha/RecaptchaClient;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLo/SampleVideos;)Ljava/lang/Object;", "getClient", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "getTasksClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m175getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m176getClientBWLJW6A(application, str, j, sampleVideos);
    }

    @getMagicModuleMeta
    public static final Task<RecaptchaTasksClient> getTasksClient(Application p0, String p1) {
        return zzam.zzd(p0, p1, 10000L);
    }

    @getMagicModuleMeta
    public static final Task<RecaptchaTasksClient> getTasksClient(Application p0, String p1, long p2) {
        return zzam.zzd(p0, p1, p2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m176getClientBWLJW6A(android.app.Application r8, java.lang.String r9, long r10, kotlin.SampleVideos<? super kotlin.C0177getRfBanners<? extends com.google.android.recaptcha.RecaptchaClient>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r7 = r6.zza
            java.lang.Object r12 = kotlin.getYear.IconCompatParcelizer()
            int r0 = r6.zzc
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)     // Catch: java.lang.Throwable -> L4b
            goto L44
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getRfBanners$IconCompatParcelizer r7 = kotlin.C0177getRfBanners.IconCompatParcelizer     // Catch: java.lang.Throwable -> L4b
            r6.zzc = r1     // Catch: java.lang.Throwable -> L4b
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzam.zzc(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r12) goto L44
            return r12
        L44:
            com.google.android.recaptcha.internal.zzaw r7 = (com.google.android.recaptcha.internal.zzaw) r7     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = kotlin.C0177getRfBanners.read(r7)     // Catch: java.lang.Throwable -> L4b
            return r7
        L4b:
            r7 = move-exception
            o.getRfBanners$IconCompatParcelizer r8 = kotlin.C0177getRfBanners.IconCompatParcelizer
            java.lang.Object r7 = kotlin.SdkPayloadData.write(r7)
            java.lang.Object r7 = kotlin.C0177getRfBanners.read(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m176getClientBWLJW6A(android.app.Application, java.lang.String, long, o.SampleVideos):java.lang.Object");
    }

    private Recaptcha() {
    }
}
