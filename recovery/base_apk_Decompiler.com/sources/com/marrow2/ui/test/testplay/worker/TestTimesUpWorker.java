package com.marrow2.ui.test.testplay.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.marrow.data.models.test.TestIndex;
import java.util.Arrays;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.buildRoleString;
import kotlin.crc32;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.handleMidrowCtrl;
import kotlin.j;
import kotlin.parseEac3SupplementalProperties;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/marrow2/ui/test/testplay/worker/TestTimesUpWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "testUseCase", "Lcom/marrow2/domain/test/TestUseCase;", "notificationHelper", "Lcom/marrow/notification/INotificationHelper;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/marrow2/domain/test/TestUseCase;Lcom/marrow/notification/INotificationHelper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestRemainingTime", "", "test", "Lcom/marrow/data/models/test/TestIndex;", "Lcom/marrow2/domain/test/model/TestIndexUCModel;", "createNotification", "", "title", "", "message", "contentId", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestTimesUpWorker extends CoroutineWorker {
    private final crc32 AudioAttributesCompatParcelizer;
    private final getPlatform IconCompatParcelizer;
    private final WorkerParameters read;
    private final handleMidrowCtrl write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return TestTimesUpWorker.this.IconCompatParcelizer(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestTimesUpWorker(Context context, WorkerParameters workerParameters, crc32 crc32Var, handleMidrowCtrl handlemidrowctrl, getPlatform getplatform) {
        super(context, workerParameters);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(handlemidrowctrl, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = workerParameters;
        this.AudioAttributesCompatParcelizer = crc32Var;
        this.write = handlemidrowctrl;
        this.IconCompatParcelizer = getplatform;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer>, Object> {
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    String str2 = TestTimesUpWorker.this.MediaBrowserCompatItemReceiver().read("testId");
                    if (str2 == null) {
                        return j.RemoteActionCompatParcelizer.write();
                    }
                    this.write = str2;
                    this.read = 1;
                    Object obj2 = TestTimesUpWorker.this.AudioAttributesCompatParcelizer.read(str2, this);
                    if (obj2 == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    str = str2;
                    obj = obj2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.write;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                TestIndex testIndex = (TestIndex) obj;
                if (testIndex.getStatus() == 2) {
                    return j.RemoteActionCompatParcelizer.write();
                }
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str3 = String.format("Continue %s now", Arrays.copyOf(new Object[]{testIndex.getTitle()}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                String str4 = buildRoleString.read;
                String strAudioAttributesImplApi26Parcelizer = parseEac3SupplementalProperties.AudioAttributesImplApi26Parcelizer(TestTimesUpWorker.RemoteActionCompatParcelizer(testIndex));
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(strAudioAttributesImplApi26Parcelizer);
                TestTimesUpWorker.this.IconCompatParcelizer(sb.toString(), str3, str);
                return j.RemoteActionCompatParcelizer.read();
            } catch (Throwable unused) {
                return j.RemoteActionCompatParcelizer.write();
            }
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return TestTimesUpWorker.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super o.j.RemoteActionCompatParcelizer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.test.testplay.worker.TestTimesUpWorker.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.test.testplay.worker.TestTimesUpWorker$AudioAttributesCompatParcelizer r0 = (com.marrow2.ui.test.testplay.worker.TestTimesUpWorker.AudioAttributesCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            com.marrow2.ui.test.testplay.worker.TestTimesUpWorker$AudioAttributesCompatParcelizer r0 = new com.marrow2.ui.test.testplay.worker.TestTimesUpWorker$AudioAttributesCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4a
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getPlatform r6 = r5.IconCompatParcelizer
            o.CurrentQuery r6 = (kotlin.CurrentQuery) r6
            com.marrow2.ui.test.testplay.worker.TestTimesUpWorker$IconCompatParcelizer r2 = new com.marrow2.ui.test.testplay.worker.TestTimesUpWorker$IconCompatParcelizer
            r4 = 0
            r2.<init>(r4)
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
            r0.write = r3
            java.lang.Object r6 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r6, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.worker.TestTimesUpWorker.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long RemoteActionCompatParcelizer(TestIndex testIndex) {
        return testIndex.getTentativeEndTimestampMs() - System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String str, String str2, String str3) {
        this.write.write(str, str2, "test", str3);
    }
}
