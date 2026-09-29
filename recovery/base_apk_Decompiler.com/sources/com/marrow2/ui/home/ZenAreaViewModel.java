package com.marrow2.ui.home;

import android.os.SystemClock;
import com.marrow2.ui.home.ZenAreaViewModel;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ApiClientKey;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.GoogleApiClientBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.TypeResolutionContextBasic;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.isSeekPending;
import kotlin.readTimestamp;
import kotlin.setSdkPayload;
import kotlin.setViewForPopups;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001e"}, d2 = {"Lcom/marrow2/ui/home/ZenAreaViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/readTimestamp;", "p0", "Ldagger/Lazy;", "Lo/setViewForPopups;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/readTimestamp;Ldagger/Lazy;Lo/isSeekPending;)V", "Lo/GoogleApiClientBuilder;", "", "IconCompatParcelizer", "(Lo/GoogleApiClientBuilder;)V", "read", "()V", "AudioAttributesCompatParcelizer", "write", "Lo/readTimestamp;", "MediaBrowserCompatCustomActionResultReceiver", "Ldagger/Lazy;", "Lo/isSeekPending;", "MediaBrowserCompatItemReceiver", "Lo/setViewForPopups;", "RemoteActionCompatParcelizer", "", "", "", "Ljava/util/Map;", "J", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ZenAreaViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<Long, Integer> write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Lazy<setViewForPopups> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private setViewForPopups RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final isSeekPending AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final readTimestamp read;

    @setSdkPayload
    public ZenAreaViewModel(readTimestamp readtimestamp, Lazy<setViewForPopups> lazy, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.read = readtimestamp;
        this.IconCompatParcelizer = lazy;
        this.AudioAttributesCompatParcelizer = isseekpending;
        this.write = new LinkedHashMap();
    }

    public final void IconCompatParcelizer(GoogleApiClientBuilder p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleApiClientBuilder.AudioAttributesCompatParcelizer.INSTANCE)) {
            read();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, GoogleApiClientBuilder.RemoteActionCompatParcelizer.INSTANCE)) {
            setViewForPopups setviewforpopups = this.RemoteActionCompatParcelizer;
            if (setviewforpopups != null) {
                setviewforpopups.IconCompatParcelizer();
            }
            AudioAttributesCompatParcelizer();
            return;
        }
        if (p0 instanceof GoogleApiClientBuilder.read) {
            setViewForPopups setviewforpopups2 = this.RemoteActionCompatParcelizer;
            if (setviewforpopups2 != null) {
                this.write.put(Long.valueOf(((GoogleApiClientBuilder.read) p0).RemoteActionCompatParcelizer()), Integer.valueOf(setviewforpopups2.read()));
            }
            AudioAttributesCompatParcelizer();
            return;
        }
        if (!(p0 instanceof GoogleApiClientBuilder.write)) {
            throw new RenewEligibleCreator();
        }
        Integer numRemove = this.write.remove(Long.valueOf(((GoogleApiClientBuilder.write) p0).AudioAttributesCompatParcelizer()));
        if (numRemove != null) {
            int iIntValue = numRemove.intValue();
            setViewForPopups setviewforpopups3 = this.RemoteActionCompatParcelizer;
            if (setviewforpopups3 != null) {
                setviewforpopups3.AudioAttributesCompatParcelizer(iIntValue);
            }
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if (r5 == r0) goto L24;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L4c
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                com.marrow2.ui.home.ZenAreaViewModel r5 = com.marrow2.ui.home.ZenAreaViewModel.this
                o.readTimestamp r5 = com.marrow2.ui.home.ZenAreaViewModel.RemoteActionCompatParcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.RemoteActionCompatParcelizer = r3
                java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r1)
                if (r5 == r0) goto L71
            L32:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L6e
                com.marrow2.ui.home.ZenAreaViewModel r5 = com.marrow2.ui.home.ZenAreaViewModel.this
                o.readTimestamp r5 = com.marrow2.ui.home.ZenAreaViewModel.RemoteActionCompatParcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.RemoteActionCompatParcelizer = r2
                java.lang.Object r5 = r5.write(r1)
                if (r5 != r0) goto L4c
                goto L71
            L4c:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L6e
                com.marrow2.ui.home.ZenAreaViewModel r5 = com.marrow2.ui.home.ZenAreaViewModel.this
                o.setViewForPopups r5 = com.marrow2.ui.home.ZenAreaViewModel.IconCompatParcelizer(r5)
                if (r5 != 0) goto L6e
                com.marrow2.ui.home.ZenAreaViewModel r4 = com.marrow2.ui.home.ZenAreaViewModel.this
                dagger.Lazy r5 = com.marrow2.ui.home.ZenAreaViewModel.read(r4)
                java.lang.Object r5 = r5.get()
                o.setViewForPopups r5 = (kotlin.setViewForPopups) r5
                r5.AudioAttributesCompatParcelizer()
                com.marrow2.ui.home.ZenAreaViewModel.RemoteActionCompatParcelizer(r4, r5)
            L6e:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.ZenAreaViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ZenAreaViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        if (this.RemoteActionCompatParcelizer != null) {
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.PackageSignatureVerifier
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ZenAreaViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.AudioAttributesImplApi26Parcelizer < 5000) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = jUptimeMillis;
        isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
        ApiClientKey apiClientKey = ApiClientKey.INSTANCE;
        isseekpending.write(ApiClientKey.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        this.write.clear();
        setViewForPopups setviewforpopups = this.RemoteActionCompatParcelizer;
        if (setviewforpopups != null) {
            setviewforpopups.write();
        }
        this.RemoteActionCompatParcelizer = null;
        super.write();
    }
}
