package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getHost;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/assignParameter;", "p0", "p1", "", "p2", "<init>", "(FFZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "write", "(FFZ)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "IconCompatParcelizer", "F", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Z", "AudioAttributesImplBaseParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getHost extends _handleOddName.IconCompatParcelizer implements _initForReading {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public float IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public boolean read;
    private final boolean write;

    private getHost(float f, float f2, boolean z) {
        this.RemoteActionCompatParcelizer = f;
        this.IconCompatParcelizer = f2;
        this.read = z;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final void write(float p0, float p1, boolean p2) {
        if (!assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0) || !assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, p1) || this.read != p2) {
            _newReader.write(this);
        }
        this.RemoteActionCompatParcelizer = p0;
        this.IconCompatParcelizer = p1;
        this.read = p2;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        final _parser _parserVarWrite = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new getAnswerMap() { // from class: o.getFragmentManager
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getHost.read(this.IconCompatParcelizer, _parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getHost gethost, _parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        if (gethost.read) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, iconCompatParcelizer.IconCompatParcelizer(gethost.RemoteActionCompatParcelizer), iconCompatParcelizer.IconCompatParcelizer(gethost.IconCompatParcelizer), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        } else {
            _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, iconCompatParcelizer.IconCompatParcelizer(gethost.RemoteActionCompatParcelizer), iconCompatParcelizer.IconCompatParcelizer(gethost.IconCompatParcelizer), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        return getShowPopup.INSTANCE;
    }

    public /* synthetic */ getHost(float f, float f2, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, z);
    }
}
