package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.IntermediateLoginResponseBody;
import kotlin.getQues;
import kotlin.getSINGLE_SYNC_RESULT;
import kotlin.getSubmissionTimestamp;
import kotlin.newEncryptedObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdz implements zzdd {
    public static final zzdz zza = new zzdz();

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length != 2) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, null);
        }
        Object objZza2 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (objZza2 instanceof Object)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzae(4, 5, null);
        }
        zzcjVar.zzc().zzf(i, zzb(objZza, objZza2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object zzb(Object obj, Object obj2) throws zzae {
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() ^ ((Number) obj2).longValue());
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(getSubmissionTimestamp.IconCompatParcelizer);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i] ^ ((Number) obj2).byteValue())));
                    i++;
                }
                return (Serializable) IntermediateLoginResponseBody.write((Collection<Byte>) arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i] ^ ((Number) obj2).intValue()));
                    i++;
                }
                return (Serializable) IntermediateLoginResponseBody.IconCompatParcelizer((Collection<Integer>) arrayList2);
            }
        }
        if (z && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b ^ ((Number) obj).byteValue())));
            }
            return (Serializable) arrayList3.toArray(new Byte[0]);
        }
        if (z2 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s : sArr) {
                arrayList4.add(Short.valueOf((short) (s ^ ((Number) obj).shortValue())));
            }
            return (Serializable) arrayList4.toArray(new Short[0]);
        }
        if (z3 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList5.add(Integer.valueOf(i2 ^ ((Number) obj).intValue()));
            }
            return (Serializable) arrayList5.toArray(new Integer[0]);
        }
        if (z4 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList6.add(Long.valueOf(j ^ ((Number) obj).longValue()));
            }
            return (Serializable) arrayList6.toArray(new Long[0]);
        }
        boolean z5 = obj instanceof byte[];
        if (z5 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b2 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b2 ^ ((Number) obj2).byteValue())));
            }
            return (Serializable) arrayList7.toArray(new Byte[0]);
        }
        boolean z6 = obj instanceof short[];
        if (z6 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s2 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s2 ^ ((Number) obj2).shortValue())));
            }
            return (Serializable) arrayList8.toArray(new Short[0]);
        }
        boolean z7 = obj instanceof int[];
        if (z7 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i3 : iArr2) {
                arrayList9.add(Integer.valueOf(i3 ^ ((Number) obj2).intValue()));
            }
            return (Serializable) arrayList9.toArray(new Integer[0]);
        }
        boolean z8 = obj instanceof long[];
        if (z8 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j2 : jArr2) {
                arrayList10.add(Long.valueOf(j2 ^ ((Number) obj2).longValue()));
            }
            return (Serializable) arrayList10.toArray(new Long[0]);
        }
        if (z5 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzdc.zza(this, length3, bArr4.length);
            newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, length3);
            ArrayList arrayList11 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer, 10));
            Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
                arrayList11.add(Byte.valueOf((byte) (bArr4[iRemoteActionCompatParcelizer] ^ bArr3[iRemoteActionCompatParcelizer])));
            }
            return (Serializable) arrayList11.toArray(new Byte[0]);
        }
        if (z6 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzdc.zza(this, length4, sArr4.length);
            newEncryptedObject newencryptedobjectIconCompatParcelizer2 = getQues.IconCompatParcelizer(0, length4);
            ArrayList arrayList12 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer2, 10));
            Iterator<Integer> it2 = newencryptedobjectIconCompatParcelizer2.iterator();
            while (it2.hasNext()) {
                int iRemoteActionCompatParcelizer2 = ((getSINGLE_SYNC_RESULT) it2).RemoteActionCompatParcelizer();
                arrayList12.add(Short.valueOf((short) (sArr4[iRemoteActionCompatParcelizer2] ^ sArr3[iRemoteActionCompatParcelizer2])));
            }
            return (Serializable) arrayList12.toArray(new Short[0]);
        }
        if (z7 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzdc.zza(this, length5, iArr4.length);
            newEncryptedObject newencryptedobjectIconCompatParcelizer3 = getQues.IconCompatParcelizer(0, length5);
            ArrayList arrayList13 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer3, 10));
            Iterator<Integer> it3 = newencryptedobjectIconCompatParcelizer3.iterator();
            while (it3.hasNext()) {
                int iRemoteActionCompatParcelizer3 = ((getSINGLE_SYNC_RESULT) it3).RemoteActionCompatParcelizer();
                arrayList13.add(Integer.valueOf(iArr4[iRemoteActionCompatParcelizer3] ^ iArr3[iRemoteActionCompatParcelizer3]));
            }
            return (Serializable) arrayList13.toArray(new Integer[0]);
        }
        if (!z8 || !(obj2 instanceof long[])) {
            throw new zzae(4, 5, null);
        }
        long[] jArr3 = (long[]) obj;
        int length6 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzdc.zza(this, length6, jArr4.length);
        newEncryptedObject newencryptedobjectIconCompatParcelizer4 = getQues.IconCompatParcelizer(0, length6);
        ArrayList arrayList14 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer4, 10));
        Iterator<Integer> it4 = newencryptedobjectIconCompatParcelizer4.iterator();
        while (it4.hasNext()) {
            int iRemoteActionCompatParcelizer4 = ((getSINGLE_SYNC_RESULT) it4).RemoteActionCompatParcelizer();
            arrayList14.add(Long.valueOf(jArr3[iRemoteActionCompatParcelizer4] ^ jArr4[iRemoteActionCompatParcelizer4]));
        }
        return (Serializable) arrayList14.toArray(new Long[0]);
    }

    private zzdz() {
    }
}
