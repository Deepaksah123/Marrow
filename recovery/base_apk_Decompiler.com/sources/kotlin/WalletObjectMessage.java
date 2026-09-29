package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletObjectMessage {
    public static final removeSoftRefsClearedByGc AudioAttributesCompatParcelizer(long j, float f, float f2) {
        float f3 = f / 2.0f;
        removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
        float f4 = f2 - f3;
        long j2 = -1;
        removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygcWrite, allocByteBuffer.AudioAttributesCompatParcelizer(f3, f3, Float.intBitsToFloat((int) (j >> 32)) - f3, Float.intBitsToFloat((int) j) - f3, TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))))), null, 2, null);
        return removesoftrefsclearedbygcWrite;
    }

    public static final void IconCompatParcelizer(findSetterInfo findsetterinfo, removeSoftRefsClearedByGc removesoftrefsclearedbygc, float f, long j, float f2) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        toMagicModuleMetaRepoModel.write(removesoftrefsclearedbygc, "");
        setCurrentAndReturn setcurrentandreturn = setCurrentSegmentLength.read();
        setcurrentandreturn.AudioAttributesCompatParcelizer(removesoftrefsclearedbygc, true);
        float fRemoteActionCompatParcelizer = setcurrentandreturn.RemoteActionCompatParcelizer();
        if (fRemoteActionCompatParcelizer > BitmapDescriptorFactory.HUE_RED) {
            float f3 = (1.0f - f) * fRemoteActionCompatParcelizer;
            float f4 = fRemoteActionCompatParcelizer * 0.75f;
            removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
            int i = 0;
            while (i < 28) {
                float f5 = i;
                float f6 = f5 / 28.0f;
                float f7 = (f5 + 1.0f) / 28.0f;
                float f8 = ((((f6 * f4) + f3) % fRemoteActionCompatParcelizer) + fRemoteActionCompatParcelizer) % fRemoteActionCompatParcelizer;
                float f9 = ((((f4 * f7) + f3) % fRemoteActionCompatParcelizer) + fRemoteActionCompatParcelizer) % fRemoteActionCompatParcelizer;
                removesoftrefsclearedbygcWrite.AudioAttributesImplApi26Parcelizer();
                if (f9 >= f8) {
                    setcurrentandreturn.read(f8, f9, removesoftrefsclearedbygcWrite, true);
                } else {
                    setcurrentandreturn.read(f8, fRemoteActionCompatParcelizer, removesoftrefsclearedbygcWrite, true);
                    setcurrentandreturn.read(BitmapDescriptorFactory.HUE_RED, f9, removesoftrefsclearedbygcWrite, true);
                }
                findSetterInfo.AudioAttributesCompatParcelizer$default(findsetterinfo, removesoftrefsclearedbygcWrite, switchToNext.AudioAttributesCompatParcelizer$default(j, 1.0f - f7, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), BitmapDescriptorFactory.HUE_RED, new findValueInstantiator(f2, BitmapDescriptorFactory.HUE_RED, findAutoDetectVisibility.INSTANCE.RemoteActionCompatParcelizer(), 0, null, 26, null), (switchAndReturnNext) null, 0, 52, (Object) null);
                i++;
                removesoftrefsclearedbygcWrite = removesoftrefsclearedbygcWrite;
            }
        }
    }
}
