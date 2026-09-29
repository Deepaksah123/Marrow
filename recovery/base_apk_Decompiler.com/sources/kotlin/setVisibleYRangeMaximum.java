package kotlin;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\f\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\u0011\u0010\rR\u0016\u0010!\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010&R\u0018\u0010\u0019\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010("}, d2 = {"Lo/setVisibleYRangeMaximum;", "", "Lo/TopUserCompanion;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/TopUserCompanion;)V", "V", "Lkotlin/Function1;", "Lo/setDrawSliceText;", "write", "(Lo/getAnswerMap;)Ljava/lang/Object;", "read", "()Lo/setDrawSliceText;", "()V", "AudioAttributesCompatParcelizer", "Lkotlin/Function0;", "IconCompatParcelizer", "(Lo/getCreatedOnDateMs;)V", "Lo/setVisibleYRangeMaximum$read;", "MediaDescriptionCompat", "Lo/setVisibleYRangeMaximum$read;", "Lo/setEntryLabelTextSize;", "Lo/setEntryLabelTextSize;", "Lo/TopUserCompanion;", "MediaBrowserCompatItemReceiver", "Lo/getCreatedOnDateMs;", "AudioAttributesImplBaseParcelizer", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicLong;", "AudioAttributesImplApi26Parcelizer", "Ljava/util/concurrent/atomic/AtomicLong;", "AudioAttributesImplApi21Parcelizer", "Lo/setDrawSliceText;", "", "Z", "Lo/setPassingYear;", "Lo/setPassingYear;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setVisibleYRangeMaximum {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private setEntryLabelTextSize read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private AtomicLong AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Object write;
    private final AtomicInteger MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final read AudioAttributesCompatParcelizer;
    private TopUserCompanion RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private setPassingYear MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setDrawSliceText AudioAttributesImplBaseParcelizer;

    public interface read {
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setDrawSliceText getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void RemoteActionCompatParcelizer(TopUserCompanion p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = p0;
    }

    public final <V> V write(getAnswerMap<? super setDrawSliceText, ? extends V> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            return p0.invoke(read());
        } finally {
            write();
        }
    }

    public final setDrawSliceText read() {
        setDrawSliceText setdrawslicetext;
        setPassingYear setpassingyear = this.MediaBrowserCompatItemReceiver;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.MediaBrowserCompatItemReceiver = null;
        this.MediaBrowserCompatCustomActionResultReceiver.incrementAndGet();
        if (this.AudioAttributesImplApi26Parcelizer) {
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
        synchronized (this.write) {
            setdrawslicetext = this.AudioAttributesImplBaseParcelizer;
            if (setdrawslicetext == null || !setdrawslicetext.AudioAttributesImplBaseParcelizer()) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                throw new NullPointerException();
            }
        }
        return setdrawslicetext;
    }

    public final void write() {
        if (this.MediaBrowserCompatCustomActionResultReceiver.decrementAndGet() < 0) {
            throw new IllegalStateException("Unbalanced reference count.".toString());
        }
        throw null;
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this.write) {
            this.AudioAttributesImplApi26Parcelizer = true;
            setPassingYear setpassingyear = this.MediaBrowserCompatItemReceiver;
            if (setpassingyear != null) {
                setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
            }
            this.MediaBrowserCompatItemReceiver = null;
            setDrawSliceText setdrawslicetext = this.AudioAttributesImplBaseParcelizer;
            if (setdrawslicetext != null) {
                setdrawslicetext.close();
            }
            this.AudioAttributesImplBaseParcelizer = null;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer = p0;
    }
}
