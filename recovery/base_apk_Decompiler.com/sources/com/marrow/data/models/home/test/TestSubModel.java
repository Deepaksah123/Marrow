package com.marrow.data.models.home.test;

import com.marrow.data.models.test.TestIndex;
import java.util.Arrays;
import java.util.Locale;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.getMagicModuleMeta;
import kotlin.parseDolbyChannelConfiguration;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001b\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/marrow/data/models/home/test/TestSubModel;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lcom/marrow/data/models/test/TestIndex;", "p0", "", "load", "(Lcom/marrow/data/models/test/TestIndex;)V", "", "isPaid", "Z", "", "status", "I", "isResultAvailable", "testType", "Ljava/lang/String;", "", "resultTimeStamp", "J", "expiryTimeStamp", "startTimeStamp", "questionCount", "duration", "availabilityType", "userStartedTime", "hasAccess", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestSubModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SEPERATOR = ",";
    public int availabilityType;
    public int duration;
    public long expiryTimeStamp;
    public boolean hasAccess;
    public boolean isPaid;
    public boolean isResultAvailable;
    public int questionCount;
    public long resultTimeStamp;
    public long startTimeStamp;
    public int status;
    public String testType = "";
    public long userStartedTime;

    public final String toString() {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        Locale locale = Locale.getDefault();
        boolean z = this.isPaid;
        boolean z2 = this.isResultAvailable;
        long j = this.resultTimeStamp;
        long j2 = this.expiryTimeStamp;
        String str = String.format(locale, "%d %s %d %s %d %s %d %s %s %s %d %s %d %s %d %s %d %s %d %s %d %s %d", Arrays.copyOf(new Object[]{Integer.valueOf(z ? 1 : 0), SEPERATOR, Integer.valueOf(z2 ? 1 : 0), SEPERATOR, Long.valueOf(j), SEPERATOR, Long.valueOf(j2), SEPERATOR, this.testType, SEPERATOR, Integer.valueOf(this.status), SEPERATOR, Integer.valueOf(this.hasAccess ? 1 : 0), SEPERATOR, Long.valueOf(this.startTimeStamp), SEPERATOR, Integer.valueOf(this.questionCount), SEPERATOR, Integer.valueOf(this.duration), SEPERATOR, Integer.valueOf(this.availabilityType), SEPERATOR, Long.valueOf(this.userStartedTime)}, 23));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public final void load(TestIndex p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.isPaid = p0.isPaid();
        this.status = p0.getStatus();
        this.isResultAvailable = p0.isReviewAvailable();
        String testType = p0.getTestType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
        this.testType = testType;
        this.resultTimeStamp = p0.getEndTimestamp();
        this.expiryTimeStamp = p0.getEndTimestamp();
        this.startTimeStamp = p0.getStartTimestamp();
        this.questionCount = p0.getMcqCount();
        this.duration = p0.getDuration();
        this.availabilityType = p0.getAvailabilityType();
        this.userStartedTime = p0.getUserStartedTimestamp();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/home/test/TestSubModel$Companion;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/models/home/test/TestSubModel;", "extract", "(Ljava/lang/String;)Lcom/marrow/data/models/home/test/TestSubModel;", "SEPERATOR", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final TestSubModel extract(String p0) {
            TestSubModel testSubModel = new TestSubModel();
            if (p0 != null) {
                String[] strArr = (String[]) TestGroupLSModel.write(p0, new String[]{TestSubModel.SEPERATOR}, 0, 6).toArray(new String[0]);
                if (strArr.length == 12) {
                    testSubModel.isPaid = parseDolbyChannelConfiguration.IconCompatParcelizer(strArr[0], false);
                    testSubModel.isResultAvailable = parseDolbyChannelConfiguration.IconCompatParcelizer(strArr[1], false);
                    testSubModel.resultTimeStamp = parseDolbyChannelConfiguration.AudioAttributesImplApi21Parcelizer(strArr[2]);
                    testSubModel.expiryTimeStamp = parseDolbyChannelConfiguration.AudioAttributesImplApi21Parcelizer(strArr[3]);
                    String strAudioAttributesImplApi26Parcelizer = parseDolbyChannelConfiguration.AudioAttributesImplApi26Parcelizer(strArr[4]);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesImplApi26Parcelizer, "");
                    testSubModel.testType = strAudioAttributesImplApi26Parcelizer;
                    testSubModel.status = parseDolbyChannelConfiguration.write(strArr[5]);
                    testSubModel.hasAccess = parseDolbyChannelConfiguration.IconCompatParcelizer(strArr[6], false);
                    testSubModel.startTimeStamp = parseDolbyChannelConfiguration.AudioAttributesImplApi21Parcelizer(strArr[7]);
                    testSubModel.questionCount = parseDolbyChannelConfiguration.write(strArr[8]);
                    testSubModel.duration = parseDolbyChannelConfiguration.write(strArr[9]);
                    testSubModel.availabilityType = parseDolbyChannelConfiguration.write(strArr[10]);
                    testSubModel.userStartedTime = parseDolbyChannelConfiguration.AudioAttributesImplApi21Parcelizer(strArr[11]);
                }
            }
            return testSubModel;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final TestSubModel extract(String str) {
        return INSTANCE.extract(str);
    }
}
