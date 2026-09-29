package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b"}, d2 = {"Lo/CanvasSubtitleOutput;", "Lo/getCameraDistancePx;", "", "p0", "Lo/hashCode;", "p1", "Lo/setParentLayoutDirection;", "p2", "p3", "p4", "Lo/keyDeserializers;", "p5", "Lkotlin/Function1;", "", "p6", "<init>", "(ZLo/hashCode;Lo/setParentLayoutDirection;ZZLo/keyDeserializers;Lo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "IconCompatParcelizer", "(ZLo/hashCode;Lo/setParentLayoutDirection;ZZLo/keyDeserializers;Lo/getAnswerMap;)V", "Lo/getConfigOverride;", "(Lo/getConfigOverride;)V", "AudioAttributesImplBaseParcelizer", "Z", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "read", "Lkotlin/Function0;", "Lo/getCreatedOnDateMs;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CanvasSubtitleOutput extends getCameraDistancePx {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super Boolean, getShowPopup> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> write;

    private CanvasSubtitleOutput(final boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, boolean z3, C0184keyDeserializers c0184keyDeserializers, final getAnswerMap<? super Boolean, getShowPopup> getanswermap) {
        super(hashcode, setparentlayoutdirection, z2, z3, null, c0184keyDeserializers, new getCreatedOnDateMs() { // from class: o.setKeyCountIncrement
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CanvasSubtitleOutput.read(getanswermap, z);
            }
        }, null);
        this.RemoteActionCompatParcelizer = z;
        this.read = getanswermap;
        this.write = new getCreatedOnDateMs() { // from class: o.setDuration
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CanvasSubtitleOutput.write(this.IconCompatParcelizer);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAnswerMap getanswermap, boolean z) {
        getanswermap.invoke(Boolean.valueOf(!z));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(CanvasSubtitleOutput canvasSubtitleOutput) {
        canvasSubtitleOutput.read.invoke(Boolean.valueOf(!canvasSubtitleOutput.RemoteActionCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(boolean p0, hashCode p1, setParentLayoutDirection p2, boolean p3, boolean p4, C0184keyDeserializers p5, getAnswerMap<? super Boolean, getShowPopup> p6) {
        if (this.RemoteActionCompatParcelizer != p0) {
            this.RemoteActionCompatParcelizer = p0;
            getValueNulls.write(this);
        }
        this.read = p6;
        super.RemoteActionCompatParcelizer(p1, p2, p3, p4, null, p5, this.write);
    }

    @Override // kotlin.invoke
    public final void IconCompatParcelizer(final getConfigOverride getconfigoverride) {
        MapperBuilder.write(getconfigoverride, getDefaultPropertyInclusions.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
        MapperBuilder.write(getconfigoverride, _writeQuotedRaw.INSTANCE.IconCompatParcelizer());
        _writeStringSegment _writestringsegmentIconCompatParcelizer = _writeStringSegmentASCII2.IconCompatParcelizer(_writeStringSegment.INSTANCE, this.RemoteActionCompatParcelizer);
        if (_writestringsegmentIconCompatParcelizer != null) {
            MapperBuilder.write(getconfigoverride, _writestringsegmentIconCompatParcelizer);
        }
        MapperBuilder.AudioAttributesCompatParcelizer$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.setBufferedColor
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CanvasSubtitleOutput.IconCompatParcelizer(getconfigoverride, (_writeStringSegment) obj));
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

    public /* synthetic */ CanvasSubtitleOutput(boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, boolean z3, C0184keyDeserializers c0184keyDeserializers, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, hashcode, setparentlayoutdirection, z2, z3, c0184keyDeserializers, getanswermap);
    }
}
