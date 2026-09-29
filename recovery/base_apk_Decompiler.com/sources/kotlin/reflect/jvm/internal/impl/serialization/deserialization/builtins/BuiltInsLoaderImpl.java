package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.CourseConfigV2PlanScreenConfig;
import kotlin.CourseConfigV2PracticalItems;
import kotlin.CourseConfigV2QBankGroupItem;
import kotlin.FilterItemRecord;
import kotlin.ImageUpload;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepoModelsKt;
import kotlin.McqAnswerIndex;
import kotlin.McqPearlInfo;
import kotlin.McqTimerAnalyticsModel;
import kotlin.SchemaDetailKt;
import kotlin.getAnswerMap;
import kotlin.getChangeAnswerTime;
import kotlin.getCourseIdInt;
import kotlin.getDocSideType;
import kotlin.getFirstAttemptTime;
import kotlin.getHasBeenAnswered;
import kotlin.getMini;
import kotlin.getMyAnswer;
import kotlin.getNotesCount;
import kotlin.getPearlId;
import kotlin.getTopSection;
import kotlin.getZenArea;
import kotlin.isAuthError;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.setEncryptKey;
import kotlin.setOption7AnsweredCount;
import kotlin.setParentType;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    private final SchemaDetailKt AudioAttributesCompatParcelizer = new SchemaDetailKt();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public final CourseConfigV2PracticalItems createPackageFragmentProvider(getMini getmini, getTopSection gettopsection, Iterable<? extends getDocSideType> iterable, ImageUpload imageUpload, getCourseIdInt getcourseidint, boolean z) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(imageUpload, "");
        toMagicModuleMetaRepoModel.write(getcourseidint, "");
        return createBuiltInPackageFragmentProvider(getmini, gettopsection, getZenArea.write, iterable, imageUpload, getcourseidint, z, new read(this.AudioAttributesCompatParcelizer));
    }

    final /* synthetic */ class read extends MagicModuleRepoModelsKt implements getAnswerMap<String, InputStream> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public InputStream invoke(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return ((SchemaDetailKt) this.AudioAttributesImplApi26Parcelizer).read(str);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "loadResource";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(SchemaDetailKt.class);
        }

        read(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    public final CourseConfigV2PracticalItems createBuiltInPackageFragmentProvider(getMini getmini, getTopSection gettopsection, Set<getNotesCount> set, Iterable<? extends getDocSideType> iterable, ImageUpload imageUpload, getCourseIdInt getcourseidint, boolean z, getAnswerMap<? super String, ? extends InputStream> getanswermap) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(set, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(imageUpload, "");
        toMagicModuleMetaRepoModel.write(getcourseidint, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        Set<getNotesCount> set2 = set;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(set2, 10));
        for (getNotesCount getnotescount : set2) {
            String strWrite = McqAnswerIndex.read.write(getnotescount);
            InputStream inputStreamInvoke = getanswermap.invoke(strWrite);
            if (inputStreamInvoke == null) {
                throw new IllegalStateException("Resource not found in classpath: ".concat(String.valueOf(strWrite)));
            }
            getMyAnswer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getMyAnswer.RemoteActionCompatParcelizer;
            arrayList.add(getMyAnswer.RemoteActionCompatParcelizer.IconCompatParcelizer(getnotescount, getmini, gettopsection, inputStreamInvoke, z));
        }
        ArrayList arrayList2 = arrayList;
        CourseConfigV2QBankGroupItem courseConfigV2QBankGroupItem = new CourseConfigV2QBankGroupItem(arrayList2);
        CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig = new CourseConfigV2PlanScreenConfig(getmini, gettopsection);
        McqPearlInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = McqPearlInfo.AudioAttributesCompatParcelizer.IconCompatParcelizer;
        CourseConfigV2QBankGroupItem courseConfigV2QBankGroupItem2 = courseConfigV2QBankGroupItem;
        getHasBeenAnswered gethasbeenanswered = new getHasBeenAnswered(courseConfigV2QBankGroupItem2);
        setParentType setparenttype = new setParentType(gettopsection, courseConfigV2PlanScreenConfig, McqAnswerIndex.read);
        FilterItemRecord.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = FilterItemRecord.AudioAttributesCompatParcelizer.write;
        getFirstAttemptTime getfirstattempttime = getFirstAttemptTime.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getfirstattempttime, "");
        setEncryptKey.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = setEncryptKey.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        getChangeAnswerTime.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = getChangeAnswerTime.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        McqTimerAnalyticsModel.write writeVar = McqTimerAnalyticsModel.write;
        getPearlId getpearlid = new getPearlId(getmini, gettopsection, audioAttributesCompatParcelizer, gethasbeenanswered, setparenttype, courseConfigV2QBankGroupItem2, audioAttributesCompatParcelizer2, getfirstattempttime, remoteActionCompatParcelizer2, remoteActionCompatParcelizer3, iterable, courseConfigV2PlanScreenConfig, McqTimerAnalyticsModel.write.IconCompatParcelizer(), getcourseidint, imageUpload, McqAnswerIndex.read.RemoteActionCompatParcelizer(), null, new setOption7AnsweredCount(getmini, IntermediateLoginResponseBody.RemoteActionCompatParcelizer()), null, null, 851968);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((getMyAnswer) it.next()).read(getpearlid);
        }
        return courseConfigV2QBankGroupItem2;
    }
}
