package org.apache.commons.compress.archivers.sevenz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes5.dex */
public class CLI {
    private static final byte[] BUF = new byte[8192];

    enum Mode {
        LIST("Analysing") { // from class: org.apache.commons.compress.archivers.sevenz.CLI.Mode.1
            @Override // org.apache.commons.compress.archivers.sevenz.CLI.Mode
            public final void takeAction(SevenZFile sevenZFile, SevenZArchiveEntry sevenZArchiveEntry) {
                System.out.print(sevenZArchiveEntry.getName());
                if (sevenZArchiveEntry.isDirectory()) {
                    System.out.print(" dir");
                } else {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder(" ");
                    sb.append(sevenZArchiveEntry.getCompressedSize());
                    sb.append("/");
                    sb.append(sevenZArchiveEntry.getSize());
                    printStream.print(sb.toString());
                }
                if (sevenZArchiveEntry.getHasLastModifiedDate()) {
                    PrintStream printStream2 = System.out;
                    StringBuilder sb2 = new StringBuilder(" ");
                    sb2.append(sevenZArchiveEntry.getLastModifiedDate());
                    printStream2.print(sb2.toString());
                } else {
                    System.out.print(" no last modified date");
                }
                if (!sevenZArchiveEntry.isDirectory()) {
                    PrintStream printStream3 = System.out;
                    StringBuilder sb3 = new StringBuilder(" ");
                    sb3.append(getContentMethods(sevenZArchiveEntry));
                    printStream3.println(sb3.toString());
                    return;
                }
                System.out.println("");
            }

            private String getContentMethods(SevenZArchiveEntry sevenZArchiveEntry) {
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (SevenZMethodConfiguration sevenZMethodConfiguration : sevenZArchiveEntry.getContentMethods()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(sevenZMethodConfiguration.getMethod());
                    if (sevenZMethodConfiguration.getOptions() != null) {
                        sb.append("(");
                        sb.append(sevenZMethodConfiguration.getOptions());
                        sb.append(")");
                    }
                    z = false;
                }
                return sb.toString();
            }
        },
        EXTRACT("Extracting") { // from class: org.apache.commons.compress.archivers.sevenz.CLI.Mode.2
            @Override // org.apache.commons.compress.archivers.sevenz.CLI.Mode
            public final void takeAction(SevenZFile sevenZFile, SevenZArchiveEntry sevenZArchiveEntry) throws IOException {
                File file = new File(sevenZArchiveEntry.getName());
                if (sevenZArchiveEntry.isDirectory()) {
                    if (!file.isDirectory() && !file.mkdirs()) {
                        throw new IOException("Cannot create directory ".concat(String.valueOf(file)));
                    }
                    System.out.println("created directory ".concat(String.valueOf(file)));
                    return;
                }
                System.out.println("extracting to ".concat(String.valueOf(file)));
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    throw new IOException("Cannot create ".concat(String.valueOf(parentFile)));
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    long size = sevenZArchiveEntry.getSize();
                    long j = 0;
                    while (j < size) {
                        int i = sevenZFile.read(CLI.BUF, 0, (int) Math.min(size - j, CLI.BUF.length));
                        if (i > 0) {
                            j += (long) i;
                            fileOutputStream.write(CLI.BUF, 0, i);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("reached end of entry ");
                            sb.append(sevenZArchiveEntry.getName());
                            sb.append(" after ");
                            sb.append(j);
                            sb.append(" bytes, expected ");
                            sb.append(size);
                            throw new IOException(sb.toString());
                        }
                    }
                } finally {
                    fileOutputStream.close();
                }
            }
        };

        private final String message;

        public abstract void takeAction(SevenZFile sevenZFile, SevenZArchiveEntry sevenZArchiveEntry) throws IOException;

        Mode(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length == 0) {
            usage();
            return;
        }
        Mode modeGrabMode = grabMode(strArr);
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(modeGrabMode.getMessage());
        sb.append(" ");
        sb.append(strArr[0]);
        printStream.println(sb.toString());
        File file = new File(strArr[0]);
        if (!file.isFile()) {
            PrintStream printStream2 = System.err;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file);
            sb2.append(" doesn't exist or is a directory");
            printStream2.println(sb2.toString());
        }
        SevenZFile sevenZFile = new SevenZFile(file);
        while (true) {
            try {
                SevenZArchiveEntry nextEntry = sevenZFile.getNextEntry();
                if (nextEntry == null) {
                    return;
                } else {
                    modeGrabMode.takeAction(sevenZFile, nextEntry);
                }
            } finally {
                sevenZFile.close();
            }
        }
    }

    private static void usage() {
        System.out.println("Parameters: archive-name [list|extract]");
    }

    private static Mode grabMode(String[] strArr) {
        if (strArr.length < 2) {
            return Mode.LIST;
        }
        return (Mode) Enum.valueOf(Mode.class, strArr[1].toUpperCase());
    }
}
