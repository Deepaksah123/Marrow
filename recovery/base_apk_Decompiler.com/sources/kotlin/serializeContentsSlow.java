package kotlin;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.marrow.data.models.video.VideoPlaybackConfiguration;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.SimpleBeanPropertyFilter1;

/* JADX INFO: loaded from: classes2.dex */
public final class serializeContentsSlow implements SimpleBeanPropertyFilter1 {
    public static final SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer write = new SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer() { // from class: o.UnwrappingBeanPropertyWriter
        @Override // o.SimpleBeanPropertyFilter1.AudioAttributesCompatParcelizer
        public final SimpleBeanPropertyFilter1 AudioAttributesCompatParcelizer(UUID uuid) {
            return serializeContentsSlow.write(uuid);
        }
    };
    private int AudioAttributesCompatParcelizer;
    private final UUID IconCompatParcelizer;
    private final MediaDrm RemoteActionCompatParcelizer;

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final int AudioAttributesCompatParcelizer() {
        return 2;
    }

    static /* synthetic */ SimpleBeanPropertyFilter1 write(UUID uuid) {
        try {
            return AudioAttributesCompatParcelizer(uuid);
        } catch (UnwrappingBeanPropertyWriter1 unused) {
            StringBuilder sb = new StringBuilder("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(uuid);
            sb.append(".");
            prune.AudioAttributesCompatParcelizer("FrameworkMediaDrm", sb.toString());
            return new TypeWrappedSerializer();
        }
    }

    private static serializeContentsSlow AudioAttributesCompatParcelizer(UUID uuid) throws UnwrappingBeanPropertyWriter1 {
        try {
            return new serializeContentsSlow(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnwrappingBeanPropertyWriter1(1, e);
        } catch (Exception e2) {
            throw new UnwrappingBeanPropertyWriter1(2, e2);
        }
    }

    private serializeContentsSlow(UUID uuid) throws UnsupportedSchemeException {
        buildTypeSerializer.write(!JsonMapFormatVisitor.write.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.IconCompatParcelizer = uuid;
        MediaDrm mediaDrm = new MediaDrm(IconCompatParcelizer(uuid));
        this.RemoteActionCompatParcelizer = mediaDrm;
        this.AudioAttributesCompatParcelizer = 1;
        if (JsonMapFormatVisitor.IconCompatParcelizer.equals(uuid) && AudioAttributesImplApi26Parcelizer()) {
            IconCompatParcelizer(mediaDrm);
        }
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void AudioAttributesCompatParcelizer(final SimpleBeanPropertyFilter1.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer.setOnEventListener(new MediaDrm.OnEventListener() { // from class: o.UnsupportedTypeSerializer
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                remoteActionCompatParcelizer.read(bArr, i);
            }
        });
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final byte[] read() throws MediaDrmException {
        return this.RemoteActionCompatParcelizer.openSession();
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void AudioAttributesCompatParcelizer(byte[] bArr) {
        this.RemoteActionCompatParcelizer.closeSession(bArr);
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void AudioAttributesCompatParcelizer(byte[] bArr, modifyArraySerializer modifyarrayserializer) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 31) {
            try {
                RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, bArr, modifyarrayserializer);
            } catch (UnsupportedOperationException unused) {
                prune.RemoteActionCompatParcelizer("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final SimpleBeanPropertyFilter1.read AudioAttributesCompatParcelizer(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataAudioAttributesCompatParcelizer;
        byte[] bArrWrite;
        String strIconCompatParcelizer;
        if (list != null) {
            schemeDataAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.IconCompatParcelizer, list);
            bArrWrite = write(this.IconCompatParcelizer, (byte[]) buildTypeSerializer.IconCompatParcelizer(schemeDataAudioAttributesCompatParcelizer.read));
            strIconCompatParcelizer = IconCompatParcelizer(this.IconCompatParcelizer, schemeDataAudioAttributesCompatParcelizer.IconCompatParcelizer);
        } else {
            schemeDataAudioAttributesCompatParcelizer = null;
            bArrWrite = null;
            strIconCompatParcelizer = null;
        }
        MediaDrm.KeyRequest keyRequest = this.RemoteActionCompatParcelizer.getKeyRequest(bArr, bArrWrite, strIconCompatParcelizer, i, map);
        byte[] bArrIconCompatParcelizer = IconCompatParcelizer(this.IconCompatParcelizer, keyRequest.getData());
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strAudioAttributesCompatParcelizer) && schemeDataAudioAttributesCompatParcelizer != null && !TextUtils.isEmpty(schemeDataAudioAttributesCompatParcelizer.write)) {
            strAudioAttributesCompatParcelizer = schemeDataAudioAttributesCompatParcelizer.write;
        }
        return new SimpleBeanPropertyFilter1.read(bArrIconCompatParcelizer, strAudioAttributesCompatParcelizer, LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    private String AudioAttributesCompatParcelizer(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 33 && "https://default.url".equals(str)) {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("version");
            if (Objects.equals(strRemoteActionCompatParcelizer, "1.2") || Objects.equals(strRemoteActionCompatParcelizer, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final byte[] AudioAttributesCompatParcelizer(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (JsonMapFormatVisitor.AudioAttributesCompatParcelizer.equals(this.IconCompatParcelizer)) {
            bArr2 = serializeDynamic.RemoteActionCompatParcelizer(bArr2);
        }
        return this.RemoteActionCompatParcelizer.provideKeyResponse(bArr, bArr2);
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final SimpleBeanPropertyFilter1.IconCompatParcelizer RemoteActionCompatParcelizer() {
        MediaDrm.ProvisionRequest provisionRequest = this.RemoteActionCompatParcelizer.getProvisionRequest();
        return new SimpleBeanPropertyFilter1.IconCompatParcelizer(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void read(byte[] bArr) throws DeniedByServerException {
        this.RemoteActionCompatParcelizer.provideProvisionResponse(bArr);
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final Map<String, String> write(byte[] bArr) {
        return this.RemoteActionCompatParcelizer.queryKeyStatus(bArr);
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final boolean RemoteActionCompatParcelizer(byte[] bArr, String str) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 31 && IconCompatParcelizer()) {
            zRequiresSecureDecoderComponent = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, str);
        } else {
            MediaCrypto mediaCrypto = null;
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(this.IconCompatParcelizer, bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (zRequiresSecureDecoderComponent) {
            if (!MediaBrowserCompatCustomActionResultReceiver()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void write() {
        synchronized (this) {
            int i = this.AudioAttributesCompatParcelizer - 1;
            this.AudioAttributesCompatParcelizer = i;
            if (i == 0) {
                this.RemoteActionCompatParcelizer.release();
            }
        }
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2) {
        this.RemoteActionCompatParcelizer.restoreKeys(bArr, bArr2);
    }

    private String RemoteActionCompatParcelizer(String str) {
        return this.RemoteActionCompatParcelizer.getPropertyString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.SimpleBeanPropertyFilter1
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public StringCollectionSerializer IconCompatParcelizer(byte[] bArr) throws MediaCryptoException {
        return new StringCollectionSerializer(IconCompatParcelizer(this.IconCompatParcelizer), bArr, MediaBrowserCompatCustomActionResultReceiver());
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && JsonMapFormatVisitor.IconCompatParcelizer.equals(this.IconCompatParcelizer) && VideoPlaybackConfiguration.WIDEVINE_LVL_L3.equals(RemoteActionCompatParcelizer("securityLevel"));
    }

    private boolean IconCompatParcelizer() {
        if (this.IconCompatParcelizer.equals(JsonMapFormatVisitor.IconCompatParcelizer)) {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("version");
            return (strRemoteActionCompatParcelizer.startsWith("v5.") || strRemoteActionCompatParcelizer.startsWith("14.") || strRemoteActionCompatParcelizer.startsWith("15.") || strRemoteActionCompatParcelizer.startsWith("16.0")) ? false : true;
        }
        return this.IconCompatParcelizer.equals(JsonMapFormatVisitor.AudioAttributesCompatParcelizer);
    }

    private static DrmInitData.SchemeData AudioAttributesCompatParcelizer(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!JsonMapFormatVisitor.IconCompatParcelizer.equals(uuid)) {
            return list.get(0);
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int length = 0;
            for (int i = 0; i < list.size(); i++) {
                DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr = (byte[]) buildTypeSerializer.IconCompatParcelizer(schemeData2.read);
                if (LaissezFaireSubTypeValidator.read(schemeData2.IconCompatParcelizer, schemeData.IconCompatParcelizer) && LaissezFaireSubTypeValidator.read(schemeData2.write, schemeData.write) && appendCompletedChunk.read(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                byte[] bArr3 = (byte[]) buildTypeSerializer.IconCompatParcelizer(list.get(i3).read);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i2, length2);
                i2 += length2;
            }
            return schemeData.IconCompatParcelizer(bArr2);
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            DrmInitData.SchemeData schemeData3 = list.get(i4);
            int iAudioAttributesCompatParcelizer = appendCompletedChunk.AudioAttributesCompatParcelizer((byte[]) buildTypeSerializer.IconCompatParcelizer(schemeData3.read));
            if ((LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 23 && iAudioAttributesCompatParcelizer == 0) || (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && iAudioAttributesCompatParcelizer == 1)) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    private static UUID IconCompatParcelizer(UUID uuid) {
        return (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 27 || !JsonMapFormatVisitor.AudioAttributesCompatParcelizer.equals(uuid)) ? uuid : JsonMapFormatVisitor.write;
    }

    private static byte[] write(UUID uuid, byte[] bArr) {
        byte[] bArrWrite;
        if (JsonMapFormatVisitor.RemoteActionCompatParcelizer.equals(uuid)) {
            byte[] bArrWrite2 = appendCompletedChunk.write(bArr, uuid);
            if (bArrWrite2 != null) {
                bArr = bArrWrite2;
            }
            bArr = appendCompletedChunk.write(JsonMapFormatVisitor.RemoteActionCompatParcelizer, RemoteActionCompatParcelizer(bArr));
        }
        return (((LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 || !JsonMapFormatVisitor.IconCompatParcelizer.equals(uuid)) && !(JsonMapFormatVisitor.RemoteActionCompatParcelizer.equals(uuid) && "Amazon".equals(LaissezFaireSubTypeValidator.read) && ("AFTB".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) || "AFTS".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) || "AFTM".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) || "AFTT".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver)))) || (bArrWrite = appendCompletedChunk.write(bArr, uuid)) == null) ? bArr : bArrWrite;
    }

    private static String IconCompatParcelizer(UUID uuid, String str) {
        return (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 26 && JsonMapFormatVisitor.AudioAttributesCompatParcelizer.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) ? C.CENC_TYPE_cenc : str;
    }

    private static byte[] IconCompatParcelizer(UUID uuid, byte[] bArr) {
        return JsonMapFormatVisitor.AudioAttributesCompatParcelizer.equals(uuid) ? serializeDynamic.AudioAttributesCompatParcelizer(bArr) : bArr;
    }

    private static void IconCompatParcelizer(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", VideoPlaybackConfiguration.WIDEVINE_LVL_L3);
    }

    private static boolean AudioAttributesImplApi26Parcelizer() {
        return "ASUS_Z00AD".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver);
    }

    private static byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(bArr);
        int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
        short sMediaBrowserCompatSearchResultReceiver = asPropertyTypeDeserializer.MediaBrowserCompatSearchResultReceiver();
        short sMediaBrowserCompatSearchResultReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatSearchResultReceiver();
        if (sMediaBrowserCompatSearchResultReceiver != 1 || sMediaBrowserCompatSearchResultReceiver2 != 1) {
            prune.write("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        String strAudioAttributesCompatParcelizer = asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatSearchResultReceiver(), parseMdtaFromMeta.read);
        if (strAudioAttributesCompatParcelizer.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strAudioAttributesCompatParcelizer.indexOf("</DATA>");
        if (iIndexOf == -1) {
            prune.RemoteActionCompatParcelizer("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strAudioAttributesCompatParcelizer.substring(0, iIndexOf));
        sb.append("<LA_URL>https://x</LA_URL>");
        sb.append(strAudioAttributesCompatParcelizer.substring(iIndexOf));
        String string = sb.toString();
        int i = iMediaMetadataCompat + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sMediaBrowserCompatSearchResultReceiver);
        byteBufferAllocate.putShort(sMediaBrowserCompatSearchResultReceiver2);
        byteBufferAllocate.putShort((short) (string.length() << 1));
        byteBufferAllocate.put(string.getBytes(parseMdtaFromMeta.read));
        return byteBufferAllocate.array();
    }

    static class RemoteActionCompatParcelizer {
        public static boolean AudioAttributesCompatParcelizer(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void AudioAttributesCompatParcelizer(MediaDrm mediaDrm, byte[] bArr, modifyArraySerializer modifyarrayserializer) {
            LogSessionId logSessionIdCJ_ = modifyarrayserializer.cJ_();
            if (logSessionIdCJ_.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) buildTypeSerializer.IconCompatParcelizer(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdCJ_);
        }
    }
}
