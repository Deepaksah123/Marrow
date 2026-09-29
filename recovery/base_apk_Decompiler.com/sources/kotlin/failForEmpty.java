package kotlin;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.SimpleBeanPropertyFilter1;
import kotlin.SubTypeValidator;
import kotlin._deserializeWithNativeTypeId;
import kotlin._hasTypeResolver;

/* JADX INFO: loaded from: classes2.dex */
public final class failForEmpty implements UnknownSerializer {
    private final _hasTypeResolver.write IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final Map<String, String> read;
    private final boolean write;

    public failForEmpty(String str, boolean z, _hasTypeResolver.write writeVar) {
        buildTypeSerializer.IconCompatParcelizer((z && TextUtils.isEmpty(str)) ? false : true);
        this.IconCompatParcelizer = writeVar;
        this.RemoteActionCompatParcelizer = str;
        this.write = z;
        this.read = new HashMap();
    }

    public final void AudioAttributesCompatParcelizer(String str, String str2) {
        synchronized (this.read) {
            this.read.put(str, str2);
        }
    }

    @Override // kotlin.UnknownSerializer
    public final byte[] write(SimpleBeanPropertyFilter1.IconCompatParcelizer iconCompatParcelizer) throws writeAsId {
        StringBuilder sb = new StringBuilder();
        sb.append(iconCompatParcelizer.AudioAttributesCompatParcelizer());
        sb.append("&signedRequest=");
        sb.append(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(iconCompatParcelizer.read()));
        return read(this.IconCompatParcelizer, sb.toString(), null, Collections.emptyMap());
    }

    @Override // kotlin.UnknownSerializer
    public final byte[] IconCompatParcelizer(UUID uuid, SimpleBeanPropertyFilter1.read readVar) throws writeAsId {
        String str;
        String strIconCompatParcelizer = readVar.IconCompatParcelizer();
        if (this.write || TextUtils.isEmpty(strIconCompatParcelizer)) {
            strIconCompatParcelizer = this.RemoteActionCompatParcelizer;
        }
        if (TextUtils.isEmpty(strIconCompatParcelizer)) {
            throw new writeAsId(new SubTypeValidator.write().IconCompatParcelizer(Uri.EMPTY).write(), Uri.EMPTY, onMoovContainerAtomRead.AudioAttributesCompatParcelizer(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        if (JsonMapFormatVisitor.RemoteActionCompatParcelizer.equals(uuid)) {
            str = "text/xml";
        } else {
            str = JsonMapFormatVisitor.AudioAttributesCompatParcelizer.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put(RtspHeaders.CONTENT_TYPE, str);
        if (JsonMapFormatVisitor.RemoteActionCompatParcelizer.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.read) {
            map.putAll(this.read);
        }
        return read(this.IconCompatParcelizer, strIconCompatParcelizer, readVar.AudioAttributesCompatParcelizer(), map);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:9|21|10|(2:12|13)(2:26|15)) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r1 = write(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r8 = r8 + 1;
        r9 = r9.read().read(r1).write();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        kotlin.LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r11 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] read(o._hasTypeResolver.write r8, java.lang.String r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) throws kotlin.writeAsId {
        /*
            o._handleUnknownTypeId r0 = new o._handleUnknownTypeId
            o._hasTypeResolver r8 = r8.write()
            r0.<init>(r8)
            o.SubTypeValidator$write r8 = new o.SubTypeValidator$write
            r8.<init>()
            o.SubTypeValidator$write r8 = r8.read(r9)
            o.SubTypeValidator$write r8 = r8.read(r11)
            o.SubTypeValidator$write r8 = r8.RemoteActionCompatParcelizer()
            o.SubTypeValidator$write r8 = r8.read(r10)
            r9 = 1
            o.SubTypeValidator$write r8 = r8.read(r9)
            o.SubTypeValidator r2 = r8.write()
            r8 = 0
            r9 = r2
        L29:
            o.verifyBaseTypeValidity r10 = new o.verifyBaseTypeValidity     // Catch: java.lang.Exception -> L56
            r10.<init>(r0, r9)     // Catch: java.lang.Exception -> L56
            byte[] r8 = kotlin.resetFragmentInfo.AudioAttributesCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L36 o._deserializeWithNativeTypeId.write -> L38
            kotlin.LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(r10)     // Catch: java.lang.Exception -> L56
            return r8
        L36:
            r8 = move-exception
            goto L52
        L38:
            r11 = move-exception
            java.lang.String r1 = write(r11, r8)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L51
            int r8 = r8 + 1
            o.SubTypeValidator$write r9 = r9.read()     // Catch: java.lang.Throwable -> L36
            o.SubTypeValidator$write r9 = r9.read(r1)     // Catch: java.lang.Throwable -> L36
            o.SubTypeValidator r9 = r9.write()     // Catch: java.lang.Throwable -> L36
            kotlin.LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(r10)     // Catch: java.lang.Exception -> L56
            goto L29
        L51:
            throw r11     // Catch: java.lang.Throwable -> L36
        L52:
            kotlin.LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(r10)     // Catch: java.lang.Exception -> L56
            throw r8     // Catch: java.lang.Exception -> L56
        L56:
            r8 = move-exception
            r7 = r8
            android.net.Uri r8 = r0.RemoteActionCompatParcelizer()
            java.lang.Object r8 = kotlin.buildTypeSerializer.IconCompatParcelizer(r8)
            r3 = r8
            android.net.Uri r3 = (android.net.Uri) r3
            java.util.Map r4 = r0.read()
            o.writeAsId r8 = new o.writeAsId
            long r5 = r0.write()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.failForEmpty.read(o._hasTypeResolver$write, java.lang.String, byte[], java.util.Map):byte[]");
    }

    private static String write(_deserializeWithNativeTypeId.write writeVar, int i) {
        Map<String, List<String>> map;
        List<String> list;
        if ((writeVar.AudioAttributesImplApi26Parcelizer != 307 && writeVar.AudioAttributesImplApi26Parcelizer != 308) || i >= 5 || (map = writeVar.RemoteActionCompatParcelizer) == null || (list = map.get(RtspHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
