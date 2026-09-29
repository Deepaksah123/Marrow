package kotlin;

import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import kotlin.C0170format;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class isJava8TimeClass {
    private static final int[] AudioAttributesCompatParcelizer = {1, 2, 3, 6};
    private static final int[] write = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] IconCompatParcelizer = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] RemoteActionCompatParcelizer = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] read = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 576, 640};
    private static final int[] MediaBrowserCompatCustomActionResultReceiver = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class RemoteActionCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final String IconCompatParcelizer;
        public final int MediaBrowserCompatItemReceiver;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        /* synthetic */ RemoteActionCompatParcelizer(String str, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
            this(str, i, i2, i3, i4, i5, i6);
        }

        private RemoteActionCompatParcelizer(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.IconCompatParcelizer = str;
            this.AudioAttributesImplApi26Parcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
            this.MediaBrowserCompatItemReceiver = i3;
            this.read = i4;
            this.AudioAttributesCompatParcelizer = i5;
            this.write = i6;
        }
    }

    public static C0170format IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, String str, String str2, DrmInitData drmInitData) {
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer();
        asExternalTypeSerializer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
        int i = write[asExternalTypeSerializer.IconCompatParcelizer(2)];
        asExternalTypeSerializer.write(8);
        int i2 = RemoteActionCompatParcelizer[asExternalTypeSerializer.IconCompatParcelizer(3)];
        if (asExternalTypeSerializer.IconCompatParcelizer(1) != 0) {
            i2++;
        }
        int i3 = read[asExternalTypeSerializer.IconCompatParcelizer(5)] * 1000;
        asExternalTypeSerializer.write();
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(asExternalTypeSerializer.RemoteActionCompatParcelizer());
        return new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str).AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_AC3).read(i2).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i).AudioAttributesCompatParcelizer(drmInitData).read(str2).write(i3).MediaDescriptionCompat(i3).IconCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.C0170format AudioAttributesCompatParcelizer(kotlin.AsPropertyTypeDeserializer r7, java.lang.String r8, java.lang.String r9, androidx.media3.common.DrmInitData r10) {
        /*
            o.AsExternalTypeSerializer r0 = new o.AsExternalTypeSerializer
            r0.<init>()
            r0.AudioAttributesCompatParcelizer(r7)
            r1 = 13
            int r1 = r0.IconCompatParcelizer(r1)
            r2 = 3
            r0.write(r2)
            r3 = 2
            int r3 = r0.IconCompatParcelizer(r3)
            int[] r4 = kotlin.isJava8TimeClass.write
            r3 = r4[r3]
            r4 = 10
            r0.write(r4)
            int[] r4 = kotlin.isJava8TimeClass.RemoteActionCompatParcelizer
            int r5 = r0.IconCompatParcelizer(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.IconCompatParcelizer(r5)
            if (r6 == 0) goto L31
            int r4 = r4 + 1
        L31:
            r0.write(r2)
            r2 = 4
            int r2 = r0.IconCompatParcelizer(r2)
            r0.write(r5)
            if (r2 <= 0) goto L4d
            r2 = 6
            r0.write(r2)
            int r2 = r0.IconCompatParcelizer(r5)
            if (r2 == 0) goto L4a
            int r4 = r4 + 2
        L4a:
            r0.write(r5)
        L4d:
            int r2 = r0.IconCompatParcelizer()
            r6 = 7
            if (r2 <= r6) goto L60
            r0.write(r6)
            int r2 = r0.IconCompatParcelizer(r5)
            if (r2 == 0) goto L60
            java.lang.String r2 = "audio/eac3-joc"
            goto L62
        L60:
            java.lang.String r2 = "audio/eac3"
        L62:
            r0.write()
            int r0 = r0.RemoteActionCompatParcelizer()
            r7.MediaBrowserCompatCustomActionResultReceiver(r0)
            o.format$RemoteActionCompatParcelizer r7 = new o.format$RemoteActionCompatParcelizer
            r7.<init>()
            o.format$RemoteActionCompatParcelizer r7 = r7.AudioAttributesCompatParcelizer(r8)
            o.format$RemoteActionCompatParcelizer r7 = r7.AudioAttributesImplApi26Parcelizer(r2)
            o.format$RemoteActionCompatParcelizer r7 = r7.read(r4)
            o.format$RemoteActionCompatParcelizer r7 = r7.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(r3)
            o.format$RemoteActionCompatParcelizer r7 = r7.AudioAttributesCompatParcelizer(r10)
            o.format$RemoteActionCompatParcelizer r7 = r7.read(r9)
            int r1 = r1 * 1000
            o.format$RemoteActionCompatParcelizer r7 = r7.MediaDescriptionCompat(r1)
            o.format r7 = r7.IconCompatParcelizer()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isJava8TimeClass.AudioAttributesCompatParcelizer(o.AsPropertyTypeDeserializer, java.lang.String, java.lang.String, androidx.media3.common.DrmInitData):o.format");
    }

    public static RemoteActionCompatParcelizer write(AsExternalTypeSerializer asExternalTypeSerializer) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str2;
        int iAudioAttributesCompatParcelizer = asExternalTypeSerializer.AudioAttributesCompatParcelizer();
        asExternalTypeSerializer.write(40);
        boolean z = asExternalTypeSerializer.IconCompatParcelizer(5) > 10;
        asExternalTypeSerializer.read(iAudioAttributesCompatParcelizer);
        int i10 = -1;
        if (z) {
            asExternalTypeSerializer.write(16);
            int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(2);
            if (iIconCompatParcelizer == 0) {
                i10 = 0;
            } else if (iIconCompatParcelizer == 1) {
                i10 = 1;
            } else if (iIconCompatParcelizer == 2) {
                i10 = 2;
            }
            asExternalTypeSerializer.write(3);
            int iIconCompatParcelizer2 = (asExternalTypeSerializer.IconCompatParcelizer(11) + 1) << 1;
            int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(2);
            if (iIconCompatParcelizer3 == 3) {
                i8 = IconCompatParcelizer[asExternalTypeSerializer.IconCompatParcelizer(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(2);
                int i11 = AudioAttributesCompatParcelizer[iIconCompatParcelizer4];
                i7 = iIconCompatParcelizer4;
                i8 = write[iIconCompatParcelizer3];
                i9 = i11;
            }
            int i12 = i9 << 8;
            int i13 = read(iIconCompatParcelizer2, i8, i9);
            int iIconCompatParcelizer5 = asExternalTypeSerializer.IconCompatParcelizer(3);
            boolean z2 = asExternalTypeSerializer.read();
            i = RemoteActionCompatParcelizer[iIconCompatParcelizer5] + (z2 ? 1 : 0);
            asExternalTypeSerializer.write(10);
            if (asExternalTypeSerializer.read()) {
                asExternalTypeSerializer.write(8);
            }
            if (iIconCompatParcelizer5 == 0) {
                asExternalTypeSerializer.write(5);
                if (asExternalTypeSerializer.read()) {
                    asExternalTypeSerializer.write(8);
                }
            }
            if (i10 == 1 && asExternalTypeSerializer.read()) {
                asExternalTypeSerializer.write(16);
            }
            if (asExternalTypeSerializer.read()) {
                if (iIconCompatParcelizer5 > 2) {
                    asExternalTypeSerializer.write(2);
                }
                if ((iIconCompatParcelizer5 & 1) != 0 && iIconCompatParcelizer5 > 2) {
                    asExternalTypeSerializer.write(6);
                }
                if ((iIconCompatParcelizer5 & 4) != 0) {
                    asExternalTypeSerializer.write(6);
                }
                if (z2 && asExternalTypeSerializer.read()) {
                    asExternalTypeSerializer.write(5);
                }
                if (i10 == 0) {
                    if (asExternalTypeSerializer.read()) {
                        asExternalTypeSerializer.write(6);
                    }
                    if (iIconCompatParcelizer5 == 0 && asExternalTypeSerializer.read()) {
                        asExternalTypeSerializer.write(6);
                    }
                    if (asExternalTypeSerializer.read()) {
                        asExternalTypeSerializer.write(6);
                    }
                    int iIconCompatParcelizer6 = asExternalTypeSerializer.IconCompatParcelizer(2);
                    if (iIconCompatParcelizer6 == 1) {
                        asExternalTypeSerializer.write(5);
                    } else if (iIconCompatParcelizer6 == 2) {
                        asExternalTypeSerializer.write(12);
                    } else if (iIconCompatParcelizer6 == 3) {
                        int iIconCompatParcelizer7 = asExternalTypeSerializer.IconCompatParcelizer(5);
                        if (asExternalTypeSerializer.read()) {
                            asExternalTypeSerializer.write(5);
                            if (asExternalTypeSerializer.read()) {
                                asExternalTypeSerializer.write(4);
                            }
                            if (asExternalTypeSerializer.read()) {
                                asExternalTypeSerializer.write(4);
                            }
                            if (asExternalTypeSerializer.read()) {
                                asExternalTypeSerializer.write(4);
                            }
                            if (asExternalTypeSerializer.read()) {
                                asExternalTypeSerializer.write(4);
                            }
                            if (asExternalTypeSerializer.read()) {
                                asExternalTypeSerializer.write(4);
                            }
                            if (asExternalTypeSerializer.read()) {
                                asExternalTypeSerializer.write(4);
                            }
                            if (asExternalTypeSerializer.read()) {
                                asExternalTypeSerializer.write(4);
                            }
                            if (asExternalTypeSerializer.read()) {
                                if (asExternalTypeSerializer.read()) {
                                    asExternalTypeSerializer.write(4);
                                }
                                if (asExternalTypeSerializer.read()) {
                                    asExternalTypeSerializer.write(4);
                                }
                            }
                        }
                        if (asExternalTypeSerializer.read()) {
                            asExternalTypeSerializer.write(5);
                            if (asExternalTypeSerializer.read()) {
                                asExternalTypeSerializer.write(7);
                                if (asExternalTypeSerializer.read()) {
                                    asExternalTypeSerializer.write(8);
                                }
                            }
                        }
                        asExternalTypeSerializer.write((iIconCompatParcelizer7 + 2) << 3);
                        asExternalTypeSerializer.write();
                    }
                    if (iIconCompatParcelizer5 < 2) {
                        if (asExternalTypeSerializer.read()) {
                            asExternalTypeSerializer.write(14);
                        }
                        if (iIconCompatParcelizer5 == 0 && asExternalTypeSerializer.read()) {
                            asExternalTypeSerializer.write(14);
                        }
                    }
                    if (asExternalTypeSerializer.read()) {
                        if (i7 == 0) {
                            asExternalTypeSerializer.write(5);
                        } else {
                            for (int i14 = 0; i14 < i9; i14++) {
                                if (asExternalTypeSerializer.read()) {
                                    asExternalTypeSerializer.write(5);
                                }
                            }
                        }
                    }
                }
            }
            if (asExternalTypeSerializer.read()) {
                asExternalTypeSerializer.write(5);
                if (iIconCompatParcelizer5 == 2) {
                    asExternalTypeSerializer.write(4);
                }
                if (iIconCompatParcelizer5 >= 6) {
                    asExternalTypeSerializer.write(2);
                }
                if (asExternalTypeSerializer.read()) {
                    asExternalTypeSerializer.write(8);
                }
                if (iIconCompatParcelizer5 == 0 && asExternalTypeSerializer.read()) {
                    asExternalTypeSerializer.write(8);
                }
                if (iIconCompatParcelizer3 < 3) {
                    asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
                }
            }
            if (i10 == 0 && i7 != 3) {
                asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
            }
            if (i10 == 2 && (i7 == 3 || asExternalTypeSerializer.read())) {
                asExternalTypeSerializer.write(6);
            }
            if (asExternalTypeSerializer.read() && asExternalTypeSerializer.IconCompatParcelizer(6) == 1 && asExternalTypeSerializer.IconCompatParcelizer(8) == 1) {
                str2 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str2 = MimeTypes.AUDIO_E_AC3;
            }
            str = str2;
            i3 = i10;
            i4 = iIconCompatParcelizer2;
            i5 = i8;
            i6 = i12;
            i2 = i13;
        } else {
            asExternalTypeSerializer.write(32);
            int iIconCompatParcelizer8 = asExternalTypeSerializer.IconCompatParcelizer(2);
            String str3 = iIconCompatParcelizer8 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iIconCompatParcelizer9 = asExternalTypeSerializer.IconCompatParcelizer(6);
            int i15 = read[iIconCompatParcelizer9 / 2];
            int iIconCompatParcelizer10 = IconCompatParcelizer(iIconCompatParcelizer8, iIconCompatParcelizer9);
            asExternalTypeSerializer.write(8);
            int iIconCompatParcelizer11 = asExternalTypeSerializer.IconCompatParcelizer(3);
            if ((iIconCompatParcelizer11 & 1) != 0 && iIconCompatParcelizer11 != 1) {
                asExternalTypeSerializer.write(2);
            }
            if ((iIconCompatParcelizer11 & 4) != 0) {
                asExternalTypeSerializer.write(2);
            }
            if (iIconCompatParcelizer11 == 2) {
                asExternalTypeSerializer.write(2);
            }
            int[] iArr = write;
            int i16 = iIconCompatParcelizer8 < iArr.length ? iArr[iIconCompatParcelizer8] : -1;
            i = RemoteActionCompatParcelizer[iIconCompatParcelizer11] + (asExternalTypeSerializer.read() ? 1 : 0);
            i2 = i15 * 1000;
            i3 = -1;
            str = str3;
            i4 = iIconCompatParcelizer10;
            i5 = i16;
            i6 = 1536;
        }
        return new RemoteActionCompatParcelizer(str, i3, i, i5, i4, i6, i2, (byte) 0);
    }

    public static int read(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) << 1;
        }
        byte b = bArr[4];
        return IconCompatParcelizer((b & 192) >> 6, b & 63);
    }

    public static int IconCompatParcelizer(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return AudioAttributesCompatParcelizer[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & TarConstants.LF_NORMAL) >> 4 : 3] << 8;
        }
        return 1536;
    }

    public static int write(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        for (int i = iPosition; i <= iLimit - 10; i++) {
            if ((LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static int AudioAttributesCompatParcelizer(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111) {
            return 0;
        }
        byte b = bArr[7];
        if ((b & 254) == 186) {
            return 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static int AudioAttributesCompatParcelizer(ByteBuffer byteBuffer, int i) {
        boolean z = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (z ? 9 : 8)) >> 4) & 7);
    }

    private static int IconCompatParcelizer(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = write;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = MediaBrowserCompatCustomActionResultReceiver;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) << 1;
        }
        int i5 = read[i3];
        return i4 == 32000 ? i5 * 6 : i5 << 2;
    }

    private static int read(int i, int i2, int i3) {
        return (i * i2) / (i3 << 5);
    }
}
