package kotlin;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class PlanBUpgradeData {
    private static getIds IconCompatParcelizer;
    private static getIds write;

    static final class MediaBrowserCompatItemReceiver {
        static final getIds AudioAttributesCompatParcelizer = new isValidForPlan();

        MediaBrowserCompatItemReceiver() {
        }
    }

    static final class AudioAttributesCompatParcelizer {
        static final getIds AudioAttributesCompatParcelizer = new SdkPayload();

        AudioAttributesCompatParcelizer() {
        }
    }

    static final class RemoteActionCompatParcelizer {
        static final getIds IconCompatParcelizer = new belongsToCourseId();

        RemoteActionCompatParcelizer() {
        }
    }

    static final class write {
        static final getIds RemoteActionCompatParcelizer = new Coupon();

        write() {
        }
    }

    static {
        getPaymentRefIds.write(new AudioAttributesImplBaseParcelizer());
        write = getPaymentRefIds.IconCompatParcelizer(new read());
        IconCompatParcelizer = getPaymentRefIds.AudioAttributesCompatParcelizer(new IconCompatParcelizer());
        setCouponCode.AudioAttributesCompatParcelizer();
        getPaymentRefIds.RemoteActionCompatParcelizer(new MediaBrowserCompatCustomActionResultReceiver());
    }

    public static getIds RemoteActionCompatParcelizer() {
        return getPaymentRefIds.write(write);
    }

    public static getIds read() {
        return getPaymentRefIds.RemoteActionCompatParcelizer(IconCompatParcelizer);
    }

    static final class IconCompatParcelizer implements Callable<getIds> {
        IconCompatParcelizer() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ getIds call() throws Exception {
            return RemoteActionCompatParcelizer();
        }

        private static getIds RemoteActionCompatParcelizer() throws Exception {
            return RemoteActionCompatParcelizer.IconCompatParcelizer;
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver implements Callable<getIds> {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ getIds call() throws Exception {
            return read();
        }

        private static getIds read() throws Exception {
            return write.RemoteActionCompatParcelizer;
        }
    }

    static final class AudioAttributesImplBaseParcelizer implements Callable<getIds> {
        AudioAttributesImplBaseParcelizer() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ getIds call() throws Exception {
            return IconCompatParcelizer();
        }

        private static getIds IconCompatParcelizer() throws Exception {
            return MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer;
        }
    }

    static final class read implements Callable<getIds> {
        read() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ getIds call() throws Exception {
            return write();
        }

        private static getIds write() throws Exception {
            return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }
    }
}
