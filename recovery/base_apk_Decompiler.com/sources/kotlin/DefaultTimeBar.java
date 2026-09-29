package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JQ\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lo/DefaultTimeBar;", "Lo/getCameraDistancePx;", "", "p0", "Lo/hashCode;", "p1", "Lo/setParentLayoutDirection;", "p2", "p3", "p4", "Lo/keyDeserializers;", "p5", "Lkotlin/Function0;", "", "p6", "<init>", "(ZLo/hashCode;Lo/setParentLayoutDirection;ZZLo/keyDeserializers;Lo/getCreatedOnDateMs;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "read", "(ZLo/hashCode;Lo/setParentLayoutDirection;ZZLo/keyDeserializers;Lo/getCreatedOnDateMs;)V", "Lo/getConfigOverride;", "IconCompatParcelizer", "(Lo/getConfigOverride;)V", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DefaultTimeBar extends getCameraDistancePx {
    private boolean IconCompatParcelizer;

    private DefaultTimeBar(boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, boolean z3, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        super(hashcode, setparentlayoutdirection, z2, z3, null, c0184keyDeserializers, getcreatedondatems, null);
        this.IconCompatParcelizer = z;
    }

    public final void read(boolean p0, hashCode p1, setParentLayoutDirection p2, boolean p3, boolean p4, C0184keyDeserializers p5, getCreatedOnDateMs<getShowPopup> p6) {
        if (this.IconCompatParcelizer != p0) {
            this.IconCompatParcelizer = p0;
            getValueNulls.write(this);
        }
        super.RemoteActionCompatParcelizer(p1, p2, p3, p4, null, p5, p6);
    }

    @Override // kotlin.invoke
    public final void IconCompatParcelizer(getConfigOverride getconfigoverride) {
        MapperBuilder.read(getconfigoverride, this.IconCompatParcelizer);
    }

    public /* synthetic */ DefaultTimeBar(boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, boolean z3, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, hashcode, setparentlayoutdirection, z2, z3, c0184keyDeserializers, getcreatedondatems);
    }
}
