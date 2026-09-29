package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 ;2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001;B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010 J/\u0010\b\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0000¢\u0006\u0004\b&\u0010\u001cJ\r\u0010'\u001a\u00020\u0000¢\u0006\u0004\b'\u0010\u001cJ\u0015\u0010\b\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010(J\u000f\u0010)\u001a\u00020\u0000H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010\u001aJ\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010\tJ\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010\tJ'\u0010\b\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0010¢\u0006\u0004\b\b\u0010.J\u0017\u00100\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u000b\u0010\u001aR\"\u0010\u0017\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b\r\u0010\u0016\"\u0004\b\u0018\u00105R\u0011\u0010\b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b6\u0010\u0016R$\u00107\u001a\u0004\u0018\u00010\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\t\"\u0004\b\u0018\u0010:"}, d2 = {"Lo/getRelatedModuleAdapter;", "Ljava/io/Serializable;", "", "", "p0", "<init>", "([B)V", "", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "", "read", "(Lo/getRelatedModuleAdapter;)I", "IconCompatParcelizer", "(Ljava/lang/String;)Lo/getRelatedModuleAdapter;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "(I)B", "write", "()I", "hashCode", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "()[B", "AudioAttributesImplBaseParcelizer", "()Lo/getRelatedModuleAdapter;", "p1", "p2", "p3", "(I[BII)Z", "(ILo/getRelatedModuleAdapter;I)Z", "Ljava/io/ObjectInputStream;", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "(Lo/getRelatedModuleAdapter;)Z", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "toString", "MediaDescriptionCompat", "Lo/resetCurrentSelectedPosition;", "(Lo/resetCurrentSelectedPosition;II)V", "Ljava/io/ObjectOutputStream;", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "data", "[B", "I", "(I)V", "MediaBrowserCompatCustomActionResultReceiver", "utf8", "Ljava/lang/String;", "MediaMetadataCompat", "(Ljava/lang/String;)V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class getRelatedModuleAdapter implements Serializable, Comparable<getRelatedModuleAdapter> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final getRelatedModuleAdapter EMPTY = new getRelatedModuleAdapter(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    public getRelatedModuleAdapter(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        this.data = bArr;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.hashCode = i;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    private String getUtf8() {
        return this.utf8;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.utf8 = str;
    }

    public final getRelatedModuleAdapter AudioAttributesImplBaseParcelizer() {
        return IconCompatParcelizer("MD5");
    }

    public final getRelatedModuleAdapter AudioAttributesImplApi21Parcelizer() {
        return IconCompatParcelizer("SHA-1");
    }

    public final getRelatedModuleAdapter AudioAttributesImplApi26Parcelizer() {
        return IconCompatParcelizer("SHA-256");
    }

    public getRelatedModuleAdapter IconCompatParcelizer(String p0) throws NoSuchAlgorithmException {
        toMagicModuleMetaRepoModel.write(p0, "");
        MessageDigest messageDigest = MessageDigest.getInstance(p0);
        messageDigest.update(this.data, 0, MediaBrowserCompatCustomActionResultReceiver());
        byte[] bArrDigest = messageDigest.digest();
        toMagicModuleMetaRepoModel.write(bArrDigest);
        return new getRelatedModuleAdapter(bArrDigest);
    }

    public final byte read(int p0) {
        return write(p0);
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return write();
    }

    public void AudioAttributesCompatParcelizer(resetCurrentSelectedPosition p0, int p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setTimelines.IconCompatParcelizer(this, p0, 0, p2);
    }

    private final void readObject(ObjectInputStream p0) throws IllegalAccessException, NoSuchFieldException, IOException {
        getRelatedModuleAdapter getrelatedmoduleadapterWrite = Companion.write(p0, p0.readInt());
        Field declaredField = getRelatedModuleAdapter.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, getrelatedmoduleadapterWrite.data);
    }

    private final void writeObject(ObjectOutputStream p0) throws IOException {
        p0.writeInt(this.data.length);
        p0.write(this.data);
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", "string", "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", "offset", "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getRelatedModuleAdapter RemoteActionCompatParcelizer(String str, Charset charset) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(charset, "");
            byte[] bytes = str.getBytes(charset);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            return new getRelatedModuleAdapter(bytes);
        }

        @getMagicModuleMeta
        public static getRelatedModuleAdapter write(InputStream inputStream, int i) throws IOException {
            toMagicModuleMetaRepoModel.write(inputStream, "");
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i)).toString());
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new EOFException();
                }
                i2 += i3;
            }
            return new getRelatedModuleAdapter(bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @getMagicModuleMeta
        public static getRelatedModuleAdapter IconCompatParcelizer(byte[] bArr, int i, int i2) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            int iIconCompatParcelizer = isConciseModeOn.IconCompatParcelizer(bArr, i2);
            isConciseModeOn.write(bArr.length, 0L, iIconCompatParcelizer);
            return new getRelatedModuleAdapter(getOrderDetails.write(bArr, 0, iIconCompatParcelizer));
        }

        @getMagicModuleMeta
        public static getRelatedModuleAdapter RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            getRelatedModuleAdapter getrelatedmoduleadapter = new getRelatedModuleAdapter(setMarkers.read(str));
            getrelatedmoduleadapter.RemoteActionCompatParcelizer(str);
            return getrelatedmoduleadapter;
        }

        @getMagicModuleMeta
        public static getRelatedModuleAdapter IconCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            byte[] bArrIconCompatParcelizer = setConciseModeOn.IconCompatParcelizer(str);
            if (bArrIconCompatParcelizer != null) {
                return new getRelatedModuleAdapter(bArrIconCompatParcelizer);
            }
            return null;
        }

        @getMagicModuleMeta
        public static getRelatedModuleAdapter write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) ((setTimelines.write(str.charAt(i2)) << 4) + setTimelines.write(str.charAt(i2 + 1)));
            }
            return new getRelatedModuleAdapter(bArr);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String MediaDescriptionCompat() {
        String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String strAudioAttributesCompatParcelizer = setMarkers.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver());
        RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer);
        return strAudioAttributesCompatParcelizer;
    }

    public String AudioAttributesCompatParcelizer() {
        return setConciseModeOn.write(getData(), setConciseModeOn.IconCompatParcelizer);
    }

    public String RemoteActionCompatParcelizer() {
        char[] cArr = new char[getData().length << 1];
        byte[] data = getData();
        int length = data.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b = data[i2];
            cArr[i] = setTimelines.RemoteActionCompatParcelizer()[(b >> 4) & 15];
            cArr[i + 1] = setTimelines.RemoteActionCompatParcelizer()[b & 15];
            i2++;
            i += 2;
        }
        return TestGroupLSModel.IconCompatParcelizer(cArr);
    }

    public getRelatedModuleAdapter MediaBrowserCompatMediaItem() {
        for (int i = 0; i < getData().length; i++) {
            byte b = getData()[i];
            if (b >= 65 && b <= 90) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrCopyOf, "");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new getRelatedModuleAdapter(bArrCopyOf);
            }
        }
        return this;
    }

    public byte write(int p0) {
        return getData()[p0];
    }

    public int write() {
        return getData().length;
    }

    public byte[] MediaBrowserCompatSearchResultReceiver() {
        byte[] data = getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrCopyOf, "");
        return bArrCopyOf;
    }

    public byte[] MediaBrowserCompatItemReceiver() {
        return getData();
    }

    public boolean AudioAttributesCompatParcelizer(int i, getRelatedModuleAdapter getrelatedmoduleadapter, int i2) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        return getrelatedmoduleadapter.write(0, getData(), 0, i2);
    }

    public boolean write(int p0, byte[] p1, int p2, int p3) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return p0 >= 0 && p0 <= getData().length - p3 && p2 >= 0 && p2 <= p1.length - p3 && isConciseModeOn.write(getData(), p0, p1, p2, p3);
    }

    public final boolean AudioAttributesCompatParcelizer(getRelatedModuleAdapter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(0, p0, p0.MediaBrowserCompatCustomActionResultReceiver());
    }

    public boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (p0 instanceof getRelatedModuleAdapter) {
            getRelatedModuleAdapter getrelatedmoduleadapter = (getRelatedModuleAdapter) p0;
            if (getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver() == getData().length && getrelatedmoduleadapter.write(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(getData());
        RemoteActionCompatParcelizer(iHashCode);
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public int compareTo(getRelatedModuleAdapter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        int iMediaBrowserCompatCustomActionResultReceiver2 = p0.MediaBrowserCompatCustomActionResultReceiver();
        int iMin = Math.min(iMediaBrowserCompatCustomActionResultReceiver, iMediaBrowserCompatCustomActionResultReceiver2);
        for (int i = 0; i < iMin; i++) {
            int i2 = read(i) & 255;
            int i3 = p0.read(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (iMediaBrowserCompatCustomActionResultReceiver == iMediaBrowserCompatCustomActionResultReceiver2) {
            return 0;
        }
        return iMediaBrowserCompatCustomActionResultReceiver < iMediaBrowserCompatCustomActionResultReceiver2 ? -1 : 1;
    }

    public String toString() {
        if (getData().length == 0) {
            return "[size=0]";
        }
        int iIconCompatParcelizer = setTimelines.IconCompatParcelizer(getData(), 64);
        if (iIconCompatParcelizer == -1) {
            if (getData().length <= 64) {
                StringBuilder sb = new StringBuilder("[hex=");
                sb.append(RemoteActionCompatParcelizer());
                sb.append(']');
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("[size=");
            sb2.append(getData().length);
            sb2.append(" hex=");
            int iIconCompatParcelizer2 = isConciseModeOn.IconCompatParcelizer(this);
            if (iIconCompatParcelizer2 > getData().length) {
                StringBuilder sb3 = new StringBuilder("endIndex > length(");
                sb3.append(getData().length);
                sb3.append(')');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            if (iIconCompatParcelizer2 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            if (iIconCompatParcelizer2 != getData().length) {
                this = new getRelatedModuleAdapter(getOrderDetails.write(getData(), 0, iIconCompatParcelizer2));
            }
            sb2.append(this.RemoteActionCompatParcelizer());
            sb2.append("…]");
            return sb2.toString();
        }
        String strMediaDescriptionCompat = MediaDescriptionCompat();
        String strSubstring = strMediaDescriptionCompat.substring(0, iIconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        String str = TestGroupLSModel.read(TestGroupLSModel.read(TestGroupLSModel.read(strSubstring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
        if (iIconCompatParcelizer < strMediaDescriptionCompat.length()) {
            StringBuilder sb4 = new StringBuilder("[size=");
            sb4.append(getData().length);
            sb4.append(" text=");
            sb4.append(str);
            sb4.append("…]");
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder("[text=");
        sb5.append(str);
        sb5.append(']');
        return sb5.toString();
    }

    @getMagicModuleMeta
    public static final getRelatedModuleAdapter read(String str) {
        return Companion.RemoteActionCompatParcelizer(str);
    }
}
