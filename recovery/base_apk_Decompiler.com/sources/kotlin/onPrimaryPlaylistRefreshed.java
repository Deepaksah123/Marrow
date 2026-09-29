package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0015\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019"}, d2 = {"Lo/onPrimaryPlaylistRefreshed;", "Lo/onCancelLoad;", "Lo/onContentChanged;", "p0", "Lo/getCurrentTrackSelections;", "p1", "Lkotlin/Function0;", "", "p2", "<init>", "(Lo/onContentChanged;Lo/getCurrentTrackSelections;Lo/getCreatedOnDateMs;)V", "", "Lo/removeEventListener;", "", "AudioAttributesCompatParcelizer", "(FLo/removeEventListener;)V", "read", "(Lo/removeEventListener;)V", "IconCompatParcelizer", "Lo/onContentChanged;", "RemoteActionCompatParcelizer", "write", "Lo/getCurrentTrackSelections;", "Lo/getCreatedOnDateMs;", "Lo/releaseSourceInternal;", "Lo/releaseSourceInternal;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onPrimaryPlaylistRefreshed extends onCancelLoad {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final releaseSourceInternal write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final onContentChanged RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Integer> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCurrentTrackSelections AudioAttributesCompatParcelizer;

    public onPrimaryPlaylistRefreshed(onContentChanged oncontentchanged, getCurrentTrackSelections getcurrenttrackselections, getCreatedOnDateMs<Integer> getcreatedondatems) {
        super(oncontentchanged, false);
        this.RemoteActionCompatParcelizer = oncontentchanged;
        this.AudioAttributesCompatParcelizer = getcurrenttrackselections;
        this.read = getcreatedondatems;
        this.write = new releaseSourceInternal(getcreatedondatems);
    }

    public final void AudioAttributesCompatParcelizer(float p0, removeEventListener p1) {
        this.write.AudioAttributesCompatParcelizer(p1);
        this.write.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        AudioAttributesCompatParcelizer(this.write, -p0);
    }

    public final void read(removeEventListener p0) {
        this.write.AudioAttributesCompatParcelizer(p0);
        this.write.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        AudioAttributesCompatParcelizer(this.write);
    }
}
