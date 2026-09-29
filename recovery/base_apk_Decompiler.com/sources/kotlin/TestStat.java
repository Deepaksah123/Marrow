package kotlin;

import kotlin.CurrentQuery;
import kotlin.MagicModuleUseCaseImplWhenMappings;

/* JADX INFO: loaded from: classes4.dex */
public final class TestStat {
    public static final CurrentQuery read(TopUserCompanion topUserCompanion, CurrentQuery currentQuery) {
        CurrentQuery currentQueryWrite = write(topUserCompanion.getIconCompatParcelizer(), currentQuery, true);
        CurrentQuery currentQueryPlus = getCollegeId.IconCompatParcelizer() ? currentQueryWrite.plus(new TopUser(getCollegeId.read().incrementAndGet())) : currentQueryWrite;
        return (currentQueryWrite == setMbbsVerificationYear.IconCompatParcelizer() || currentQueryWrite.get(getPlaybackInterval.INSTANCE) != null) ? currentQueryPlus : currentQueryPlus.plus(setMbbsVerificationYear.IconCompatParcelizer());
    }

    public static final CurrentQuery IconCompatParcelizer(CurrentQuery currentQuery, CurrentQuery currentQuery2) {
        return !IconCompatParcelizer(currentQuery2) ? currentQuery.plus(currentQuery2) : write(currentQuery, currentQuery2, false);
    }

    private static final boolean IconCompatParcelizer(CurrentQuery currentQuery) {
        return ((Boolean) currentQuery.fold(Boolean.FALSE, new MagicModuleSubmissionRequestBody() { // from class: o.getActiveDeviceId
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(TestStat.write(((Boolean) obj).booleanValue(), (CurrentQuery.write) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(boolean z, CurrentQuery.write writeVar) {
        return z || (writeVar instanceof TestRecommendationItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    private static final CurrentQuery write(CurrentQuery currentQuery, CurrentQuery currentQuery2, final boolean z) {
        boolean zIconCompatParcelizer = IconCompatParcelizer(currentQuery);
        boolean zIconCompatParcelizer2 = IconCompatParcelizer(currentQuery2);
        if (!zIconCompatParcelizer && !zIconCompatParcelizer2) {
            return currentQuery.plus(currentQuery2);
        }
        final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        writeVar.write = currentQuery2;
        CurrentQuery currentQuery3 = (CurrentQuery) currentQuery.fold(VideoSessionResponseBody.RemoteActionCompatParcelizer, new MagicModuleSubmissionRequestBody() { // from class: o.getInstructions
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestStat.write(writeVar, z, (CurrentQuery) obj, (CurrentQuery.write) obj2);
            }
        });
        if (zIconCompatParcelizer2) {
            writeVar.write = ((CurrentQuery) writeVar.write).fold(VideoSessionResponseBody.RemoteActionCompatParcelizer, new MagicModuleSubmissionRequestBody() { // from class: o.TestStatusResponse
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestStat.read((CurrentQuery) obj, (CurrentQuery.write) obj2);
                }
            });
        }
        return currentQuery3.plus((CurrentQuery) writeVar.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, o.CurrentQuery] */
    public static final CurrentQuery write(MagicModuleUseCaseImplWhenMappings.write writeVar, boolean z, CurrentQuery currentQuery, CurrentQuery.write writeVar2) {
        if (!(writeVar2 instanceof TestRecommendationItem)) {
            return currentQuery.plus(writeVar2);
        }
        if (((CurrentQuery) writeVar.write).get(writeVar2.getKey()) == null) {
            return currentQuery.plus(z ? ((TestRecommendationItem) writeVar2).read() : (TestRecommendationItem) writeVar2);
        }
        writeVar.write = ((CurrentQuery) writeVar.write).minusKey(writeVar2.getKey());
        return currentQuery.plus(((TestRecommendationItem) writeVar2).RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurrentQuery read(CurrentQuery currentQuery, CurrentQuery.write writeVar) {
        if (writeVar instanceof TestRecommendationItem) {
            return currentQuery.plus(((TestRecommendationItem) writeVar).read());
        }
        return currentQuery.plus(writeVar);
    }

    public static final NestfgetmNationalNumber<?> read(SampleVideos<?> sampleVideos, CurrentQuery currentQuery, Object obj) {
        if (!(sampleVideos instanceof getNextQuery) || currentQuery.get(NestfputmNationalNumber.INSTANCE) == null) {
            return null;
        }
        NestfgetmNationalNumber<?> nestfgetmNationalNumberAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((getNextQuery) sampleVideos);
        if (nestfgetmNationalNumberAudioAttributesCompatParcelizer != null) {
            nestfgetmNationalNumberAudioAttributesCompatParcelizer.write(currentQuery, obj);
        }
        return nestfgetmNationalNumberAudioAttributesCompatParcelizer;
    }

    private static NestfgetmNationalNumber<?> AudioAttributesCompatParcelizer(getNextQuery getnextquery) {
        while (!(getnextquery instanceof setCollegeId) && (getnextquery = getnextquery.getCallerFrame()) != null) {
            if (getnextquery instanceof NestfgetmNationalNumber) {
                return (NestfgetmNationalNumber) getnextquery;
            }
        }
        return null;
    }

    public static final String read(CurrentQuery currentQuery) {
        TopUser topUser;
        String write;
        if (!getCollegeId.IconCompatParcelizer() || (topUser = (TopUser) currentQuery.get(TopUser.INSTANCE)) == null) {
            return null;
        }
        isScoreStatsAvailable isscorestatsavailable = (isScoreStatsAvailable) currentQuery.get(isScoreStatsAvailable.INSTANCE);
        if (isscorestatsavailable == null || (write = isscorestatsavailable.getWrite()) == null) {
            write = "coroutine";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(write);
        sb.append('#');
        sb.append(topUser.getRead());
        return sb.toString();
    }
}
