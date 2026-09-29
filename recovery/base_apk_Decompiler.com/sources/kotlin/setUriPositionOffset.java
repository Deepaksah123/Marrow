package kotlin;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import com.google.android.recaptcha.RecaptchaTasksClient;
import kotlin.Metadata;
import kotlin.setLength;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0012\u0010\bR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015"}, d2 = {"Lo/setUriPositionOffset;", "", "Landroid/app/Application;", "p0", "<init>", "(Landroid/app/Application;)V", "", "write", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Ljava/lang/Exception;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Exception;)V", "Lo/setLength;", "read", "(Lo/setLength;)V", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Landroid/app/Application;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setUriPositionOffset {
    private final Application IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public RecaptchaTasksClient read;

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return setUriPositionOffset.this.write((String) null, this);
        }
    }

    static final class read extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return setUriPositionOffset.this.IconCompatParcelizer(this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return setUriPositionOffset.IconCompatParcelizer(setUriPositionOffset.this, this);
        }
    }

    public setUriPositionOffset(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        this.IconCompatParcelizer = application;
        Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient(application, "6LcwLCEnAAAAAJU8Dcyil1xIuhrN049azkel-yxI");
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.setHttpRequestHeaders
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setUriPositionOffset.read(this.RemoteActionCompatParcelizer, (RecaptchaTasksClient) obj);
            }
        };
        tasksClient.addOnSuccessListener(new OnSuccessListener() { // from class: o.DataSpecHttpMethod
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                setUriPositionOffset.read(getanswermap, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.setTargetBufferSize
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                setUriPositionOffset.IconCompatParcelizer(this.write, exc);
            }
        });
    }

    public static final /* synthetic */ Object IconCompatParcelizer(setUriPositionOffset seturipositionoffset, SampleVideos sampleVideos) {
        return seturipositionoffset.AudioAttributesCompatParcelizer((String) null, (SampleVideos<? super String>) sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setUriPositionOffset seturipositionoffset, RecaptchaTasksClient recaptchaTasksClient) {
        seturipositionoffset.read = recaptchaTasksClient;
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setUriPositionOffset seturipositionoffset, Exception exc) {
        toMagicModuleMetaRepoModel.write(exc, "");
        seturipositionoffset.RemoteActionCompatParcelizer(exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r11 != r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13, types: [o.setUriPositionOffset] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o.setUriPositionOffset] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0086 -> B:48:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0098 -> B:40:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b2 -> B:47:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r10, kotlin.SampleVideos<? super java.lang.String> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setUriPositionOffset.write(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    private final void RemoteActionCompatParcelizer(Exception p0) {
        if (p0 instanceof RecaptchaException) {
            RecaptchaException recaptchaException = (RecaptchaException) p0;
            if (recaptchaException.getErrorCode() != RecaptchaErrorCode.NETWORK_ERROR) {
                read(new setLength.write.C0143write(recaptchaException.getErrorCode().toString()));
            }
        }
    }

    private final void read(setLength p0) {
        DataSpecFlags dataSpecFlags = DataSpecFlags.INSTANCE;
        Context applicationContext = this.IconCompatParcelizer.getApplicationContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
        DataSpecFlags.read(applicationContext, p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super java.lang.String> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o.setUriPositionOffset.read
            if (r0 == 0) goto L14
            r0 = r6
            o.setUriPositionOffset$read r0 = (o.setUriPositionOffset.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.setUriPositionOffset$read r0 = new o.setUriPositionOffset$read
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            java.lang.String r4 = ""
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r5 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L6b
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            android.app.Application r5 = r5.IconCompatParcelizer
            android.content.Context r5 = r5.getApplicationContext()
            kotlin.toMagicModuleMetaRepoModel.read(r5, r4)
            com.marrow.TrainingApplication r5 = (com.marrow.TrainingApplication) r5
            android.app.Activity r5 = r5.AudioAttributesImplApi26Parcelizer()
            boolean r6 = r5 instanceof kotlin.maybeGetTypeVariable
            r2 = 0
            if (r6 == 0) goto L59
            o.r8lambdavDuk6rTp1JuQSAVZdUUcM4qsx4k r6 = new o.r8lambdavDuk6rTp1JuQSAVZdUUcM4qsx4k
            o.maybeGetTypeVariable r5 = (kotlin.maybeGetTypeVariable) r5
            r6.<init>(r5)
            goto L5a
        L59:
            r6 = r2
        L5a:
            if (r6 == 0) goto L70
            r0.IconCompatParcelizer = r2
            r0.AudioAttributesCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r2
            r0.write = r3
            java.lang.Object r6 = r6.read(r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L70
            return r6
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setUriPositionOffset.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r5, kotlin.SampleVideos<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.setUriPositionOffset.write
            if (r0 == 0) goto L14
            r0 = r6
            o.setUriPositionOffset$write r0 = (o.setUriPositionOffset.write) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L19
        L14:
            o.setUriPositionOffset$write r0 = new o.setUriPositionOffset$write
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L52
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            com.google.android.recaptcha.RecaptchaTasksClient r4 = r4.read
            kotlin.toMagicModuleMetaRepoModel.write(r4)
            com.google.android.recaptcha.RecaptchaAction$Companion r6 = com.google.android.recaptcha.RecaptchaAction.INSTANCE
            com.google.android.recaptcha.RecaptchaAction r5 = r6.custom(r5)
            com.google.android.gms.tasks.Task r4 = r4.executeTask(r5)
            r5 = 0
            r0.RemoteActionCompatParcelizer = r5
            r0.IconCompatParcelizer = r3
            java.lang.Object r6 = kotlin.getLicenseByteEncrypt.RemoteActionCompatParcelizer(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            java.lang.String r4 = "g-"
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r4 = r4.concat(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setUriPositionOffset.AudioAttributesCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }
}
