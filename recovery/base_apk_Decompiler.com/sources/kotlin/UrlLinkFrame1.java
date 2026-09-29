package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/UrlLinkFrame1;", "", "Lo/parseId3v2point4TimestampFrameForDate;", "p0", "p1", "", "p2", "<init>", "(Lo/parseId3v2point4TimestampFrameForDate;Lo/parseId3v2point4TimestampFrameForDate;D)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/parseId3v2point4TimestampFrameForDate;", "()Lo/parseId3v2point4TimestampFrameForDate;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "write", "D", "read", "()D"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class UrlLinkFrame1 {
    private final parseId3v2point4TimestampFrameForDate AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final parseId3v2point4TimestampFrameForDate write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final double IconCompatParcelizer;

    private UrlLinkFrame1(parseId3v2point4TimestampFrameForDate parseid3v2point4timestampframefordate, parseId3v2point4TimestampFrameForDate parseid3v2point4timestampframefordate2, double d) {
        toMagicModuleMetaRepoModel.write(parseid3v2point4timestampframefordate, "");
        toMagicModuleMetaRepoModel.write(parseid3v2point4timestampframefordate2, "");
        this.write = parseid3v2point4timestampframefordate;
        this.AudioAttributesCompatParcelizer = parseid3v2point4timestampframefordate2;
        this.IconCompatParcelizer = d;
    }

    public /* synthetic */ UrlLinkFrame1(parseId3v2point4TimestampFrameForDate parseid3v2point4timestampframefordate, parseId3v2point4TimestampFrameForDate parseid3v2point4timestampframefordate2, double d, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? parseId3v2point4TimestampFrameForDate.COLLECTION_ENABLED : parseid3v2point4timestampframefordate, (i & 2) != 0 ? parseId3v2point4TimestampFrameForDate.COLLECTION_ENABLED : parseid3v2point4timestampframefordate2, (i & 4) != 0 ? 1.0d : d);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final parseId3v2point4TimestampFrameForDate getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final parseId3v2point4TimestampFrameForDate getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final double getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public UrlLinkFrame1() {
        this(null, null, 0.0d, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UrlLinkFrame1)) {
            return false;
        }
        UrlLinkFrame1 urlLinkFrame1 = (UrlLinkFrame1) p0;
        return this.write == urlLinkFrame1.write && this.AudioAttributesCompatParcelizer == urlLinkFrame1.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Double.valueOf(this.IconCompatParcelizer), Double.valueOf(urlLinkFrame1.IconCompatParcelizer));
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Double.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlLinkFrame1(write=");
        sb.append(this.write);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
