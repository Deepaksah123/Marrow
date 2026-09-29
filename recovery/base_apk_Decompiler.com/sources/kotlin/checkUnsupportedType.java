package kotlin;

import java.util.ArrayList;
import java.util.zip.Inflater;
import kotlin.ArrayBuildersLongBuilder;

/* JADX INFO: loaded from: classes2.dex */
final class checkUnsupportedType {
    private static int RemoteActionCompatParcelizer(int i) {
        return (i >> 1) ^ (-(i & 1));
    }

    public static ArrayBuildersLongBuilder write(byte[] bArr, int i) {
        ArrayList<ArrayBuildersLongBuilder.RemoteActionCompatParcelizer> arrayListAudioAttributesCompatParcelizer;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(bArr);
        try {
            arrayListAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer) ? AudioAttributesCompatParcelizer(asPropertyTypeDeserializer) : write(asPropertyTypeDeserializer);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListAudioAttributesCompatParcelizer = null;
        }
        if (arrayListAudioAttributesCompatParcelizer == null) {
            return null;
        }
        int size = arrayListAudioAttributesCompatParcelizer.size();
        if (size == 1) {
            return new ArrayBuildersLongBuilder(arrayListAudioAttributesCompatParcelizer.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new ArrayBuildersLongBuilder(arrayListAudioAttributesCompatParcelizer.get(0), arrayListAudioAttributesCompatParcelizer.get(1), i);
    }

    private static boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
        return iMediaBrowserCompatItemReceiver == 1886547818;
    }

    private static ArrayList<ArrayBuildersLongBuilder.RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
        int iWrite = asPropertyTypeDeserializer.write();
        int i = asPropertyTypeDeserializer.read();
        while (iWrite < i) {
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() + iWrite;
            if (iMediaBrowserCompatItemReceiver <= iWrite || iMediaBrowserCompatItemReceiver > i) {
                return null;
            }
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (iMediaBrowserCompatItemReceiver2 == 2037673328 || iMediaBrowserCompatItemReceiver2 == 1836279920) {
                asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(iMediaBrowserCompatItemReceiver);
                return write(asPropertyTypeDeserializer);
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iMediaBrowserCompatItemReceiver);
            iWrite = iMediaBrowserCompatItemReceiver;
        }
        return null;
    }

    private static ArrayList<ArrayBuildersLongBuilder.RemoteActionCompatParcelizer> write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (asPropertyTypeDeserializer.onPlayFromMediaId() != 0) {
            return null;
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(7);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver == 1684433976) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = new AsPropertyTypeDeserializer();
            Inflater inflater = new Inflater(true);
            try {
                if (!LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, asPropertyTypeDeserializer2, inflater)) {
                    return null;
                }
                inflater.end();
                asPropertyTypeDeserializer = asPropertyTypeDeserializer2;
            } finally {
                inflater.end();
            }
        } else if (iMediaBrowserCompatItemReceiver != 1918990112) {
            return null;
        }
        return IconCompatParcelizer(asPropertyTypeDeserializer);
    }

    private static ArrayList<ArrayBuildersLongBuilder.RemoteActionCompatParcelizer> IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        ArrayList<ArrayBuildersLongBuilder.RemoteActionCompatParcelizer> arrayList = new ArrayList<>();
        int iWrite = asPropertyTypeDeserializer.write();
        int i = asPropertyTypeDeserializer.read();
        while (iWrite < i) {
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() + iWrite;
            if (iMediaBrowserCompatItemReceiver <= iWrite || iMediaBrowserCompatItemReceiver > i) {
                return null;
            }
            if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1835365224) {
                ArrayBuildersLongBuilder.RemoteActionCompatParcelizer remoteActionCompatParcelizer = read(asPropertyTypeDeserializer);
                if (remoteActionCompatParcelizer == null) {
                    return null;
                }
                arrayList.add(remoteActionCompatParcelizer);
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iMediaBrowserCompatItemReceiver);
            iWrite = iMediaBrowserCompatItemReceiver;
        }
        return arrayList;
    }

    private static ArrayBuildersLongBuilder.RemoteActionCompatParcelizer read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        ArrayBuildersLongBuilder.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        if (iMediaBrowserCompatItemReceiver > 10000) {
            return null;
        }
        float[] fArr = new float[iMediaBrowserCompatItemReceiver];
        for (int i = 0; i < iMediaBrowserCompatItemReceiver; i++) {
            fArr[i] = asPropertyTypeDeserializer.AudioAttributesImplApi21Parcelizer();
        }
        int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iMediaBrowserCompatItemReceiver) * 2.0d) / dLog);
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer());
        asExternalTypeSerializer.read(asPropertyTypeDeserializer.write() << 3);
        float[] fArr2 = new float[iMediaBrowserCompatItemReceiver2 * 5];
        int i2 = 5;
        int[] iArr = new int[5];
        int i3 = 0;
        int i4 = 0;
        while (i3 < iMediaBrowserCompatItemReceiver2) {
            int i5 = 0;
            while (i5 < i2) {
                int iRemoteActionCompatParcelizer = iArr[i5] + RemoteActionCompatParcelizer(asExternalTypeSerializer.IconCompatParcelizer(iCeil));
                if (iRemoteActionCompatParcelizer >= iMediaBrowserCompatItemReceiver || iRemoteActionCompatParcelizer < 0) {
                    return null;
                }
                fArr2[i4] = fArr[iRemoteActionCompatParcelizer];
                iArr[i5] = iRemoteActionCompatParcelizer;
                i5++;
                i4++;
                i2 = 5;
            }
            i3++;
            i2 = 5;
        }
        asExternalTypeSerializer.read((asExternalTypeSerializer.AudioAttributesCompatParcelizer() + 7) & (-8));
        int i6 = 32;
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(32);
        ArrayBuildersLongBuilder.read[] readVarArr = new ArrayBuildersLongBuilder.read[iIconCompatParcelizer];
        int i7 = 0;
        while (i7 < iIconCompatParcelizer) {
            int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(8);
            int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(8);
            int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(i6);
            if (iIconCompatParcelizer4 > 128000) {
                return remoteActionCompatParcelizer;
            }
            int i8 = iIconCompatParcelizer;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iMediaBrowserCompatItemReceiver2) * d) / dLog);
            float[] fArr3 = new float[iIconCompatParcelizer4 * 3];
            float[] fArr4 = new float[iIconCompatParcelizer4 << 1];
            int i9 = 0;
            int i10 = 0;
            while (i9 < iIconCompatParcelizer4) {
                int iRemoteActionCompatParcelizer2 = i10 + RemoteActionCompatParcelizer(asExternalTypeSerializer.IconCompatParcelizer(iCeil2));
                if (iRemoteActionCompatParcelizer2 < 0 || iRemoteActionCompatParcelizer2 >= iMediaBrowserCompatItemReceiver2) {
                    return null;
                }
                int i11 = i9 * 3;
                int i12 = iRemoteActionCompatParcelizer2 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i9 << 1;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
                i9++;
                i10 = iRemoteActionCompatParcelizer2;
                remoteActionCompatParcelizer = null;
            }
            readVarArr[i7] = new ArrayBuildersLongBuilder.read(iIconCompatParcelizer2, fArr3, fArr4, iIconCompatParcelizer3);
            i7++;
            remoteActionCompatParcelizer = remoteActionCompatParcelizer;
            iIconCompatParcelizer = i8;
            i6 = 32;
            d = 2.0d;
        }
        return new ArrayBuildersLongBuilder.RemoteActionCompatParcelizer(readVarArr);
    }
}
