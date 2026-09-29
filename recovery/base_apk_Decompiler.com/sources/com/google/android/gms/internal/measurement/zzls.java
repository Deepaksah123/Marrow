package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzls extends zzlw {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzls() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    final void zza(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zznu.zzf(obj, j);
        if (list instanceof zzlq) {
            objUnmodifiableList = ((zzlq) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzmp) && (list instanceof zzli)) {
                zzli zzliVar = (zzli) list;
                if (zzliVar.zzc()) {
                    zzliVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zznu.zzs(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    final void zzb(Object obj, Object obj2, long j) {
        List list;
        List list2;
        List list3 = (List) zznu.zzf(obj2, j);
        int size = list3.size();
        List list4 = (List) zznu.zzf(obj, j);
        if (list4.isEmpty()) {
            List zzlpVar = list4 instanceof zzlq ? new zzlp(size) : ((list4 instanceof zzmp) && (list4 instanceof zzli)) ? ((zzli) list4).zzd(size) : new ArrayList(size);
            zznu.zzs(obj, j, zzlpVar);
            list2 = zzlpVar;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zznu.zzs(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof zznp) {
                zzlp zzlpVar2 = new zzlp(list4.size() + size);
                zzlpVar2.addAll(zzlpVar2.size(), (zznp) list4);
                zznu.zzs(obj, j, zzlpVar2);
                list = zzlpVar2;
            } else {
                boolean z = list4 instanceof zzmp;
                list2 = list4;
                if (z) {
                    boolean z2 = list4 instanceof zzli;
                    list2 = list4;
                    if (z2) {
                        zzli zzliVar = (zzli) list4;
                        list2 = list4;
                        if (!zzliVar.zzc()) {
                            zzli zzliVarZzd = zzliVar.zzd(list4.size() + size);
                            zznu.zzs(obj, j, zzliVarZzd);
                            list2 = zzliVarZzd;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zznu.zzs(obj, j, list3);
    }

    /* synthetic */ zzls(zzlr zzlrVar) {
        super(null);
    }
}
