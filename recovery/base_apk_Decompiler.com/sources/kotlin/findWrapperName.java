package kotlin;

import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/findSetterInfo;", "Lo/hasAnyGetter;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/findSetterInfo;Lo/hasAnyGetter;)V", "Lo/resetWithString;", "IconCompatParcelizer", "(Lo/hasAnyGetter;Lo/resetWithString;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findWrapperName {
    public static final void IconCompatParcelizer(hasAnyGetter hasanygetter, resetWithString resetwithstring) {
        if (resetwithstring instanceof resetWithString.read) {
            resetWithString.read readVar = (resetWithString.read) resetwithstring;
            long j = -1;
            long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(readVar.write().getAudioAttributesCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(readVar.write().getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
            WritableTypeIdInclusion writableTypeIdInclusionWrite = readVar.write();
            float write = writableTypeIdInclusionWrite.getWrite();
            float audioAttributesCompatParcelizer = writableTypeIdInclusionWrite.getAudioAttributesCompatParcelizer();
            WritableTypeIdInclusion writableTypeIdInclusionWrite2 = readVar.write();
            long j2 = -1;
            hasanygetter.read(jAudioAttributesCompatParcelizer, calloc.write((((long) Float.floatToRawIntBits(writableTypeIdInclusionWrite2.getIconCompatParcelizer() - writableTypeIdInclusionWrite2.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(write - audioAttributesCompatParcelizer)) << 32)));
            return;
        }
        if (resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer) {
            hasanygetter.RemoteActionCompatParcelizer(((resetWithString.AudioAttributesCompatParcelizer) resetwithstring).getIconCompatParcelizer());
            return;
        }
        if (!(resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer)) {
            throw new RenewEligibleCreator();
        }
        resetWithString.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (resetWithString.RemoteActionCompatParcelizer) resetwithstring;
        if (remoteActionCompatParcelizer.getRemoteActionCompatParcelizer() != null) {
            hasanygetter.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.getRemoteActionCompatParcelizer());
            return;
        }
        WritableTypeId read = remoteActionCompatParcelizer.getRead();
        long j3 = -1;
        long jAudioAttributesCompatParcelizer2 = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(read.getRemoteActionCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(read.getIconCompatParcelizer())) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))));
        float fAudioAttributesImplBaseParcelizer = read.AudioAttributesImplBaseParcelizer();
        long j4 = -1;
        hasanygetter.IconCompatParcelizer(jAudioAttributesCompatParcelizer2, calloc.write((((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32))) & ((long) Float.floatToRawIntBits(read.read()))) | (Float.floatToRawIntBits(fAudioAttributesImplBaseParcelizer) << 32)), Float.intBitsToFloat((int) (read.getAudioAttributesImplBaseParcelizer() >> 32)));
    }

    public static final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo, hasAnyGetter hasanygetter) {
        hasanygetter.write(findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer(), findsetterinfo.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer());
    }
}
