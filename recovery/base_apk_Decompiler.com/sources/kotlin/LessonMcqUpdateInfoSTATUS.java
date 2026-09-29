package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001aB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Lo/LessonMcqUpdateInfoSTATUS;", "Lo/EncryptedContentObject;", "Lo/EncryptedContentArray;", "", "Lo/LessonMcqUpdateInfo;", "p0", "p1", "<init>", "()V", "", "RemoteActionCompatParcelizer", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "()Ljava/lang/Long;", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "read", "AudioAttributesCompatParcelizer_"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LessonMcqUpdateInfoSTATUS extends EncryptedContentObject implements EncryptedContentArray<Long>, LessonMcqUpdateInfo<Long> {
    private LessonMcqUpdateInfoSTATUS() {
        super(1L, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.EncryptedContentArray
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public Long write() {
        return Long.valueOf(getRead());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.EncryptedContentArray
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public Long IconCompatParcelizer() {
        return Long.valueOf(getWrite());
    }

    @Override // kotlin.EncryptedContentObject
    public final boolean RemoteActionCompatParcelizer() {
        return getRead() > getWrite();
    }

    @Override // kotlin.EncryptedContentObject
    public final boolean equals(Object p0) {
        if (!(p0 instanceof LessonMcqUpdateInfoSTATUS)) {
            return false;
        }
        if (RemoteActionCompatParcelizer() && ((LessonMcqUpdateInfoSTATUS) p0).RemoteActionCompatParcelizer()) {
            return true;
        }
        LessonMcqUpdateInfoSTATUS lessonMcqUpdateInfoSTATUS = (LessonMcqUpdateInfoSTATUS) p0;
        return getRead() == lessonMcqUpdateInfoSTATUS.getRead() && getWrite() == lessonMcqUpdateInfoSTATUS.getWrite();
    }

    @Override // kotlin.EncryptedContentObject
    public final int hashCode() {
        if (RemoteActionCompatParcelizer()) {
            return -1;
        }
        return (int) (((getRead() ^ (getRead() >>> 32)) * 31) + (getWrite() ^ (getWrite() >>> 32)));
    }

    @Override // kotlin.EncryptedContentObject
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getRead());
        sb.append("..");
        sb.append(getWrite());
        return sb.toString();
    }

    static {
        new LessonMcqUpdateInfoSTATUS();
    }
}
