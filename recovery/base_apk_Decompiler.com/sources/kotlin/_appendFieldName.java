package kotlin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.List;
import kotlin.withTimeZone;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class _appendFieldName implements withTimeZone {
    private Bitmap AudioAttributesCompatParcelizer;
    private final MediaBrowserCompatItemReceiver AudioAttributesImplApi21Parcelizer;
    private final Paint AudioAttributesImplApi26Parcelizer;
    private final IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final Paint MediaBrowserCompatCustomActionResultReceiver;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
    private final Canvas write;
    private static final byte[] read = {0, 7, 8, 15};
    private static final byte[] RemoteActionCompatParcelizer = {0, 119, -120, -1};
    private static final byte[] IconCompatParcelizer = {0, 17, 34, TarConstants.LF_CHR, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    private static int RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    @Override // kotlin.withTimeZone
    public final int IconCompatParcelizer() {
        return 2;
    }

    public _appendFieldName(List<byte[]> list) {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(list.get(0));
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        int iOnPrepare2 = asPropertyTypeDeserializer.onPrepare();
        Paint paint = new Paint();
        this.MediaBrowserCompatCustomActionResultReceiver = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.AudioAttributesImplApi26Parcelizer = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.write = new Canvas();
        this.MediaBrowserCompatItemReceiver = new AudioAttributesCompatParcelizer(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.AudioAttributesImplBaseParcelizer = new IconCompatParcelizer(0, AudioAttributesCompatParcelizer(), write(), read());
        this.AudioAttributesImplApi21Parcelizer = new MediaBrowserCompatItemReceiver(iOnPrepare, iOnPrepare2);
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.write();
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer) {
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(bArr, i2 + i);
        asExternalTypeSerializer.read(i);
        typeSerializer.read(read(asExternalTypeSerializer));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.pad3 read(kotlin.AsExternalTypeSerializer r21) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._appendFieldName.read(o.AsExternalTypeSerializer):o.pad3");
    }

    private static void RemoteActionCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer, MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(8);
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(16);
        int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(16);
        int iRemoteActionCompatParcelizer = asExternalTypeSerializer.RemoteActionCompatParcelizer();
        if ((iIconCompatParcelizer3 << 3) > asExternalTypeSerializer.IconCompatParcelizer()) {
            prune.RemoteActionCompatParcelizer("DvbParser", "Data field length exceeds limit");
            asExternalTypeSerializer.write(asExternalTypeSerializer.IconCompatParcelizer());
            return;
        }
        switch (iIconCompatParcelizer) {
            case 16:
                if (iIconCompatParcelizer2 == mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver) {
                    read readVar = mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer;
                    read readVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asExternalTypeSerializer, iIconCompatParcelizer3);
                    if (readVarAudioAttributesCompatParcelizer.write != 0) {
                        mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer = readVarAudioAttributesCompatParcelizer;
                        mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer.clear();
                        mediaBrowserCompatItemReceiver.IconCompatParcelizer.clear();
                        mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver.clear();
                    } else if (readVar != null && readVar.read != readVarAudioAttributesCompatParcelizer.read) {
                        mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer = readVarAudioAttributesCompatParcelizer;
                    }
                }
                break;
            case 17:
                read readVar2 = mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer;
                if (iIconCompatParcelizer2 == mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver && readVar2 != null) {
                    MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2 = read(asExternalTypeSerializer, iIconCompatParcelizer3);
                    if (readVar2.write == 0 && (mediaBrowserCompatCustomActionResultReceiver = mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer.get(mediaBrowserCompatCustomActionResultReceiver2.RemoteActionCompatParcelizer)) != null) {
                        mediaBrowserCompatCustomActionResultReceiver2.read(mediaBrowserCompatCustomActionResultReceiver);
                    }
                    mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer.put(mediaBrowserCompatCustomActionResultReceiver2.RemoteActionCompatParcelizer, mediaBrowserCompatCustomActionResultReceiver2);
                }
                break;
            case 18:
                if (iIconCompatParcelizer2 == mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver) {
                    IconCompatParcelizer iconCompatParcelizerWrite = write(asExternalTypeSerializer, iIconCompatParcelizer3);
                    mediaBrowserCompatItemReceiver.IconCompatParcelizer.put(iconCompatParcelizerWrite.AudioAttributesCompatParcelizer, iconCompatParcelizerWrite);
                } else if (iIconCompatParcelizer2 == mediaBrowserCompatItemReceiver.read) {
                    IconCompatParcelizer iconCompatParcelizerWrite2 = write(asExternalTypeSerializer, iIconCompatParcelizer3);
                    mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer.put(iconCompatParcelizerWrite2.AudioAttributesCompatParcelizer, iconCompatParcelizerWrite2);
                }
                break;
            case 19:
                if (iIconCompatParcelizer2 == mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver) {
                    write writeVarIconCompatParcelizer = IconCompatParcelizer(asExternalTypeSerializer);
                    mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver.put(writeVarIconCompatParcelizer.read, writeVarIconCompatParcelizer);
                } else if (iIconCompatParcelizer2 == mediaBrowserCompatItemReceiver.read) {
                    write writeVarIconCompatParcelizer2 = IconCompatParcelizer(asExternalTypeSerializer);
                    mediaBrowserCompatItemReceiver.write.put(writeVarIconCompatParcelizer2.read, writeVarIconCompatParcelizer2);
                }
                break;
            case 20:
                if (iIconCompatParcelizer2 == mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver) {
                    mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(asExternalTypeSerializer);
                }
                break;
        }
        asExternalTypeSerializer.MediaBrowserCompatCustomActionResultReceiver((iRemoteActionCompatParcelizer + iIconCompatParcelizer3) - asExternalTypeSerializer.RemoteActionCompatParcelizer());
    }

    private static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        int i;
        int i2;
        int i3;
        int iIconCompatParcelizer;
        asExternalTypeSerializer.write(4);
        boolean z = asExternalTypeSerializer.read();
        asExternalTypeSerializer.write(3);
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(16);
        int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(16);
        if (z) {
            int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(16);
            int iIconCompatParcelizer5 = asExternalTypeSerializer.IconCompatParcelizer(16);
            int iIconCompatParcelizer6 = asExternalTypeSerializer.IconCompatParcelizer(16);
            iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(16);
            i3 = iIconCompatParcelizer5;
            i2 = iIconCompatParcelizer6;
            i = iIconCompatParcelizer4;
        } else {
            i = 0;
            i2 = 0;
            i3 = iIconCompatParcelizer2;
            iIconCompatParcelizer = iIconCompatParcelizer3;
        }
        return new AudioAttributesCompatParcelizer(iIconCompatParcelizer2, iIconCompatParcelizer3, i, i3, i2, iIconCompatParcelizer);
    }

    private static read AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer, int i) {
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(8);
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(4);
        int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(2);
        asExternalTypeSerializer.write(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(8);
            asExternalTypeSerializer.write(8);
            i2 -= 6;
            sparseArray.put(iIconCompatParcelizer4, new RemoteActionCompatParcelizer(asExternalTypeSerializer.IconCompatParcelizer(16), asExternalTypeSerializer.IconCompatParcelizer(16)));
        }
        return new read(iIconCompatParcelizer, iIconCompatParcelizer2, iIconCompatParcelizer3, sparseArray);
    }

    private static MediaBrowserCompatCustomActionResultReceiver read(AsExternalTypeSerializer asExternalTypeSerializer, int i) {
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(8);
        asExternalTypeSerializer.write(4);
        boolean z = asExternalTypeSerializer.read();
        asExternalTypeSerializer.write(3);
        int i2 = 16;
        int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(16);
        int iIconCompatParcelizer5 = asExternalTypeSerializer.IconCompatParcelizer(16);
        int iIconCompatParcelizer6 = asExternalTypeSerializer.IconCompatParcelizer(3);
        int iIconCompatParcelizer7 = asExternalTypeSerializer.IconCompatParcelizer(3);
        int i3 = 2;
        asExternalTypeSerializer.write(2);
        int iIconCompatParcelizer8 = asExternalTypeSerializer.IconCompatParcelizer(8);
        int iIconCompatParcelizer9 = asExternalTypeSerializer.IconCompatParcelizer(8);
        int iIconCompatParcelizer10 = asExternalTypeSerializer.IconCompatParcelizer(4);
        int iIconCompatParcelizer11 = asExternalTypeSerializer.IconCompatParcelizer(2);
        asExternalTypeSerializer.write(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int iIconCompatParcelizer12 = asExternalTypeSerializer.IconCompatParcelizer(i2);
            int iIconCompatParcelizer13 = asExternalTypeSerializer.IconCompatParcelizer(i3);
            int iIconCompatParcelizer14 = asExternalTypeSerializer.IconCompatParcelizer(i3);
            int iIconCompatParcelizer15 = asExternalTypeSerializer.IconCompatParcelizer(12);
            int i5 = iIconCompatParcelizer11;
            asExternalTypeSerializer.write(4);
            int iIconCompatParcelizer16 = asExternalTypeSerializer.IconCompatParcelizer(12);
            if (iIconCompatParcelizer13 == 1 || iIconCompatParcelizer13 == 2) {
                i4 -= 8;
                iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(8);
                iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(8);
            } else {
                i4 -= 6;
                iIconCompatParcelizer = 0;
                iIconCompatParcelizer2 = 0;
            }
            sparseArray.put(iIconCompatParcelizer12, new AudioAttributesImplApi26Parcelizer(iIconCompatParcelizer13, iIconCompatParcelizer14, iIconCompatParcelizer15, iIconCompatParcelizer16, iIconCompatParcelizer, iIconCompatParcelizer2));
            iIconCompatParcelizer11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer3, z, iIconCompatParcelizer4, iIconCompatParcelizer5, iIconCompatParcelizer6, iIconCompatParcelizer7, iIconCompatParcelizer8, iIconCompatParcelizer9, iIconCompatParcelizer10, iIconCompatParcelizer11, sparseArray);
    }

    private static IconCompatParcelizer write(AsExternalTypeSerializer asExternalTypeSerializer, int i) {
        int i2;
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int iIconCompatParcelizer3;
        int iIconCompatParcelizer4;
        int i3 = 8;
        int iIconCompatParcelizer5 = asExternalTypeSerializer.IconCompatParcelizer(8);
        asExternalTypeSerializer.write(8);
        int i4 = i - 2;
        int[] iArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int[] iArrWrite = write();
        int[] iArr = read();
        while (i4 > 0) {
            int iIconCompatParcelizer6 = asExternalTypeSerializer.IconCompatParcelizer(i3);
            int iIconCompatParcelizer7 = asExternalTypeSerializer.IconCompatParcelizer(i3);
            int[] iArr2 = (iIconCompatParcelizer7 & 128) != 0 ? iArrAudioAttributesCompatParcelizer : (iIconCompatParcelizer7 & 64) != 0 ? iArrWrite : iArr;
            if ((iIconCompatParcelizer7 & 1) != 0) {
                iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(i3);
                iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(i3);
                iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(i3);
                iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(i3);
                i2 = i4 - 6;
            } else {
                int iIconCompatParcelizer8 = asExternalTypeSerializer.IconCompatParcelizer(6);
                int iIconCompatParcelizer9 = asExternalTypeSerializer.IconCompatParcelizer(4);
                int iIconCompatParcelizer10 = asExternalTypeSerializer.IconCompatParcelizer(4) << 4;
                i2 = i4 - 4;
                int i5 = iIconCompatParcelizer9 << 4;
                iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(2) << 6;
                iIconCompatParcelizer2 = iIconCompatParcelizer8 << 2;
                iIconCompatParcelizer3 = i5;
                iIconCompatParcelizer4 = iIconCompatParcelizer10;
            }
            if (iIconCompatParcelizer2 == 0) {
                iIconCompatParcelizer = 255;
                iIconCompatParcelizer3 = 0;
                iIconCompatParcelizer4 = 0;
            }
            double d = iIconCompatParcelizer2;
            double d2 = iIconCompatParcelizer3 - 128;
            int i6 = i2;
            double d3 = iIconCompatParcelizer4 - 128;
            iArr2[iIconCompatParcelizer6] = RemoteActionCompatParcelizer((byte) (255 - (iIconCompatParcelizer & 255)), LaissezFaireSubTypeValidator.write((int) (d + (1.402d * d2)), 0, 255), LaissezFaireSubTypeValidator.write((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), LaissezFaireSubTypeValidator.write((int) (d + (d3 * 1.772d)), 0, 255));
            iArrAudioAttributesCompatParcelizer = iArrAudioAttributesCompatParcelizer;
            iIconCompatParcelizer5 = iIconCompatParcelizer5;
            i4 = i6;
            i3 = 8;
        }
        return new IconCompatParcelizer(iIconCompatParcelizer5, iArrAudioAttributesCompatParcelizer, iArrWrite, iArr);
    }

    private static write IconCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(16);
        asExternalTypeSerializer.write(4);
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(2);
        boolean z = asExternalTypeSerializer.read();
        asExternalTypeSerializer.write(1);
        byte[] bArr = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
        byte[] bArr2 = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
        if (iIconCompatParcelizer2 == 1) {
            asExternalTypeSerializer.write(asExternalTypeSerializer.IconCompatParcelizer(8) << 4);
        } else if (iIconCompatParcelizer2 == 0) {
            int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(16);
            int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(16);
            if (iIconCompatParcelizer3 > 0) {
                bArr = new byte[iIconCompatParcelizer3];
                asExternalTypeSerializer.write(bArr, iIconCompatParcelizer3);
            }
            if (iIconCompatParcelizer4 > 0) {
                bArr2 = new byte[iIconCompatParcelizer4];
                asExternalTypeSerializer.write(bArr2, iIconCompatParcelizer4);
            } else {
                bArr2 = bArr;
            }
        }
        return new write(iIconCompatParcelizer, z, bArr, bArr2);
    }

    private static int[] AudioAttributesCompatParcelizer() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] write() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = RemoteActionCompatParcelizer(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = RemoteActionCompatParcelizer(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] read() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = RemoteActionCompatParcelizer(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = RemoteActionCompatParcelizer(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = RemoteActionCompatParcelizer(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = RemoteActionCompatParcelizer(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = RemoteActionCompatParcelizer(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static void IconCompatParcelizer(write writeVar, IconCompatParcelizer iconCompatParcelizer, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = iconCompatParcelizer.write;
        } else if (i == 2) {
            iArr = iconCompatParcelizer.read;
        } else {
            iArr = iconCompatParcelizer.RemoteActionCompatParcelizer;
        }
        int[] iArr2 = iArr;
        RemoteActionCompatParcelizer(writeVar.IconCompatParcelizer, iArr2, i, i2, i3, paint, canvas);
        RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    private static void RemoteActionCompatParcelizer(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(bArr);
        int iRemoteActionCompatParcelizer = i2;
        int i4 = i3;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (asExternalTypeSerializer.IconCompatParcelizer() != 0) {
            int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(8);
            if (iIconCompatParcelizer != 240) {
                switch (iIconCompatParcelizer) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = read;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr7;
                            }
                            iRemoteActionCompatParcelizer = read(asExternalTypeSerializer, iArr, bArr2, iRemoteActionCompatParcelizer, i4, paint, canvas);
                            asExternalTypeSerializer.write();
                        } else if (bArr5 == null) {
                            bArr3 = RemoteActionCompatParcelizer;
                            bArr2 = bArr3;
                            iRemoteActionCompatParcelizer = read(asExternalTypeSerializer, iArr, bArr2, iRemoteActionCompatParcelizer, i4, paint, canvas);
                            asExternalTypeSerializer.write();
                        } else {
                            bArr2 = bArr5;
                            iRemoteActionCompatParcelizer = read(asExternalTypeSerializer, iArr, bArr2, iRemoteActionCompatParcelizer, i4, paint, canvas);
                            asExternalTypeSerializer.write();
                        }
                        break;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArr6 == null ? IconCompatParcelizer : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asExternalTypeSerializer, iArr, bArr4, iRemoteActionCompatParcelizer, i4, paint, canvas);
                        asExternalTypeSerializer.write();
                        break;
                    case 18:
                        iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asExternalTypeSerializer, iArr, iRemoteActionCompatParcelizer, i4, paint, canvas);
                        break;
                    default:
                        switch (iIconCompatParcelizer) {
                            case 32:
                                bArr7 = read(4, 4, asExternalTypeSerializer);
                                break;
                            case 33:
                                bArr5 = read(4, 8, asExternalTypeSerializer);
                                break;
                            case 34:
                                bArr6 = read(16, 8, asExternalTypeSerializer);
                                break;
                        }
                        break;
                }
            } else {
                i4 += 2;
                iRemoteActionCompatParcelizer = i2;
            }
        }
    }

    private static int read(AsExternalTypeSerializer asExternalTypeSerializer, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int i5 = 2;
            int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(2);
            if (iIconCompatParcelizer3 != 0) {
                z = z2;
                i3 = 1;
            } else {
                if (asExternalTypeSerializer.read()) {
                    iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(3) + 3;
                    iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(2);
                } else {
                    if (asExternalTypeSerializer.read()) {
                        i5 = 1;
                    } else {
                        int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(2);
                        if (iIconCompatParcelizer4 == 0) {
                            z2 = true;
                        } else if (iIconCompatParcelizer4 != 1) {
                            if (iIconCompatParcelizer4 == 2) {
                                iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(4) + 12;
                                iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(2);
                            } else if (iIconCompatParcelizer4 == 3) {
                                iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(8) + 29;
                                iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(2);
                            }
                        }
                        z = z2;
                        iIconCompatParcelizer3 = 0;
                        i3 = 0;
                    }
                    z = z2;
                    i3 = i5;
                    iIconCompatParcelizer3 = 0;
                }
                int i6 = iIconCompatParcelizer;
                iIconCompatParcelizer3 = iIconCompatParcelizer2;
                z = z2;
                i3 = i6;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iIconCompatParcelizer3 = bArr[iIconCompatParcelizer3];
                }
                paint.setColor(iArr[iIconCompatParcelizer3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    private static int RemoteActionCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3;
        boolean z;
        int i4;
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int i5 = i;
        boolean z2 = false;
        while (true) {
            int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(4);
            if (iIconCompatParcelizer3 != 0) {
                z = z2;
                i4 = 1;
            } else if (!asExternalTypeSerializer.read()) {
                int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(3);
                if (iIconCompatParcelizer4 != 0) {
                    i3 = iIconCompatParcelizer4 + 2;
                    z = z2;
                    i4 = i3;
                    iIconCompatParcelizer3 = 0;
                } else {
                    z2 = true;
                    z = z2;
                    iIconCompatParcelizer3 = 0;
                    i4 = 0;
                }
            } else {
                if (!asExternalTypeSerializer.read()) {
                    iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(2) + 4;
                    iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(4);
                } else {
                    int iIconCompatParcelizer5 = asExternalTypeSerializer.IconCompatParcelizer(2);
                    if (iIconCompatParcelizer5 == 0) {
                        i3 = 1;
                        z = z2;
                        i4 = i3;
                        iIconCompatParcelizer3 = 0;
                    } else if (iIconCompatParcelizer5 == 1) {
                        z = z2;
                        i4 = 2;
                        iIconCompatParcelizer3 = 0;
                    } else if (iIconCompatParcelizer5 != 2) {
                        if (iIconCompatParcelizer5 == 3) {
                            iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(8) + 25;
                            iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(4);
                        }
                        z = z2;
                        iIconCompatParcelizer3 = 0;
                        i4 = 0;
                    } else {
                        iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(4) + 9;
                        iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(4);
                    }
                }
                int i6 = iIconCompatParcelizer;
                iIconCompatParcelizer3 = iIconCompatParcelizer2;
                z = z2;
                i4 = i6;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    iIconCompatParcelizer3 = bArr[iIconCompatParcelizer3];
                }
                paint.setColor(iArr[iIconCompatParcelizer3]);
                canvas.drawRect(i5, i2, i5 + i4, i2 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z2 = z;
        }
    }

    private static int RemoteActionCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer, int[] iArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int iIconCompatParcelizer;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(8);
            if (iIconCompatParcelizer2 != 0) {
                z = z2;
                iIconCompatParcelizer = 1;
            } else if (!asExternalTypeSerializer.read()) {
                int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(7);
                if (iIconCompatParcelizer3 != 0) {
                    z = z2;
                    iIconCompatParcelizer = iIconCompatParcelizer3;
                    iIconCompatParcelizer2 = 0;
                } else {
                    z = true;
                    iIconCompatParcelizer2 = 0;
                    iIconCompatParcelizer = 0;
                }
            } else {
                z = z2;
                iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(7);
                iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(8);
            }
            if (iIconCompatParcelizer != 0 && paint != null) {
                paint.setColor(iArr[iIconCompatParcelizer2]);
                canvas.drawRect(i3, i2, i3 + iIconCompatParcelizer, i2 + 1, paint);
            }
            i3 += iIconCompatParcelizer;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    private static byte[] read(int i, int i2, AsExternalTypeSerializer asExternalTypeSerializer) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) asExternalTypeSerializer.IconCompatParcelizer(i2);
        }
        return bArr;
    }

    static final class MediaBrowserCompatItemReceiver {
        public read AudioAttributesImplApi26Parcelizer;
        public final int MediaBrowserCompatItemReceiver;
        public AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
        public final int read;
        public final SparseArray<MediaBrowserCompatCustomActionResultReceiver> AudioAttributesImplBaseParcelizer = new SparseArray<>();
        public final SparseArray<IconCompatParcelizer> IconCompatParcelizer = new SparseArray<>();
        public final SparseArray<write> MediaBrowserCompatCustomActionResultReceiver = new SparseArray<>();
        public final SparseArray<IconCompatParcelizer> AudioAttributesCompatParcelizer = new SparseArray<>();
        public final SparseArray<write> write = new SparseArray<>();

        public MediaBrowserCompatItemReceiver(int i, int i2) {
            this.MediaBrowserCompatItemReceiver = i;
            this.read = i2;
        }

        public final void write() {
            this.AudioAttributesImplBaseParcelizer.clear();
            this.IconCompatParcelizer.clear();
            this.MediaBrowserCompatCustomActionResultReceiver.clear();
            this.AudioAttributesCompatParcelizer.clear();
            this.write.clear();
            this.RemoteActionCompatParcelizer = null;
            this.AudioAttributesImplApi26Parcelizer = null;
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompatItemReceiver;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        public AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6) {
            this.MediaBrowserCompatItemReceiver = i;
            this.IconCompatParcelizer = i2;
            this.write = i3;
            this.AudioAttributesCompatParcelizer = i4;
            this.read = i5;
            this.RemoteActionCompatParcelizer = i6;
        }
    }

    static final class read {
        public final SparseArray<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final int read;
        public final int write;

        public read(int i, int i2, int i3, SparseArray<RemoteActionCompatParcelizer> sparseArray) {
            this.IconCompatParcelizer = i;
            this.read = i2;
            this.write = i3;
            this.AudioAttributesCompatParcelizer = sparseArray;
        }
    }

    static final class RemoteActionCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(int i, int i2) {
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver {
        public final boolean AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi21Parcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final int AudioAttributesImplBaseParcelizer;
        public final int IconCompatParcelizer;
        public final SparseArray<AudioAttributesImplApi26Parcelizer> MediaBrowserCompatCustomActionResultReceiver;
        public final int MediaBrowserCompatItemReceiver;
        public final int MediaBrowserCompatSearchResultReceiver;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        public MediaBrowserCompatCustomActionResultReceiver(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<AudioAttributesImplApi26Parcelizer> sparseArray) {
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = z;
            this.MediaBrowserCompatSearchResultReceiver = i2;
            this.read = i3;
            this.AudioAttributesImplApi21Parcelizer = i4;
            this.write = i5;
            this.IconCompatParcelizer = i6;
            this.AudioAttributesImplApi26Parcelizer = i7;
            this.MediaBrowserCompatItemReceiver = i8;
            this.AudioAttributesImplBaseParcelizer = i9;
            this.MediaBrowserCompatCustomActionResultReceiver = sparseArray;
        }

        public final void read(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            SparseArray<AudioAttributesImplApi26Parcelizer> sparseArray = mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.MediaBrowserCompatCustomActionResultReceiver.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    static final class AudioAttributesImplApi26Parcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompatCustomActionResultReceiver;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        public AudioAttributesImplApi26Parcelizer(int i, int i2, int i3, int i4, int i5, int i6) {
            this.write = i;
            this.read = i2;
            this.RemoteActionCompatParcelizer = i3;
            this.MediaBrowserCompatCustomActionResultReceiver = i4;
            this.IconCompatParcelizer = i5;
            this.AudioAttributesCompatParcelizer = i6;
        }
    }

    static final class IconCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int[] RemoteActionCompatParcelizer;
        public final int[] read;
        public final int[] write;

        public IconCompatParcelizer(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = iArr;
            this.read = iArr2;
            this.write = iArr3;
        }
    }

    static final class write {
        public final byte[] AudioAttributesCompatParcelizer;
        public final byte[] IconCompatParcelizer;
        public final int read;
        public final boolean write;

        public write(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.read = i;
            this.write = z;
            this.IconCompatParcelizer = bArr;
            this.AudioAttributesCompatParcelizer = bArr2;
        }
    }
}
