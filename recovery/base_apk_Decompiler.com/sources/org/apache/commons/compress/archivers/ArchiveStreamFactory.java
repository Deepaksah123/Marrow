package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public class ArchiveStreamFactory {
    public static final String AR = "ar";
    public static final String ARJ = "arj";
    public static final String CPIO = "cpio";
    public static final String DUMP = "dump";
    public static final String JAR = "jar";
    public static final String SEVEN_Z = "7z";
    public static final String TAR = "tar";
    public static final String ZIP = "zip";
    private final String encoding;
    private volatile String entryEncoding;

    public ArchiveStreamFactory() {
        this(null);
    }

    public ArchiveStreamFactory(String str) {
        this.entryEncoding = null;
        this.encoding = str;
        this.entryEncoding = str;
    }

    public String getEntryEncoding() {
        return this.entryEncoding;
    }

    @Deprecated
    public void setEntryEncoding(String str) {
        if (this.encoding != null) {
            throw new IllegalStateException("Cannot overide encoding set by the constructor");
        }
        this.entryEncoding = str;
    }

    public ArchiveInputStream createArchiveInputStream(String str, InputStream inputStream) throws ArchiveException {
        if (str == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream must not be null.");
        }
        if (AR.equalsIgnoreCase(str)) {
            return new ArArchiveInputStream(inputStream);
        }
        if (ARJ.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new ArjArchiveInputStream(inputStream, this.entryEncoding);
            }
            return new ArjArchiveInputStream(inputStream);
        }
        if (ZIP.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new ZipArchiveInputStream(inputStream, this.entryEncoding);
            }
            return new ZipArchiveInputStream(inputStream);
        }
        if (TAR.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new TarArchiveInputStream(inputStream, this.entryEncoding);
            }
            return new TarArchiveInputStream(inputStream);
        }
        if (JAR.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new JarArchiveInputStream(inputStream, this.entryEncoding);
            }
            return new JarArchiveInputStream(inputStream);
        }
        if (CPIO.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new CpioArchiveInputStream(inputStream, this.entryEncoding);
            }
            return new CpioArchiveInputStream(inputStream);
        }
        if (DUMP.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new DumpArchiveInputStream(inputStream, this.entryEncoding);
            }
            return new DumpArchiveInputStream(inputStream);
        }
        if (SEVEN_Z.equalsIgnoreCase(str)) {
            throw new StreamingNotSupportedException(SEVEN_Z);
        }
        StringBuilder sb = new StringBuilder("Archiver: ");
        sb.append(str);
        sb.append(" not found.");
        throw new ArchiveException(sb.toString());
    }

    public ArchiveOutputStream createArchiveOutputStream(String str, OutputStream outputStream) throws ArchiveException {
        if (str == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("OutputStream must not be null.");
        }
        if (AR.equalsIgnoreCase(str)) {
            return new ArArchiveOutputStream(outputStream);
        }
        if (ZIP.equalsIgnoreCase(str)) {
            ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(outputStream);
            if (this.entryEncoding != null) {
                zipArchiveOutputStream.setEncoding(this.entryEncoding);
            }
            return zipArchiveOutputStream;
        }
        if (TAR.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new TarArchiveOutputStream(outputStream, this.entryEncoding);
            }
            return new TarArchiveOutputStream(outputStream);
        }
        if (JAR.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new JarArchiveOutputStream(outputStream, this.entryEncoding);
            }
            return new JarArchiveOutputStream(outputStream);
        }
        if (CPIO.equalsIgnoreCase(str)) {
            if (this.entryEncoding != null) {
                return new CpioArchiveOutputStream(outputStream, this.entryEncoding);
            }
            return new CpioArchiveOutputStream(outputStream);
        }
        if (SEVEN_Z.equalsIgnoreCase(str)) {
            throw new StreamingNotSupportedException(SEVEN_Z);
        }
        StringBuilder sb = new StringBuilder("Archiver: ");
        sb.append(str);
        sb.append(" not found.");
        throw new ArchiveException(sb.toString());
    }

    public ArchiveInputStream createArchiveInputStream(InputStream inputStream) throws Throwable {
        TarArchiveInputStream tarArchiveInputStream;
        if (inputStream == null) {
            throw new IllegalArgumentException("Stream must not be null.");
        }
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Mark is not supported.");
        }
        byte[] bArr = new byte[12];
        inputStream.mark(12);
        try {
            int fully = IOUtils.readFully(inputStream, bArr);
            inputStream.reset();
            if (ZipArchiveInputStream.matches(bArr, fully)) {
                return createArchiveInputStream(ZIP, inputStream);
            }
            if (JarArchiveInputStream.matches(bArr, fully)) {
                return createArchiveInputStream(JAR, inputStream);
            }
            if (ArArchiveInputStream.matches(bArr, fully)) {
                return createArchiveInputStream(AR, inputStream);
            }
            if (CpioArchiveInputStream.matches(bArr, fully)) {
                return createArchiveInputStream(CPIO, inputStream);
            }
            if (ArjArchiveInputStream.matches(bArr, fully)) {
                return createArchiveInputStream(ARJ, inputStream);
            }
            if (SevenZFile.matches(bArr, fully)) {
                throw new StreamingNotSupportedException(SEVEN_Z);
            }
            byte[] bArr2 = new byte[32];
            inputStream.mark(32);
            int fully2 = IOUtils.readFully(inputStream, bArr2);
            inputStream.reset();
            if (DumpArchiveInputStream.matches(bArr2, fully2)) {
                return createArchiveInputStream(DUMP, inputStream);
            }
            byte[] bArr3 = new byte[512];
            inputStream.mark(512);
            int fully3 = IOUtils.readFully(inputStream, bArr3);
            inputStream.reset();
            if (TarArchiveInputStream.matches(bArr3, fully3)) {
                return createArchiveInputStream(TAR, inputStream);
            }
            if (fully3 >= 512) {
                TarArchiveInputStream tarArchiveInputStream2 = null;
                try {
                    tarArchiveInputStream = new TarArchiveInputStream(new ByteArrayInputStream(bArr3));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (tarArchiveInputStream.getNextTarEntry().isCheckSumOK()) {
                        ArchiveInputStream archiveInputStreamCreateArchiveInputStream = createArchiveInputStream(TAR, inputStream);
                        IOUtils.closeQuietly(tarArchiveInputStream);
                        return archiveInputStreamCreateArchiveInputStream;
                    }
                    IOUtils.closeQuietly(tarArchiveInputStream);
                } catch (Exception unused2) {
                    tarArchiveInputStream2 = tarArchiveInputStream;
                    IOUtils.closeQuietly(tarArchiveInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    tarArchiveInputStream2 = tarArchiveInputStream;
                    IOUtils.closeQuietly(tarArchiveInputStream2);
                    throw th;
                }
            }
            throw new ArchiveException("No Archiver found for the stream signature");
        } catch (IOException e) {
            throw new ArchiveException("Could not use reset and mark operations.", e);
        }
    }
}
