package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzkx<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjj<MessageType, BuilderType> {
    protected zzlb zza;
    private final zzlb zzb;

    protected zzkx(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzbR()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzbD();
    }

    private static void zza(Object obj, Object obj2) {
        zzmq.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final zzkx clone() {
        zzkx zzkxVar = (zzkx) this.zzb.zzl(5, null, null);
        zzkxVar.zza = zzaF();
        return zzkxVar;
    }

    public final zzkx zzaB(zzlb zzlbVar) {
        if (!this.zzb.equals(zzlbVar)) {
            if (!this.zza.zzbR()) {
                zzaI();
            }
            zza(this.zza, zzlbVar);
        }
        return this;
    }

    public final zzkx zzaC(byte[] bArr, int i, int i2, zzkn zzknVar) throws zzll {
        if (!this.zza.zzbR()) {
            zzaI();
        }
        try {
            zzmq.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new zzjn(zzknVar));
            return this;
        } catch (zzll e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType zzaD() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzlb r5 = r5.zzaF()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r5.zzl(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L19
            goto L38
        L19:
            if (r3 == 0) goto L39
            com.google.android.gms.internal.measurement.zzmq r3 = com.google.android.gms.internal.measurement.zzmq.zza()
            java.lang.Class r4 = r5.getClass()
            com.google.android.gms.internal.measurement.zzmt r3 = r3.zzb(r4)
            boolean r3 = r3.zzk(r5)
            if (r0 == 0) goto L36
            if (r1 == r3) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = r5
        L32:
            r1 = 2
            r5.zzl(r1, r0, r2)
        L36:
            if (r3 == 0) goto L39
        L38:
            return r5
        L39:
            com.google.android.gms.internal.measurement.zznj r0 = new com.google.android.gms.internal.measurement.zznj
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zzaD():com.google.android.gms.internal.measurement.zzlb");
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public MessageType zzaF() {
        if (!this.zza.zzbR()) {
            return (MessageType) this.zza;
        }
        this.zza.zzbM();
        return (MessageType) this.zza;
    }

    protected final void zzaH() {
        if (this.zza.zzbR()) {
            return;
        }
        zzaI();
    }

    protected void zzaI() {
        zzlb zzlbVarZzbD = this.zzb.zzbD();
        zza(zzlbVarZzbD, this.zza);
        this.zza = zzlbVarZzbD;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* synthetic */ zzjj zzaw(byte[] bArr, int i, int i2) throws zzll {
        zzaC(bArr, 0, i2, zzkn.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* synthetic */ zzjj zzax(byte[] bArr, int i, int i2, zzkn zzknVar) throws zzll {
        zzaC(bArr, 0, i2, zzknVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* synthetic */ zzmi zzbV() {
        throw null;
    }
}
