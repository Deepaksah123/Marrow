package kotlin;

import kotlin.Metadata;
import kotlin.removeSoftRefsClearedByGc;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0015\u001a;\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0016"}, d2 = {"Lo/resetWithString;", "p0", "", "p1", "p2", "Lo/removeSoftRefsClearedByGc;", "p3", "p4", "", "IconCompatParcelizer", "(Lo/resetWithString;FFLo/removeSoftRefsClearedByGc;Lo/removeSoftRefsClearedByGc;)Z", "Lo/WritableTypeIdInclusion;", "RemoteActionCompatParcelizer", "(Lo/WritableTypeIdInclusion;FF)Z", "Lo/resetWithString$RemoteActionCompatParcelizer;", "write", "(Lo/resetWithString$RemoteActionCompatParcelizer;FFLo/removeSoftRefsClearedByGc;Lo/removeSoftRefsClearedByGc;)Z", "Lo/WritableTypeId;", "AudioAttributesCompatParcelizer", "(Lo/WritableTypeId;)Z", "Lo/TypeReference;", "(FFJFF)Z", "(Lo/removeSoftRefsClearedByGc;FFLo/removeSoftRefsClearedByGc;Lo/removeSoftRefsClearedByGc;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getAccessorNaming {
    public static /* synthetic */ boolean IconCompatParcelizer$default(resetWithString resetwithstring, float f, float f2, removeSoftRefsClearedByGc removesoftrefsclearedbygc, removeSoftRefsClearedByGc removesoftrefsclearedbygc2, int i, Object obj) {
        if ((i & 8) != 0) {
            removesoftrefsclearedbygc = null;
        }
        if ((i & 16) != 0) {
            removesoftrefsclearedbygc2 = null;
        }
        return IconCompatParcelizer(resetwithstring, f, f2, removesoftrefsclearedbygc, removesoftrefsclearedbygc2);
    }

    public static final boolean IconCompatParcelizer(resetWithString resetwithstring, float f, float f2, removeSoftRefsClearedByGc removesoftrefsclearedbygc, removeSoftRefsClearedByGc removesoftrefsclearedbygc2) {
        if (resetwithstring instanceof resetWithString.read) {
            return RemoteActionCompatParcelizer(((resetWithString.read) resetwithstring).write(), f, f2);
        }
        if (resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer) {
            return write((resetWithString.RemoteActionCompatParcelizer) resetwithstring, f, f2, removesoftrefsclearedbygc, removesoftrefsclearedbygc2);
        }
        if (resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer) {
            return IconCompatParcelizer(((resetWithString.AudioAttributesCompatParcelizer) resetwithstring).getIconCompatParcelizer(), f, f2, removesoftrefsclearedbygc, removesoftrefsclearedbygc2);
        }
        throw new RenewEligibleCreator();
    }

    private static final boolean RemoteActionCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, float f, float f2) {
        return writableTypeIdInclusion.getAudioAttributesCompatParcelizer() <= f && f < writableTypeIdInclusion.getWrite() && writableTypeIdInclusion.getRemoteActionCompatParcelizer() <= f2 && f2 < writableTypeIdInclusion.getIconCompatParcelizer();
    }

    private static final boolean write(resetWithString.RemoteActionCompatParcelizer remoteActionCompatParcelizer, float f, float f2, removeSoftRefsClearedByGc removesoftrefsclearedbygc, removeSoftRefsClearedByGc removesoftrefsclearedbygc2) {
        WritableTypeId read = remoteActionCompatParcelizer.getRead();
        if (f < read.getRemoteActionCompatParcelizer() || f >= read.getRead() || f2 < read.getIconCompatParcelizer() || f2 >= read.getAudioAttributesCompatParcelizer()) {
            return false;
        }
        if (!AudioAttributesCompatParcelizer(read)) {
            removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = removesoftrefsclearedbygc2 == null ? writeIndentation.write() : removesoftrefsclearedbygc2;
            removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygcWrite, read, null, 2, null);
            return IconCompatParcelizer(removesoftrefsclearedbygcWrite, f, f2, removesoftrefsclearedbygc, removesoftrefsclearedbygc2);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (read.getWrite() >> 32)) + read.getRemoteActionCompatParcelizer();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) read.getWrite()) + read.getIconCompatParcelizer();
        float read2 = read.getRead() - Float.intBitsToFloat((int) (read.getMediaBrowserCompatItemReceiver() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) read.getMediaBrowserCompatItemReceiver()) + read.getIconCompatParcelizer();
        float read3 = read.getRead() - Float.intBitsToFloat((int) (read.getMediaBrowserCompatCustomActionResultReceiver() >> 32));
        float audioAttributesCompatParcelizer = read.getAudioAttributesCompatParcelizer() - Float.intBitsToFloat((int) read.getMediaBrowserCompatCustomActionResultReceiver());
        long j = -1;
        float audioAttributesCompatParcelizer2 = read.getAudioAttributesCompatParcelizer() - Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & read.getAudioAttributesImplBaseParcelizer()));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (read.getAudioAttributesImplBaseParcelizer() >> 32)) + read.getRemoteActionCompatParcelizer();
        if (f < fIntBitsToFloat && f2 < fIntBitsToFloat2) {
            return IconCompatParcelizer(f, f2, read.getWrite(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        if (f < fIntBitsToFloat4 && f2 > audioAttributesCompatParcelizer2) {
            return IconCompatParcelizer(f, f2, read.getAudioAttributesImplBaseParcelizer(), fIntBitsToFloat4, audioAttributesCompatParcelizer2);
        }
        if (f > read2 && f2 < fIntBitsToFloat3) {
            return IconCompatParcelizer(f, f2, read.getMediaBrowserCompatItemReceiver(), read2, fIntBitsToFloat3);
        }
        if (f <= read3 || f2 <= audioAttributesCompatParcelizer) {
            return true;
        }
        return IconCompatParcelizer(f, f2, read.getMediaBrowserCompatCustomActionResultReceiver(), read3, audioAttributesCompatParcelizer);
    }

    private static final boolean AudioAttributesCompatParcelizer(WritableTypeId writableTypeId) {
        return Float.intBitsToFloat((int) (writableTypeId.getWrite() >> 32)) + Float.intBitsToFloat((int) (writableTypeId.getMediaBrowserCompatItemReceiver() >> 32)) <= writableTypeId.AudioAttributesImplBaseParcelizer() && Float.intBitsToFloat((int) (writableTypeId.getAudioAttributesImplBaseParcelizer() >> 32)) + Float.intBitsToFloat((int) (writableTypeId.getMediaBrowserCompatCustomActionResultReceiver() >> 32)) <= writableTypeId.AudioAttributesImplBaseParcelizer() && Float.intBitsToFloat((int) writableTypeId.getWrite()) + Float.intBitsToFloat((int) writableTypeId.getAudioAttributesImplBaseParcelizer()) <= writableTypeId.read() && Float.intBitsToFloat((int) writableTypeId.getMediaBrowserCompatItemReceiver()) + Float.intBitsToFloat((int) writableTypeId.getMediaBrowserCompatCustomActionResultReceiver()) <= writableTypeId.read();
    }

    private static final boolean IconCompatParcelizer(removeSoftRefsClearedByGc removesoftrefsclearedbygc, float f, float f2, removeSoftRefsClearedByGc removesoftrefsclearedbygc2, removeSoftRefsClearedByGc removesoftrefsclearedbygc3) {
        WritableTypeIdInclusion writableTypeIdInclusion = new WritableTypeIdInclusion(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (removesoftrefsclearedbygc2 == null) {
            removesoftrefsclearedbygc2 = writeIndentation.write();
        }
        removeSoftRefsClearedByGc.write$default(removesoftrefsclearedbygc2, writableTypeIdInclusion, (removeSoftRefsClearedByGc.write) null, 2, (Object) null);
        if (removesoftrefsclearedbygc3 == null) {
            removesoftrefsclearedbygc3 = writeIndentation.write();
        }
        removesoftrefsclearedbygc3.read(removesoftrefsclearedbygc, removesoftrefsclearedbygc2, wrapAndTrack.INSTANCE.RemoteActionCompatParcelizer());
        boolean zRemoteActionCompatParcelizer = removesoftrefsclearedbygc3.RemoteActionCompatParcelizer();
        removesoftrefsclearedbygc3.AudioAttributesImplApi26Parcelizer();
        removesoftrefsclearedbygc2.AudioAttributesImplApi26Parcelizer();
        return !zRemoteActionCompatParcelizer;
    }

    private static final boolean IconCompatParcelizer(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        return ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
