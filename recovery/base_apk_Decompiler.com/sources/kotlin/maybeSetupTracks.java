package kotlin;

import android.app.Application;
import android.content.Context;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class maybeSetupTracks implements isSeekPending, RtspMediaPeriodInternalListenerExternalSyntheticLambda0 {
    private volatile boolean IconCompatParcelizer;
    private final CopyOnWriteArrayList<RtspMediaPeriodListener> RemoteActionCompatParcelizer = new CopyOnWriteArrayList<>();
    private volatile List<? extends updateLoadingFinished> write = updateLoadingFinished.read();
    private volatile String AudioAttributesCompatParcelizer = "";
    private final Object read = new Object();
    private final List<getCreatedOnDateMs<getShowPopup>> MediaBrowserCompatItemReceiver = new ArrayList();

    public final void read() {
        List listOnPlay;
        synchronized (this.read) {
            this.IconCompatParcelizer = true;
            listOnPlay = IntermediateLoginResponseBody.onPlay(this.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatItemReceiver.clear();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        Iterator it = listOnPlay.iterator();
        while (it.hasNext()) {
            ((getCreatedOnDateMs) it.next()).invoke();
        }
    }

    private final void RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        if (this.IconCompatParcelizer) {
            getcreatedondatems.invoke();
            return;
        }
        synchronized (this.read) {
            if (!this.IconCompatParcelizer) {
                this.MediaBrowserCompatItemReceiver.add(getcreatedondatems);
            } else {
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                getcreatedondatems.invoke();
            }
        }
    }

    @Override // kotlin.RtspMediaPeriodInternalListenerExternalSyntheticLambda0
    public final void read(List<? extends updateLoadingFinished> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = list;
    }

    @Override // kotlin.RtspMediaPeriodInternalListenerExternalSyntheticLambda0
    public final void write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // kotlin.RtspMediaPeriodInternalListenerExternalSyntheticLambda0
    public final void AudioAttributesCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.RemoteActionCompatParcelizer.add(new RtspMediaPeriodRtpLoadInfo(context));
    }

    @Override // kotlin.RtspMediaPeriodInternalListenerExternalSyntheticLambda0
    public final void write(lambdaonVideoDisabled18 lambdaonvideodisabled18) {
        toMagicModuleMetaRepoModel.write(lambdaonvideodisabled18, "");
        this.RemoteActionCompatParcelizer.add(new onSeekingUnsupported(lambdaonvideodisabled18));
    }

    @Override // kotlin.RtspMediaPeriodInternalListenerExternalSyntheticLambda0
    public final void IconCompatParcelizer(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        this.RemoteActionCompatParcelizer.add(new getTrackUri(application, false));
    }

    @Override // kotlin.RtspMediaPeriodInternalListenerExternalSyntheticLambda0
    public final void IconCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.RemoteActionCompatParcelizer.add(new RtspMediaPeriodRtspLoaderWrapper(context));
    }

    @Override // kotlin.isSeekPending
    public final void write(final String str, final Map<String, ? extends Object> map, final List<? extends updateLoadingFinished> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(list, "");
        RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.lambdaendTracks0
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return maybeSetupTracks.read(map, this, list, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Map map, maybeSetupTracks maybesetuptracks, List list, String str) {
        Map<String, ? extends Object> mapIconCompatParcelizer = VideoTimelineResponseBody.IconCompatParcelizer(map);
        mapIconCompatParcelizer.put("platform", LogSubCategory.LifeCycle.ANDROID);
        mapIconCompatParcelizer.put("app_device_id", maybesetuptracks.AudioAttributesCompatParcelizer);
        CopyOnWriteArrayList<RtspMediaPeriodListener> copyOnWriteArrayList = maybesetuptracks.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            RtspMediaPeriodListener rtspMediaPeriodListener = (RtspMediaPeriodListener) obj;
            if (!list.isEmpty() ? list.contains(rtspMediaPeriodListener.getIconCompatParcelizer()) : maybesetuptracks.write.contains(rtspMediaPeriodListener.getIconCompatParcelizer())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((RtspMediaPeriodListener) it.next()).AudioAttributesCompatParcelizer(str, mapIconCompatParcelizer);
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isSeekPending
    public final void write(Pair<String, ? extends Map<String, ? extends Object>> pair, List<? extends updateLoadingFinished> list) {
        toMagicModuleMetaRepoModel.write(pair, "");
        toMagicModuleMetaRepoModel.write(list, "");
        write(pair.write(), pair.IconCompatParcelizer(), list);
    }

    @Override // kotlin.isSeekPending
    public final void read(final String str, final Map<String, ? extends Object> map, final Map<updateLoadingFinished, ? extends List<String>> map2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.RtspMediaPeriod1
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return maybeSetupTracks.read(this.read, str, map, map2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(maybeSetupTracks maybesetuptracks, String str, Map map, Map map2) {
        maybesetuptracks.RemoteActionCompatParcelizer(str);
        Iterator<T> it = maybesetuptracks.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((RtspMediaPeriodListener) it.next()).write(map, map2);
        }
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(String str) {
        Iterator<T> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((RtspMediaPeriodListener) it.next()).IconCompatParcelizer(str);
        }
    }

    @Override // kotlin.isSeekPending
    public final void RemoteActionCompatParcelizer(final String str, final String str2, final List<? extends updateLoadingFinished> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.lambdaonUpstreamFormatChanged1
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return maybeSetupTracks.IconCompatParcelizer(this.write, list, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(maybeSetupTracks maybesetuptracks, List list, String str, String str2) {
        CopyOnWriteArrayList<RtspMediaPeriodListener> copyOnWriteArrayList = maybesetuptracks.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (list.contains(((RtspMediaPeriodListener) obj).getIconCompatParcelizer())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((RtspMediaPeriodListener) it.next()).AudioAttributesCompatParcelizer(str, str2);
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isSeekPending
    public final void AudioAttributesCompatParcelizer(final Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.RtspMediaPeriodInternalListener
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return maybeSetupTracks.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(maybeSetupTracks maybesetuptracks, Map map) {
        Iterator<T> it = maybesetuptracks.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((RtspMediaPeriodListener) it.next()).IconCompatParcelizer((Map<String, ? extends Object>) map);
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isSeekPending
    public final void RemoteActionCompatParcelizer() {
        RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.RtspMediaPeriodInternalListenerExternalSyntheticLambda1
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return maybeSetupTracks.read(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(maybeSetupTracks maybesetuptracks) {
        Iterator<T> it = maybesetuptracks.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((RtspMediaPeriodListener) it.next()).IconCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }
}
