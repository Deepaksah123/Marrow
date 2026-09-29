package kotlin;

import kotlin.setOption6AnsweredCount;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setReferences {
    public abstract int RemoteActionCompatParcelizer();

    public String toString() {
        return getClass().getSimpleName();
    }

    public static final class read extends setReferences {
        public static final read IconCompatParcelizer = new read();
        private static final int read;

        private read() {
        }

        @Override // kotlin.setReferences
        public final int RemoteActionCompatParcelizer() {
            return read;
        }

        static {
            setOption6AnsweredCount.write writeVar = setOption6AnsweredCount.IconCompatParcelizer;
            int iWrite = setOption6AnsweredCount.write.write();
            setOption6AnsweredCount.write writeVar2 = setOption6AnsweredCount.IconCompatParcelizer;
            int i = setOption6AnsweredCount.write.read();
            setOption6AnsweredCount.write writeVar3 = setOption6AnsweredCount.IconCompatParcelizer;
            read = iWrite & (~(i | setOption6AnsweredCount.write.AudioAttributesImplBaseParcelizer()));
        }
    }

    public static final class AudioAttributesCompatParcelizer extends setReferences {
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer();

        @Override // kotlin.setReferences
        public final int RemoteActionCompatParcelizer() {
            return 0;
        }

        private AudioAttributesCompatParcelizer() {
        }
    }
}
