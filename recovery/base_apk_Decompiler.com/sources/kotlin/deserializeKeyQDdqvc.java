package kotlin;

import android.content.Context;
import android.content.Intent;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 d2\u00020\u0001:\u0003bcdBX\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\t0\u0005\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006¢\u0006\u0004\b\f\u0010\rB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006¢\u0006\u0004\b\f\u0010\u000eJ\u0015\u0010*\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0000¢\u0006\u0002\b/J\u0010\u00100\u001a\u00020!H\u0080@¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020!H\u0001¢\u0006\u0002\b4J\u0006\u00105\u001a\u00020!J\"\u00106\u001a\u0002072\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0087@¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020!H\u0002J7\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0<2\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u00062\b\b\u0002\u0010=\u001a\u000207H\u0007¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u00020!2\u0006\u0010@\u001a\u00020\u0018H\u0017J\u0015\u0010A\u001a\u00020!2\u0006\u0010@\u001a\u00020\u0018H\u0000¢\u0006\u0002\bBJ\u0010\u0010C\u001a\u0002072\u0006\u0010@\u001a\u00020\u0018H\u0002J\u0010\u0010D\u001a\u00020!2\u0006\u0010@\u001a\u00020\u0018H\u0017J\u0010\u0010E\u001a\u00020!2\u0006\u0010@\u001a\u00020\u0018H\u0017J\u0010\u0010F\u001a\u0002072\u0006\u0010@\u001a\u00020\u0018H\u0002J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00180HH\u0002J\b\u0010I\u001a\u00020!H\u0016J\b\u0010J\u001a\u00020!H\u0017J\u0016\u0010K\u001a\u00020!2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\bH\u0002J\u001b\u0010N\u001a\u00020!2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0000¢\u0006\u0002\bOJ9\u0010P\u001a\b\u0012\u0004\u0012\u0002HR0Q\"\u0004\b\u0000\u0010R2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b2\u000e\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001HR0TH\u0017¢\u0006\u0002\u0010UJA\u0010P\u001a\b\u0012\u0004\u0012\u0002HR0Q\"\u0004\b\u0000\u0010R2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b2\u0006\u0010V\u001a\u0002072\u000e\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001HR0TH\u0017¢\u0006\u0002\u0010WJG\u0010P\u001a\b\u0012\u0004\u0012\u0002HR0Q\"\u0004\b\u0000\u0010R2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b2\u0006\u0010V\u001a\u0002072\u0014\u0010S\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u0001HR0XH\u0007¢\u0006\u0002\u0010YJ%\u0010Z\u001a\u00020!2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00062\u0006\u0010^\u001a\u00020&H\u0000¢\u0006\u0002\b_J\r\u0010`\u001a\u00020!H\u0000¢\u0006\u0002\baR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000bX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "database", "Landroidx/room/RoomDatabase;", "shadowTablesMap", "", "", "viewTables", "", "Lkotlin/jvm/JvmSuppressWildcards;", "tableNames", "", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "getDatabase$room_runtime_release", "()Landroidx/room/RoomDatabase;", "getTableNames$room_runtime_release", "()[Ljava/lang/String;", "[Ljava/lang/String;", "implementation", "Landroidx/room/TriggerBasedInvalidationTracker;", "observerMap", "", "Landroidx/room/InvalidationTracker$Observer;", "Landroidx/room/ObserverWrapper;", "observerMapLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "autoCloser", "Landroidx/room/support/AutoCloser;", "onRefreshScheduled", "Lkotlin/Function0;", "", "onRefreshCompleted", "invalidationLiveDataContainer", "Landroidx/room/InvalidationLiveDataContainer;", "multiInstanceInvalidationIntent", "Landroid/content/Intent;", "multiInstanceInvalidationClient", "Landroidx/room/MultiInstanceInvalidationClient;", "trackerLock", "setAutoCloser", "setAutoCloser$room_runtime_release", "internalInit", "connection", "Landroidx/sqlite/SQLiteConnection;", "internalInit$room_runtime_release", "sync", "sync$room_runtime_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncBlocking", "syncBlocking$room_runtime_release", "refreshAsync", "refresh", "", "tables", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAutoCloseCallback", "createFlow", "Lkotlinx/coroutines/flow/Flow;", "emitInitialState", "([Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "addObserver", "observer", "addRemoteObserver", "addRemoteObserver$room_runtime_release", "addObserverOnly", "addWeakObserver", "removeObserver", "removeObserverOnly", "getAllObservers", "", "refreshVersionsAsync", "refreshVersionsSync", "notifyInvalidatedObservers", "tableIds", "", "notifyObserversByTableNames", "notifyObserversByTableNames$room_runtime_release", "createLiveData", "Landroidx/lifecycle/LiveData;", "T", "computeFunction", "Ljava/util/concurrent/Callable;", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "inTransaction", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "initMultiInstanceInvalidation", LogCategory.CONTEXT, "Landroid/content/Context;", "name", "serviceIntent", "initMultiInstanceInvalidation$room_runtime_release", "stop", "stop$room_runtime_release", "Observer", "MultiInstanceClientInitState", "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class deserializeKeyQDdqvc {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private final ValueClassSerializerStaticJsonValue AudioAttributesCompatParcelizer;
    private final ReentrantLock AudioAttributesImplApi21Parcelizer;
    private Intent AudioAttributesImplApi26Parcelizer;
    private final Map<write, getDelegatingSerializer> AudioAttributesImplBaseParcelizer;
    private UnsignedNumbersKt MediaBrowserCompatCustomActionResultReceiver;
    private final getCreatedOnDateMs<getShowPopup> MediaBrowserCompatItemReceiver;
    private final Map<String, Set<String>> MediaBrowserCompatMediaItem;
    private final String[] MediaBrowserCompatSearchResultReceiver;
    private final getCreatedOnDateMs<getShowPopup> MediaDescriptionCompat;
    private final Map<String, String> MediaMetadataCompat;
    private final Object RatingCompat;
    private final serialize_TFR7lA RemoteActionCompatParcelizer;
    private setVisibleYRangeMaximum read;
    private final setBorderColor write;

    public deserializeKeyQDdqvc(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        this.AudioAttributesCompatParcelizer = valueClassSerializerStaticJsonValue;
        this.MediaMetadataCompat = map;
        this.MediaBrowserCompatMediaItem = map2;
        this.MediaBrowserCompatSearchResultReceiver = strArr;
        setBorderColor setbordercolor = new setBorderColor(valueClassSerializerStaticJsonValue, map, map2, strArr, valueClassSerializerStaticJsonValue.getRatingCompat(), new read(this));
        this.write = setbordercolor;
        this.AudioAttributesImplBaseParcelizer = new LinkedHashMap();
        this.AudioAttributesImplApi21Parcelizer = new ReentrantLock();
        this.MediaDescriptionCompat = new getCreatedOnDateMs() { // from class: o.UShortKeyDeserializer
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return deserializeKeyQDdqvc.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
            }
        };
        this.MediaBrowserCompatItemReceiver = new getCreatedOnDateMs() { // from class: o.asUByte
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return deserializeKeyQDdqvc.MediaBrowserCompatCustomActionResultReceiver(this.write);
            }
        };
        this.RemoteActionCompatParcelizer = new serialize_TFR7lA(valueClassSerializerStaticJsonValue);
        this.RatingCompat = new Object();
        setbordercolor.write(new getCreatedOnDateMs() { // from class: o.asUInt
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(deserializeKeyQDdqvc.AudioAttributesImplBaseParcelizer(this.write));
            }
        });
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final ValueClassSerializerStaticJsonValue getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String[] getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Set<? extends Integer>, getShowPopup> {
        public final void RemoteActionCompatParcelizer(Set<Integer> set) {
            toMagicModuleMetaRepoModel.write(set, "");
            ((deserializeKeyQDdqvc) this.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer(set);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Set<? extends Integer> set) {
            RemoteActionCompatParcelizer((Set<Integer>) set);
            return getShowPopup.INSTANCE;
        }

        read(Object obj) {
            super(1, obj, deserializeKeyQDdqvc.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(deserializeKeyQDdqvc deserializekeyqddqvc) {
        setVisibleYRangeMaximum setvisibleyrangemaximum = deserializekeyqddqvc.read;
        if (setvisibleyrangemaximum != null) {
            setvisibleyrangemaximum.read();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(deserializeKeyQDdqvc deserializekeyqddqvc) {
        setVisibleYRangeMaximum setvisibleyrangemaximum = deserializekeyqddqvc.read;
        if (setvisibleyrangemaximum != null) {
            setvisibleyrangemaximum.write();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplBaseParcelizer(deserializeKeyQDdqvc deserializekeyqddqvc) {
        return !deserializekeyqddqvc.AudioAttributesCompatParcelizer.onAddQueueItem() || deserializekeyqddqvc.AudioAttributesCompatParcelizer.onCommand();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        public final void IconCompatParcelizer() {
            ((deserializeKeyQDdqvc) this.AudioAttributesImplApi26Parcelizer).MediaBrowserCompatItemReceiver();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(0, obj, deserializeKeyQDdqvc.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        }
    }

    public final void IconCompatParcelizer(setVisibleYRangeMaximum setvisibleyrangemaximum) {
        toMagicModuleMetaRepoModel.write(setvisibleyrangemaximum, "");
        this.read = setvisibleyrangemaximum;
        setvisibleyrangemaximum.IconCompatParcelizer(new AudioAttributesCompatParcelizer(this));
    }

    public final void AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        this.write.AudioAttributesCompatParcelizer(setdrawholeenabled);
        synchronized (this.RatingCompat) {
            UnsignedNumbersKt unsignedNumbersKt = this.MediaBrowserCompatCustomActionResultReceiver;
            if (unsignedNumbersKt != null) {
                Intent intent = this.AudioAttributesImplApi26Parcelizer;
                if (intent == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                unsignedNumbersKt.read(intent);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
    }

    public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) throws Throwable {
        if (this.AudioAttributesCompatParcelizer.onAddQueueItem() && !this.AudioAttributesCompatParcelizer.onCommand()) {
            return getShowPopup.INSTANCE;
        }
        Object objIconCompatParcelizer = this.write.IconCompatParcelizer(sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (deserializeKeyQDdqvc.this.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return deserializeKeyQDdqvc.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        setPinchZoom.RemoteActionCompatParcelizer(new AudioAttributesImplApi21Parcelizer(null));
    }

    public final void RemoteActionCompatParcelizer() {
        this.write.IconCompatParcelizer(this.MediaDescriptionCompat, this.MediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        synchronized (this.RatingCompat) {
            UnsignedNumbersKt unsignedNumbersKt = this.MediaBrowserCompatCustomActionResultReceiver;
            if (unsignedNumbersKt != null) {
                List<write> listAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listAudioAttributesImplBaseParcelizer) {
                    if (!((write) obj).AudioAttributesCompatParcelizer()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    unsignedNumbersKt.IconCompatParcelizer();
                }
            }
            this.write.write();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final NewNumberOtpResendRequest<Set<String>> read(String[] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        Pair<String[], int[]> pairAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(strArr);
        String[] strArrRemoteActionCompatParcelizer = pairAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        NewNumberOtpResendRequest<Set<String>> newNumberOtpResendRequestAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(strArrRemoteActionCompatParcelizer, pairAudioAttributesCompatParcelizer.read(), true);
        UnsignedNumbersKt unsignedNumbersKt = this.MediaBrowserCompatCustomActionResultReceiver;
        NewNumberOtpResendRequest<Set<String>> newNumberOtpResendRequestRemoteActionCompatParcelizer = unsignedNumbersKt != null ? unsignedNumbersKt.RemoteActionCompatParcelizer(strArrRemoteActionCompatParcelizer) : null;
        return newNumberOtpResendRequestRemoteActionCompatParcelizer != null ? VerifyNewNumberRequest.AudioAttributesCompatParcelizer(newNumberOtpResendRequestAudioAttributesCompatParcelizer, newNumberOtpResendRequestRemoteActionCompatParcelizer) : newNumberOtpResendRequestAudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        if (!writeVar.AudioAttributesCompatParcelizer()) {
            throw new IllegalStateException("isRemote was false of observer argument".toString());
        }
        IconCompatParcelizer(writeVar);
    }

    private final boolean IconCompatParcelizer(write writeVar) {
        getDelegatingSerializer getdelegatingserializerPut;
        Pair<String[], int[]> pairAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(writeVar.IconCompatParcelizer());
        String[] strArrRemoteActionCompatParcelizer = pairAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        int[] iArr = pairAudioAttributesCompatParcelizer.read();
        getDelegatingSerializer getdelegatingserializer = new getDelegatingSerializer(writeVar, iArr, strArrRemoteActionCompatParcelizer);
        ReentrantLock reentrantLock = this.AudioAttributesImplApi21Parcelizer;
        reentrantLock.lock();
        try {
            if (this.AudioAttributesImplBaseParcelizer.containsKey(writeVar)) {
                getdelegatingserializerPut = (getDelegatingSerializer) VideoTimelineResponseBody.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, writeVar);
            } else {
                getdelegatingserializerPut = this.AudioAttributesImplBaseParcelizer.put(writeVar, getdelegatingserializer);
            }
            return getdelegatingserializerPut == null && this.write.IconCompatParcelizer(iArr);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void read(write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        if (RemoteActionCompatParcelizer(writeVar)) {
            setPinchZoom.RemoteActionCompatParcelizer(new IconCompatParcelizer(null));
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (deserializeKeyQDdqvc.this.write.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return deserializeKeyQDdqvc.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final boolean RemoteActionCompatParcelizer(write writeVar) {
        ReentrantLock reentrantLock = this.AudioAttributesImplApi21Parcelizer;
        reentrantLock.lock();
        try {
            getDelegatingSerializer getdelegatingserializerRemove = this.AudioAttributesImplBaseParcelizer.remove(writeVar);
            return getdelegatingserializerRemove != null && this.write.write(getdelegatingserializerRemove.IconCompatParcelizer());
        } finally {
            reentrantLock.unlock();
        }
    }

    private final List<write> AudioAttributesImplBaseParcelizer() {
        ReentrantLock reentrantLock = this.AudioAttributesImplApi21Parcelizer;
        reentrantLock.lock();
        try {
            return IntermediateLoginResponseBody.onPlay(this.AudioAttributesImplBaseParcelizer.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        this.write.IconCompatParcelizer(this.MediaDescriptionCompat, this.MediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(Set<Integer> set) {
        ReentrantLock reentrantLock = this.AudioAttributesImplApi21Parcelizer;
        reentrantLock.lock();
        try {
            List listOnPlay = IntermediateLoginResponseBody.onPlay(this.AudioAttributesImplBaseParcelizer.values());
            reentrantLock.unlock();
            Iterator it = listOnPlay.iterator();
            while (it.hasNext()) {
                ((getDelegatingSerializer) it.next()).AudioAttributesCompatParcelizer(set);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void IconCompatParcelizer(Set<String> set) {
        toMagicModuleMetaRepoModel.write(set, "");
        ReentrantLock reentrantLock = this.AudioAttributesImplApi21Parcelizer;
        reentrantLock.lock();
        try {
            List<getDelegatingSerializer> listOnPlay = IntermediateLoginResponseBody.onPlay(this.AudioAttributesImplBaseParcelizer.values());
            reentrantLock.unlock();
            for (getDelegatingSerializer getdelegatingserializer : listOnPlay) {
                if (!getdelegatingserializer.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer()) {
                    getdelegatingserializer.write(set);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void read(Context context, String str, Intent intent) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(intent, "");
        this.AudioAttributesImplApi26Parcelizer = intent;
        this.MediaBrowserCompatCustomActionResultReceiver = new UnsignedNumbersKt(context, str, this);
    }

    public final void IconCompatParcelizer() {
        UnsignedNumbersKt unsignedNumbersKt = this.MediaBrowserCompatCustomActionResultReceiver;
        if (unsignedNumbersKt != null) {
            unsignedNumbersKt.IconCompatParcelizer();
        }
    }

    public static abstract class write {
        private final String[] RemoteActionCompatParcelizer;

        public boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        public abstract void write(Set<String> set);

        public write(String[] strArr) {
            toMagicModuleMetaRepoModel.write(strArr, "");
            this.RemoteActionCompatParcelizer = strArr;
        }

        public final String[] IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/deserializeKeyQDdqvc$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
