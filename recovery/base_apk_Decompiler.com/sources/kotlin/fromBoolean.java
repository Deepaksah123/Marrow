package kotlin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
final class fromBoolean {
    static final byte[] AudioAttributesCompatParcelizer = {112, 114, 111, 0};
    static final byte[] RemoteActionCompatParcelizer = {112, 114, 109, 0};

    private static int read(int i) {
        return (i + 7) & (-8);
    }

    static byte[] IconCompatParcelizer(InputStream inputStream, byte[] bArr) throws IOException {
        if (!Arrays.equals(bArr, ReflectionCacheBooleanTriState.read(inputStream, bArr.length))) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Invalid magic");
        }
        return ReflectionCacheBooleanTriState.read(inputStream, accessgetEMPTYcp.MediaBrowserCompatCustomActionResultReceiver.length);
    }

    static void IconCompatParcelizer(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(AudioAttributesCompatParcelizer);
        outputStream.write(bArr);
    }

    static boolean IconCompatParcelizer(OutputStream outputStream, byte[] bArr, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        if (Arrays.equals(bArr, accessgetEMPTYcp.MediaBrowserCompatItemReceiver)) {
            read(outputStream, javamemberisrequiredArr);
            return true;
        }
        if (Arrays.equals(bArr, accessgetEMPTYcp.MediaBrowserCompatCustomActionResultReceiver)) {
            IconCompatParcelizer(outputStream, javamemberisrequiredArr);
            return true;
        }
        if (Arrays.equals(bArr, accessgetEMPTYcp.IconCompatParcelizer)) {
            write(outputStream, javamemberisrequiredArr);
            return true;
        }
        if (Arrays.equals(bArr, accessgetEMPTYcp.RemoteActionCompatParcelizer)) {
            RemoteActionCompatParcelizer(outputStream, javamemberisrequiredArr);
            return true;
        }
        if (!Arrays.equals(bArr, accessgetEMPTYcp.AudioAttributesCompatParcelizer)) {
            return false;
        }
        AudioAttributesCompatParcelizer(outputStream, javamemberisrequiredArr);
        return true;
    }

    private static void AudioAttributesCompatParcelizer(OutputStream outputStream, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, javamemberisrequiredArr.length);
        for (javaMemberIsRequired javamemberisrequired : javamemberisrequiredArr) {
            String strWrite = write(javamemberisrequired.RemoteActionCompatParcelizer, javamemberisrequired.AudioAttributesCompatParcelizer, accessgetEMPTYcp.AudioAttributesCompatParcelizer);
            ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, ReflectionCacheBooleanTriState.write(strWrite));
            ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, javamemberisrequired.AudioAttributesImplApi26Parcelizer.size());
            ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, javamemberisrequired.read.length);
            ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, javamemberisrequired.IconCompatParcelizer);
            ReflectionCacheBooleanTriState.read(outputStream, strWrite);
            Iterator<Integer> it = javamemberisrequired.AudioAttributesImplApi26Parcelizer.keySet().iterator();
            while (it.hasNext()) {
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, it.next().intValue());
            }
            for (int i : javamemberisrequired.read) {
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, i);
            }
        }
    }

    private static void read(OutputStream outputStream, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        AudioAttributesImplApi26Parcelizer(outputStream, javamemberisrequiredArr);
    }

    private static void AudioAttributesImplApi26Parcelizer(OutputStream outputStream, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(IconCompatParcelizer(javamemberisrequiredArr));
        arrayList.add(AudioAttributesCompatParcelizer(javamemberisrequiredArr));
        arrayList.add(RemoteActionCompatParcelizer(javamemberisrequiredArr));
        long length2 = ((long) accessgetEMPTYcp.MediaBrowserCompatItemReceiver.length) + ((long) AudioAttributesCompatParcelizer.length) + 4 + ((long) (arrayList.size() << 4));
        ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            ReflectionCacheBooleanTriStateCompanion reflectionCacheBooleanTriStateCompanion = (ReflectionCacheBooleanTriStateCompanion) arrayList.get(i);
            ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, reflectionCacheBooleanTriStateCompanion.write.write());
            ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, length2);
            if (reflectionCacheBooleanTriStateCompanion.AudioAttributesCompatParcelizer) {
                long length3 = reflectionCacheBooleanTriStateCompanion.read.length;
                byte[] bArrAudioAttributesCompatParcelizer = ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(reflectionCacheBooleanTriStateCompanion.read);
                arrayList2.add(bArrAudioAttributesCompatParcelizer);
                ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, bArrAudioAttributesCompatParcelizer.length);
                ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, length3);
                length = bArrAudioAttributesCompatParcelizer.length;
            } else {
                arrayList2.add(reflectionCacheBooleanTriStateCompanion.read);
                ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, reflectionCacheBooleanTriStateCompanion.read.length);
                ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, 0L);
                length = reflectionCacheBooleanTriStateCompanion.read.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    private static ReflectionCacheBooleanTriStateCompanion IconCompatParcelizer(javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(byteArrayOutputStream, javamemberisrequiredArr.length);
            int i = 2;
            for (javaMemberIsRequired javamemberisrequired : javamemberisrequiredArr) {
                ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(byteArrayOutputStream, javamemberisrequired.IconCompatParcelizer);
                ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(byteArrayOutputStream, javamemberisrequired.AudioAttributesImplApi21Parcelizer);
                ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(byteArrayOutputStream, javamemberisrequired.MediaBrowserCompatItemReceiver);
                String strWrite = write(javamemberisrequired.RemoteActionCompatParcelizer, javamemberisrequired.AudioAttributesCompatParcelizer, accessgetEMPTYcp.MediaBrowserCompatItemReceiver);
                int iWrite = ReflectionCacheBooleanTriState.write(strWrite);
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(byteArrayOutputStream, iWrite);
                i = i + 14 + iWrite;
                ReflectionCacheBooleanTriState.read(byteArrayOutputStream, strWrite);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i != byteArray.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected size ");
                sb.append(i);
                sb.append(", does not match actual size ");
                sb.append(byteArray.length);
                throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(sb.toString());
            }
            ReflectionCacheBooleanTriStateCompanion reflectionCacheBooleanTriStateCompanion = new ReflectionCacheBooleanTriStateCompanion(kotlinFromJava.DEX_FILES, i, byteArray, false);
            byteArrayOutputStream.close();
            return reflectionCacheBooleanTriStateCompanion;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static ReflectionCacheBooleanTriStateCompanion AudioAttributesCompatParcelizer(javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < javamemberisrequiredArr.length; i2++) {
            try {
                javaMemberIsRequired javamemberisrequired = javamemberisrequiredArr[i2];
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(byteArrayOutputStream, i2);
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(byteArrayOutputStream, javamemberisrequired.write);
                i = i + 4 + (javamemberisrequired.write << 1);
                write(byteArrayOutputStream, javamemberisrequired);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i != byteArray.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected size ");
            sb.append(i);
            sb.append(", does not match actual size ");
            sb.append(byteArray.length);
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(sb.toString());
        }
        ReflectionCacheBooleanTriStateCompanion reflectionCacheBooleanTriStateCompanion = new ReflectionCacheBooleanTriStateCompanion(kotlinFromJava.CLASSES, i, byteArray, true);
        byteArrayOutputStream.close();
        return reflectionCacheBooleanTriStateCompanion;
    }

    private static ReflectionCacheBooleanTriStateCompanion RemoteActionCompatParcelizer(javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < javamemberisrequiredArr.length; i2++) {
            try {
                javaMemberIsRequired javamemberisrequired = javamemberisrequiredArr[i2];
                int i3 = read(javamemberisrequired);
                byte[] bArrIconCompatParcelizer = IconCompatParcelizer(i3, javamemberisrequired);
                byte[] bArrIconCompatParcelizer2 = IconCompatParcelizer(javamemberisrequired);
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(byteArrayOutputStream, i2);
                int length = bArrIconCompatParcelizer.length + 2 + bArrIconCompatParcelizer2.length;
                ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(byteArrayOutputStream, length);
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(byteArrayOutputStream, i3);
                byteArrayOutputStream.write(bArrIconCompatParcelizer);
                byteArrayOutputStream.write(bArrIconCompatParcelizer2);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i != byteArray.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected size ");
            sb.append(i);
            sb.append(", does not match actual size ");
            sb.append(byteArray.length);
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(sb.toString());
        }
        ReflectionCacheBooleanTriStateCompanion reflectionCacheBooleanTriStateCompanion = new ReflectionCacheBooleanTriStateCompanion(kotlinFromJava.METHODS, i, byteArray, true);
        byteArrayOutputStream.close();
        return reflectionCacheBooleanTriStateCompanion;
    }

    private static byte[] IconCompatParcelizer(int i, javaMemberIsRequired javamemberisrequired) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            IconCompatParcelizer(byteArrayOutputStream, i, javamemberisrequired);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] IconCompatParcelizer(javaMemberIsRequired javamemberisrequired) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AudioAttributesCompatParcelizer(byteArrayOutputStream, javamemberisrequired);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static int read(javaMemberIsRequired javamemberisrequired) {
        Iterator<Map.Entry<Integer, Integer>> it = javamemberisrequired.AudioAttributesImplApi26Parcelizer.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    private static void IconCompatParcelizer(OutputStream outputStream, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(javamemberisrequiredArr, accessgetEMPTYcp.MediaBrowserCompatCustomActionResultReceiver);
        ReflectionCacheBooleanTriState.write(outputStream, javamemberisrequiredArr.length);
        ReflectionCacheBooleanTriState.IconCompatParcelizer(outputStream, bArrRemoteActionCompatParcelizer);
    }

    private static void RemoteActionCompatParcelizer(OutputStream outputStream, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(javamemberisrequiredArr, accessgetEMPTYcp.RemoteActionCompatParcelizer);
        ReflectionCacheBooleanTriState.write(outputStream, javamemberisrequiredArr.length);
        ReflectionCacheBooleanTriState.IconCompatParcelizer(outputStream, bArrRemoteActionCompatParcelizer);
    }

    private static void write(OutputStream outputStream, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        ReflectionCacheBooleanTriState.write(outputStream, javamemberisrequiredArr.length);
        for (javaMemberIsRequired javamemberisrequired : javamemberisrequiredArr) {
            int size = javamemberisrequired.AudioAttributesImplApi26Parcelizer.size();
            String strWrite = write(javamemberisrequired.RemoteActionCompatParcelizer, javamemberisrequired.AudioAttributesCompatParcelizer, accessgetEMPTYcp.IconCompatParcelizer);
            ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, ReflectionCacheBooleanTriState.write(strWrite));
            ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, javamemberisrequired.read.length);
            ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, size << 2);
            ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, javamemberisrequired.IconCompatParcelizer);
            ReflectionCacheBooleanTriState.read(outputStream, strWrite);
            Iterator<Integer> it = javamemberisrequired.AudioAttributesImplApi26Parcelizer.keySet().iterator();
            while (it.hasNext()) {
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, it.next().intValue());
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, 0);
            }
            for (int i : javamemberisrequired.read) {
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, i);
            }
        }
    }

    private static byte[] RemoteActionCompatParcelizer(javaMemberIsRequired[] javamemberisrequiredArr, byte[] bArr) throws IOException {
        int i = 0;
        int iWrite = 0;
        for (javaMemberIsRequired javamemberisrequired : javamemberisrequiredArr) {
            iWrite += ReflectionCacheBooleanTriState.write(write(javamemberisrequired.RemoteActionCompatParcelizer, javamemberisrequired.AudioAttributesCompatParcelizer, bArr)) + 16 + (javamemberisrequired.write << 1) + javamemberisrequired.MediaBrowserCompatCustomActionResultReceiver + write(javamemberisrequired.MediaBrowserCompatItemReceiver);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iWrite);
        if (Arrays.equals(bArr, accessgetEMPTYcp.RemoteActionCompatParcelizer)) {
            int length = javamemberisrequiredArr.length;
            while (i < length) {
                javaMemberIsRequired javamemberisrequired2 = javamemberisrequiredArr[i];
                RemoteActionCompatParcelizer(byteArrayOutputStream, javamemberisrequired2, write(javamemberisrequired2.RemoteActionCompatParcelizer, javamemberisrequired2.AudioAttributesCompatParcelizer, bArr));
                IconCompatParcelizer(byteArrayOutputStream, javamemberisrequired2);
                i++;
            }
        } else {
            for (javaMemberIsRequired javamemberisrequired3 : javamemberisrequiredArr) {
                RemoteActionCompatParcelizer(byteArrayOutputStream, javamemberisrequired3, write(javamemberisrequired3.RemoteActionCompatParcelizer, javamemberisrequired3.AudioAttributesCompatParcelizer, bArr));
            }
            int length2 = javamemberisrequiredArr.length;
            while (i < length2) {
                IconCompatParcelizer(byteArrayOutputStream, javamemberisrequiredArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() != iWrite) {
            StringBuilder sb = new StringBuilder("The bytes saved do not match expectation. actual=");
            sb.append(byteArrayOutputStream.size());
            sb.append(" expected=");
            sb.append(iWrite);
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(sb.toString());
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int write(int i) {
        return read(i << 1) / 8;
    }

    private static int RemoteActionCompatParcelizer(int i, int i2) {
        return read(Integer.bitCount(i & (-2)) * i2) / 8;
    }

    private static void write(byte[] bArr, int i, int i2, javaMemberIsRequired javamemberisrequired) {
        int iWrite = write(i, i2, javamemberisrequired.MediaBrowserCompatItemReceiver);
        int i3 = iWrite / 8;
        bArr[i3] = (byte) ((1 << (iWrite % 8)) | bArr[i3]);
    }

    private static void RemoteActionCompatParcelizer(OutputStream outputStream, javaMemberIsRequired javamemberisrequired, String str) throws IOException {
        ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, ReflectionCacheBooleanTriState.write(str));
        ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, javamemberisrequired.write);
        ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, javamemberisrequired.MediaBrowserCompatCustomActionResultReceiver);
        ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, javamemberisrequired.IconCompatParcelizer);
        ReflectionCacheBooleanTriState.AudioAttributesCompatParcelizer(outputStream, javamemberisrequired.MediaBrowserCompatItemReceiver);
        ReflectionCacheBooleanTriState.read(outputStream, str);
    }

    private static void IconCompatParcelizer(OutputStream outputStream, javaMemberIsRequired javamemberisrequired) throws IOException {
        AudioAttributesCompatParcelizer(outputStream, javamemberisrequired);
        write(outputStream, javamemberisrequired);
        read(outputStream, javamemberisrequired);
    }

    private static void AudioAttributesCompatParcelizer(OutputStream outputStream, javaMemberIsRequired javamemberisrequired) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : javamemberisrequired.AudioAttributesImplApi26Parcelizer.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, iIntValue - i);
                ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    private static void write(OutputStream outputStream, javaMemberIsRequired javamemberisrequired) throws IOException {
        int iIntValue = 0;
        for (int i : javamemberisrequired.read) {
            Integer numValueOf = Integer.valueOf(i);
            ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(outputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    private static void IconCompatParcelizer(OutputStream outputStream, int i, javaMemberIsRequired javamemberisrequired) throws IOException {
        byte[] bArr = new byte[RemoteActionCompatParcelizer(i, javamemberisrequired.MediaBrowserCompatItemReceiver)];
        for (Map.Entry<Integer, Integer> entry : javamemberisrequired.AudioAttributesImplApi26Parcelizer.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i2 = 0;
            for (int i3 = 1; i3 <= 4; i3 <<= 1) {
                if (i3 != 1 && (i3 & i) != 0) {
                    if ((i3 & iIntValue2) == i3) {
                        int i4 = (javamemberisrequired.MediaBrowserCompatItemReceiver * i2) + iIntValue;
                        int i5 = i4 / 8;
                        bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
                    }
                    i2++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void read(OutputStream outputStream, javaMemberIsRequired javamemberisrequired) throws IOException {
        byte[] bArr = new byte[write(javamemberisrequired.MediaBrowserCompatItemReceiver)];
        for (Map.Entry<Integer, Integer> entry : javamemberisrequired.AudioAttributesImplApi26Parcelizer.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                write(bArr, 2, iIntValue, javamemberisrequired);
            }
            if ((iIntValue2 & 4) != 0) {
                write(bArr, 4, iIntValue, javamemberisrequired);
            }
        }
        outputStream.write(bArr);
    }

    static javaMemberIsRequired[] RemoteActionCompatParcelizer(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, accessgetEMPTYcp.MediaBrowserCompatCustomActionResultReceiver)) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Unsupported version");
        }
        int iRemoteActionCompatParcelizer = ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(inputStream);
        byte[] bArrWrite = ReflectionCacheBooleanTriState.write(inputStream, (int) ReflectionCacheBooleanTriState.read(inputStream), (int) ReflectionCacheBooleanTriState.read(inputStream));
        if (inputStream.read() > 0) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrWrite);
        try {
            javaMemberIsRequired[] javamemberisrequiredArrWrite = write(byteArrayInputStream, str, iRemoteActionCompatParcelizer);
            byteArrayInputStream.close();
            return javamemberisrequiredArrWrite;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static javaMemberIsRequired[] write(InputStream inputStream, byte[] bArr, byte[] bArr2, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        if (Arrays.equals(bArr, accessgetEMPTYcp.read)) {
            if (Arrays.equals(accessgetEMPTYcp.MediaBrowserCompatItemReceiver, bArr2)) {
                throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return IconCompatParcelizer(inputStream, bArr, javamemberisrequiredArr);
        }
        if (Arrays.equals(bArr, accessgetEMPTYcp.write)) {
            return RemoteActionCompatParcelizer(inputStream, bArr2, javamemberisrequiredArr);
        }
        throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Unsupported meta version");
    }

    private static javaMemberIsRequired[] IconCompatParcelizer(InputStream inputStream, byte[] bArr, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        if (!Arrays.equals(bArr, accessgetEMPTYcp.read)) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Unsupported meta version");
        }
        int iRemoteActionCompatParcelizer = ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(inputStream);
        byte[] bArrWrite = ReflectionCacheBooleanTriState.write(inputStream, (int) ReflectionCacheBooleanTriState.read(inputStream), (int) ReflectionCacheBooleanTriState.read(inputStream));
        if (inputStream.read() > 0) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrWrite);
        try {
            javaMemberIsRequired[] javamemberisrequiredArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(byteArrayInputStream, iRemoteActionCompatParcelizer, javamemberisrequiredArr);
            byteArrayInputStream.close();
            return javamemberisrequiredArrAudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static javaMemberIsRequired[] RemoteActionCompatParcelizer(InputStream inputStream, byte[] bArr, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        int iIconCompatParcelizer = ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
        byte[] bArrWrite = ReflectionCacheBooleanTriState.write(inputStream, (int) ReflectionCacheBooleanTriState.read(inputStream), (int) ReflectionCacheBooleanTriState.read(inputStream));
        if (inputStream.read() > 0) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrWrite);
        try {
            javaMemberIsRequired[] javamemberisrequiredArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteArrayInputStream, bArr, iIconCompatParcelizer, javamemberisrequiredArr);
            byteArrayInputStream.close();
            return javamemberisrequiredArrRemoteActionCompatParcelizer;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static javaMemberIsRequired[] RemoteActionCompatParcelizer(InputStream inputStream, byte[] bArr, int i, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        if (inputStream.available() == 0) {
            return new javaMemberIsRequired[0];
        }
        if (i != javamemberisrequiredArr.length) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            String strWrite = ReflectionCacheBooleanTriState.write(inputStream, ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream));
            long j = ReflectionCacheBooleanTriState.read(inputStream);
            int iIconCompatParcelizer = ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            javaMemberIsRequired javamemberisrequiredWrite = write(javamemberisrequiredArr, strWrite);
            if (javamemberisrequiredWrite == null) {
                throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Missing profile key: ".concat(String.valueOf(strWrite)));
            }
            javamemberisrequiredWrite.AudioAttributesImplApi21Parcelizer = j;
            int[] iArrWrite = write(inputStream, iIconCompatParcelizer);
            if (Arrays.equals(bArr, accessgetEMPTYcp.AudioAttributesCompatParcelizer)) {
                javamemberisrequiredWrite.write = iIconCompatParcelizer;
                javamemberisrequiredWrite.read = iArrWrite;
            }
        }
        return javamemberisrequiredArr;
    }

    private static javaMemberIsRequired write(javaMemberIsRequired[] javamemberisrequiredArr, String str) {
        if (javamemberisrequiredArr.length <= 0) {
            return null;
        }
        String str2 = read(str);
        for (int i = 0; i < javamemberisrequiredArr.length; i++) {
            if (javamemberisrequiredArr[i].AudioAttributesCompatParcelizer.equals(str2)) {
                return javamemberisrequiredArr[i];
            }
        }
        return null;
    }

    private static javaMemberIsRequired[] AudioAttributesCompatParcelizer(InputStream inputStream, int i, javaMemberIsRequired[] javamemberisrequiredArr) throws IOException {
        if (inputStream.available() == 0) {
            return new javaMemberIsRequired[0];
        }
        if (i != javamemberisrequiredArr.length) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iIconCompatParcelizer = ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            iArr[i2] = ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            strArr[i2] = ReflectionCacheBooleanTriState.write(inputStream, iIconCompatParcelizer);
        }
        for (int i3 = 0; i3 < i; i3++) {
            javaMemberIsRequired javamemberisrequired = javamemberisrequiredArr[i3];
            if (!javamemberisrequired.AudioAttributesCompatParcelizer.equals(strArr[i3])) {
                throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Order of dexfiles in metadata did not match baseline");
            }
            javamemberisrequired.write = iArr[i3];
            javamemberisrequired.read = write(inputStream, javamemberisrequired.write);
        }
        return javamemberisrequiredArr;
    }

    private static String write(String str, String str2, byte[] bArr) {
        String strIconCompatParcelizer = accessgetEMPTYcp.IconCompatParcelizer(bArr);
        if (str.length() <= 0) {
            return read(str2, strIconCompatParcelizer);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return read(str2, strIconCompatParcelizer);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(accessgetEMPTYcp.IconCompatParcelizer(bArr));
        sb.append(str2);
        return sb.toString();
    }

    private static String read(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String read(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static javaMemberIsRequired[] write(InputStream inputStream, String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new javaMemberIsRequired[0];
        }
        javaMemberIsRequired[] javamemberisrequiredArr = new javaMemberIsRequired[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iIconCompatParcelizer = ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            int iIconCompatParcelizer2 = ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            javamemberisrequiredArr[i2] = new javaMemberIsRequired(str, ReflectionCacheBooleanTriState.write(inputStream, iIconCompatParcelizer), ReflectionCacheBooleanTriState.read(inputStream), iIconCompatParcelizer2, (int) ReflectionCacheBooleanTriState.read(inputStream), (int) ReflectionCacheBooleanTriState.read(inputStream), new int[iIconCompatParcelizer2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            javaMemberIsRequired javamemberisrequired = javamemberisrequiredArr[i3];
            AudioAttributesCompatParcelizer(inputStream, javamemberisrequired);
            javamemberisrequired.read = write(inputStream, javamemberisrequired.write);
            write(inputStream, javamemberisrequired);
        }
        return javamemberisrequiredArr;
    }

    private static void AudioAttributesCompatParcelizer(InputStream inputStream, javaMemberIsRequired javamemberisrequired) throws IOException {
        int iAvailable = inputStream.available() - javamemberisrequired.MediaBrowserCompatCustomActionResultReceiver;
        int iIconCompatParcelizer = 0;
        while (inputStream.available() > iAvailable) {
            iIconCompatParcelizer += ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            javamemberisrequired.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(iIconCompatParcelizer), 1);
            for (int iIconCompatParcelizer2 = ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream); iIconCompatParcelizer2 > 0; iIconCompatParcelizer2--) {
                IconCompatParcelizer(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Read too much data during profile line parse");
        }
    }

    private static void IconCompatParcelizer(InputStream inputStream) throws IOException {
        ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
        int iRemoteActionCompatParcelizer = ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(inputStream);
        if (iRemoteActionCompatParcelizer == 6 || iRemoteActionCompatParcelizer == 7) {
            return;
        }
        while (iRemoteActionCompatParcelizer > 0) {
            ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(inputStream);
            for (int iRemoteActionCompatParcelizer2 = ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(inputStream); iRemoteActionCompatParcelizer2 > 0; iRemoteActionCompatParcelizer2--) {
                ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            }
            iRemoteActionCompatParcelizer--;
        }
    }

    private static int[] write(InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iIconCompatParcelizer = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iIconCompatParcelizer += ReflectionCacheBooleanTriState.IconCompatParcelizer(inputStream);
            iArr[i2] = iIconCompatParcelizer;
        }
        return iArr;
    }

    private static void write(InputStream inputStream, javaMemberIsRequired javamemberisrequired) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(ReflectionCacheBooleanTriState.read(inputStream, ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer(javamemberisrequired.MediaBrowserCompatItemReceiver << 1)));
        for (int i = 0; i < javamemberisrequired.MediaBrowserCompatItemReceiver; i++) {
            int iWrite = write(bitSetValueOf, i, javamemberisrequired.MediaBrowserCompatItemReceiver);
            if (iWrite != 0) {
                Integer num = javamemberisrequired.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                javamemberisrequired.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(i), Integer.valueOf(iWrite | num.intValue()));
            }
        }
    }

    private static int write(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(write(2, i, i2)) ? 2 : 0;
        return bitSet.get(write(4, i, i2)) ? i3 | 4 : i3;
    }

    private static int write(int i, int i2, int i3) {
        if (i == 1) {
            throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw ReflectionCacheBooleanTriState.RemoteActionCompatParcelizer("Unexpected flag: ".concat(String.valueOf(i)));
    }
}
