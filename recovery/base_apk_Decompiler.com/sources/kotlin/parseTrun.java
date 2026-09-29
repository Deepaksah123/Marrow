package kotlin;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes3.dex */
final class parseTrun<K, V> extends onMoovContainerAtomRead<K, V> {
    static final onMoovContainerAtomRead<Object, Object> IconCompatParcelizer = new parseTrun(null, new Object[0], 0);
    private transient Object[] AudioAttributesCompatParcelizer;
    private final transient Object RemoteActionCompatParcelizer;
    private final transient int read;

    @Override // kotlin.onMoovContainerAtomRead
    final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return false;
    }

    static <K, V> parseTrun<K, V> IconCompatParcelizer(int i, Object[] objArr) {
        return IconCompatParcelizer(i, objArr, null);
    }

    static <K, V> parseTrun<K, V> IconCompatParcelizer(int i, Object[] objArr, onMoovContainerAtomRead.AudioAttributesCompatParcelizer<K, V> audioAttributesCompatParcelizer) {
        if (i == 0) {
            return (parseTrun) IconCompatParcelizer;
        }
        if (i == 1) {
            FixedSampleSizeRechunker.write(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return new parseTrun<>(null, objArr, 1);
        }
        parseStsd.read(i, objArr.length >> 1);
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(objArr, i, onEmsgLeafAtomRead.AudioAttributesCompatParcelizer(i));
        if (objRemoteActionCompatParcelizer instanceof Object[]) {
            Object[] objArr2 = (Object[]) objRemoteActionCompatParcelizer;
            onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read readVar = (onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read) objArr2[2];
            if (audioAttributesCompatParcelizer == null) {
                throw readVar.write();
            }
            audioAttributesCompatParcelizer.IconCompatParcelizer = readVar;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue << 1);
            objRemoteActionCompatParcelizer = obj;
            i = iIntValue;
        }
        return new parseTrun<>(objRemoteActionCompatParcelizer, objArr, i);
    }

    private static Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2) {
        int i3 = 0;
        if (i == 1) {
            FixedSampleSizeRechunker.write(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return null;
        }
        int i4 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read readVar = null;
            int i5 = 0;
            while (i3 < i) {
                int i6 = i3 << 1;
                int i7 = i5 << 1;
                Object objRequireNonNull = Objects.requireNonNull(objArr[i6]);
                Object objRequireNonNull2 = Objects.requireNonNull(objArr[i6 ^ 1]);
                FixedSampleSizeRechunker.write(objRequireNonNull, objRequireNonNull2);
                int i8 = getDefaultSampleValues.read(objRequireNonNull.hashCode());
                while (true) {
                    int i9 = i8 & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i7;
                        if (i5 < i3) {
                            objArr[i7] = objRequireNonNull;
                            objArr[i7 ^ 1] = objRequireNonNull2;
                        }
                        i5++;
                    } else {
                        if (objRequireNonNull.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read readVar2 = new onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArr[i11]));
                            objArr[i11] = objRequireNonNull2;
                            readVar = readVar2;
                            break;
                        }
                        i8 = i9 + 1;
                    }
                }
                i3++;
            }
            return i5 == i ? bArr : new Object[]{bArr, Integer.valueOf(i5), readVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read readVar3 = null;
            int i12 = 0;
            while (i3 < i) {
                int i13 = i3 << 1;
                int i14 = i12 << 1;
                Object objRequireNonNull3 = Objects.requireNonNull(objArr[i13]);
                Object objRequireNonNull4 = Objects.requireNonNull(objArr[i13 ^ 1]);
                FixedSampleSizeRechunker.write(objRequireNonNull3, objRequireNonNull4);
                int i15 = getDefaultSampleValues.read(objRequireNonNull3.hashCode());
                while (true) {
                    int i16 = i15 & i4;
                    int i17 = sArr[i16] & 65535;
                    if (i17 == 65535) {
                        sArr[i16] = (short) i14;
                        if (i12 < i3) {
                            objArr[i14] = objRequireNonNull3;
                            objArr[i14 ^ 1] = objRequireNonNull4;
                        }
                        i12++;
                    } else {
                        if (objRequireNonNull3.equals(objArr[i17])) {
                            int i18 = i17 ^ 1;
                            onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read readVar4 = new onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArr[i18]));
                            objArr[i18] = objRequireNonNull4;
                            readVar3 = readVar4;
                            break;
                        }
                        i15 = i16 + 1;
                    }
                }
                i3++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), readVar3};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read readVar5 = null;
        int i19 = 0;
        while (i3 < i) {
            int i20 = i3 << 1;
            int i21 = i19 << 1;
            Object objRequireNonNull5 = Objects.requireNonNull(objArr[i20]);
            Object objRequireNonNull6 = Objects.requireNonNull(objArr[i20 ^ 1]);
            FixedSampleSizeRechunker.write(objRequireNonNull5, objRequireNonNull6);
            int i22 = getDefaultSampleValues.read(objRequireNonNull5.hashCode());
            while (true) {
                int i23 = i22 & i4;
                int i24 = iArr[i23];
                if (i24 == -1) {
                    iArr[i23] = i21;
                    if (i19 < i3) {
                        objArr[i21] = objRequireNonNull5;
                        objArr[i21 ^ 1] = objRequireNonNull6;
                    }
                    i19++;
                } else {
                    if (objRequireNonNull5.equals(objArr[i24])) {
                        int i25 = i24 ^ 1;
                        onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read readVar6 = new onMoovContainerAtomRead.AudioAttributesCompatParcelizer.read(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArr[i25]));
                        objArr[i25] = objRequireNonNull6;
                        readVar5 = readVar6;
                        break;
                    }
                    i22 = i23 + 1;
                }
            }
            i3++;
        }
        return i19 == i ? iArr : new Object[]{iArr, Integer.valueOf(i19), readVar5};
    }

    private parseTrun(Object obj, Object[] objArr, int i) {
        this.RemoteActionCompatParcelizer = obj;
        this.AudioAttributesCompatParcelizer = objArr;
        this.read = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.read;
    }

    @Override // kotlin.onMoovContainerAtomRead, java.util.Map
    public final V get(Object obj) {
        V v = (V) RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    private static Object RemoteActionCompatParcelizer(Object obj, Object[] objArr, int i, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (Objects.requireNonNull(objArr[0]).equals(obj2)) {
                return Objects.requireNonNull(objArr[1]);
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            int i2 = getDefaultSampleValues.read(obj2.hashCode());
            while (true) {
                int i3 = i2 & (length - 1);
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                i2 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length;
            int i5 = getDefaultSampleValues.read(obj2.hashCode());
            while (true) {
                int i6 = i5 & (length2 - 1);
                int i7 = sArr[i6] & 65535;
                if (i7 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                i5 = i6 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            int i8 = getDefaultSampleValues.read(obj2.hashCode());
            while (true) {
                int i9 = i8 & (length3 - 1);
                int i10 = iArr[i9];
                if (i10 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                i8 = i9 + 1;
            }
        }
    }

    @Override // kotlin.onMoovContainerAtomRead
    final onEmsgLeafAtomRead<Map.Entry<K, V>> IconCompatParcelizer() {
        return new read(this, this.AudioAttributesCompatParcelizer, this.read);
    }

    static class read<K, V> extends onEmsgLeafAtomRead<Map.Entry<K, V>> {
        private final transient int IconCompatParcelizer;
        private final transient int RemoteActionCompatParcelizer = 0;
        private final transient onMoovContainerAtomRead<K, V> read;
        private final transient Object[] write;

        @Override // kotlin.getNextTrackBundle
        final boolean IconCompatParcelizer() {
            return true;
        }

        @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Iterator iterator() {
            return iterator();
        }

        read(onMoovContainerAtomRead<K, V> onmoovcontaineratomread, Object[] objArr, int i) {
            this.read = onmoovcontaineratomread;
            this.write = objArr;
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getNextTrackBundle
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
        public final getCurrentSampleFlags<Map.Entry<K, V>> iterator() {
            return read().iterator();
        }

        @Override // kotlin.getNextTrackBundle
        final int IconCompatParcelizer(Object[] objArr, int i) {
            return read().IconCompatParcelizer(objArr, i);
        }

        @Override // kotlin.onEmsgLeafAtomRead
        final initExtraTracks<Map.Entry<K, V>> AudioAttributesImplBaseParcelizer() {
            return new initExtraTracks<Map.Entry<K, V>>() { // from class: o.parseTrun.read.2
                @Override // kotlin.getNextTrackBundle
                public final boolean IconCompatParcelizer() {
                    return true;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.List
                /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> get(int i) {
                    parseStsd.write(i, read.this.IconCompatParcelizer);
                    int i2 = i << 1;
                    return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(read.this.write[read.this.RemoteActionCompatParcelizer + i2]), Objects.requireNonNull(read.this.write[i2 + (read.this.RemoteActionCompatParcelizer ^ 1)]));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return read.this.IconCompatParcelizer;
                }

                @Override // kotlin.initExtraTracks, kotlin.getNextTrackBundle
                final Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.read.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle
        final Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // kotlin.onMoovContainerAtomRead
    final onEmsgLeafAtomRead<K> RemoteActionCompatParcelizer() {
        return new write(this, new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, 0, this.read));
    }

    static final class AudioAttributesCompatParcelizer extends initExtraTracks<Object> {
        private final transient int AudioAttributesCompatParcelizer;
        private final transient int RemoteActionCompatParcelizer;
        private final transient Object[] write;

        @Override // kotlin.getNextTrackBundle
        final boolean IconCompatParcelizer() {
            return true;
        }

        AudioAttributesCompatParcelizer(Object[] objArr, int i, int i2) {
            this.write = objArr;
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            parseStsd.write(i, this.RemoteActionCompatParcelizer);
            return Objects.requireNonNull(this.write[(i << 1) + this.AudioAttributesCompatParcelizer]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.initExtraTracks, kotlin.getNextTrackBundle
        final Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class write<K> extends onEmsgLeafAtomRead<K> {
        private final transient onMoovContainerAtomRead<K, ?> IconCompatParcelizer;
        private final transient initExtraTracks<K> read;

        @Override // kotlin.getNextTrackBundle
        final boolean IconCompatParcelizer() {
            return true;
        }

        @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Iterator iterator() {
            return iterator();
        }

        write(onMoovContainerAtomRead<K, ?> onmoovcontaineratomread, initExtraTracks<K> initextratracks) {
            this.IconCompatParcelizer = onmoovcontaineratomread;
            this.read = initextratracks;
        }

        @Override // kotlin.getNextTrackBundle
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
        public final getCurrentSampleFlags<K> iterator() {
            return read().iterator();
        }

        @Override // kotlin.getNextTrackBundle
        final int IconCompatParcelizer(Object[] objArr, int i) {
            return read().IconCompatParcelizer(objArr, i);
        }

        @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle
        public final initExtraTracks<K> read() {
            return this.read;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.IconCompatParcelizer.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.IconCompatParcelizer.size();
        }

        @Override // kotlin.onEmsgLeafAtomRead, kotlin.getNextTrackBundle
        final Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // kotlin.onMoovContainerAtomRead
    final getNextTrackBundle<V> AudioAttributesImplApi21Parcelizer() {
        return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, 1, this.read);
    }

    @Override // kotlin.onMoovContainerAtomRead
    final Object writeReplace() {
        return super.writeReplace();
    }
}
