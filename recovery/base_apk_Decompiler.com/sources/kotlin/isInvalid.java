package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.isInvalid;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0002$\u000eB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019JM\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010\u001c*\u00020\u001a2\u0006\u0010\u0003\u001a\u00028\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010\u0011\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010 R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0018\u0010&\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010.R\u0018\u0010(\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010."}, d2 = {"Lo/isInvalid;", "Lo/setStrokeAlpha;", "Landroid/view/View;", "p0", "Lkotlin/Function1;", "Lo/setOnChildScrollUpCallback;", "p1", "Lkotlin/Function0;", "Lo/isAbstract;", "p2", "<init>", "(Landroid/view/View;Lo/getAnswerMap;Lo/getCreatedOnDateMs;)V", "Lo/setFillAlpha;", "", "RemoteActionCompatParcelizer", "(Lo/setFillAlpha;Lo/SampleVideos;)Ljava/lang/Object;", "()V", "AudioAttributesCompatParcelizer", "Lo/isInvalid$RemoteActionCompatParcelizer;", "(Lo/isInvalid$RemoteActionCompatParcelizer;Lo/setFillAlpha;)Lo/setOnChildScrollUpCallback;", "Lo/isAttachedToTransitionOverlay;", "IconCompatParcelizer", "(Lo/setFillAlpha;)Lo/isAttachedToTransitionOverlay;", "Lo/WritableTypeIdInclusion;", "write", "(Lo/setFillAlpha;)Lo/WritableTypeIdInclusion;", "", "T", "S", "(Ljava/lang/Object;Lo/getAnswerMap;Lo/getCreatedOnDateMs;)Ljava/lang/Object;", "MediaBrowserCompatCustomActionResultReceiver", "Landroid/view/View;", "Lo/getAnswerMap;", "Lo/getCreatedOnDateMs;", "Lo/setFirstHorizontalStyle;", "Lo/setFirstHorizontalStyle;", "read", "Lo/g0;", "AudioAttributesImplApi26Parcelizer", "Lo/g0;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "Landroid/view/ActionMode;", "Landroid/view/ActionMode;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isInvalid implements setStrokeAlpha {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<setOnChildScrollUpCallback, setOnChildScrollUpCallback> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private Runnable AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private ActionMode AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final View write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Runnable AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<isAbstract> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setFirstHorizontalStyle read = new setFirstHorizontalStyle();

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final g0 AudioAttributesCompatParcelizer = new g0(new getAnswerMap() { // from class: o.offsetPosition
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return isInvalid.read(this.write, (getCreatedOnDateMs) obj);
        }
    });

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Object, getShowPopup> MediaBrowserCompatItemReceiver = new getAnswerMap() { // from class: o.needsUpdate
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return isInvalid.AudioAttributesCompatParcelizer(this.read, obj);
        }
    };

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getAnswerMap<Object, getShowPopup> MediaBrowserCompatCustomActionResultReceiver = new getAnswerMap() { // from class: o.saveOldPosition
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return isInvalid.read(this.write, obj);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public isInvalid(View view, getAnswerMap<? super setOnChildScrollUpCallback, ? extends setOnChildScrollUpCallback> getanswermap, getCreatedOnDateMs<? extends isAbstract> getcreatedondatems) {
        this.write = view;
        this.IconCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = getcreatedondatems;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(isInvalid isinvalid, final getCreatedOnDateMs getcreatedondatems) {
        Handler handler = isinvalid.write.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            getcreatedondatems.invoke();
        } else {
            Handler handler2 = isinvalid.write.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: o.setIsRecyclable
                    @Override // java.lang.Runnable
                    public final void run() {
                        isInvalid.write(getcreatedondatems);
                    }
                });
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(isInvalid isinvalid, Object obj) {
        ActionMode actionMode = isinvalid.AudioAttributesImplApi21Parcelizer;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(isInvalid isinvalid, Object obj) {
        ActionMode actionMode = isinvalid.AudioAttributesImplApi21Parcelizer;
        if (actionMode != null) {
            InstrumentationActivityInvoker.INSTANCE.RemoteActionCompatParcelizer(actionMode);
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setFillAlpha AudioAttributesCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Handler handler;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    final RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
                    final setOnChildScrollUpCallback setonchildscrollupcallbackRemoteActionCompatParcelizer = isInvalid.this.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
                    Looper looperMyLooper = Looper.myLooper();
                    Handler handler2 = isInvalid.this.write.getHandler();
                    if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnable = isInvalid.this.AudioAttributesImplApi26Parcelizer;
                        if (runnable == null) {
                            final isInvalid isinvalid = isInvalid.this;
                            runnable = new Runnable() { // from class: o.setFlags
                                @Override // java.lang.Runnable
                                public final void run() {
                                    isInvalid.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(isinvalid, setonchildscrollupcallbackRemoteActionCompatParcelizer, remoteActionCompatParcelizer);
                                }
                            };
                            isInvalid.this.AudioAttributesImplApi26Parcelizer = runnable;
                        }
                        isInvalid.this.write.post(runnable);
                    } else {
                        isInvalid isinvalid2 = isInvalid.this;
                        ActionMode actionModeWrite = InstrumentationActivityInvoker.INSTANCE.write(isInvalid.this.write, setonchildscrollupcallbackRemoteActionCompatParcelizer);
                        if (actionModeWrite == null) {
                            return getShowPopup.INSTANCE;
                        }
                        isinvalid2.AudioAttributesImplApi21Parcelizer = actionModeWrite;
                    }
                    this.read = 1;
                    if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                    Runnable runnable2 = isInvalid.this.AudioAttributesImplBaseParcelizer;
                    if (runnable2 == null) {
                        final isInvalid isinvalid3 = isInvalid.this;
                        runnable2 = new Runnable() { // from class: o.shouldBeKeptAsChild
                            @Override // java.lang.Runnable
                            public final void run() {
                                isInvalid.AudioAttributesCompatParcelizer.write(isinvalid3);
                            }
                        };
                        isInvalid.this.AudioAttributesImplBaseParcelizer = runnable2;
                    }
                    isInvalid.this.write.post(runnable2);
                } else {
                    ActionMode actionMode = isInvalid.this.AudioAttributesImplApi21Parcelizer;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                }
                Runnable runnable3 = isInvalid.this.AudioAttributesImplApi26Parcelizer;
                if (runnable3 != null) {
                    isInvalid.this.write.removeCallbacks(runnable3);
                }
                isInvalid.this.AudioAttributesImplApi21Parcelizer = null;
                return getShowPopup.INSTANCE;
            } finally {
                isInvalid.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                Looper looperMyLooper2 = Looper.myLooper();
                handler = isInvalid.this.write.getHandler();
                if (looperMyLooper2 != (handler != null ? handler.getLooper() : null)) {
                    Runnable runnable4 = isInvalid.this.AudioAttributesImplBaseParcelizer;
                    if (runnable4 == null) {
                        final isInvalid isinvalid4 = isInvalid.this;
                        runnable4 = new Runnable() { // from class: o.shouldBeKeptAsChild
                            @Override // java.lang.Runnable
                            public final void run() {
                                isInvalid.AudioAttributesCompatParcelizer.write(isinvalid4);
                            }
                        };
                        isInvalid.this.AudioAttributesImplBaseParcelizer = runnable4;
                    }
                    isInvalid.this.write.post(runnable4);
                } else {
                    ActionMode actionMode2 = isInvalid.this.AudioAttributesImplApi21Parcelizer;
                    if (actionMode2 != null) {
                        actionMode2.finish();
                    }
                }
                Runnable runnable5 = isInvalid.this.AudioAttributesImplApi26Parcelizer;
                if (runnable5 != null) {
                    isInvalid.this.write.removeCallbacks(runnable5);
                }
                isInvalid.this.AudioAttributesImplApi21Parcelizer = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(isInvalid isinvalid, setOnChildScrollUpCallback setonchildscrollupcallback, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            ActionMode actionModeWrite = InstrumentationActivityInvoker.INSTANCE.write(isinvalid.write, setonchildscrollupcallback);
            toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isinvalid.AudioAttributesImplApi21Parcelizer, actionModeWrite);
            if (actionModeWrite == null) {
                remoteActionCompatParcelizer.write();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(isInvalid isinvalid) {
            ActionMode actionMode = isinvalid.AudioAttributesImplApi21Parcelizer;
            if (actionMode != null) {
                actionMode.finish();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(setFillAlpha setfillalpha, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = setfillalpha;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return isInvalid.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.setStrokeAlpha
    public final Object RemoteActionCompatParcelizer(setFillAlpha setfillalpha, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer$default = setFirstHorizontalStyle.IconCompatParcelizer$default(this.read, null, new AudioAttributesCompatParcelizer(setfillalpha, null), sampleVideos, 1, null);
        return objIconCompatParcelizer$default == getYear.IconCompatParcelizer() ? objIconCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.read();
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        ActionMode actionMode = this.AudioAttributesImplApi21Parcelizer;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.AudioAttributesImplApi21Parcelizer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final setOnChildScrollUpCallback RemoteActionCompatParcelizer(RemoteActionCompatParcelizer p0, final setFillAlpha p1) {
        setOnChildScrollUpCallback setonchildscrollupcallbackInvoke;
        read readVar = new read(p0, new getCreatedOnDateMs() { // from class: o.onEnteredHiddenState
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isInvalid.RemoteActionCompatParcelizer(this.read, p1);
            }
        }, new getCreatedOnDateMs() { // from class: o.isUpdated
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isInvalid.IconCompatParcelizer(this.write, p1);
            }
        }, this.write);
        getAnswerMap<setOnChildScrollUpCallback, setOnChildScrollUpCallback> getanswermap = this.IconCompatParcelizer;
        return (getanswermap == null || (setonchildscrollupcallbackInvoke = getanswermap.invoke(readVar)) == null) ? readVar : setonchildscrollupcallbackInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isAttachedToTransitionOverlay RemoteActionCompatParcelizer(isInvalid isinvalid, setFillAlpha setfillalpha) {
        return isinvalid.IconCompatParcelizer(setfillalpha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableTypeIdInclusion IconCompatParcelizer(isInvalid isinvalid, setFillAlpha setfillalpha) {
        return isinvalid.write(setfillalpha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isAttachedToTransitionOverlay AudioAttributesCompatParcelizer(setFillAlpha setfillalpha) {
        return setfillalpha.IconCompatParcelizer();
    }

    private final isAttachedToTransitionOverlay IconCompatParcelizer(final setFillAlpha p0) {
        return (isAttachedToTransitionOverlay) AudioAttributesCompatParcelizer("dataBuilder", this.MediaBrowserCompatItemReceiver, new getCreatedOnDateMs() { // from class: o.isScrap
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isInvalid.AudioAttributesCompatParcelizer(p0);
            }
        });
    }

    private final WritableTypeIdInclusion write(final setFillAlpha p0) {
        return (WritableTypeIdInclusion) AudioAttributesCompatParcelizer("positioner", this.MediaBrowserCompatCustomActionResultReceiver, new getCreatedOnDateMs() { // from class: o.resetInternal
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isInvalid.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, p0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableTypeIdInclusion MediaBrowserCompatItemReceiver(isInvalid isinvalid, setFillAlpha setfillalpha) {
        isAbstract isabstractInvoke = isinvalid.RemoteActionCompatParcelizer.invoke();
        if (!isabstractInvoke.MediaBrowserCompatItemReceiver()) {
            isabstractInvoke = null;
        }
        isAbstract isabstract = isabstractInvoke;
        if (isabstract == null) {
            return WritableTypeIdInclusion.INSTANCE.write();
        }
        return setfillalpha.read(isabstract).RemoteActionCompatParcelizer(hasRawClass.AudioAttributesCompatParcelizer(isabstract));
    }

    private final <T, S> T AudioAttributesCompatParcelizer(S p0, getAnswerMap<? super S, getShowPopup> p1, final getCreatedOnDateMs<? extends T> p2) {
        final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1, new getCreatedOnDateMs() { // from class: o.isTmpDetached
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isInvalid.AudioAttributesCompatParcelizer(writeVar, p2);
            }
        });
        if (writeVar.write != null) {
            return writeVar.write;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return (T) getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public static final getShowPopup AudioAttributesCompatParcelizer(MagicModuleUseCaseImplWhenMappings.write writeVar, getCreatedOnDateMs getcreatedondatems) {
        writeVar.write = getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0019J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001f"}, d2 = {"Lo/isInvalid$read;", "Lo/setOnChildScrollUpCallback;", "Lo/isRecyclable;", "p0", "Lkotlin/Function0;", "Lo/isAttachedToTransitionOverlay;", "p1", "Lo/WritableTypeIdInclusion;", "p2", "Landroid/view/View;", "p3", "<init>", "(Lo/isRecyclable;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Landroid/view/View;)V", "Landroid/view/ActionMode;", "RemoteActionCompatParcelizer", "(Landroid/view/ActionMode;Landroid/view/View;)Lo/WritableTypeIdInclusion;", "Landroid/view/Menu;", "", "AudioAttributesCompatParcelizer", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "read", "Landroid/view/MenuItem;", "write", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "", "(Landroid/view/ActionMode;)V", "(Landroid/view/Menu;)Z", "IconCompatParcelizer", "Lo/isRecyclable;", "Lo/getCreatedOnDateMs;", "Landroid/view/View;", "Lo/isAttachedToTransitionOverlay;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read implements setOnChildScrollUpCallback {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final getCreatedOnDateMs<isAttachedToTransitionOverlay> IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final isRecyclable write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private isAttachedToTransitionOverlay AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final View RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private getCreatedOnDateMs<WritableTypeIdInclusion> read;

        @Override // kotlin.setOnChildScrollUpCallback
        public final boolean write(ActionMode p0, MenuItem p1) {
            return false;
        }

        public read(isRecyclable isrecyclable, getCreatedOnDateMs<isAttachedToTransitionOverlay> getcreatedondatems, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems2, View view) {
            this.write = isrecyclable;
            this.IconCompatParcelizer = getcreatedondatems;
            this.read = getcreatedondatems2;
            this.RemoteActionCompatParcelizer = view;
        }

        @Override // kotlin.setOnChildScrollUpCallback
        public final WritableTypeIdInclusion RemoteActionCompatParcelizer(ActionMode p0, View p1) {
            return this.read.invoke();
        }

        @Override // kotlin.setOnChildScrollUpCallback
        public final boolean AudioAttributesCompatParcelizer(ActionMode p0, Menu p1) {
            write(p1);
            return p1.size() > 0;
        }

        @Override // kotlin.setOnChildScrollUpCallback
        public final boolean read(ActionMode p0, Menu p1) {
            return write(p1);
        }

        @Override // kotlin.setOnChildScrollUpCallback
        public final void RemoteActionCompatParcelizer(ActionMode p0) {
            this.write.write();
        }

        private final boolean write(Menu p0) {
            isAttachedToTransitionOverlay isattachedtotransitionoverlayInvoke = this.IconCompatParcelizer.invoke();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isattachedtotransitionoverlayInvoke, this.AudioAttributesCompatParcelizer)) {
                return false;
            }
            p0.clear();
            List<getPosition> listAudioAttributesCompatParcelizer = isattachedtotransitionoverlayInvoke.AudioAttributesCompatParcelizer();
            int size = listAudioAttributesCompatParcelizer.size();
            int i = 1;
            int i2 = 1;
            for (int i3 = 0; i3 < size; i3++) {
                final getPosition getposition = listAudioAttributesCompatParcelizer.get(i3);
                if (getposition instanceof getUnmodifiedPayloads) {
                    MenuItem menuItemAdd = p0.add(i, i2, i2, ((getUnmodifiedPayloads) getposition).getWrite());
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.onLeftHiddenState
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return isInvalid.read.IconCompatParcelizer(getposition, this, menuItem);
                        }
                    });
                } else if (getposition instanceof isRemoved) {
                    isRemoved isremoved = (isRemoved) getposition;
                    InstrumentationActivityInvokerEmptyFloatingActivity.INSTANCE.AudioAttributesCompatParcelizer(p0, i2, this.RemoteActionCompatParcelizer.getContext(), isremoved.getWrite(), isremoved.getIconCompatParcelizer());
                } else {
                    if (getposition instanceof hasAnyOfTheFlags) {
                        i++;
                    }
                }
                i2++;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean IconCompatParcelizer(getPosition getposition, read readVar, MenuItem menuItem) {
            ((getUnmodifiedPayloads) getposition).IconCompatParcelizer().invoke(readVar.write);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t"}, d2 = {"Lo/isInvalid$RemoteActionCompatParcelizer;", "Lo/isRecyclable;", "<init>", "()V", "", "write", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/fromCursor;", "Lo/fromCursor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements isRecyclable {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final fromCursor<getShowPopup> write = getLastName.read(0, null, 7);

        @Override // kotlin.isRecyclable
        public final void write() {
            this.write.read(getShowPopup.INSTANCE);
        }

        public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = this.write.IconCompatParcelizer(sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }
    }
}
