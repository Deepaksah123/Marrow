package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.College;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.SampleVideos;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg {
    private final List zza;

    public /* synthetic */ zzg(List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(listRemoteActionCompatParcelizer);
    }

    public final Object zza(String str, long j, SampleVideos sampleVideos) {
        return College.IconCompatParcelizer(new zzc(this, str, j, null), sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(long r11, com.google.android.recaptcha.internal.zzoe r13, kotlin.SampleVideos r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzd
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzd r0 = (com.google.android.recaptcha.internal.zzd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzd r0 = new com.google.android.recaptcha.internal.zzd
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L47
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            com.google.android.recaptcha.internal.zzf r14 = new com.google.android.recaptcha.internal.zzf
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r5, r6, r8, r9)
            r0.zzc = r3
            java.lang.Object r14 = kotlin.College.IconCompatParcelizer(r14, r0)
            if (r14 != r1) goto L47
            return r1
        L47:
            o.getRfBanners r14 = (kotlin.C0177getRfBanners) r14
            java.lang.Object r10 = r14.getRemoteActionCompatParcelizer()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzg.zzb(long, com.google.android.recaptcha.internal.zzoe, o.SampleVideos):java.lang.Object");
    }

    public final void zzd(zza zzaVar) {
        this.zza.add(zzaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List zzc() {
        return this.zza;
    }
}
