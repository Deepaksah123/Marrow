package kotlin;

import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaao7PcXmyqriERRSM5ToUtyIayLw<A, B> {
    private final prepareChildSource<write<A>, B> read;

    public r8lambdaao7PcXmyqriERRSM5ToUtyIayLw() {
        this(250L);
    }

    public r8lambdaao7PcXmyqriERRSM5ToUtyIayLw(long j) {
        this.read = new prepareChildSource<write<A>, B>(j) { // from class: o.r8lambdaao7PcXmyqriERRSM5ToUtyIayLw.2
            @Override // kotlin.prepareChildSource
            public final /* bridge */ /* synthetic */ void read(Object obj, Object obj2) {
                read((write) obj);
            }

            private static void read(write<A> writeVar) {
                writeVar.RemoteActionCompatParcelizer();
            }
        };
    }

    public final B RemoteActionCompatParcelizer(A a) {
        write<A> writeVarRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(a, 0, 0);
        B bRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
        writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        return bRemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(A a, B b) {
        this.read.IconCompatParcelizer(write.RemoteActionCompatParcelizer(a, 0, 0), b);
    }

    static final class write<A> {
        private static final Queue<write<?>> IconCompatParcelizer = moveMediaSourceRange.write(0);
        private int AudioAttributesCompatParcelizer;
        private int read;
        private A write;

        static <A> write<A> RemoteActionCompatParcelizer(A a, int i, int i2) {
            write<A> writeVar;
            Queue<write<?>> queue = IconCompatParcelizer;
            synchronized (queue) {
                writeVar = (write) queue.poll();
            }
            if (writeVar == null) {
                writeVar = new write<>();
            }
            writeVar.AudioAttributesCompatParcelizer(a, 0, 0);
            return writeVar;
        }

        private write() {
        }

        private void AudioAttributesCompatParcelizer(A a, int i, int i2) {
            this.write = a;
            this.AudioAttributesCompatParcelizer = i;
            this.read = i2;
        }

        public final void RemoteActionCompatParcelizer() {
            Queue<write<?>> queue = IconCompatParcelizer;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return this.AudioAttributesCompatParcelizer == writeVar.AudioAttributesCompatParcelizer && this.read == writeVar.read && this.write.equals(writeVar.write);
        }

        public final int hashCode() {
            return (((this.read * 31) + this.AudioAttributesCompatParcelizer) * 31) + this.write.hashCode();
        }
    }
}
