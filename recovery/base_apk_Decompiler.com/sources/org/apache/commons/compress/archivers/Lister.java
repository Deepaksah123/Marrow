package org.apache.commons.compress.archivers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes5.dex */
public final class Lister {
    private static final ArchiveStreamFactory factory = new ArchiveStreamFactory();

    public static void main(String[] strArr) throws Exception {
        ArchiveInputStream archiveInputStreamCreateArchiveInputStream;
        if (strArr.length == 0) {
            usage();
            return;
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("Analysing ");
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
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        if (strArr.length > 1) {
            archiveInputStreamCreateArchiveInputStream = factory.createArchiveInputStream(strArr[1], bufferedInputStream);
        } else {
            archiveInputStreamCreateArchiveInputStream = factory.createArchiveInputStream(bufferedInputStream);
        }
        PrintStream printStream3 = System.out;
        StringBuilder sb3 = new StringBuilder("Created ");
        sb3.append(archiveInputStreamCreateArchiveInputStream.toString());
        printStream3.println(sb3.toString());
        while (true) {
            ArchiveEntry nextEntry = archiveInputStreamCreateArchiveInputStream.getNextEntry();
            if (nextEntry != null) {
                System.out.println(nextEntry.getName());
            } else {
                archiveInputStreamCreateArchiveInputStream.close();
                bufferedInputStream.close();
                return;
            }
        }
    }

    private static void usage() {
        System.out.println("Parameters: archive-name [archive-type]");
    }
}
