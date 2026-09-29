package com.marrow.data.models.video.cache;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.video.ThemeState;
import java.lang.reflect.Constructor;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010JR\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012R\u0017\u0010 \u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0015R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\u0012R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0010"}, d2 = {"Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/marrow/data/models/video/ThemeState;", "toDownloadInfo$63364025", "(Ljava/lang/String;Lcom/marrow/data/models/video/ThemeState;)Ljava/lang/Object;", "toLicenseLSModel$39deab1d", "()Ljava/lang/Object;", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6$66b8eacd", "copy$57fc98ce", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/marrow/data/models/video/cache/VideoOfflineDbModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "mediaId", "Ljava/lang/String;", "getMediaId", "licenseByteEncrypt", "getLicenseByteEncrypt", "level", "I", "getLevel", "playbackUrlsEncrypt", "getPlaybackUrlsEncrypt", "qualityHashCipher", "getQualityHashCipher", "encryptedLicenseTimeInfo", "Ljava/lang/Object;", "getEncryptedLicenseTimeInfo$66b8eacd"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoOfflineDbModel {
    private final Object encryptedLicenseTimeInfo;
    private final int level;
    private final String licenseByteEncrypt;
    private final String mediaId;
    private final String playbackUrlsEncrypt;
    private final String qualityHashCipher;

    public VideoOfflineDbModel(String str, String str2, int i, String str3, String str4, Object obj) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        this.mediaId = str;
        this.licenseByteEncrypt = str2;
        this.level = i;
        this.playbackUrlsEncrypt = str3;
        this.qualityHashCipher = str4;
        this.encryptedLicenseTimeInfo = obj;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final String getLicenseByteEncrypt() {
        return this.licenseByteEncrypt;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getPlaybackUrlsEncrypt() {
        return this.playbackUrlsEncrypt;
    }

    public final String getQualityHashCipher() {
        return this.qualityHashCipher;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoOfflineDbModel(String str, String str2, int i, String str3, String str4, Object obj, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) throws Throwable {
        Object objNewInstance;
        String str5 = (i2 & 2) != 0 ? null : str2;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        String str6 = (i2 & 8) != 0 ? null : str3;
        String str7 = (i2 & 16) != 0 ? null : str4;
        if ((i2 & 32) != 0) {
            try {
                Object[] objArr = {null, null, null, null, 15, null};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1954559256);
                objNewInstance = ((Constructor) (objRemoteActionCompatParcelizer == null ? startForeground.read((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11815, 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -181006723, false, null, new Class[]{String.class, String.class, String.class, String.class, Integer.TYPE, MagicModuleRepositoryImplExternalSyntheticLambda0.class}) : objRemoteActionCompatParcelizer)).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            objNewInstance = obj;
        }
        this(str, str5, i3, str6, str7, objNewInstance);
    }

    public final Object getEncryptedLicenseTimeInfo$66b8eacd() {
        return this.encryptedLicenseTimeInfo;
    }

    public final Object toDownloadInfo$63364025(String p0, ThemeState p1) throws Throwable {
        toMagicModuleMetaRepoModel.write(p1, "");
        try {
            Object[] objArr = {this.mediaId, Integer.valueOf(this.level), this.playbackUrlsEncrypt, p0, p1};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-459549703);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) Color.alpha(0), View.resolveSizeAndState(0, 0, 0) + 12775, 29 - (ViewConfiguration.getLongPressTimeout() >> 16), -1697507476, false, null, new Class[]{String.class, Integer.TYPE, String.class, String.class, ThemeState.class});
            }
            return ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final Object toLicenseLSModel$39deab1d() throws Throwable {
        try {
            Object[] objArr = {this.mediaId, this.licenseByteEncrypt, Integer.valueOf(this.level), this.qualityHashCipher, this.encryptedLicenseTimeInfo};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1147378931);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.getSize(0), (Process.myTid() >> 22) + 11872, 18 - TextUtils.getCapsMode("", 0, 0), -975853672, false, null, new Class[]{String.class, String.class, Integer.TYPE, String.class, (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 11816 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))});
            }
            return ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ VideoOfflineDbModel copy$default$36b802cb(VideoOfflineDbModel videoOfflineDbModel, String str, String str2, int i, String str3, String str4, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = videoOfflineDbModel.mediaId;
        }
        if ((i2 & 2) != 0) {
            str2 = videoOfflineDbModel.licenseByteEncrypt;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = videoOfflineDbModel.level;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = videoOfflineDbModel.playbackUrlsEncrypt;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = videoOfflineDbModel.qualityHashCipher;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            obj = videoOfflineDbModel.encryptedLicenseTimeInfo;
        }
        return videoOfflineDbModel.copy$57fc98ce(str, str5, i3, str6, str7, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMediaId() {
        return this.mediaId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLicenseByteEncrypt() {
        return this.licenseByteEncrypt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlaybackUrlsEncrypt() {
        return this.playbackUrlsEncrypt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQualityHashCipher() {
        return this.qualityHashCipher;
    }

    /* JADX INFO: renamed from: component6$66b8eacd, reason: from getter */
    public final Object getEncryptedLicenseTimeInfo() {
        return this.encryptedLicenseTimeInfo;
    }

    public final VideoOfflineDbModel copy$57fc98ce(String p0, String p1, int p2, String p3, String p4, Object p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new VideoOfflineDbModel(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoOfflineDbModel)) {
            return false;
        }
        VideoOfflineDbModel videoOfflineDbModel = (VideoOfflineDbModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.mediaId, (Object) videoOfflineDbModel.mediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.licenseByteEncrypt, (Object) videoOfflineDbModel.licenseByteEncrypt) && this.level == videoOfflineDbModel.level && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.playbackUrlsEncrypt, (Object) videoOfflineDbModel.playbackUrlsEncrypt) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.qualityHashCipher, (Object) videoOfflineDbModel.qualityHashCipher) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.encryptedLicenseTimeInfo, videoOfflineDbModel.encryptedLicenseTimeInfo);
    }

    public final int hashCode() {
        int iHashCode = this.mediaId.hashCode();
        String str = this.licenseByteEncrypt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Integer.hashCode(this.level);
        String str2 = this.playbackUrlsEncrypt;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.qualityHashCipher;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.encryptedLicenseTimeInfo.hashCode();
    }

    public final String toString() {
        String str = this.mediaId;
        String str2 = this.licenseByteEncrypt;
        int i = this.level;
        String str3 = this.playbackUrlsEncrypt;
        String str4 = this.qualityHashCipher;
        Object obj = this.encryptedLicenseTimeInfo;
        StringBuilder sb = new StringBuilder("VideoOfflineDbModel(mediaId=");
        sb.append(str);
        sb.append(", licenseByteEncrypt=");
        sb.append(str2);
        sb.append(", level=");
        sb.append(i);
        sb.append(", playbackUrlsEncrypt=");
        sb.append(str3);
        sb.append(", qualityHashCipher=");
        sb.append(str4);
        sb.append(", encryptedLicenseTimeInfo=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
