package kotlin;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class _checkIntToStringCoercion {
    private final RemoteActionCompatParcelizer write;

    public _checkIntToStringCoercion() {
        this((byte) 0);
    }

    private _checkIntToStringCoercion(byte b) {
        this.write = new read(1);
    }

    public final void RemoteActionCompatParcelizer(Activity activity) {
        this.write.write(activity);
    }

    public final SparseIntArray[] read(Activity activity) {
        return this.write.IconCompatParcelizer(activity);
    }

    public final SparseIntArray[] write() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    public final SparseIntArray[] read() {
        return this.write.IconCompatParcelizer();
    }

    static class RemoteActionCompatParcelizer {
        public SparseIntArray[] AudioAttributesCompatParcelizer() {
            return null;
        }

        public SparseIntArray[] IconCompatParcelizer() {
            return null;
        }

        public SparseIntArray[] IconCompatParcelizer(Activity activity) {
            return null;
        }

        public void write(Activity activity) {
        }

        RemoteActionCompatParcelizer() {
        }
    }

    static class read extends RemoteActionCompatParcelizer {
        private static Handler read;
        private static HandlerThread write;
        int IconCompatParcelizer;
        SparseIntArray[] AudioAttributesCompatParcelizer = new SparseIntArray[9];
        private final ArrayList<WeakReference<Activity>> AudioAttributesImplApi21Parcelizer = new ArrayList<>();
        Window.OnFrameMetricsAvailableListener RemoteActionCompatParcelizer = new Window.OnFrameMetricsAvailableListener() { // from class: o._checkIntToStringCoercion.read.2
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                if ((read.this.IconCompatParcelizer & 1) != 0) {
                    read readVar = read.this;
                    readVar.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer[0], frameMetrics.getMetric(8));
                }
                if ((read.this.IconCompatParcelizer & 2) != 0) {
                    read readVar2 = read.this;
                    readVar2.IconCompatParcelizer(readVar2.AudioAttributesCompatParcelizer[1], frameMetrics.getMetric(1));
                }
                if ((read.this.IconCompatParcelizer & 4) != 0) {
                    read readVar3 = read.this;
                    readVar3.IconCompatParcelizer(readVar3.AudioAttributesCompatParcelizer[2], frameMetrics.getMetric(3));
                }
                if ((read.this.IconCompatParcelizer & 8) != 0) {
                    read readVar4 = read.this;
                    readVar4.IconCompatParcelizer(readVar4.AudioAttributesCompatParcelizer[3], frameMetrics.getMetric(4));
                }
                if ((read.this.IconCompatParcelizer & 16) != 0) {
                    read readVar5 = read.this;
                    readVar5.IconCompatParcelizer(readVar5.AudioAttributesCompatParcelizer[4], frameMetrics.getMetric(5));
                }
                if ((read.this.IconCompatParcelizer & 64) != 0) {
                    read readVar6 = read.this;
                    readVar6.IconCompatParcelizer(readVar6.AudioAttributesCompatParcelizer[6], frameMetrics.getMetric(7));
                }
                if ((read.this.IconCompatParcelizer & 32) != 0) {
                    read readVar7 = read.this;
                    readVar7.IconCompatParcelizer(readVar7.AudioAttributesCompatParcelizer[5], frameMetrics.getMetric(6));
                }
                if ((read.this.IconCompatParcelizer & 128) != 0) {
                    read readVar8 = read.this;
                    readVar8.IconCompatParcelizer(readVar8.AudioAttributesCompatParcelizer[7], frameMetrics.getMetric(0));
                }
                if ((read.this.IconCompatParcelizer & 256) != 0) {
                    read readVar9 = read.this;
                    readVar9.IconCompatParcelizer(readVar9.AudioAttributesCompatParcelizer[8], frameMetrics.getMetric(2));
                }
            }
        };

        read(int i) {
            this.IconCompatParcelizer = i;
        }

        void IconCompatParcelizer(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        @Override // o._checkIntToStringCoercion.RemoteActionCompatParcelizer
        public void write(Activity activity) {
            if (write == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                write = handlerThread;
                handlerThread.start();
                read = new Handler(write.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.AudioAttributesCompatParcelizer;
                if (sparseIntArrayArr[i] == null && (this.IconCompatParcelizer & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.RemoteActionCompatParcelizer, read);
            this.AudioAttributesImplApi21Parcelizer.add(new WeakReference<>(activity));
        }

        @Override // o._checkIntToStringCoercion.RemoteActionCompatParcelizer
        public SparseIntArray[] IconCompatParcelizer(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.AudioAttributesImplApi21Parcelizer.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.AudioAttributesImplApi21Parcelizer.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.RemoteActionCompatParcelizer);
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o._checkIntToStringCoercion.RemoteActionCompatParcelizer
        public SparseIntArray[] IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o._checkIntToStringCoercion.RemoteActionCompatParcelizer
        public SparseIntArray[] AudioAttributesCompatParcelizer() {
            SparseIntArray[] sparseIntArrayArr = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = new SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }
}
