package kotlin;

import java.util.Arrays;
import java.util.Collection;
import kotlin.getVideoUpdatedTime;

/* JADX INFO: loaded from: classes4.dex */
public final class getSuggestedSubjects {
    private final getRelatedLessonId AudioAttributesCompatParcelizer;
    private final newYearNameItem IconCompatParcelizer;
    private final getQbankUpdatedTime[] RemoteActionCompatParcelizer;
    private final getAnswerMap<CourseConfigV2NavDrawerItemRateUs, String> read;
    private final Collection<getRelatedLessonId> write;

    /* JADX WARN: Multi-variable type inference failed */
    private getSuggestedSubjects(getRelatedLessonId getrelatedlessonid, newYearNameItem newyearnameitem, Collection<getRelatedLessonId> collection, getAnswerMap<? super CourseConfigV2NavDrawerItemRateUs, String> getanswermap, getQbankUpdatedTime... getqbankupdatedtimeArr) {
        this.AudioAttributesCompatParcelizer = getrelatedlessonid;
        this.IconCompatParcelizer = newyearnameitem;
        this.write = collection;
        this.read = getanswermap;
        this.RemoteActionCompatParcelizer = getqbankupdatedtimeArr;
    }

    public final boolean IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        if (this.AudioAttributesCompatParcelizer != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs.aQ_(), this.AudioAttributesCompatParcelizer)) {
            return false;
        }
        if (this.IconCompatParcelizer != null) {
            String strAudioAttributesCompatParcelizer = courseConfigV2NavDrawerItemRateUs.aQ_().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            if (!this.IconCompatParcelizer.write(strAudioAttributesCompatParcelizer)) {
                return false;
            }
        }
        Collection<getRelatedLessonId> collection = this.write;
        return collection == null || collection.contains(courseConfigV2NavDrawerItemRateUs.aQ_());
    }

    public final getVideoUpdatedTime read(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        for (getQbankUpdatedTime getqbankupdatedtime : this.RemoteActionCompatParcelizer) {
            String strIconCompatParcelizer = getqbankupdatedtime.IconCompatParcelizer(courseConfigV2NavDrawerItemRateUs);
            if (strIconCompatParcelizer != null) {
                return new getVideoUpdatedTime.write(strIconCompatParcelizer);
            }
        }
        String strInvoke = this.read.invoke(courseConfigV2NavDrawerItemRateUs);
        if (strInvoke != null) {
            return new getVideoUpdatedTime.write(strInvoke);
        }
        return getVideoUpdatedTime.read.read;
    }

    /* JADX INFO: renamed from: o.getSuggestedSubjects$1, reason: invalid class name */
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap {
        public static final AnonymousClass1 write = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return RemoteActionCompatParcelizer((CourseConfigV2NavDrawerItemRateUs) obj);
        }

        AnonymousClass1() {
            super(1);
        }

        private static Void RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return null;
        }
    }

    public /* synthetic */ getSuggestedSubjects(getRelatedLessonId getrelatedlessonid, getQbankUpdatedTime[] getqbankupdatedtimeArr) {
        this(getrelatedlessonid, getqbankupdatedtimeArr, AnonymousClass1.write);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getSuggestedSubjects(getRelatedLessonId getrelatedlessonid, getQbankUpdatedTime[] getqbankupdatedtimeArr, getAnswerMap<? super CourseConfigV2NavDrawerItemRateUs, String> getanswermap) {
        this(getrelatedlessonid, null, null, getanswermap, (getQbankUpdatedTime[]) Arrays.copyOf(getqbankupdatedtimeArr, getqbankupdatedtimeArr.length));
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(getqbankupdatedtimeArr, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
    }

    /* JADX INFO: renamed from: o.getSuggestedSubjects$3, reason: invalid class name */
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap {
        public static final AnonymousClass3 AudioAttributesCompatParcelizer = new AnonymousClass3();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return IconCompatParcelizer((CourseConfigV2NavDrawerItemRateUs) obj);
        }

        AnonymousClass3() {
            super(1);
        }

        private static Void IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return null;
        }
    }

    public /* synthetic */ getSuggestedSubjects(newYearNameItem newyearnameitem, getQbankUpdatedTime[] getqbankupdatedtimeArr) {
        this(newyearnameitem, getqbankupdatedtimeArr, AnonymousClass3.AudioAttributesCompatParcelizer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private getSuggestedSubjects(newYearNameItem newyearnameitem, getQbankUpdatedTime[] getqbankupdatedtimeArr, getAnswerMap<? super CourseConfigV2NavDrawerItemRateUs, String> getanswermap) {
        this(null, newyearnameitem, null, getanswermap, (getQbankUpdatedTime[]) Arrays.copyOf(getqbankupdatedtimeArr, getqbankupdatedtimeArr.length));
        toMagicModuleMetaRepoModel.write(newyearnameitem, "");
        toMagicModuleMetaRepoModel.write(getqbankupdatedtimeArr, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
    }

    /* JADX INFO: renamed from: o.getSuggestedSubjects$2, reason: invalid class name */
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap {
        public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return RemoteActionCompatParcelizer((CourseConfigV2NavDrawerItemRateUs) obj);
        }

        AnonymousClass2() {
            super(1);
        }

        private static Void RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return null;
        }
    }

    public /* synthetic */ getSuggestedSubjects(Collection collection, getQbankUpdatedTime[] getqbankupdatedtimeArr) {
        this((Collection<getRelatedLessonId>) collection, getqbankupdatedtimeArr, AnonymousClass2.AudioAttributesCompatParcelizer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getSuggestedSubjects(Collection<getRelatedLessonId> collection, getQbankUpdatedTime[] getqbankupdatedtimeArr, getAnswerMap<? super CourseConfigV2NavDrawerItemRateUs, String> getanswermap) {
        this(null, null, collection, getanswermap, (getQbankUpdatedTime[]) Arrays.copyOf(getqbankupdatedtimeArr, getqbankupdatedtimeArr.length));
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(getqbankupdatedtimeArr, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
    }
}
