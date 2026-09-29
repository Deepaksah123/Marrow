package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\r\u0010\u0012J#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\n\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\n\u0010\u0012J#\u0010\u0014\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\n\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016"}, d2 = {"Lo/getActivity;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "<init>", "()V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "RemoteActionCompatParcelizer", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)J", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "AudioAttributesCompatParcelizer", "write", "", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class getActivity extends _handleOddName.IconCompatParcelizer implements _initForReading {
    public abstract long RemoteActionCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j);

    /* JADX INFO: renamed from: read */
    public abstract boolean getAudioAttributesCompatParcelizer();

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(withcontentvaluehandler, istypeorsupertypeof, j);
        if (getAudioAttributesCompatParcelizer()) {
            jRemoteActionCompatParcelizer = PropertyValueBuffer.IconCompatParcelizer(j, jRemoteActionCompatParcelizer);
        }
        final _parser _parserVarWrite = istypeorsupertypeof.write(jRemoteActionCompatParcelizer);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new getAnswerMap() { // from class: o.getAllowReturnTransitionOverlap
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getActivity.read(_parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, hasReferringProperties.INSTANCE.write(), BitmapDescriptorFactory.HUE_RED, 2, null);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin._initForReading
    public int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return hashandlers.AudioAttributesCompatParcelizer(i);
    }

    public int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return hashandlers.read(i);
    }

    @Override // kotlin._initForReading
    public int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return hashandlers.write(i);
    }

    public int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return hashandlers.IconCompatParcelizer(i);
    }
}
