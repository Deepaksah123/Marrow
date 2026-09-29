package com.marrow2.ui.home.worker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.handleMidrowCtrl;
import kotlin.j;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.zadb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018"}, d2 = {"Lcom/marrow2/ui/home/worker/NotifyVideoSubmitWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "Lo/handleMidrowCtrl;", "p2", "Lo/getPlatform;", "p3", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lo/handleMidrowCtrl;Lo/getPlatform;)V", "Lo/j$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "Landroid/content/Intent;", "", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V", "RemoteActionCompatParcelizer", "Landroidx/work/WorkerParameters;", "read", "write", "Lo/handleMidrowCtrl;", "Lo/getPlatform;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotifyVideoSubmitWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final WorkerParameters read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getPlatform write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final handleMidrowCtrl IconCompatParcelizer;

    static final class write extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return NotifyVideoSubmitWorker.this.IconCompatParcelizer(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyVideoSubmitWorker(Context context, WorkerParameters workerParameters, handleMidrowCtrl handlemidrowctrl, getPlatform getplatform) {
        super(context, workerParameters);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
        toMagicModuleMetaRepoModel.write(handlemidrowctrl, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = workerParameters;
        this.IconCompatParcelizer = handlemidrowctrl;
        this.write = getplatform;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Intent intentWrite;
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            try {
                String str = NotifyVideoSubmitWorker.this.MediaBrowserCompatItemReceiver().read("contentId");
                if (str == null) {
                    return j.RemoteActionCompatParcelizer.write();
                }
                String str2 = NotifyVideoSubmitWorker.this.MediaBrowserCompatItemReceiver().read("contentTitle");
                if (str2 == null) {
                    return j.RemoteActionCompatParcelizer.write();
                }
                String str3 = NotifyVideoSubmitWorker.this.MediaBrowserCompatItemReceiver().read("contentDescription");
                if (str3 == null) {
                    return j.RemoteActionCompatParcelizer.write();
                }
                if (str.length() > 0) {
                    intentWrite = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    toMagicModuleMetaRepoModel.write(intentWrite.putExtra("force_fullscreen", true));
                } else {
                    zadb.Companion companion = zadb.INSTANCE;
                    Context contextIconCompatParcelizer = NotifyVideoSubmitWorker.this.IconCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextIconCompatParcelizer, "");
                    intentWrite = zadb.Companion.write(contextIconCompatParcelizer);
                }
                NotifyVideoSubmitWorker.this.IconCompatParcelizer(str2, str3, intentWrite);
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
            return NotifyVideoSubmitWorker.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
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
            boolean r0 = r6 instanceof com.marrow2.ui.home.worker.NotifyVideoSubmitWorker.write
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.home.worker.NotifyVideoSubmitWorker$write r0 = (com.marrow2.ui.home.worker.NotifyVideoSubmitWorker.write) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.AudioAttributesCompatParcelizer
            int r6 = r6 + r2
            r0.AudioAttributesCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.home.worker.NotifyVideoSubmitWorker$write r0 = new com.marrow2.ui.home.worker.NotifyVideoSubmitWorker$write
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
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
            o.getPlatform r6 = r5.write
            o.CurrentQuery r6 = (kotlin.CurrentQuery) r6
            com.marrow2.ui.home.worker.NotifyVideoSubmitWorker$IconCompatParcelizer r2 = new com.marrow2.ui.home.worker.NotifyVideoSubmitWorker$IconCompatParcelizer
            r4 = 0
            r2.<init>(r4)
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r6 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r6, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.worker.NotifyVideoSubmitWorker.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0, String p1, Intent p2) {
        this.IconCompatParcelizer.write(p0, p1, p2);
    }
}
