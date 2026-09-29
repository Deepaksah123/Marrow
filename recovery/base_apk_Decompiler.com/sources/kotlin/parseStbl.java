package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class parseStbl {
    public static <T> T RemoteActionCompatParcelizer(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(Object obj) {
        return new AudioAttributesCompatParcelizer(obj.getClass().getSimpleName(), (byte) 0);
    }

    public static final class AudioAttributesCompatParcelizer {
        private final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private boolean read;
        private RemoteActionCompatParcelizer write;

        /* synthetic */ AudioAttributesCompatParcelizer(String str, byte b) {
            this(str);
        }

        private AudioAttributesCompatParcelizer(String str) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            this.write = remoteActionCompatParcelizer;
            this.read = false;
            this.IconCompatParcelizer = false;
            this.RemoteActionCompatParcelizer = (String) parseStsd.IconCompatParcelizer(str);
        }

        public final AudioAttributesCompatParcelizer read(Object obj) {
            return write(obj);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append('{');
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            String str = "";
            while (remoteActionCompatParcelizer != null) {
                Object obj = remoteActionCompatParcelizer.write;
                sb.append(str);
                String str2 = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                if (obj != null && obj.getClass().isArray()) {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                remoteActionCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        private RemoteActionCompatParcelizer IconCompatParcelizer() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
            this.write.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            this.write = remoteActionCompatParcelizer;
            return remoteActionCompatParcelizer;
        }

        private AudioAttributesCompatParcelizer write(Object obj) {
            IconCompatParcelizer().write = obj;
            return this;
        }

        static class RemoteActionCompatParcelizer {
            RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
            String RemoteActionCompatParcelizer;
            Object write;

            RemoteActionCompatParcelizer() {
            }
        }
    }
}
