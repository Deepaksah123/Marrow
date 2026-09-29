package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\n\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0013J\u001f\u0010\f\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0013J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\u0019J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0007\u0010\u0019J#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0016J\r\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\u001dJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u001e"}, d2 = {"Lo/parseEac3SupplementalProperties;", "", "<init>", "()V", "", "p0", "", "write", "(J)Ljava/lang/String;", "read", "RemoteActionCompatParcelizer", "", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "(J)I", "AudioAttributesImplApi26Parcelizer", "p1", "", "(JJ)Z", "(JLjava/lang/String;)Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "(J)Z", "(JJ)J", "IconCompatParcelizer", "(I)J", "Lo/getSubscriptionExpiresOn;", "(J)Lo/getSubscriptionExpiresOn;", "AudioAttributesImplBaseParcelizer", "()I", "(JJ)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parseEac3SupplementalProperties {
    public static final parseEac3SupplementalProperties INSTANCE = new parseEac3SupplementalProperties();

    @getMagicModuleMeta
    public static final long read(int p0) {
        return p0 * 3600000;
    }

    @getMagicModuleMeta
    public static final long write(int p0) {
        return ((long) p0) * 86400000;
    }

    private parseEac3SupplementalProperties() {
    }

    @getMagicModuleMeta
    public static final String write(long p0) {
        int i = ((int) (p0 / 1000)) % 60;
        int i2 = (int) ((p0 / 60000) % 60);
        int i3 = (int) ((p0 / 3600000) % 24);
        String str = i3 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str2 = i2 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str3 = i < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i3);
        sb.append(":");
        sb.append(str2);
        sb.append(i2);
        sb.append(":");
        sb.append(str3);
        sb.append(i);
        return sb.toString();
    }

    @getMagicModuleMeta
    public static final String read(long p0) {
        int i = ((int) (p0 / 1000)) % 60;
        int i2 = (int) ((p0 / 60000) % 60);
        int iAudioAttributesImplApi21Parcelizer = (AudioAttributesImplApi21Parcelizer(p0) * 24) + ((int) ((p0 / 3600000) % 24));
        String str = iAudioAttributesImplApi21Parcelizer < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str2 = i2 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str3 = i < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(iAudioAttributesImplApi21Parcelizer);
        sb.append(":");
        sb.append(str2);
        sb.append(i2);
        sb.append(":");
        sb.append(str3);
        sb.append(i);
        return sb.toString();
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(long p0) {
        int i = (int) (p0 / 1000);
        int i2 = i % 60;
        int i3 = i / 60;
        String str = i3 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str2 = i2 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i3);
        sb.append(":");
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    @getMagicModuleMeta
    public static final String AudioAttributesCompatParcelizer(int p0) {
        int i = p0 % 60;
        int i2 = (p0 / 60) % 60;
        int i3 = (p0 / 3600) % 24;
        String str = i3 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str2 = i2 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str3 = i < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i3);
        sb.append(":");
        sb.append(str2);
        sb.append(i2);
        sb.append(":");
        sb.append(str3);
        sb.append(i);
        return sb.toString();
    }

    @getMagicModuleMeta
    private static int AudioAttributesImplApi21Parcelizer(long p0) {
        return (int) (p0 / 86400000);
    }

    public static String RemoteActionCompatParcelizer(int p0) {
        if (p0 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(" day");
            return sb.toString();
        }
        if (p0 <= 30) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p0);
            sb2.append(" days");
            return sb2.toString();
        }
        if (31 <= p0 && p0 < 61) {
            return "1 month";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(p0 / 30);
        sb3.append(" months");
        return sb3.toString();
    }

    @getMagicModuleMeta
    public static final String AudioAttributesImplApi26Parcelizer(long p0) {
        String string;
        String string2;
        if (p0 <= 0) {
            return "Your time's up!";
        }
        if (p0 < 20000) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("You've %s left", Arrays.copyOf(new Object[]{"few seconds"}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        }
        if (p0 < 60000) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
            String str2 = String.format("You've %s left", Arrays.copyOf(new Object[]{"less than a minute"}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            return str2;
        }
        if (p0 < 3600000) {
            int i = (int) (p0 / 60000);
            if (i == 1) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" minute");
                String str3 = String.format("You've %s left", Arrays.copyOf(new Object[]{sb.toString()}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                return str3;
            }
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(" minutes");
            String str4 = String.format("You've %s left", Arrays.copyOf(new Object[]{sb2.toString()}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
            return str4;
        }
        int i2 = (int) (p0 / 3600000);
        int i3 = (int) ((p0 % 3600000) / 60000);
        if (i2 == 1) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
            if (i3 != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i3);
                sb3.append(" minutes");
                string2 = sb3.toString();
            } else {
                string2 = "";
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i2);
            sb4.append(" hour ");
            sb4.append(string2);
            String str5 = String.format("You've %s left", Arrays.copyOf(new Object[]{sb4.toString()}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
            return str5;
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
        if (i3 != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(i3);
            sb5.append(" minutes");
            string = sb5.toString();
        } else {
            string = "";
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i2);
        sb6.append(" hours ");
        sb6.append(string);
        String str6 = String.format("You've %s left", Arrays.copyOf(new Object[]{sb6.toString()}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        return str6;
    }

    @getMagicModuleMeta
    public static final boolean RemoteActionCompatParcelizer(long p0, long p1) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(p0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(p1);
        return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer(long p0, long p1) {
        return Math.abs(p0 - p1) / 3600000 >= 12;
    }

    @getMagicModuleMeta
    public static final String write(long p0, String p1) {
        String str = new SimpleDateFormat(p1, Locale.getDefault()).format(new Date(p0));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    @getMagicModuleMeta
    public static final boolean MediaBrowserCompatItemReceiver(long p0) {
        return System.currentTimeMillis() - p0 > 604800000;
    }

    @getMagicModuleMeta
    public static final long read(long p0, long p1) {
        return Math.abs(p0 - p1) / 86400000;
    }

    @getMagicModuleMeta
    public static final int IconCompatParcelizer(long p0) {
        return (int) ((p0 - System.currentTimeMillis()) / 86400000);
    }

    @getMagicModuleMeta
    public static final Pair<String, String> AudioAttributesCompatParcelizer(long p0) {
        return new Pair<>(write(p0, "h:mm a"), write(p0, "dd MMM yyyy"));
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesImplBaseParcelizer(long j) {
        return Math.abs(System.currentTimeMillis() - j) > 5000;
    }

    public static int RemoteActionCompatParcelizer() {
        return Calendar.getInstance().get(1);
    }

    public static String write(long p0, long p1) {
        String string;
        long j = p1 - p0;
        int i = (int) (j / 3600000);
        int i2 = (int) ((j % 3600000) / 60000);
        if (i == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder(" ");
            sb.append(i);
            sb.append("hrs");
            string = sb.toString();
        }
        if (i2 == 0) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" ");
        sb2.append(i2);
        sb2.append("min");
        return sb2.toString();
    }
}
