package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class zzaa extends zzku {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzlh zzlhVar) {
        super(zzlhVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x0a12, code lost:
    
        r6 = r64.zzt.zzaA().zzk();
        r8 = com.google.android.gms.measurement.internal.zzet.zzn(r64.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0a26, code lost:
    
        if (r7.zzj() == false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0a28, code lost:
    
        r7 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0a31, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0a32, code lost:
    
        r6.zzc("Invalid property filter ID. appId, id", r8, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08f6 A[PHI: r0 r8
      0x08f6: PHI (r0v143 java.util.Map) = (r0v145 java.util.Map), (r0v152 java.util.Map) binds: [B:361:0x091d, B:347:0x08f4] A[DONT_GENERATE, DONT_INLINE]
      0x08f6: PHI (r8v38 android.database.Cursor) = (r8v39 android.database.Cursor), (r8v42 android.database.Cursor) binds: [B:361:0x091d, B:347:0x08f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ba A[Catch: SQLiteException -> 0x0225, all -> 0x0af8, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x0225, blocks: (B:60:0x01b4, B:62:0x01ba, B:66:0x01c8, B:67:0x01cd, B:68:0x01d7, B:69:0x01e7, B:71:0x01f4), top: B:441:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8 A[Catch: SQLiteException -> 0x0225, all -> 0x0af8, TRY_ENTER, TryCatch #10 {SQLiteException -> 0x0225, blocks: (B:60:0x01b4, B:62:0x01ba, B:66:0x01c8, B:67:0x01cd, B:68:0x01d7, B:69:0x01e7, B:71:0x01f4), top: B:441:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025a  */
    /* JADX WARN: Type inference failed for: r0v195, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v55, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List zza(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    protected final boolean zzb() {
        return false;
    }
}
