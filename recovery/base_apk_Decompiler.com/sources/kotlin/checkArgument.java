package kotlin;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import java.util.Locale;
import kotlin.maximumCapacity;

/* JADX INFO: loaded from: classes2.dex */
public final class checkArgument implements PrivateMaxEntriesMapUpdateTask {
    private final Resources write;

    public checkArgument(Resources resources) {
        this.write = (Resources) buildTypeSerializer.IconCompatParcelizer(resources);
    }

    @Override // kotlin.PrivateMaxEntriesMapUpdateTask
    public final String write(C0170format c0170format) {
        String strAudioAttributesCompatParcelizer;
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(c0170format);
        if (iAudioAttributesImplBaseParcelizer == 2) {
            strAudioAttributesCompatParcelizer = write(AudioAttributesImplApi26Parcelizer(c0170format), MediaBrowserCompatCustomActionResultReceiver(c0170format), read(c0170format));
        } else if (iAudioAttributesImplBaseParcelizer == 1) {
            strAudioAttributesCompatParcelizer = write(AudioAttributesCompatParcelizer(c0170format), IconCompatParcelizer(c0170format), read(c0170format));
        } else {
            strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(c0170format);
        }
        if (strAudioAttributesCompatParcelizer.length() != 0) {
            return strAudioAttributesCompatParcelizer;
        }
        String str = c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (str == null || str.trim().isEmpty()) {
            return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_unknown);
        }
        return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_unknown_name, str);
    }

    private String MediaBrowserCompatCustomActionResultReceiver(C0170format c0170format) {
        int i = c0170format.onSetCaptioningEnabled;
        int i2 = c0170format.MediaMetadataCompat;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String read(C0170format c0170format) {
        int i = c0170format.read;
        if (i == -1) {
            return "";
        }
        return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    private String IconCompatParcelizer(C0170format c0170format) {
        int i = c0170format.AudioAttributesCompatParcelizer;
        if (i == -1 || i <= 0) {
            return "";
        }
        if (i == 1) {
            return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_mono);
        }
        if (i == 2) {
            return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_surround_5_point_1);
        }
        if (i == 8) {
            return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_surround_7_point_1);
        }
        return this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_surround);
    }

    private String AudioAttributesCompatParcelizer(C0170format c0170format) {
        String strWrite = write(AudioAttributesImplApi21Parcelizer(c0170format), AudioAttributesImplApi26Parcelizer(c0170format));
        return TextUtils.isEmpty(strWrite) ? RemoteActionCompatParcelizer(c0170format) : strWrite;
    }

    private static String RemoteActionCompatParcelizer(C0170format c0170format) {
        return TextUtils.isEmpty(c0170format.onCustomAction) ? "" : c0170format.onCustomAction;
    }

    private static String AudioAttributesImplApi21Parcelizer(C0170format c0170format) {
        String str = c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer();
        String displayName = localeForLanguageTag.getDisplayName(localeIconCompatParcelizer);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            StringBuilder sb = new StringBuilder();
            sb.append(displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeIconCompatParcelizer));
            sb.append(displayName.substring(iOffsetByCodePoints));
            return sb.toString();
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String AudioAttributesImplApi26Parcelizer(C0170format c0170format) {
        String strWrite;
        if ((c0170format.onPrepare & 2) == 0) {
            strWrite = "";
        } else {
            strWrite = this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_role_alternate);
        }
        if ((c0170format.onPrepare & 4) != 0) {
            strWrite = write(strWrite, this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_role_supplementary));
        }
        if ((c0170format.onPrepare & 8) != 0) {
            strWrite = write(strWrite, this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_role_commentary));
        }
        return (c0170format.onPrepare & 1088) != 0 ? write(strWrite, this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_role_closed_captions)) : strWrite;
    }

    private String write(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.write.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_item_list, string, str);
            }
        }
        return string;
    }

    private static int AudioAttributesImplBaseParcelizer(C0170format c0170format) {
        int iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170format.onPlayFromUri);
        if (iIconCompatParcelizer != -1) {
            return iIconCompatParcelizer;
        }
        if (DefaultBaseTypeLimitingValidator.read(c0170format.RemoteActionCompatParcelizer) != null) {
            return 2;
        }
        if (DefaultBaseTypeLimitingValidator.RemoteActionCompatParcelizer(c0170format.RemoteActionCompatParcelizer) != null) {
            return 1;
        }
        if (c0170format.onSetCaptioningEnabled == -1 && c0170format.MediaMetadataCompat == -1) {
            return (c0170format.AudioAttributesCompatParcelizer == -1 && c0170format.onPrepareFromUri == -1) ? -1 : 1;
        }
        return 2;
    }
}
