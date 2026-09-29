package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin.containedTypeCount;
import kotlin.deliverCancellation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001eB'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0006\u001a\u00020\u00162\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t*\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0019\u001a\u00020\t*\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010 J\u0013\u0010!\u001a\u00020\t*\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u001cJ-\u0010\u001b\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010%R\u0016\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\u001e\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010)"}, d2 = {"Lo/forceLoad;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_initForReading;", "Lo/convertEnumToExternalName;", "Lo/containedTypeCount;", "Lo/onAbandon;", "p0", "Lo/deliverCancellation;", "p1", "", "p2", "Lo/superDispatchKeyEvent;", "p3", "<init>", "(Lo/onAbandon;Lo/deliverCancellation;ZLo/superDispatchKeyEvent;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "T", "Lo/containedTypeCount$IconCompatParcelizer;", "Lkotlin/Function1;", "Lo/containedTypeCount$AudioAttributesCompatParcelizer;", "write", "(ILo/getAnswerMap;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(I)Z", "Lo/deliverCancellation$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/deliverCancellation$RemoteActionCompatParcelizer;I)Lo/deliverCancellation$RemoteActionCompatParcelizer;", "(Lo/deliverCancellation$RemoteActionCompatParcelizer;I)Z", "IconCompatParcelizer", "", "MediaBrowserCompatCustomActionResultReceiver", "Lo/onAbandon;", "Lo/deliverCancellation;", "AudioAttributesImplApi21Parcelizer", "Z", "Lo/superDispatchKeyEvent;", "()Lo/containedTypeCount;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class forceLoad extends _handleOddName.IconCompatParcelizer implements _initForReading, convertEnumToExternalName, containedTypeCount {
    public static final int read = 8;
    private static final read write = new read();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private deliverCancellation read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private onAbandon IconCompatParcelizer;
    private superDispatchKeyEvent RemoteActionCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[tryToResolveUnresolved.values().length];
            try {
                iArr[tryToResolveUnresolved.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tryToResolveUnresolved.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public forceLoad(onAbandon onabandon, deliverCancellation delivercancellation, boolean z, superDispatchKeyEvent superdispatchkeyevent) {
        this.IconCompatParcelizer = onabandon;
        this.read = delivercancellation;
        this.write = z;
        this.RemoteActionCompatParcelizer = superdispatchkeyevent;
    }

    @Override // kotlin.convertEnumToExternalName
    public final containedTypeCount write() {
        return this;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        final _parser _parserVarWrite = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new getAnswerMap() { // from class: o.isStarted
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return forceLoad.IconCompatParcelizer(_parserVarWrite, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005"}, d2 = {"Lo/forceLoad$read;", "Lo/containedTypeCount$AudioAttributesCompatParcelizer;", "", "IconCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements containedTypeCount.AudioAttributesCompatParcelizer {
        private final boolean IconCompatParcelizer;

        read() {
        }

        @Override // o.containedTypeCount.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Override // kotlin.containedTypeCount
    public final <T> T write(int p0, getAnswerMap<? super containedTypeCount.AudioAttributesCompatParcelizer, ? extends T> p1) {
        int iRemoteActionCompatParcelizer;
        if (this.IconCompatParcelizer.write() <= 0 || !this.IconCompatParcelizer.IconCompatParcelizer() || !getRatingCompat()) {
            return p1.invoke(write);
        }
        if (RemoteActionCompatParcelizer(p0)) {
            iRemoteActionCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        } else {
            iRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        }
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        writeVar.write = (T) this.read.write(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer);
        int iRemoteActionCompatParcelizer2 = getQues.RemoteActionCompatParcelizer(this.IconCompatParcelizer.read() << 1, this.IconCompatParcelizer.write());
        T tInvoke = null;
        int i = 0;
        while (tInvoke == null && write((deliverCancellation.RemoteActionCompatParcelizer) writeVar.write, p0) && i < iRemoteActionCompatParcelizer2) {
            T t = (T) AudioAttributesCompatParcelizer((deliverCancellation.RemoteActionCompatParcelizer) writeVar.write, p0);
            this.read.IconCompatParcelizer((deliverCancellation.RemoteActionCompatParcelizer) writeVar.write);
            writeVar.write = t;
            i++;
            _newReader.read(this);
            tInvoke = p1.invoke(new RemoteActionCompatParcelizer(writeVar, p0));
        }
        this.read.IconCompatParcelizer((deliverCancellation.RemoteActionCompatParcelizer) writeVar.write);
        _newReader.read(this);
        return tInvoke;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/forceLoad$RemoteActionCompatParcelizer;", "Lo/containedTypeCount$AudioAttributesCompatParcelizer;", "", "IconCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements containedTypeCount.AudioAttributesCompatParcelizer {
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<deliverCancellation.RemoteActionCompatParcelizer> read;

        RemoteActionCompatParcelizer(MagicModuleUseCaseImplWhenMappings.write<deliverCancellation.RemoteActionCompatParcelizer> writeVar, int i) {
            this.read = writeVar;
            this.IconCompatParcelizer = i;
        }

        @Override // o.containedTypeCount.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final boolean getIconCompatParcelizer() {
            return forceLoad.this.write(this.read.write, this.IconCompatParcelizer);
        }
    }

    private final boolean RemoteActionCompatParcelizer(int i) {
        if (containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.RemoteActionCompatParcelizer())) {
            return false;
        }
        if (containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.read())) {
            return true;
        }
        if (containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.AudioAttributesCompatParcelizer())) {
            return this.write;
        }
        if (containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.write())) {
            return !this.write;
        }
        if (containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.IconCompatParcelizer())) {
            int i2 = WhenMappings.AudioAttributesCompatParcelizer[collectLongDefaults.AudioAttributesImplBaseParcelizer(this).ordinal()];
            if (i2 == 1) {
                return this.write;
            }
            if (i2 == 2) {
                return !this.write;
            }
            throw new RenewEligibleCreator();
        }
        if (!containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            isAbandoned.AudioAttributesCompatParcelizer();
            throw new PlanDetailsCreator();
        }
        int i3 = WhenMappings.AudioAttributesCompatParcelizer[collectLongDefaults.AudioAttributesImplBaseParcelizer(this).ordinal()];
        if (i3 == 1) {
            return !this.write;
        }
        if (i3 != 2) {
            throw new RenewEligibleCreator();
        }
        return this.write;
    }

    private final deliverCancellation.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(deliverCancellation.RemoteActionCompatParcelizer p0, int p1) {
        int iconCompatParcelizer = p0.getIconCompatParcelizer();
        int audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
        if (RemoteActionCompatParcelizer(p1)) {
            audioAttributesCompatParcelizer++;
        } else {
            iconCompatParcelizer--;
        }
        return this.read.write(iconCompatParcelizer, audioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean write(deliverCancellation.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        if (IconCompatParcelizer(i)) {
            return false;
        }
        return RemoteActionCompatParcelizer(i) ? remoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() < this.IconCompatParcelizer.write() - 1 : remoteActionCompatParcelizer.getIconCompatParcelizer() > 0;
    }

    private final boolean IconCompatParcelizer(int i) {
        if (containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.AudioAttributesCompatParcelizer()) || containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.write())) {
            return this.RemoteActionCompatParcelizer == superDispatchKeyEvent.AudioAttributesCompatParcelizer;
        }
        if (containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.IconCompatParcelizer()) || containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            return this.RemoteActionCompatParcelizer == superDispatchKeyEvent.write;
        }
        if (containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.RemoteActionCompatParcelizer()) || containedTypeCount.IconCompatParcelizer.write(i, containedTypeCount.IconCompatParcelizer.INSTANCE.read())) {
            return false;
        }
        isAbandoned.AudioAttributesCompatParcelizer();
        throw new PlanDetailsCreator();
    }

    public final void RemoteActionCompatParcelizer(onAbandon p0, deliverCancellation p1, boolean p2, superDispatchKeyEvent p3) {
        this.IconCompatParcelizer = p0;
        this.read = p1;
        this.write = p2;
        this.RemoteActionCompatParcelizer = p3;
    }
}
