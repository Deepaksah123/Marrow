package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.LatmReader;

/* JADX INFO: loaded from: classes.dex */
public final class parseAudioMuxElement implements LatmReader {
    private final Context AudioAttributesCompatParcelizer;
    private LatmReader.IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final hasSamples MediaBrowserCompatCustomActionResultReceiver;
    private final parsePayloadLengthInfo MediaBrowserCompatItemReceiver;
    private final Id3Reader RemoteActionCompatParcelizer;
    private final String write;
    private static final Pattern read = Pattern.compile("[^\\p{Alnum}]");
    private static final String IconCompatParcelizer = Pattern.quote("/");

    public parseAudioMuxElement(Context context, String str, hasSamples hassamples, Id3Reader id3Reader) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.AudioAttributesCompatParcelizer = context;
        this.write = str;
        this.MediaBrowserCompatCustomActionResultReceiver = hassamples;
        this.RemoteActionCompatParcelizer = id3Reader;
        this.MediaBrowserCompatItemReceiver = new parsePayloadLengthInfo();
    }

    private static String read(String str) {
        if (str == null) {
            return null;
        }
        return read.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    @Override // kotlin.LatmReader
    public final LatmReader.IconCompatParcelizer read() {
        synchronized (this) {
            if (!AudioAttributesImplApi26Parcelizer()) {
                return this.AudioAttributesImplBaseParcelizer;
            }
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Determining Crashlytics installation ID...");
            SharedPreferences sharedPreferencesAudioAttributesImplApi26Parcelizer = putSps.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
            String string = sharedPreferencesAudioAttributesImplApi26Parcelizer.getString("firebase.installation.id", null);
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Cached Firebase Installation ID: ");
            sb.append(string);
            dvbSubtitleReader.AudioAttributesCompatParcelizer(sb.toString());
            if (this.RemoteActionCompatParcelizer.write()) {
                String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                DvbSubtitleReader dvbSubtitleReader2 = DvbSubtitleReader.read();
                StringBuilder sb2 = new StringBuilder("Fetched Firebase Installation ID: ");
                sb2.append(strRemoteActionCompatParcelizer);
                dvbSubtitleReader2.AudioAttributesCompatParcelizer(sb2.toString());
                if (strRemoteActionCompatParcelizer == null) {
                    strRemoteActionCompatParcelizer = string == null ? MediaBrowserCompatCustomActionResultReceiver() : string;
                }
                if (strRemoteActionCompatParcelizer.equals(string)) {
                    this.AudioAttributesImplBaseParcelizer = LatmReader.IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer(sharedPreferencesAudioAttributesImplApi26Parcelizer), strRemoteActionCompatParcelizer);
                } else {
                    this.AudioAttributesImplBaseParcelizer = LatmReader.IconCompatParcelizer.IconCompatParcelizer(RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, sharedPreferencesAudioAttributesImplApi26Parcelizer), strRemoteActionCompatParcelizer);
                }
            } else if (AudioAttributesCompatParcelizer(string)) {
                this.AudioAttributesImplBaseParcelizer = LatmReader.IconCompatParcelizer.write(IconCompatParcelizer(sharedPreferencesAudioAttributesImplApi26Parcelizer));
            } else {
                this.AudioAttributesImplBaseParcelizer = LatmReader.IconCompatParcelizer.write(RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(), sharedPreferencesAudioAttributesImplApi26Parcelizer));
            }
            DvbSubtitleReader dvbSubtitleReader3 = DvbSubtitleReader.read();
            StringBuilder sb3 = new StringBuilder("Install IDs: ");
            sb3.append(this.AudioAttributesImplBaseParcelizer);
            dvbSubtitleReader3.AudioAttributesCompatParcelizer(sb3.toString());
            return this.AudioAttributesImplBaseParcelizer;
        }
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        LatmReader.IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer.AudioAttributesCompatParcelizer() == null && this.RemoteActionCompatParcelizer.write();
        }
        return true;
    }

    private static String MediaBrowserCompatCustomActionResultReceiver() {
        StringBuilder sb = new StringBuilder("SYN_");
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private static String IconCompatParcelizer(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String RemoteActionCompatParcelizer() {
        try {
            return (String) parsePayloadMux.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.write());
        } catch (Exception unused) {
            DvbSubtitleReader.read().RemoteActionCompatParcelizer();
            return null;
        }
    }

    private String RemoteActionCompatParcelizer(String str, SharedPreferences sharedPreferences) {
        String str2;
        synchronized (this) {
            str2 = read(UUID.randomUUID().toString());
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Created new Crashlytics installation ID: ");
            sb.append(str2);
            sb.append(" for FID: ");
            sb.append(str);
            dvbSubtitleReader.AudioAttributesCompatParcelizer(sb.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", str2).putString("firebase.installation.id", str).apply();
        }
        return str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public static String MediaBrowserCompatItemReceiver() {
        return RemoteActionCompatParcelizer(Build.VERSION.RELEASE);
    }

    public static String AudioAttributesImplApi21Parcelizer() {
        return RemoteActionCompatParcelizer(Build.VERSION.INCREMENTAL);
    }

    public static String IconCompatParcelizer() {
        return String.format(Locale.US, "%s/%s", RemoteActionCompatParcelizer(Build.MANUFACTURER), RemoteActionCompatParcelizer(Build.MODEL));
    }

    private static String RemoteActionCompatParcelizer(String str) {
        return str.replaceAll(IconCompatParcelizer, "");
    }

    public final String write() {
        return this.MediaBrowserCompatItemReceiver.write(this.AudioAttributesCompatParcelizer);
    }
}
