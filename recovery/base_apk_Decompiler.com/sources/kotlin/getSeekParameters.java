package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010 "}, d2 = {"Lo/getSeekParameters;", "Lo/writerFor;", "Lo/getSkipSilenceEnabled;", "Lkotlin/Function0;", "Lo/AudioAttributesImplApi21;", "p0", "Lo/getPauseAtEndOfMediaItems;", "p1", "Lo/superDispatchKeyEvent;", "p2", "", "p3", "p4", "<init>", "(Lo/getCreatedOnDateMs;Lo/getPauseAtEndOfMediaItems;Lo/superDispatchKeyEvent;ZZ)V", "read", "()Lo/getSkipSilenceEnabled;", "", "RemoteActionCompatParcelizer", "(Lo/getSkipSilenceEnabled;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/getCreatedOnDateMs;", "Lo/getPauseAtEndOfMediaItems;", "IconCompatParcelizer", "write", "Lo/superDispatchKeyEvent;", "AudioAttributesImplApi26Parcelizer", "Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getSeekParameters extends writerFor<getSkipSilenceEnabled> {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<AudioAttributesImplApi21> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getPauseAtEndOfMediaItems IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final superDispatchKeyEvent read;

    /* JADX WARN: Multi-variable type inference failed */
    public getSeekParameters(getCreatedOnDateMs<? extends AudioAttributesImplApi21> getcreatedondatems, getPauseAtEndOfMediaItems getpauseatendofmediaitems, superDispatchKeyEvent superdispatchkeyevent, boolean z, boolean z2) {
        this.RemoteActionCompatParcelizer = getcreatedondatems;
        this.IconCompatParcelizer = getpauseatendofmediaitems;
        this.read = superdispatchkeyevent;
        this.write = z;
        this.AudioAttributesCompatParcelizer = z2;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getSkipSilenceEnabled IconCompatParcelizer() {
        return new getSkipSilenceEnabled(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.write, this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getSkipSilenceEnabled p0) {
        p0.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.write, this.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getSeekParameters)) {
            return false;
        }
        getSeekParameters getseekparameters = (getSeekParameters) p0;
        return this.RemoteActionCompatParcelizer == getseekparameters.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getseekparameters.IconCompatParcelizer) && this.read == getseekparameters.read && this.write == getseekparameters.write && this.AudioAttributesCompatParcelizer == getseekparameters.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        return (((((((iHashCode * 31) + iHashCode2) * 31) + this.read.hashCode()) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }
}
