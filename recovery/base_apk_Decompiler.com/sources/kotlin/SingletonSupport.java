package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class SingletonSupport implements Runnable {
    public static final ThreadLocal<SingletonSupport> AudioAttributesCompatParcelizer = new ThreadLocal<>();
    private static Comparator<write> write = new Comparator<write>() { // from class: o.SingletonSupport.4
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(write writeVar, write writeVar2) {
            return read(writeVar, writeVar2);
        }

        private static int read(write writeVar, write writeVar2) {
            if ((writeVar.write == null) != (writeVar2.write == null)) {
                return writeVar.write == null ? 1 : -1;
            }
            if (writeVar.RemoteActionCompatParcelizer != writeVar2.RemoteActionCompatParcelizer) {
                return writeVar.RemoteActionCompatParcelizer ? -1 : 1;
            }
            int i = writeVar2.read - writeVar.read;
            if (i != 0) {
                return i;
            }
            int i2 = writeVar.AudioAttributesCompatParcelizer - writeVar2.AudioAttributesCompatParcelizer;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    };
    private ArrayList<RecyclerView> IconCompatParcelizer = new ArrayList<>();
    private ArrayList<write> MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
    private long RemoteActionCompatParcelizer;
    public long read;

    static class write {
        public int AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public boolean RemoteActionCompatParcelizer;
        public int read;
        public RecyclerView write;

        write() {
        }

        public final void write() {
            this.RemoteActionCompatParcelizer = false;
            this.read = 0;
            this.AudioAttributesCompatParcelizer = 0;
            this.write = null;
            this.IconCompatParcelizer = 0;
        }
    }

    public static class read implements RecyclerView.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int[] write;

        final void RemoteActionCompatParcelizer(int i, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
        }

        final void IconCompatParcelizer(RecyclerView recyclerView, boolean z) {
            this.AudioAttributesCompatParcelizer = 0;
            int[] iArr = this.write;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = recyclerView.onPlayFromMediaId;
            if (recyclerView.MediaBrowserCompatItemReceiver == null || mediaBrowserCompatItemReceiver == null || !mediaBrowserCompatItemReceiver.onPrepareFromUri()) {
                return;
            }
            if (z) {
                if (!recyclerView.MediaMetadataCompat.read()) {
                    mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(recyclerView.MediaBrowserCompatItemReceiver.getItemCount(), this);
                }
            } else if (!recyclerView.MediaDescriptionCompat()) {
                mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, recyclerView.onPrepareFromUri, this);
            }
            if (this.AudioAttributesCompatParcelizer > mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer) {
                mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer;
                mediaBrowserCompatItemReceiver.MediaMetadataCompat = z;
                recyclerView.onRemoveQueueItemAt.RatingCompat();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer
        public final void read(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.AudioAttributesCompatParcelizer;
            int i4 = i3 << 1;
            int[] iArr = this.write;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.write = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 << 2];
                this.write = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.write;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.AudioAttributesCompatParcelizer++;
        }

        public final boolean write(int i) {
            if (this.write != null) {
                int i2 = this.AudioAttributesCompatParcelizer;
                for (int i3 = 0; i3 < (i2 << 1); i3 += 2) {
                    if (this.write[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void RemoteActionCompatParcelizer() {
            int[] iArr = this.write;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.AudioAttributesCompatParcelizer = 0;
        }
    }

    public final void RemoteActionCompatParcelizer(RecyclerView recyclerView) {
        if (RecyclerView.AudioAttributesImplApi26Parcelizer && this.IconCompatParcelizer.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.IconCompatParcelizer.add(recyclerView);
    }

    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView) {
        boolean zRemove = this.IconCompatParcelizer.remove(recyclerView);
        if (RecyclerView.AudioAttributesImplApi26Parcelizer && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.AudioAttributesImplApi26Parcelizer && !this.IconCompatParcelizer.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.RemoteActionCompatParcelizer == 0) {
                this.RemoteActionCompatParcelizer = RecyclerView.MediaBrowserCompatItemReceiver();
                recyclerView.post(this);
            }
        }
        recyclerView.onPlayFromSearch.RemoteActionCompatParcelizer(i, i2);
    }

    private void IconCompatParcelizer() {
        write writeVar;
        int size = this.IconCompatParcelizer.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.IconCompatParcelizer.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.onPlayFromSearch.IconCompatParcelizer(recyclerView, false);
                i += recyclerView.onPlayFromSearch.AudioAttributesCompatParcelizer;
            }
        }
        this.MediaBrowserCompatCustomActionResultReceiver.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.IconCompatParcelizer.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                read readVar = recyclerView2.onPlayFromSearch;
                int iAbs = Math.abs(readVar.RemoteActionCompatParcelizer) + Math.abs(readVar.IconCompatParcelizer);
                int i5 = 0;
                while (true) {
                    boolean z = true;
                    if (i5 < (readVar.AudioAttributesCompatParcelizer << 1)) {
                        if (i3 >= this.MediaBrowserCompatCustomActionResultReceiver.size()) {
                            writeVar = new write();
                            this.MediaBrowserCompatCustomActionResultReceiver.add(writeVar);
                        } else {
                            writeVar = this.MediaBrowserCompatCustomActionResultReceiver.get(i3);
                        }
                        int i6 = readVar.write[i5 + 1];
                        if (i6 > iAbs) {
                            z = false;
                        }
                        writeVar.RemoteActionCompatParcelizer = z;
                        writeVar.read = iAbs;
                        writeVar.AudioAttributesCompatParcelizer = i6;
                        writeVar.write = recyclerView2;
                        writeVar.IconCompatParcelizer = readVar.write[i5];
                        i3++;
                        i5 += 2;
                    }
                }
            }
        }
        Collections.sort(this.MediaBrowserCompatCustomActionResultReceiver, write);
    }

    private static boolean write(RecyclerView recyclerView, int i) {
        int iRemoteActionCompatParcelizer = recyclerView.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i2 = 0; i2 < iRemoteActionCompatParcelizer; i2++) {
            RecyclerView.onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(recyclerView.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i2));
            if (onmediabuttoneventIconCompatParcelizer.mPosition == i && !onmediabuttoneventIconCompatParcelizer.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private static RecyclerView.onMediaButtonEvent IconCompatParcelizer(RecyclerView recyclerView, int i, long j) {
        if (write(recyclerView, i)) {
            return null;
        }
        RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = recyclerView.onRemoveQueueItemAt;
        try {
            recyclerView.MediaMetadataCompat();
            RecyclerView.onMediaButtonEvent onmediabuttonevent = mediaDescriptionCompat.read(i, false, j);
            if (onmediabuttonevent != null) {
                if (onmediabuttonevent.isBound() && !onmediabuttonevent.isInvalid()) {
                    mediaDescriptionCompat.write(onmediabuttonevent.itemView);
                } else {
                    mediaDescriptionCompat.IconCompatParcelizer(onmediabuttonevent, false);
                }
            }
            return onmediabuttonevent;
        } finally {
            recyclerView.RemoteActionCompatParcelizer(false);
        }
    }

    private static void IconCompatParcelizer(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.RatingCompat && recyclerView.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer() != 0) {
                recyclerView.onAddQueueItem();
            }
            read readVar = recyclerView.onPlayFromSearch;
            readVar.IconCompatParcelizer(recyclerView, true);
            if (readVar.AudioAttributesCompatParcelizer != 0) {
                try {
                    constructDelegatingKeyDeserializer.read("RV Nested Prefetch");
                    recyclerView.onPrepareFromUri.RemoteActionCompatParcelizer(recyclerView.MediaBrowserCompatItemReceiver);
                    for (int i = 0; i < (readVar.AudioAttributesCompatParcelizer << 1); i += 2) {
                        IconCompatParcelizer(recyclerView, readVar.write[i], j);
                    }
                } finally {
                    constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
                }
            }
        }
    }

    private void read(write writeVar, long j) {
        RecyclerView.onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(writeVar.write, writeVar.IconCompatParcelizer, writeVar.RemoteActionCompatParcelizer ? Long.MAX_VALUE : j);
        if (onmediabuttoneventIconCompatParcelizer == null || onmediabuttoneventIconCompatParcelizer.mNestedRecyclerView == null || !onmediabuttoneventIconCompatParcelizer.isBound() || onmediabuttoneventIconCompatParcelizer.isInvalid()) {
            return;
        }
        IconCompatParcelizer(onmediabuttoneventIconCompatParcelizer.mNestedRecyclerView.get(), j);
    }

    private void RemoteActionCompatParcelizer(long j) {
        for (int i = 0; i < this.MediaBrowserCompatCustomActionResultReceiver.size(); i++) {
            write writeVar = this.MediaBrowserCompatCustomActionResultReceiver.get(i);
            if (writeVar.write == null) {
                return;
            }
            read(writeVar, j);
            writeVar.write();
        }
    }

    private void AudioAttributesCompatParcelizer(long j) {
        IconCompatParcelizer();
        RemoteActionCompatParcelizer(j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            constructDelegatingKeyDeserializer.read("RV Prefetch");
            if (!this.IconCompatParcelizer.isEmpty()) {
                int size = this.IconCompatParcelizer.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.IconCompatParcelizer.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    AudioAttributesCompatParcelizer(TimeUnit.MILLISECONDS.toNanos(jMax) + this.read);
                }
            }
        } finally {
            this.RemoteActionCompatParcelizer = 0L;
            constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
        }
    }
}
