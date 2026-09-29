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
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/marrow2/ui/test/testplay/worker/TestSubmitWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "Lo/crc32;", "p2", "Lo/handleMidrowCtrl;", "p3", "Lo/getPlatform;", "p4", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lo/crc32;Lo/handleMidrowCtrl;Lo/getPlatform;)V", "Lo/j$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "Landroidx/work/WorkerParameters;", "write", "Lo/crc32;", "Lo/handleMidrowCtrl;", "read", "Lo/getPlatform;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestSubmitWorker extends CoroutineWorker {
    private final WorkerParameters AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final handleMidrowCtrl write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getPlatform IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final crc32 RemoteActionCompatParcelizer;

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return TestSubmitWorker.this.IconCompatParcelizer(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestSubmitWorker(Context context, WorkerParameters workerParameters, crc32 crc32Var, handleMidrowCtrl handlemidrowctrl, getPlatform getplatform) {
        super(context, workerParameters);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(handlemidrowctrl, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.AudioAttributesCompatParcelizer = workerParameters;
        this.RemoteActionCompatParcelizer = crc32Var;
        this.write = handlemidrowctrl;
        this.IconCompatParcelizer = getplatform;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer>, Object> {
        private Object RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    String str2 = TestSubmitWorker.this.MediaBrowserCompatItemReceiver().read("testId");
                    if (str2 == null) {
                        return j.RemoteActionCompatParcelizer.write();
                    }
                    this.RemoteActionCompatParcelizer = str2;
                    this.read = 1;
                    Object obj2 = TestSubmitWorker.this.RemoteActionCompatParcelizer.read(str2, this);
                    if (obj2 == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    str = str2;
                    obj = obj2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.RemoteActionCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                TestIndex testIndex = (TestIndex) obj;
                if (testIndex.getStatus() == 2) {
                    return j.RemoteActionCompatParcelizer.write();
                }
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str3 = String.format("Submit %s now.", Arrays.copyOf(new Object[]{testIndex.getTitle()}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                String str4 = buildRoleString.read;
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append("Time's up!");
                TestSubmitWorker.this.RemoteActionCompatParcelizer(sb.toString(), str3, str);
                return j.RemoteActionCompatParcelizer.read();
            } catch (Throwable unused) {
                return j.RemoteActionCompatParcelizer.write();
            }
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return TestSubmitWorker.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
            boolean r0 = r6 instanceof com.marrow2.ui.test.testplay.worker.TestSubmitWorker.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.test.testplay.worker.TestSubmitWorker$RemoteActionCompatParcelizer r0 = (com.marrow2.ui.test.testplay.worker.TestSubmitWorker.RemoteActionCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.test.testplay.worker.TestSubmitWorker$RemoteActionCompatParcelizer r0 = new com.marrow2.ui.test.testplay.worker.TestSubmitWorker$RemoteActionCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
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
            com.marrow2.ui.test.testplay.worker.TestSubmitWorker$AudioAttributesCompatParcelizer r2 = new com.marrow2.ui.test.testplay.worker.TestSubmitWorker$AudioAttributesCompatParcelizer
            r4 = 0
            r2.<init>(r4)
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r6, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.worker.TestSubmitWorker.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0, String p1, String p2) {
        this.write.write(p0, p1, "test", p2);
    }
}
