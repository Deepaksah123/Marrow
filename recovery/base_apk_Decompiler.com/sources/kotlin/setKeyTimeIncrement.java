package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000e*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setKeyTimeIncrement;", "Lo/getCameraDistancePx;", "Lo/MutableCoercionConfig;", "p0", "Lo/hashCode;", "p1", "Lo/setParentLayoutDirection;", "p2", "", "p3", "p4", "Lo/keyDeserializers;", "p5", "Lkotlin/Function0;", "", "p6", "<init>", "(Lo/MutableCoercionConfig;Lo/hashCode;Lo/setParentLayoutDirection;ZZLo/keyDeserializers;Lo/getCreatedOnDateMs;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "read", "(Lo/MutableCoercionConfig;Lo/hashCode;Lo/setParentLayoutDirection;ZZLo/keyDeserializers;Lo/getCreatedOnDateMs;)V", "Lo/getConfigOverride;", "IconCompatParcelizer", "(Lo/getConfigOverride;)V", "RemoteActionCompatParcelizer", "Lo/MutableCoercionConfig;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setKeyTimeIncrement extends getCameraDistancePx {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private MutableCoercionConfig IconCompatParcelizer;

    private setKeyTimeIncrement(MutableCoercionConfig mutableCoercionConfig, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z, boolean z2, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        super(hashcode, setparentlayoutdirection, z, z2, null, c0184keyDeserializers, getcreatedondatems, null);
        this.IconCompatParcelizer = mutableCoercionConfig;
    }

    public final void read(MutableCoercionConfig p0, hashCode p1, setParentLayoutDirection p2, boolean p3, boolean p4, C0184keyDeserializers p5, getCreatedOnDateMs<getShowPopup> p6) {
        if (this.IconCompatParcelizer != p0) {
            this.IconCompatParcelizer = p0;
            getValueNulls.write(this);
        }
        super.RemoteActionCompatParcelizer(p1, p2, p3, p4, null, p5, p6);
    }

    @Override // kotlin.invoke
    public final void IconCompatParcelizer(final getConfigOverride getconfigoverride) {
        MapperBuilder.write(getconfigoverride, this.IconCompatParcelizer);
        MapperBuilder.write(getconfigoverride, _writeQuotedRaw.INSTANCE.IconCompatParcelizer());
        _writeStringSegment _writestringsegmentIconCompatParcelizer = _writeStringSegmentASCII2.IconCompatParcelizer(_writeStringSegment.INSTANCE, this.IconCompatParcelizer != MutableCoercionConfig.RemoteActionCompatParcelizer);
        if (_writestringsegmentIconCompatParcelizer != null) {
            MapperBuilder.write(getconfigoverride, _writestringsegmentIconCompatParcelizer);
        }
        MapperBuilder.AudioAttributesCompatParcelizer$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.setPlayedAdMarkerColor
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(setKeyTimeIncrement.IconCompatParcelizer(getconfigoverride, (_writeStringSegment) obj));
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(getConfigOverride getconfigoverride, _writeStringSegment _writestringsegment) {
        Boolean boolRemoteActionCompatParcelizer = _writestringsegment.RemoteActionCompatParcelizer();
        if (boolRemoteActionCompatParcelizer == null) {
            return false;
        }
        MapperBuilder.write(getconfigoverride, getDefaultPropertyInclusions.RemoteActionCompatParcelizer(boolRemoteActionCompatParcelizer.booleanValue()));
        return true;
    }

    public /* synthetic */ setKeyTimeIncrement(MutableCoercionConfig mutableCoercionConfig, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z, boolean z2, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(mutableCoercionConfig, hashcode, setparentlayoutdirection, z, z2, c0184keyDeserializers, getcreatedondatems);
    }
}
