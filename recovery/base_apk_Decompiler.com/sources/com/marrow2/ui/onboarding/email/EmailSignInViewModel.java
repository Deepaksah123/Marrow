package com.marrow2.ui.onboarding.email;

import android.os.CountDownTimer;
import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.ui.onboarding.email.EmailSignInViewModel;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ThemeState;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin._deserializeCustom;
import kotlin.createBundle;
import kotlin.createByteArray;
import kotlin.createByteArraySparseArray;
import kotlin.createCharArray;
import kotlin.createParcelSparseArray;
import kotlin.getAnswerMap;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleStats;
import kotlin.getPcmFormat;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getStreamTypeForAudioUsage;
import kotlin.getStringForTime;
import kotlin.getSystemLanguageCodes;
import kotlin.getSystemLocales;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.peekChar;
import kotlin.readDouble;
import kotlin.readLine;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import kotlin.updateLoadingFinished;
import kotlin.zaF;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ+\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0007¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b\u001f\u0010'R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020(0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020(0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\f\u0010,R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020-0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020-0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b\u001a\u0010,R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b*\u0010,R\u0016\u0010\u0017\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0016\u0010\u0010\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u00101"}, d2 = {"Lcom/marrow2/ui/onboarding/email/EmailSignInViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/peekChar;Lo/POJOPropertyBuilder5;Lo/isSeekPending;)V", "Lo/createByteArraySparseArray;", "", "IconCompatParcelizer", "(Lo/createByteArraySparseArray;)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "MediaBrowserCompatSearchResultReceiver", "", "write", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "RatingCompat", "MediaDescriptionCompat", "MediaBrowserCompatItemReceiver", "", "read", "(Ljava/lang/String;)Z", "Lo/peekChar;", "MediaBrowserCompatMediaItem", "Lo/POJOPropertyBuilder5;", "AudioAttributesCompatParcelizer", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/createCharArray;", "RemoteActionCompatParcelizer", "Lo/getResolutionSize;", "Lo/isDark;", "Lo/isDark;", "()Lo/isDark;", "Lo/createBundle;", "Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/createByteArray;", "MediaMetadataCompat", "Z", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailSignInViewModel extends POJOPropertyBuilderWithMember {
    private final isSeekPending AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isDark<createCharArray> write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<createBundle> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<createByteArray> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<createByteArray> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private CountDownTimer MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final peekChar IconCompatParcelizer;
    private final getResolutionSize<createCharArray> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<createBundle> AudioAttributesImplApi21Parcelizer;

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[createByteArray.values().length];
            try {
                iArr[createByteArray.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            read = iArr;
        }
    }

    @setSdkPayload
    public EmailSignInViewModel(peekChar peekchar, POJOPropertyBuilder5 pOJOPropertyBuilder5, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.IconCompatParcelizer = peekchar;
        this.read = pOJOPropertyBuilder5;
        this.AudioAttributesCompatParcelizer = isseekpending;
        getResolutionSize<createCharArray> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new createCharArray(null, false, null, false, null, false, null, null, false, UnixStat.DEFAULT_LINK_PERM, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.write = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<createBundle> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(createBundle.read.INSTANCE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<createByteArray> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(createByteArray.AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        this.MediaBrowserCompatSearchResultReceiver = new AudioAttributesCompatParcelizer();
        String str = (String) pOJOPropertyBuilder5.write("email_id");
        String str2 = str != null ? str : "";
        if (str2.length() > 0) {
            IconCompatParcelizer(new createByteArraySparseArray.read(str2));
            this.MediaDescriptionCompat = true;
            getresolutionsizeRemoteActionCompatParcelizer2.write(createBundle.AudioAttributesImplApi26Parcelizer.INSTANCE);
            getresolutionsizeRemoteActionCompatParcelizer3.write(createByteArray.write);
        }
    }

    public final isDark<createCharArray> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final setUpdatedStatus<createBundle> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<createByteArray> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat;
    }

    public static final class AudioAttributesCompatParcelizer extends CountDownTimer {
        AudioAttributesCompatParcelizer() {
            super(60000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
            getResolutionSize getresolutionsize = EmailSignInViewModel.this.RemoteActionCompatParcelizer;
            createCharArray createchararray = (createCharArray) EmailSignInViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            getresolutionsize.write(createCharArray.read((447 & 1) != 0 ? createchararray.RemoteActionCompatParcelizer : null, (447 & 2) != 0 ? createchararray.AudioAttributesCompatParcelizer : false, (447 & 4) != 0 ? createchararray.write : null, (447 & 8) != 0 ? createchararray.MediaBrowserCompatItemReceiver : false, (447 & 16) != 0 ? createchararray.IconCompatParcelizer : null, (447 & 32) != 0 ? createchararray.MediaBrowserCompatCustomActionResultReceiver : false, (447 & 64) != 0 ? createchararray.AudioAttributesImplApi26Parcelizer : str, (447 & 128) != 0 ? createchararray.AudioAttributesImplBaseParcelizer : null, (447 & 256) != 0 ? createchararray.read : false));
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            getResolutionSize getresolutionsize = EmailSignInViewModel.this.RemoteActionCompatParcelizer;
            createCharArray createchararray = (createCharArray) EmailSignInViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            getresolutionsize.write(createCharArray.read((447 & 1) != 0 ? createchararray.RemoteActionCompatParcelizer : null, (447 & 2) != 0 ? createchararray.AudioAttributesCompatParcelizer : false, (447 & 4) != 0 ? createchararray.write : null, (447 & 8) != 0 ? createchararray.MediaBrowserCompatItemReceiver : false, (447 & 16) != 0 ? createchararray.IconCompatParcelizer : null, (447 & 32) != 0 ? createchararray.MediaBrowserCompatCustomActionResultReceiver : false, (447 & 64) != 0 ? createchararray.AudioAttributesImplApi26Parcelizer : "", (447 & 128) != 0 ? createchararray.AudioAttributesImplBaseParcelizer : null, (447 & 256) != 0 ? createchararray.read : false));
        }
    }

    public final void IconCompatParcelizer(createByteArraySparseArray p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.IconCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(createBundle.read.INSTANCE);
            return;
        }
        if (p0 instanceof createByteArraySparseArray.read) {
            getResolutionSize<createCharArray> getresolutionsize = this.RemoteActionCompatParcelizer;
            createCharArray createchararrayIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            createByteArraySparseArray.read readVar = (createByteArraySparseArray.read) p0;
            getresolutionsize.write(createCharArray.read((447 & 1) != 0 ? createchararrayIconCompatParcelizer.RemoteActionCompatParcelizer : readVar.RemoteActionCompatParcelizer(), (447 & 2) != 0 ? createchararrayIconCompatParcelizer.AudioAttributesCompatParcelizer : read(readVar.RemoteActionCompatParcelizer()), (447 & 4) != 0 ? createchararrayIconCompatParcelizer.write : null, (447 & 8) != 0 ? createchararrayIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (447 & 16) != 0 ? createchararrayIconCompatParcelizer.IconCompatParcelizer : null, (447 & 32) != 0 ? createchararrayIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (447 & 64) != 0 ? createchararrayIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (447 & 128) != 0 ? createchararrayIconCompatParcelizer.AudioAttributesImplBaseParcelizer : readVar.RemoteActionCompatParcelizer(), (447 & 256) != 0 ? createchararrayIconCompatParcelizer.read : false));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.write.INSTANCE)) {
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (p0 instanceof createByteArraySparseArray.RemoteActionCompatParcelizer) {
            getResolutionSize<createCharArray> getresolutionsize2 = this.RemoteActionCompatParcelizer;
            createCharArray createchararrayIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            createByteArraySparseArray.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (createByteArraySparseArray.RemoteActionCompatParcelizer) p0;
            getresolutionsize2.write(createCharArray.read((447 & 1) != 0 ? createchararrayIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (447 & 2) != 0 ? createchararrayIconCompatParcelizer2.AudioAttributesCompatParcelizer : false, (447 & 4) != 0 ? createchararrayIconCompatParcelizer2.write : remoteActionCompatParcelizer.write(), (447 & 8) != 0 ? createchararrayIconCompatParcelizer2.MediaBrowserCompatItemReceiver : remoteActionCompatParcelizer.write().length() > 0, (447 & 16) != 0 ? createchararrayIconCompatParcelizer2.IconCompatParcelizer : null, (447 & 32) != 0 ? createchararrayIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : false, (447 & 64) != 0 ? createchararrayIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : null, (447 & 128) != 0 ? createchararrayIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : null, (447 & 256) != 0 ? createchararrayIconCompatParcelizer2.read : false));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.MediaDescriptionCompat.INSTANCE)) {
            write(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getRemoteActionCompatParcelizer(), this.RemoteActionCompatParcelizer.IconCompatParcelizer().getIconCompatParcelizer(), this.RemoteActionCompatParcelizer.IconCompatParcelizer().getWrite());
            return;
        }
        if (p0 instanceof createByteArraySparseArray.AudioAttributesImplApi26Parcelizer) {
            getResolutionSize<createCharArray> getresolutionsize3 = this.RemoteActionCompatParcelizer;
            createCharArray createchararrayIconCompatParcelizer3 = getresolutionsize3.IconCompatParcelizer();
            createByteArraySparseArray.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (createByteArraySparseArray.AudioAttributesImplApi26Parcelizer) p0;
            getresolutionsize3.write(createCharArray.read((447 & 1) != 0 ? createchararrayIconCompatParcelizer3.RemoteActionCompatParcelizer : null, (447 & 2) != 0 ? createchararrayIconCompatParcelizer3.AudioAttributesCompatParcelizer : false, (447 & 4) != 0 ? createchararrayIconCompatParcelizer3.write : null, (447 & 8) != 0 ? createchararrayIconCompatParcelizer3.MediaBrowserCompatItemReceiver : false, (447 & 16) != 0 ? createchararrayIconCompatParcelizer3.IconCompatParcelizer : null, (447 & 32) != 0 ? createchararrayIconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver : false, (447 & 64) != 0 ? createchararrayIconCompatParcelizer3.AudioAttributesImplApi26Parcelizer : null, (447 & 128) != 0 ? createchararrayIconCompatParcelizer3.AudioAttributesImplBaseParcelizer : audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), (447 & 256) != 0 ? createchararrayIconCompatParcelizer3.read : read(audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer())));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            this.AudioAttributesCompatParcelizer.write(createParcelSparseArray.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            this.MediaBrowserCompatCustomActionResultReceiver.write(createByteArray.read);
            this.AudioAttributesImplApi21Parcelizer.write(new createBundle.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer()));
            return;
        }
        if (p0 instanceof createByteArraySparseArray.AudioAttributesCompatParcelizer) {
            getResolutionSize<createCharArray> getresolutionsize4 = this.RemoteActionCompatParcelizer;
            createCharArray createchararrayIconCompatParcelizer4 = getresolutionsize4.IconCompatParcelizer();
            createByteArraySparseArray.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (createByteArraySparseArray.AudioAttributesCompatParcelizer) p0;
            getresolutionsize4.write(createCharArray.read((447 & 1) != 0 ? createchararrayIconCompatParcelizer4.RemoteActionCompatParcelizer : null, (447 & 2) != 0 ? createchararrayIconCompatParcelizer4.AudioAttributesCompatParcelizer : false, (447 & 4) != 0 ? createchararrayIconCompatParcelizer4.write : null, (447 & 8) != 0 ? createchararrayIconCompatParcelizer4.MediaBrowserCompatItemReceiver : false, (447 & 16) != 0 ? createchararrayIconCompatParcelizer4.IconCompatParcelizer : audioAttributesCompatParcelizer.read(), (447 & 32) != 0 ? createchararrayIconCompatParcelizer4.MediaBrowserCompatCustomActionResultReceiver : audioAttributesCompatParcelizer.read().length() > 0, (447 & 64) != 0 ? createchararrayIconCompatParcelizer4.AudioAttributesImplApi26Parcelizer : null, (447 & 128) != 0 ? createchararrayIconCompatParcelizer4.AudioAttributesImplBaseParcelizer : null, (447 & 256) != 0 ? createchararrayIconCompatParcelizer4.read : false));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.MediaMetadataCompat.INSTANCE)) {
            AudioAttributesImplApi26Parcelizer();
            RatingCompat();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
            write(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getRemoteActionCompatParcelizer(), this.RemoteActionCompatParcelizer.IconCompatParcelizer().getIconCompatParcelizer(), this.RemoteActionCompatParcelizer.IconCompatParcelizer().getWrite());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.MediaBrowserCompatItemReceiver.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            MediaBrowserCompatSearchResultReceiver();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createByteArraySparseArray.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.MediaBrowserCompatCustomActionResultReceiver.write(createByteArray.write);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaBrowserCompatSearchResultReceiver.onFinish();
        this.MediaBrowserCompatSearchResultReceiver.cancel();
        getResolutionSize<createCharArray> getresolutionsize = this.RemoteActionCompatParcelizer;
        createCharArray createchararrayIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(createCharArray.read((447 & 1) != 0 ? createchararrayIconCompatParcelizer.RemoteActionCompatParcelizer : null, (447 & 2) != 0 ? createchararrayIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (447 & 4) != 0 ? createchararrayIconCompatParcelizer.write : null, (447 & 8) != 0 ? createchararrayIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (447 & 16) != 0 ? createchararrayIconCompatParcelizer.IconCompatParcelizer : null, (447 & 32) != 0 ? createchararrayIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (447 & 64) != 0 ? createchararrayIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : "", (447 & 128) != 0 ? createchararrayIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (447 & 256) != 0 ? createchararrayIconCompatParcelizer.read : false));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getPcmFormat getpcmformat = new getPcmFormat(((createCharArray) EmailSignInViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer()).getRemoteActionCompatParcelizer());
                this.RemoteActionCompatParcelizer = null;
                this.AudioAttributesCompatParcelizer = 1;
                obj = EmailSignInViewModel.this.IconCompatParcelizer.IconCompatParcelizer(getpcmformat, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            EmailSignInViewModel.this.MediaBrowserCompatItemReceiver();
            getResolutionSize getresolutionsize = EmailSignInViewModel.this.AudioAttributesImplApi21Parcelizer;
            String iconCompatParcelizer = ((getSystemLanguageCodes) obj).getIconCompatParcelizer();
            if (iconCompatParcelizer == null) {
                iconCompatParcelizer = "";
            }
            getresolutionsize.write(new createBundle.MediaDescriptionCompat(iconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return EmailSignInViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        MediaDescriptionCompat();
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.createBooleanList
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return EmailSignInViewModel.write(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(EmailSignInViewModel emailSignInViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        emailSignInViewModel.MediaBrowserCompatItemReceiver();
        if (i == 502) {
            emailSignInViewModel.AudioAttributesImplApi21Parcelizer.write(createBundle.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        } else {
            emailSignInViewModel.AudioAttributesImplApi21Parcelizer.write(new createBundle.MediaMetadataCompat(str));
        }
        return getShowPopup.INSTANCE;
    }

    private final void write(String p0, String p1, String p2) {
        MediaDescriptionCompat();
        String str = p2;
        final String str2 = (str == null || str.length() == 0) ? "email_otp" : "email_password";
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, p2, p1, this, str2, null), new MagicModuleSubmissionRequestBody() { // from class: o.createBooleanArray
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return EmailSignInViewModel.write(this.read, str2, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private /* synthetic */ EmailSignInViewModel MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatItemReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getStreamTypeForAudioUsage getstreamtypeforaudiousage = new getStreamTypeForAudioUsage(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.read);
                this.IconCompatParcelizer = null;
                this.MediaBrowserCompatItemReceiver = 1;
                obj = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.AudioAttributesCompatParcelizer(getstreamtypeforaudiousage, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            readDouble readdouble = (readDouble) obj;
            this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
            if (readdouble.getKycMeta() != null) {
                isSeekPending isseekpending = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
                zaF zaf = zaF.INSTANCE;
                isseekpending.write(zaF.IconCompatParcelizer(readdouble.getKycMeta(), "email"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
                this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.write(new createBundle.MediaBrowserCompatItemReceiver(readdouble.getKycMeta()));
            } else {
                isSeekPending isseekpending2 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
                Map<String, ? extends Object> mapRemoteActionCompatParcelizer = getLatestBitrateEstimate.RemoteActionCompatParcelizer(readLine.read(readdouble), 0, 0, 0, 0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer, "");
                isseekpending2.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer);
                CollegeDetails college = readdouble.getCollege();
                if (college == null || college.isUserCollegeDataAvailable()) {
                    this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.write(createBundle.AudioAttributesImplBaseParcelizer.INSTANCE);
                } else {
                    this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.write(createBundle.write.INSTANCE);
                }
                isSeekPending isseekpending3 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
                createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
                isseekpending3.write(createParcelSparseArray.IconCompatParcelizer(createParcelSparseArray.IconCompatParcelizer.write), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer.write("login_complete", createParcelSparseArray.read(readdouble.getUserId(), readdouble.getPhoneNumber().getCountryCode(), this.write, -1, ""), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, String str2, String str3, EmailSignInViewModel emailSignInViewModel, String str4, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
            this.read = str3;
            this.MediaBrowserCompatCustomActionResultReceiver = emailSignInViewModel;
            this.write = str4;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new read(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(EmailSignInViewModel emailSignInViewModel, String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        emailSignInViewModel.MediaBrowserCompatItemReceiver();
        emailSignInViewModel.AudioAttributesImplApi21Parcelizer.write(createBundle.AudioAttributesCompatParcelizer.INSTANCE);
        if (i == 502) {
            emailSignInViewModel.AudioAttributesImplApi21Parcelizer.write(createBundle.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        } else {
            emailSignInViewModel.AudioAttributesImplApi21Parcelizer.write(new createBundle.MediaMetadataCompat(str2));
        }
        emailSignInViewModel.AudioAttributesCompatParcelizer.write("login_complete", createParcelSparseArray.read(emailSignInViewModel.RemoteActionCompatParcelizer.IconCompatParcelizer().getRemoteActionCompatParcelizer(), (String) null, str, i, str2), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        if (write.read[this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().ordinal()] == 1) {
            this.AudioAttributesImplApi21Parcelizer.write(createBundle.IconCompatParcelizer.INSTANCE);
        } else if (this.MediaDescriptionCompat) {
            this.AudioAttributesImplApi21Parcelizer.write(createBundle.IconCompatParcelizer.INSTANCE);
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver.write(createByteArray.AudioAttributesCompatParcelizer);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getSystemLocales getsystemlocales = new getSystemLocales(((createCharArray) EmailSignInViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer()).getRemoteActionCompatParcelizer());
                this.AudioAttributesCompatParcelizer = null;
                this.read = 1;
                obj = EmailSignInViewModel.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(getsystemlocales, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            EmailSignInViewModel.this.MediaBrowserCompatItemReceiver();
            String write = ((getStringForTime) obj).getWrite();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) write, (Object) "email_otp")) {
                EmailSignInViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(createByteArray.RemoteActionCompatParcelizer);
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) write, (Object) "email_password")) {
                EmailSignInViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(createByteArray.write);
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return EmailSignInViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        MediaDescriptionCompat();
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.AbstractSafeParcelable
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return EmailSignInViewModel.read(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(EmailSignInViewModel emailSignInViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        emailSignInViewModel.MediaBrowserCompatItemReceiver();
        if (i == 502) {
            emailSignInViewModel.AudioAttributesImplApi21Parcelizer.write(createBundle.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        } else {
            emailSignInViewModel.AudioAttributesImplApi21Parcelizer.write(new createBundle.MediaMetadataCompat(str));
        }
        return getShowPopup.INSTANCE;
    }

    private final void RatingCompat() {
        this.MediaBrowserCompatSearchResultReceiver.start();
        this.AudioAttributesImplApi21Parcelizer.write(new createBundle.MediaBrowserCompatMediaItem(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getRemoteActionCompatParcelizer()));
    }

    private final void MediaDescriptionCompat() {
        this.AudioAttributesImplBaseParcelizer.write(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        this.AudioAttributesImplBaseParcelizer.write(Boolean.FALSE);
    }

    private static boolean read(String p0) {
        String str = p0;
        return str.length() > 0 && _deserializeCustom.AudioAttributesCompatParcelizer.matcher(str).matches();
    }
}
