package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0012\u001a\u00020\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0014\u001a\u00020\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0013\"\u0004\b\u0012\u0010\u0015R\u001c\u0010\u0017\u001a\u00020\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0013\"\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0010\u001a\u00020\b8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0018\"\u0004\b\u0010\u0010\u0019"}, d2 = {"Lo/getResources;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "", "p4", "<init>", "(FFFFZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "write", "F", "AudioAttributesCompatParcelizer", "(F)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getResources extends _handleOddName.IconCompatParcelizer implements _initForReading {
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private float write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float IconCompatParcelizer;
    private boolean read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float RemoteActionCompatParcelizer;

    private getResources(float f, float f2, float f3, float f4, boolean z) {
        this.RemoteActionCompatParcelizer = f;
        this.write = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.IconCompatParcelizer = f4;
        this.read = z;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final void IconCompatParcelizer(float f) {
        this.write = f;
    }

    public final void write(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.IconCompatParcelizer = f;
    }

    public final void read(boolean z) {
        this.read = z;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        int iIconCompatParcelizer = withcontentvaluehandler.IconCompatParcelizer(this.RemoteActionCompatParcelizer) + withcontentvaluehandler.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        int iIconCompatParcelizer2 = withcontentvaluehandler.IconCompatParcelizer(this.write) + withcontentvaluehandler.IconCompatParcelizer(this.IconCompatParcelizer);
        final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueBuffer.IconCompatParcelizer(j, -iIconCompatParcelizer, -iIconCompatParcelizer2));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueBuffer.IconCompatParcelizer(j, _parserVarWrite.getRead() + iIconCompatParcelizer), PropertyValueBuffer.RemoteActionCompatParcelizer(j, _parserVarWrite.getRemoteActionCompatParcelizer() + iIconCompatParcelizer2), null, new getAnswerMap() { // from class: o.getPopEnterAnim
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getResources.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, _parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getResources getresources, _parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        if (getresources.read) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, iconCompatParcelizer.IconCompatParcelizer(getresources.RemoteActionCompatParcelizer), iconCompatParcelizer.IconCompatParcelizer(getresources.write), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        } else {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, iconCompatParcelizer.IconCompatParcelizer(getresources.RemoteActionCompatParcelizer), iconCompatParcelizer.IconCompatParcelizer(getresources.write), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        return getShowPopup.INSTANCE;
    }

    public /* synthetic */ getResources(float f, float f2, float f3, float f4, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4, z);
    }
}
