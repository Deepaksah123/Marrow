package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\r\u0010\u0012J#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0014\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0016*\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u0016*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0013\u001a\u00020\u0016*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0019J\u001b\u0010\r\u001a\u00020\u0016*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0019J\u001b\u0010\u0014\u001a\u00020\u0016*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0019R\u001c\u0010\u0018\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u001a\"\u0004\b\u0014\u0010\u001bR\u001c\u0010\u0015\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001c\"\u0004\b\r\u0010\u001d"}, d2 = {"Lo/setOnScrollChangeListener;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "", "p0", "", "p1", "<init>", "(FZ)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "Lo/getKey;", "(J)J", "IconCompatParcelizer", "(JZ)J", "F", "(F)V", "Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setOnScrollChangeListener extends _handleOddName.IconCompatParcelizer implements _initForReading {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float IconCompatParcelizer;

    public setOnScrollChangeListener(float f, boolean z) {
        this.IconCompatParcelizer = f;
        this.write = z;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.IconCompatParcelizer = f;
    }

    public final void read(boolean z) {
        this.write = z;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j);
        if (!getKey.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
            j = PropertyValueAny.INSTANCE.AudioAttributesCompatParcelizer((int) (jRemoteActionCompatParcelizer >> 32), (int) jRemoteActionCompatParcelizer);
        }
        final _parser _parserVarWrite = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new getAnswerMap() { // from class: o.setFillViewport
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setOnScrollChangeListener.write(_parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin._initForReading
    public final int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (i == Integer.MAX_VALUE) {
            return hashandlers.AudioAttributesCompatParcelizer(i);
        }
        return Math.round(i * this.IconCompatParcelizer);
    }

    @Override // kotlin._initForReading
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (i == Integer.MAX_VALUE) {
            return hashandlers.write(i);
        }
        return Math.round(i * this.IconCompatParcelizer);
    }

    @Override // kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (i == Integer.MAX_VALUE) {
            return hashandlers.read(i);
        }
        return Math.round(i / this.IconCompatParcelizer);
    }

    @Override // kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        if (i == Integer.MAX_VALUE) {
            return hashandlers.IconCompatParcelizer(i);
        }
        return Math.round(i / this.IconCompatParcelizer);
    }

    private final long RemoteActionCompatParcelizer(long j) {
        if (!this.write) {
            long jIconCompatParcelizer = IconCompatParcelizer(j, true);
            if (!getKey.AudioAttributesCompatParcelizer(jIconCompatParcelizer, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jIconCompatParcelizer;
            }
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j, true);
            if (!getKey.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jRemoteActionCompatParcelizer;
            }
            long j2 = read(j, true);
            if (!getKey.AudioAttributesCompatParcelizer(j2, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return j2;
            }
            long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j, true);
            if (!getKey.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jAudioAttributesCompatParcelizer;
            }
            long jIconCompatParcelizer2 = IconCompatParcelizer(j, false);
            if (!getKey.AudioAttributesCompatParcelizer(jIconCompatParcelizer2, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jIconCompatParcelizer2;
            }
            long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(j, false);
            if (!getKey.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer2, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jRemoteActionCompatParcelizer2;
            }
            long j3 = read(j, false);
            if (!getKey.AudioAttributesCompatParcelizer(j3, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return j3;
            }
            long jAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(j, false);
            if (!getKey.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer2, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jAudioAttributesCompatParcelizer2;
            }
        } else {
            long jRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(j, true);
            if (!getKey.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer3, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jRemoteActionCompatParcelizer3;
            }
            long jIconCompatParcelizer3 = IconCompatParcelizer(j, true);
            if (!getKey.AudioAttributesCompatParcelizer(jIconCompatParcelizer3, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jIconCompatParcelizer3;
            }
            long jAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(j, true);
            if (!getKey.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer3, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jAudioAttributesCompatParcelizer3;
            }
            long j4 = read(j, true);
            if (!getKey.AudioAttributesCompatParcelizer(j4, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return j4;
            }
            long jRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(j, false);
            if (!getKey.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer4, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jRemoteActionCompatParcelizer4;
            }
            long jIconCompatParcelizer4 = IconCompatParcelizer(j, false);
            if (!getKey.AudioAttributesCompatParcelizer(jIconCompatParcelizer4, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jIconCompatParcelizer4;
            }
            long jAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer(j, false);
            if (!getKey.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer4, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return jAudioAttributesCompatParcelizer4;
            }
            long j5 = read(j, false);
            if (!getKey.AudioAttributesCompatParcelizer(j5, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
                return j5;
            }
        }
        return getKey.INSTANCE.RemoteActionCompatParcelizer();
    }

    private final long IconCompatParcelizer(long j, boolean z) {
        int iRound;
        int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        if (iAudioAttributesImplBaseParcelizer == Integer.MAX_VALUE || (iRound = Math.round(iAudioAttributesImplBaseParcelizer / this.IconCompatParcelizer)) <= 0 || (z && !NestedScrollView.AudioAttributesCompatParcelizer(j, iAudioAttributesImplBaseParcelizer, iRound))) {
            return getKey.INSTANCE.RemoteActionCompatParcelizer();
        }
        long j2 = -1;
        return getKey.read((((long) iAudioAttributesImplBaseParcelizer) << 32) | (((long) iRound) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    private final long RemoteActionCompatParcelizer(long j, boolean z) {
        int iRound;
        int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
        if (iAudioAttributesImplApi21Parcelizer == Integer.MAX_VALUE || (iRound = Math.round(iAudioAttributesImplApi21Parcelizer * this.IconCompatParcelizer)) <= 0 || (z && !NestedScrollView.AudioAttributesCompatParcelizer(j, iRound, iAudioAttributesImplApi21Parcelizer))) {
            return getKey.INSTANCE.RemoteActionCompatParcelizer();
        }
        long j2 = -1;
        return getKey.read((((long) iRound) << 32) | (((long) iAudioAttributesImplApi21Parcelizer) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    private final long read(long j, boolean z) {
        int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        int iRound = Math.round(iMediaBrowserCompatItemReceiver / this.IconCompatParcelizer);
        if (iRound <= 0 || (z && !NestedScrollView.AudioAttributesCompatParcelizer(j, iMediaBrowserCompatItemReceiver, iRound))) {
            return getKey.INSTANCE.RemoteActionCompatParcelizer();
        }
        long j2 = -1;
        return getKey.read((((long) iMediaBrowserCompatItemReceiver) << 32) | (((long) iRound) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    private final long AudioAttributesCompatParcelizer(long j, boolean z) {
        int iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
        int iRound = Math.round(iMediaBrowserCompatCustomActionResultReceiver * this.IconCompatParcelizer);
        if (iRound <= 0 || (z && !NestedScrollView.AudioAttributesCompatParcelizer(j, iRound, iMediaBrowserCompatCustomActionResultReceiver))) {
            return getKey.INSTANCE.RemoteActionCompatParcelizer();
        }
        long j2 = -1;
        return getKey.read((((long) iRound) << 32) | (((long) iMediaBrowserCompatCustomActionResultReceiver) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }
}
