package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/Module;", "p0", "", "p1", "p2", "Lo/hasReferringProperties;", "p3", "p4", "p5", "Lo/resetWithShared;", "p6", "Lo/getDefaultPropertyIgnorals;", "read", "(Lo/Module;JJJJJ[F)Lo/getDefaultPropertyIgnorals;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getFullRootName {
    public static final getDefaultPropertyIgnorals read(Module module, long j, long j2, long j3, long j4, long j5, float[] fArr) {
        _bindAndClose _bindandcloseWrite = collectLongDefaults.write(module, _bind.write(2));
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(module);
        if (!_assertnotnullAudioAttributesImplApi26Parcelizer.MediaDescriptionCompat()) {
            return null;
        }
        if (_assertnotnullAudioAttributesImplApi26Parcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() != _bindandcloseWrite) {
            long j6 = hasReferringProperties.read(j);
            long j7 = -1;
            long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(hasReferringProperties.IconCompatParcelizer(j6))) << 32) | (((long) Float.floatToRawIntBits(hasReferringProperties.AudioAttributesCompatParcelizer(j6))) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)))));
            long jWrite = _bindandcloseWrite.onFastForward().write();
            long jAudioAttributesCompatParcelizer2 = referringProperties.AudioAttributesCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().onFastForward().RemoteActionCompatParcelizer(_bindandcloseWrite, jAudioAttributesCompatParcelizer));
            long j8 = -1;
            return new getDefaultPropertyIgnorals(jAudioAttributesCompatParcelizer2, hasReferringProperties.read((((long) (hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer2) + ((int) (jWrite >> 32)))) << 32) | (((long) (hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer2) + ((int) jWrite))) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32))))), j3, j4, j5, fArr, module, null);
        }
        return new getDefaultPropertyIgnorals(j, j2, j3, j4, j5, fArr, module, null);
    }
}
