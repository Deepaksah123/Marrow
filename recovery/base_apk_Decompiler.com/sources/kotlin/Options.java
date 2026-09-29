package kotlin;

import android.os.SystemClock;
import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.CustomButton, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", "index", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Options extends setUrl<getRelatedModuleAdapter> implements RandomAccess {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);
    private final getRelatedModuleAdapter[] read;
    private final int[] write;

    private int IconCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter) {
        return super.indexOf(getrelatedmoduleadapter);
    }

    private boolean read(getRelatedModuleAdapter getrelatedmoduleadapter) {
        return super.contains(getrelatedmoduleadapter);
    }

    private int write(getRelatedModuleAdapter getrelatedmoduleadapter) {
        return super.lastIndexOf(getrelatedmoduleadapter);
    }

    @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof getRelatedModuleAdapter) {
            return read((getRelatedModuleAdapter) obj);
        }
        return false;
    }

    @Override // kotlin.setUrl, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof getRelatedModuleAdapter) {
            return IconCompatParcelizer((getRelatedModuleAdapter) obj);
        }
        return -1;
    }

    @Override // kotlin.setUrl, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof getRelatedModuleAdapter) {
            return write((getRelatedModuleAdapter) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final getRelatedModuleAdapter[] getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int[] getWrite() {
        return this.write;
    }

    private Options(getRelatedModuleAdapter[] getrelatedmoduleadapterArr, int[] iArr) {
        this.read = getrelatedmoduleadapterArr;
        this.write = iArr;
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final int getIconCompatParcelizer() {
        return this.read.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setUrl, java.util.List
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getRelatedModuleAdapter get(int i) {
        return this.read[i];
    }

    /* JADX INFO: renamed from: o.CustomButton$IconCompatParcelizer */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        public static int AudioAttributesCompatParcelizer;
        public static int write;

        private IconCompatParcelizer() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        
            continue;
         */
        @kotlin.getMagicModuleMeta
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.Options AudioAttributesCompatParcelizer(kotlin.getRelatedModuleAdapter... r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(o.getRelatedModuleAdapter[]):o.CustomButton");
        }

        private static /* synthetic */ void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, resetCurrentSelectedPosition resetcurrentselectedposition, List list, List list2) throws IOException {
            iconCompatParcelizer.write(0L, resetcurrentselectedposition, 0, list, 0, list.size(), list2);
        }

        private final void write(long j, resetCurrentSelectedPosition resetcurrentselectedposition, int i, List<? extends getRelatedModuleAdapter> list, int i2, int i3, List<Integer> list2) throws IOException {
            int iIntValue;
            int i4;
            int i5;
            int i6;
            int i7 = i;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (list.get(i8).MediaBrowserCompatCustomActionResultReceiver() < i7) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            getRelatedModuleAdapter getrelatedmoduleadapter = list.get(i2);
            getRelatedModuleAdapter getrelatedmoduleadapter2 = list.get(i3 - 1);
            if (i7 == getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver()) {
                int i9 = i2 + 1;
                i4 = i9;
                iIntValue = list2.get(i2).intValue();
                getrelatedmoduleadapter = list.get(i9);
            } else {
                iIntValue = -1;
                i4 = i2;
            }
            if (getrelatedmoduleadapter.read(i7) != getrelatedmoduleadapter2.read(i7)) {
                int i10 = 1;
                for (int i11 = i4 + 1; i11 < i3; i11++) {
                    if (list.get(i11 - 1).read(i7) != list.get(i11).read(i7)) {
                        i10++;
                    }
                }
                long jWrite = j + write(resetcurrentselectedposition) + 2 + ((long) (i10 << 1));
                resetcurrentselectedposition.write(i10);
                resetcurrentselectedposition.write(iIntValue);
                for (int i12 = i4; i12 < i3; i12++) {
                    byte b = list.get(i12).read(i7);
                    if (i12 == i4 || b != list.get(i12 - 1).read(i7)) {
                        resetcurrentselectedposition.write(b & 255);
                    }
                }
                resetCurrentSelectedPosition resetcurrentselectedposition2 = new resetCurrentSelectedPosition();
                int i13 = i4;
                while (i13 < i3) {
                    byte b2 = list.get(i13).read(i7);
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        if (i15 >= i3) {
                            i5 = i3;
                            break;
                        } else {
                            if (b2 != list.get(i15).read(i7)) {
                                i5 = i15;
                                break;
                            }
                            i15++;
                        }
                    }
                    if (i14 == i5 && i7 + 1 == list.get(i13).MediaBrowserCompatCustomActionResultReceiver()) {
                        resetcurrentselectedposition.write(list2.get(i13).intValue());
                        i6 = i5;
                    } else {
                        resetcurrentselectedposition.write(-((int) (write(resetcurrentselectedposition2) + jWrite)));
                        i6 = i5;
                        write(jWrite, resetcurrentselectedposition2, i7 + 1, list, i13, i5, list2);
                    }
                    i13 = i6;
                }
                resetcurrentselectedposition.write((setLockedFromSeek) resetcurrentselectedposition2);
                return;
            }
            int iMin = Math.min(getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver(), getrelatedmoduleadapter2.MediaBrowserCompatCustomActionResultReceiver());
            int i16 = 0;
            for (int i17 = i7; i17 < iMin && getrelatedmoduleadapter.read(i17) == getrelatedmoduleadapter2.read(i17); i17++) {
                i16++;
            }
            long jWrite2 = 1 + j + write(resetcurrentselectedposition) + 2 + ((long) i16);
            resetcurrentselectedposition.write(-i16);
            resetcurrentselectedposition.write(iIntValue);
            int i18 = i7 + i16;
            while (i7 < i18) {
                resetcurrentselectedposition.write(getrelatedmoduleadapter.read(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i18 != list.get(i4).MediaBrowserCompatCustomActionResultReceiver()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                resetcurrentselectedposition.write(list2.get(i4).intValue());
            } else {
                resetCurrentSelectedPosition resetcurrentselectedposition3 = new resetCurrentSelectedPosition();
                resetcurrentselectedposition.write(-((int) (write(resetcurrentselectedposition3) + jWrite2)));
                write(jWrite2, resetcurrentselectedposition3, i18, list, i4, i3, list2);
                resetcurrentselectedposition.write((setLockedFromSeek) resetcurrentselectedposition3);
            }
        }

        private static long write(resetCurrentSelectedPosition resetcurrentselectedposition) {
            return resetcurrentselectedposition.getSize() / 4;
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static int AudioAttributesCompatParcelizer() {
            int i = write;
            int i2 = i % 8476289;
            write = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            AudioAttributesCompatParcelizer = iElapsedRealtime;
            return iElapsedRealtime;
        }
    }

    public /* synthetic */ Options(getRelatedModuleAdapter[] getrelatedmoduleadapterArr, int[] iArr, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getrelatedmoduleadapterArr, iArr);
    }

    @getMagicModuleMeta
    public static final Options IconCompatParcelizer(getRelatedModuleAdapter... getrelatedmoduleadapterArr) {
        return IconCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedmoduleadapterArr);
    }
}
