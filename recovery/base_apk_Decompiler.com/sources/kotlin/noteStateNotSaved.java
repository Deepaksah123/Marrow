package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010\u0011J#\u0010\u0012\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0013\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J#\u0010\u0014\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0014\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u0015\"\u0004\b\u0013\u0010\u0016R\u001c\u0010\u0013\u001a\u00020\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0015\"\u0004\b\f\u0010\u0016"}, d2 = {"Lo/noteStateNotSaved;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/assignParameter;", "p0", "p1", "<init>", "(FFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "F", "(F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class noteStateNotSaved extends _handleOddName.IconCompatParcelizer implements _initForReading {
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private float write;

    private noteStateNotSaved(float f, float f2) {
        this.write = f;
        this.AudioAttributesCompatParcelizer = f2;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.write = f;
    }

    public final void read(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        int iMediaBrowserCompatItemReceiver;
        int iMediaBrowserCompatCustomActionResultReceiver;
        if (!Float.isNaN(this.write) && PropertyValueAny.MediaBrowserCompatItemReceiver(j) == 0) {
            int iIconCompatParcelizer = withcontentvaluehandler.IconCompatParcelizer(this.write);
            iMediaBrowserCompatItemReceiver = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
            if (iIconCompatParcelizer < 0) {
                iIconCompatParcelizer = 0;
            }
            if (iIconCompatParcelizer <= iMediaBrowserCompatItemReceiver) {
                iMediaBrowserCompatItemReceiver = iIconCompatParcelizer;
            }
        } else {
            iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        }
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        if (!Float.isNaN(this.AudioAttributesCompatParcelizer) && PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j) == 0) {
            int iIconCompatParcelizer2 = withcontentvaluehandler.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
            int i = iIconCompatParcelizer2 >= 0 ? iIconCompatParcelizer2 : 0;
            if (i <= iMediaBrowserCompatCustomActionResultReceiver) {
                iMediaBrowserCompatCustomActionResultReceiver = i;
            }
        } else {
            iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
        }
        final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueBuffer.read(iMediaBrowserCompatItemReceiver, iAudioAttributesImplBaseParcelizer, iMediaBrowserCompatCustomActionResultReceiver, PropertyValueAny.AudioAttributesImplApi21Parcelizer(j)));
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new getAnswerMap() { // from class: o.lambdaperformCreateView0androidxfragmentappFragment
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return noteStateNotSaved.AudioAttributesCompatParcelizer(_parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin._initForReading
    public final int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        int iAudioAttributesCompatParcelizer = hashandlers.AudioAttributesCompatParcelizer(i);
        int iIconCompatParcelizer = !Float.isNaN(this.write) ? getvaluehandler.IconCompatParcelizer(this.write) : 0;
        return iAudioAttributesCompatParcelizer < iIconCompatParcelizer ? iIconCompatParcelizer : iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin._initForReading
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        int iWrite = hashandlers.write(i);
        int iIconCompatParcelizer = !Float.isNaN(this.write) ? getvaluehandler.IconCompatParcelizer(this.write) : 0;
        return iWrite < iIconCompatParcelizer ? iIconCompatParcelizer : iWrite;
    }

    @Override // kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        int i2 = hashandlers.read(i);
        int iIconCompatParcelizer = !Float.isNaN(this.AudioAttributesCompatParcelizer) ? getvaluehandler.IconCompatParcelizer(this.AudioAttributesCompatParcelizer) : 0;
        return i2 < iIconCompatParcelizer ? iIconCompatParcelizer : i2;
    }

    @Override // kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        int iIconCompatParcelizer = hashandlers.IconCompatParcelizer(i);
        int iIconCompatParcelizer2 = !Float.isNaN(this.AudioAttributesCompatParcelizer) ? getvaluehandler.IconCompatParcelizer(this.AudioAttributesCompatParcelizer) : 0;
        return iIconCompatParcelizer < iIconCompatParcelizer2 ? iIconCompatParcelizer2 : iIconCompatParcelizer;
    }

    public /* synthetic */ noteStateNotSaved(float f, float f2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2);
    }
}
