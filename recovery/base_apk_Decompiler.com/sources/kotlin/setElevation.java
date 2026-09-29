package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J#\u0010\u0015\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0016\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0019*\u00020\u0018H\u0016¢\u0006\u0004\b\u0017\u0010\u001aR\u001c\u0010\u000f\u001a\u00020\u00048\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\u000f\u0010\u001dR\u001c\u0010\u0016\u001a\u00020\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001e\"\u0004\b\u0015\u0010\u001fR\u001c\u0010\u001b\u001a\u00020\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001e\"\u0004\b\u000f\u0010\u001f"}, d2 = {"Lo/setElevation;", "Lo/_initForReading;", "Lo/hasIndex;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/setTranslationY;", "p0", "", "p1", "p2", "<init>", "(Lo/setTranslationY;ZZ)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write", "Lo/getConfigOverride;", "", "(Lo/getConfigOverride;)V", "IconCompatParcelizer", "Lo/setTranslationY;", "(Lo/setTranslationY;)V", "Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setElevation extends _handleOddName.IconCompatParcelizer implements _initForReading, hasIndex {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setTranslationY read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    public setElevation(setTranslationY settranslationy, boolean z, boolean z2) {
        this.read = settranslationy;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
    }

    public final void read(setTranslationY settranslationy) {
        this.read = settranslationy;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final void read(boolean z) {
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        ComposeView.read(j, this.IconCompatParcelizer ? superDispatchKeyEvent.write : superDispatchKeyEvent.AudioAttributesCompatParcelizer);
        final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueAny.AudioAttributesCompatParcelizer$default(j, 0, this.IconCompatParcelizer ? PropertyValueAny.AudioAttributesImplBaseParcelizer(j) : Integer.MAX_VALUE, 0, this.IconCompatParcelizer ? Integer.MAX_VALUE : PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), 5, null));
        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(_parserVarWrite.getRead(), PropertyValueAny.AudioAttributesImplBaseParcelizer(j));
        int iRemoteActionCompatParcelizer2 = getQues.RemoteActionCompatParcelizer(_parserVarWrite.getRemoteActionCompatParcelizer(), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j));
        final int remoteActionCompatParcelizer = _parserVarWrite.getRemoteActionCompatParcelizer() - iRemoteActionCompatParcelizer2;
        int read = _parserVarWrite.getRead();
        if (!this.IconCompatParcelizer) {
            remoteActionCompatParcelizer = read - iRemoteActionCompatParcelizer;
        }
        this.read.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        this.read.write(this.IconCompatParcelizer ? iRemoteActionCompatParcelizer2 : iRemoteActionCompatParcelizer);
        this.read.read(this.IconCompatParcelizer ? _parserVarWrite.getRemoteActionCompatParcelizer() : _parserVarWrite.getRead());
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, null, new getAnswerMap() { // from class: o.setPivotY
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setElevation.IconCompatParcelizer(this.write, remoteActionCompatParcelizer, _parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setElevation setelevation, int i, final _parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        int iMediaBrowserCompatItemReceiver = setelevation.read.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver < 0) {
            iMediaBrowserCompatItemReceiver = 0;
        }
        if (iMediaBrowserCompatItemReceiver > i) {
            iMediaBrowserCompatItemReceiver = i;
        }
        int i2 = setelevation.RemoteActionCompatParcelizer ? iMediaBrowserCompatItemReceiver - i : -iMediaBrowserCompatItemReceiver;
        boolean z = setelevation.IconCompatParcelizer;
        final int i3 = z ? 0 : i2;
        final int i4 = z ? i2 : 0;
        iconCompatParcelizer.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.setWrapMode
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setElevation.RemoteActionCompatParcelizer(_parserVar, i3, i4, (_parser.IconCompatParcelizer) obj);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_parser _parserVar, int i, int i2, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, i, i2, BitmapDescriptorFactory.HUE_RED, null, 12, null);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin._initForReading
    public final int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (this.IconCompatParcelizer) {
            i = Integer.MAX_VALUE;
        }
        return hashandlers.AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (!this.IconCompatParcelizer) {
            i = Integer.MAX_VALUE;
        }
        return hashandlers.read(i);
    }

    @Override // kotlin._initForReading
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (this.IconCompatParcelizer) {
            i = Integer.MAX_VALUE;
        }
        return hashandlers.write(i);
    }

    @Override // kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (!this.IconCompatParcelizer) {
            i = Integer.MAX_VALUE;
        }
        return hashandlers.IconCompatParcelizer(i);
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        MapperBuilder.AudioAttributesImplBaseParcelizer(getconfigoverride, true);
        withAdditionalKeyDeserializers withadditionalkeydeserializers = new withAdditionalKeyDeserializers(new getCreatedOnDateMs() { // from class: o.setPivotX
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Float.valueOf(setElevation.read(this.IconCompatParcelizer));
            }
        }, new getCreatedOnDateMs() { // from class: o.Layer
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Float.valueOf(setElevation.RemoteActionCompatParcelizer(this.read));
            }
        }, this.RemoteActionCompatParcelizer);
        if (this.IconCompatParcelizer) {
            MapperBuilder.write(getconfigoverride, withadditionalkeydeserializers);
        } else {
            MapperBuilder.RemoteActionCompatParcelizer(getconfigoverride, withadditionalkeydeserializers);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float read(setElevation setelevation) {
        return setelevation.read.MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RemoteActionCompatParcelizer(setElevation setelevation) {
        return setelevation.read.IconCompatParcelizer();
    }
}
