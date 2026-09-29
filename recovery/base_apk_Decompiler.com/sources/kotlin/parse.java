package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\t"}, d2 = {"Lo/parse;", "", "Lo/getFilter;", "p0", "p1", "<init>", "(Lo/getFilter;Lo/getFilter;)V", "write", "Lo/getFilter;", "()Lo/getFilter;", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class parse {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getFilter AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getFilter IconCompatParcelizer;

    public parse(getFilter getfilter, getFilter getfilter2) {
        this.IconCompatParcelizer = getfilter;
        this.AudioAttributesCompatParcelizer = getfilter2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final getFilter getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final getFilter getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
