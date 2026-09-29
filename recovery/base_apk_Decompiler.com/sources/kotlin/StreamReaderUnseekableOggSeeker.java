package kotlin;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
class StreamReaderUnseekableOggSeeker implements AsynchronousMediaCodecBufferEnqueuerMessageParams, flushHandlerThread {
    private final Map<Class<?>, ConcurrentHashMap<doQueueSecureInputBuffer<Object>, Executor>> AudioAttributesCompatParcelizer = new HashMap();
    private Queue<getMessageParams<?>> IconCompatParcelizer = new ArrayDeque();
    private final Executor write;

    StreamReaderUnseekableOggSeeker(Executor executor) {
        this.write = executor;
    }

    private void read(final getMessageParams<?> getmessageparams) {
        synchronized (this) {
            Queue<getMessageParams<?>> queue = this.IconCompatParcelizer;
            if (queue != null) {
                queue.add(getmessageparams);
                return;
            }
            for (final Map.Entry<doQueueSecureInputBuffer<Object>, Executor> entry : AudioAttributesCompatParcelizer(getmessageparams)) {
                entry.getValue().execute(new Runnable() { // from class: o.StreamReader1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((doQueueSecureInputBuffer) entry.getKey()).IconCompatParcelizer(getmessageparams);
                    }
                });
            }
        }
    }

    private Set<Map.Entry<doQueueSecureInputBuffer<Object>, Executor>> AudioAttributesCompatParcelizer(getMessageParams<?> getmessageparams) {
        Set<Map.Entry<doQueueSecureInputBuffer<Object>, Executor>> setEmptySet;
        synchronized (this) {
            ConcurrentHashMap<doQueueSecureInputBuffer<Object>, Executor> concurrentHashMap = this.AudioAttributesCompatParcelizer.get(getmessageparams.IconCompatParcelizer());
            setEmptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
        }
        return setEmptySet;
    }

    @Override // kotlin.AsynchronousMediaCodecBufferEnqueuerMessageParams
    public final <T> void RemoteActionCompatParcelizer(Class<T> cls, Executor executor, doQueueSecureInputBuffer<? super T> doqueuesecureinputbuffer) {
        synchronized (this) {
            if (!this.AudioAttributesCompatParcelizer.containsKey(cls)) {
                this.AudioAttributesCompatParcelizer.put(cls, new ConcurrentHashMap<>());
            }
            this.AudioAttributesCompatParcelizer.get(cls).put(doqueuesecureinputbuffer, executor);
        }
    }

    @Override // kotlin.AsynchronousMediaCodecBufferEnqueuerMessageParams
    public final <T> void AudioAttributesCompatParcelizer(Class<T> cls, doQueueSecureInputBuffer<? super T> doqueuesecureinputbuffer) {
        RemoteActionCompatParcelizer(cls, this.write, doqueuesecureinputbuffer);
    }

    final void AudioAttributesCompatParcelizer() {
        Queue<getMessageParams<?>> queue;
        synchronized (this) {
            queue = this.IconCompatParcelizer;
            if (queue != null) {
                this.IconCompatParcelizer = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<getMessageParams<?>> it = queue.iterator();
            while (it.hasNext()) {
                read(it.next());
            }
        }
    }
}
