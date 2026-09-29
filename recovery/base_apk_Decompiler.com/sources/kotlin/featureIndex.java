package kotlin;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.getEmpty;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0011\u0010\u0016"}, d2 = {"Lo/featureIndex;", "Lo/getEmpty$write;", "<init>", "()V", "Landroid/view/View;", "p0", "Lo/typeIdResolverInstance;", "p1", "Lo/CurrentQuery;", "p2", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "p3", "", "RemoteActionCompatParcelizer", "(Landroid/view/View;Lo/typeIdResolverInstance;Lo/CurrentQuery;Ljava/util/function/Consumer;)V", "IconCompatParcelizer", "write", "", "read", "Lo/InputAccessor;", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class featureIndex implements getEmpty.write {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final InputAccessor RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);

    private final void write(boolean z) {
        this.RemoteActionCompatParcelizer.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean read() {
        return ((Boolean) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class write extends downloadMagicModuleModule implements getAnswerMap<DatatypeFeatures, getShowPopup> {
        public final void RemoteActionCompatParcelizer(DatatypeFeatures datatypeFeatures) {
            ((UTF32Reader) this.write).read(datatypeFeatures);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(DatatypeFeatures datatypeFeatures) {
            RemoteActionCompatParcelizer(datatypeFeatures);
            return getShowPopup.INSTANCE;
        }

        write(Object obj) {
            super(1, obj, UTF32Reader.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }
    }

    /* JADX INFO: renamed from: o.featureIndex$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/DatatypeFeatures;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/DatatypeFeatures;)Ljava/lang/Comparable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<DatatypeFeatures, Comparable<?>> {
        public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(DatatypeFeatures datatypeFeatures) {
            return Integer.valueOf(datatypeFeatures.getIconCompatParcelizer().IconCompatParcelizer());
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.featureIndex$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/DatatypeFeatures;", "p0", "", "IconCompatParcelizer", "(Lo/DatatypeFeatures;)Ljava/lang/Comparable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<DatatypeFeatures, Comparable<?>> {
        public static final AnonymousClass3 RemoteActionCompatParcelizer = new AnonymousClass3();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(DatatypeFeatures datatypeFeatures) {
            return Integer.valueOf(datatypeFeatures.getAudioAttributesCompatParcelizer());
        }

        AnonymousClass3() {
            super(1);
        }
    }

    @Override // o.getEmpty.write
    public final void IconCompatParcelizer() {
        write(true);
    }

    @Override // o.getEmpty.write
    public final void write() {
        write(false);
    }

    public final void RemoteActionCompatParcelizer(View p0, typeIdResolverInstance p1, CurrentQuery p2, Consumer<ScrollCaptureTarget> p3) {
        UTF32Reader uTF32Reader = new UTF32Reader(new DatatypeFeatures[16], 0);
        isExplicitlySet.read$default(p1.read(), 0, new write(uTF32Reader), 2, null);
        uTF32Reader.AudioAttributesCompatParcelizer(getConfigExpirySeconds.read(AnonymousClass3.RemoteActionCompatParcelizer, AnonymousClass2.AudioAttributesCompatParcelizer));
        DatatypeFeatures datatypeFeatures = (DatatypeFeatures) (uTF32Reader.getAudioAttributesCompatParcelizer() != 0 ? uTF32Reader.IconCompatParcelizer[uTF32Reader.getAudioAttributesCompatParcelizer() - 1] : null);
        if (datatypeFeatures == null) {
            return;
        }
        getEmpty getempty = new getEmpty(datatypeFeatures.getRead(), datatypeFeatures.getIconCompatParcelizer(), College.AudioAttributesCompatParcelizer(p2), this, p0);
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer = hasRawClass.IconCompatParcelizer(datatypeFeatures.getRemoteActionCompatParcelizer());
        long jAudioAttributesImplBaseParcelizer = datatypeFeatures.getIconCompatParcelizer().AudioAttributesImplBaseParcelizer();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(p0, VersionUtil.write(ReadableObjectId.AudioAttributesCompatParcelizer(writableTypeIdInclusionIconCompatParcelizer)), new Point(hasReferringProperties.IconCompatParcelizer(jAudioAttributesImplBaseParcelizer), hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesImplBaseParcelizer)), getempty);
        scrollCaptureTarget.setScrollBounds(VersionUtil.write(datatypeFeatures.getIconCompatParcelizer()));
        p3.accept(scrollCaptureTarget);
    }
}
