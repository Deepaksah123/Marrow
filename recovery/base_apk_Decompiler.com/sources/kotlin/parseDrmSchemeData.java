package kotlin;

import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.getSampleFormats;
import kotlin.indexOf;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018H\u0016¢\u0006\u0004\b\r\u0010\u0019J\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0014R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#"}, d2 = {"Lo/parseDrmSchemeData;", "Lo/getSampleFormats;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "p0", "Lo/getStreamPositionUsForContent;", "p1", "<init>", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lo/getStreamPositionUsForContent;)V", "", "RemoteActionCompatParcelizer", "()V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Z", "", "read", "(Ljava/lang/String;)I", "(Ljava/lang/String;)Ljava/lang/String;", "MediaMetadataCompat", "()Z", "write", "()I", "MediaBrowserCompatItemReceiver", "", "()Ljava/util/List;", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "RatingCompat", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "Lo/getStreamPositionUsForContent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parseDrmSchemeData implements getSampleFormats {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getStreamPositionUsForContent read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final FirebaseRemoteConfig AudioAttributesCompatParcelizer;

    @setSdkPayload
    public parseDrmSchemeData(FirebaseRemoteConfig firebaseRemoteConfig, getStreamPositionUsForContent getstreampositionusforcontent) {
        toMagicModuleMetaRepoModel.write(firebaseRemoteConfig, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.AudioAttributesCompatParcelizer = firebaseRemoteConfig;
        this.read = getstreampositionusforcontent;
    }

    @Override // kotlin.getSampleFormats
    public final void RemoteActionCompatParcelizer() {
        Task<Void> taskAddOnFailureListener = this.AudioAttributesCompatParcelizer.read(this.read.MediaBrowserCompatItemReceiver("remote_config_cache_period")).addOnFailureListener(new OnFailureListener() { // from class: o.parseDoubleAttr
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                parseDrmSchemeData.read(this.AudioAttributesCompatParcelizer, exc);
            }
        });
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.parseIntAttr
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return parseDrmSchemeData.read(this.IconCompatParcelizer);
            }
        };
        taskAddOnFailureListener.addOnSuccessListener(new OnSuccessListener() { // from class: o.parseOptionalBooleanAttribute
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                parseDrmSchemeData.IconCompatParcelizer(getanswermap, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(parseDrmSchemeData parsedrmschemedata, Exception exc) {
        toMagicModuleMetaRepoModel.write(exc, "");
        parsedrmschemedata.read.IconCompatParcelizer("remote_config_cache_period", 0);
        indexOf.Companion companion = indexOf.INSTANCE;
        indexOf.Companion.AudioAttributesCompatParcelizer("remote_fetch_fail", exc, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(parseDrmSchemeData parsedrmschemedata) {
        parsedrmschemedata.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        parsedrmschemedata.read.RemoteActionCompatParcelizer("remote_config_cache_period", 1L);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.getSampleFormats
    public final boolean AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.getSampleFormats
    public final int read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (int) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin.getSampleFormats
    public final String RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strWrite = this.AudioAttributesCompatParcelizer.write(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        return strWrite;
    }

    @Override // kotlin.getSampleFormats
    public final boolean MediaMetadataCompat() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("show_settings");
    }

    @Override // kotlin.getSampleFormats
    public final int write() {
        return read(getSampleFormats.Companion.MediaBrowserCompatItemReceiver());
    }

    @Override // kotlin.getSampleFormats
    public final boolean MediaBrowserCompatItemReceiver() {
        return AudioAttributesCompatParcelizer(getSampleFormats.Companion.read());
    }

    @Override // kotlin.getSampleFormats
    public final List<String> AudioAttributesCompatParcelizer() {
        return IntermediateLoginResponseBody.onPlay(TestGroupLSModel.write(RemoteActionCompatParcelizer("suppress_codes"), new String[]{","}, 0, 6));
    }

    @Override // kotlin.getSampleFormats
    public final String read() {
        return RemoteActionCompatParcelizer("non_operable_cpu_list");
    }

    @Override // kotlin.getSampleFormats
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesCompatParcelizer("extra_hardware_check_required");
    }

    @Override // kotlin.getSampleFormats
    public final String IconCompatParcelizer() {
        return RemoteActionCompatParcelizer(getSampleFormats.Companion.MediaBrowserCompatCustomActionResultReceiver());
    }

    @Override // kotlin.getSampleFormats
    public final boolean RatingCompat() {
        return AudioAttributesCompatParcelizer("skip_reset_player_on_error");
    }

    @Override // kotlin.getSampleFormats
    public final boolean AudioAttributesImplApi21Parcelizer() {
        return AudioAttributesCompatParcelizer("font_rendering_mode");
    }

    @Override // kotlin.getSampleFormats
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return AudioAttributesCompatParcelizer("experimental_hardware_rendering");
    }

    @Override // kotlin.getSampleFormats
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return AudioAttributesCompatParcelizer("dark_font_available");
    }

    @Override // kotlin.getSampleFormats
    public final boolean AudioAttributesImplBaseParcelizer() {
        return AudioAttributesCompatParcelizer("legacy_video_navigate_previous_task");
    }
}
