package kotlin;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.OfflineLicenseHelperExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class renewLicense {

    public enum write {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    abstract BinarySearchSeeker RemoteActionCompatParcelizer();

    abstract Map<DrmUtilApi21, RemoteActionCompatParcelizer> read();

    public static abstract class RemoteActionCompatParcelizer {

        public static abstract class write {
            public abstract write AudioAttributesCompatParcelizer();

            public abstract write AudioAttributesCompatParcelizer(long j);

            public abstract RemoteActionCompatParcelizer read();

            public abstract write write(Set<write> set);
        }

        abstract long AudioAttributesCompatParcelizer();

        abstract long read();

        abstract Set<write> write();

        public static write IconCompatParcelizer() {
            return new OfflineLicenseHelperExternalSyntheticLambda2.IconCompatParcelizer().write(Collections.emptySet());
        }
    }

    public static renewLicense RemoteActionCompatParcelizer(BinarySearchSeeker binarySearchSeeker) {
        return IconCompatParcelizer().RemoteActionCompatParcelizer(DrmUtilApi21.DEFAULT, RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer(30000L).AudioAttributesCompatParcelizer().read()).RemoteActionCompatParcelizer(DrmUtilApi21.HIGHEST, RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer(1000L).AudioAttributesCompatParcelizer().read()).RemoteActionCompatParcelizer(DrmUtilApi21.VERY_LOW, RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer(86400000L).AudioAttributesCompatParcelizer().write(read(write.DEVICE_IDLE)).read()).IconCompatParcelizer(binarySearchSeeker).AudioAttributesCompatParcelizer();
    }

    private static AudioAttributesCompatParcelizer IconCompatParcelizer() {
        return new AudioAttributesCompatParcelizer();
    }

    static renewLicense write(BinarySearchSeeker binarySearchSeeker, Map<DrmUtilApi21, RemoteActionCompatParcelizer> map) {
        return new lambdagetLicenseDurationRemainingSec0comgoogleandroidexoplayer2drmOfflineLicenseHelper(binarySearchSeeker, map);
    }

    public static class AudioAttributesCompatParcelizer {
        private Map<DrmUtilApi21, RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer = new HashMap();
        private BinarySearchSeeker IconCompatParcelizer;

        public final AudioAttributesCompatParcelizer IconCompatParcelizer(BinarySearchSeeker binarySearchSeeker) {
            this.IconCompatParcelizer = binarySearchSeeker;
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(DrmUtilApi21 drmUtilApi21, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.put(drmUtilApi21, remoteActionCompatParcelizer);
            return this;
        }

        public final renewLicense AudioAttributesCompatParcelizer() {
            if (this.IconCompatParcelizer == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.AudioAttributesCompatParcelizer.keySet().size() < DrmUtilApi21.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<DrmUtilApi21, RemoteActionCompatParcelizer> map = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = new HashMap();
            return renewLicense.write(this.IconCompatParcelizer, map);
        }
    }

    public final long read(DrmUtilApi21 drmUtilApi21, long j, int i) {
        long jIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = read().get(drmUtilApi21);
        return Math.min(Math.max(IconCompatParcelizer(i, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer()), j - jIconCompatParcelizer), remoteActionCompatParcelizer.read());
    }

    private static long IconCompatParcelizer(int i, long j) {
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * ((long) r6))));
    }

    public final JobInfo.Builder AudioAttributesCompatParcelizer(JobInfo.Builder builder, DrmUtilApi21 drmUtilApi21, long j, int i) {
        builder.setMinimumLatency(read(drmUtilApi21, j, i));
        read(builder, read().get(drmUtilApi21).write());
        return builder;
    }

    private static void read(JobInfo.Builder builder, Set<write> set) {
        if (set.contains(write.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(write.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(write.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    private static <T> Set<T> read(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }
}
