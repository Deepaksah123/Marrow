package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ#\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u00078\u0017X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/getId;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lkotlin/Function1;", "Lo/bufferMapProperty;", "Lo/hasReferringProperties;", "p0", "", "p1", "<init>", "(Lo/getAnswerMap;Z)V", "", "IconCompatParcelizer", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "Z", "AudioAttributesImplBaseParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getId extends _handleOddName.IconCompatParcelizer implements _initForReading {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public getAnswerMap<? super bufferMapProperty, hasReferringProperties> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;
    public boolean RemoteActionCompatParcelizer;

    public getId(getAnswerMap<? super bufferMapProperty, hasReferringProperties> getanswermap, boolean z) {
        this.IconCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final void IconCompatParcelizer(getAnswerMap<? super bufferMapProperty, hasReferringProperties> p0, boolean p1) {
        if (this.IconCompatParcelizer != p0 || this.RemoteActionCompatParcelizer != p1) {
            _newReader.write(this);
        }
        this.IconCompatParcelizer = p0;
        this.RemoteActionCompatParcelizer = p1;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        final _parser _parserVarWrite = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new getAnswerMap() { // from class: o.getParentFragmentManager
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getId.IconCompatParcelizer(this.write, _parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getId getid, _parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        long write = getid.IconCompatParcelizer.invoke(iconCompatParcelizer).getWrite();
        if (getid.RemoteActionCompatParcelizer) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, hasReferringProperties.IconCompatParcelizer(write), hasReferringProperties.AudioAttributesCompatParcelizer(write), BitmapDescriptorFactory.HUE_RED, null, 12, null);
        } else {
            _parser.IconCompatParcelizer.read$default(iconCompatParcelizer, _parserVar, hasReferringProperties.IconCompatParcelizer(write), hasReferringProperties.AudioAttributesCompatParcelizer(write), BitmapDescriptorFactory.HUE_RED, null, 12, null);
        }
        return getShowPopup.INSTANCE;
    }
}
