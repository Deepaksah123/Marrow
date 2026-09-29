package kotlin;

import android.net.Uri;
import in.juspay.hyper.constants.LogSubCategory;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJo\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/getDownloadForCurrentRow;", "Lo/encodeStreamKeys;", "Lo/TextInformationFrame1;", "p0", "Lo/CurrentQuery;", "p1", "", "p2", "<init>", "(Lo/TextInformationFrame1;Lo/CurrentQuery;Ljava/lang/String;)V", "", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lo/SampleVideos;", "", "", "read", "(Ljava/util/Map;Lo/MagicModuleSubmissionRequestBody;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Ljava/net/URL;", "AudioAttributesCompatParcelizer", "()Ljava/net/URL;", "Lo/TextInformationFrame1;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Ljava/lang/String;", "write", "Lo/CurrentQuery;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class getDownloadForCurrentRow implements encodeStreamKeys {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final TextInformationFrame1 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final CurrentQuery read;

    private getDownloadForCurrentRow(TextInformationFrame1 textInformationFrame1, CurrentQuery currentQuery, String str) {
        toMagicModuleMetaRepoModel.write(textInformationFrame1, "");
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = textInformationFrame1;
        this.read = currentQuery;
        this.AudioAttributesCompatParcelizer = str;
    }

    public /* synthetic */ getDownloadForCurrentRow(TextInformationFrame1 textInformationFrame1, CurrentQuery currentQuery, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(textInformationFrame1, currentQuery, (i & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody<JSONObject, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody<String, SampleVideos<? super getShowPopup>, Object> read;
        private /* synthetic */ Map<String, String> write;

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
        
            if (r1.invoke(r3, r7) != r0) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getDownloadForCurrentRow.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(Map<String, String> map, MagicModuleSubmissionRequestBody<? super JSONObject, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody<? super String, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody2, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = map;
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = magicModuleSubmissionRequestBody2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getDownloadForCurrentRow.this.new write(this.write, this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.encodeStreamKeys
    public final Object read(Map<String, String> map, MagicModuleSubmissionRequestBody<? super JSONObject, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody<? super String, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new write(map, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL AudioAttributesCompatParcelizer() {
        return new URL(new Uri.Builder().scheme("https").authority(this.AudioAttributesCompatParcelizer).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(LogSubCategory.LifeCycle.ANDROID).appendPath("gmp").appendPath(this.RemoteActionCompatParcelizer.read()).appendPath("settings").appendQueryParameter("build_version", this.RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer()).appendQueryParameter("display_version", this.RemoteActionCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer()).build().toString());
    }
}
