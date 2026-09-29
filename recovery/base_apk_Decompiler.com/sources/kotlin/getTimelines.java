package kotlin;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public interface getTimelines {
    public static final HashSet<String> AudioAttributesImplBaseParcelizer;
    public static final HashSet<String> MediaBrowserCompatCustomActionResultReceiver;
    public static final String[] write;
    public static final String[] IconCompatParcelizer = {"Notification Clicked", "Notification Viewed", "Geocluster Entered", "Geocluster Exited"};
    public static final HashSet<String> AudioAttributesCompatParcelizer = new HashSet<>(Arrays.asList("Identity", "Email"));
    public static final HashSet<String> RemoteActionCompatParcelizer = new HashSet<>(Arrays.asList("Identity", "Email", "Phone"));
    public static final HashSet<String> read = new HashSet<>(Arrays.asList("cgk", "encryptionmigration", "Email", "Phone", "Identity", "Name"));

    static {
        new HashSet(Arrays.asList("encryptionmigration"));
        AudioAttributesImplBaseParcelizer = new HashSet<>(Arrays.asList("Name", "Email", "Identity", "Phone"));
        MediaBrowserCompatCustomActionResultReceiver = new HashSet<>(Arrays.asList("cc", "tz", "Carrier"));
        write = new String[0];
    }
}
