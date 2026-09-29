package kotlin;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import kotlin.getIds;

/* JADX INFO: loaded from: classes4.dex */
final class VideoBookmarkTimeline extends getIds {
    private final Handler read;
    private final boolean write = false;

    VideoBookmarkTimeline(Handler handler) {
        this.read = handler;
    }

    @Override // kotlin.getIds
    public final MarkIncompleteResponseBody IconCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.read, getPaymentRefIds.RemoteActionCompatParcelizer(runnable));
        this.read.postDelayed(audioAttributesCompatParcelizer, timeUnit.toMillis(j));
        return audioAttributesCompatParcelizer;
    }

    @Override // kotlin.getIds
    public final getIds.IconCompatParcelizer IconCompatParcelizer() {
        return new read(this.read, this.write);
    }

    static final class read extends getIds.IconCompatParcelizer {
        private volatile boolean AudioAttributesCompatParcelizer;
        private final Handler RemoteActionCompatParcelizer;
        private final boolean read;

        read(Handler handler, boolean z) {
            this.RemoteActionCompatParcelizer = handler;
            this.read = z;
        }

        @Override // o.getIds.IconCompatParcelizer
        public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.AudioAttributesCompatParcelizer) {
                return StubResponseBody.RemoteActionCompatParcelizer();
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, getPaymentRefIds.RemoteActionCompatParcelizer(runnable));
            Message messageObtain = Message.obtain(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer);
            messageObtain.obj = this;
            if (this.read) {
                messageObtain.setAsynchronous(true);
            }
            this.RemoteActionCompatParcelizer.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.AudioAttributesCompatParcelizer) {
                return audioAttributesCompatParcelizer;
            }
            this.RemoteActionCompatParcelizer.removeCallbacks(audioAttributesCompatParcelizer);
            return StubResponseBody.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.AudioAttributesCompatParcelizer = true;
            this.RemoteActionCompatParcelizer.removeCallbacksAndMessages(this);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    static final class AudioAttributesCompatParcelizer implements Runnable, MarkIncompleteResponseBody {
        private final Runnable AudioAttributesCompatParcelizer;
        private final Handler RemoteActionCompatParcelizer;
        private volatile boolean read;

        AudioAttributesCompatParcelizer(Handler handler, Runnable runnable) {
            this.RemoteActionCompatParcelizer = handler;
            this.AudioAttributesCompatParcelizer = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.AudioAttributesCompatParcelizer.run();
            } catch (Throwable th) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.RemoteActionCompatParcelizer.removeCallbacks(this);
            this.read = true;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.read;
        }
    }
}
