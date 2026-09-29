package kotlin;

import android.content.Context;
import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\t\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0012"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda44;", "", "<init>", "()V", "Ljava/io/File;", "IconCompatParcelizer", "()Ljava/io/File;", "", "p0", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "AudioAttributesCompatParcelizer", "(Ljava/io/File;)Ljava/util/Map;", "", "p1", "", "(Ljava/lang/String;I)[I"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda44 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda44 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda44();

    private DefaultAnalyticsCollectorExternalSyntheticLambda44() {
    }

    public final int[] RemoteActionCompatParcelizer(String p0, int p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            int[] iArr = new int[128];
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
            Charset charsetForName = Charset.forName(CharsetNames.UTF_8);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName, "");
            if (strRemoteActionCompatParcelizer == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = strRemoteActionCompatParcelizer.getBytes(charsetForName);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            for (int i = 0; i < 128; i++) {
                if (i < bytes.length) {
                    iArr[i] = bytes[i] & 255;
                } else {
                    iArr[i] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final File IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda44.class)) {
            return null;
        }
        try {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            File file = new File(contextAudioAttributesCompatParcelizer.getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda44.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final Map<String, DefaultAnalyticsCollectorExternalSyntheticLambda4> AudioAttributesCompatParcelizer(File p0) {
        int i;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda44.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                FileInputStream fileInputStream = new FileInputStream(p0);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                int i2 = 0;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(byteBufferWrap, "");
                int i3 = byteBufferWrap.getInt();
                int i4 = i3 + 4;
                if (iAvailable < i4) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3, getSubmissionTimestamp.IconCompatParcelizer));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[i5] = jSONArrayNames.getString(i5);
                }
                getOrderDetails.AudioAttributesCompatParcelizer(strArr);
                HashMap map = new HashMap();
                int i6 = 0;
                while (i6 < length) {
                    String str = strArr[i6];
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i7 = 1;
                        while (i2 < length2) {
                            int i8 = jSONArray.getInt(i2);
                            iArr[i2] = i8;
                            i7 *= i8;
                            i2++;
                        }
                        int i9 = i7 << 2;
                        int i10 = i4 + i9;
                        if (i10 > iAvailable) {
                            return null;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i4, i9);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        DefaultAnalyticsCollectorExternalSyntheticLambda4 defaultAnalyticsCollectorExternalSyntheticLambda4 = new DefaultAnalyticsCollectorExternalSyntheticLambda4(iArr);
                        i = 0;
                        byteBufferWrap2.asFloatBuffer().get(defaultAnalyticsCollectorExternalSyntheticLambda4.getRead(), 0, i7);
                        map.put(str, defaultAnalyticsCollectorExternalSyntheticLambda4);
                        i4 = i10;
                    } else {
                        i = i2;
                    }
                    i6++;
                    i2 = i;
                }
                return map;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda44.class);
            return null;
        }
    }

    private String RemoteActionCompatParcelizer(String p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = p0;
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = toMagicModuleMetaRepoModel.read((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            Object[] array = new newYearNameItem("\\s+").read(str.subSequence(i, length + 1).toString()).toArray(new String[0]);
            if (array != null) {
                String strJoin = TextUtils.join(" ", (String[]) array);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strJoin, "");
                return strJoin;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }
}
