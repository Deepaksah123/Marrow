package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data> {
    boolean read(Model model);

    RemoteActionCompatParcelizer<Data> write(Model model, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk);

    public static class RemoteActionCompatParcelizer<Data> {
        public final List<onVolumeChanged> AudioAttributesCompatParcelizer;
        public final fromUri<Data> RemoteActionCompatParcelizer;
        public final onVolumeChanged read;

        public RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, fromUri<Data> fromuri) {
            this(onvolumechanged, Collections.emptyList(), fromuri);
        }

        private RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, List<onVolumeChanged> list, fromUri<Data> fromuri) {
            this.read = (onVolumeChanged) moveMediaSource.AudioAttributesCompatParcelizer(onvolumechanged);
            this.AudioAttributesCompatParcelizer = (List) moveMediaSource.AudioAttributesCompatParcelizer(list);
            this.RemoteActionCompatParcelizer = (fromUri) moveMediaSource.AudioAttributesCompatParcelizer(fromuri);
        }
    }
}
