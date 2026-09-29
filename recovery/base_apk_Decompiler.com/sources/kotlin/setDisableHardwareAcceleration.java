package kotlin;

import kotlin.resetWithString;

/* JADX INFO: loaded from: classes4.dex */
public final class setDisableHardwareAcceleration implements findAndAddVirtualProperties {
    private final getCreatedOnDateMs<Float> IconCompatParcelizer;

    public setDisableHardwareAcceleration(getCreatedOnDateMs<Float> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.IconCompatParcelizer = getcreatedondatems;
    }

    @Override // kotlin.findAndAddVirtualProperties
    public final resetWithString write(long j, tryToResolveUnresolved trytoresolveunresolved, bufferMapProperty buffermapproperty) {
        toMagicModuleMetaRepoModel.write(trytoresolveunresolved, "");
        toMagicModuleMetaRepoModel.write(buffermapproperty, "");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        long j2 = -1;
        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) / 2.0f))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fHypot = (float) Math.hypot(Float.intBitsToFloat(r3) / 2.0f, Float.intBitsToFloat(r0) / 2.0f);
        float fFloatValue = this.IconCompatParcelizer.invoke().floatValue();
        removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
        removeSoftRefsClearedByGc.read$default(removesoftrefsclearedbygcWrite, BufferRecycler.read(jAudioAttributesCompatParcelizer, fHypot * fFloatValue), null, 2, null);
        return new resetWithString.AudioAttributesCompatParcelizer(removesoftrefsclearedbygcWrite);
    }
}
