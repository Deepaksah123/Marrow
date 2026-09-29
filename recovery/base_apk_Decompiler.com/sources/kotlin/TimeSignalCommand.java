package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010$\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&"}, d2 = {"Lo/TimeSignalCommand;", "Lo/writerFor;", "Lo/DefaultTimeBar;", "", "p0", "Lo/hashCode;", "p1", "Lo/setParentLayoutDirection;", "p2", "p3", "p4", "Lo/keyDeserializers;", "p5", "Lkotlin/Function0;", "", "p6", "<init>", "(ZLo/hashCode;Lo/setParentLayoutDirection;ZZLo/keyDeserializers;Lo/getCreatedOnDateMs;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "RemoteActionCompatParcelizer", "()Lo/DefaultTimeBar;", "IconCompatParcelizer", "(Lo/DefaultTimeBar;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "MediaBrowserCompatCustomActionResultReceiver", "Z", "write", "Lo/hashCode;", "AudioAttributesCompatParcelizer", "Lo/setParentLayoutDirection;", "MediaBrowserCompatItemReceiver", "read", "AudioAttributesImplApi26Parcelizer", "Lo/keyDeserializers;", "Lo/getCreatedOnDateMs;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TimeSignalCommand extends writerFor<DefaultTimeBar> {
    private final C0184keyDeserializers AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final hashCode AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setParentLayoutDirection IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean read;

    private TimeSignalCommand(boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, boolean z3, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.write = z;
        this.AudioAttributesCompatParcelizer = hashcode;
        this.IconCompatParcelizer = setparentlayoutdirection;
        this.RemoteActionCompatParcelizer = z2;
        this.read = z3;
        this.AudioAttributesImplApi26Parcelizer = c0184keyDeserializers;
        this.AudioAttributesImplBaseParcelizer = getcreatedondatems;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final DefaultTimeBar IconCompatParcelizer() {
        return new DefaultTimeBar(this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, null);
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(DefaultTimeBar p0) {
        p0.read(this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        TimeSignalCommand timeSignalCommand = (TimeSignalCommand) p0;
        return this.write == timeSignalCommand.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, timeSignalCommand.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, timeSignalCommand.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == timeSignalCommand.RemoteActionCompatParcelizer && this.read == timeSignalCommand.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, timeSignalCommand.AudioAttributesImplApi26Parcelizer) && this.AudioAttributesImplBaseParcelizer == timeSignalCommand.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.write);
        hashCode hashcode = this.AudioAttributesCompatParcelizer;
        int iHashCode2 = hashcode != null ? hashcode.hashCode() : 0;
        setParentLayoutDirection setparentlayoutdirection = this.IconCompatParcelizer;
        int iHashCode3 = setparentlayoutdirection != null ? setparentlayoutdirection.hashCode() : 0;
        int iHashCode4 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode5 = Boolean.hashCode(this.read);
        C0184keyDeserializers c0184keyDeserializers = this.AudioAttributesImplApi26Parcelizer;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c0184keyDeserializers != null ? C0184keyDeserializers.AudioAttributesCompatParcelizer(c0184keyDeserializers.getWrite()) : 0)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
    }

    public /* synthetic */ TimeSignalCommand(boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, boolean z3, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, hashcode, setparentlayoutdirection, z2, z3, c0184keyDeserializers, getcreatedondatems);
    }
}
