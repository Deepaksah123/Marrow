package kotlin;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AnnotatedMethod {
    public abstract Map<RemoteActionCompatParcelizer<?>, Object> AudioAttributesCompatParcelizer();

    public abstract <T> T write(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer);

    public static final class RemoteActionCompatParcelizer<T> {
        private final String IconCompatParcelizer;

        public RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof RemoteActionCompatParcelizer) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((RemoteActionCompatParcelizer) obj).IconCompatParcelizer);
            }
            return false;
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class write<T> {
        private final RemoteActionCompatParcelizer<T> AudioAttributesCompatParcelizer;
        private final T read;

        public final RemoteActionCompatParcelizer<T> IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final T read() {
            return this.read;
        }
    }

    public final getAllAnnotations IconCompatParcelizer() {
        return new getAllAnnotations(VideoTimelineResponseBody.IconCompatParcelizer(AudioAttributesCompatParcelizer()), false);
    }

    public final AnnotatedMethod RemoteActionCompatParcelizer() {
        return new getAllAnnotations(VideoTimelineResponseBody.IconCompatParcelizer(AudioAttributesCompatParcelizer()), true);
    }
}
