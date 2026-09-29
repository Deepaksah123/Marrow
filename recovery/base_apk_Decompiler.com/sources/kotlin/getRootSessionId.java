package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/getRootSessionId;", "Lo/SampleVideos;", "", "<init>", "()V", "Lo/getRfBanners;", "p0", "", "resumeWith", "(Ljava/lang/Object;)V", "Lo/CurrentQuery;", "IconCompatParcelizer", "Lo/CurrentQuery;", "getContext", "()Lo/CurrentQuery;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getRootSessionId implements SampleVideos<Object> {
    public static final getRootSessionId INSTANCE = new getRootSessionId();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final CurrentQuery AudioAttributesCompatParcelizer = VideoSessionResponseBody.RemoteActionCompatParcelizer;

    @Override // kotlin.SampleVideos
    public final void resumeWith(Object p0) {
    }

    private getRootSessionId() {
    }

    @Override // kotlin.SampleVideos
    public final CurrentQuery getContext() {
        return AudioAttributesCompatParcelizer;
    }
}
