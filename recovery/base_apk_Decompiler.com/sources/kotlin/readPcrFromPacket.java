package kotlin;

import android.content.res.AssetFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class readPcrFromPacket {
    private final File IconCompatParcelizer;

    public readPcrFromPacket(isStartOfTsPacket isstartoftspacket) {
        this.IconCompatParcelizer = isstartoftspacket.read("com.crashlytics.settings.json");
    }

    private File read() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject AudioAttributesCompatParcelizer() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        DvbSubtitleReader.read().IconCompatParcelizer("Checking for cached settings...");
        AssetFileDescriptor.AutoCloseInputStream autoCloseInputStream = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = read();
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(putSps.read(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception unused) {
                        DvbSubtitleReader.read().write();
                        putSps.AudioAttributesCompatParcelizer(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Settings file does not exist.");
                    jSONObject = null;
                }
                putSps.AudioAttributesCompatParcelizer(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                autoCloseInputStream = "Checking for cached settings...";
                putSps.AudioAttributesCompatParcelizer(autoCloseInputStream, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            putSps.AudioAttributesCompatParcelizer(autoCloseInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final void write(long j, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(read());
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                putSps.AudioAttributesCompatParcelizer(fileWriter, "Failed to close settings writer.");
            } catch (Exception unused2) {
                fileWriter2 = fileWriter;
                DvbSubtitleReader.read().write();
                putSps.AudioAttributesCompatParcelizer(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                putSps.AudioAttributesCompatParcelizer(fileWriter, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
