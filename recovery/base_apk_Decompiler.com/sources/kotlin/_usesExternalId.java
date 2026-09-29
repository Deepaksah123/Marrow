package kotlin;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public interface _usesExternalId {

    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer();
    }

    AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i, Object obj);

    boolean AudioAttributesCompatParcelizer(int i);

    Looper IconCompatParcelizer();

    AudioAttributesCompatParcelizer IconCompatParcelizer(int i, int i2, int i3);

    AudioAttributesCompatParcelizer IconCompatParcelizer(int i, int i2, int i3, Object obj);

    boolean IconCompatParcelizer(Runnable runnable);

    void RemoteActionCompatParcelizer(int i);

    boolean RemoteActionCompatParcelizer(long j);

    boolean RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    void read();

    AudioAttributesCompatParcelizer write(int i);

    boolean write();
}
