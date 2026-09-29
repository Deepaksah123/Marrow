package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzij {
    private static final zzij zzb = new zzij(true);
    final zzle zza = new zzku(16);
    private boolean zzc;
    private boolean zzd;

    private zzij() {
    }

    public static int zza(zzii zziiVar, Object obj) {
        int iZzz;
        int iZzd;
        int iZzy;
        zzmb zzmbVarZzd = zziiVar.zzd();
        int iZza = zziiVar.zza();
        zziiVar.zzg();
        int iZzy2 = zzhh.zzy(iZza << 3);
        if (zzmbVarZzd == zzmb.GROUP) {
            zzke zzkeVar = (zzke) obj;
            if (zzkeVar instanceof zzgg) {
                throw null;
            }
            iZzy2 += iZzy2;
        }
        switch (zzmbVarZzd) {
            case DOUBLE:
                iZzz = 8;
                return iZzy2 + iZzz;
            case FLOAT:
                iZzz = 4;
                return iZzy2 + iZzz;
            case INT64:
                iZzz = zzhh.zzz(((Long) obj).longValue());
                return iZzy2 + iZzz;
            case UINT64:
                iZzz = zzhh.zzz(((Long) obj).longValue());
                return iZzy2 + iZzz;
            case INT32:
                iZzz = zzhh.zzu(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case FIXED64:
                iZzz = 8;
                return iZzy2 + iZzz;
            case FIXED32:
                iZzz = 4;
                return iZzy2 + iZzz;
            case BOOL:
                iZzz = 1;
                return iZzy2 + iZzz;
            case STRING:
                if (!(obj instanceof zzgw)) {
                    iZzz = zzhh.zzx((String) obj);
                    return iZzy2 + iZzz;
                }
                iZzd = ((zzgw) obj).zzd();
                iZzy = zzhh.zzy(iZzd);
                iZzz = iZzd + iZzy;
                return iZzy2 + iZzz;
            case GROUP:
                iZzz = ((zzke) obj).zzn();
                return iZzy2 + iZzz;
            case MESSAGE:
                if (!(obj instanceof zzjj)) {
                    iZzz = zzhh.zzv((zzke) obj);
                    return iZzy2 + iZzz;
                }
                iZzd = ((zzjj) obj).zza();
                iZzy = zzhh.zzy(iZzd);
                iZzz = iZzd + iZzy;
                return iZzy2 + iZzz;
            case BYTES:
                if (obj instanceof zzgw) {
                    iZzd = ((zzgw) obj).zzd();
                    iZzy = zzhh.zzy(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzy = zzhh.zzy(iZzd);
                }
                iZzz = iZzd + iZzy;
                return iZzy2 + iZzz;
            case UINT32:
                iZzz = zzhh.zzy(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case ENUM:
                iZzz = obj instanceof zziv ? zzhh.zzu(((zziv) obj).zza()) : zzhh.zzu(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case SFIXED32:
                iZzz = 4;
                return iZzy2 + iZzz;
            case SFIXED64:
                iZzz = 8;
                return iZzy2 + iZzz;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iZzz = zzhh.zzy((iIntValue + iIntValue) ^ (iIntValue >> 31));
                return iZzy2 + iZzz;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iZzz = zzhh.zzz((jLongValue + jLongValue) ^ (jLongValue >> 63));
                return iZzy2 + iZzz;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzkj) {
            return ((zzkj) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzke zzkeVarZzj;
        zzii zziiVar = (zzii) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzjj;
        zziiVar.zzg();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zziiVar, zzl(value));
            return;
        }
        Object objZze = zze(zziiVar);
        if (objZze == null) {
            this.zza.put(zziiVar, zzl(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objZze instanceof zzkj) {
            zzkeVarZzj = zziiVar.zzc((zzkj) objZze, (zzkj) value);
        } else {
            zzkd zzkdVarZzX = ((zzke) objZze).zzX();
            zziiVar.zzb(zzkdVarZzX, (zzke) value);
            zzkeVarZzj = zzkdVarZzX.zzj();
        }
        this.zza.put(zziiVar, zzkeVarZzj);
    }

    private static boolean zzn(Map.Entry entry) {
        zzii zziiVar = (zzii) entry.getKey();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            return true;
        }
        zziiVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzkf) {
            return ((zzkf) value).zzo();
        }
        if (value instanceof zzjj) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzii zziiVar = (zzii) entry.getKey();
        Object value = entry.getValue();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            return zza(zziiVar, value);
        }
        zziiVar.zzg();
        zziiVar.zzf();
        if (!(value instanceof zzjj)) {
            int iZzy = zzhh.zzy(((zzii) entry.getKey()).zza());
            int iZzv = zzhh.zzv((zzke) value);
            int iZzy2 = zzhh.zzy(24);
            int iZzy3 = zzhh.zzy(16);
            int iZzy4 = zzhh.zzy(8);
            return iZzy4 + iZzy4 + iZzy3 + iZzy + iZzy2 + iZzv;
        }
        int iZzy5 = zzhh.zzy(((zzii) entry.getKey()).zza());
        int iZza = ((zzjj) value).zza();
        int iZzy6 = zzhh.zzy(iZza);
        int iZzy7 = zzhh.zzy(24);
        int iZzy8 = zzhh.zzy(16);
        int iZzy9 = zzhh.zzy(8);
        return iZzy9 + iZzy9 + iZzy8 + iZzy5 + iZzy7 + iZzy6 + iZza;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzij) {
            return this.zza.equals(((zzij) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzo = 0;
        for (int i = 0; i < this.zza.zzb(); i++) {
            iZzo += zzo(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzij clone() {
        zzij zzijVar = new zzij();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzijVar.zzi((zzii) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzijVar.zzi((zzii) entry.getKey(), entry.getValue());
        }
        zzijVar.zzd = this.zzd;
        return zzijVar;
    }

    public final Object zze(zzii zziiVar) {
        Object obj = this.zza.get(zziiVar);
        if (!(obj instanceof zzjj)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        boolean z = this.zzd;
        zzle zzleVar = this.zza;
        return z ? new zzji(zzleVar.entrySet().iterator()) : zzleVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzit) {
                ((zzit) entryZzg.getValue()).zzB();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzij zzijVar) {
        for (int i = 0; i < zzijVar.zza.zzb(); i++) {
            zzm(zzijVar.zza.zzg(i));
        }
        Iterator it = zzijVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if ((r3 instanceof com.google.android.recaptcha.internal.zziv) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r3 instanceof com.google.android.recaptcha.internal.zzjj) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzii r2, java.lang.Object r3) {
        /*
            r1 = this;
            r2.zzg()
            com.google.android.recaptcha.internal.zzmb r0 = r2.zzd()
            com.google.android.recaptcha.internal.zzmc r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L4e
        L13:
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzke
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzjj
            if (r0 == 0) goto L4e
            goto L41
        L1c:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zziv
            if (r0 == 0) goto L4e
            goto L41
        L25:
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L4e
            goto L41
        L2e:
            boolean r0 = r3 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r3 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r3 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r3 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r3 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L4e
        L41:
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzjj
            if (r0 == 0) goto L48
            r0 = 1
            r1.zzd = r0
        L48:
            com.google.android.recaptcha.internal.zzle r1 = r1.zza
            r1.put(r2, r3)
            return
        L4e:
            int r1 = r2.zza()
            com.google.android.recaptcha.internal.zzmb r2 = r2.zzd()
            com.google.android.recaptcha.internal.zzmc r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzij.zzi(com.google.android.recaptcha.internal.zzii, java.lang.Object):void");
    }

    public final boolean zzk() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzij(boolean z) {
        zzg();
        zzg();
    }

    public static zzij zzd() {
        return zzb;
    }

    public final boolean zzj() {
        return this.zzc;
    }
}
