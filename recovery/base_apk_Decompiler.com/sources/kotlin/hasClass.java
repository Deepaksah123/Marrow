package kotlin;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class hasClass {
    private static final Pattern write = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int read = -1;
    public int IconCompatParcelizer = -1;

    public final boolean IconCompatParcelizer(androidx.media3.common.Metadata metadata) {
        for (int i = 0; i < metadata.write(); i++) {
            Metadata.Entry entryIconCompatParcelizer = metadata.IconCompatParcelizer(i);
            if (entryIconCompatParcelizer instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryIconCompatParcelizer;
                if ("iTunSMPB".equals(commentFrame.RemoteActionCompatParcelizer) && write(commentFrame.read)) {
                    return true;
                }
            } else if (entryIconCompatParcelizer instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryIconCompatParcelizer;
                if ("com.apple.iTunes".equals(internalFrame.read) && "iTunSMPB".equals(internalFrame.write) && write(internalFrame.AudioAttributesCompatParcelizer)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean write(String str) {
        Matcher matcher = write.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.read = i;
            this.IconCompatParcelizer = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean read() {
        return (this.read == -1 || this.IconCompatParcelizer == -1) ? false : true;
    }
}
