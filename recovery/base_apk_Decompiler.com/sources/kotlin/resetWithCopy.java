package kotlin;

import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001aK\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u000e\u001a\u00020\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u000e\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0013*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019"}, d2 = {"Lo/findSetterInfo;", "Lo/resetWithString;", "p0", "Lo/switchToNext;", "p1", "", "p2", "Lo/findViews;", "p3", "Lo/switchAndReturnNext;", "p4", "Lo/createInstance;", "p5", "", "RemoteActionCompatParcelizer", "(Lo/findSetterInfo;Lo/resetWithString;JFLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/Instantiatable;", "(Lo/findSetterInfo;Lo/resetWithString;Lo/Instantiatable;FLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/WritableTypeIdInclusion;", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(Lo/WritableTypeIdInclusion;)J", "Lo/calloc;", "Lo/WritableTypeId;", "write", "(Lo/WritableTypeId;)J", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class resetWithCopy {
    public static /* synthetic */ void RemoteActionCompatParcelizer$default(findSetterInfo findsetterinfo, resetWithString resetwithstring, Instantiatable instantiatable, float f, findViews findviews, switchAndReturnNext switchandreturnnext, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            findviews = findTypeResolver.INSTANCE;
        }
        findViews findviews2 = findviews;
        if ((i2 & 16) != 0) {
            switchandreturnnext = null;
        }
        switchAndReturnNext switchandreturnnext2 = switchandreturnnext;
        if ((i2 & 32) != 0) {
            i = findSetterInfo.INSTANCE.write();
        }
        RemoteActionCompatParcelizer(findsetterinfo, resetwithstring, instantiatable, f2, findviews2, switchandreturnnext2, i);
    }

    private static final long AudioAttributesCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion) {
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(writableTypeIdInclusion.getAudioAttributesCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(writableTypeIdInclusion.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    private static final long write(WritableTypeId writableTypeId) {
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(writableTypeId.getRemoteActionCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(writableTypeId.getIconCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    private static final long IconCompatParcelizer(WritableTypeId writableTypeId) {
        long j = -1;
        return calloc.write((((long) Float.floatToRawIntBits(writableTypeId.AudioAttributesImplBaseParcelizer())) << 32) | (((long) Float.floatToRawIntBits(writableTypeId.read())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public static final void RemoteActionCompatParcelizer(findSetterInfo findsetterinfo, resetWithString resetwithstring, long j, float f, findViews findviews, switchAndReturnNext switchandreturnnext, int i) {
        if (resetwithstring instanceof resetWithString.read) {
            WritableTypeIdInclusion writableTypeIdInclusionWrite = ((resetWithString.read) resetwithstring).write();
            findsetterinfo.read(j, AudioAttributesCompatParcelizer(writableTypeIdInclusionWrite), RemoteActionCompatParcelizer(writableTypeIdInclusionWrite), f, findviews, switchandreturnnext, i);
            return;
        }
        if (resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer) {
            resetWithString.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (resetWithString.RemoteActionCompatParcelizer) resetwithstring;
            removeSoftRefsClearedByGc remoteActionCompatParcelizer2 = remoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer2 != null) {
                findsetterinfo.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2, j, f, findviews, switchandreturnnext, i);
                return;
            }
            WritableTypeId read = remoteActionCompatParcelizer.getRead();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (read.getAudioAttributesImplBaseParcelizer() >> 32));
            long j2 = -1;
            findsetterinfo.RemoteActionCompatParcelizer(j, write(read), IconCompatParcelizer(read), TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)), findviews, f, switchandreturnnext, i);
            return;
        }
        if (resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer) {
            findsetterinfo.AudioAttributesCompatParcelizer(((resetWithString.AudioAttributesCompatParcelizer) resetwithstring).getIconCompatParcelizer(), j, f, findviews, switchandreturnnext, i);
            return;
        }
        throw new RenewEligibleCreator();
    }

    public static final void RemoteActionCompatParcelizer(findSetterInfo findsetterinfo, resetWithString resetwithstring, Instantiatable instantiatable, float f, findViews findviews, switchAndReturnNext switchandreturnnext, int i) {
        if (resetwithstring instanceof resetWithString.read) {
            WritableTypeIdInclusion writableTypeIdInclusionWrite = ((resetWithString.read) resetwithstring).write();
            findsetterinfo.write(instantiatable, AudioAttributesCompatParcelizer(writableTypeIdInclusionWrite), RemoteActionCompatParcelizer(writableTypeIdInclusionWrite), f, findviews, switchandreturnnext, i);
            return;
        }
        if (resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer) {
            resetWithString.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (resetWithString.RemoteActionCompatParcelizer) resetwithstring;
            removeSoftRefsClearedByGc remoteActionCompatParcelizer2 = remoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer2 != null) {
                findsetterinfo.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2, instantiatable, f, findviews, switchandreturnnext, i);
                return;
            }
            WritableTypeId read = remoteActionCompatParcelizer.getRead();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (read.getAudioAttributesImplBaseParcelizer() >> 32));
            long j = -1;
            findsetterinfo.read(instantiatable, write(read), IconCompatParcelizer(read), TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)), f, findviews, switchandreturnnext, i);
            return;
        }
        if (resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer) {
            findsetterinfo.AudioAttributesCompatParcelizer(((resetWithString.AudioAttributesCompatParcelizer) resetwithstring).getIconCompatParcelizer(), instantiatable, f, findviews, switchandreturnnext, i);
            return;
        }
        throw new RenewEligibleCreator();
    }

    private static final long RemoteActionCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion) {
        long j = -1;
        return calloc.write((((long) Float.floatToRawIntBits(writableTypeIdInclusion.getWrite() - writableTypeIdInclusion.getAudioAttributesCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(writableTypeIdInclusion.getIconCompatParcelizer() - writableTypeIdInclusion.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }
}
