package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0004*\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/hasReferringProperties;", "p0", "Lo/getKey;", "p1", "Lo/appendReferring;", "RemoteActionCompatParcelizer", "(JJ)Lo/appendReferring;", "Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "(Lo/appendReferring;)Lo/WritableTypeIdInclusion;", "AudioAttributesCompatParcelizer", "(Lo/WritableTypeIdInclusion;)Lo/appendReferring;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ReadableObjectId {
    public static final appendReferring RemoteActionCompatParcelizer(long j, long j2) {
        return new appendReferring(hasReferringProperties.IconCompatParcelizer(j), hasReferringProperties.AudioAttributesCompatParcelizer(j), hasReferringProperties.IconCompatParcelizer(j) + ((int) (j2 >> 32)), hasReferringProperties.AudioAttributesCompatParcelizer(j) + ((int) j2));
    }

    public static final WritableTypeIdInclusion IconCompatParcelizer(appendReferring appendreferring) {
        return new WritableTypeIdInclusion(appendreferring.getRead(), appendreferring.getWrite(), appendreferring.getAudioAttributesCompatParcelizer(), appendreferring.getIconCompatParcelizer());
    }

    public static final appendReferring AudioAttributesCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion) {
        return new appendReferring(Math.round(writableTypeIdInclusion.getAudioAttributesCompatParcelizer()), Math.round(writableTypeIdInclusion.getRemoteActionCompatParcelizer()), Math.round(writableTypeIdInclusion.getWrite()), Math.round(writableTypeIdInclusion.getIconCompatParcelizer()));
    }
}
