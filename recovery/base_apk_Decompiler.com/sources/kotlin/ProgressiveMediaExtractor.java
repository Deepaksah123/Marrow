package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public interface ProgressiveMediaExtractor {

    public interface AudioAttributesCompatParcelizer {
        void IconCompatParcelizer(String str, int i, int i2);

        void RemoteActionCompatParcelizer(String str, int i);

        void RemoteActionCompatParcelizer(String str, String str2);

        void read();

        void read(String str, int i, int i2);
    }

    public interface IconCompatParcelizer extends getDisplayCues {
        void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);
    }
}
