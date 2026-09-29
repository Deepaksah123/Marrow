package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\rJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u000b\u0010\u0016J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0015J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0018J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0018"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda41;", "", "<init>", "()V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "p0", "p1", "", "AudioAttributesCompatParcelizer", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;)V", "", "read", "([Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "p2", "RemoteActionCompatParcelizer", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "", "", "([Ljava/lang/String;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "write", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;)V", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;I)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "IconCompatParcelizer", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda41 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda41 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda41();

    private DefaultAnalyticsCollectorExternalSyntheticLambda41() {
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0, DefaultAnalyticsCollectorExternalSyntheticLambda4 p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(1);
            int iAudioAttributesCompatParcelizer3 = p0.AudioAttributesCompatParcelizer(2);
            float[] read = p0.getRead();
            float[] read2 = p1.getRead();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                for (int i2 = 0; i2 < iAudioAttributesCompatParcelizer2; i2++) {
                    for (int i3 = 0; i3 < iAudioAttributesCompatParcelizer3; i3++) {
                        int i4 = (i * iAudioAttributesCompatParcelizer2 * iAudioAttributesCompatParcelizer3) + (i2 * iAudioAttributesCompatParcelizer3) + i3;
                        read[i4] = read[i4] + read2[i3];
                    }
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
        }
    }

    @getMagicModuleMeta
    private static DefaultAnalyticsCollectorExternalSyntheticLambda4 write(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0, DefaultAnalyticsCollectorExternalSyntheticLambda4 p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p1.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer3 = p1.AudioAttributesCompatParcelizer(1);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(new int[]{iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer3});
            float[] read = p0.getRead();
            float[] read2 = p1.getRead();
            float[] read3 = defaultAnalyticsCollectorExternalSyntheticLambda4.getRead();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                for (int i2 = 0; i2 < iAudioAttributesCompatParcelizer3; i2++) {
                    int i3 = (i * iAudioAttributesCompatParcelizer3) + i2;
                    read3[i3] = 0.0f;
                    for (int i4 = 0; i4 < iAudioAttributesCompatParcelizer2; i4++) {
                        read3[i3] = read3[i3] + (read[(i * iAudioAttributesCompatParcelizer2) + i4] * read2[(i4 * iAudioAttributesCompatParcelizer3) + i2]);
                    }
                }
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda4;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            float[] read = p0.getRead();
            int length = read.length;
            for (int i = 0; i < length; i++) {
                if (read[i] < BitmapDescriptorFactory.HUE_RED) {
                    read[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
        }
    }

    @getMagicModuleMeta
    public static final void write(DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(defaultAnalyticsCollectorExternalSyntheticLambda4, "");
            if (1 >= defaultAnalyticsCollectorExternalSyntheticLambda4.AudioAttributesCompatParcelizer()) {
                return;
            }
            int iAudioAttributesCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = 1;
            for (int i = 1; i < iAudioAttributesCompatParcelizer; i++) {
                iAudioAttributesCompatParcelizer2 *= defaultAnalyticsCollectorExternalSyntheticLambda4.AudioAttributesCompatParcelizer(i);
            }
            int[] iArr = new int[2];
            for (int i2 = 0; i2 <= 0; i2++) {
                iArr[i2] = defaultAnalyticsCollectorExternalSyntheticLambda4.AudioAttributesCompatParcelizer(i2);
            }
            iArr[1] = iAudioAttributesCompatParcelizer2;
            defaultAnalyticsCollectorExternalSyntheticLambda4.IconCompatParcelizer(iArr);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda4 read(DefaultAnalyticsCollectorExternalSyntheticLambda4[] p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iAudioAttributesCompatParcelizer = p0[0].AudioAttributesCompatParcelizer(0);
            int length = p0.length;
            int iAudioAttributesCompatParcelizer2 = 0;
            for (int i = 0; i < 4; i++) {
                iAudioAttributesCompatParcelizer2 += p0[i].AudioAttributesCompatParcelizer(1);
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(new int[]{iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2});
            float[] read = defaultAnalyticsCollectorExternalSyntheticLambda4.getRead();
            for (int i2 = 0; i2 < iAudioAttributesCompatParcelizer; i2++) {
                int i3 = i2 * iAudioAttributesCompatParcelizer2;
                int length2 = p0.length;
                for (int i4 = 0; i4 < 4; i4++) {
                    float[] read2 = p0[i4].getRead();
                    int iAudioAttributesCompatParcelizer3 = p0[i4].AudioAttributesCompatParcelizer(1);
                    System.arraycopy(read2, i2 * iAudioAttributesCompatParcelizer3, read, i3, iAudioAttributesCompatParcelizer3);
                    i3 += iAudioAttributesCompatParcelizer3;
                }
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda4;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(1);
            float[] read = p0.getRead();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                int i2 = i * iAudioAttributesCompatParcelizer2;
                int i3 = i2 + iAudioAttributesCompatParcelizer2;
                float f = Float.MIN_VALUE;
                for (int i4 = i2; i4 < i3; i4++) {
                    float f2 = read[i4];
                    if (f2 > f) {
                        f = f2;
                    }
                }
                float f3 = BitmapDescriptorFactory.HUE_RED;
                for (int i5 = i2; i5 < i3; i5++) {
                    float fExp = (float) Math.exp(read[i5] - f);
                    read[i5] = fExp;
                    f3 += fExp;
                }
                while (i2 < i3) {
                    read[i2] = read[i2] / f3;
                    i2++;
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda4 RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0, DefaultAnalyticsCollectorExternalSyntheticLambda4 p1, DefaultAnalyticsCollectorExternalSyntheticLambda4 p2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p2.AudioAttributesCompatParcelizer(0);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4Write = write(p0, p1);
            float[] read = p2.getRead();
            float[] read2 = defaultAnalyticsCollectorExternalSyntheticLambda4Write.getRead();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                for (int i2 = 0; i2 < iAudioAttributesCompatParcelizer2; i2++) {
                    int i3 = (i * iAudioAttributesCompatParcelizer2) + i2;
                    read2[i3] = read2[i3] + read[i2];
                }
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda4Write;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda4 RemoteActionCompatParcelizer(String[] strArr, DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(strArr, "");
            toMagicModuleMetaRepoModel.write(defaultAnalyticsCollectorExternalSyntheticLambda4, "");
            int length = strArr.length;
            int iAudioAttributesCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda4.AudioAttributesCompatParcelizer(1);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda42 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(new int[]{length, 128, iAudioAttributesCompatParcelizer});
            float[] read = defaultAnalyticsCollectorExternalSyntheticLambda42.getRead();
            float[] read2 = defaultAnalyticsCollectorExternalSyntheticLambda4.getRead();
            for (int i = 0; i < length; i++) {
                int[] iArrRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda44.INSTANCE.RemoteActionCompatParcelizer(strArr[i], 128);
                for (int i2 = 0; i2 < 128; i2++) {
                    System.arraycopy(read2, iArrRemoteActionCompatParcelizer[i2] * iAudioAttributesCompatParcelizer, read, ((iAudioAttributesCompatParcelizer << 7) * i) + (iAudioAttributesCompatParcelizer * i2), iAudioAttributesCompatParcelizer);
                }
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda42;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda4 read(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(1);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(new int[]{iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer});
            float[] read = p0.getRead();
            float[] read2 = defaultAnalyticsCollectorExternalSyntheticLambda4.getRead();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                for (int i2 = 0; i2 < iAudioAttributesCompatParcelizer2; i2++) {
                    read2[(i2 * iAudioAttributesCompatParcelizer) + i] = read[(i * iAudioAttributesCompatParcelizer2) + i2];
                }
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda4;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda4 AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(1);
            int iAudioAttributesCompatParcelizer3 = p0.AudioAttributesCompatParcelizer(2);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(new int[]{iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer});
            float[] read = p0.getRead();
            float[] read2 = defaultAnalyticsCollectorExternalSyntheticLambda4.getRead();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                for (int i2 = 0; i2 < iAudioAttributesCompatParcelizer2; i2++) {
                    for (int i3 = 0; i3 < iAudioAttributesCompatParcelizer3; i3++) {
                        read2[(i3 * iAudioAttributesCompatParcelizer * iAudioAttributesCompatParcelizer2) + (i2 * iAudioAttributesCompatParcelizer) + i] = read[(i * iAudioAttributesCompatParcelizer2 * iAudioAttributesCompatParcelizer3) + (i2 * iAudioAttributesCompatParcelizer3) + i3];
                    }
                }
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda4;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda4 read(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0, DefaultAnalyticsCollectorExternalSyntheticLambda4 p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            int i = 0;
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(1);
            int iAudioAttributesCompatParcelizer3 = p0.AudioAttributesCompatParcelizer(2);
            int iAudioAttributesCompatParcelizer4 = p1.AudioAttributesCompatParcelizer(0);
            int i2 = (iAudioAttributesCompatParcelizer2 - iAudioAttributesCompatParcelizer4) + 1;
            int iAudioAttributesCompatParcelizer5 = p1.AudioAttributesCompatParcelizer(2);
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(new int[]{iAudioAttributesCompatParcelizer, i2, iAudioAttributesCompatParcelizer5});
            float[] read = p0.getRead();
            float[] read2 = defaultAnalyticsCollectorExternalSyntheticLambda4.getRead();
            float[] read3 = p1.getRead();
            int i3 = 0;
            while (i3 < iAudioAttributesCompatParcelizer) {
                int i4 = i;
                while (i4 < iAudioAttributesCompatParcelizer5) {
                    int i5 = i;
                    while (i5 < i2) {
                        float f = BitmapDescriptorFactory.HUE_RED;
                        while (i < iAudioAttributesCompatParcelizer4) {
                            for (int i6 = 0; i6 < iAudioAttributesCompatParcelizer3; i6++) {
                                f += read[(iAudioAttributesCompatParcelizer2 * iAudioAttributesCompatParcelizer3 * i3) + ((i + i5) * iAudioAttributesCompatParcelizer3) + i6] * read3[(((i * iAudioAttributesCompatParcelizer3) + i6) * iAudioAttributesCompatParcelizer5) + i4];
                            }
                            i++;
                        }
                        read2[(i2 * iAudioAttributesCompatParcelizer5 * i3) + (i5 * iAudioAttributesCompatParcelizer5) + i4] = f;
                        i5++;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda4;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda4 read(DefaultAnalyticsCollectorExternalSyntheticLambda4 p0, int p1) {
        int i = p1;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda41.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            int i2 = 0;
            int iAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(0);
            int iAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(1);
            int iAudioAttributesCompatParcelizer3 = p0.AudioAttributesCompatParcelizer(2);
            int i3 = (iAudioAttributesCompatParcelizer2 - i) + 1;
            DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(new int[]{iAudioAttributesCompatParcelizer, i3, iAudioAttributesCompatParcelizer3});
            float[] read = p0.getRead();
            float[] read2 = defaultAnalyticsCollectorExternalSyntheticLambda4.getRead();
            int i4 = 0;
            while (i4 < iAudioAttributesCompatParcelizer) {
                int i5 = i2;
                while (i5 < iAudioAttributesCompatParcelizer3) {
                    int i6 = i2;
                    while (i6 < i3) {
                        int i7 = i6 * iAudioAttributesCompatParcelizer3;
                        int i8 = (i4 * i3 * iAudioAttributesCompatParcelizer3) + i7 + i5;
                        read2[i8] = Float.MIN_VALUE;
                        while (i2 < i) {
                            read2[i8] = Math.max(read2[i8], read[(i4 * iAudioAttributesCompatParcelizer2 * iAudioAttributesCompatParcelizer3) + i7 + i5 + (i2 * iAudioAttributesCompatParcelizer3)]);
                            i2++;
                            i = p1;
                        }
                        i6++;
                        i = p1;
                        i2 = 0;
                    }
                    i5++;
                    i = p1;
                    i2 = 0;
                }
                i4++;
                i = p1;
                i2 = 0;
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda4;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda41.class);
            return null;
        }
    }
}
