package kotlin;

import kotlin.getShuffleModeEnabled;

/* JADX INFO: loaded from: classes2.dex */
class verifyApplicationThread extends getShuffleModeEnabled {
    private static final getShuffleModeEnabled.write AudioAttributesCompatParcelizer = new getShuffleModeEnabled.write() { // from class: o.verifyApplicationThread.2
        @Override // o.getShuffleModeEnabled.write
        public final void AudioAttributesCompatParcelizer() {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }

        @Override // o.getShuffleModeEnabled.write
        public final void read() {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    };

    verifyApplicationThread(int i) {
        super(i);
        write();
    }

    final void AudioAttributesCompatParcelizer() {
        IconCompatParcelizer(AudioAttributesCompatParcelizer);
        IconCompatParcelizer();
    }
}
