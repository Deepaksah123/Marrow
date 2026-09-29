package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface setFirstAnswer {
    void AudioAttributesCompatParcelizer(setFirstAnswerIndex setfirstanswerindex);

    void AudioAttributesCompatParcelizer(boolean z);

    boolean AudioAttributesCompatParcelizer();

    void AudioAttributesImplApi21Parcelizer(boolean z);

    void AudioAttributesImplApi26Parcelizer(boolean z);

    void AudioAttributesImplBaseParcelizer(boolean z);

    void IconCompatParcelizer(setRight setright);

    void IconCompatParcelizer(boolean z);

    boolean IconCompatParcelizer();

    isFirstAnswerSkipped RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(Set<? extends isSillyMistake> set);

    void RemoteActionCompatParcelizer(boolean z);

    void read(Set<getNotesCount> set);

    void read(isFirstAnswerSkipped isfirstanswerskipped);

    void read(boolean z);

    Set<getNotesCount> write();

    void write(McqAnswerIndexModel mcqAnswerIndexModel);

    void write(boolean z);

    public static final class IconCompatParcelizer {
        public static boolean RemoteActionCompatParcelizer(setFirstAnswer setfirstanswer) {
            return setfirstanswer.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
        }

        public static boolean write(setFirstAnswer setfirstanswer) {
            return setfirstanswer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
        }
    }
}
