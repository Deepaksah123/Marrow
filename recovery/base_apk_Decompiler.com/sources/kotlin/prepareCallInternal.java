package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0006J#\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lo/prepareCallInternal;", "Lo/initLifecycle;", "Lo/_initForReading;", "Lo/onCreateView;", "p0", "<init>", "(Lo/onCreateView;)V", "RemoteActionCompatParcelizer", "(Lo/onCreateView;)Lo/onCreateView;", "", "AudioAttributesImplApi21Parcelizer", "()V", "AudioAttributesCompatParcelizer", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/onCreateView;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class prepareCallInternal extends initLifecycle implements _initForReading {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private onCreateView write;

    public prepareCallInternal(onCreateView oncreateview) {
        this.write = oncreateview;
    }

    @Override // kotlin.initLifecycle
    public onCreateView RemoteActionCompatParcelizer(onCreateView p0) {
        return onDestroy.read(p0, this.write);
    }

    @Override // kotlin.initLifecycle
    public void AudioAttributesImplApi21Parcelizer() {
        super.AudioAttributesImplApi21Parcelizer();
        _newReader.RemoteActionCompatParcelizer(this);
    }

    public final void AudioAttributesCompatParcelizer(onCreateView p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write)) {
            return;
        }
        this.write = p0;
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin._initForReading
    public withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        withContentValueHandler withcontentvaluehandler2 = withcontentvaluehandler;
        final int iRemoteActionCompatParcelizer = getWrite().RemoteActionCompatParcelizer(withcontentvaluehandler2, withcontentvaluehandler.getAudioAttributesCompatParcelizer()) - getRead().RemoteActionCompatParcelizer(withcontentvaluehandler2, withcontentvaluehandler.getAudioAttributesCompatParcelizer());
        final int iAudioAttributesCompatParcelizer = getWrite().AudioAttributesCompatParcelizer(withcontentvaluehandler2) - getRead().AudioAttributesCompatParcelizer(withcontentvaluehandler2);
        int iWrite = (getWrite().write(withcontentvaluehandler2, withcontentvaluehandler.getAudioAttributesCompatParcelizer()) - getRead().write(withcontentvaluehandler2, withcontentvaluehandler.getAudioAttributesCompatParcelizer())) + iRemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer2 = (getWrite().RemoteActionCompatParcelizer(withcontentvaluehandler2) - getRead().RemoteActionCompatParcelizer(withcontentvaluehandler2)) + iAudioAttributesCompatParcelizer;
        final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueBuffer.IconCompatParcelizer(j, -iWrite, -iRemoteActionCompatParcelizer2));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueBuffer.IconCompatParcelizer(j, _parserVarWrite.getRead() + iWrite), PropertyValueBuffer.RemoteActionCompatParcelizer(j, _parserVarWrite.getRemoteActionCompatParcelizer() + iRemoteActionCompatParcelizer2), null, new getAnswerMap() { // from class: o.registerOnPreAttachListener
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return prepareCallInternal.RemoteActionCompatParcelizer(_parserVarWrite, iRemoteActionCompatParcelizer, iAudioAttributesCompatParcelizer, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_parser _parserVar, int i, int i2, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, i, i2, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }
}
