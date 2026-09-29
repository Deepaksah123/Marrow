package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00108\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/_writeBytes;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Lo/_writeQuotedLong;", "IconCompatParcelizer", "Ljava/util/List;", "read", "()Ljava/util/List;", "AudioAttributesCompatParcelizer", "Lo/WritableTypeIdInclusion;", "Lo/WritableTypeIdInclusion;", "()Lo/WritableTypeIdInclusion;", "Lkotlin/Function1;", "", "", "MediaBrowserCompatItemReceiver", "Lo/getAnswerMap;", "write", "()Lo/getAnswerMap;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _writeBytes {
    private static final Object read;
    public static final int write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private WritableTypeIdInclusion read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<_writeQuotedLong> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getAnswerMap<String, getShowPopup> write;

    public final List<_writeQuotedLong> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final WritableTypeIdInclusion getRead() {
        return this.read;
    }

    public final getAnswerMap<String, getShowPopup> write() {
        return this.write;
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        write = 8;
        read = companion;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _writeBytes)) {
            return false;
        }
        _writeBytes _writebytes = (_writeBytes) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, _writebytes.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, _writebytes.read) && this.write == _writebytes.write;
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        WritableTypeIdInclusion writableTypeIdInclusion = this.read;
        int iHashCode2 = writableTypeIdInclusion != null ? writableTypeIdInclusion.hashCode() : 0;
        getAnswerMap<String, getShowPopup> getanswermap = this.write;
        return (((iHashCode * 31) + iHashCode2) * 31) + (getanswermap != null ? getanswermap.hashCode() : 0);
    }
}
