package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R,\u0010\u0010\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR,\u0010\u001d\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b"}, d2 = {"Lo/Slide;", "Lo/writerFor;", "Lo/PathMotion;", "Lo/getFillAlpha;", "p0", "Lkotlin/Function1;", "Lo/SampleVideos;", "", "", "p1", "p2", "Lo/isAbstract;", "Lo/WritableTypeIdInclusion;", "p3", "<init>", "(Lo/getFillAlpha;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "()Lo/PathMotion;", "(Lo/PathMotion;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/getFillAlpha;", "read", "Lo/getAnswerMap;", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Slide extends writerFor<PathMotion> {
    private final getAnswerMap<isAbstract, WritableTypeIdInclusion> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getFillAlpha read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<SampleVideos<? super getShowPopup>, Object> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(getFillAlpha getfillalpha, getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap, getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap2, getAnswerMap<? super isAbstract, WritableTypeIdInclusion> getanswermap3) {
        this.read = getfillalpha;
        this.RemoteActionCompatParcelizer = getanswermap;
        this.AudioAttributesCompatParcelizer = getanswermap2;
        this.IconCompatParcelizer = getanswermap3;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final PathMotion IconCompatParcelizer() {
        return new PathMotion(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(PathMotion p0) {
        p0.IconCompatParcelizer(this.read);
        p0.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        p0.write(this.AudioAttributesCompatParcelizer);
        p0.read(this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) p0;
        return this.read == slide.read && this.RemoteActionCompatParcelizer == slide.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == slide.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == slide.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        getAnswerMap<SampleVideos<? super getShowPopup>, Object> getanswermap = this.RemoteActionCompatParcelizer;
        int iHashCode2 = getanswermap != null ? getanswermap.hashCode() : 0;
        getAnswerMap<SampleVideos<? super getShowPopup>, Object> getanswermap2 = this.AudioAttributesCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (getanswermap2 != null ? getanswermap2.hashCode() : 0)) * 31) + this.IconCompatParcelizer.hashCode();
    }
}
