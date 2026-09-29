package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!"}, d2 = {"Lo/initState;", "Lo/writerFor;", "Lo/isDetached;", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "", "p4", "Lkotlin/Function1;", "Lo/as;", "", "p5", "<init>", "(FFFFZLo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "()Lo/isDetached;", "read", "(Lo/isDetached;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesImplApi26Parcelizer", "F", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Z", "Lo/getAnswerMap;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class initState extends writerFor<isDetached> {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<as, getShowPopup> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;

    /* JADX WARN: Multi-variable type inference failed */
    private initState(float f, float f2, float f3, float f4, boolean z, getAnswerMap<? super as, getShowPopup> getanswermap) {
        this.IconCompatParcelizer = f;
        this.write = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.read = f4;
        this.RemoteActionCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = getanswermap;
    }

    public /* synthetic */ initState(float f, float f2, float f3, float f4, boolean z, getAnswerMap getanswermap, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? assignParameter.INSTANCE.RemoteActionCompatParcelizer() : f, (i & 2) != 0 ? assignParameter.INSTANCE.RemoteActionCompatParcelizer() : f2, (i & 4) != 0 ? assignParameter.INSTANCE.RemoteActionCompatParcelizer() : f3, (i & 8) != 0 ? assignParameter.INSTANCE.RemoteActionCompatParcelizer() : f4, z, getanswermap, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final isDetached IconCompatParcelizer() {
        return new isDetached(this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(isDetached p0) {
        p0.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        p0.write(this.write);
        p0.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        p0.read(this.read);
        p0.write(this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof initState)) {
            return false;
        }
        initState initstate = (initState) p0;
        return assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, initstate.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.write, initstate.write) && assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, initstate.AudioAttributesCompatParcelizer) && assignParameter.IconCompatParcelizer(this.read, initstate.read) && this.RemoteActionCompatParcelizer == initstate.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        int iAudioAttributesCompatParcelizer2 = assignParameter.AudioAttributesCompatParcelizer(this.write);
        return (((((((iAudioAttributesCompatParcelizer * 31) + iAudioAttributesCompatParcelizer2) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.read)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public /* synthetic */ initState(float f, float f2, float f3, float f4, boolean z, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4, z, getanswermap);
    }
}
