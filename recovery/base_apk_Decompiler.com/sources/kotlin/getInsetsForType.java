package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/getInsetsForType;", "Lo/writerFor;", "Lo/WindowInsetsCompatImpl28;", "Lo/weirdNumberException;", "p0", "Lo/assignParameter;", "p1", "p2", "Lkotlin/Function1;", "Lo/as;", "", "p3", "<init>", "(Lo/weirdNumberException;FFLo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "()Lo/WindowInsetsCompatImpl28;", "RemoteActionCompatParcelizer", "(Lo/WindowInsetsCompatImpl28;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "Lo/weirdNumberException;", "write", "F", "read", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getInsetsForType extends writerFor<WindowInsetsCompatImpl28> {
    private final weirdNumberException IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<as, getShowPopup> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;

    /* JADX WARN: Multi-variable type inference failed */
    private getInsetsForType(weirdNumberException weirdnumberexception, float f, float f2, getAnswerMap<? super as, getShowPopup> getanswermap) {
        this.IconCompatParcelizer = weirdnumberexception;
        this.read = f;
        this.AudioAttributesCompatParcelizer = f2;
        this.write = getanswermap;
        boolean z = true;
        boolean z2 = f >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f);
        if (f2 < BitmapDescriptorFactory.HUE_RED && !Float.isNaN(f2)) {
            z = false;
        }
        if (!z2 || !z) {
            performCreate.IconCompatParcelizer("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final WindowInsetsCompatImpl28 IconCompatParcelizer() {
        return new WindowInsetsCompatImpl28(this.IconCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(WindowInsetsCompatImpl28 p0) {
        p0.IconCompatParcelizer(this.IconCompatParcelizer);
        p0.RemoteActionCompatParcelizer(this.read);
        p0.write(this.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        getInsetsForType getinsetsfortype = p0 instanceof getInsetsForType ? (getInsetsForType) p0 : null;
        return getinsetsfortype != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getinsetsfortype.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.read, getinsetsfortype.read) && assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, getinsetsfortype.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + assignParameter.AudioAttributesCompatParcelizer(this.read)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public /* synthetic */ getInsetsForType(weirdNumberException weirdnumberexception, float f, float f2, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(weirdnumberexception, f, f2, getanswermap);
    }
}
