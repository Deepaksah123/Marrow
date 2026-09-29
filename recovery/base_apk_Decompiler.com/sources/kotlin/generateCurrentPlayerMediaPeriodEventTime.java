package kotlin;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class generateCurrentPlayerMediaPeriodEventTime implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final Map<Integer, generateCurrentPlayerMediaPeriodEventTime> RemoteActionCompatParcelizer = new HashMap();
    private WeakReference<Activity> AudioAttributesCompatParcelizer;
    private final Set<String> write = new HashSet();
    private final Handler read = new Handler(Looper.getMainLooper());
    private AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);

    static /* synthetic */ void RemoteActionCompatParcelizer(generateCurrentPlayerMediaPeriodEventTime generatecurrentplayermediaperiodeventtime, View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(generateCurrentPlayerMediaPeriodEventTime.class)) {
            return;
        }
        try {
            generatecurrentplayermediaperiodeventtime.read(view);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, generateCurrentPlayerMediaPeriodEventTime.class);
        }
    }

    private generateCurrentPlayerMediaPeriodEventTime(Activity activity) {
        this.AudioAttributesCompatParcelizer = new WeakReference<>(activity);
    }

    static void read(Activity activity) {
        generateCurrentPlayerMediaPeriodEventTime generatecurrentplayermediaperiodeventtime;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(generateCurrentPlayerMediaPeriodEventTime.class)) {
            return;
        }
        try {
            int iHashCode = activity.hashCode();
            Map<Integer, generateCurrentPlayerMediaPeriodEventTime> map = RemoteActionCompatParcelizer;
            if (!map.containsKey(Integer.valueOf(iHashCode))) {
                generatecurrentplayermediaperiodeventtime = new generateCurrentPlayerMediaPeriodEventTime(activity);
                map.put(Integer.valueOf(activity.hashCode()), generatecurrentplayermediaperiodeventtime);
            } else {
                generatecurrentplayermediaperiodeventtime = map.get(Integer.valueOf(iHashCode));
            }
            generatecurrentplayermediaperiodeventtime.RemoteActionCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, generateCurrentPlayerMediaPeriodEventTime.class);
        }
    }

    private void RemoteActionCompatParcelizer() {
        View view;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (this.IconCompatParcelizer.getAndSet(true) || (view = DefaultAnalyticsCollectorExternalSyntheticLambda29.read(this.AudioAttributesCompatParcelizer.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        if (view != null) {
            try {
                RemoteActionCompatParcelizer(view);
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
                return;
            }
        }
        if (view2 != null) {
            RemoteActionCompatParcelizer(view2);
        }
    }

    private void RemoteActionCompatParcelizer(final View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            write(new Runnable() { // from class: o.generateCurrentPlayerMediaPeriodEventTime.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        View view2 = view;
                        if (view2 instanceof EditText) {
                            generateCurrentPlayerMediaPeriodEventTime.RemoteActionCompatParcelizer(generateCurrentPlayerMediaPeriodEventTime.this, view2);
                        }
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void read(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
            if (lowerCase.isEmpty() || this.write.contains(lowerCase) || lowerCase.length() > 100) {
                return;
            }
            this.write.add(lowerCase);
            HashMap map = new HashMap();
            List<String> listAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda0.AudioAttributesCompatParcelizer(view);
            List<String> list = null;
            for (lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector lambdasetplayer1comgoogleandroidexoplayer2analyticsdefaultanalyticscollector : lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.write()) {
                String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(lambdasetplayer1comgoogleandroidexoplayer2analyticsdefaultanalyticscollector.AudioAttributesCompatParcelizer(), lowerCase);
                if (lambdasetplayer1comgoogleandroidexoplayer2analyticsdefaultanalyticscollector.AudioAttributesImplApi21Parcelizer().isEmpty() || DefaultAnalyticsCollectorExternalSyntheticLambda0.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, lambdasetplayer1comgoogleandroidexoplayer2analyticsdefaultanalyticscollector.AudioAttributesImplApi21Parcelizer())) {
                    if (DefaultAnalyticsCollectorExternalSyntheticLambda0.IconCompatParcelizer(listAudioAttributesCompatParcelizer, lambdasetplayer1comgoogleandroidexoplayer2analyticsdefaultanalyticscollector.IconCompatParcelizer())) {
                        IconCompatParcelizer(map, lambdasetplayer1comgoogleandroidexoplayer2analyticsdefaultanalyticscollector.AudioAttributesCompatParcelizer(), strAudioAttributesCompatParcelizer);
                    } else {
                        if (list == null) {
                            list = DefaultAnalyticsCollectorExternalSyntheticLambda0.read(view);
                        }
                        if (DefaultAnalyticsCollectorExternalSyntheticLambda0.IconCompatParcelizer(list, lambdasetplayer1comgoogleandroidexoplayer2analyticsdefaultanalyticscollector.IconCompatParcelizer())) {
                            IconCompatParcelizer(map, lambdasetplayer1comgoogleandroidexoplayer2analyticsdefaultanalyticscollector.AudioAttributesCompatParcelizer(), strAudioAttributesCompatParcelizer);
                        }
                    }
                }
            }
            lambdaonVideoFrameProcessingOffset20.write(map);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private static String AudioAttributesCompatParcelizer(String str, String str2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(generateCurrentPlayerMediaPeriodEventTime.class)) {
            return null;
        }
        try {
            return "r2".equals(str) ? str2.replaceAll("[^\\d.]", "") : str2;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, generateCurrentPlayerMediaPeriodEventTime.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void IconCompatParcelizer(java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = "m"
            java.lang.Class<o.generateCurrentPlayerMediaPeriodEventTime> r2 = kotlin.generateCurrentPlayerMediaPeriodEventTime.class
            boolean r3 = kotlin.getMinWindowSequenceNumber.IconCompatParcelizer(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            int r3 = r9.hashCode()     // Catch: java.lang.Throwable -> L80
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            switch(r3) {
                case 3585: goto L37;
                case 3586: goto L2d;
                case 3587: goto L23;
                case 3588: goto L19;
                default: goto L18;
            }     // Catch: java.lang.Throwable -> L80
        L18:
            goto L41
        L19:
            java.lang.String r3 = "r6"
            boolean r3 = r9.equals(r3)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L41
            r3 = r4
            goto L42
        L23:
            java.lang.String r3 = "r5"
            boolean r3 = r9.equals(r3)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L41
            r3 = r5
            goto L42
        L2d:
            java.lang.String r3 = "r4"
            boolean r3 = r9.equals(r3)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L41
            r3 = r6
            goto L42
        L37:
            java.lang.String r3 = "r3"
            boolean r3 = r9.equals(r3)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L41
            r3 = r7
            goto L42
        L41:
            r3 = -1
        L42:
            if (r3 == 0) goto L61
            if (r3 == r6) goto L58
            if (r3 == r5) goto L58
            if (r3 == r4) goto L4b
            goto L7c
        L4b:
            boolean r1 = r10.contains(r0)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L7c
            java.lang.String[] r10 = r10.split(r0)     // Catch: java.lang.Throwable -> L80
            r10 = r10[r7]     // Catch: java.lang.Throwable -> L80
            goto L7c
        L58:
            java.lang.String r0 = "[^a-z]+"
            java.lang.String r1 = ""
            java.lang.String r10 = r10.replaceAll(r0, r1)     // Catch: java.lang.Throwable -> L80
            goto L7c
        L61:
            boolean r0 = r10.startsWith(r1)     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L7b
            java.lang.String r0 = "b"
            boolean r0 = r10.startsWith(r0)     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L7b
            java.lang.String r0 = "ge"
            boolean r10 = r10.startsWith(r0)     // Catch: java.lang.Throwable -> L80
            if (r10 == 0) goto L78
            goto L7b
        L78:
            java.lang.String r10 = "f"
            goto L7c
        L7b:
            r10 = r1
        L7c:
            r8.put(r9, r10)     // Catch: java.lang.Throwable -> L80
            return
        L80:
            r8 = move-exception
            kotlin.getMinWindowSequenceNumber.read(r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.generateCurrentPlayerMediaPeriodEventTime.IconCompatParcelizer(java.util.Map, java.lang.String, java.lang.String):void");
    }

    private void write(Runnable runnable) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.read.post(runnable);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }
}
