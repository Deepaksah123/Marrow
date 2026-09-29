package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u000f\u001a\u00020\u0004\"\b\b\u0000\u0010\u0014*\u00020\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000f\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\u001a\u0010\u0007J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\fJ\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\fJ\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\fJ-\u0010\u000f\u001a\u00020\u001c\"\b\b\u0000\u0010\u0014*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u001dR&\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR(\u0010\u001a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R,\u0010\u0018\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0018\u0010\u000b\u001a\u00060\u0001j\u0002`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010-\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103"}, d2 = {"Lo/g0;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "", "write", "()Z", "MediaBrowserCompatItemReceiver", "()V", "", "(Ljava/util/Set;)V", "IconCompatParcelizer", "()Ljava/util/Set;", "", "AudioAttributesImplApi21Parcelizer", "()Ljava/lang/Void;", "T", "p1", "p2", "(Ljava/lang/Object;Lo/getAnswerMap;Lo/getCreatedOnDateMs;)V", "read", "(Ljava/lang/Object;)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/g0$RemoteActionCompatParcelizer;", "(Lo/getAnswerMap;)Lo/g0$RemoteActionCompatParcelizer;", "Lo/getAnswerMap;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/read;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/util/concurrent/atomic/AtomicReference;", "MediaBrowserCompatMediaItem", "Z", "Lkotlin/Function2;", "Lo/parseDigitsRecursive;", "Lo/MagicModuleSubmissionRequestBody;", "MediaBrowserCompatSearchResultReceiver", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "AudioAttributesImplBaseParcelizer", "Lo/SynchronizedObject;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/Object;", "Lo/parseDigitsIterative;", "Lo/parseDigitsIterative;", "Lo/g0$RemoteActionCompatParcelizer;", "", "J", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0 {
    public static final int AudioAttributesCompatParcelizer = 8;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getAnswerMap<getCreatedOnDateMs<getShowPopup>, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private parseDigitsIterative AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final AtomicReference<Object> RemoteActionCompatParcelizer = new AtomicReference<>(null);
    private final MagicModuleSubmissionRequestBody<Set<? extends Object>, parseDigitsRecursive, getShowPopup> read = new MagicModuleSubmissionRequestBody() { // from class: o.checkUTF32
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return g0.read(this.AudioAttributesCompatParcelizer, (Set) obj, (parseDigitsRecursive) obj2);
        }
    };

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getAnswerMap<Object, getShowPopup> write = new getAnswerMap() { // from class: o.ByteSourceJsonBootstrapper
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return g0.AudioAttributesCompatParcelizer(this.read, obj);
        }
    };

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final UTF32Reader<RemoteActionCompatParcelizer> AudioAttributesImplBaseParcelizer = new UTF32Reader<>(new RemoteActionCompatParcelizer[16], 0);

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Object MediaBrowserCompatItemReceiver = new Object();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private long MediaDescriptionCompat = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(getAnswerMap<? super getCreatedOnDateMs<getShowPopup>, getShowPopup> getanswermap) {
        this.IconCompatParcelizer = getanswermap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(g0 g0Var, Set set, parseDigitsRecursive parsedigitsrecursive) {
        g0Var.write(set);
        if (g0Var.write()) {
            g0Var.MediaBrowserCompatItemReceiver();
        }
        return getShowPopup.INSTANCE;
    }

    private final boolean write() {
        boolean z;
        synchronized (this.MediaBrowserCompatItemReceiver) {
            z = this.AudioAttributesCompatParcelizer;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setIconCompatParcelizer = IconCompatParcelizer();
            if (setIconCompatParcelizer == null) {
                return z2;
            }
            synchronized (this.MediaBrowserCompatItemReceiver) {
                UTF32Reader<RemoteActionCompatParcelizer> uTF32Reader = this.AudioAttributesImplBaseParcelizer;
                RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
                int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
                for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                    z2 = remoteActionCompatParcelizerArr[i].AudioAttributesCompatParcelizer(setIconCompatParcelizer) || z2;
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        this.IconCompatParcelizer.invoke(new getCreatedOnDateMs() { // from class: o.g1
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return g0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(g0 g0Var) {
        do {
            synchronized (g0Var.MediaBrowserCompatItemReceiver) {
                if (!g0Var.AudioAttributesCompatParcelizer) {
                    g0Var.AudioAttributesCompatParcelizer = true;
                    try {
                        UTF32Reader<RemoteActionCompatParcelizer> uTF32Reader = g0Var.AudioAttributesImplBaseParcelizer;
                        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
                        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
                        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                            remoteActionCompatParcelizerArr[i].IconCompatParcelizer();
                        }
                        g0Var.AudioAttributesCompatParcelizer = false;
                    } finally {
                    }
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        } while (g0Var.write());
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void write(Set<? extends Object> p0) {
        Object obj;
        List listAudioAttributesCompatParcelizer;
        do {
            obj = this.RemoteActionCompatParcelizer.get();
            if (obj == null) {
                listAudioAttributesCompatParcelizer = p0;
            } else if (obj instanceof Set) {
                listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Set[]{obj, p0});
            } else {
                if (!(obj instanceof List)) {
                    AudioAttributesImplApi21Parcelizer();
                    throw new PlanDetailsCreator();
                }
                listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) obj, (Iterable) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(p0));
            }
        } while (!setBackInvokedCallbackEnabled.read(this.RemoteActionCompatParcelizer, obj, listAudioAttributesCompatParcelizer));
    }

    private final Set<Object> IconCompatParcelizer() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.RemoteActionCompatParcelizer.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            } else {
                AudioAttributesImplApi21Parcelizer();
                throw new PlanDetailsCreator();
            }
        } while (!setBackInvokedCallbackEnabled.read(this.RemoteActionCompatParcelizer, obj, objSubList));
        return set;
    }

    private final Void AudioAttributesImplApi21Parcelizer() {
        _validJsonValueList.RemoteActionCompatParcelizer("Unexpected notification");
        throw new PlanDetailsCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(g0 g0Var, Object obj) {
        if (!g0Var.MediaBrowserCompatCustomActionResultReceiver) {
            synchronized (g0Var.MediaBrowserCompatItemReceiver) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = g0Var.AudioAttributesImplApi21Parcelizer;
                toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer);
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [o.UTF32Reader] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [o.UTF32Reader] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> void IconCompatParcelizer(T r21, kotlin.getAnswerMap<? super T, kotlin.getShowPopup> r22, kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r23) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.g0.IconCompatParcelizer(java.lang.Object, o.getAnswerMap, o.getCreatedOnDateMs):void");
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer = parseDigitsRecursive.INSTANCE.RemoteActionCompatParcelizer(this.read);
    }

    public final void read() {
        parseDigitsIterative parsedigitsiterative = this.AudioAttributesImplApi26Parcelizer;
        if (parsedigitsiterative != null) {
            parsedigitsiterative.read();
        }
    }

    private final <T> RemoteActionCompatParcelizer IconCompatParcelizer(getAnswerMap<? super T, getShowPopup> p0) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        UTF32Reader<RemoteActionCompatParcelizer> uTF32Reader = this.AudioAttributesImplBaseParcelizer;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        int i = 0;
        while (true) {
            if (i >= audioAttributesCompatParcelizer) {
                remoteActionCompatParcelizer = null;
                break;
            }
            remoteActionCompatParcelizer = remoteActionCompatParcelizerArr[i];
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer() == p0) {
                break;
            }
            i++;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer2 != null) {
            return remoteActionCompatParcelizer2;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = new RemoteActionCompatParcelizer((getAnswerMap) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(p0, 1));
        this.AudioAttributesImplBaseParcelizer.read(remoteActionCompatParcelizer3);
        return remoteActionCompatParcelizer3;
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0001J.\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002J7\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00012\u0014\b\b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0086\bJ\u0010\u0010/\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0001H\u0002J\u000e\u00100\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0001J)\u00101\u001a\u00020\u00042!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001d0\u0003J\u0006\u00105\u001a\u00020\u001dJ\u0018\u00106\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0002J\u0006\u00107\u001a\u00020\u0004J\u0014\u00108\u001a\u00020\u001d2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010:J\u0012\u0010;\u001a\u00020\u00042\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\u0017J\u0006\u0010=\u001a\u00020\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R6\u0010$\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010%j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0001`&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "currentScope", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "currentToken", "", "valueToScopes", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/collection/MutableScatterMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "invalidated", "Landroidx/collection/MutableScatterSet;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedState;", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "readingDerivedStates", "", "getReadingDerivedStates", "()Z", "setReadingDerivedStates", "(Z)V", "deriveStateScopeCount", "dependencyToDerivedStates", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordRead", AppMeasurementSdk.ConditionalUserProperty.VALUE, "recordedValues", "observe", "scope", "readObserver", "block", "Lkotlin/Function0;", "clearObsoleteStateReads", "clearScopeObservations", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", "name", "hasScopeObservations", "removeObservation", "clear", "recordInvalidation", "changes", "", "rereadDerivedState", "derivedState", "notifyInvalidatedScopes", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer {
        public boolean AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private final getAnswerMap<Object, getShowPopup> AudioAttributesImplBaseParcelizer;
        private AlertDialogLayout<Object> RemoteActionCompatParcelizer;
        private Object read;
        private int write = -1;
        private final setKeyListener<Object, Object> MediaBrowserCompatMediaItem = getAndClear.IconCompatParcelizer((setKeyListener) null, 1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        private final setKeyListener<Object, AlertDialogLayout<Object>> RatingCompat = new setKeyListener<>(0, 1, null);
        private final setEmojiCompatEnabled<Object> AudioAttributesImplApi21Parcelizer = new setEmojiCompatEnabled<>(0, 1, null);
        private final UTF32Reader<reportInvalidNumber<?>> MediaMetadataCompat = new UTF32Reader<>(new reportInvalidNumber[16], 0);
        private final reportOverflowInt MediaBrowserCompatCustomActionResultReceiver = new write();
        private final setKeyListener<Object, Object> IconCompatParcelizer = getAndClear.IconCompatParcelizer((setKeyListener) null, 1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        private final HashMap<reportInvalidNumber<?>, Object> MediaBrowserCompatItemReceiver = new HashMap<>();

        public RemoteActionCompatParcelizer(getAnswerMap<Object, getShowPopup> getanswermap) {
            this.AudioAttributesImplBaseParcelizer = getanswermap;
        }

        public final getAnswerMap<Object, getShowPopup> RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/g0$RemoteActionCompatParcelizer$write;", "Lo/reportOverflowInt;", "Lo/reportInvalidNumber;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/reportInvalidNumber;)V", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write implements reportOverflowInt {
            write() {
            }

            @Override // kotlin.reportOverflowInt
            public final void RemoteActionCompatParcelizer(reportInvalidNumber<?> p0) {
                RemoteActionCompatParcelizer.this.AudioAttributesImplApi26Parcelizer++;
            }

            @Override // kotlin.reportOverflowInt
            public final void read(reportInvalidNumber<?> p0) {
                RemoteActionCompatParcelizer.this.AudioAttributesImplApi26Parcelizer--;
            }
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final reportOverflowInt getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final void RemoteActionCompatParcelizer(Object obj) {
            Object obj2 = this.read;
            toMagicModuleMetaRepoModel.write(obj2);
            int i = this.write;
            AlertDialogLayout<Object> alertDialogLayout = this.RemoteActionCompatParcelizer;
            if (alertDialogLayout == null) {
                alertDialogLayout = new AlertDialogLayout<>(0, 1, null);
                this.RemoteActionCompatParcelizer = alertDialogLayout;
                this.RatingCompat.RemoteActionCompatParcelizer(obj2, alertDialogLayout);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            write(obj, i, obj2, alertDialogLayout);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void write(java.lang.Object r21, int r22, java.lang.Object r23, kotlin.AlertDialogLayout<java.lang.Object> r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                int r3 = r0.AudioAttributesImplApi26Parcelizer
                if (r3 > 0) goto Lae
                r3 = -1
                r4 = r24
                int r4 = r4.RemoteActionCompatParcelizer(r1, r2, r3)
                boolean r5 = r1 instanceof kotlin.reportInvalidNumber
                r6 = 2
                if (r5 == 0) goto L94
                if (r4 == r2) goto L94
                r2 = r1
                o.reportInvalidNumber r2 = (kotlin.reportInvalidNumber) r2
                o.reportInvalidNumber$IconCompatParcelizer r2 = r2.AudioAttributesCompatParcelizer()
                java.util.HashMap<o.reportInvalidNumber<?>, java.lang.Object> r5 = r0.MediaBrowserCompatItemReceiver
                java.util.Map r5 = (java.util.Map) r5
                java.lang.Object r7 = r2.IconCompatParcelizer()
                r5.put(r1, r7)
                o.setSupportBackgroundTintMode r2 = r2.write()
                o.setKeyListener<java.lang.Object, java.lang.Object> r5 = r0.IconCompatParcelizer
                kotlin.getAndClear.RemoteActionCompatParcelizer(r5, r1)
                java.lang.Object[] r7 = r2.AudioAttributesCompatParcelizer
                long[] r2 = r2.RemoteActionCompatParcelizer
                int r8 = r2.length
                int r8 = r8 - r6
                if (r8 < 0) goto L94
                r10 = 0
            L3c:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L8c
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L56:
                if (r15 >= r13) goto L89
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.3E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L82
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r9 = r16
                o.tryMatch r9 = (kotlin.tryMatch) r9
                boolean r3 = r9 instanceof kotlin.constructParser
                if (r3 == 0) goto L7c
                r3 = r9
                o.constructParser r3 = (kotlin.constructParser) r3
                o.DoubleToDecimal$read r17 = kotlin.DoubleToDecimal.INSTANCE
                int r14 = kotlin.DoubleToDecimal.AudioAttributesCompatParcelizer(r6)
                r3.RemoteActionCompatParcelizer(r14)
            L7c:
                kotlin.getAndClear.IconCompatParcelizer(r5, r9, r1)
                r3 = 8
                goto L83
            L82:
                r3 = r14
            L83:
                long r11 = r11 >> r3
                int r15 = r15 + 1
                r14 = r3
                r3 = -1
                goto L56
            L89:
                r3 = r14
                if (r13 != r3) goto L92
            L8c:
                if (r10 == r8) goto L92
                int r10 = r10 + 1
                r3 = -1
                goto L3c
            L92:
                r2 = -1
                goto L95
            L94:
                r2 = r3
            L95:
                if (r4 != r2) goto Lae
                boolean r2 = r1 instanceof kotlin.constructParser
                if (r2 == 0) goto La7
                r2 = r1
                o.constructParser r2 = (kotlin.constructParser) r2
                o.DoubleToDecimal$read r3 = kotlin.DoubleToDecimal.INSTANCE
                int r3 = kotlin.DoubleToDecimal.AudioAttributesCompatParcelizer(r6)
                r2.RemoteActionCompatParcelizer(r3)
            La7:
                o.setKeyListener<java.lang.Object, java.lang.Object> r0 = r0.MediaBrowserCompatMediaItem
                r2 = r23
                kotlin.getAndClear.IconCompatParcelizer(r0, r1, r2)
            Lae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.g0.RemoteActionCompatParcelizer.write(java.lang.Object, int, java.lang.Object, o.AlertDialogLayout):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void write(Object obj) {
            int i = this.write;
            AlertDialogLayout<Object> alertDialogLayout = this.RemoteActionCompatParcelizer;
            if (alertDialogLayout == null) {
                return;
            }
            long[] jArr = alertDialogLayout.RemoteActionCompatParcelizer;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = alertDialogLayout.AudioAttributesCompatParcelizer[i5];
                            boolean z = alertDialogLayout.AudioAttributesImplBaseParcelizer[i5] != i;
                            if (z) {
                                AudioAttributesCompatParcelizer(obj, obj2);
                            }
                            if (z) {
                                alertDialogLayout.read(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final void read(Object obj) {
            AlertDialogLayout<Object> alertDialogLayoutIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(obj);
            if (alertDialogLayoutIconCompatParcelizer == null) {
                return;
            }
            AlertDialogLayout<Object> alertDialogLayout = alertDialogLayoutIconCompatParcelizer;
            Object[] objArr = alertDialogLayout.AudioAttributesCompatParcelizer;
            int[] iArr = alertDialogLayout.AudioAttributesImplBaseParcelizer;
            long[] jArr = alertDialogLayout.RemoteActionCompatParcelizer;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            AudioAttributesCompatParcelizer(obj, obj2);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public final void AudioAttributesCompatParcelizer(getAnswerMap<Object, Boolean> getanswermap) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            long j;
            int i3;
            long j2;
            setKeyListener<Object, AlertDialogLayout<Object>> setkeylistener = this.RatingCompat;
            long[] jArr3 = setkeylistener.RemoteActionCompatParcelizer;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j3 = jArr3[i4];
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j3 & 255) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = setkeylistener.IconCompatParcelizer[i8];
                            AlertDialogLayout alertDialogLayout = (AlertDialogLayout) setkeylistener.MediaBrowserCompatItemReceiver[i8];
                            Boolean boolInvoke = getanswermap.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                AlertDialogLayout alertDialogLayout2 = alertDialogLayout;
                                Object[] objArr = alertDialogLayout2.AudioAttributesCompatParcelizer;
                                int[] iArr = alertDialogLayout2.AudioAttributesImplBaseParcelizer;
                                long[] jArr4 = alertDialogLayout2.RemoteActionCompatParcelizer;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i3 = i6;
                                    int i9 = 0;
                                    while (true) {
                                        long j5 = jArr4[i9];
                                        i2 = i4;
                                        j = j3;
                                        j2 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((j5 & 255) < 128) {
                                                    int i12 = (i9 << 3) + i11;
                                                    Object obj2 = objArr[i12];
                                                    int i13 = iArr[i12];
                                                    AudioAttributesCompatParcelizer(obj, obj2);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i10 != 8) {
                                                break;
                                            }
                                        }
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        i4 = i2;
                                        j3 = j;
                                    }
                                } else {
                                    i2 = i4;
                                    j = j3;
                                    i3 = i6;
                                    j2 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i4;
                                j = j3;
                                i3 = i6;
                                j2 = j4;
                            }
                            if (boolInvoke.booleanValue()) {
                                setkeylistener.AudioAttributesCompatParcelizer(i8);
                            }
                        } else {
                            jArr2 = jArr3;
                            i2 = i4;
                            j = j3;
                            i3 = i6;
                            j2 = j4;
                        }
                        i7++;
                        j3 = j >> 8;
                        i5 = 8;
                        j4 = j2;
                        jArr3 = jArr2;
                        i6 = i3;
                        i4 = i2;
                    }
                    jArr = jArr3;
                    int i14 = i4;
                    if (i6 != i5) {
                        return;
                    } else {
                        i = i14;
                    }
                } else {
                    jArr = jArr3;
                    i = i4;
                }
                if (i == length) {
                    return;
                }
                i4 = i + 1;
                jArr3 = jArr;
            }
        }

        public final boolean read() {
            return this.RatingCompat.MediaBrowserCompatItemReceiver();
        }

        private final void AudioAttributesCompatParcelizer(Object obj, Object obj2) {
            getAndClear.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, obj2, obj);
            if (!(obj2 instanceof reportInvalidNumber) || getAndClear.read(this.MediaBrowserCompatMediaItem, obj2)) {
                return;
            }
            getAndClear.RemoteActionCompatParcelizer(this.IconCompatParcelizer, obj2);
            this.MediaBrowserCompatItemReceiver.remove(obj2);
        }

        public final void AudioAttributesCompatParcelizer() {
            getAndClear.write(this.MediaBrowserCompatMediaItem);
            this.RatingCompat.AudioAttributesCompatParcelizer();
            getAndClear.write(this.IconCompatParcelizer);
            this.MediaBrowserCompatItemReceiver.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x028c A[PHI: r18
          0x028c: PHI (r18v42 boolean) = (r18v41 boolean), (r18v43 boolean) binds: [B:91:0x025d, B:100:0x028a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0324 A[EDGE_INSN: B:130:0x0324->B:296:0x0341 BREAK  A[LOOP:6: B:120:0x02e6->B:131:0x0326], PHI: r18
          0x0324: PHI (r18v36 boolean) = (r18v35 boolean), (r18v37 boolean) binds: [B:121:0x02f4, B:129:0x0322] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x03cd  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x04d6  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x05e9 A[EDGE_INSN: B:338:0x05e9->B:235:0x05e9 BREAK  A[LOOP:18: B:221:0x05a1->B:233:0x05e1], PHI: r18
          0x05e9: PHI (r18v5 boolean) = (r18v1 boolean), (r18v1 boolean), (r18v8 boolean) binds: [B:215:0x058d, B:219:0x059e, B:338:0x05e9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0624  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x069c  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x06ca A[LOOP:10: B:281:0x06c8->B:282:0x06ca, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4, types: [int] */
        /* JADX WARN: Type inference failed for: r10v52 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [int] */
        /* JADX WARN: Type inference failed for: r9v67 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean AudioAttributesCompatParcelizer(java.util.Set<? extends java.lang.Object> r42) {
            /*
                Method dump skipped, instruction units count: 1754
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.g0.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(java.util.Set):boolean");
        }

        public final void read(reportInvalidNumber<?> reportinvalidnumber) {
            long[] jArr;
            long[] jArr2;
            int i;
            AlertDialogLayout<Object> alertDialogLayout;
            setKeyListener<Object, AlertDialogLayout<Object>> setkeylistener = this.RatingCompat;
            int iHashCode = Long.hashCode(toChars3.MediaBrowserCompatSearchResultReceiver().getIconCompatParcelizer());
            Object objAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer(reportinvalidnumber);
            if (objAudioAttributesImplApi26Parcelizer == null) {
                return;
            }
            if (!(objAudioAttributesImplApi26Parcelizer instanceof setEmojiCompatEnabled)) {
                AlertDialogLayout<Object> alertDialogLayoutAudioAttributesImplApi26Parcelizer = setkeylistener.AudioAttributesImplApi26Parcelizer(objAudioAttributesImplApi26Parcelizer);
                if (alertDialogLayoutAudioAttributesImplApi26Parcelizer == null) {
                    alertDialogLayoutAudioAttributesImplApi26Parcelizer = new AlertDialogLayout<>(0, 1, null);
                    setkeylistener.RemoteActionCompatParcelizer(objAudioAttributesImplApi26Parcelizer, alertDialogLayoutAudioAttributesImplApi26Parcelizer);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                write(reportinvalidnumber, iHashCode, objAudioAttributesImplApi26Parcelizer, alertDialogLayoutAudioAttributesImplApi26Parcelizer);
                return;
            }
            setEmojiCompatEnabled setemojicompatenabled = (setEmojiCompatEnabled) objAudioAttributesImplApi26Parcelizer;
            Object[] objArr = setemojicompatenabled.write;
            long[] jArr3 = setemojicompatenabled.AudioAttributesCompatParcelizer;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            Object obj = objArr[(i2 << 3) + i5];
                            AlertDialogLayout<Object> alertDialogLayoutAudioAttributesImplApi26Parcelizer2 = setkeylistener.AudioAttributesImplApi26Parcelizer(obj);
                            jArr2 = jArr3;
                            if (alertDialogLayoutAudioAttributesImplApi26Parcelizer2 == null) {
                                alertDialogLayout = new AlertDialogLayout<>(0, 1, null);
                                setkeylistener.RemoteActionCompatParcelizer(obj, alertDialogLayout);
                                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                            } else {
                                alertDialogLayout = alertDialogLayoutAudioAttributesImplApi26Parcelizer2;
                            }
                            write(reportinvalidnumber, iHashCode, obj, alertDialogLayout);
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void IconCompatParcelizer() {
            /*
                r15 = this;
                o.setEmojiCompatEnabled<java.lang.Object> r0 = r15.AudioAttributesImplApi21Parcelizer
                r1 = r0
                o.setButtonDrawable r1 = (kotlin.setButtonDrawable) r1
                o.getAnswerMap<java.lang.Object, o.getShowPopup> r15 = r15.AudioAttributesImplBaseParcelizer
                java.lang.Object[] r2 = r1.write
                long[] r1 = r1.AudioAttributesCompatParcelizer
                int r3 = r1.length
                int r3 = r3 + (-2)
                if (r3 < 0) goto L4a
                r4 = 0
                r5 = r4
            L12:
                r6 = r1[r5]
                long r8 = ~r6
                r10 = 7
                long r8 = r8 << r10
                long r8 = r8 & r6
                r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r8 = r8 & r10
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L45
                int r8 = r5 - r3
                int r8 = ~r8
                int r8 = r8 >>> 31
                r9 = 8
                int r8 = 8 - r8
                r10 = r4
            L2c:
                if (r10 >= r8) goto L43
                r11 = 255(0xff, double:1.26E-321)
                long r11 = r11 & r6
                r13 = 128(0x80, double:6.3E-322)
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 >= 0) goto L3f
                int r11 = r5 << 3
                int r11 = r11 + r10
                r11 = r2[r11]
                r15.invoke(r11)
            L3f:
                long r6 = r6 >> r9
                int r10 = r10 + 1
                goto L2c
            L43:
                if (r8 != r9) goto L4a
            L45:
                if (r5 == r3) goto L4a
                int r5 = r5 + 1
                goto L12
            L4a:
                r0.RemoteActionCompatParcelizer()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.g0.RemoteActionCompatParcelizer.IconCompatParcelizer():void");
        }
    }

    public final void read(Object p0) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            UTF32Reader<RemoteActionCompatParcelizer> uTF32Reader = this.AudioAttributesImplBaseParcelizer;
            int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
            int i = 0;
            for (int i2 = 0; i2 < audioAttributesCompatParcelizer; i2++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = uTF32Reader.IconCompatParcelizer[i2];
                remoteActionCompatParcelizer.read(p0);
                if (!remoteActionCompatParcelizer.read()) {
                    i++;
                } else if (i > 0) {
                    uTF32Reader.IconCompatParcelizer[i2 - i] = uTF32Reader.IconCompatParcelizer[i2];
                }
            }
            int i3 = audioAttributesCompatParcelizer - i;
            getOrderDetails.AudioAttributesCompatParcelizer(uTF32Reader.IconCompatParcelizer, (Object) null, i3, audioAttributesCompatParcelizer);
            uTF32Reader.AudioAttributesCompatParcelizer(i3);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void RemoteActionCompatParcelizer(getAnswerMap<Object, Boolean> p0) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            UTF32Reader<RemoteActionCompatParcelizer> uTF32Reader = this.AudioAttributesImplBaseParcelizer;
            int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
            int i = 0;
            for (int i2 = 0; i2 < audioAttributesCompatParcelizer; i2++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = uTF32Reader.IconCompatParcelizer[i2];
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
                if (!remoteActionCompatParcelizer.read()) {
                    i++;
                } else if (i > 0) {
                    uTF32Reader.IconCompatParcelizer[i2 - i] = uTF32Reader.IconCompatParcelizer[i2];
                }
            }
            int i3 = audioAttributesCompatParcelizer - i;
            getOrderDetails.AudioAttributesCompatParcelizer(uTF32Reader.IconCompatParcelizer, (Object) null, i3, audioAttributesCompatParcelizer);
            uTF32Reader.AudioAttributesCompatParcelizer(i3);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            UTF32Reader<RemoteActionCompatParcelizer> uTF32Reader = this.AudioAttributesImplBaseParcelizer;
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
            int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                remoteActionCompatParcelizerArr[i].AudioAttributesCompatParcelizer();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
