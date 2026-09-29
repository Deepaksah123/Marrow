package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\u000f\u0010\u0011R\u001c\u0010\r\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\r\u0010\u0013\"\u0004\b\r\u0010\u0014"}, d2 = {"Lo/prepareDialog;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/access100;", "p0", "", "p1", "<init>", "(Lo/access100;F)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "RemoteActionCompatParcelizer", "Lo/access100;", "(Lo/access100;)V", "IconCompatParcelizer", "F", "(F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class prepareDialog extends _handleOddName.IconCompatParcelizer implements _initForReading {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private access100 IconCompatParcelizer;
    private float read;

    public prepareDialog(access100 access100Var, float f) {
        this.IconCompatParcelizer = access100Var;
        this.read = f;
    }

    public final void RemoteActionCompatParcelizer(access100 access100Var) {
        this.IconCompatParcelizer = access100Var;
    }

    public final void read(float f) {
        this.read = f;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        int iAudioAttributesImplBaseParcelizer;
        int i;
        int iAudioAttributesImplApi21Parcelizer;
        int i2;
        if (!PropertyValueAny.RemoteActionCompatParcelizer(j) || this.IconCompatParcelizer == access100.AudioAttributesCompatParcelizer) {
            int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
            iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
            i = iMediaBrowserCompatItemReceiver;
        } else {
            int iRound = Math.round(PropertyValueAny.AudioAttributesImplBaseParcelizer(j) * this.read);
            int iMediaBrowserCompatItemReceiver2 = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
            iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
            if (iRound < iMediaBrowserCompatItemReceiver2) {
                iRound = iMediaBrowserCompatItemReceiver2;
            }
            if (iRound <= iAudioAttributesImplBaseParcelizer) {
                iAudioAttributesImplBaseParcelizer = iRound;
            }
            i = iAudioAttributesImplBaseParcelizer;
        }
        if (!PropertyValueAny.AudioAttributesCompatParcelizer(j) || this.IconCompatParcelizer == access100.RemoteActionCompatParcelizer) {
            int iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
            int iAudioAttributesImplApi21Parcelizer2 = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
            iAudioAttributesImplApi21Parcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            i2 = iAudioAttributesImplApi21Parcelizer2;
        } else {
            int iRound2 = Math.round(PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) * this.read);
            int iMediaBrowserCompatCustomActionResultReceiver2 = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
            iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
            if (iRound2 < iMediaBrowserCompatCustomActionResultReceiver2) {
                iRound2 = iMediaBrowserCompatCustomActionResultReceiver2;
            }
            if (iRound2 <= iAudioAttributesImplApi21Parcelizer) {
                iAudioAttributesImplApi21Parcelizer = iRound2;
            }
            i2 = iAudioAttributesImplApi21Parcelizer;
        }
        final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueBuffer.read(i, iAudioAttributesImplBaseParcelizer, iAudioAttributesImplApi21Parcelizer, i2));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new getAnswerMap() { // from class: o.dismissInternal
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return prepareDialog.AudioAttributesCompatParcelizer(_parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }
}
