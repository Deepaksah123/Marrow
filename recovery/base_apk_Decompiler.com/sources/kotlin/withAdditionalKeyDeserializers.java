package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015"}, d2 = {"Lo/withAdditionalKeyDeserializers;", "", "Lkotlin/Function0;", "", "p0", "p1", "", "p2", "<init>", "(Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Z)V", "", "toString", "()Ljava/lang/String;", "write", "Lo/getCreatedOnDateMs;", "RemoteActionCompatParcelizer", "()Lo/getCreatedOnDateMs;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withAdditionalKeyDeserializers {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Float> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;
    private final getCreatedOnDateMs<Float> write;

    public withAdditionalKeyDeserializers(getCreatedOnDateMs<Float> getcreatedondatems, getCreatedOnDateMs<Float> getcreatedondatems2, boolean z) {
        this.write = getcreatedondatems;
        this.read = getcreatedondatems2;
        this.IconCompatParcelizer = z;
    }

    public final getCreatedOnDateMs<Float> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final getCreatedOnDateMs<Float> IconCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(this.write.invoke().floatValue());
        sb.append(", maxValue=");
        sb.append(this.read.invoke().floatValue());
        sb.append(", reverseScrolling=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
