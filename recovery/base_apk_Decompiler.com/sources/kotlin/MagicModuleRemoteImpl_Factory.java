package kotlin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MagicModuleRemoteImpl_Factory extends fetchMagicModuleMeta {
    public static final byte[] read(File file) {
        toMagicModuleMetaRepoModel.write(file, "");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream fileInputStream2 = fileInputStream;
            long length = file.length();
            if (length > 2147483647L) {
                StringBuilder sb = new StringBuilder("File ");
                sb.append(file);
                sb.append(" is too big (");
                sb.append(length);
                sb.append(" bytes) to fit in memory.");
                throw new OutOfMemoryError(sb.toString());
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream2.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrCopyOf, "");
            } else {
                int i5 = fileInputStream2.read();
                if (i5 != -1) {
                    C0175getMcqCount c0175getMcqCount = new C0175getMcqCount();
                    c0175getMcqCount.write(i5);
                    getCorrectCount.read(fileInputStream2, c0175getMcqCount);
                    int size = c0175getMcqCount.size() + i;
                    if (size < 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("File ");
                        sb2.append(file);
                        sb2.append(" is too big to fit in memory.");
                        throw new OutOfMemoryError(sb2.toString());
                    }
                    byte[] bArrAudioAttributesCompatParcelizer = c0175getMcqCount.AudioAttributesCompatParcelizer();
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, size);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrCopyOf2, "");
                    bArrCopyOf = getOrderDetails.read(bArrAudioAttributesCompatParcelizer, bArrCopyOf2, i, 0, c0175getMcqCount.size());
                }
            }
            MagicModuleMetaLSModel.IconCompatParcelizer(fileInputStream, null);
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                MagicModuleMetaLSModel.IconCompatParcelizer(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void read(File file, byte[] bArr) {
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(bArr, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(fileOutputStream, null);
        } finally {
        }
    }

    public static final String AudioAttributesCompatParcelizer(File file, Charset charset) {
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(charset, "");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strWrite = getMagicModuleDetail.write(inputStreamReader);
            MagicModuleMetaLSModel.IconCompatParcelizer(inputStreamReader, null);
            return strWrite;
        } finally {
        }
    }

    public static final void RemoteActionCompatParcelizer(File file, String str, Charset charset) {
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(charset, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            downloadMagicModuleDetail.read(fileOutputStream, str, charset);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(fileOutputStream, null);
        } finally {
        }
    }

    public static final void read(OutputStream outputStream, String str, Charset charset) throws IOException {
        toMagicModuleMetaRepoModel.write(outputStream, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(charset, "");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderRemoteActionCompatParcelizer = downloadMagicModuleDetail.RemoteActionCompatParcelizer(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        toMagicModuleMetaRepoModel.write(charsetEncoderRemoteActionCompatParcelizer);
        ByteBuffer byteBufferRemoteActionCompatParcelizer = downloadMagicModuleDetail.RemoteActionCompatParcelizer(charsetEncoderRemoteActionCompatParcelizer);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cArrArray, "");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderRemoteActionCompatParcelizer.encode(charBufferAllocate, byteBufferRemoteActionCompatParcelizer, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferRemoteActionCompatParcelizer.array(), 0, byteBufferRemoteActionCompatParcelizer.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferRemoteActionCompatParcelizer.clear();
            i = i3;
        }
    }

    public static final CharsetEncoder RemoteActionCompatParcelizer(Charset charset) {
        toMagicModuleMetaRepoModel.write(charset, "");
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    public static final ByteBuffer RemoteActionCompatParcelizer(CharsetEncoder charsetEncoder) {
        toMagicModuleMetaRepoModel.write(charsetEncoder, "");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.ceil(charsetEncoder.maxBytesPerChar())) << 13);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(byteBufferAllocate, "");
        return byteBufferAllocate;
    }

    public static final void RemoteActionCompatParcelizer(File file, Charset charset, getAnswerMap<? super String, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(charset, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        getMagicModuleDetail.write(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), getanswermap);
    }

    public static final List<String> RemoteActionCompatParcelizer(File file, Charset charset) {
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(charset, "");
        final ArrayList arrayList = new ArrayList();
        downloadMagicModuleDetail.RemoteActionCompatParcelizer(file, charset, (getAnswerMap<? super String, getShowPopup>) new getAnswerMap() { // from class: o.MagicModuleService
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return MagicModuleRemoteImpl_Factory.AudioAttributesCompatParcelizer(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(ArrayList arrayList, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        arrayList.add(str);
        return getShowPopup.INSTANCE;
    }
}
