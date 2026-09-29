package kotlin;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class needsReflectionConfiguration {
    private static final int[] write = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static nullOrToString read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return read(closeonfailandthrowasioe, true, false);
    }

    public static nullOrToString read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, boolean z) throws IOException {
        return read(closeonfailandthrowasioe, false, z);
    }

    private static nullOrToString read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, boolean z, boolean z2) throws IOException {
        int i;
        int i2;
        int i3;
        boolean z3;
        int[] iArr;
        long j = closeonfailandthrowasioe.read();
        long j2 = -1;
        long j3 = 4096;
        if (j != -1 && j <= 4096) {
            j3 = j;
        }
        int i4 = (int) j3;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(64);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i4) {
            asPropertyTypeDeserializer.write(8);
            if (!closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), i5, 8, true)) {
                break;
            }
            long jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (jOnMediaButtonEvent == 1) {
                closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 8, 8);
                i2 = 16;
                asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(16);
                jOnMediaButtonEvent = asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler();
            } else {
                if (jOnMediaButtonEvent == 0) {
                    long j4 = closeonfailandthrowasioe.read();
                    if (j4 != j2) {
                        jOnMediaButtonEvent = (j4 - closeonfailandthrowasioe.write()) + 8;
                    }
                }
                i2 = 8;
            }
            long j5 = jOnMediaButtonEvent;
            long j6 = i2;
            if (j5 < j6) {
                return new simpleTransformer(iMediaBrowserCompatItemReceiver, j5, i2);
            }
            i6 += i2;
            if (iMediaBrowserCompatItemReceiver == 1836019574) {
                i4 += (int) j5;
                if (j != -1 && i4 > j) {
                    i4 = (int) j;
                }
            } else {
                if (iMediaBrowserCompatItemReceiver == 1836019558 || iMediaBrowserCompatItemReceiver == 1836475768) {
                    i = 1;
                    break;
                }
                long j7 = j;
                if (iMediaBrowserCompatItemReceiver == 1835295092) {
                    z4 = true;
                }
                if ((((long) i6) + j5) - j6 >= i4) {
                    i = 0;
                    break;
                }
                int i7 = (int) (j5 - j6);
                i6 += i7;
                if (iMediaBrowserCompatItemReceiver != 1718909296) {
                    i3 = 0;
                    if (i7 != 0) {
                        closeonfailandthrowasioe.write(i7);
                    }
                } else {
                    if (i7 < 8) {
                        return new simpleTransformer(iMediaBrowserCompatItemReceiver, i7, 8);
                    }
                    asPropertyTypeDeserializer.write(i7);
                    i3 = 0;
                    closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, i7);
                    int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
                    if (read(iMediaBrowserCompatItemReceiver2, z2)) {
                        z4 = true;
                    }
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
                    int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer() / 4;
                    if (!z4 && iIconCompatParcelizer > 0) {
                        iArr = new int[iIconCompatParcelizer];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= iIconCompatParcelizer) {
                                z3 = z4;
                                break;
                            }
                            int iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
                            iArr[i8] = iMediaBrowserCompatItemReceiver3;
                            if (read(iMediaBrowserCompatItemReceiver3, z2)) {
                                z3 = true;
                                break;
                            }
                            i8++;
                        }
                    } else {
                        z3 = z4;
                        iArr = null;
                    }
                    if (!z3) {
                        return new resetAndStart(iMediaBrowserCompatItemReceiver2, iArr);
                    }
                    z4 = z3;
                }
                i5 = i3;
                j = j7;
            }
            j2 = -1;
        }
        i = i5;
        if (!z4) {
            return Named.IconCompatParcelizer;
        }
        if (z == i) {
            return null;
        }
        if (i != 0) {
            return NameTransformer2.IconCompatParcelizer;
        }
        return NameTransformer2.write;
    }

    private static boolean read(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : write) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
