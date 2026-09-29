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
public final class zzdn implements zzdd {
    public static final zzdn zza = new zzdn();

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zzb(Object obj, Object obj2) throws ArithmeticException, zzae {
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z5 = obj instanceof Float;
        if (z5 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z6 = obj instanceof Double;
        if (z6 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(getSubmissionTimestamp.IconCompatParcelizer);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i] % ((Number) obj2).intValue())));
                    i++;
                }
                return new String(IntermediateLoginResponseBody.write((Collection<Byte>) arrayList), getSubmissionTimestamp.IconCompatParcelizer);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i] % ((Number) obj2).intValue()));
                    i++;
                }
                return (Serializable) IntermediateLoginResponseBody.IconCompatParcelizer((Collection<Integer>) arrayList2);
            }
        }
        if (z && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList3.add(Integer.valueOf(b % ((Number) obj).intValue()));
            }
            return (Serializable) arrayList3.toArray(new Integer[0]);
        }
        if (z2 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s : sArr) {
                arrayList4.add(Integer.valueOf(s % ((Number) obj).intValue()));
            }
            return (Serializable) arrayList4.toArray(new Integer[0]);
        }
        if (z3 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList5.add(Integer.valueOf(i2 % ((Number) obj).intValue()));
            }
            return (Serializable) arrayList5.toArray(new Integer[0]);
        }
        if (z4 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList6.add(Long.valueOf(j % ((Number) obj).longValue()));
            }
            return (Serializable) arrayList6.toArray(new Long[0]);
        }
        if (z5 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f : fArr) {
                arrayList7.add(Float.valueOf(f % ((Number) obj).floatValue()));
            }
            return (Serializable) arrayList7.toArray(new Float[0]);
        }
        if (z6 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d : dArr) {
                arrayList8.add(Double.valueOf(d % ((Number) obj).doubleValue()));
            }
            return (Serializable) arrayList8.toArray(new Double[0]);
        }
        boolean z7 = obj instanceof byte[];
        if (z7 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b2 : bArr2) {
                arrayList9.add(Integer.valueOf(b2 % ((Number) obj2).intValue()));
            }
            return (Serializable) arrayList9.toArray(new Integer[0]);
        }
        boolean z8 = obj instanceof short[];
        if (z8 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s2 : sArr2) {
                arrayList10.add(Integer.valueOf(s2 % ((Number) obj2).intValue()));
            }
            return (Serializable) arrayList10.toArray(new Integer[0]);
        }
        boolean z9 = obj instanceof int[];
        if (z9 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i] % ((Number) obj2).intValue()));
                i++;
            }
            return (Serializable) IntermediateLoginResponseBody.IconCompatParcelizer((Collection<Integer>) arrayList11);
        }
        boolean z10 = obj instanceof long[];
        if (z10 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j2 : jArr2) {
                arrayList12.add(Long.valueOf(j2 % ((Number) obj2).longValue()));
            }
            return (Serializable) arrayList12.toArray(new Long[0]);
        }
        boolean z11 = obj instanceof float[];
        if (z11 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f2 : fArr2) {
                arrayList13.add(Float.valueOf(f2 % ((Number) obj2).floatValue()));
            }
            return (Serializable) arrayList13.toArray(new Float[0]);
        }
        boolean z12 = obj instanceof double[];
        if (z12 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d2 : dArr2) {
                arrayList14.add(Double.valueOf(d2 % ((Number) obj2).doubleValue()));
            }
            return (Serializable) arrayList14.toArray(new Double[0]);
        }
        if (z7 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzdc.zza(this, length4, bArr4.length);
            newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, length4);
            ArrayList arrayList15 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer, 10));
            Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
                arrayList15.add(Integer.valueOf(bArr3[iRemoteActionCompatParcelizer] % bArr4[iRemoteActionCompatParcelizer]));
            }
            return (Serializable) arrayList15.toArray(new Integer[0]);
        }
        if (z8 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzdc.zza(this, length5, sArr4.length);
            newEncryptedObject newencryptedobjectIconCompatParcelizer2 = getQues.IconCompatParcelizer(0, length5);
            ArrayList arrayList16 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer2, 10));
            Iterator<Integer> it2 = newencryptedobjectIconCompatParcelizer2.iterator();
            while (it2.hasNext()) {
                int iRemoteActionCompatParcelizer2 = ((getSINGLE_SYNC_RESULT) it2).RemoteActionCompatParcelizer();
                arrayList16.add(Integer.valueOf(sArr3[iRemoteActionCompatParcelizer2] % sArr4[iRemoteActionCompatParcelizer2]));
            }
            return (Serializable) arrayList16.toArray(new Integer[0]);
        }
        if (z9 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzdc.zza(this, length6, iArr4.length);
            newEncryptedObject newencryptedobjectIconCompatParcelizer3 = getQues.IconCompatParcelizer(0, length6);
            ArrayList arrayList17 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer3, 10));
            Iterator<Integer> it3 = newencryptedobjectIconCompatParcelizer3.iterator();
            while (it3.hasNext()) {
                int iRemoteActionCompatParcelizer3 = ((getSINGLE_SYNC_RESULT) it3).RemoteActionCompatParcelizer();
                arrayList17.add(Integer.valueOf(iArr3[iRemoteActionCompatParcelizer3] % iArr4[iRemoteActionCompatParcelizer3]));
            }
            return (Serializable) arrayList17.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzdc.zza(this, length7, jArr4.length);
            newEncryptedObject newencryptedobjectIconCompatParcelizer4 = getQues.IconCompatParcelizer(0, length7);
            ArrayList arrayList18 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer4, 10));
            Iterator<Integer> it4 = newencryptedobjectIconCompatParcelizer4.iterator();
            while (it4.hasNext()) {
                int iRemoteActionCompatParcelizer4 = ((getSINGLE_SYNC_RESULT) it4).RemoteActionCompatParcelizer();
                arrayList18.add(Long.valueOf(jArr3[iRemoteActionCompatParcelizer4] % jArr4[iRemoteActionCompatParcelizer4]));
            }
            return (Serializable) arrayList18.toArray(new Long[0]);
        }
        if (z11 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzdc.zza(this, length8, fArr4.length);
            newEncryptedObject newencryptedobjectIconCompatParcelizer5 = getQues.IconCompatParcelizer(0, length8);
            ArrayList arrayList19 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer5, 10));
            Iterator<Integer> it5 = newencryptedobjectIconCompatParcelizer5.iterator();
            while (it5.hasNext()) {
                int iRemoteActionCompatParcelizer5 = ((getSINGLE_SYNC_RESULT) it5).RemoteActionCompatParcelizer();
                arrayList19.add(Float.valueOf(fArr3[iRemoteActionCompatParcelizer5] % fArr4[iRemoteActionCompatParcelizer5]));
            }
            return (Serializable) arrayList19.toArray(new Float[0]);
        }
        if (!z12 || !(obj2 instanceof double[])) {
            throw new zzae(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzdc.zza(this, length9, dArr4.length);
        newEncryptedObject newencryptedobjectIconCompatParcelizer6 = getQues.IconCompatParcelizer(0, length9);
        ArrayList arrayList20 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer6, 10));
        Iterator<Integer> it6 = newencryptedobjectIconCompatParcelizer6.iterator();
        while (it6.hasNext()) {
            int iRemoteActionCompatParcelizer6 = ((getSINGLE_SYNC_RESULT) it6).RemoteActionCompatParcelizer();
            arrayList20.add(Double.valueOf(dArr3[iRemoteActionCompatParcelizer6] % dArr4[iRemoteActionCompatParcelizer6]));
        }
        return (Serializable) arrayList20.toArray(new Double[0]);
    }

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
        try {
            zzcjVar.zzc().zzf(i, zzb(objZza, objZza2));
        } catch (ArithmeticException e) {
            throw new zzae(4, 6, e);
        }
    }

    private zzdn() {
    }
}
