package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class setGroupSubTitle extends getPlanBUpgradeDataList {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class RemoteActionCompatParcelizer<T> implements Iterable<T>, getCurrentAnsweredMcqProgress {
        private /* synthetic */ Object[] write;

        public RemoteActionCompatParcelizer(Object[] objArr) {
            this.write = objArr;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(this.write);
        }
    }

    public static final class write implements Iterable<Byte>, getCurrentAnsweredMcqProgress {
        private /* synthetic */ byte[] read;

        public write(byte[] bArr) {
            this.read = bArr;
        }

        @Override // java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return r8lambda9MlEA9wr9Cdq_MxIAzY7u71SEjY.read(this.read);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class read<T> implements getTopRankers<T> {
        private /* synthetic */ Object[] read;

        public read(Object[] objArr) {
            this.read = objArr;
        }

        @Override // kotlin.getTopRankers
        public final Iterator<T> write() {
            return r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(this.read);
        }
    }

    public static final <T> boolean AudioAttributesCompatParcelizer(T[] tArr, T t) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return getOrderDetails.read(tArr, t) >= 0;
    }

    public static final boolean write(byte[] bArr, byte b) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return getOrderDetails.AudioAttributesCompatParcelizer(bArr, b) >= 0;
    }

    public static final boolean AudioAttributesCompatParcelizer(short[] sArr, short s) {
        toMagicModuleMetaRepoModel.write(sArr, "");
        return getOrderDetails.write(sArr, s) >= 0;
    }

    public static final boolean write(int[] iArr, int i) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        return getOrderDetails.AudioAttributesImplBaseParcelizer(iArr, i) >= 0;
    }

    public static final boolean RemoteActionCompatParcelizer(long[] jArr, long j) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        return getOrderDetails.AudioAttributesCompatParcelizer(jArr, j) >= 0;
    }

    public static final boolean write(char[] cArr, char c) {
        toMagicModuleMetaRepoModel.write(cArr, "");
        return getOrderDetails.read(cArr, c) >= 0;
    }

    public static final <T> T AudioAttributesImplApi21Parcelizer(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final int write(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static final <T> T MediaBrowserCompatCustomActionResultReceiver(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final Integer read(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <T> T write(T[] tArr, int i) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static final Integer read(int[] iArr, int i) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static final <T> int read(T[] tArr, T t) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int AudioAttributesCompatParcelizer(byte[] bArr, byte b) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int write(short[] sArr, short s) {
        toMagicModuleMetaRepoModel.write(sArr, "");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int AudioAttributesImplBaseParcelizer(int[] iArr, int i) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int AudioAttributesCompatParcelizer(long[] jArr, long j) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int read(char[] cArr, char c) {
        toMagicModuleMetaRepoModel.write(cArr, "");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final <T> T MediaMetadataCompat(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[getOrderDetails.MediaDescriptionCompat(tArr)];
    }

    public static final <T> int write(T[] tArr, T t) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (t == null) {
            int length = tArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (tArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t, tArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    public static final int MediaBrowserCompatCustomActionResultReceiver(int[] iArr, int i) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (i == iArr[length]) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }

    public static final <T> T MediaBrowserCompatMediaItem(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static final <T> T MediaBrowserCompatSearchResultReceiver(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final char read(char[] cArr) {
        toMagicModuleMetaRepoModel.write(cArr, "");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final <T> T onCustomAction(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> AudioAttributesImplApi26Parcelizer(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return getOrderDetails.RemoteActionCompatParcelizer(tArr, getQues.write(tArr.length - 2, 0));
    }

    public static final <T> List<T> AudioAttributesImplBaseParcelizer(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (List) getOrderDetails.AudioAttributesCompatParcelizer((Object[]) tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C AudioAttributesCompatParcelizer(T[] tArr, C c) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(c, "");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static final List<Byte> read(byte[] bArr, int i) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (i >= bArr.length) {
            return getOrderDetails.AudioAttributesCompatParcelizer(bArr);
        }
        if (i == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static final <T> List<T> RemoteActionCompatParcelizer(T[] tArr, int i) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        int length = tArr.length;
        if (i >= length) {
            return getOrderDetails.onCommand(tArr);
        }
        if (i == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(tArr[i2]);
        }
        return arrayList;
    }

    public static final <T> T[] write(T[] tArr, Comparator<? super T> comparator) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tArr2, "");
        getOrderDetails.IconCompatParcelizer((Object[]) tArr2, (Comparator) comparator);
        return tArr2;
    }

    public static final <T> List<T> RemoteActionCompatParcelizer(T[] tArr, Comparator<? super T> comparator) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        return getOrderDetails.read(getOrderDetails.write((Object[]) tArr, (Comparator) comparator));
    }

    public static final <T> newEncryptedObject RatingCompat(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return new newEncryptedObject(0, getOrderDetails.MediaDescriptionCompat(tArr));
    }

    public static final newEncryptedObject RemoteActionCompatParcelizer(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        return new newEncryptedObject(0, getOrderDetails.AudioAttributesImplBaseParcelizer(iArr));
    }

    public static final <T> int MediaDescriptionCompat(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return tArr.length - 1;
    }

    public static final int write(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return bArr.length - 1;
    }

    public static final int AudioAttributesImplBaseParcelizer(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        return iArr.length - 1;
    }

    public static final int IconCompatParcelizer(long[] jArr) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        return jArr.length - 1;
    }

    public static final <T, C extends Collection<? super T>> C write(T[] tArr, C c) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(c, "");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> onCommand(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(tArr[0]);
        }
        return getOrderDetails.onAddQueueItem(tArr);
    }

    public static final List<Byte> AudioAttributesCompatParcelizer(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        int length = bArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Byte.valueOf(bArr[0]));
        }
        return getOrderDetails.RemoteActionCompatParcelizer(bArr);
    }

    public static final List<Short> write(short[] sArr) {
        toMagicModuleMetaRepoModel.write(sArr, "");
        int length = sArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Short.valueOf(sArr[0]));
        }
        return getOrderDetails.RemoteActionCompatParcelizer(sArr);
    }

    public static final List<Integer> AudioAttributesImplApi26Parcelizer(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        int length = iArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Integer.valueOf(iArr[0]));
        }
        return getOrderDetails.MediaDescriptionCompat(iArr);
    }

    public static final List<Long> write(long[] jArr) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        int length = jArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Long.valueOf(jArr[0]));
        }
        return getOrderDetails.RemoteActionCompatParcelizer(jArr);
    }

    public static final List<Float> RemoteActionCompatParcelizer(float[] fArr) {
        toMagicModuleMetaRepoModel.write(fArr, "");
        int length = fArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Float.valueOf(fArr[0]));
        }
        return getOrderDetails.IconCompatParcelizer(fArr);
    }

    public static final List<Double> read(double[] dArr) {
        toMagicModuleMetaRepoModel.write(dArr, "");
        int length = dArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Double.valueOf(dArr[0]));
        }
        return getOrderDetails.IconCompatParcelizer(dArr);
    }

    public static final List<Boolean> IconCompatParcelizer(boolean[] zArr) {
        toMagicModuleMetaRepoModel.write(zArr, "");
        int length = zArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Boolean.valueOf(zArr[0]));
        }
        return getOrderDetails.RemoteActionCompatParcelizer(zArr);
    }

    public static final List<Character> IconCompatParcelizer(char[] cArr) {
        toMagicModuleMetaRepoModel.write(cArr, "");
        int length = cArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Character.valueOf(cArr[0]));
        }
        return getOrderDetails.AudioAttributesCompatParcelizer(cArr);
    }

    public static final <T> List<T> onAddQueueItem(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(tArr, false));
    }

    public static final List<Byte> RemoteActionCompatParcelizer(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static final List<Short> RemoteActionCompatParcelizer(short[] sArr) {
        toMagicModuleMetaRepoModel.write(sArr, "");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static final List<Integer> MediaDescriptionCompat(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final List<Long> RemoteActionCompatParcelizer(long[] jArr) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static final List<Float> IconCompatParcelizer(float[] fArr) {
        toMagicModuleMetaRepoModel.write(fArr, "");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static final List<Double> IconCompatParcelizer(double[] dArr) {
        toMagicModuleMetaRepoModel.write(dArr, "");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static final List<Boolean> RemoteActionCompatParcelizer(boolean[] zArr) {
        toMagicModuleMetaRepoModel.write(zArr, "");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static final List<Character> AudioAttributesCompatParcelizer(char[] cArr) {
        toMagicModuleMetaRepoModel.write(cArr, "");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    public static final <T> Set<T> handleMediaPlayPauseIfPendingOnHandler(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        int length = tArr.length;
        if (length == 0) {
            return getKycMessage.read();
        }
        if (length == 1) {
            return getKycMessage.read(tArr[0]);
        }
        return (Set) getOrderDetails.write((Object[]) tArr, new LinkedHashSet(VideoTimelineResponseBody.read(tArr.length)));
    }

    public static final <T, R> List<R> read(T[] tArr, getAnswerMap<? super T, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(getanswermap.invoke(t));
        }
        return arrayList;
    }

    public static final <T> Iterable<SyncResult<T>> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(final T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return new TestResponseBody(new getCreatedOnDateMs() { // from class: o.setGroupId
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setGroupSubTitle.onFastForward(tArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator onFastForward(Object[] objArr) {
        return r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(objArr);
    }

    public static final Integer MediaBrowserCompatItemReceiver(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int iAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(iArr);
        if (iAudioAttributesImplBaseParcelizer > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == iAudioAttributesImplBaseParcelizer) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static final Integer AudioAttributesImplApi21Parcelizer(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int iAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(iArr);
        if (iAudioAttributesImplBaseParcelizer > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == iAudioAttributesImplBaseParcelizer) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static final <T, A extends Appendable> A read(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super T, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            TestGroupLSModel.RemoteActionCompatParcelizer(a, t, getanswermap);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <A extends Appendable> A RemoteActionCompatParcelizer(byte[] bArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Byte, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (getanswermap != null) {
                a.append(getanswermap.invoke(Byte.valueOf(b)));
            } else {
                a.append(String.valueOf((int) b));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <A extends Appendable> A write(short[] sArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Short, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(sArr, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (short s : sArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (getanswermap != null) {
                a.append(getanswermap.invoke(Short.valueOf(s)));
            } else {
                a.append(String.valueOf((int) s));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <A extends Appendable> A write(int[] iArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Integer, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(iArr, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (getanswermap != null) {
                a.append(getanswermap.invoke(Integer.valueOf(i3)));
            } else {
                a.append(String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <A extends Appendable> A write(long[] jArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Long, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(jArr, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (getanswermap != null) {
                a.append(getanswermap.invoke(Long.valueOf(j)));
            } else {
                a.append(String.valueOf(j));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <A extends Appendable> A IconCompatParcelizer(float[] fArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Float, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(fArr, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (float f : fArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (getanswermap != null) {
                a.append(getanswermap.invoke(Float.valueOf(f)));
            } else {
                a.append(String.valueOf(f));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <A extends Appendable> A read(double[] dArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Double, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(dArr, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (double d : dArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (getanswermap != null) {
                a.append(getanswermap.invoke(Double.valueOf(d)));
            } else {
                a.append(String.valueOf(d));
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String RemoteActionCompatParcelizer(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap getanswermap, int i2) {
        if ((i2 & 1) != 0) {
        }
        CharSequence charSequence5 = charSequence;
        if ((i2 & 2) != 0) {
        }
        CharSequence charSequence6 = charSequence2;
        if ((i2 & 4) != 0) {
        }
        CharSequence charSequence7 = charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
        }
        CharSequence charSequence8 = charSequence4;
        if ((i2 & 32) != 0) {
            getanswermap = null;
        }
        return getOrderDetails.RemoteActionCompatParcelizer(objArr, charSequence5, charSequence6, charSequence7, i3, charSequence8, getanswermap);
    }

    public static final <T> String RemoteActionCompatParcelizer(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super T, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) getOrderDetails.read(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, getanswermap)).toString();
    }

    public static final String write(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Byte, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) getOrderDetails.RemoteActionCompatParcelizer(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, getanswermap)).toString();
    }

    public static final String RemoteActionCompatParcelizer(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Short, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(sArr, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) getOrderDetails.write(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, (getAnswerMap<? super Short, ? extends CharSequence>) null)).toString();
    }

    public static final String read(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Integer, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) getOrderDetails.write(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, (getAnswerMap<? super Integer, ? extends CharSequence>) null)).toString();
    }

    public static final String IconCompatParcelizer(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Long, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(jArr, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) getOrderDetails.write(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, (getAnswerMap<? super Long, ? extends CharSequence>) null)).toString();
    }

    public static final String RemoteActionCompatParcelizer(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Float, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(fArr, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) getOrderDetails.IconCompatParcelizer(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, null)).toString();
    }

    public static final String write(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super Double, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(dArr, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) getOrderDetails.read(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, (getAnswerMap<? super Double, ? extends CharSequence>) null)).toString();
    }

    public static final <T> Iterable<T> RemoteActionCompatParcelizer(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return tArr.length == 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : new RemoteActionCompatParcelizer(tArr);
    }

    public static final Iterable<Byte> read(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return bArr.length == 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : new write(bArr);
    }

    public static final <T> getTopRankers<T> MediaBrowserCompatItemReceiver(T[] tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return tArr.length == 0 ? StateResult.AudioAttributesCompatParcelizer() : new read(tArr);
    }

    public static final int IconCompatParcelizer(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        int i = 0;
        for (byte b : bArr) {
            i += b;
        }
        return i;
    }

    public static final int MediaBrowserCompatCustomActionResultReceiver(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static final <T, R> List<Pair<T, R>> RemoteActionCompatParcelizer(T[] tArr, R[] rArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        toMagicModuleMetaRepoModel.write(rArr, "");
        int iMin = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(setAction.write(tArr[i], rArr[i]));
        }
        return arrayList;
    }
}
