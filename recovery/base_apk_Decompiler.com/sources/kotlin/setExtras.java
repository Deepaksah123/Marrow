package kotlin;

import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class setExtras<Model> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Model> {
    private static final setExtras<?> IconCompatParcelizer = new setExtras<>();

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final boolean read(Model model) {
        return true;
    }

    public static <T> setExtras<T> write() {
        return (setExtras<T>) IconCompatParcelizer;
    }

    @Deprecated
    public setExtras() {
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Model> write(Model model, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(model), new write(model));
    }

    static class write<Model> implements fromUri<Model> {
        private final Model IconCompatParcelizer;

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.fromUri
        public final void read() {
        }

        write(Model model) {
            this.IconCompatParcelizer = model;
        }

        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super Model> audioAttributesCompatParcelizer) {
            audioAttributesCompatParcelizer.write(this.IconCompatParcelizer);
        }

        @Override // kotlin.fromUri
        public final Class<Model> write() {
            return (Class<Model>) this.IconCompatParcelizer.getClass();
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return onTracksChanged.LOCAL;
        }
    }

    public static class RemoteActionCompatParcelizer<Model> implements setTargetOffsetMs<Model, Model> {
        private static final RemoteActionCompatParcelizer<?> read = new RemoteActionCompatParcelizer<>();

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public static <T> RemoteActionCompatParcelizer<T> RemoteActionCompatParcelizer() {
            return (RemoteActionCompatParcelizer<T>) read;
        }

        @Deprecated
        public RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Model> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return setExtras.write();
        }
    }
}
