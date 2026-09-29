package kotlin;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
final class setStartsAtKeyFrame {
    private final Map<String, IconCompatParcelizer> AudioAttributesCompatParcelizer = new HashMap();
    private final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer();

    setStartsAtKeyFrame() {
    }

    final void AudioAttributesCompatParcelizer(String str) {
        IconCompatParcelizer iconCompatParcelizerWrite;
        synchronized (this) {
            iconCompatParcelizerWrite = this.AudioAttributesCompatParcelizer.get(str);
            if (iconCompatParcelizerWrite == null) {
                iconCompatParcelizerWrite = this.read.write();
                this.AudioAttributesCompatParcelizer.put(str, iconCompatParcelizerWrite);
            }
            iconCompatParcelizerWrite.IconCompatParcelizer++;
        }
        iconCompatParcelizerWrite.AudioAttributesCompatParcelizer.lock();
    }

    final void RemoteActionCompatParcelizer(String str) {
        IconCompatParcelizer iconCompatParcelizer;
        synchronized (this) {
            iconCompatParcelizer = (IconCompatParcelizer) moveMediaSource.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.get(str));
            if (iconCompatParcelizer.IconCompatParcelizer <= 0) {
                StringBuilder sb = new StringBuilder("Cannot release a lock that is not held, safeKey: ");
                sb.append(str);
                sb.append(", interestedThreads: ");
                sb.append(iconCompatParcelizer.IconCompatParcelizer);
                throw new IllegalStateException(sb.toString());
            }
            iconCompatParcelizer.IconCompatParcelizer--;
            if (iconCompatParcelizer.IconCompatParcelizer == 0) {
                IconCompatParcelizer iconCompatParcelizerRemove = this.AudioAttributesCompatParcelizer.remove(str);
                if (!iconCompatParcelizerRemove.equals(iconCompatParcelizer)) {
                    StringBuilder sb2 = new StringBuilder("Removed the wrong lock, expected to remove: ");
                    sb2.append(iconCompatParcelizer);
                    sb2.append(", but actually removed: ");
                    sb2.append(iconCompatParcelizerRemove);
                    sb2.append(", safeKey: ");
                    sb2.append(str);
                    throw new IllegalStateException(sb2.toString());
                }
                this.read.RemoteActionCompatParcelizer(iconCompatParcelizerRemove);
            }
        }
        iconCompatParcelizer.AudioAttributesCompatParcelizer.unlock();
    }

    static class IconCompatParcelizer {
        final Lock AudioAttributesCompatParcelizer = new ReentrantLock();
        int IconCompatParcelizer;

        IconCompatParcelizer() {
        }
    }

    static class AudioAttributesCompatParcelizer {
        private final Queue<IconCompatParcelizer> AudioAttributesCompatParcelizer = new ArrayDeque();

        AudioAttributesCompatParcelizer() {
        }

        final IconCompatParcelizer write() {
            IconCompatParcelizer iconCompatParcelizerPoll;
            synchronized (this.AudioAttributesCompatParcelizer) {
                iconCompatParcelizerPoll = this.AudioAttributesCompatParcelizer.poll();
            }
            return iconCompatParcelizerPoll == null ? new IconCompatParcelizer() : iconCompatParcelizerPoll;
        }

        final void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer.size() < 10) {
                    this.AudioAttributesCompatParcelizer.offer(iconCompatParcelizer);
                }
            }
        }
    }
}
