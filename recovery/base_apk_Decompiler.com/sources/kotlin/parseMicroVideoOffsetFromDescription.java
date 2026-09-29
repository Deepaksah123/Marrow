package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class parseMicroVideoOffsetFromDescription {
    public static int AudioAttributesCompatParcelizer;
    public static int write;
    private DefaultEbmlReader RemoteActionCompatParcelizer;

    private parseMicroVideoOffsetFromDescription() {
    }

    public final parseMotionPhotoFlagFromDescription IconCompatParcelizer() {
        DefaultEbmlReader defaultEbmlReader = this.RemoteActionCompatParcelizer;
        if (defaultEbmlReader != null) {
            return new EbmlProcessorElementType(defaultEbmlReader);
        }
        throw new IllegalStateException(String.valueOf(DefaultEbmlReader.class.getCanonicalName()).concat(" must be set"));
    }

    /* synthetic */ parseMicroVideoOffsetFromDescription(byte b) {
    }

    public final parseMicroVideoOffsetFromDescription write(DefaultEbmlReader defaultEbmlReader) {
        this.RemoteActionCompatParcelizer = defaultEbmlReader;
        return this;
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 5695368;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        write = i3;
        return i3;
    }
}
