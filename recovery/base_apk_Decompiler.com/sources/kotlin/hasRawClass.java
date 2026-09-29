package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u0002\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0003\u001a\u0011\u0010\r\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\r\u0010\b\u001a\u0011\u0010\u000e\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/isAbstract;", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(Lo/isAbstract;)J", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "(Lo/isAbstract;)Lo/WritableTypeIdInclusion;", "", "p0", "(Lo/isAbstract;Z)Lo/WritableTypeIdInclusion;", "read", "write", "RemoteActionCompatParcelizer", "(Lo/isAbstract;)Lo/isAbstract;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hasRawClass {
    public static final long AudioAttributesCompatParcelizer(isAbstract isabstract) {
        return isabstract.IconCompatParcelizer(getReferencedType.INSTANCE.write());
    }

    public static final long AudioAttributesImplApi26Parcelizer(isAbstract isabstract) {
        return isabstract.read(getReferencedType.INSTANCE.write());
    }

    public static final long MediaBrowserCompatCustomActionResultReceiver(isAbstract isabstract) {
        return isabstract.RemoteActionCompatParcelizer(getReferencedType.INSTANCE.write());
    }

    public static final WritableTypeIdInclusion IconCompatParcelizer(isAbstract isabstract) {
        return isAbstract.write$default(RemoteActionCompatParcelizer(isabstract), isabstract, false, 2, null);
    }

    public static /* synthetic */ WritableTypeIdInclusion AudioAttributesCompatParcelizer$default(isAbstract isabstract, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return AudioAttributesCompatParcelizer(isabstract, z);
    }

    public static final WritableTypeIdInclusion AudioAttributesCompatParcelizer(isAbstract isabstract, boolean z) {
        isAbstract isabstractRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(isabstract);
        float fWrite = (int) (isabstractRemoteActionCompatParcelizer.write() >> 32);
        float fWrite2 = (int) isabstractRemoteActionCompatParcelizer.write();
        WritableTypeIdInclusion writableTypeIdInclusionWrite = isabstractRemoteActionCompatParcelizer.write(isabstract, z);
        float audioAttributesCompatParcelizer = writableTypeIdInclusionWrite.getAudioAttributesCompatParcelizer();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            if (audioAttributesCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                audioAttributesCompatParcelizer = 0.0f;
            }
            if (audioAttributesCompatParcelizer > fWrite) {
                audioAttributesCompatParcelizer = fWrite;
            }
        }
        float remoteActionCompatParcelizer = writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer();
        if (z) {
            if (remoteActionCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                remoteActionCompatParcelizer = 0.0f;
            }
            if (remoteActionCompatParcelizer > fWrite2) {
                remoteActionCompatParcelizer = fWrite2;
            }
        }
        if (z) {
            float write = writableTypeIdInclusionWrite.getWrite();
            if (write < BitmapDescriptorFactory.HUE_RED) {
                write = 0.0f;
            }
            if (write <= fWrite) {
                fWrite = write;
            }
        } else {
            fWrite = writableTypeIdInclusionWrite.getWrite();
        }
        if (z) {
            float iconCompatParcelizer = writableTypeIdInclusionWrite.getIconCompatParcelizer();
            if (iconCompatParcelizer >= BitmapDescriptorFactory.HUE_RED) {
                f = iconCompatParcelizer;
            }
            if (f <= fWrite2) {
                fWrite2 = f;
            }
        } else {
            fWrite2 = writableTypeIdInclusionWrite.getIconCompatParcelizer();
        }
        if (audioAttributesCompatParcelizer == fWrite || remoteActionCompatParcelizer == fWrite2) {
            return WritableTypeIdInclusion.INSTANCE.write();
        }
        long j = -1;
        long j2 = isabstractRemoteActionCompatParcelizer.read(getReferencedType.AudioAttributesCompatParcelizer((((j - ((j >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(remoteActionCompatParcelizer))) | (Float.floatToRawIntBits(audioAttributesCompatParcelizer) << 32)));
        long j3 = -1;
        long j4 = isabstractRemoteActionCompatParcelizer.read(getReferencedType.AudioAttributesCompatParcelizer((((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(remoteActionCompatParcelizer))) | (Float.floatToRawIntBits(fWrite) << 32)));
        long j5 = -1;
        long j6 = isabstractRemoteActionCompatParcelizer.read(getReferencedType.AudioAttributesCompatParcelizer((((j5 - ((j5 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(fWrite2))) | (Float.floatToRawIntBits(fWrite) << 32)));
        long j7 = -1;
        long j8 = isabstractRemoteActionCompatParcelizer.read(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fWrite2)) & ((j7 - ((j7 >> 63) << 32)) | (((long) 0) << 32))) | (((long) Float.floatToRawIntBits(audioAttributesCompatParcelizer)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j6 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) j2);
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) j4);
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) j8);
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) j6);
        return new WritableTypeIdInclusion(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final long read(isAbstract isabstract) {
        isAbstract isabstractRemoteActionCompatParcelizer = isabstract.RemoteActionCompatParcelizer();
        return isabstractRemoteActionCompatParcelizer != null ? isabstractRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(isabstract, getReferencedType.INSTANCE.write()) : getReferencedType.INSTANCE.write();
    }

    public static final WritableTypeIdInclusion write(isAbstract isabstract) {
        WritableTypeIdInclusion writableTypeIdInclusionWrite$default;
        isAbstract isabstractRemoteActionCompatParcelizer = isabstract.RemoteActionCompatParcelizer();
        return (isabstractRemoteActionCompatParcelizer == null || (writableTypeIdInclusionWrite$default = isAbstract.write$default(isabstractRemoteActionCompatParcelizer, isabstract, false, 2, null)) == null) ? new WritableTypeIdInclusion(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (isabstract.write() >> 32), (int) isabstract.write()) : writableTypeIdInclusionWrite$default;
    }

    public static final isAbstract RemoteActionCompatParcelizer(isAbstract isabstract) {
        isAbstract isabstractRemoteActionCompatParcelizer = isabstract.RemoteActionCompatParcelizer();
        while (isabstractRemoteActionCompatParcelizer != null) {
            isAbstract isabstract2 = isabstractRemoteActionCompatParcelizer;
            isabstractRemoteActionCompatParcelizer = isabstractRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            isabstract = isabstract2;
        }
        _bindAndClose _bindandclose = isabstract instanceof _bindAndClose ? (_bindAndClose) isabstract : null;
        if (_bindandclose == null) {
            return isabstract;
        }
        for (_bindAndClose audioAttributesImplApi26Parcelizer = _bindandclose.getAudioAttributesImplApi26Parcelizer(); audioAttributesImplApi26Parcelizer != null; audioAttributesImplApi26Parcelizer = audioAttributesImplApi26Parcelizer.getAudioAttributesImplApi26Parcelizer()) {
            _bindandclose = audioAttributesImplApi26Parcelizer;
        }
        return _bindandclose;
    }
}
