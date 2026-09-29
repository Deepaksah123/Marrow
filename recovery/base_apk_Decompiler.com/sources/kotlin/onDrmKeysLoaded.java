package kotlin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onDrmKeysLoaded {
    private static lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener read(byte[] bArr) {
        return lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArr);
    }

    private static byte[] write(ByteArrayInputStream byteArrayInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte b = (byte) byteArrayInputStream.read();
        byteArrayOutputStream.write(b);
        if ((b & 31) == 31) {
            while (true) {
                int i = byteArrayInputStream.read();
                if (i < 0) {
                    break;
                }
                byte b2 = (byte) i;
                byteArrayOutputStream.write(b2);
                if (!lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(b2, 7) || (lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(b2, 7) && (b2 & 127) == 0)) {
                    break;
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int IconCompatParcelizer(ByteArrayInputStream byteArrayInputStream) throws IOException {
        int i = byteArrayInputStream.read();
        if (i < 0) {
            throw new lambdaonUpstreamDiscarded4comgoogleandroidexoplayer2MediaSourceListForwardingEventListener("Negative length: ".concat(String.valueOf(i)));
        }
        if (i <= 127 || i == 128) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < (i & 127); i3++) {
            int i4 = byteArrayInputStream.read();
            if (i4 < 0) {
                throw new lambdaonUpstreamDiscarded4comgoogleandroidexoplayer2MediaSourceListForwardingEventListener("EOS when reading length bytes");
            }
            i2 = (i2 << 8) | i4;
        }
        return i2;
    }

    private static lambdaonLoadCanceled2comgoogleandroidexoplayer2MediaSourceListForwardingEventListener RemoteActionCompatParcelizer(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] bArr;
        if (byteArrayInputStream.available() < 2) {
            StringBuilder sb = new StringBuilder("Error parsing data. Available bytes < 2 . Length=");
            sb.append(byteArrayInputStream.available());
            throw new lambdaonUpstreamDiscarded4comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(sb.toString());
        }
        byteArrayInputStream.mark(0);
        int i = byteArrayInputStream.read();
        while (true) {
            byte b = (byte) i;
            if (i == -1 || !(b == -1 || b == 0)) {
                break;
            }
            byteArrayInputStream.mark(0);
            i = byteArrayInputStream.read();
        }
        byteArrayInputStream.reset();
        if (byteArrayInputStream.available() < 2) {
            StringBuilder sb2 = new StringBuilder("Error parsing data. Available bytes < 2 . Length=");
            sb2.append(byteArrayInputStream.available());
            throw new lambdaonUpstreamDiscarded4comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(sb2.toString());
        }
        byte[] bArrWrite = write(byteArrayInputStream);
        byteArrayInputStream.mark(0);
        int iAvailable = byteArrayInputStream.available();
        int iIconCompatParcelizer = IconCompatParcelizer(byteArrayInputStream);
        int iAvailable2 = byteArrayInputStream.available();
        byteArrayInputStream.reset();
        int i2 = iAvailable - iAvailable2;
        byte[] bArr2 = new byte[i2];
        if (i2 <= 0 || i2 > 4) {
            throw new lambdaonUpstreamDiscarded4comgoogleandroidexoplayer2MediaSourceListForwardingEventListener("Number of length bytes must be from 1 to 4. Found ".concat(String.valueOf(i2)));
        }
        byteArrayInputStream.read(bArr2, 0, i2);
        int iAudioAttributesCompatParcelizer = lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.AudioAttributesCompatParcelizer(bArr2);
        lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener = read(bArrWrite);
        int i3 = 1;
        if (iAudioAttributesCompatParcelizer == 128) {
            byteArrayInputStream.mark(0);
            int i4 = 0;
            while (true) {
                int i5 = byteArrayInputStream.read();
                if (i5 < 0) {
                    StringBuilder sb3 = new StringBuilder("Error parsing data. TLV length byte indicated indefinite length, but EOS was reached before 0x0000 was found");
                    sb3.append(byteArrayInputStream.available());
                    throw new lambdaonUpstreamDiscarded4comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(sb3.toString());
                }
                if (i3 == 0 && i5 == 0) {
                    iIconCompatParcelizer = i4 - 1;
                    bArr = new byte[iIconCompatParcelizer];
                    byteArrayInputStream.reset();
                    byteArrayInputStream.read(bArr, 0, iIconCompatParcelizer);
                    break;
                }
                i4++;
                i3 = i5;
            }
        } else {
            if (byteArrayInputStream.available() < iIconCompatParcelizer) {
                StringBuilder sb4 = new StringBuilder("Length byte(s) indicated ");
                sb4.append(iIconCompatParcelizer);
                sb4.append(" value bytes, but only ");
                sb4.append(byteArrayInputStream.available());
                sb4.append(" ");
                sb4.append(byteArrayInputStream.available() > 1 ? "are" : "is");
                sb4.append(" available");
                throw new lambdaonUpstreamDiscarded4comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(sb4.toString());
            }
            bArr = new byte[iIconCompatParcelizer];
            byteArrayInputStream.read(bArr, 0, iIconCompatParcelizer);
        }
        byteArrayInputStream.mark(0);
        int i6 = byteArrayInputStream.read();
        while (true) {
            byte b2 = (byte) i6;
            if (i6 == -1 || !(b2 == -1 || b2 == 0)) {
                break;
            }
            byteArrayInputStream.mark(0);
            i6 = byteArrayInputStream.read();
        }
        byteArrayInputStream.reset();
        return new lambdaonLoadCanceled2comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, iIconCompatParcelizer, bArr2, bArr);
    }

    public static List<lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener> IconCompatParcelizer(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (byteArrayInputStream.available() > 0) {
                if (byteArrayInputStream.available() < 2) {
                    StringBuilder sb = new StringBuilder("Data length < 2 : ");
                    sb.append(byteArrayInputStream.available());
                    throw new lambdaonUpstreamDiscarded4comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(sb.toString());
                }
                arrayList.add(new lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(read(write(byteArrayInputStream)), IconCompatParcelizer(byteArrayInputStream)));
            }
        }
        return arrayList;
    }

    private static int write(Object[] objArr, Object obj) {
        if (objArr == null) {
            return -1;
        }
        int i = 0;
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    private static int read(Object[] objArr, Object obj) {
        return write(objArr, obj);
    }

    private static boolean IconCompatParcelizer(Object[] objArr, Object obj) {
        return read(objArr, obj) != -1;
    }

    public static List<lambdaonLoadCanceled2comgoogleandroidexoplayer2MediaSourceListForwardingEventListener> IconCompatParcelizer(byte[] bArr, lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener... lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() > 0) {
            lambdaonLoadCanceled2comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteArrayInputStream);
            if (IconCompatParcelizer(lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerArr, lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer.write())) {
                arrayList.add(lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer);
            } else if (lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer.write().IconCompatParcelizer()) {
                arrayList.addAll(IconCompatParcelizer(lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerArr));
            }
        }
        return arrayList;
    }

    public static byte[] AudioAttributesCompatParcelizer(byte[] bArr, lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener... lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerArr) throws IOException {
        byte[] bArrAudioAttributesCompatParcelizer = null;
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (byteArrayInputStream.available() > 0) {
                lambdaonLoadCanceled2comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteArrayInputStream);
                if (IconCompatParcelizer(lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerArr, lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer.write())) {
                    return lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                }
                if (lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer.write().IconCompatParcelizer() && (bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistenerArr)) != null) {
                    break;
                }
            }
        }
        return bArrAudioAttributesCompatParcelizer;
    }

    public static int IconCompatParcelizer(List<lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener> list) {
        int iWrite = 0;
        if (list != null) {
            Iterator<lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener> it = list.iterator();
            while (it.hasNext()) {
                iWrite += it.next().write();
            }
        }
        return iWrite;
    }
}
