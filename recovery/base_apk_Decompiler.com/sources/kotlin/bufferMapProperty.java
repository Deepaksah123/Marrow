package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0003*\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0006*\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u0003H&¢\u0006\u0004\b\u0010\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0003H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u000e\u001a\u00020\u0013*\u00020\u0014H&¢\u0006\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/bufferMapProperty;", "Lo/getParameter;", "Lo/assignParameter;", "", "AudioAttributesCompatParcelizer", "(F)F", "", "IconCompatParcelizer", "(F)I", "Lo/ReadableObjectIdReferring;", "c_", "(J)F", "a_", "(J)I", "b_", "(I)F", "write", "RemoteActionCompatParcelizer", "(F)J", "Lo/handleIdValue;", "Lo/calloc;", "d_", "(J)J", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface bufferMapProperty extends getParameter {
    float IconCompatParcelizer();

    default float AudioAttributesCompatParcelizer(float f) {
        return f * IconCompatParcelizer();
    }

    default int IconCompatParcelizer(float f) {
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f);
        if (Float.isInfinite(fAudioAttributesCompatParcelizer)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fAudioAttributesCompatParcelizer);
    }

    default float c_(long j) {
        if (!processUnwrapped.read(ReadableObjectIdReferring.write(j), processUnwrapped.INSTANCE.read())) {
            readIdProperty.RemoteActionCompatParcelizer("Only Sp can convert to Px");
        }
        return AudioAttributesCompatParcelizer(e_(j));
    }

    default int a_(long j) {
        return Math.round(c_(j));
    }

    default float b_(int i) {
        return assignParameter.IconCompatParcelizer(i / IconCompatParcelizer());
    }

    default float write(float f) {
        return assignParameter.IconCompatParcelizer(f / IconCompatParcelizer());
    }

    default long RemoteActionCompatParcelizer(float f) {
        return read(write(f));
    }

    default long d_(long j) {
        if (j != 9205357640488583168L) {
            long j2 = -1;
            return calloc.write((((long) Float.floatToRawIntBits(AudioAttributesCompatParcelizer(handleIdValue.IconCompatParcelizer(j)))) << 32) | (((long) Float.floatToRawIntBits(AudioAttributesCompatParcelizer(handleIdValue.write(j)))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        }
        return calloc.INSTANCE.IconCompatParcelizer();
    }

    default long b_(long j) {
        if (j != 9205357640488583168L) {
            return getParameters.IconCompatParcelizer(write(Float.intBitsToFloat((int) (j >> 32))), write(Float.intBitsToFloat((int) j)));
        }
        return handleIdValue.INSTANCE.write();
    }
}
