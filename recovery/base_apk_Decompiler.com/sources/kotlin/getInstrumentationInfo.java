package kotlin;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getInstrumentationInfo extends RecyclerView.IconCompatParcelizer<getInstalledPackages> implements getInstallerPackageName {
    boolean AudioAttributesCompatParcelizer;
    private IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private final setPresenter<Integer> AudioAttributesImplBaseParcelizer;
    final anyIgnorals IconCompatParcelizer;
    private final setPresenter<Fragment.SavedState> MediaBrowserCompatItemReceiver;
    final FragmentManager RemoteActionCompatParcelizer;
    final setPresenter<Fragment> read;
    write write;

    public abstract Fragment IconCompatParcelizer(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return read(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public /* synthetic */ boolean onFailedToRecycleView(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        return true;
    }

    public getInstrumentationInfo(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    private getInstrumentationInfo(FragmentManager fragmentManager, anyIgnorals anyignorals) {
        this.read = new setPresenter<>();
        this.MediaBrowserCompatItemReceiver = new setPresenter<>();
        this.AudioAttributesImplBaseParcelizer = new setPresenter<>();
        this.write = new write();
        this.AudioAttributesCompatParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.RemoteActionCompatParcelizer = fragmentManager;
        this.IconCompatParcelizer = anyignorals;
        super.setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        StringCollectionDeserializer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer == null);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer;
        iconCompatParcelizer.RemoteActionCompatParcelizer(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.AudioAttributesImplApi21Parcelizer.read(recyclerView);
        this.AudioAttributesImplApi21Parcelizer = null;
    }

    private static getInstalledPackages read(ViewGroup viewGroup) {
        return getInstalledPackages.read(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(getInstalledPackages getinstalledpackages, int i) {
        long itemId = getinstalledpackages.getItemId();
        int id = getinstalledpackages.RemoteActionCompatParcelizer().getId();
        Long lAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(id);
        if (lAudioAttributesCompatParcelizer != null && lAudioAttributesCompatParcelizer.longValue() != itemId) {
            write(lAudioAttributesCompatParcelizer.longValue());
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(lAudioAttributesCompatParcelizer.longValue());
        }
        this.AudioAttributesImplBaseParcelizer.write(itemId, Integer.valueOf(id));
        write(i);
        if (InvalidTypeIdException.onPlayFromSearch(getinstalledpackages.RemoteActionCompatParcelizer())) {
            write(getinstalledpackages);
        }
        IconCompatParcelizer();
    }

    final void IconCompatParcelizer() {
        if (!this.AudioAttributesImplApi26Parcelizer || write()) {
            return;
        }
        setCustomView setcustomview = new setCustomView();
        for (int i = 0; i < this.read.write(); i++) {
            long jAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(i);
            if (!read(jAudioAttributesCompatParcelizer)) {
                setcustomview.add(Long.valueOf(jAudioAttributesCompatParcelizer));
                this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer);
            }
        }
        if (!this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer = false;
            for (int i2 = 0; i2 < this.read.write(); i2++) {
                long jAudioAttributesCompatParcelizer2 = this.read.AudioAttributesCompatParcelizer(i2);
                if (!RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer2)) {
                    setcustomview.add(Long.valueOf(jAudioAttributesCompatParcelizer2));
                }
            }
        }
        Iterator<E> it = setcustomview.iterator();
        while (it.hasNext()) {
            write(((Long) it.next()).longValue());
        }
    }

    private boolean RemoteActionCompatParcelizer(long j) {
        View view;
        if (this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(j)) {
            return true;
        }
        Fragment fragmentIconCompatParcelizer = this.read.IconCompatParcelizer(j);
        return (fragmentIconCompatParcelizer == null || (view = fragmentIconCompatParcelizer.getView()) == null || view.getParent() == null) ? false : true;
    }

    private Long AudioAttributesCompatParcelizer(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.AudioAttributesImplBaseParcelizer.write(); i2++) {
            if (this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(i2));
            }
        }
        return lValueOf;
    }

    private void write(int i) {
        long itemId = getItemId(i);
        if (this.read.AudioAttributesCompatParcelizer(itemId)) {
            return;
        }
        Fragment fragmentIconCompatParcelizer = IconCompatParcelizer(i);
        fragmentIconCompatParcelizer.setInitialSavedState(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(itemId));
        this.read.write(itemId, fragmentIconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(getInstalledPackages getinstalledpackages) {
        write(getinstalledpackages);
        IconCompatParcelizer();
    }

    final void write(final getInstalledPackages getinstalledpackages) {
        Fragment fragmentIconCompatParcelizer = this.read.IconCompatParcelizer(getinstalledpackages.getItemId());
        if (fragmentIconCompatParcelizer == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutRemoteActionCompatParcelizer = getinstalledpackages.RemoteActionCompatParcelizer();
        View view = fragmentIconCompatParcelizer.getView();
        if (!fragmentIconCompatParcelizer.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentIconCompatParcelizer.isAdded() && view == null) {
            read(fragmentIconCompatParcelizer, frameLayoutRemoteActionCompatParcelizer);
            return;
        }
        if (fragmentIconCompatParcelizer.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutRemoteActionCompatParcelizer) {
                read(view, frameLayoutRemoteActionCompatParcelizer);
                return;
            }
            return;
        }
        if (fragmentIconCompatParcelizer.isAdded()) {
            read(view, frameLayoutRemoteActionCompatParcelizer);
            return;
        }
        if (!write()) {
            read(fragmentIconCompatParcelizer, frameLayoutRemoteActionCompatParcelizer);
            List<read.RemoteActionCompatParcelizer> listIconCompatParcelizer = this.write.IconCompatParcelizer();
            try {
                fragmentIconCompatParcelizer.setMenuVisibility(false);
                _doAddInjectable _doaddinjectableIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                StringBuilder sb = new StringBuilder("f");
                sb.append(getinstalledpackages.getItemId());
                _doaddinjectableIconCompatParcelizer.IconCompatParcelizer(fragmentIconCompatParcelizer, sb.toString()).RemoteActionCompatParcelizer(fragmentIconCompatParcelizer, anyIgnorals.write.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(false);
                return;
            } finally {
                write.write(listIconCompatParcelizer);
            }
        }
        if (this.RemoteActionCompatParcelizer.onPrepare()) {
            return;
        }
        this.IconCompatParcelizer.IconCompatParcelizer(new findAccess() { // from class: o.getInstrumentationInfo.5
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                if (getInstrumentationInfo.this.write()) {
                    return;
                }
                hasgetter.getLifecycle().AudioAttributesCompatParcelizer(this);
                if (InvalidTypeIdException.onPlayFromSearch(getinstalledpackages.RemoteActionCompatParcelizer())) {
                    getInstrumentationInfo.this.write(getinstalledpackages);
                }
            }
        });
    }

    private void read(final Fragment fragment, final FrameLayout frameLayout) {
        this.RemoteActionCompatParcelizer.write(new FragmentManager.IconCompatParcelizer() { // from class: o.getInstrumentationInfo.3
            @Override // androidx.fragment.app.FragmentManager.IconCompatParcelizer
            public final void write(FragmentManager fragmentManager, Fragment fragment2, View view) {
                if (fragment2 == fragment) {
                    fragmentManager.IconCompatParcelizer(this);
                    getInstrumentationInfo.read(view, frameLayout);
                }
            }
        }, false);
    }

    static void read(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(getInstalledPackages getinstalledpackages) {
        Long lAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getinstalledpackages.RemoteActionCompatParcelizer().getId());
        if (lAudioAttributesCompatParcelizer != null) {
            write(lAudioAttributesCompatParcelizer.longValue());
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(lAudioAttributesCompatParcelizer.longValue());
        }
    }

    private void write(long j) {
        ViewParent parent;
        Fragment fragmentIconCompatParcelizer = this.read.IconCompatParcelizer(j);
        if (fragmentIconCompatParcelizer == null) {
            return;
        }
        if (fragmentIconCompatParcelizer.getView() != null && (parent = fragmentIconCompatParcelizer.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!read(j)) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(j);
        }
        if (!fragmentIconCompatParcelizer.isAdded()) {
            this.read.RemoteActionCompatParcelizer(j);
            return;
        }
        if (write()) {
            this.AudioAttributesImplApi26Parcelizer = true;
            return;
        }
        if (fragmentIconCompatParcelizer.isAdded() && read(j)) {
            List<read.RemoteActionCompatParcelizer> listAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
            Fragment.SavedState savedStateMediaMetadataCompat = this.RemoteActionCompatParcelizer.MediaMetadataCompat(fragmentIconCompatParcelizer);
            write.write(listAudioAttributesCompatParcelizer);
            this.MediaBrowserCompatItemReceiver.write(j, savedStateMediaMetadataCompat);
        }
        List<read.RemoteActionCompatParcelizer> listWrite = this.write.write();
        try {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer().read(fragmentIconCompatParcelizer).RemoteActionCompatParcelizer();
            this.read.RemoteActionCompatParcelizer(j);
        } finally {
            write.write(listWrite);
        }
    }

    final boolean write() {
        return this.RemoteActionCompatParcelizer.onPrepareFromSearch();
    }

    private boolean read(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @Override // kotlin.getInstallerPackageName
    public final Parcelable RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle(this.read.write() + this.MediaBrowserCompatItemReceiver.write());
        for (int i = 0; i < this.read.write(); i++) {
            long jAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(i);
            Fragment fragmentIconCompatParcelizer = this.read.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            if (fragmentIconCompatParcelizer != null && fragmentIconCompatParcelizer.isAdded()) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(bundle, AudioAttributesCompatParcelizer("f#", jAudioAttributesCompatParcelizer), fragmentIconCompatParcelizer);
            }
        }
        for (int i2 = 0; i2 < this.MediaBrowserCompatItemReceiver.write(); i2++) {
            long jAudioAttributesCompatParcelizer2 = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(i2);
            if (read(jAudioAttributesCompatParcelizer2)) {
                bundle.putParcelable(AudioAttributesCompatParcelizer("s#", jAudioAttributesCompatParcelizer2), this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(jAudioAttributesCompatParcelizer2));
            }
        }
        return bundle;
    }

    @Override // kotlin.getInstallerPackageName
    public final void AudioAttributesCompatParcelizer(Parcelable parcelable) {
        if (!this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer() || !this.read.AudioAttributesCompatParcelizer()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (IconCompatParcelizer(str, "f#")) {
                this.read.write(AudioAttributesCompatParcelizer(str, "f#"), this.RemoteActionCompatParcelizer.IconCompatParcelizer(bundle, str));
            } else if (IconCompatParcelizer(str, "s#")) {
                long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (read(jAudioAttributesCompatParcelizer)) {
                    this.MediaBrowserCompatItemReceiver.write(jAudioAttributesCompatParcelizer, savedState);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(String.valueOf(str)));
            }
        }
        if (this.read.AudioAttributesCompatParcelizer()) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = true;
        this.AudioAttributesCompatParcelizer = true;
        IconCompatParcelizer();
        AudioAttributesCompatParcelizer();
    }

    private void AudioAttributesCompatParcelizer() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: o.getInstrumentationInfo.2
            @Override // java.lang.Runnable
            public final void run() {
                getInstrumentationInfo.this.AudioAttributesCompatParcelizer = false;
                getInstrumentationInfo.this.IconCompatParcelizer();
            }
        };
        this.IconCompatParcelizer.IconCompatParcelizer(new findAccess() { // from class: o.getInstrumentationInfo.4
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                if (readVar == anyIgnorals.read.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    hasgetter.getLifecycle().AudioAttributesCompatParcelizer(this);
                }
            }
        });
        handler.postDelayed(runnable, 10000L);
    }

    private static String AudioAttributesCompatParcelizer(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    private static boolean IconCompatParcelizer(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private static long AudioAttributesCompatParcelizer(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    class IconCompatParcelizer {
        private findAccess AudioAttributesCompatParcelizer;
        private ViewPager2 AudioAttributesImplApi21Parcelizer;
        private RecyclerView.read IconCompatParcelizer;
        private long RemoteActionCompatParcelizer = -1;
        private ViewPager2.write read;

        IconCompatParcelizer() {
        }

        final void RemoteActionCompatParcelizer(RecyclerView recyclerView) {
            this.AudioAttributesImplApi21Parcelizer = write(recyclerView);
            ViewPager2.write writeVar = new ViewPager2.write() { // from class: o.getInstrumentationInfo.IconCompatParcelizer.3
                @Override // androidx.viewpager2.widget.ViewPager2.write
                public final void AudioAttributesCompatParcelizer(int i) {
                    IconCompatParcelizer.this.RemoteActionCompatParcelizer(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.write
                public final void RemoteActionCompatParcelizer(int i) {
                    IconCompatParcelizer.this.RemoteActionCompatParcelizer(false);
                }
            };
            this.read = writeVar;
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(writeVar);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer() { // from class: o.getInstrumentationInfo.IconCompatParcelizer.5
                @Override // androidx.recyclerview.widget.RecyclerView.read
                public final void read() {
                    IconCompatParcelizer.this.RemoteActionCompatParcelizer(true);
                }
            };
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            getInstrumentationInfo.this.registerAdapterDataObserver(remoteActionCompatParcelizer);
            this.AudioAttributesCompatParcelizer = new findAccess() { // from class: o.getInstrumentationInfo.IconCompatParcelizer.1
                @Override // kotlin.findAccess
                public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                    IconCompatParcelizer.this.RemoteActionCompatParcelizer(false);
                }
            };
            getInstrumentationInfo.this.IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }

        final void read(RecyclerView recyclerView) {
            write(recyclerView).write(this.read);
            getInstrumentationInfo.this.unregisterAdapterDataObserver(this.IconCompatParcelizer);
            getInstrumentationInfo.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            this.AudioAttributesImplApi21Parcelizer = null;
        }

        final void RemoteActionCompatParcelizer(boolean z) {
            int i;
            Fragment fragmentIconCompatParcelizer;
            if (getInstrumentationInfo.this.write() || this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer() != 0 || getInstrumentationInfo.this.read.AudioAttributesCompatParcelizer() || getInstrumentationInfo.this.getItemCount() == 0 || (i = this.AudioAttributesImplApi21Parcelizer.read()) >= getInstrumentationInfo.this.getItemCount()) {
                return;
            }
            long itemId = getInstrumentationInfo.this.getItemId(i);
            if ((itemId != this.RemoteActionCompatParcelizer || z) && (fragmentIconCompatParcelizer = getInstrumentationInfo.this.read.IconCompatParcelizer(itemId)) != null && fragmentIconCompatParcelizer.isAdded()) {
                this.RemoteActionCompatParcelizer = itemId;
                _doAddInjectable _doaddinjectableIconCompatParcelizer = getInstrumentationInfo.this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                ArrayList<List> arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i2 = 0; i2 < getInstrumentationInfo.this.read.write(); i2++) {
                    long jAudioAttributesCompatParcelizer = getInstrumentationInfo.this.read.AudioAttributesCompatParcelizer(i2);
                    Fragment fragmentIconCompatParcelizer2 = getInstrumentationInfo.this.read.IconCompatParcelizer(i2);
                    if (fragmentIconCompatParcelizer2.isAdded()) {
                        if (jAudioAttributesCompatParcelizer != this.RemoteActionCompatParcelizer) {
                            _doaddinjectableIconCompatParcelizer.RemoteActionCompatParcelizer(fragmentIconCompatParcelizer2, anyIgnorals.write.RemoteActionCompatParcelizer);
                            write writeVar = getInstrumentationInfo.this.write;
                            anyIgnorals.write writeVar2 = anyIgnorals.write.RemoteActionCompatParcelizer;
                            arrayList.add(writeVar.RemoteActionCompatParcelizer());
                        } else {
                            fragment = fragmentIconCompatParcelizer2;
                        }
                        fragmentIconCompatParcelizer2.setMenuVisibility(jAudioAttributesCompatParcelizer == this.RemoteActionCompatParcelizer);
                    }
                }
                if (fragment != null) {
                    _doaddinjectableIconCompatParcelizer.RemoteActionCompatParcelizer(fragment, anyIgnorals.write.write);
                    write writeVar3 = getInstrumentationInfo.this.write;
                    anyIgnorals.write writeVar4 = anyIgnorals.write.write;
                    arrayList.add(writeVar3.RemoteActionCompatParcelizer());
                }
                if (_doaddinjectableIconCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                    return;
                }
                _doaddinjectableIconCompatParcelizer.RemoteActionCompatParcelizer();
                Collections.reverse(arrayList);
                for (List list : arrayList) {
                    write writeVar5 = getInstrumentationInfo.this.write;
                    write.write(list);
                }
            }
        }

        private static ViewPager2 write(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: ".concat(String.valueOf(parent)));
        }
    }

    static abstract class RemoteActionCompatParcelizer extends RecyclerView.read {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void IconCompatParcelizer(int i, int i2) {
            read();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void AudioAttributesCompatParcelizer(int i, int i2, Object obj) {
            read();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void AudioAttributesCompatParcelizer(int i, int i2) {
            read();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void read(int i, int i2) {
            read();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void RemoteActionCompatParcelizer(int i, int i2) {
            read();
        }
    }

    static class write {
        private List<read> IconCompatParcelizer = new CopyOnWriteArrayList();

        write() {
        }

        public final List<read.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer() {
            ArrayList arrayList = new ArrayList();
            for (read readVar : this.IconCompatParcelizer) {
                arrayList.add(read.read());
            }
            return arrayList;
        }

        public static void write(List<read.RemoteActionCompatParcelizer> list) {
            for (read.RemoteActionCompatParcelizer remoteActionCompatParcelizer : list) {
            }
        }

        public final List<read.RemoteActionCompatParcelizer> IconCompatParcelizer() {
            ArrayList arrayList = new ArrayList();
            for (read readVar : this.IconCompatParcelizer) {
                arrayList.add(read.RemoteActionCompatParcelizer());
            }
            return arrayList;
        }

        public final List<read.RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer() {
            ArrayList arrayList = new ArrayList();
            for (read readVar : this.IconCompatParcelizer) {
                arrayList.add(read.IconCompatParcelizer());
            }
            return arrayList;
        }

        public final List<read.RemoteActionCompatParcelizer> write() {
            ArrayList arrayList = new ArrayList();
            for (read readVar : this.IconCompatParcelizer) {
                arrayList.add(read.write());
            }
            return arrayList;
        }
    }

    public static abstract class read {
        private static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer() { // from class: o.getInstrumentationInfo.read.5
        };

        public interface RemoteActionCompatParcelizer {
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        public static RemoteActionCompatParcelizer IconCompatParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        public static RemoteActionCompatParcelizer write() {
            return AudioAttributesCompatParcelizer;
        }

        public static RemoteActionCompatParcelizer read() {
            return AudioAttributesCompatParcelizer;
        }
    }
}
