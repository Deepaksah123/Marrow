package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/_handleOddName;", "", "p0", "", "p1", "read", "(Lo/_handleOddName;FZ)Lo/_handleOddName;", "Lo/PropertyValueAny;", "", "AudioAttributesCompatParcelizer", "(JII)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NestedScrollView {
    public static /* synthetic */ _handleOddName read$default(_handleOddName _handleoddname, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return read(_handleoddname, f, z);
    }

    /* JADX INFO: renamed from: o.NestedScrollView$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "AudioAttributesCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ boolean $AudioAttributesCompatParcelizer;
        final /* synthetic */ float $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            AudioAttributesCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(as asVar) {
            asVar.write("aspectRatio");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("ratio", Float.valueOf(this.$write));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("matchHeightConstraintsFirst", Boolean.valueOf(this.$AudioAttributesCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f, boolean z) {
            super(1);
            this.$write = f;
            this.$AudioAttributesCompatParcelizer = z;
        }
    }

    public static final boolean AudioAttributesCompatParcelizer(long j, int i, int i2) {
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        if (i > PropertyValueAny.AudioAttributesImplBaseParcelizer(j) || iMediaBrowserCompatItemReceiver > i) {
            return false;
        }
        return i2 <= PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) && PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j) <= i2;
    }

    public static final _handleOddName read(_handleOddName _handleoddname, float f, boolean z) {
        return _handleoddname.AudioAttributesCompatParcelizer(new ProtectionLayout(f, z, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass4(f, z) : C0214type.read()));
    }
}
