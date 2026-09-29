package kotlin;

import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/marrow/data/dataprovider/video/drm/DrmDataSourceImpl;", "Lcom/marrow/data/dataprovider/video/drm/DrmDataSource;", "preferenceDataProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "crashDataProvider", "Lcom/marrow/dataprovider/crash/ICrashDataProvider;", "<init>", "(Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;Lcom/marrow/dataprovider/crash/ICrashDataProvider;)V", "drmStatus", "", "getDrmStatus", "()I", "drmStatus$delegate", "Lkotlin/Lazy;", "logAnalytics", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "newDrmStatus", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MediaParserChunkExtractor1 implements maybeExecutePendingSeek {
    public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private final RenewEligible IconCompatParcelizer;
    private final parseLongAttr RemoteActionCompatParcelizer;
    private final getStreamPositionUsForContent write;

    @setSdkPayload
    public MediaParserChunkExtractor1(getStreamPositionUsForContent getstreampositionusforcontent, parseLongAttr parselongattr) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        this.write = getstreampositionusforcontent;
        this.RemoteActionCompatParcelizer = parselongattr;
        this.IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.SingleSampleMediaChunk
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(MediaParserChunkExtractor1.RemoteActionCompatParcelizer(this.write));
            }
        });
    }

    public final int write() {
        return ((Number) this.IconCompatParcelizer.RemoteActionCompatParcelizer()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0014: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:8:0x0014 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int RemoteActionCompatParcelizer(kotlin.MediaParserChunkExtractor1 r4) throws java.lang.Throwable {
        /*
            r0 = 0
            android.media.MediaDrm r1 = new android.media.MediaDrm     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            java.util.UUID r2 = com.google.android.exoplayer2.C.WIDEVINE_UUID     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r1.getProvisionRequest()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
            r2 = 1
            r4.write(r0, r2)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
            r1.close()
            return r2
        L13:
            r4 = move-exception
            r0 = r1
            goto L31
        L16:
            r0 = move-exception
            goto L1e
        L18:
            r4 = move-exception
            goto L31
        L1a:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L1e:
            boolean r2 = r0 instanceof android.media.UnsupportedSchemeException
            if (r2 == 0) goto L27
            r2 = 0
            r4.write(r0, r2)     // Catch: java.lang.Throwable -> L13
            goto L2b
        L27:
            r2 = -1
            r4.write(r0, r2)     // Catch: java.lang.Throwable -> L13
        L2b:
            if (r1 == 0) goto L30
            r1.close()
        L30:
            return r2
        L31:
            if (r0 == 0) goto L36
            r0.close()
        L36:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaParserChunkExtractor1.RemoteActionCompatParcelizer(o.MediaParserChunkExtractor1):int");
    }

    private final void write(Exception exc, int i) {
        int iMediaSessionCompatToken = this.write.MediaSessionCompatToken();
        if (iMediaSessionCompatToken == i) {
            return;
        }
        HashMap map = new HashMap();
        map.put("previous_state", String.valueOf(iMediaSessionCompatToken));
        map.put("new_state", String.valueOf(i));
        if (exc != null) {
            map.put("ex_title", exc.getClass().getSimpleName().toString());
            String message = exc.getMessage();
            if (message == null) {
                message = "Message not available";
            }
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = i2 * 100;
                if (message.length() > i3) {
                    int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer((r4 * 100) - 1, TestGroupLSModel.write((CharSequence) message));
                    String strConcat = "ex_msg".concat(String.valueOf(i2 + 1));
                    String strSubstring = message.substring(i3, iRemoteActionCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                    map.put(strConcat, strSubstring);
                }
            }
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(exc, "drm_failures");
        }
        RtspHeadersBuilder.IconCompatParcelizer().write("drm_failures", map, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        this.write.read(i);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/MediaParserChunkExtractor1$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
