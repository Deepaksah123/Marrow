package kotlin;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda11;
import kotlin.onBandwidthSample;

/* JADX INFO: loaded from: classes2.dex */
class DefaultAnalyticsCollectorExternalSyntheticLambda12 {
    private static DefaultAnalyticsCollectorExternalSyntheticLambda12 AudioAttributesCompatParcelizer = null;
    private static final String IconCompatParcelizer = "com.facebook.appevents.codeless.CodelessMatcher";
    private final Handler MediaBrowserCompatCustomActionResultReceiver = new Handler(Looper.getMainLooper());
    private Set<Activity> read = Collections.newSetFromMap(new WeakHashMap());
    private Set<RemoteActionCompatParcelizer> AudioAttributesImplApi21Parcelizer = new HashSet();
    private HashSet<String> RemoteActionCompatParcelizer = new HashSet<>();
    private HashMap<Integer, HashSet<String>> write = new HashMap<>();

    static /* synthetic */ void IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda12 defaultAnalyticsCollectorExternalSyntheticLambda12) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda12.class)) {
            return;
        }
        try {
            defaultAnalyticsCollectorExternalSyntheticLambda12.IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda12.class);
        }
    }

    static /* synthetic */ String RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda12.class)) {
            return null;
        }
        try {
            return IconCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda12.class);
            return null;
        }
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda12() {
    }

    public static DefaultAnalyticsCollectorExternalSyntheticLambda12 read() {
        synchronized (DefaultAnalyticsCollectorExternalSyntheticLambda12.class) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda12.class)) {
                return null;
            }
            try {
                if (AudioAttributesCompatParcelizer == null) {
                    AudioAttributesCompatParcelizer = new DefaultAnalyticsCollectorExternalSyntheticLambda12();
                }
                return AudioAttributesCompatParcelizer;
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda12.class);
                return null;
            }
        }
    }

    public final void write(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda66.RemoteActionCompatParcelizer();
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new lambdaonMetadata50("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.read.add(activity);
            this.RemoteActionCompatParcelizer.clear();
            if (this.write.containsKey(Integer.valueOf(activity.hashCode()))) {
                this.RemoteActionCompatParcelizer = this.write.get(Integer.valueOf(activity.hashCode()));
            }
            AudioAttributesCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    public final void read(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda66.RemoteActionCompatParcelizer();
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new lambdaonMetadata50("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.read.remove(activity);
            this.AudioAttributesImplApi21Parcelizer.clear();
            this.write.put(Integer.valueOf(activity.hashCode()), (HashSet) this.RemoteActionCompatParcelizer.clone());
            this.RemoteActionCompatParcelizer.clear();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    public final void IconCompatParcelizer(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            this.write.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    public static Bundle read(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, View view2) {
        List<DefaultAnalyticsCollectorExternalSyntheticLambda18> listWrite;
        List<read> listRemoteActionCompatParcelizer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda12.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            if (defaultAnalyticsCollectorExternalSyntheticLambda15 != null && (listWrite = defaultAnalyticsCollectorExternalSyntheticLambda15.write()) != null) {
                for (DefaultAnalyticsCollectorExternalSyntheticLambda18 defaultAnalyticsCollectorExternalSyntheticLambda18 : listWrite) {
                    if (defaultAnalyticsCollectorExternalSyntheticLambda18.AudioAttributesCompatParcelizer != null && defaultAnalyticsCollectorExternalSyntheticLambda18.AudioAttributesCompatParcelizer.length() > 0) {
                        bundle.putString(defaultAnalyticsCollectorExternalSyntheticLambda18.write, defaultAnalyticsCollectorExternalSyntheticLambda18.AudioAttributesCompatParcelizer);
                    } else if (defaultAnalyticsCollectorExternalSyntheticLambda18.IconCompatParcelizer.size() > 0) {
                        if (defaultAnalyticsCollectorExternalSyntheticLambda18.read.equals("relative")) {
                            listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view2, defaultAnalyticsCollectorExternalSyntheticLambda18.IconCompatParcelizer, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view, defaultAnalyticsCollectorExternalSyntheticLambda18.IconCompatParcelizer, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<read> it = listRemoteActionCompatParcelizer.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                read next = it.next();
                                if (next.read() != null) {
                                    String strMediaBrowserCompatItemReceiver = DefaultAnalyticsCollectorExternalSyntheticLambda17.MediaBrowserCompatItemReceiver(next.read());
                                    if (strMediaBrowserCompatItemReceiver.length() > 0) {
                                        bundle.putString(defaultAnalyticsCollectorExternalSyntheticLambda18.write, strMediaBrowserCompatItemReceiver);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda12.class);
            return null;
        }
    }

    private void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                IconCompatParcelizer();
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver.post(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda12.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            DefaultAnalyticsCollectorExternalSyntheticLambda12.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda12.this);
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            for (Activity activity : this.read) {
                if (activity != null) {
                    this.AudioAttributesImplApi21Parcelizer.add(new RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda29.read(activity), this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    public static class read {
        private String RemoteActionCompatParcelizer;
        private WeakReference<View> write;

        public read(View view, String str) {
            this.write = new WeakReference<>(view);
            this.RemoteActionCompatParcelizer = str;
        }

        public final View read() {
            WeakReference<View> weakReference = this.write;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    protected static class RemoteActionCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        private WeakReference<View> AudioAttributesCompatParcelizer;
        private final Handler IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private List<DefaultAnalyticsCollectorExternalSyntheticLambda15> read;
        private HashSet<String> write;

        public RemoteActionCompatParcelizer(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.AudioAttributesCompatParcelizer = new WeakReference<>(view);
            this.IconCompatParcelizer = handler;
            this.write = hashSet;
            this.RemoteActionCompatParcelizer = str;
            handler.postDelayed(this, 200L);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.write());
                if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer == null || !defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getRead()) {
                    return;
                }
                this.read = DefaultAnalyticsCollectorExternalSyntheticLambda15.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
                View view = this.AudioAttributesCompatParcelizer.get();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    write();
                }
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            write();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            write();
        }

        private void write() {
            if (this.read == null || this.AudioAttributesCompatParcelizer.get() == null) {
                return;
            }
            for (int i = 0; i < this.read.size(); i++) {
                read(this.read.get(i), this.AudioAttributesCompatParcelizer.get());
            }
        }

        private void read(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view) {
            if (defaultAnalyticsCollectorExternalSyntheticLambda15 == null || view == null) {
                return;
            }
            if (TextUtils.isEmpty(defaultAnalyticsCollectorExternalSyntheticLambda15.RemoteActionCompatParcelizer()) || defaultAnalyticsCollectorExternalSyntheticLambda15.RemoteActionCompatParcelizer().equals(this.RemoteActionCompatParcelizer)) {
                List<DefaultAnalyticsCollectorExternalSyntheticLambda14> listAudioAttributesCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda15.AudioAttributesCompatParcelizer();
                if (listAudioAttributesCompatParcelizer.size() <= 25) {
                    Iterator<read> it = RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view, listAudioAttributesCompatParcelizer, 0, -1, this.RemoteActionCompatParcelizer).iterator();
                    while (it.hasNext()) {
                        write(it.next(), view, defaultAnalyticsCollectorExternalSyntheticLambda15);
                    }
                }
            }
        }

        public static List<read> RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, List<DefaultAnalyticsCollectorExternalSyntheticLambda14> list, int i, int i2, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(String.valueOf(i2));
            String string = sb.toString();
            ArrayList arrayList = new ArrayList();
            if (view != null) {
                if (i >= list.size()) {
                    arrayList.add(new read(view, string));
                } else {
                    DefaultAnalyticsCollectorExternalSyntheticLambda14 defaultAnalyticsCollectorExternalSyntheticLambda14 = list.get(i);
                    if (defaultAnalyticsCollectorExternalSyntheticLambda14.AudioAttributesCompatParcelizer.equals("..")) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            List<View> list2 = read((ViewGroup) parent);
                            int size = list2.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                arrayList.addAll(RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, list2.get(i3), list, i + 1, i3, string));
                            }
                        }
                    } else {
                        if (defaultAnalyticsCollectorExternalSyntheticLambda14.AudioAttributesCompatParcelizer.equals(".")) {
                            arrayList.add(new read(view, string));
                            return arrayList;
                        }
                        if (read(view, defaultAnalyticsCollectorExternalSyntheticLambda14, i2)) {
                            if (i == list.size() - 1) {
                                arrayList.add(new read(view, string));
                            }
                        }
                    }
                }
                if (view instanceof ViewGroup) {
                    List<View> list3 = read((ViewGroup) view);
                    int size2 = list3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList.addAll(RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, list3.get(i4), list, i + 1, i4, string));
                    }
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean read(android.view.View r5, kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda14 r6, int r7) {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DefaultAnalyticsCollectorExternalSyntheticLambda12.RemoteActionCompatParcelizer.read(android.view.View, o.DefaultAnalyticsCollectorExternalSyntheticLambda14, int):boolean");
        }

        private static List<View> read(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        private void write(read readVar, View view, DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15) {
            if (defaultAnalyticsCollectorExternalSyntheticLambda15 != null) {
                try {
                    View view2 = readVar.read();
                    if (view2 != null) {
                        View viewWrite = DefaultAnalyticsCollectorExternalSyntheticLambda17.write(view2);
                        if (viewWrite != null && DefaultAnalyticsCollectorExternalSyntheticLambda17.AudioAttributesCompatParcelizer(view2, viewWrite)) {
                            AudioAttributesCompatParcelizer(readVar, view, defaultAnalyticsCollectorExternalSyntheticLambda15);
                            return;
                        }
                        if (view2.getClass().getName().startsWith("com.facebook.react")) {
                            return;
                        }
                        if (!(view2 instanceof AdapterView)) {
                            RemoteActionCompatParcelizer(readVar, view, defaultAnalyticsCollectorExternalSyntheticLambda15);
                        } else if (view2 instanceof ListView) {
                            IconCompatParcelizer(readVar, view, defaultAnalyticsCollectorExternalSyntheticLambda15);
                        }
                    }
                } catch (Exception e) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda12.RemoteActionCompatParcelizer(), e);
                }
            }
        }

        private void RemoteActionCompatParcelizer(read readVar, View view, DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15) {
            View view2 = readVar.read();
            if (view2 != null) {
                String strRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer();
                View.OnClickListener onClickListener = DefaultAnalyticsCollectorExternalSyntheticLambda17.read(view2);
                boolean z = (onClickListener instanceof onBandwidthSample.AudioAttributesCompatParcelizer) && ((onBandwidthSample.AudioAttributesCompatParcelizer) onClickListener).IconCompatParcelizer();
                if (this.write.contains(strRemoteActionCompatParcelizer) || z) {
                    return;
                }
                view2.setOnClickListener(onBandwidthSample.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view, view2));
                this.write.add(strRemoteActionCompatParcelizer);
            }
        }

        private void IconCompatParcelizer(read readVar, View view, DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15) {
            AdapterView adapterView = (AdapterView) readVar.read();
            if (adapterView != null) {
                String strRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                boolean z = (onItemClickListener instanceof onBandwidthSample.IconCompatParcelizer) && ((onBandwidthSample.IconCompatParcelizer) onItemClickListener).AudioAttributesCompatParcelizer();
                if (this.write.contains(strRemoteActionCompatParcelizer) || z) {
                    return;
                }
                adapterView.setOnItemClickListener(onBandwidthSample.RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view, adapterView));
                this.write.add(strRemoteActionCompatParcelizer);
            }
        }

        private void AudioAttributesCompatParcelizer(read readVar, View view, DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15) {
            View view2 = readVar.read();
            if (view2 != null) {
                String strRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer();
                View.OnTouchListener onTouchListenerAudioAttributesImplApi21Parcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda17.AudioAttributesImplApi21Parcelizer(view2);
                boolean z = (onTouchListenerAudioAttributesImplApi21Parcelizer instanceof DefaultAnalyticsCollectorExternalSyntheticLambda11.read) && ((DefaultAnalyticsCollectorExternalSyntheticLambda11.read) onTouchListenerAudioAttributesImplApi21Parcelizer).IconCompatParcelizer();
                if (this.write.contains(strRemoteActionCompatParcelizer) || z) {
                    return;
                }
                view2.setOnTouchListener(DefaultAnalyticsCollectorExternalSyntheticLambda11.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view, view2));
                this.write.add(strRemoteActionCompatParcelizer);
            }
        }
    }
}
