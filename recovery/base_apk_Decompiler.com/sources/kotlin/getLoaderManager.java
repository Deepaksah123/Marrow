package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lo/getLoaderManager;", "Lo/writerFor;", "Lo/getResources;", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "", "p4", "Lkotlin/Function1;", "Lo/as;", "", "p5", "<init>", "(FFFFZLo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "RemoteActionCompatParcelizer", "()Lo/getResources;", "(Lo/getResources;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "F", "MediaBrowserCompatItemReceiver", "read", "write", "IconCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getLoaderManager extends writerFor<getResources> {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getAnswerMap<as, getShowPopup> MediaBrowserCompatItemReceiver;
    public float IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    public float read;
    public float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public boolean AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private getLoaderManager(float f, float f2, float f3, float f4, boolean z, getAnswerMap<? super as, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = f;
        this.read = f2;
        this.write = f3;
        this.IconCompatParcelizer = f4;
        this.AudioAttributesCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = getanswermap;
        boolean z2 = true;
        boolean z3 = f >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f);
        float f5 = this.read;
        boolean z4 = f5 >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f5);
        float f6 = this.write;
        boolean z5 = f6 >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f6);
        float f7 = this.IconCompatParcelizer;
        if (f7 < BitmapDescriptorFactory.HUE_RED && !Float.isNaN(f7)) {
            z2 = false;
        }
        if (!(z3 & z4 & z5) || !z2) {
            performCreate.IconCompatParcelizer("Padding must be non-negative");
        }
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getResources IconCompatParcelizer() {
        return new getResources(this.RemoteActionCompatParcelizer, this.read, this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getResources p0) {
        p0.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        p0.IconCompatParcelizer(this.read);
        p0.write(this.write);
        p0.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        p0.read(this.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer2 = assignParameter.AudioAttributesCompatParcelizer(this.read);
        return (((((((iAudioAttributesCompatParcelizer * 31) + iAudioAttributesCompatParcelizer2) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.write)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        getLoaderManager getloadermanager = p0 instanceof getLoaderManager ? (getLoaderManager) p0 : null;
        return getloadermanager != null && assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, getloadermanager.RemoteActionCompatParcelizer) && assignParameter.IconCompatParcelizer(this.read, getloadermanager.read) && assignParameter.IconCompatParcelizer(this.write, getloadermanager.write) && assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, getloadermanager.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == getloadermanager.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ getLoaderManager(float f, float f2, float f3, float f4, boolean z, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4, z, getanswermap);
    }
}
