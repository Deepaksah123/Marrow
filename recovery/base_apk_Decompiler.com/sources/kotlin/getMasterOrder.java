package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface getMasterOrder {

    public interface AudioAttributesCompatParcelizer {
        AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel);

        void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, Object obj);

        void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getChildQuestions getchildquestions);

        read RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid);

        void RemoteActionCompatParcelizer();

        void write(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid2);
    }

    public interface IconCompatParcelizer extends RemoteActionCompatParcelizer {
        AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds);
    }

    public interface RemoteActionCompatParcelizer {
        AudioAttributesCompatParcelizer IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds);

        void RemoteActionCompatParcelizer();
    }

    public interface read {
        AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel);

        void AudioAttributesCompatParcelizer(getChildQuestions getchildquestions);

        void RemoteActionCompatParcelizer();

        void write(Object obj);

        void write(RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid);
    }

    public interface write {
        RemoteActionCompatParcelizer RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, String str);

        IconCompatParcelizer read(getRelatedLessonId getrelatedlessonid, String str);
    }

    void AudioAttributesCompatParcelizer(write writeVar);

    String RemoteActionCompatParcelizer();

    RevisionSubjectStatusModel read();

    isActiveForNewTag write();

    void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer);
}
