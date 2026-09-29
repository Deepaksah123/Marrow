package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.getMasterOrder;
import kotlin.getOption1AnsweredCount;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class getAssociatedLessons extends ConcisedLessonParentInfo<dummyEditor, getMagicLine<?>> {
    private incrementTotalCount AudioAttributesCompatParcelizer;
    private final getTopSection IconCompatParcelizer;
    private final setMCQId RemoteActionCompatParcelizer;
    private final CourseConfigV2PlanScreenConfig write;

    @Override // kotlin.ConcisedLessonParentInfo
    public final /* bridge */ /* synthetic */ getMagicLine<?> write(getMagicLine<?> getmagicline) {
        return write2(getmagicline);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAssociatedLessons(getTopSection gettopsection, CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig, getMini getmini, getLessonActivityStatus getlessonactivitystatus) {
        super(getmini, getlessonactivitystatus);
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2PlanScreenConfig, "");
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(getlessonactivitystatus, "");
        this.IconCompatParcelizer = gettopsection;
        this.write = courseConfigV2PlanScreenConfig;
        this.RemoteActionCompatParcelizer = new setMCQId(gettopsection, courseConfigV2PlanScreenConfig);
        this.AudioAttributesCompatParcelizer = incrementTotalCount.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getParentId
    public final incrementTotalCount IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void read(incrementTotalCount incrementtotalcount) {
        toMagicModuleMetaRepoModel.write(incrementtotalcount, "");
        this.AudioAttributesCompatParcelizer = incrementtotalcount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getParentId
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public dummyEditor RemoteActionCompatParcelizer(setActiveRecallQbankId.IconCompatParcelizer iconCompatParcelizer, setRatingCount setratingcount) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer, setratingcount);
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static getMagicLine<?> write2(getMagicLine<?> getmagicline) {
        toMagicModuleMetaRepoModel.write(getmagicline, "");
        return getmagicline instanceof getBookmarkLastUpdated ? new hasReferences(((getBookmarkLastUpdated) getmagicline).AudioAttributesCompatParcelizer().byteValue()) : getmagicline instanceof getTotalAnswerCount ? new hasPearls(((getTotalAnswerCount) getmagicline).AudioAttributesCompatParcelizer().shortValue()) : getmagicline instanceof getOption6AnsweredCount ? new isLocked(((getOption6AnsweredCount) getmagicline).AudioAttributesCompatParcelizer().intValue()) : getmagicline instanceof getStatusUpdateStartTimeMs ? new isBookmarked(((getStatusUpdateStartTimeMs) getmagicline).AudioAttributesCompatParcelizer().longValue()) : getmagicline;
    }

    @Override // kotlin.getParentId
    protected final getMasterOrder.AudioAttributesCompatParcelizer write(RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds, List<dummyEditor> list) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return new read(write(revisionSubjectStatusModel), revisionSubjectStatusModel, list, getintrodurationseconds);
    }

    public static final class read extends RemoteActionCompatParcelizer {
        private /* synthetic */ RevisionSubjectStatusModel AudioAttributesCompatParcelizer;
        private /* synthetic */ List<dummyEditor> IconCompatParcelizer;
        private /* synthetic */ getIntroDurationSeconds RemoteActionCompatParcelizer;
        private /* synthetic */ CourseConfigV2CustomModuleQuestionSource read;
        private final HashMap<getRelatedLessonId, getMagicLine<?>> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, RevisionSubjectStatusModel revisionSubjectStatusModel, List<dummyEditor> list, getIntroDurationSeconds getintrodurationseconds) {
            super();
            this.read = courseConfigV2CustomModuleQuestionSource;
            this.AudioAttributesCompatParcelizer = revisionSubjectStatusModel;
            this.IconCompatParcelizer = list;
            this.RemoteActionCompatParcelizer = getintrodurationseconds;
            this.write = new HashMap<>();
        }

        @Override // o.getAssociatedLessons.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getMagicLine<?> getmagicline) {
            toMagicModuleMetaRepoModel.write(getmagicline, "");
            if (getrelatedlessonid != null) {
                this.write.put(getrelatedlessonid, getmagicline);
            }
        }

        @Override // o.getAssociatedLessons.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, ArrayList<getMagicLine<?>> arrayList) {
            toMagicModuleMetaRepoModel.write(arrayList, "");
            if (getrelatedlessonid != null) {
                getMeta getmetaRemoteActionCompatParcelizer = getExpiredOn.RemoteActionCompatParcelizer(getrelatedlessonid, this.read);
                if (getmetaRemoteActionCompatParcelizer != null) {
                    HashMap<getRelatedLessonId, getMagicLine<?>> map = this.write;
                    getOption3AnsweredCount getoption3answeredcount = getOption3AnsweredCount.AudioAttributesCompatParcelizer;
                    List listIconCompatParcelizer = SubjectGroupTypeConstant.IconCompatParcelizer(arrayList);
                    getLink getlinkOnPrepareFromMediaId = getmetaRemoteActionCompatParcelizer.onPrepareFromMediaId();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
                    map.put(getrelatedlessonid, getOption3AnsweredCount.AudioAttributesCompatParcelizer(listIconCompatParcelizer, getlinkOnPrepareFromMediaId));
                    return;
                }
                if (getAssociatedLessons.this.IconCompatParcelizer(this.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getrelatedlessonid.AudioAttributesCompatParcelizer(), (Object) AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof getActiveLessonId) {
                            arrayList2.add(obj);
                        }
                    }
                    List<dummyEditor> list = this.IconCompatParcelizer;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        list.add(((getActiveLessonId) it.next()).AudioAttributesCompatParcelizer());
                    }
                }
            }
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
            if (getAssociatedLessons.this.read(this.AudioAttributesCompatParcelizer, this.write) || getAssociatedLessons.this.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
                return;
            }
            this.IconCompatParcelizer.add(new getDesignation(this.read.aP_(), this.write, this.RemoteActionCompatParcelizer));
        }
    }

    abstract class RemoteActionCompatParcelizer implements getMasterOrder.AudioAttributesCompatParcelizer {
        public abstract void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, ArrayList<getMagicLine<?>> arrayList);

        public abstract void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getMagicLine<?> getmagicline);

        public RemoteActionCompatParcelizer() {
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, Object obj) {
            RemoteActionCompatParcelizer(getrelatedlessonid, getAssociatedLessons.this.write(getrelatedlessonid, obj));
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getChildQuestions getchildquestions) {
            toMagicModuleMetaRepoModel.write(getchildquestions, "");
            RemoteActionCompatParcelizer(getrelatedlessonid, new getOption8AnsweredCount(getchildquestions));
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final void write(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid2) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            toMagicModuleMetaRepoModel.write(getrelatedlessonid2, "");
            RemoteActionCompatParcelizer(getrelatedlessonid, new getMcqType(revisionSubjectStatusModel, getrelatedlessonid2));
        }

        public static final class IconCompatParcelizer implements getMasterOrder.read {
            private final ArrayList<getMagicLine<?>> AudioAttributesCompatParcelizer = new ArrayList<>();
            private /* synthetic */ getAssociatedLessons IconCompatParcelizer;
            private /* synthetic */ RemoteActionCompatParcelizer read;
            private /* synthetic */ getRelatedLessonId write;

            IconCompatParcelizer(getAssociatedLessons getassociatedlessons, getRelatedLessonId getrelatedlessonid, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                this.IconCompatParcelizer = getassociatedlessons;
                this.write = getrelatedlessonid;
                this.read = remoteActionCompatParcelizer;
            }

            @Override // o.getMasterOrder.read
            public final void write(Object obj) {
                this.AudioAttributesCompatParcelizer.add(this.IconCompatParcelizer.write(this.write, obj));
            }

            @Override // o.getMasterOrder.read
            public final void write(RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid) {
                toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
                toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
                this.AudioAttributesCompatParcelizer.add(new getMcqType(revisionSubjectStatusModel, getrelatedlessonid));
            }

            @Override // o.getMasterOrder.read
            public final void AudioAttributesCompatParcelizer(getChildQuestions getchildquestions) {
                toMagicModuleMetaRepoModel.write(getchildquestions, "");
                this.AudioAttributesCompatParcelizer.add(new getOption8AnsweredCount(getchildquestions));
            }

            @Override // o.getMasterOrder.read
            public final getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
                toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
                ArrayList arrayList = new ArrayList();
                getAssociatedLessons getassociatedlessons = this.IconCompatParcelizer;
                getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationseconds, "");
                getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = getassociatedlessons.write(revisionSubjectStatusModel, getintrodurationseconds, arrayList);
                toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerWrite);
                return new C0091RemoteActionCompatParcelizer(audioAttributesCompatParcelizerWrite, this, arrayList);
            }

            /* JADX INFO: renamed from: o.getAssociatedLessons$RemoteActionCompatParcelizer$IconCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
            public static final class C0091RemoteActionCompatParcelizer implements getMasterOrder.AudioAttributesCompatParcelizer {
                private /* synthetic */ getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
                private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;
                private final /* synthetic */ getMasterOrder.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
                private /* synthetic */ ArrayList<dummyEditor> read;

                C0091RemoteActionCompatParcelizer(getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, IconCompatParcelizer iconCompatParcelizer, ArrayList<dummyEditor> arrayList) {
                    this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
                    this.IconCompatParcelizer = iconCompatParcelizer;
                    this.read = arrayList;
                    this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
                }

                @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
                public final void RemoteActionCompatParcelizer() {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer.add(new getActiveLessonId((dummyEditor) IntermediateLoginResponseBody.onCommand((List) this.read)));
                }

                @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
                public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, Object obj) {
                    this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid, obj);
                }

                @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
                public final getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel) {
                    toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
                    return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid, revisionSubjectStatusModel);
                }

                @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
                public final getMasterOrder.read RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
                    return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getrelatedlessonid);
                }

                @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
                public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getChildQuestions getchildquestions) {
                    toMagicModuleMetaRepoModel.write(getchildquestions, "");
                    this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid, getchildquestions);
                }

                @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
                public final void write(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid2) {
                    toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
                    toMagicModuleMetaRepoModel.write(getrelatedlessonid2, "");
                    this.RemoteActionCompatParcelizer.write(getrelatedlessonid, revisionSubjectStatusModel, getrelatedlessonid2);
                }
            }

            @Override // o.getMasterOrder.read
            public final void RemoteActionCompatParcelizer() {
                this.read.AudioAttributesCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer);
            }
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final getMasterOrder.read RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            return new IconCompatParcelizer(getAssociatedLessons.this, getrelatedlessonid, this);
        }

        @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
        public final getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            ArrayList arrayList = new ArrayList();
            getAssociatedLessons getassociatedlessons = getAssociatedLessons.this;
            getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationseconds, "");
            getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = getassociatedlessons.write(revisionSubjectStatusModel, getintrodurationseconds, arrayList);
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerWrite);
            return new write(audioAttributesCompatParcelizerWrite, this, getrelatedlessonid, arrayList);
        }

        public static final class write implements getMasterOrder.AudioAttributesCompatParcelizer {
            private /* synthetic */ RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
            private /* synthetic */ ArrayList<dummyEditor> IconCompatParcelizer;
            private /* synthetic */ getRelatedLessonId RemoteActionCompatParcelizer;
            private /* synthetic */ getMasterOrder.AudioAttributesCompatParcelizer read;
            private final /* synthetic */ getMasterOrder.AudioAttributesCompatParcelizer write;

            write(getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, ArrayList<dummyEditor> arrayList) {
                this.read = audioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = getrelatedlessonid;
                this.IconCompatParcelizer = arrayList;
                this.write = audioAttributesCompatParcelizer;
            }

            @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
            public final void RemoteActionCompatParcelizer() {
                this.read.RemoteActionCompatParcelizer();
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new getActiveLessonId((dummyEditor) IntermediateLoginResponseBody.onCommand((List) this.IconCompatParcelizer)));
            }

            @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
            public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, Object obj) {
                this.write.AudioAttributesCompatParcelizer(getrelatedlessonid, obj);
            }

            @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
            public final getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel) {
                toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
                return this.write.AudioAttributesCompatParcelizer(getrelatedlessonid, revisionSubjectStatusModel);
            }

            @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
            public final getMasterOrder.read RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
                return this.write.RemoteActionCompatParcelizer(getrelatedlessonid);
            }

            @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
            public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getChildQuestions getchildquestions) {
                toMagicModuleMetaRepoModel.write(getchildquestions, "");
                this.write.AudioAttributesCompatParcelizer(getrelatedlessonid, getchildquestions);
            }

            @Override // o.getMasterOrder.AudioAttributesCompatParcelizer
            public final void write(getRelatedLessonId getrelatedlessonid, RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid2) {
                toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
                toMagicModuleMetaRepoModel.write(getrelatedlessonid2, "");
                this.write.write(getrelatedlessonid, revisionSubjectStatusModel, getrelatedlessonid2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getMagicLine<?> write(getRelatedLessonId getrelatedlessonid, Object obj) {
        getMagicLine<?> getmagiclineWrite = getOption3AnsweredCount.AudioAttributesCompatParcelizer.write(obj, this.IconCompatParcelizer);
        if (getmagiclineWrite != null) {
            return getmagiclineWrite;
        }
        getOption1AnsweredCount.read readVar = getOption1AnsweredCount.IconCompatParcelizer;
        return getOption1AnsweredCount.read.read("Unsupported annotation argument: ".concat(String.valueOf(getrelatedlessonid)));
    }

    private final CourseConfigV2CustomModuleQuestionSource write(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        return CourseConfigV2NavDrawerItemReportPiracy.IconCompatParcelizer(this.IconCompatParcelizer, revisionSubjectStatusModel, this.write);
    }
}
