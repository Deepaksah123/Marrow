package kotlin;

import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
public final class constructUsingIndex extends _isIntType {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer() { // from class: o.getRawEnums
        @Override // o.constructUsingIndex.RemoteActionCompatParcelizer
        public final boolean write(int i, int i2, int i3, int i4, int i5) {
            return constructUsingIndex.AudioAttributesCompatParcelizer();
        }
    };
    private final RemoteActionCompatParcelizer write;

    public interface RemoteActionCompatParcelizer {
        boolean write(int i, int i2, int i3, int i4, int i5);
    }

    static /* synthetic */ boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    private static int IconCompatParcelizer(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public constructUsingIndex() {
        this(null);
    }

    public constructUsingIndex(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.write = remoteActionCompatParcelizer;
    }

    @Override // kotlin._isIntType
    public final androidx.media3.common.Metadata AudioAttributesCompatParcelizer(_enumDefault _enumdefault, ByteBuffer byteBuffer) {
        return write(byteBuffer.array(), byteBuffer.limit());
    }

    public final androidx.media3.common.Metadata write(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(bArr, i);
        IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
        if (iconCompatParcelizerAudioAttributesCompatParcelizer == null) {
            return null;
        }
        int iWrite = asPropertyTypeDeserializer.write();
        int i2 = iconCompatParcelizerAudioAttributesCompatParcelizer.write == 2 ? 6 : 10;
        int iAudioAttributesImplApi26Parcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        if (iconCompatParcelizerAudioAttributesCompatParcelizer.read) {
            iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(asPropertyTypeDeserializer, iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        }
        asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(iWrite + iAudioAttributesImplApi26Parcelizer);
        boolean z = false;
        if (!RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iconCompatParcelizerAudioAttributesCompatParcelizer.write, i2, false)) {
            if (iconCompatParcelizerAudioAttributesCompatParcelizer.write != 4 || !RemoteActionCompatParcelizer(asPropertyTypeDeserializer, 4, i2, true)) {
                StringBuilder sb = new StringBuilder("Failed to validate ID3 tag with majorVersion=");
                sb.append(iconCompatParcelizerAudioAttributesCompatParcelizer.write);
                prune.RemoteActionCompatParcelizer("Id3Decoder", sb.toString());
                return null;
            }
            z = true;
        }
        while (asPropertyTypeDeserializer.IconCompatParcelizer() >= i2) {
            Id3Frame id3FrameIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer.write, asPropertyTypeDeserializer, z, i2, this.write);
            if (id3FrameIconCompatParcelizer != null) {
                arrayList.add(id3FrameIconCompatParcelizer);
            }
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    private static IconCompatParcelizer AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() < 10) {
            prune.RemoteActionCompatParcelizer("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iOnPause = asPropertyTypeDeserializer.onPause();
        if (iOnPause != 4801587) {
            StringBuilder sb = new StringBuilder("Unexpected first three bytes of ID3 tag header: 0x");
            sb.append(String.format("%06X", Integer.valueOf(iOnPause)));
            prune.RemoteActionCompatParcelizer("Id3Decoder", sb.toString());
            return null;
        }
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
        int iOnPlay = asPropertyTypeDeserializer.onPlay();
        if (iOnPlayFromMediaId == 2) {
            if ((iOnPlayFromMediaId2 & 64) != 0) {
                prune.RemoteActionCompatParcelizer("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iOnPlayFromMediaId == 3) {
            if ((iOnPlayFromMediaId2 & 64) != 0) {
                int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iMediaBrowserCompatItemReceiver);
                iOnPlay -= iMediaBrowserCompatItemReceiver + 4;
            }
        } else {
            if (iOnPlayFromMediaId != 4) {
                prune.RemoteActionCompatParcelizer("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(iOnPlayFromMediaId)));
                return null;
            }
            if ((iOnPlayFromMediaId2 & 64) != 0) {
                int iOnPlay2 = asPropertyTypeDeserializer.onPlay();
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iOnPlay2 - 4);
                iOnPlay -= iOnPlay2;
            }
            if ((iOnPlayFromMediaId2 & 16) != 0) {
                iOnPlay -= 10;
            }
        }
        return new IconCompatParcelizer(iOnPlayFromMediaId, iOnPlayFromMediaId < 4 && (iOnPlayFromMediaId2 & 128) != 0, iOnPlay);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[PHI: r3
      0x0089: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:39:0x0086, B:31:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean RemoteActionCompatParcelizer(kotlin.AsPropertyTypeDeserializer r20, int r21, int r22, boolean r23) {
        /*
            r1 = r20
            r0 = r21
            int r2 = r20.write()
        L8:
            int r3 = r20.IconCompatParcelizer()     // Catch: java.lang.Throwable -> Lb1
            r4 = 1
            r5 = r22
            if (r3 < r5) goto Lad
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r20.MediaBrowserCompatItemReceiver()     // Catch: java.lang.Throwable -> Lb1
            long r8 = r20.onMediaButtonEvent()     // Catch: java.lang.Throwable -> Lb1
            int r10 = r20.onPrepare()     // Catch: java.lang.Throwable -> Lb1
            goto L2c
        L22:
            int r7 = r20.onPause()     // Catch: java.lang.Throwable -> Lb1
            int r8 = r20.onPause()     // Catch: java.lang.Throwable -> Lb1
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.MediaBrowserCompatCustomActionResultReceiver(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6d
            if (r23 != 0) goto L6d
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.MediaBrowserCompatCustomActionResultReceiver(r2)
            return r6
        L4b:
            r11 = 24
            long r11 = r8 >> r11
            r13 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r13
            r15 = 21
            long r11 = r11 << r15
            long r15 = r8 & r13
            r17 = 8
            long r17 = r8 >> r17
            long r17 = r17 & r13
            r19 = 7
            long r17 = r17 << r19
            long r15 = r15 | r17
            r17 = 16
            long r8 = r8 >> r17
            long r8 = r8 & r13
            r13 = 14
            long r8 = r8 << r13
            long r8 = r8 | r15
            long r8 = r8 | r11
        L6d:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L75
            r3 = r4
            goto L76
        L75:
            r3 = r6
        L76:
            r7 = r10 & 1
            if (r7 == 0) goto L89
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9a
            r1.MediaBrowserCompatCustomActionResultReceiver(r2)
            return r6
        L9a:
            int r3 = r20.IconCompatParcelizer()     // Catch: java.lang.Throwable -> Lb1
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La7
            r1.MediaBrowserCompatCustomActionResultReceiver(r2)
            return r6
        La7:
            int r3 = (int) r8
            r1.AudioAttributesImplBaseParcelizer(r3)     // Catch: java.lang.Throwable -> Lb1
            goto L8
        Lad:
            r1.MediaBrowserCompatCustomActionResultReceiver(r2)
            return r4
        Lb1:
            r0 = move-exception
            r1.MediaBrowserCompatCustomActionResultReceiver(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.constructUsingIndex.RemoteActionCompatParcelizer(o.AsPropertyTypeDeserializer, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7 A[Catch: all -> 0x0128, Exception | OutOfMemoryError -> 0x012b, TRY_LEAVE, TryCatch #2 {Exception | OutOfMemoryError -> 0x012b, all -> 0x0128, blocks: (B:90:0x0116, B:92:0x011e, B:103:0x013a, B:105:0x0142, B:113:0x015c, B:122:0x0174, B:133:0x018f, B:140:0x01a1, B:146:0x01b0, B:151:0x01c8, B:157:0x01e2, B:158:0x01e7), top: B:168:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.media3.extractor.metadata.id3.Id3Frame IconCompatParcelizer(int r20, kotlin.AsPropertyTypeDeserializer r21, boolean r22, int r23, o.constructUsingIndex.RemoteActionCompatParcelizer r24) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.constructUsingIndex.IconCompatParcelizer(int, o.AsPropertyTypeDeserializer, boolean, int, o.constructUsingIndex$RemoteActionCompatParcelizer):androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    private static TextInformationFrame IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        if (i <= 0) {
            return null;
        }
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        asPropertyTypeDeserializer.write(bArr, 0, i2);
        int i3 = read(bArr, 0, iOnPlayFromMediaId);
        return new TextInformationFrame("TXXX", new String(bArr, 0, i3, write(iOnPlayFromMediaId)), AudioAttributesCompatParcelizer(bArr, iOnPlayFromMediaId, i3 + IconCompatParcelizer(iOnPlayFromMediaId)));
    }

    private static TextInformationFrame read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, String str) {
        if (i <= 0) {
            return null;
        }
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        asPropertyTypeDeserializer.write(bArr, 0, i2);
        return new TextInformationFrame(str, null, AudioAttributesCompatParcelizer(bArr, iOnPlayFromMediaId, 0));
    }

    private static initExtraTracks<String> AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return initExtraTracks.read("");
        }
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        int i3 = read(bArr, i2, i);
        while (i2 < i3) {
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new String(bArr, i2, i3 - i2, write(i)));
            i2 = IconCompatParcelizer(i) + i3;
            i3 = read(bArr, i2, i);
        }
        initExtraTracks<String> initextratracksIconCompatParcelizer = iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        return initextratracksIconCompatParcelizer.isEmpty() ? initExtraTracks.read("") : initextratracksIconCompatParcelizer;
    }

    private static UrlLinkFrame AudioAttributesImplBaseParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        if (i <= 0) {
            return null;
        }
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        asPropertyTypeDeserializer.write(bArr, 0, i2);
        int i3 = read(bArr, 0, iOnPlayFromMediaId);
        String str = new String(bArr, 0, i3, write(iOnPlayFromMediaId));
        int iIconCompatParcelizer = i3 + IconCompatParcelizer(iOnPlayFromMediaId);
        return new UrlLinkFrame("WXXX", str, RemoteActionCompatParcelizer(bArr, iIconCompatParcelizer, IconCompatParcelizer(bArr, iIconCompatParcelizer), parseMdtaFromMeta.AudioAttributesCompatParcelizer));
    }

    private static UrlLinkFrame write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, String str) {
        byte[] bArr = new byte[i];
        asPropertyTypeDeserializer.write(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, IconCompatParcelizer(bArr, 0), parseMdtaFromMeta.AudioAttributesCompatParcelizer));
    }

    private static PrivFrame RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        byte[] bArr = new byte[i];
        asPropertyTypeDeserializer.write(bArr, 0, i);
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIconCompatParcelizer, parseMdtaFromMeta.AudioAttributesCompatParcelizer), write(bArr, iIconCompatParcelizer + 1, i));
    }

    private static GeobFrame read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        Charset charsetWrite = write(iOnPlayFromMediaId);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        asPropertyTypeDeserializer.write(bArr, 0, i2);
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, 0);
        String strMediaMetadataCompat = DefaultBaseTypeLimitingValidator.MediaMetadataCompat(new String(bArr, 0, iIconCompatParcelizer, parseMdtaFromMeta.AudioAttributesCompatParcelizer));
        int i3 = iIconCompatParcelizer + 1;
        int i4 = read(bArr, i3, iOnPlayFromMediaId);
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i3, i4, charsetWrite);
        int iIconCompatParcelizer2 = i4 + IconCompatParcelizer(iOnPlayFromMediaId);
        int i5 = read(bArr, iIconCompatParcelizer2, iOnPlayFromMediaId);
        return new GeobFrame(strMediaMetadataCompat, strRemoteActionCompatParcelizer, RemoteActionCompatParcelizer(bArr, iIconCompatParcelizer2, i5, charsetWrite), write(bArr, i5 + IconCompatParcelizer(iOnPlayFromMediaId), i2));
    }

    private static ApicFrame AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
        int iIconCompatParcelizer;
        String strConcat;
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        Charset charsetWrite = write(iOnPlayFromMediaId);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        asPropertyTypeDeserializer.write(bArr, 0, i3);
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder("image/");
            sb.append(parseMdhd.read(new String(bArr, 0, 3, parseMdtaFromMeta.AudioAttributesCompatParcelizer)));
            strConcat = sb.toString();
            if ("image/jpg".equals(strConcat)) {
                strConcat = MimeTypes.IMAGE_JPEG;
            }
            iIconCompatParcelizer = 2;
        } else {
            iIconCompatParcelizer = IconCompatParcelizer(bArr, 0);
            String str = parseMdhd.read(new String(bArr, 0, iIconCompatParcelizer, parseMdtaFromMeta.AudioAttributesCompatParcelizer));
            strConcat = str.indexOf(47) == -1 ? "image/".concat(String.valueOf(str)) : str;
        }
        byte b = bArr[iIconCompatParcelizer + 1];
        int i4 = iIconCompatParcelizer + 2;
        int i5 = read(bArr, i4, iOnPlayFromMediaId);
        return new ApicFrame(strConcat, new String(bArr, i4, i5 - i4, charsetWrite), b & 255, write(bArr, i5 + IconCompatParcelizer(iOnPlayFromMediaId), i3));
    }

    private static CommentFrame write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        if (i < 4) {
            return null;
        }
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        Charset charsetWrite = write(iOnPlayFromMediaId);
        byte[] bArr = new byte[3];
        asPropertyTypeDeserializer.write(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        asPropertyTypeDeserializer.write(bArr2, 0, i2);
        int i3 = read(bArr2, 0, iOnPlayFromMediaId);
        String str2 = new String(bArr2, 0, i3, charsetWrite);
        int iIconCompatParcelizer = i3 + IconCompatParcelizer(iOnPlayFromMediaId);
        return new CommentFrame(str, str2, RemoteActionCompatParcelizer(bArr2, iIconCompatParcelizer, read(bArr2, iIconCompatParcelizer, iOnPlayFromMediaId), charsetWrite));
    }

    private static ChapterFrame AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2, boolean z, int i3, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int iWrite = asPropertyTypeDeserializer.write();
        int iIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite);
        String str = new String(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite, iIconCompatParcelizer - iWrite, parseMdtaFromMeta.AudioAttributesCompatParcelizer);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer + 1);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        long jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
        long j = -1;
        long j2 = jOnMediaButtonEvent == ((((long) 0) << 32) | (j - ((j >> 63) << 32))) ? -1L : jOnMediaButtonEvent;
        long jOnMediaButtonEvent2 = asPropertyTypeDeserializer.onMediaButtonEvent();
        long j3 = j2;
        long j4 = -1;
        long j5 = jOnMediaButtonEvent2 == ((j4 - ((j4 >> 63) << 32)) | (((long) 0) << 32)) ? -1L : jOnMediaButtonEvent2;
        ArrayList arrayList = new ArrayList();
        while (asPropertyTypeDeserializer.write() < iWrite + i) {
            Id3Frame id3FrameIconCompatParcelizer = IconCompatParcelizer(i2, asPropertyTypeDeserializer, z, i3, remoteActionCompatParcelizer);
            if (id3FrameIconCompatParcelizer != null) {
                arrayList.add(id3FrameIconCompatParcelizer);
            }
        }
        return new ChapterFrame(str, iMediaBrowserCompatItemReceiver, iMediaBrowserCompatItemReceiver2, j3, j5, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2, boolean z, int i3, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int iWrite = asPropertyTypeDeserializer.write();
        int iIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite);
        String str = new String(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite, iIconCompatParcelizer - iWrite, parseMdtaFromMeta.AudioAttributesCompatParcelizer);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer + 1);
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        boolean z2 = (iOnPlayFromMediaId & 2) != 0;
        boolean z3 = (iOnPlayFromMediaId & 1) != 0;
        int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
        String[] strArr = new String[iOnPlayFromMediaId2];
        for (int i4 = 0; i4 < iOnPlayFromMediaId2; i4++) {
            int iWrite2 = asPropertyTypeDeserializer.write();
            int iIconCompatParcelizer2 = IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite2);
            strArr[i4] = new String(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite2, iIconCompatParcelizer2 - iWrite2, parseMdtaFromMeta.AudioAttributesCompatParcelizer);
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        while (asPropertyTypeDeserializer.write() < iWrite + i) {
            Id3Frame id3FrameIconCompatParcelizer = IconCompatParcelizer(i2, asPropertyTypeDeserializer, z, i3, remoteActionCompatParcelizer);
            if (id3FrameIconCompatParcelizer != null) {
                arrayList.add(id3FrameIconCompatParcelizer);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static MlltFrame AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int iOnPause = asPropertyTypeDeserializer.onPause();
        int iOnPause2 = asPropertyTypeDeserializer.onPause();
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer();
        asExternalTypeSerializer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
        int i2 = ((i - 10) << 3) / (iOnPlayFromMediaId + iOnPlayFromMediaId2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(iOnPlayFromMediaId);
            int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(iOnPlayFromMediaId2);
            iArr[i3] = iIconCompatParcelizer;
            iArr2[i3] = iIconCompatParcelizer2;
        }
        return new MlltFrame(iOnPrepare, iOnPause, iOnPause2, iArr, iArr2);
    }

    private static BinaryFrame RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, String str) {
        byte[] bArr = new byte[i];
        asPropertyTypeDeserializer.write(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static int AudioAttributesImplApi26Parcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        int iWrite = asPropertyTypeDeserializer.write();
        int i2 = iWrite;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iWrite + i) {
                return i;
            }
            if ((bArrRemoteActionCompatParcelizer[i2] & 255) == 255 && bArrRemoteActionCompatParcelizer[i3] == 0) {
                System.arraycopy(bArrRemoteActionCompatParcelizer, i2 + 2, bArrRemoteActionCompatParcelizer, i3, (i - (i2 - iWrite)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static Charset write(int i) {
        if (i == 1) {
            return parseMdtaFromMeta.write;
        }
        if (i == 2) {
            return parseMdtaFromMeta.IconCompatParcelizer;
        }
        if (i == 3) {
            return parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer;
        }
        return parseMdtaFromMeta.AudioAttributesCompatParcelizer;
    }

    private static String write(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int read(byte[] bArr, int i, int i2) {
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iIconCompatParcelizer;
        }
        while (iIconCompatParcelizer < bArr.length - 1) {
            if ((iIconCompatParcelizer - i) % 2 == 0 && bArr[iIconCompatParcelizer + 1] == 0) {
                return iIconCompatParcelizer;
            }
            iIconCompatParcelizer = IconCompatParcelizer(bArr, iIconCompatParcelizer + 1);
        }
        return bArr.length;
    }

    private static int IconCompatParcelizer(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static byte[] write(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, charset);
    }

    static final class IconCompatParcelizer {
        private final int RemoteActionCompatParcelizer;
        private final boolean read;
        private final int write;

        public IconCompatParcelizer(int i, boolean z, int i2) {
            this.write = i;
            this.read = z;
            this.RemoteActionCompatParcelizer = i2;
        }
    }
}
