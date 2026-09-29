package kotlin;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.concurrent.Callable;
import kotlin.ValueClassSerializerStaticJsonValue;
import kotlin.setEntryLabelTextSize;

/* JADX INFO: loaded from: classes2.dex */
public final class setDrawMarkers implements setEntryLabelTextSize, ULongKeyDeserializer {
    private final File AudioAttributesCompatParcelizer;
    private final setEntryLabelTextSize AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private UShortDeserializer IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final Callable<InputStream> read;
    private final Context write;

    @Override // kotlin.ULongKeyDeserializer
    public final setEntryLabelTextSize RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.setEntryLabelTextSize
    /* JADX INFO: renamed from: read */
    public final String getRead() {
        return RemoteActionCompatParcelizer().getRead();
    }

    @Override // kotlin.setEntryLabelTextSize
    public final void read(boolean z) {
        RemoteActionCompatParcelizer().read(z);
    }

    @Override // kotlin.setEntryLabelTextSize
    public final setDrawSliceText write() {
        if (!this.AudioAttributesImplBaseParcelizer) {
            IconCompatParcelizer(true);
            this.AudioAttributesImplBaseParcelizer = true;
        }
        return RemoteActionCompatParcelizer().write();
    }

    @Override // kotlin.setEntryLabelTextSize
    public final setDrawSliceText AudioAttributesCompatParcelizer() {
        if (!this.AudioAttributesImplBaseParcelizer) {
            IconCompatParcelizer(false);
            this.AudioAttributesImplBaseParcelizer = true;
        }
        return RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setEntryLabelTextSize, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            RemoteActionCompatParcelizer().close();
            this.AudioAttributesImplBaseParcelizer = false;
        }
    }

    public final void RemoteActionCompatParcelizer(UShortDeserializer uShortDeserializer) {
        toMagicModuleMetaRepoModel.write(uShortDeserializer, "");
        this.IconCompatParcelizer = uShortDeserializer;
    }

    private final void IconCompatParcelizer(boolean z) {
        String read = getRead();
        if (read == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        File databasePath = this.write.getDatabasePath(read);
        UShortDeserializer uShortDeserializer = this.IconCompatParcelizer;
        UShortDeserializer uShortDeserializer2 = null;
        if (uShortDeserializer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            uShortDeserializer = null;
        }
        setWebColor setwebcolor = new setWebColor(read, this.write.getFilesDir(), uShortDeserializer.MediaMetadataCompat);
        try {
            setwebcolor.RemoteActionCompatParcelizer(setwebcolor.IconCompatParcelizer);
            if (!databasePath.exists()) {
                try {
                    toMagicModuleMetaRepoModel.write(databasePath);
                    IconCompatParcelizer(databasePath, z);
                    setwebcolor.write();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                toMagicModuleMetaRepoModel.write(databasePath);
                int iAudioAttributesCompatParcelizer = setExtraBottomOffset.AudioAttributesCompatParcelizer(databasePath);
                if (iAudioAttributesCompatParcelizer == this.AudioAttributesImplApi26Parcelizer) {
                    setwebcolor.write();
                    return;
                }
                UShortDeserializer uShortDeserializer3 = this.IconCompatParcelizer;
                if (uShortDeserializer3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    uShortDeserializer2 = uShortDeserializer3;
                }
                if (uShortDeserializer2.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer)) {
                    setwebcolor.write();
                    return;
                }
                if (this.write.deleteDatabase(read)) {
                    try {
                        IconCompatParcelizer(databasePath, z);
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    } catch (IOException e2) {
                        IOException iOException = e2;
                    }
                }
                setwebcolor.write();
                return;
            } catch (IOException e3) {
                IOException iOException2 = e3;
                setwebcolor.write();
                return;
            }
        } catch (Throwable th) {
            setwebcolor.write();
            throw th;
        }
        setwebcolor.write();
        throw th;
    }

    private final void IconCompatParcelizer(File file, boolean z) throws IOException {
        FileChannel fileChannelNewChannel;
        if (this.RemoteActionCompatParcelizer != null) {
            fileChannelNewChannel = Channels.newChannel(this.write.getAssets().open(this.RemoteActionCompatParcelizer));
        } else if (this.AudioAttributesCompatParcelizer != null) {
            fileChannelNewChannel = new FileInputStream(this.AudioAttributesCompatParcelizer).getChannel();
        } else {
            Callable<InputStream> callable = this.read;
            if (callable != null) {
                try {
                    fileChannelNewChannel = Channels.newChannel(callable.call());
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.write.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        toMagicModuleMetaRepoModel.write(channel);
        setExtraOffsets.AudioAttributesCompatParcelizer(fileChannelNewChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            StringBuilder sb = new StringBuilder("Failed to create directories for ");
            sb.append(file.getAbsolutePath());
            throw new IOException(sb.toString());
        }
        toMagicModuleMetaRepoModel.write(fileCreateTempFile);
        RemoteActionCompatParcelizer(fileCreateTempFile, z);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Failed to move intermediate file (");
        sb2.append(fileCreateTempFile.getAbsolutePath());
        sb2.append(") to destination (");
        sb2.append(file.getAbsolutePath());
        sb2.append(").");
        throw new IOException(sb2.toString());
    }

    private final void RemoteActionCompatParcelizer(File file, boolean z) {
        UShortDeserializer uShortDeserializer = this.IconCompatParcelizer;
        if (uShortDeserializer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            uShortDeserializer = null;
        }
        if (uShortDeserializer.RatingCompat == null) {
            return;
        }
        setEntryLabelTextSize setentrylabeltextsize = read(file);
        try {
            setEntryLabelTextSize setentrylabeltextsize2 = setentrylabeltextsize;
            setDrawSliceText setdrawslicetextWrite = z ? setentrylabeltextsize2.write() : setentrylabeltextsize2.AudioAttributesCompatParcelizer();
            UShortDeserializer uShortDeserializer2 = this.IconCompatParcelizer;
            if (uShortDeserializer2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                uShortDeserializer2 = null;
            }
            toMagicModuleMetaRepoModel.write(uShortDeserializer2.RatingCompat);
            ValueClassSerializerStaticJsonValue.AudioAttributesImplApi21Parcelizer.write(setdrawslicetextWrite);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(setentrylabeltextsize, null);
        } finally {
        }
    }

    private final setEntryLabelTextSize read(File file) {
        try {
            int iAudioAttributesCompatParcelizer = setExtraBottomOffset.AudioAttributesCompatParcelizer(file);
            setRotationAngle setrotationangle = new setRotationAngle();
            setEntryLabelTextSize.write.Companion companion = setEntryLabelTextSize.write.INSTANCE;
            return setrotationangle.AudioAttributesCompatParcelizer(setEntryLabelTextSize.write.Companion.RemoteActionCompatParcelizer(this.write).write(file.getAbsolutePath()).RemoteActionCompatParcelizer(new write(iAudioAttributesCompatParcelizer, getQues.write(iAudioAttributesCompatParcelizer, 1))).IconCompatParcelizer());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    public static final class write extends setEntryLabelTextSize.RemoteActionCompatParcelizer {
        final /* synthetic */ int RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(int i, int i2) {
            super(i2);
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // o.setEntryLabelTextSize.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            int i = this.RemoteActionCompatParcelizer;
            if (i <= 0) {
                setdrawslicetext.RemoteActionCompatParcelizer(i);
            }
        }

        @Override // o.setEntryLabelTextSize.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        }

        @Override // o.setEntryLabelTextSize.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(setDrawSliceText setdrawslicetext, int i, int i2) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        }
    }
}
