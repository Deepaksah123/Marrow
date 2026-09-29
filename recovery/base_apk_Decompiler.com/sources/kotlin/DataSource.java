package kotlin;

import com.marrow.data.utils.product.exceptions.MarrowVideoDownloadException;
import com.marrow.utils.exceptions.MarrowFileException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/DataSource;", "", "<init>", "()V", "Ljava/io/File;", "p0", "Ljava/io/InputStream;", "p1", "", "RemoteActionCompatParcelizer", "(Ljava/io/File;Ljava/io/InputStream;Lo/SampleVideos;)Ljava/lang/Object;", "Lorg/apache/commons/compress/archivers/ArchiveEntry;", "IconCompatParcelizer", "(Ljava/io/File;Lorg/apache/commons/compress/archivers/ArchiveEntry;)V", "Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;", "p2", "AudioAttributesCompatParcelizer", "(Ljava/io/File;Lorg/apache/commons/compress/archivers/ArchiveEntry;Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DataSource {
    public static final DataSource INSTANCE = new DataSource();

    private DataSource() {
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputStream IconCompatParcelizer;
        private /* synthetic */ File RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new GzipCompressorInputStream(this.IconCompatParcelizer));
            File file = this.RemoteActionCompatParcelizer;
            try {
                TarArchiveInputStream tarArchiveInputStream2 = tarArchiveInputStream;
                for (ArchiveEntry nextEntry = tarArchiveInputStream2.getNextEntry(); nextEntry != null; nextEntry = tarArchiveInputStream2.getNextEntry()) {
                    getUserConfig.read(getWrite());
                    if (nextEntry.isDirectory()) {
                        DataSource dataSource = DataSource.INSTANCE;
                        DataSource.IconCompatParcelizer(file, nextEntry);
                    } else {
                        DataSource dataSource2 = DataSource.INSTANCE;
                        DataSource.AudioAttributesCompatParcelizer(file, nextEntry, tarArchiveInputStream2);
                    }
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(tarArchiveInputStream, null);
                return getShowPopup.INSTANCE;
            } finally {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(InputStream inputStream, File file, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = inputStream;
            this.RemoteActionCompatParcelizer = file;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static Object RemoteActionCompatParcelizer(File file, InputStream inputStream, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new RemoteActionCompatParcelizer(inputStream, file, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer(File p0, ArchiveEntry p1) throws MarrowFileException {
        File file = new File(p0, p1.getName());
        boolean zMkdir = file.mkdir();
        if (!file.exists() && !zMkdir) {
            buildResolutionString.IconCompatParcelizer("Unable to create directory :", file.getAbsolutePath());
            throw new MarrowFileException(MarrowVideoDownloadException.DIRECTORY_NOT_CREATED, "Unable to create directory ".concat(String.valueOf(file.getAbsolutePath())), null, 4, null);
        }
        buildResolutionString.IconCompatParcelizer("Able to create directory :", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(File p0, ArchiveEntry p1, TarArchiveInputStream p2) throws IOException {
        byte[] bArr = new byte[32768];
        File file = new File(p0, p1.getName());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        boolean zCreateNewFile = false;
        for (int i = 3; !zCreateNewFile && i > 0; i--) {
            try {
                zCreateNewFile = file.createNewFile();
                if (zCreateNewFile) {
                    buildResolutionString.IconCompatParcelizer("File creation success : ", file.getAbsolutePath());
                    break;
                }
                file.delete();
            } catch (Exception e) {
                buildResolutionString.IconCompatParcelizer("Create new file exception : ", e.getMessage());
            }
        }
        if (!zCreateNewFile) {
            buildResolutionString.IconCompatParcelizer("Unable to create file : ", file.getAbsolutePath());
            throw new MarrowFileException(MarrowVideoDownloadException.FILE_NOT_CREATED, "Unable to create file ".concat(String.valueOf(file.getAbsolutePath())), null, 4, null);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 32768);
                try {
                    BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
                    int i2 = p2.read(bArr, 0, 32768);
                    while (i2 != -1) {
                        bufferedOutputStream2.write(bArr, 0, i2);
                        i2 = p2.read(bArr, 0, 32768);
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    MagicModuleMetaLSModel.IconCompatParcelizer(bufferedOutputStream, null);
                } finally {
                }
            } finally {
                fileOutputStream.close();
            }
        } catch (FileNotFoundException e2) {
            throw new IOException("File:".concat(String.valueOf(file.getAbsolutePath())), e2);
        }
    }
}
