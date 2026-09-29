package kotlin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/OptionItemPlaybackSpeedOptionItem;", "", "Ljava/io/File;", "p0", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "write", "(Ljava/io/File;)Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "", "IconCompatParcelizer", "(Ljava/io/File;)V", "RemoteActionCompatParcelizer", "", "read", "(Ljava/io/File;)Z", "p1", "(Ljava/io/File;Ljava/io/File;)V", "AudioAttributesCompatParcelizer", "", "AudioAttributesImplApi26Parcelizer", "(Ljava/io/File;)J", "Lo/setLockedFromSeek;", "AudioAttributesImplBaseParcelizer", "(Ljava/io/File;)Lo/setLockedFromSeek;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OptionItemPlaybackSpeedOptionItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final OptionItemPlaybackSpeedOptionItem SYSTEM = new RemoteActionCompatParcelizer();

    setCompoundDrawablesWithIntrinsicBoundsCompatdefault AudioAttributesCompatParcelizer(File p0) throws FileNotFoundException;

    long AudioAttributesImplApi26Parcelizer(File p0);

    setLockedFromSeek AudioAttributesImplBaseParcelizer(File p0) throws FileNotFoundException;

    void IconCompatParcelizer(File p0) throws IOException;

    void RemoteActionCompatParcelizer(File p0) throws IOException;

    boolean read(File p0);

    setCompoundDrawablesWithIntrinsicBoundsCompatdefault write(File p0) throws FileNotFoundException;

    void write(File p0, File p1) throws IOException;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lo/OptionItemPlaybackSpeedOptionItem$Companion;", "", "<init>", "()V", "Lo/OptionItemPlaybackSpeedOptionItem;", "SYSTEM", "Lo/OptionItemPlaybackSpeedOptionItem;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    static final class RemoteActionCompatParcelizer implements OptionItemPlaybackSpeedOptionItem {
        @Override // kotlin.OptionItemPlaybackSpeedOptionItem
        public final setLockedFromSeek AudioAttributesImplBaseParcelizer(File file) throws FileNotFoundException {
            toMagicModuleMetaRepoModel.write(file, "");
            return CustomAppBarLayout.RemoteActionCompatParcelizer(file);
        }

        @Override // kotlin.OptionItemPlaybackSpeedOptionItem
        public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault AudioAttributesCompatParcelizer(File file) throws FileNotFoundException {
            toMagicModuleMetaRepoModel.write(file, "");
            try {
                return CustomAppBarLayout.AudioAttributesCompatParcelizer(file, false);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return CustomAppBarLayout.AudioAttributesCompatParcelizer(file, false);
            }
        }

        @Override // kotlin.OptionItemPlaybackSpeedOptionItem
        public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault write(File file) throws FileNotFoundException {
            toMagicModuleMetaRepoModel.write(file, "");
            try {
                return CustomAppBarLayout.write(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return CustomAppBarLayout.write(file);
            }
        }

        @Override // kotlin.OptionItemPlaybackSpeedOptionItem
        public final void IconCompatParcelizer(File file) throws IOException {
            toMagicModuleMetaRepoModel.write(file, "");
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        @Override // kotlin.OptionItemPlaybackSpeedOptionItem
        public final boolean read(File file) {
            toMagicModuleMetaRepoModel.write(file, "");
            return file.exists();
        }

        @Override // kotlin.OptionItemPlaybackSpeedOptionItem
        public final long AudioAttributesImplApi26Parcelizer(File file) {
            toMagicModuleMetaRepoModel.write(file, "");
            return file.length();
        }

        @Override // kotlin.OptionItemPlaybackSpeedOptionItem
        public final void write(File file, File file2) throws IOException {
            toMagicModuleMetaRepoModel.write(file, "");
            toMagicModuleMetaRepoModel.write(file2, "");
            IconCompatParcelizer(file2);
            if (file.renameTo(file2)) {
                return;
            }
            StringBuilder sb = new StringBuilder("failed to rename ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            throw new IOException(sb.toString());
        }

        @Override // kotlin.OptionItemPlaybackSpeedOptionItem
        public final void RemoteActionCompatParcelizer(File file) throws IOException {
            toMagicModuleMetaRepoModel.write(file, "");
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(file2, "");
                    RemoteActionCompatParcelizer(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                }
            }
        }

        public final String toString() {
            return "FileSystem.SYSTEM";
        }
    }
}
