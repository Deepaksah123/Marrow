package kotlin;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\t\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b\t\u0010\u0010\"\u0004\b\u0007\u0010\u0011R\"\u0010\u000b\u001a\u00020\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0012\u0010\u0015R\u001a\u0010\u0012\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018"}, d2 = {"Lo/handleMissingInstantiator;", "Lo/getDatatypeFeatures;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "write", "()Lo/getAnswerMap;", "read", "(Lo/getAnswerMap;)V", "AudioAttributesCompatParcelizer", "Lo/handleWeirdNativeValue;", "p0", "Lo/handleWeirdNativeValue;", "(Lo/handleWeirdNativeValue;)V", "IconCompatParcelizer", "Z", "()Z", "(Z)V", "Lo/getParser;", "Lo/getParser;", "()Lo/getParser;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleMissingInstantiator implements getDatatypeFeatures {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public getAnswerMap<? super MotionEvent, Boolean> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getParser IconCompatParcelizer = new write();
    private handleWeirdNativeValue write;

    public final void read(getAnswerMap<? super MotionEvent, Boolean> getanswermap) {
        this.AudioAttributesCompatParcelizer = getanswermap;
    }

    public final getAnswerMap<MotionEvent, Boolean> write() {
        getAnswerMap getanswermap = this.AudioAttributesCompatParcelizer;
        if (getanswermap != null) {
            return getanswermap;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void RemoteActionCompatParcelizer(handleWeirdNativeValue handleweirdnativevalue) {
        handleWeirdNativeValue handleweirdnativevalue2 = this.write;
        if (handleweirdnativevalue2 != null) {
            handleweirdnativevalue2.RemoteActionCompatParcelizer(null);
        }
        this.write = handleweirdnativevalue;
        if (handleweirdnativevalue != null) {
            handleweirdnativevalue.RemoteActionCompatParcelizer(this);
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.read = z;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/handleMissingInstantiator$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer {
        private static final /* synthetic */ IconCompatParcelizer[] IconCompatParcelizer;
        private static final /* synthetic */ getMagicModuleSavedMcqCount write;
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer("Unknown", 0);
        public static final IconCompatParcelizer read = new IconCompatParcelizer("Dispatching", 1);
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer("NotDispatching", 2);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArr = read();
            IconCompatParcelizer = iconCompatParcelizerArr;
            write = getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArr);
        }

        private static final /* synthetic */ IconCompatParcelizer[] read() {
            return new IconCompatParcelizer[]{RemoteActionCompatParcelizer, read, AudioAttributesCompatParcelizer};
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) IconCompatParcelizer.clone();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015"}, d2 = {"Lo/handleMissingInstantiator$write;", "Lo/getParser;", "Lo/DeserializationContext;", "p0", "Lo/_shapeForToken;", "p1", "Lo/getKey;", "p2", "", "RemoteActionCompatParcelizer", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "write", "()V", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "(Lo/DeserializationContext;Z)V", "(Lo/DeserializationContext;)V", "Lo/handleMissingInstantiator$IconCompatParcelizer;", "Lo/handleMissingInstantiator$IconCompatParcelizer;", "()Z", "Lo/DeserializationContext;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends getParser {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private IconCompatParcelizer write = IconCompatParcelizer.RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private DeserializationContext read;

        @Override // kotlin.getParser
        public final boolean RemoteActionCompatParcelizer() {
            return true;
        }

        write() {
        }

        @Override // kotlin.getParser
        public final void RemoteActionCompatParcelizer(DeserializationContext p0, _shapeForToken p1, long p2) {
            boolean z;
            boolean z2;
            boolean z3;
            List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            List<getArrayBuilders> list = listAudioAttributesCompatParcelizer;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                getArrayBuilders getarraybuilders = listAudioAttributesCompatParcelizer.get(i);
                if (bufferAsCopyOfValue.read(getarraybuilders) || bufferAsCopyOfValue.AudioAttributesCompatParcelizer(getarraybuilders)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (!z) {
                z2 = false;
                break;
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (listAudioAttributesCompatParcelizer.get(i2).MediaDescriptionCompat()) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (handleMissingInstantiator.this.getRead()) {
                z3 = true;
            } else {
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        getArrayBuilders getarraybuilders2 = listAudioAttributesCompatParcelizer.get(i3);
                        if (bufferAsCopyOfValue.read(getarraybuilders2) || bufferAsCopyOfValue.AudioAttributesCompatParcelizer(getarraybuilders2)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        z3 = false;
                    }
                }
                z3 = true;
            }
            if (this.write != IconCompatParcelizer.AudioAttributesCompatParcelizer) {
                if (p1 == _shapeForToken.IconCompatParcelizer && z3) {
                    this.read = p0;
                    AudioAttributesCompatParcelizer(p0, !z || handleMissingInstantiator.this.getRead());
                }
                if (p1 == _shapeForToken.AudioAttributesCompatParcelizer && z && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.read) && handleMissingInstantiator.this.getRead()) {
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        listAudioAttributesCompatParcelizer.get(i4).RemoteActionCompatParcelizer();
                    }
                }
                if (p1 == _shapeForToken.read && !z3 && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.read)) {
                    AudioAttributesCompatParcelizer(p0, true);
                }
            }
            if (p1 == _shapeForToken.read) {
                int size5 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size5) {
                        if (!bufferAsCopyOfValue.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer.get(i5))) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        IconCompatParcelizer();
                        break;
                    }
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.read) && z) {
                    int size6 = list.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size6) {
                            break;
                        }
                        if (!listAudioAttributesCompatParcelizer.get(i6).MediaDescriptionCompat()) {
                            i6++;
                        } else if (!handleMissingInstantiator.this.getRead()) {
                            IconCompatParcelizer(p0);
                            return;
                        }
                    }
                    int size7 = list.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        listAudioAttributesCompatParcelizer.get(i7).RemoteActionCompatParcelizer();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.handleMissingInstantiator$write$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "p0", "", "read", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<MotionEvent, getShowPopup> {
            final /* synthetic */ handleMissingInstantiator write;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(MotionEvent motionEvent) {
                read(motionEvent);
                return getShowPopup.INSTANCE;
            }

            public final void read(MotionEvent motionEvent) {
                this.write.write().invoke(motionEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(handleMissingInstantiator handlemissinginstantiator) {
                super(1);
                this.write = handlemissinginstantiator;
            }
        }

        @Override // kotlin.getParser
        public final void write() {
            if (this.write == IconCompatParcelizer.read) {
                handlePrimaryContextualization.read(SystemClock.uptimeMillis(), new AnonymousClass2(handleMissingInstantiator.this));
                IconCompatParcelizer();
            }
        }

        private final void IconCompatParcelizer() {
            this.write = IconCompatParcelizer.RemoteActionCompatParcelizer;
            handleMissingInstantiator.this.IconCompatParcelizer(false);
            this.read = null;
        }

        private final void AudioAttributesCompatParcelizer(DeserializationContext p0, boolean p1) {
            List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            List<getArrayBuilders> list = listAudioAttributesCompatParcelizer;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (listAudioAttributesCompatParcelizer.get(i).MediaDescriptionCompat()) {
                    IconCompatParcelizer(p0);
                    return;
                }
            }
            isAbstract write = getWrite();
            if (write != null) {
                handlePrimaryContextualization.RemoteActionCompatParcelizer(p0, write.IconCompatParcelizer(getReferencedType.INSTANCE.write()), new AnonymousClass5(handleMissingInstantiator.this));
                if (this.write == IconCompatParcelizer.read) {
                    if (p1) {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            listAudioAttributesCompatParcelizer.get(i2).RemoteActionCompatParcelizer();
                        }
                    }
                    introspectForBuilder iconCompatParcelizer = p0.getIconCompatParcelizer();
                    if (iconCompatParcelizer != null) {
                        iconCompatParcelizer.IconCompatParcelizer(!handleMissingInstantiator.this.getRead());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }

        /* JADX INFO: renamed from: o.handleMissingInstantiator$write$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "p0", "", "IconCompatParcelizer", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<MotionEvent, getShowPopup> {
            final /* synthetic */ handleMissingInstantiator write;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(MotionEvent motionEvent) {
                IconCompatParcelizer(motionEvent);
                return getShowPopup.INSTANCE;
            }

            public final void IconCompatParcelizer(MotionEvent motionEvent) {
                IconCompatParcelizer iconCompatParcelizer;
                if (motionEvent.getActionMasked() == 0) {
                    write writeVar = write.this;
                    if (this.write.write().invoke(motionEvent).booleanValue()) {
                        iconCompatParcelizer = IconCompatParcelizer.read;
                    } else {
                        iconCompatParcelizer = IconCompatParcelizer.AudioAttributesCompatParcelizer;
                    }
                    writeVar.write = iconCompatParcelizer;
                    return;
                }
                this.write.write().invoke(motionEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(handleMissingInstantiator handlemissinginstantiator) {
                super(1);
                this.write = handlemissinginstantiator;
            }
        }

        private final void IconCompatParcelizer(DeserializationContext p0) {
            if (this.write == IconCompatParcelizer.read) {
                isAbstract write = getWrite();
                if (write != null) {
                    handlePrimaryContextualization.read(p0, write.IconCompatParcelizer(getReferencedType.INSTANCE.write()), new AnonymousClass3(handleMissingInstantiator.this));
                } else {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
            }
            this.write = IconCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: o.handleMissingInstantiator$write$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<MotionEvent, getShowPopup> {
            final /* synthetic */ handleMissingInstantiator IconCompatParcelizer;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(MotionEvent motionEvent) {
                RemoteActionCompatParcelizer(motionEvent);
                return getShowPopup.INSTANCE;
            }

            public final void RemoteActionCompatParcelizer(MotionEvent motionEvent) {
                this.IconCompatParcelizer.write().invoke(motionEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(handleMissingInstantiator handlemissinginstantiator) {
                super(1);
                this.IconCompatParcelizer = handlemissinginstantiator;
            }
        }
    }

    @Override // kotlin.getDatatypeFeatures
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final getParser getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
