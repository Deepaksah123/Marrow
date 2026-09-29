package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2BottomTabItem implements getDocSideType {
    private static final getRelatedLessonId RemoteActionCompatParcelizer;
    private static final RevisionSubjectStatusModel read;
    private final PageValue AudioAttributesImplApi26Parcelizer;
    private final getTopSection MediaBrowserCompatCustomActionResultReceiver;
    private final getAnswerMap<getTopSection, getVariant> MediaBrowserCompatItemReceiver;
    private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(CourseConfigV2BottomTabItem.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(0);
    private static final getNotesCount write = getZenArea.IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private CourseConfigV2BottomTabItem(getMini getmini, getTopSection gettopsection, getAnswerMap<? super getTopSection, ? extends getVariant> getanswermap) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.MediaBrowserCompatCustomActionResultReceiver = gettopsection;
        this.MediaBrowserCompatItemReceiver = getanswermap;
        this.AudioAttributesImplApi26Parcelizer = getmini.read(new read(getmini));
    }

    /* JADX INFO: renamed from: o.CourseConfigV2BottomTabItem$4, reason: invalid class name */
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<getTopSection, getQBankGroupMeta> {
        public static final AnonymousClass4 read = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getQBankGroupMeta invoke(getTopSection gettopsection) {
            return write(gettopsection);
        }

        private static getQBankGroupMeta write(getTopSection gettopsection) {
            toMagicModuleMetaRepoModel.write(gettopsection, "");
            List<getShouldShowEmptyPlanScreen> listWrite = gettopsection.RemoteActionCompatParcelizer(CourseConfigV2BottomTabItem.write).write();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listWrite) {
                if (obj instanceof getQBankGroupMeta) {
                    arrayList.add(obj);
                }
            }
            return (getQBankGroupMeta) IntermediateLoginResponseBody.RatingCompat((List) arrayList);
        }

        AnonymousClass4() {
            super(1);
        }
    }

    public /* synthetic */ CourseConfigV2BottomTabItem(getMini getmini, getTopSection gettopsection) {
        this(getmini, gettopsection, AnonymousClass4.read);
    }

    static {
        getRelatedLessonId getrelatedlessonidAudioAttributesImplApi26Parcelizer = getZenArea.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesImplApi26Parcelizer, "");
        RemoteActionCompatParcelizer = getrelatedlessonidAudioAttributesImplApi26Parcelizer;
        RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
        read = revisionSubjectStatusModelRemoteActionCompatParcelizer;
    }

    private final getBundle IconCompatParcelizer() {
        return (getBundle) Pearl.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, AudioAttributesCompatParcelizer[0]);
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<getBundle> {
        private /* synthetic */ getMini AudioAttributesCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getBundle invoke() {
            getBundle getbundle = new getBundle((getVariant) CourseConfigV2BottomTabItem.this.MediaBrowserCompatItemReceiver.invoke(CourseConfigV2BottomTabItem.this.MediaBrowserCompatCustomActionResultReceiver), CourseConfigV2BottomTabItem.RemoteActionCompatParcelizer, CourseConfigV2NavDrawerItems.ABSTRACT, getQuestionSource.INTERFACE, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(CourseConfigV2BottomTabItem.this.MediaBrowserCompatCustomActionResultReceiver.write().write()), getIntroDurationSeconds.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer);
            getbundle.read(new getSubjectIds(this.AudioAttributesCompatParcelizer, getbundle), getKycMessage.read(), null);
            return getbundle;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(getMini getmini) {
            super(0);
            this.AudioAttributesCompatParcelizer = getmini;
        }
    }

    @Override // kotlin.getDocSideType
    public final boolean AudioAttributesCompatParcelizer(getNotesCount getnotescount, getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getrelatedlessonid, RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescount, write);
    }

    @Override // kotlin.getDocSideType
    public final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(revisionSubjectStatusModel, read)) {
            return IconCompatParcelizer();
        }
        return null;
    }

    @Override // kotlin.getDocSideType
    public final Collection<CourseConfigV2CustomModuleQuestionSource> write(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescount, write) ? getKycMessage.read(IconCompatParcelizer()) : getKycMessage.read();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public static RevisionSubjectStatusModel write() {
            return CourseConfigV2BottomTabItem.read;
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }
}
