package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lo/getConfig;", "Lo/writerFor;", "Lo/getTypeFactory;", "Lkotlin/Function1;", "Lo/constructType;", "", "p0", "p1", "<init>", "(Lo/getAnswerMap;Lo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "()Lo/getTypeFactory;", "", "AudioAttributesCompatParcelizer", "(Lo/getTypeFactory;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/getAnswerMap;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getConfig extends writerFor<getTypeFactory> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<constructType, Boolean> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<constructType, Boolean> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public getConfig(getAnswerMap<? super constructType, Boolean> getanswermap, getAnswerMap<? super constructType, Boolean> getanswermap2) {
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.IconCompatParcelizer = getanswermap2;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getTypeFactory IconCompatParcelizer() {
        return new getTypeFactory(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getTypeFactory p0) {
        p0.read(this.AudioAttributesCompatParcelizer);
        p0.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getConfig)) {
            return false;
        }
        getConfig getconfig = (getConfig) p0;
        return this.AudioAttributesCompatParcelizer == getconfig.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == getconfig.IconCompatParcelizer;
    }

    public final int hashCode() {
        getAnswerMap<constructType, Boolean> getanswermap = this.AudioAttributesCompatParcelizer;
        int iHashCode = getanswermap != null ? getanswermap.hashCode() : 0;
        getAnswerMap<constructType, Boolean> getanswermap2 = this.IconCompatParcelizer;
        return (iHashCode * 31) + (getanswermap2 != null ? getanswermap2.hashCode() : 0);
    }
}
